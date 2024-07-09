package GusserGame;
import javax.imageio.stream.ImageInputStream;
import java.net.SocketOption;
import java.util.Scanner;

class Gusser
{
    int GuesserNum;
    public int GuesserNumb(){
        Scanner Scan=new Scanner(System.in);
        System.out.println("Gusser kindly guess the number");
        GuesserNum=Scan.nextInt();
        return GuesserNum;
    }
}
class Player
{
    int PlayerNum;
    public int PlayerNumb(){
        Scanner Scan=new Scanner(System.in);
        PlayerNum=Scan.nextInt();
        return PlayerNum;
    }
}
class umpire
{
    int Gussernum;
    int Playernum1;
    int Playernum2;
    int Playernum3;

    public void collectNumFromGusser()
    {
        Gusser Gu=new Gusser();
        Gussernum=Gu.GuesserNumb();
    }

    public void collectNumFromPlayer()
    {
        System.out.println("Player1 kindly guess the number");
        Player p1=new Player();
        Playernum1= p1.PlayerNumb();

        System.out.println("Player2 kindly guess the number");
        Player p2=new Player();
        Playernum2= p2.PlayerNumb();


        System.out.println("Player3 kindly guess the number");
        Player p3=new Player();
        Playernum3=p3.PlayerNumb();



    }
    public void compare(){
        if(Gussernum==Playernum1){
            if(Gussernum==Playernum2&&Gussernum==Playernum3){
                System.out.println("All player won the game");
            }
            else if(Gussernum==Playernum2){
                System.out.println("Player 1 and Player 2 won the game");
            }
            else if(Gussernum==Playernum3){
                System.out.println("Player 1 and Player 3 won the game");
            }
            else{
              System.out.println("Only Player 1 won the game");
            }
        }
        else if(Gussernum==Playernum2){
            if(Gussernum==Playernum3){
                System.out.println("player 2 and player 3");
            }
            else{
                System.out.println("Player 2");
            }
        }
        else if(Gussernum==Playernum3){
            System.out.println("only player 3 won the game");
        }
        else{
            System.out.println("All player lost the game");
        }
    }
}
public class MyGusserGame
{
    public static void main(String[] args) {
    System.out.println("-------Game Started-------");
    umpire UM =new umpire();
    UM.collectNumFromGusser();
    UM.collectNumFromPlayer();
    UM.compare();
    System.out.println("-------Game Over---------");
    }
}
