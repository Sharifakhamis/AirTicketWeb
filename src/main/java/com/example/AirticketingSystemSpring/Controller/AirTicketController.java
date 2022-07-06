package com.example.AirticketingSystemSpring.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.AirticketingSystemSpring.exception.ResourceNotFoundException;
import com.example.AirticketingSystemSpring.model.AirTicket;
import com.example.AirticketingSystemSpring.repository.AirTicketRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/AirTicket")

public class AirTicketController {

	@Autowired
	private AirTicketRepository airTicketRepository;


		// get all employees
		@GetMapping("/")
		public List<AirTicket> getAllAirTicket(){
			return airTicketRepository.findAll();
		}


		// create employee rest api
	@PostMapping("/")
	public AirTicket createaAirTicket(@RequestBody AirTicket airticket) {
		return airTicketRepository.save(airticket);
	}


		// get employee by id rest api
		@GetMapping("/{id}")
		public ResponseEntity<AirTicket> getAirTicketById(@PathVariable Long id) {
			AirTicket airTicket = airTicketRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Invalid Id"));
			return ResponseEntity.ok(airTicket);
		}
		

		// update employee rest api
	
		@PutMapping("/{id}")
		public ResponseEntity<AirTicket> updateAirTicket(@PathVariable Long id, @RequestBody AirTicket airTicket){
			AirTicket at = airTicketRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Invalid Id"));
			
			at.setFnme(airTicket.getFnme());
			at.setEmail(airTicket.getEmail());
			at.setPhone(airTicket.getPhone());
			at.setAddress(airTicket.getAddress());
			at.setAdults(airTicket.getAdults());
			at.setChildren(airTicket.getChildren());
			at.setOr_date(airTicket.getOr_date());
		AirTicket ak = airTicketRepository.save(at);
			return ResponseEntity.ok(ak);
		}


		 // delete employee rest api
	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteAirTicket(@PathVariable Long id){
		AirTicket ac = airTicketRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Invalid Id"));
		
		airTicketRepository.delete(ac);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
         
	  


	   
	

			
		
		}
	
	  
	
	

	




    
