package BattleShipGame;

import java.util.Scanner;

public class DropPlace{

    public int y;
    public int x;

    public void Coordinate(){

        Scanner sc= new Scanner(System.in);

        System.out.println("雷撃投下用意！(「縦軸」投下位置ノ指示ヲ0～4の座標ニテ求ム！)");    
        y= sc.nextInt();
        
        System.out.println("雷撃投下用意！（「横軸」投下位置ノ指示ヲ0～4の数字ニテ求ム！）");    
        x= sc.nextInt();
        sc.close();

        if( y>4 || x>4 || y<0 || x<0){
            System.out.println("当範囲ニ敵在ラズ、再度ノ指示ヲ求ム！");
        }
    }
}