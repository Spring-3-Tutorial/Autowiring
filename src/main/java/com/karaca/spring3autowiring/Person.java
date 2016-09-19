
package com.karaca.spring3autowiring;

/**
 *
 * @author kemalsamikaraca
 */
public class Person {
    
    private String name;
    
    @Override
    public String toString(){
        return " name:" + this.getName();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
