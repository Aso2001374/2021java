package BattleShipGame;

//import java.util.Scanner;

public class GameMain {
    public static int count = 1;
    public static void main(String[] args){

        System.out.println("-----THE　爆雷攻撃-----");          //タイトルコール
        //System.out.printf("第%d%回戦",count);

                        //海上のマス　初期化   
        Ship Ship1 = new Ship();
        Ship Ship2 = new Ship();
        Ship Ship3 = new Ship();

    Ship.Shipplace();
    DropPlace.Coordinate();                                   //

    //if( sea[DropPlace.y][DropPlace.x]==sea[Ship.sy][Ship.sx]){
        
    }
    
}