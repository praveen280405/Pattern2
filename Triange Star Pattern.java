public class TriangleStarPattern {
    public static void main(String[] args) {
        int n =5;
        int odd = 1;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-1-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=odd;k++){
                System.out.print("*");
            }
            odd+=2;
            System.out.println();
        }
    }
}
    *
   ***
  *****
 *******
*********
