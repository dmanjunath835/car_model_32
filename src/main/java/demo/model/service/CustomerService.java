package demo.model.service;

import java.util.List;

import demo.model.entities.Customer;

public interface CustomerService {
public void saveCustomerDetailes(Customer cus);
public List<Customer> getAllList();
public void deleteById(long id);
public Customer updateLead(long id);
	

}
