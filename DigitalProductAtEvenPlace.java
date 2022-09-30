public class DigitalProductAtEvenPlace {
    public static void main(String[] args) {
        int a=23456;
        int product=1;
        int count=0;
        while(a>0){
            int last=a%10;
            count++;
            if(count%2==0){
                product=product*last;
            }
            a=a/10;
        }
        System.out.println("digital product at even place = "+product);
    }
}
