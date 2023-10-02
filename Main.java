import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("orange");
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");
        colors.add("purple");
        ArrayList<Integer> org = new ArrayList<Integer>();
        org.add(1);
        org.add(2);
        org.add(3);
        org.add(4);
        org.add(5);
        org.add(6);

        ArrayList<Integer> pole1 = new ArrayList<Integer>();
        pole1.add(1);
        pole1.add(2);
        pole1.add(3);
        pole1.add(4);
        pole1.add(5);
        pole1.add(6);
        ArrayList<Integer> pole2 = new ArrayList<Integer>();
        ArrayList<Integer> pole3 = new ArrayList<Integer>();
        

        //This is a game with 3 poles. You have to sort the rings without putting a big one above a small one. The objective is 
        pole pole = new pole();
        System.out.print("The colors that you are starting with is: ");
        for( int i = 0; i< org.size(); i++){
            
            pole.checkSize(org, colors, i);
        }
        System.out.println("\nThe order of size is red being the smallest and purple being the biggest. The objective of the game is to get all the rings on pole 3 in order.");

        pole.checkingAllPoles(pole3, org, colors, pole1, pole2);
        boolean boo = true;
        boolean moveTrue = true;
        while(boo == true){
            System.out.print("Which color ring would you like moved to: ");
            String colorMove = in.nextLine();
            colorMove = colorMove.toLowerCase();
            System.out.print("Which pole number would you like it to get moved to: ");
            int poleMove = in.nextInt();
            moveTrue = pole.movePole(pole3,org,colors,pole1, pole2,colorMove,poleMove,moveTrue);
            if (moveTrue){
                System.out.println("The current state of the pole is");
                pole.checkingAllPoles(pole3, org, colors, pole1, pole2);
            }
            else{
                System.out.println("This move is not legal");
            }

        }

        



    }
}
