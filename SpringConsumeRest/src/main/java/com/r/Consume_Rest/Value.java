package com.r.Consume_Rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by delhivery on 26/8/16.
 *
 *JsonIgnoreProperties: the Jackson JSON processing library to indicate that any properties not bound in this type should be ignored.
 *Additional  class for the initialization of the inner-quotation of the Quotation which is retrived from ConsumeRest.java
 */

@JsonIgnoreProperties
public class Value {
    private  int id;
    private String quote;

    public Value(){

    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setQuote(String quote){
        this.quote = quote;
    }

    @Override
    public String toString(){
        //Intialization of quotation by overriding the toString() method
        return "Value{ "+"id="+id+", quote = \""+quote +"\" }";
    }
}
