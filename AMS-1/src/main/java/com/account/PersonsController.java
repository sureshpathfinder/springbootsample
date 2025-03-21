package com.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonsController
{
    //auto-wire the PersonsService class
    @Autowired
    PersonsService personsService;
    //creating a get mapping that retrieves all the persons detail from the database   
    @GetMapping("/person")
    private List<Persons> getAllPersons()
    {
        return personsService.getAllPersons();
    }
    //creating a get mapping that retrieves the detail of a specific person  
    @GetMapping("/person/{personsId}")
    private Persons getPersons(@PathVariable("personsId") int personsId)
    {
        return personsService.getPersonsById(personsId);
    }
    //creating a delete mapping that deletes a specified person  
    @DeleteMapping("/person/{personsId}")
    private void deletePerson(@PathVariable("personsId") int personsId)
    {
        personsService.delete(personsId);
    }
    //creating post mapping that post the person detail in the database  
    @PostMapping("/persons")
    private int savePerson(@RequestBody Persons persons)
    {
        personsService.saveOrUpdate(persons);
        return persons.getPersonID();
    }
    //creating put mapping that updates the person detail   
    @PutMapping("/persons")
    private Persons update(@RequestBody Persons persons)
    {
        personsService.saveOrUpdate(persons);
        return persons;
    }
}  
