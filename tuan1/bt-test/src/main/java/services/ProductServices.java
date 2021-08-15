package services;

import model.Product;
import java.util.ArrayList;

public class ProductServices {
    public ArrayList<Product> list = new ArrayList<>();

    public ProductServices(){
        list.add(new Product("iphone", 4, "black", "phone", "https://images.fpt.shop/unsafe/fit-in/585x390/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2020/10/14/637382725406081030_ip-12-pro-max-vang-1.png"));
    }

    public void save(Product product){
        list.add(product);
    }

    public void edit(int index, Product product){
        list.set(index, product);
    }

    public void delete(int index){
        list.remove(index);
    }

    public ArrayList<Product> findByName(String name){
        ArrayList<Product> lists = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(name);
            if (list.get(i).getName().equals(name)) {
                lists = list;
            }
        }
        return lists;
    }
}
