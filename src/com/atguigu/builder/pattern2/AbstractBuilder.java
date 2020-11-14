package com.atguigu.builder.pattern2;

public abstract class AbstractBuilder {
    protected House house = new House();

    public abstract void buildBasics();
    public abstract void buildWalls();
    public abstract void buildRoof();

    public House build() {
        return house;
    }
}
