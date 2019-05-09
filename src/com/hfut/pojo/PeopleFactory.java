package com.hfut.pojo;

public class PeopleFactory {
    public People newInstance(){
        return new People(1,"test");
    }
}
