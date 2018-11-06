package com.hjj.memo2;

public class Client {

    public static void main(String[] args) {
        GameRole lixiaoyao = new GameRole();

        lixiaoyao.getInitState();
        lixiaoyao.stateDisplay();

        System.out.println("================");
        System.out.println("     保存进度    ");
        System.out.println("================");
        // 保存进度
        // GameRole roleBak = new GameRole();
        // roleBak.setAttack(lixiaoyao.getAttack());
        // roleBak.setVitality(lixiaoyao.getVitality());
        // roleBak.setDefense(lixiaoyao.getDefense());
        GameRoleTaker taker = new GameRoleTaker();
        taker.setGameRoleMemento(lixiaoyao.saveState());
    
        System.out.println("================");
        System.out.println("  李逍遥大战boss  ");
        System.out.println("================");
        lixiaoyao.fight();
        lixiaoyao.stateDisplay();
        System.out.println("================");
        System.out.println("     读取进度    ");
        System.out.println("================");
       
        lixiaoyao.recovery(taker.getGameRoleMemento());
        lixiaoyao.stateDisplay();
    }
}