package BattleShipGame;

import java.util.Random;

public class Ship{

    public int sy;
    public int sx;

    public void Shipplace(){

        Random rnd = new Random();

        sy = rnd.nextInt(5);
        sx = rnd.nextInt(5);

        System.out.println(sy);
        System.out.println(sx);
        
    }
}