package com.example.demo.Service;

import java.util.List;
import com.example.demo.DTO.CustomerDTO;
import com.example.demo.DTO.CustomerSaveDTO;
import com.example.demo.DTO.CustomerUpdateDTO;

public interface CustomerService {

	String addCustomer(CustomerSaveDTO customerSaveDTO);

	List<CustomerDTO> getAllCustomer();
	
    String updateCustomers(CustomerUpdateDTO customerUpdateDTO);

    boolean deleteCustomer(int id);

}
