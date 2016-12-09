/**
 * Created by em on 9/12/16.
 */
public class Triangle {
    public static void main(String[] args) {
        int n = 8;
        int j;
        for (int i=0; i<n; i++){
            for (j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
