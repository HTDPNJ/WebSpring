package com.hfut.pojo;

public  class StaticPeopleFactory {
    public static People newInstance(){
        return new People(1,"test");
    }
}
