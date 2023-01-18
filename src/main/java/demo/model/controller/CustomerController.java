package demo.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import demo.model.entities.Customer;
import demo.model.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerSer;
	
	
	@RequestMapping("/customerData")
	public String saveCustomer() {
		return "detailes";
	}
	@RequestMapping("/showController")
	public String showController(Customer cus) {
		customerSer.saveCustomerDetailes(cus);
		return "detailes";
	}
	
	@RequestMapping("/list")
	public String listAll(Model model) {
		List<Customer>lists = customerSer.getAllList();
		model.addAttribute("lists", lists);
		return "create_list";
	}
	@RequestMapping("/delete")
	public String deleteOneLead(@RequestParam("id") long id,Model model) {
		customerSer.deleteById(id);
		List<Customer>lists = customerSer.getAllList();
		model.addAttribute("lists", lists);
		return "create_list";
		}
	@RequestMapping("/update")
	public String updateOneLead(@RequestParam("id") long id,Model model) {
		Customer cus = customerSer.updateLead(id);
		model.addAttribute("cus", cus);
		return"updateLead";
	}
	@RequestMapping("/updateLead")
	public String updateOneLead(Customer cus ,Model model) {
		List<Customer>lists = customerSer.getAllList();
		customerSer.saveCustomerDetailes(cus);
		model.addAttribute("lists", lists);
		return "create_list";

		
	}
}
