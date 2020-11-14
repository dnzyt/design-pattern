package com.atguigu.builder.pattern2;

public class Client {


    /*
    * Builder   负责每一步的具体操作
    * Director  负责每一步的先后顺序
    * */
    public static void main(String[] args) {

        CommonBuilder cb = new CommonBuilder();
        HighBuilder hb = new HighBuilder();

        HouseDirector director = new HouseDirector(cb);
        House house = director.buildBottomUp();
        System.out.println(house);
        System.out.println(director.buildUpBottom());
        director.setBuilder(hb);
        house = director.buildBottomUp();
        System.out.println(house);
        System.out.println(director.buildUpBottom());
    }
}
