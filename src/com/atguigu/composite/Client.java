package com.atguigu.composite;

public class Client {
    public static void main(String[] args) {
        University university = new University("清华大学", "中国顶级大学");
        College dianxin = new College("电信学院", "挺好的");
        College huagong = new College("化工学院" , "还可以");

        Department jisuanji = new Department("计算机系", "学习计算机");
        Department dianzi = new Department("电子系", "学习电子知识");

        Department lilunhuaxue = new Department("理论化学系", "学习化学");
        Department shengwu = new Department("生物化学", "学习生物");

        university.add(dianxin);
        university.add(huagong);

        dianxin.add(jisuanji);
        dianxin.add(dianzi);

        huagong.add(lilunhuaxue);
        huagong.add(shengwu);

        university.printDescription();

    }
}
