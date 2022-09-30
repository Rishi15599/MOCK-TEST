public class DigitalProductOfNumber {
    public static void main(String[] args) {
        int a=23456;
        int product=1;
        while(a>0){
            int last=a%10;
            product=product*last;
            a=a/10;
        }
        System.out.println("Digital product = "+product);
    }
}
