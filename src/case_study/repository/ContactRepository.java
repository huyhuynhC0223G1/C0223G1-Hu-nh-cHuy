package case_study.repository;

import case_study.model.Contract;
import case_study.ultils.ReadAndWriteFileBooking;
import case_study.ultils.ReadAndWriteFileContract;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ContactRepository implements IContactRepository {
    private List<Contract> contractList = new ArrayList<>();
    private String CONTRACT_FILE_PATH = "src/case_study/data/contract.csv";

    @Override
    public List<Contract> showCotract() {
        contractList = ReadAndWriteFileContract.readContractListFromFile(CONTRACT_FILE_PATH);
        return contractList;
    }

    @Override
    public void addNewContract(Contract contract) {
        contractList = ReadAndWriteFileContract.readContractListFromFile(CONTRACT_FILE_PATH);
        contractList.add(contract);
        ReadAndWriteFileContract.writeContactListToFile(contractList, CONTRACT_FILE_PATH);
    }

    @Override
    public void editContract(int code, Contract contract) {
        contractList = ReadAndWriteFileContract.readContractListFromFile(CONTRACT_FILE_PATH);
        contractList.set(code, contract);
        ReadAndWriteFileContract.writeContactListToFile(contractList, CONTRACT_FILE_PATH);
    }

    @Override
    public int checkContract(int code) {
        for (int i = 0; i < contractList.size(); i++) {
            if (contractList.get(i).getContractNumber() == code) {
                return i;
            }
        }
        return -1;
    }
}
