public class XToPowerN {
    public static void main(String[] args) {
        int x=4;
        int n=5;
        int power=1;
        for(int i=1;i<=n;i++){
            power=power*x;
        }
        System.out.println("X to power N = "+power);
    }
}
