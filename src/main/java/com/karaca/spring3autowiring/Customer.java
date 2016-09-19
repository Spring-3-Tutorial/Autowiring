/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karaca.spring3autowiring;

/**
 *
 * @author kemalsamikaraca
 */
public class Customer {
    
    private Person person;
    
    @Override
    public String toString(){
        return " person:" + this.getPerson().toString();
    }

    /**
     * @return the person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * @param person the person to set
     */
    public void setPerson(Person person) {
        this.person = person;
    }
    
}
