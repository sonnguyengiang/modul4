package code.services;

import code.model.Gmail;

import java.util.ArrayList;

public class GmailServices {
    public ArrayList<Gmail> list = new ArrayList<>();

    public GmailServices(){
        list.add(new Gmail("vietnamese", 12, true, "123,321"));
    }

    public void save(Gmail gmail){
        list.add(gmail);
    }

    public void remove(int index, Gmail gmail){
        list.set(index, gmail);
    }
}
