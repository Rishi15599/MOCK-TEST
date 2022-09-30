public class CountDivsibleBy3and7BetweenMtoN {
    public static void main(String[] args) {
        int m=0;
        int n=100;
        int count=0;
        for(int i=m+1;i<n;i++){
            if((i%3==0)&&(i%7==0)){
                count++;
            }
        }
        System.out.println("count number divisible by 3 and 7 = "+count);

    }
}
