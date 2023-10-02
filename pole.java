public class pole{
    public void checkSize(int[]size, String[] colors, int x){
        //x is the number ring they are checking
        for (int i = 0; i < colors.length; i++){
            
            if (size[i] == x+1){
                System.out.print(colors[x] + " ");
            }
        }
    }
    public void firstPole(int[] pole1, int[] size, String[] colors){
    
        for (int i = 0; i < pole1.length; i++){
            this.checkSize(size, colors, i);
        }
        
    }
    public void secondPole(int[] pole2, int[] size, String[] colors){
        if (pole2.length == 0){
            System.out.println("This pole is empty");
        }
        else{
            for (int i = 0; i < pole2.length; i++){
                this.checkSize(size, colors, i);
            }
        }
    
    }
    public void thirdPole(int[] pole3, int[] size, String[] colors){
        if (pole3.length == 0){
            System.out.println("This pole is empty");
        }
        else{
            for (int i = 0; i < pole3.length; i++){
                this.checkSize(size, colors, i);
            }
        }
        
    }
    public void checkingAllPoles(int[] pole3, int[] size, String[] colors, int[] pole1, int[] pole2){
        System.out.print("The colors on the first pole is: ");
        this.firstPole(pole1, size, colors);
        System.out.println("\n");
        System.out.print("The colors on the second pole is: ");
        this.secondPole(pole2, size, colors);
        System.out.println("\n");
        System.out.print("The colors on the third pole is: ");
        this.thirdPole(pole3, size, colors);
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
    public boolean movePole(int[] pole3, int[] size, String[] colors, int[] pole1, int[] pole2, String colorMove, int poleMove, boolean moveTrue){
        if (poleMove == 1){
            if(this.getNumberVColor(colorMove) == 0){
                moveTrue = false;
                return moveTrue;
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