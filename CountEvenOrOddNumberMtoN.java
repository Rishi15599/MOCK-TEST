public class CountEvenOrOddNumberMtoN {
    public static void main(String[] args) {
        int m=0;
        int n=100;
        int count1=0;
        int count2=0;
        for(int i=m;i<=n;i++){
            if(i%2==0){
                count1++;
            }
            if(i%2!=0){
                count2++;
            }
        }
        System.out.println("Total even = "+count1);
        System.out.println("Total odd = "+count2);
    }
}
