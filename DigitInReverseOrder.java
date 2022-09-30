public class DigitInReverseOrder {
    public static void main(String[] args) {
        int a=23456;
        while(a>0){
            int last=a%10;
            System.out.print(last);
            a=a/10;
        }
    }
}
