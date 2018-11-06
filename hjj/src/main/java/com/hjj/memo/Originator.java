package com.hjj.memo;

public class Originator {
    public String state;
    /**
     * 创建备忘录，将当前需要保存的信息导入并实力化出一个memento对象
     * @return
     */
    public Memoto createMemo() {
        return new Memoto(state);
    }
    /**
     * 恢复备忘录，将memoto导入并进行相关数据恢复
     * @param memoto
     */
    public void setMemento(Memoto memoto) {
        state = memoto.state;
    }

    public void show() {
        System.out.println("state = " + state);
    }
}