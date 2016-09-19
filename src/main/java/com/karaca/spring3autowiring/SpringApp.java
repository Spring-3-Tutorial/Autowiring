
package com.karaca.spring3autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author kemalsamikaraca
 */
public class SpringApp {
    
    public static void main(String[] args){
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        
        // --- Auto-wiring Example --- (Default)
        Customer customer = (Customer)context.getBean("customerBean");
        System.out.println(customer.toString());
        
        // --- Auto-wiring Example --- (autowire="byName")
        Customer customerAutowireByName = (Customer)context.getBean("customerAutowireByName");
        System.out.println(customerAutowireByName.toString());
        
        // --- Auto-wiring Example --- (autowire="byType")
        Department departmentAutowireByType = (Department)context.getBean("departmentAutowireByType");
        System.out.println(departmentAutowireByType.toString());
    }
    
}
