package demo.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.model.entities.Customer;
import demo.model.repository.CustomerRepository;

@RestController
@RequestMapping("/api/cus")
public class CustomerRestController {
@Autowired
private CustomerRepository cusRepo;
	@GetMapping
	public List<Customer> getAllLeads(){
		List<Customer> cus = cusRepo.findAll();
		return cus;
	}
   @PostMapping
   public void saveOneLead(@RequestBody Customer cus) {
	   cusRepo.save(cus);
   }
}
