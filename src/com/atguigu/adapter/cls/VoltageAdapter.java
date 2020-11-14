package com.atguigu.adapter.cls;

public class VoltageAdapter extends Voltage220 implements IVoltage5 {
    @Override
    public int output5V() {
        int s = output220V();
        System.out.println("Output is converted to 5V");
        return s / 44;
    }
}
