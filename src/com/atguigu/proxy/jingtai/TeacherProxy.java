package com.atguigu.proxy.jingtai;

public class TeacherProxy implements TeacherDao {

    private TeacherDao teacherDao;

    @Override
    public void teach() {
        System.out.println("Before teaching...");
        this.teacherDao.teach();
        System.out.println("After teaching...");
    }
}
