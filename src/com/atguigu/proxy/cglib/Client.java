package com.atguigu.proxy.cglib;

public class Client {
    public static void main(String[] args) {
        TeacherDaoImpl teacherDao = new TeacherDaoImpl();
        TeacherDaoImpl proxy = (TeacherDaoImpl) new ProxyFactory(teacherDao).getProxyInstance();
        proxy.teach();
    }
}
