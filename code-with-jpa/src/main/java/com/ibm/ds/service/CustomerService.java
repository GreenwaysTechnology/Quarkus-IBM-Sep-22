package com.ibm.ds.service;

import com.ibm.ds.model.Customer;
import io.agroal.api.AgroalDataSource;
import io.quarkus.agroal.DataSource;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CustomerService {

    //inject datasource according to service
    @Inject
    @DataSource("customers")
    AgroalDataSource customerDataSource;
    List<Customer> customers = new ArrayList<>();

    @PostConstruct
    public void init() {
        System.out.println("H2- db init is called");

        Connection connection = null;
        try {
            connection = customerDataSource.getConnection();
            System.out.println("H2 connection " + connection);
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("CREATE TABLE customer(id INT NOT NULL,  name VARCHAR(50))");
            stmt.executeUpdate("INSERT INTO customer " + "VALUES (101, 'Dhivya Sree')");
            stmt.executeUpdate("INSERT INTO customer " + "VALUES (102, 'Srisha')");
            stmt.executeUpdate("INSERT INTO customer " + "VALUES (103, 'Geetha Subramanian')");

            ResultSet rs = stmt.executeQuery("select * from customer");
            while (rs.next()) {
                customers.add(new Customer(rs.getInt(1), rs.getString(2)));
            }
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(connection);
    }
    public List<Customer> listCustomers() {
        return customers;
    }

}
