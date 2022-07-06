package com.example.AirticketingSystemSpring.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.AirticketingSystemSpring.exception.ResourceNotFoundException;
import com.example.AirticketingSystemSpring.model.Email;
import com.example.AirticketingSystemSpring.repository.EmailRepository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api/admiin")
public class EmailController {
    @Autowired
    private EmailRepository EmailRepository;


     //getallstaff
     @GetMapping("/")
     public List<Email> getAllAdmiins()
     {
         return EmailRepository.findAll();
     }

//post staff
@PostMapping("/")
public Email addEmail(@RequestBody Email email)
{
    return EmailRepository.save(email);
}

 //update staff
 @PutMapping("/{id}")
 public ResponseEntity<Email> updateAdmiin(@PathVariable long id, @RequestBody Email email)
 {

     Email ad = EmailRepository.findById(id)
     .orElseThrow(() -> new ResourceNotFoundException("Invalid Id"));
     
     ad.setEmail(email.getEmail());
     ad.setPasword(email.getPasword());

     Email adm = EmailRepository.save(ad);
   
     return ResponseEntity.ok(adm);
 }



    

     //get staff by id
     @GetMapping("/{id}")
     public ResponseEntity<Email> getAdmiinById(@PathVariable long id)
     {
         Email ami = EmailRepository.findById(id)
         .orElseThrow(() -> new ResourceNotFoundException("Invalid Id"));
         return ResponseEntity.ok(ami);
     }


        //delete staff
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteAdmiin(@PathVariable long id)
    {
        Email im = EmailRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Invalid Id"));
        EmailRepository.delete(im);

        Map<String,Boolean> response = new HashMap<>();
        response.put("Deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    }

















 




     
 















