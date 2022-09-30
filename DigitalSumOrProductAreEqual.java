public class DigitalSumOrProductAreEqual {
    public static void main(String[] args) {
        int a=23456;
        int sum=0;
        int product=1;
        while(a>0){
            int last=a%10;
            sum=sum+last;
            product=product*last;
            a=a/10;
        }
        
        if(sum==product){
            System.out.println("equal");
        }else{
            System.out.println("Not equal");
        }
    }

}
