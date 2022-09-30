public class DigitalSumAtEvenPlace {
    public static void main(String[] args) {
        int a=23456;
        int sum=0;
        int count=0;
        while(a>0){
            int last=a%10;
            count++;
            if(count%2==0){
                sum=sum+last;
            }
            a=a/10;
        }
        System.out.println(sum);
    }
}
