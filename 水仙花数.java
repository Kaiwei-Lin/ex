package ex1;

public class 水仙花数 {
    public static void main(String[] args) {
        int a,b,c,sum,t;
        for(int i=100;i<1000;i++)
        {
            a=i/100;
            b=i/10-i/100*10;
            t=i/10*10;

            c=i-b*10-a*100;
            sum=a*a*a+b*b*b+c*c*c;
            if(i==sum) System.out.println(i+"\t");

        }
    }
}
