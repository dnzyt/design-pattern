package com.atguigu.builder.pattern2;

public class HouseDirector {
    private AbstractBuilder builder;

    public HouseDirector(AbstractBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(AbstractBuilder builder) {
        this.builder = builder;
    }

    public House buildBottomUp() {
        this.builder.buildBasics();
        this.builder.buildWalls();
        this.builder.buildRoof();
        return this.builder.build();
    }

    public House buildUpBottom() {
        this.builder.buildRoof();
        this.builder.buildWalls();
        this.builder.buildBasics();
        return this.builder.build();
    }
}
