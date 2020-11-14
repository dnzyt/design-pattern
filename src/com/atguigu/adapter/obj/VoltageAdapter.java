package com.atguigu.adapter.obj;

public class VoltageAdapter implements IVoltage5 {

    private Voltage220 power;

    public VoltageAdapter(Voltage220 p) {
        this.power = p;
    }

    @Override
    public int output() {
        int s = power.output220();
        System.out.println("Converting 200V to 5V");
        return s / 44;
    }
}
