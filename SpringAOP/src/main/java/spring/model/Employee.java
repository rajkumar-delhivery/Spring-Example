package spring.model;

import spring.aspect.Loggable;

/**
 * Created by delhivery on 3/10/16.
 */
public class Employee {

    String name;
    public String getName(){
        return name;
    }

    @Loggable
    public void setName(String name){
        this.name = name;
    }

    public void throwException(){
        throw new RuntimeException("Dummy Exception");
    }

}
