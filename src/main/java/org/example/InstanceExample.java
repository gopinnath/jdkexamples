package org.example;

public class InstanceExample {

    public String determine(Object obj) {
        if(obj instanceof String str) return str;
        return null;
    }
}
