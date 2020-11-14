package com.atguigu.adapter.obj;

public class Phone {
    public void charging(IVoltage5 power) {
        if (power.output() == 5) {
            System.out.println("Voltage is 5V, phone is charging...");
        } else {
            System.out.println("Voltage is not right, phone cannot be charged.");
        }
        return;
    }
}
