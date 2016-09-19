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
public class Department {
    
    private Manager manager;
    
    @Override
    public String toString(){
        return " manager:"+ this.getManager().toString();
    }

    /**
     * @return the manager
     */
    public Manager getManager() {
        return manager;
    }

    /**
     * @param manager the manager to set
     */
    public void setManager(Manager manager) {
        this.manager = manager;
    }
    
}
