package com.beeru.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.beeru.model.Employee;

@Repository
public class EmployeeRepo implements IEmployeeRepo {

    private static final String SQL_QUERY = "SELECT * FROM jdbc_learning.studentsinfo;";
	@Autowired
    private DataSource dataSource;

	private List<Employee> emp;
    @Override
    public List<Employee> getEmployeeInfo() {
        try  {

            System.out.println("The implementation class of data source is : " + dataSource.getClass().getName());
            Connection connection = dataSource.getConnection();
            PreparedStatement prpst = connection.prepareStatement(SQL_QUERY);
            // Add your query execution logic here
           ResultSet rs = prpst.executeQuery();
           emp=new ArrayList<>();

        } catch (SQLException e) { 
            e.printStackTrace();
        }
        return null;
    }
}