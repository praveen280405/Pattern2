public class NumChangingPyramid {
    public static void main(String[] args) {
        int n = 5;
        int l = 1;
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(l+" ");
                l++;
            }
            System.out.println();
        }
    }
}
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
