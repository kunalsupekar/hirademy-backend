package com.example.Assistant_API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Assistant_service {


    @Autowired
   private Repository repository;

    public String addAssistant(Assistant assistant) {
        Assistant savedAssistant = repository.save(assistant);
        int assistantId = savedAssistant.getId();
        System.out.println("Assistant saved with ID: " + assistantId);
        return "Assistant saved successfully and ID is " + assistantId;
    }

    public List<Assistant> getAllassistants() {
        List<Assistant> assistants = repository.findAll();
        return assistants;
    }

    public Assistant getAssistantById(int assistatID) {
        System.out.println("fetching single record");
        return repository.findById(assistatID).get();
    }

    // Update the Assistant
    public String updateAssistant(Assistant assistant) {
        if (!repository.existsById(assistant.getId())) {
            return "no assistant with specified assistant_id exits";
        }
        repository.save(assistant);
        return "updated successfully";
    }



    //deleting Assistant
    public String deleteAssistant(int assistantId) {
        Optional<Assistant> optionalAssistant = repository.findById(assistantId);

        if (optionalAssistant.isPresent()) {
            Assistant assistant = optionalAssistant.get();
            repository.delete(assistant);
            return "Assistant deleted successfully";
        } else {
            return "Assistant not found";
        }
    }



}
