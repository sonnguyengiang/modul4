package services;

import model.Test;

import java.util.ArrayList;

public class Test2 {
    public ArrayList<Test> list = new ArrayList<>();

    public void save(Test test){
        list.add(test);
    }

    public void edit(int index, Test test){
        list.set(index, test);
    }
}
