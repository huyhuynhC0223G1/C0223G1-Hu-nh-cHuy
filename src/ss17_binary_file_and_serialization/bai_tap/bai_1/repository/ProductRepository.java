package ss17_binary_file_and_serialization.bai_tap.bai_1.repository;

import ss17_binary_file_and_serialization.bai_tap.bai_1.common.Serialization;
import ss17_binary_file_and_serialization.bai_tap.bai_1.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    List<Product> products = new ArrayList<>();
    private Serialization serialization = new Serialization();

    @Override
    public List<Product> getProductList() {
        products = serialization.readDataFromFile("src/ss17_binary_file_and_serialization/bai_tap/Data/product.txt");
        return products;
    }

    @Override
    public void addNewProduct(List<Product> product) {
        serialization.writeDataToFile("src/ss17_binary_file_and_serialization/bai_tap/Data/product.txt", product);
    }

    @Override
    public boolean searchProduct() {
        return false;
    }
}
