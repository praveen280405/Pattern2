public class kpattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            for (int j=0;j<=i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
* * * * * 
* * * * 
* * * 
* * 
* 
* * 
* * * 
* * * * 
* * * * * 
