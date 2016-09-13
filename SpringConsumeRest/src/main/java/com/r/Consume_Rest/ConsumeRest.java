package com.r.Consume_Rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by delhivery on 26/8/16.
 *JsonIgnoreProperties: the Jackson JSON processing library to indicate that any properties not bound in this type should be ignored.
 *Main class for the initialization of the quotation
 */

@JsonIgnoreProperties(ignoreUnknown = true)
class Quote {
    private String type;
    private Value value;

    public Quote(){

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return "Quote {"+"type='"+type+"\'"+" value=" + value+'}';
    }
}

