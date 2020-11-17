package com.atguigu.composite;

import java.util.ArrayList;
import java.util.List;

public class University extends Organization {

    private List<Organization> colleges = new ArrayList<>();

    public University(String name, String desc) {
        this.setName(name);
        this.setDesc(desc);
    }

    @Override
    protected void add(Organization org) {
        colleges.add(org);
    }

    @Override
    protected void remove(Organization org) {
        colleges.remove(org);
    }

    @Override
    protected void printDescription() {
        System.out.println("-------- " + getName() + " ------------");
        for (Organization org: colleges) {
            org.printDescription();
        }
    }
}
