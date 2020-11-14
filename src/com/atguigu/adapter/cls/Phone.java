package com.atguigu.adapter.cls;

public class Phone {
    public void charging(IVoltage5 power) {
        if (power.output5V() == 5) {
            System.out.println("Phone is charging...");
        } else {
            System.out.println("Voltage is not right, phone cannot be charged");
        }
        return;
    }
}
