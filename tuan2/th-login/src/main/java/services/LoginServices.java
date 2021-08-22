package services;

import model.Account;

import java.util.ArrayList;

public class LoginServices {
    public ArrayList<Account> list = new ArrayList<>();

    public LoginServices(){
        list.add(new Account("son","son","son@gmail.com"));
    }

    public Account checklogin(String name, String password){
        for (Account a: list) {
            if (a.getName().equals(name)){
                if (a.getPassword().equals(password));
                return a;
            }
        }
        return null;
    }
}
