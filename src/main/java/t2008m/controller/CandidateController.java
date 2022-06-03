package t2008m.controller;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import t2008m.entity.Candidate;
import t2008m.service.CandidateService;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/candidates")
public class CandidateController {
    @Autowired
    CandidateService candidateService;
    @GetMapping
    public ResponseEntity<?> getList(){
        return ResponseEntity.ok(candidateService.findPage());
    }
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Candidate candidate){
        return ResponseEntity.status(HttpStatus.CREATED).body(candidateService.save(candidate));
    }
}