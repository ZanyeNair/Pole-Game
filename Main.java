import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Purple"};
        int[] size = {1, 2, 3, 4, 5, 6};
        int[] pole1 = {1, 2, 3, 4, 5, 6};
        int[] pole2 = {};
        int[] pole3 = {};

        //This is a game with 3 poles. You have to sort the rings without putting a big one above a small one. The objective is 
        pole pole = new pole();
        System.out.print("The colors that you are starting with is: ");
        for( int i = 0; i< size.length; i++){
            
            pole.checkSize(size, colors, i);
        }
        System.out.println("\nThe order of size is red being the smallest and purple being the biggest. The objective of the game is to get all the rings on pole 3 in order.");

        pole.checkingAllPoles(pole3, size, colors, pole1, pole2);
        boolean boo = true;
        boolean moveTrue = true;
        while(boo == true){
            System.out.print("Which color ring would you like moved to: ");
            String colorMove = in.nextLine();
            colorMove = colorMove.toLowerCase();
            System.out.print("Which pole number would you like it to get moved to: ");
            int poleMove = in.nextInt();
            moveTrue = pole.movePole(pole3,size,colors,pole1, pole2,colorMove,poleMove,moveTrue);
            if (moveTrue){
                System.out.println("The current state of the pole is");
                pole.checkingAllPoles(pole3, size, colors, pole1, pole2);
            }
            else{
                System.out.println("This move is not legal");
            }

        }

        



    }
}