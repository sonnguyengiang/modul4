package services;

import model.Product;

import java.util.ArrayList;

public class ProductServices {
    public ArrayList<Product> list = new ArrayList<>();

    public ProductServices(){
        list.add(new Product("your", "123", "/i/file/yoursong.mp3"));
    }
}
