package com.atguigu.builder.pattern1;

public abstract class AbstractBuilder {
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void buildRoof();

    public void build() {
        buildBasic();
        buildWalls();
        buildRoof();
    }

}
