package model;

import java.util.List;

public class Sandwich {
    private String skin;
    private List<String> nhanBanh;

    public Sandwich(){}

    public Sandwich(String skin, List<String> nhanBanh) {
        this.skin = skin;
        this.nhanBanh = nhanBanh;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public List<String> getNhanBanh() {
        return nhanBanh;
    }

    public void setNhanBanh(List<String> nhanBanh) {
        this.nhanBanh = nhanBanh;
    }
}


