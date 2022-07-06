package com.example.AirticketingSystemSpring.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.AirticketingSystemSpring.exception.ResourceNotFoundException;
import com.example.AirticketingSystemSpring.model.Member;
import com.example.AirticketingSystemSpring.repository.MemberRepository;

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
@RequestMapping("api/Member")
public class MemberController{
    @Autowired
    private MemberRepository memberRepository;


    //getallstaff
    @GetMapping("/")
    public List<Member> getAllMember()
    {
        return memberRepository.findAll();
    }

     //post staff
     @PostMapping("/")
     public Member addStaff(@RequestBody Member member)
     {
         return memberRepository.save(member);
     }

      //update staff
    @PutMapping("/{id}")
    public ResponseEntity<Member> updateMember(@PathVariable long id, @RequestBody Member member)
    {
        Member mb = memberRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Invalid Id"));
        mb.setFnme(member.getFnme());
        mb.setLname(member.getLname());
        mb.setGender(member.getGender());

        Member mbr = memberRepository.save(mb);

        return ResponseEntity.ok(mbr);
    }

     //get staff by id
     @GetMapping("/{id}")
     public ResponseEntity<Member> getMemberById(@PathVariable long id)
     {
         Member mbt = memberRepository.findById(id)
         .orElseThrow(() -> new ResourceNotFoundException("Invalid Id"));
         return ResponseEntity.ok(mbt);
     }


//delete staff
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteMember(@PathVariable long id)
    {
        Member rj = memberRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Invalid Id"));
        memberRepository.delete(rj);

        Map<String,Boolean> response = new HashMap<>();
        response.put("Deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
    

