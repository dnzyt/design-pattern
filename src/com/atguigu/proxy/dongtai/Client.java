package com.atguigu.proxy.dongtai;

public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDaoImpl();

        TeacherDao proxy = (TeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        proxy.teach();
        System.out.println("client proxy: " + proxy);

    }
}
