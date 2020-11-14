package com.atguigu.builder.pattern2;

public class HighBuilder extends AbstractBuilder {
    @Override
    public void buildBasics() {
        System.out.println("Build high basics");
        this.house.setBasics("High basics");
    }

    @Override
    public void buildWalls() {
        System.out.println("Build high walls");
        this.house.setWalls("High Walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("Build high roof");
        this.house.setRoof("High roof");
    }
}
