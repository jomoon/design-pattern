package com.hjj.memo1;

import lombok.Data;

@Data
public class GameRole {

    private int vitality;

    private int attack;

    private int defense;

    public void stateDisplay() {
        System.out.println("角色当前状态:");
        System.out.printf("体力:%d \n",vitality);
        System.out.printf("攻击力:%d \n",attack);
        System.out.printf("防御力:%d \n",defense);
    }

    public void getInitState() {
        this.vitality = 100;
        this.attack = 100;
        this.defense = 100;
    }

    public void fight() {
        this.vitality = 0;
        this.attack = 0;
        this.defense = 0;
    }

    
}