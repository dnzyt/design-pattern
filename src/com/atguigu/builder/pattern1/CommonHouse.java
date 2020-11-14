package com.atguigu.builder.pattern1;

public class CommonHouse extends AbstractBuilder {

    @Override
    public void buildBasic() {
        System.out.println("Build Common Basic");
    }

    @Override
    public void buildWalls() {
        System.out.println("Build Common Walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("Build Common Roof");
    }
}
