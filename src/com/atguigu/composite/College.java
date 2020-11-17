package com.atguigu.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends Organization {

    List<Organization> depts = new ArrayList<>();

    public College(String name, String desc) {
        this.setName(name);
        this.setDesc(desc);
    }

    @Override
    protected void add(Organization org) {
        depts.add(org);
    }

    @Override
    protected void remove(Organization org) {
        super.remove(org);
    }

    @Override
    protected void printDescription() {
        System.out.println(" --- " + getName() + " ---");
        for (Organization org: depts) {
            System.out.println(" - " + org.getName() + " -");
        }
    }
}
