public class EvenNumberBetweenMtoN {
    public static void main(String[] args) {
        int m=0;
        int n=100;
        for(int i=m+1;i<n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
