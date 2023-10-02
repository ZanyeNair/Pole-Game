import java.util.ArrayList;
public class pole{
    public void checkSize(ArrayList<Integer> org, ArrayList<String> colors, int x){
        //x is the number ring they are checking
        for (int i = 0; i < colors.size(); i++){
            
            if (org.get(i)== x+1){
                System.out.print(colors.get(x) + " ");
            }
        }
    }
    public void firstPole(int[] pole1, ArrayList<Integer> org, ArrayList<String> colors){
    
        for (int i = 0; i < pole1.length; i++){
            this.checkSize(org, colors, i);
        }
        
    }
    public void secondPole(int[] pole2, ArrayList<Integer> org, ArrayList<String> colors){
        if (pole2.length == 0){
            System.out.println("This pole is empty");
        }
        else{
            for (int i = 0; i < pole2.length; i++){
                this.checkSize(org, colors, );
            }
        }
    
    }
    public void thirdPole(int[] pole3, ArrayList<Integer> org, ArrayList<String> colors){
        if (pole3.length == 0){
            System.out.println("This pole is empty");
        }
        else{
            for (int i = 0; i < pole3.length; i++){
                this.checkSize(org, colors, i);
            }
        }
        
    }
    public void checkingAllPoles(ArrayList<Integer> pole3, ArrayList<Integer> org, ArrayList<String> colors, ArrayList<Integer> pole1, ArrayList<Integer> pole2){
        System.out.print("The colors on the first pole is: ");
        this.firstPole(pole1, org, colors);
        System.out.println("\n");
        System.out.print("The colors on the second pole is: ");
        this.secondPole(pole2, org, colors);
        System.out.println("\n");
        System.out.print("The colors on the third pole is: ");
        this.thirdPole(pole3, org, colors);
    }
    public int getNumberVColor(String color){
        if (color == "red"){
            return 1;
        }
        else if(color == "orange"){
            return 2;
        }
        else if(color == "yellow"){
            return 2;
        }
        else if(color == "green"){
            return 2;
        }
        else if(color == "blue"){
            return 2;
        }
        else if(color == "purple"){
            return 2;
        }
        else{
            return 0;
        }
    }
    public boolean movePole(int[] pole3, ArrayList<Integer> org, String[] colors, int[] pole1, int[] pole2, String colorMove, int poleMove, boolean moveTrue){
        int numColor;
        numColor = this.getNumberVColor(colorMove);
        int poleStartOn;
        if (pole1[0] == numColor){
            poleStartOn = 1;
        }
        else if (pole2[0] == numColor){
            poleStartOn = 2;
        }
        else if (pole3[0] == numColor){
            poleStartOn = 3;
        }
        else{
            moveTrue = false;
            return moveTrue;
        }
        if (poleMove == 1){
            
            if(numColor == 0){
                moveTrue = false;
                return moveTrue;
            }
            if(pole1[0] > numColor){
                
            }
            return moveTrue;
        }
        else if(poleMove == 2){
            if(this.getNumberVColor(colorMove) == 0){
                moveTrue = false;
                return moveTrue;
            }
            return moveTrue;
        }
        else if(poleMove == 3){
            if(this.getNumberVColor(colorMove) == 0){
                moveTrue = false;
                return moveTrue;
            }
            return moveTrue;
        }
        else{
            moveTrue = false;
            return moveTrue;
        }
    }
    
}
