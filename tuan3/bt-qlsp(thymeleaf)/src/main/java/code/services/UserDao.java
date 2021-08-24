package code.services;

import code.model.Account;
import code.model.Login;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<Account> users;

    static {
        users = new ArrayList<>();
        Account u1 = new Account();
        u1.setId("10");
        u1.setName("John");
        u1.setUsername("john");
        u1.setGmail("john@codegym.vn");
        u1.setPassword("123456");
        users.add(u1);


        Account u3 = new Account();
        u3.setId("16");
        u3.setName("Mike");
        u3.setUsername("mike");
        u3.setGmail("mike@codegym.vn");
        u3.setPassword("123456");
        users.add(u3);
    }

    public static Account checkLogin(Login login) {
        for (Account u : users) {
            if (u.getUsername().equals(login.getUsername())
                    && u.getPassword().equals(login.getPassword())) {
                return u;
            }
        }
        return null;
    }
}