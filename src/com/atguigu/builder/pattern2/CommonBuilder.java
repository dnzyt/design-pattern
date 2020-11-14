package com.atguigu.builder.pattern2;

public class CommonBuilder extends AbstractBuilder {
    @Override
    public void buildBasics() {
        System.out.println("Build common basics");
        this.house.setBasics("Common basics");
    }

    @Override
    public void buildWalls() {
        System.out.println("Build common walls");
        this.house.setWalls("Common walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("Build common roof");
        this.house.setRoof("Common roof");
    }
}
