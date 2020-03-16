package test;

public class Test1 {
    public static void main(String[] args) {


         add();
         multiplication();
        singular();
        primeNumber();
    }


    /**
     *1.写出计算1+2+3+···+100的和的代码
     * @param
     * @return
     */
    public static void add(){
        int i ;
        int sum = 0;
        for (i = 1;i <= 100;i++){
            sum+=i;
        }
        System.out.println(sum);

    }

    /**
     * 2.写出在控制台打印九九乘法表的代码。
     */
    public static void multiplication(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
           System.out.print(j+"*"+i+"="+i*j+"\t");

            }
            System.out.println();
        }
    }

    /**
     * 3.写出打印1-100所有整数中的单数的代码
     */
    public static void singular(){
        for (int i = 1; i <= 100; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
    }

    /**
     * 4.写出打印101-200只有的所有素数，并求出所素数的和的代码。
     */
    public static void primeNumber(){
         int flag;
         int sum = 0;
        for (int i = 101; i <= 200 ; i++) {
           flag = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    flag=0;
                    break;
                }
            }
            if (flag == 1){
                System.out.print(i+" ");
                sum+=i;
            }
        }
        System.out.println();
        System.out.println("素数和为"+sum);
    }
}
