package demo.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.model.entities.Customer;
import demo.model.repository.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService {
 
	
	@Autowired
	private CustomerRepository repo;
	
	@Override
	public void saveCustomerDetailes(Customer cus) {
                repo.save(cus);
	}

	@Override
	public List<Customer> getAllList() {
		List<Customer> lists = repo.findAll();
		return lists;
	}
	@Override
	public void deleteById(long id) {
		repo.deleteById(id);
	}

	@Override
	public Customer updateLead(long id) {
		Optional<Customer> findById = repo.findById(id);
		Customer cus = findById.get();
		return cus;
	}
	

}
