package com.example.Assistant_API;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assistant")
public class Controller {

    @Autowired
    private  Assistant_service assistantService;
    @Autowired
    private Assistant_service assistant_service;


    @GetMapping("/ping")
    public String Ping() {

        return "we are alive";
    }
    //getting all Assistants.
    @GetMapping
    public List<Assistant> getAllAssistan() {
        return  this.assistantService.getAllassistants();
    }

    //geting single assistant.
    @GetMapping("/{assistant_id}")
    public ResponseEntity<Assistant> getAssistantDetails(@PathVariable int assistant_id) {
        Assistant assistant = assistantService.getAssistantById(assistant_id);
        if (assistant != null) {
            return ResponseEntity.ok(assistant);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    // Storing the new assistant
    @PostMapping
    public ResponseEntity<String> createAssistant(@RequestBody Assistant assistant) {
        String result = assistantService.addAssistant(assistant);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }


    //updating the records.
    @PutMapping("/{assistant_id}")
    public String updateAssistant(@PathVariable int assistant_id, @RequestBody Assistant assistant) {
        assistant.setId(assistant_id);
        return assistant_service.updateAssistant(assistant);
    }


    //deleting the records.
    @DeleteMapping("/{assistant_id}")
    public ResponseEntity<String> deleteAssistant(@PathVariable int assistant_id) {
        String result = assistantService.deleteAssistant(assistant_id);
        if (result != null) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.notFound().build();
        }
    }







}
