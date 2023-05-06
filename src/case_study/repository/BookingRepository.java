package case_study.repository;

import case_study.model.Booking;
import case_study.ultils.ReadAndWriteFileBooking;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    private TreeSet<Booking> bookingList = new TreeSet<>(Comparator.comparing(Booking::getRentalStartDate).
            thenComparing(Booking::getLeaseEndDate));
    private String BOOKING_FILE_PATH = "src/case_study/data/booking.csv";

    @Override
    public TreeSet<Booking> showbooking() {
        bookingList = ReadAndWriteFileBooking.readBookingListFromFile(BOOKING_FILE_PATH);
        return bookingList;
    }

    @Override
    public void addNewBooking(Booking booking) {
        bookingList = ReadAndWriteFileBooking.readBookingListFromFile(BOOKING_FILE_PATH);
        bookingList.add(booking);
        ReadAndWriteFileBooking.writeBookingListToFile(bookingList, BOOKING_FILE_PATH);
    }
}


