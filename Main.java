public class Main{
    
    public static void main(String[] args) {
        String[] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Purple"};
        int[] size = {1, 2, 3, 4, 5, 6};
        int[] pole1;
        int[] pole2;
        int[] pole3;

        //This is a game with 3 poles. You have to sort the rings without putting a big one above a small one
        pole pole = new pole();

        pole.checkSize(size, colors, 2);

    }
}