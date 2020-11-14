package com.atguigu.adapter.obj;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        IVoltage5 power = new VoltageAdapter(new Voltage220());
        phone.charging(power);
        return;
    }
}
