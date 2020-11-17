package com.atguigu.composite;

public class Department extends Organization {

    public Department(String name, String desc) {
        this.setName(name);
        this.setDesc(desc);
    }

    @Override
    protected void printDescription() {
        System.out.println(" - " + getName());
    }
}
