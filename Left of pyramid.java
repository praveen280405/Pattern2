public class LeftOfPyramid {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    *
   **
  ***
 ****
*****
