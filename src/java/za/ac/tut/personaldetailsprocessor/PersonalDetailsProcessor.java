/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.personaldetailsprocessor;

import za.ac.tut.personaldetails.PersonalDetails;

/**
 *
 * @author user
 */
public class PersonalDetailsProcessor {
    private PersonalDetails personalDetails;

    public PersonalDetailsProcessor() {
    }
    
    
    
    public String calculateAge(PersonalDetails personalDetails){
        String token [] = personalDetails.getDoB().split("-");
        
        Integer age = 2022 - Integer.parseInt(token[0]);
        
        return age.toString();
    }
}
