import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        new int[] arr = {1,2,3};
        Methods n = new Methods;
        System.out.println(n.dup(arr));
    }
}

class Methods{
    
    public int[] dup(int[] arr){
        int size = arr.size();
        int[] dup = new int[(2*size)];
        for (int i = 0; i < size; i++){
            dup[i*2] = arr[i];
            dup[i*2+1] = arr[i];
        }
        return dup;
    }

}