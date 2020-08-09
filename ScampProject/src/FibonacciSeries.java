public class FibonacciSeries {
    public static void main(String [] args){
        int s= 100;
        int p=0, q=1;
        System.out.println( "The fibbonaci sequence of " + s + " is : ");
        for (int i=1; i<=s;i++){
            System.out.print(p + "+");
            int sum = p + q;
            p=q;
            q=sum;

        }
        //System.out.println(n);
    }
}
