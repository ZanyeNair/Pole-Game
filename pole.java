public class pole{
    public void checkSize(int[]size, String[] colors, int x){
        //x is the number ring they are checking
        for (int i = 0; i < colors.length; i++){
            if (size[i] == x){
                System.out.println("The color is " + colors[x]);
            }
        }
    }
}