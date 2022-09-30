public class CountTheDigitOfNumber {
    public static void main(String[] args) {
        int a=2345678;
        int count=0;
        while(a>0){
            count++;
            a=a/10;
        }
        System.out.println("number of digit = "+count);
    }
}
