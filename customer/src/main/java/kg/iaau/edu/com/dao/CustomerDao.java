package kg.iaau.edu.com.dao;

import kg.iaau.edu.com.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class CustomerDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public CustomerDao(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Customer> getCustomers()
    {
        return jdbcTemplate.query("select * from northwind", new RowMapper<Customer>() {
            public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
                Customer customer = new Customer();

                customer.setId(resultSet.getInt("id"));
                customer.setFirstName(resultSet.getString("firstName"));
                customer.setLastName(resultSet.getString("lastName"));
                customer.setEmailAddress(resultSet.getString("emailAddress"));
                customer.setJobTitle(resultSet.getString("jobTitle"));
                customer.setEmailAddress(resultSet.getString("emailAddress"));
                customer.setMobilePhone(resultSet.getInt("mobilePhone"));
                customer.setCity(resultSet.getString("city"));
                customer.setWebPage(resultSet.getString("webPage"));




                return customer;
            }
        });
    }

    public Customer getCustomer(int id)
    {
        String sql = "SELECT * FROM customers WHERE id = ?";
        RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<>(Customer.class);
        Customer customer = jdbcTemplate.queryForObject(sql, rowMapper, id);

        return customer;
    }

    public boolean delete(int id)
    {
        return jdbcTemplate.update("delete from customer where id = ?", id) == 1;
    }

    public boolean create(Customer customer)
    {
        return jdbcTemplate.update("insert into customer (id, firstName, lastName, emailAddress, jobTitle, mobilePhone, city, webPage) values (?, ?, ?)", customer.getFirstName(), customer.getLastName(), customer.getEmailAddress(), customer.getJobTitle(), customer.getMobilePhone(), customer.getCity(), customer.getWebPage()) == 1;
    }

    public boolean update(Customer customer)
    {
        return jdbcTemplate.update("update customer set firstName =?, lastName=?, emailAddress=?, jobTitle=?,mobilePhone=?,city=?, webPage=?  where id=?", customer.getFirstName(), customer.getLastName(), customer.getEmailAddress(), customer.getJobTitle(), customer.getMobilePhone(), customer.getCity(), customer.getWebPage()) == 1;
    }
}