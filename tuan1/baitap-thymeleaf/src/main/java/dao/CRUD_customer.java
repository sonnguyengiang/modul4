package dao;

import model.Customer;

import java.sql.*;
import java.util.ArrayList;

public class CRUD_customer {
    static Connection connection = ConnectionCSDL.getConnection();

    public static ArrayList<Customer> show() throws SQLException{
        String show = "select * from customer";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(show);
        ArrayList<Customer> list = new ArrayList<>();
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String gmail = resultSet.getString("gmail");
            String address = resultSet.getString("address");
            Customer customer = new Customer(id, name, gmail, address);
            list.add(customer);
        }
        return list;
    }

    public static void Create(Customer customer) throws SQLException {
        String create = "INSERT INTO `customer`.`customer` (`id`, `name`, `gmail`, `address`) VALUES (?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(create);
        preparedStatement.setInt(1, customer.getId());
        preparedStatement.setString(2, customer.getName());
        preparedStatement.setString(3, customer.getGmail());
        preparedStatement.setString(4, customer.getAddress());
        preparedStatement.execute();
    }

    public static void delete(int id) throws SQLException {
        String delete = "DELETE FROM `customer`.`customer` WHERE (`id` = ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(delete);
        preparedStatement.setInt(1, id);
        preparedStatement.execute();
    }

    public static void edit(Customer customer, int id) throws SQLException {
        String edit = "UPDATE `customer`.`customer` SET `name` = ?, `gmail` = ?, `address` = ? WHERE (`id` = ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(edit);
        preparedStatement.setInt(4, customer.getId());
        preparedStatement.setString(1, customer.getName());
        preparedStatement.setString(2, customer.getGmail());
        preparedStatement.setString(3, customer.getAddress());
        preparedStatement.execute();
    }

    public static ArrayList<Customer> find(String findName) throws SQLException{
        String show = "select * from customer where name like '%"+findName+"%'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(show);
        ArrayList<Customer> list = new ArrayList<>();
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String gmail = resultSet.getString("gmail");
            String address = resultSet.getString("address");
            Customer customer = new Customer(id, name, gmail, address);
            list.add(customer);
        }
        return list;
    }
}
