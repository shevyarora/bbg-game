import java.util.*;
public class bbg{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        Random obj =new Random();
        System.out.println("****** WELCOME TO BOMB , BUILDING & GUN GAME *******");

        System.out.println("1)Bomb");
        System.out.println("2)Building");
        System.out.println("3)Gun");
        System.out.println(" ** Note : Write -1 to quit **");
        
        // computer random generating number : from 1 to 3 .
        int choice ;
        int cwins=0;
        int ywins=0;
        // System.out.println(rnum);
        do{ 
            int rnum=obj.nextInt(3-1+1)+1;
            System.out.println("Enter your choice :");
            choice =sc.nextInt();
            if(choice==rnum){
                System.out.println("Draw !");
            }
            else if(choice==1 && rnum==2){
               System.out.println("COMPUTER :BUILDING");
               System.out.println("YOU : BOMB ");
               System.out.println("Computer's building is blasted ! ");
               System.out.println("You Win !");
               ywins++;
            }
            else if(choice==1 && rnum==3){
               System.out.println("COMPUTER :GUN");
               System.out.println("YOU : BOMB ");
               System.out.println("You are blasted ! You died !");
               System.out.println("You LOSE !");
            cwins++;
            }
            else if(choice==2 && rnum==3){
               System.out.println("COMPUTER : GUN");
               System.out.println("YOU : BUILDING ");
               System.out.println("Building crushed the gun !");
               System.out.println("You Win!");
               ywins++;
            }
            else if(choice==2 && rnum==1){
               System.out.println("COMPUTER :BOMB");
               System.out.println("YOU : BUILDING ");
               System.out.println("Your building is blasted ! You died !");
               System.out.println("You LOSE !");
           cwins++;
            }
            else if(choice==3 && rnum==1){
               System.out.println("COMPUTER :BOMB");
               System.out.println("YOU : GUN ");
               System.out.println("COMPUTER is blasted !");
               System.out.println("You Win !");
               ywins++;
            }
            else if(choice==3 && rnum==2){
               System.out.println("COMPUTER :BUILDING");
               System.out.println("YOU : GUN ");
               System.out.println("Your gun is crashed !");
               System.out.println("You LOSE !");
             cwins++;  
            }
            else if(choice==-1){
                break;
            }
            else{
                System.out.println(" Invalid choice !");
            }   
        }while(choice!=-1);

        System.out.println("******RESULT *******");
        if(cwins>ywins){
            System.out.println("You lost the game by "+(cwins-ywins)+" points.");
        }
        else if(ywins>cwins){
         System.out.println("You won the game by "+(ywins-cwins)+" points.");
        }
        else{
            System.out.println(" It's a Draw !");
        }

        



    }
}