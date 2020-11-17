package com.atguigu.composite;

public abstract class Organization {
    private String name;
    private String desc;

    protected void add(Organization org) {
        throw new UnsupportedOperationException("This method must be override by subclass");
    }

    protected void remove(Organization org) {
        throw new UnsupportedOperationException("This method must be override by subclass");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    protected abstract void printDescription();
}
