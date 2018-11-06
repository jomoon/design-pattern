package com.hjj;

public class Work {
    private int hour;
    private boolean isTaskFinished;
    public void writeProgram() {
        // 方法过长是坏味道
        if (hour < 12) {
            System.out.printf("当前时间:%d点 上午工作，精神百倍!",hour);
        }else if(hour < 17) {
            System.out.printf("当前时间:%d点 状态不错，精神百倍!",hour);
        }
    }

    public static void main(String[] args) {
        Work w = new Work();
        w.hour = 15;
        w.writeProgram();
    }
}