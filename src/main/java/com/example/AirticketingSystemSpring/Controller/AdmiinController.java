package com.example.AirticketingSystemSpring.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.AirticketingSystemSpring.exception.ResourceNotFoundException;
import com.example.AirticketingSystemSpring.model.Admiin;
import com.example.AirticketingSystemSpring.repository.AdmiinRepository;

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
public class AdmiinController {
    @Autowired
    private AdmiinRepository admiinRepository;

    //getallstaff
    @GetMapping("/")
    public List<Admiin> getAllAdmiins()
    {
        return admiinRepository.findAll();
    }

    
    //post staff
    @PostMapping("/")
    public Admiin addAdmiin(@RequestBody Admiin admiin)
    {
        return admiinRepository.save(admiin);
    }

    //update staff
    @PutMapping("/{id}")
    public ResponseEntity<Admiin> updateAdmiin(@PathVariable long id, @RequestBody Admiin admiin)
    {
        Admiin ad = admiinRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Invalid Id"));
        ad.setUsername(admiin.getUsername());
        ad.setEmail(admiin.getEmail());
        ad.setPasword(admiin.getPasword());

        Admiin adm = admiinRepository.save(ad);
      
        return ResponseEntity.ok(adm);
    }

     //get staff by id
     @GetMapping("/{id}")
     public ResponseEntity<Admiin> getAdmiinById(@PathVariable long id)
     {
         Admiin ami = admiinRepository.findById(id)
         .orElseThrow(() -> new ResourceNotFoundException("Invalid Id"));
         return ResponseEntity.ok(ami);
     }

       //delete staff
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteAdmiin(@PathVariable long id)
    {
        Admiin im = admiinRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Invalid Id"));
        admiinRepository.delete(im);

        Map<String,Boolean> response = new HashMap<>();
        response.put("Deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}





    
    

