package com.atguigu.adapter.cls;

public class Client {
    public static void main(String[] args) {
        Phone p = new Phone();
        IVoltage5 power = new VoltageAdapter();
        p.charging(power);
    }
}
