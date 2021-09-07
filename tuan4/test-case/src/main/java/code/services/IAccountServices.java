package code.services;

import code.model.Account;

import java.util.ArrayList;

public interface IAccountServices{
    ArrayList<Account> showFriend();

    Account findAccount(long id);


}
