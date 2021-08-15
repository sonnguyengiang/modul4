package model;

public class Product {
    private String name;
    private int  quantity;
    private String color;
    private String category;
    private String img;

    public Product(String name, int quantity, String color, String category, String img) {
        this.name = name;
        this.quantity = quantity;
        this.color = color;
        this.category = category;
        this.img = img;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
