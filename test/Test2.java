package test;

import java.util.Arrays;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
      //  sort();
     //  delete();
      //  sort2();
      //  name();
     //   division();
       Calculation();
    }

    /**
     * 数组排序：{1,23,6,74,8,19,104} 按 从小到大排序。
     */
    public static void sort() {
        int[] array = {1, 23, 6, 74, 8, 19, 104};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    /**
     * 数组{1,2,3,4,5,5,5,5,5,6,7,8,9}，去掉数组中的5 生成新的数组。
     */
    public static void delete() {
        int[] array = {1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8, 9};
        int j = 0;
        int[] array2 = new int[8];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 5) {
                array2[j] = array[i];
                j++;
            }
        }
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     *数字 a{1,3,5,7,9}  b{2,4,6,8,10},将两个数组合并，并按照从小到大的顺序排序，生成新数组。
     */
     public static void sort2(){
       int []a = {1, 3, 5, 7, 9};
       int []b = {2, 4, 6, 8, 10};
       int []c = new int[10]; //新数组
       int count = 0;
         for (int i = 0; i < a.length; i++) {//将第一个数组存入新数组
             c[count]=a[i];
             count++;
         }
         for (int i = 0; i < b.length; i++) {//将第二个数组存入新数组
             c[count]=b[i];
             count++;
         }
         for (int i = 0; i < c.length; i++) {
             for (int j = 0; j < c.length - i - 1; j++) {
                 if (c[j] > c[j + 1]) {
                     int temp = c[j];
                     c[j] = c[j + 1];
                     c[j + 1] = temp;
                 }
             }
         }
         for (int num : c) {
             System.out.print(num + " ");
         }
         System.out.println();
     }


    /**
     * 字符串：“Hello World!”，在字符串前面拼接自己的名字。
     */
    public static void name() {
        String str = "Chen chaotao ";
        String str2 = "Hello World!";
        String str3 = str.concat(str2);
        System.out.println(str3);

    }

    /**
     * 字符串“1,2,3,4,5,6,7”，根据“，”分开，将其转化为字符串数组，并在控制台打印。
     */
    public static void division() {
        String str = "1,2,3,4,5,6,7";
        String[] str2 = str.split(",");
        for (String s : str2) {
            System.out.println(s);
        }
        System.out.println();
    }


    /**
     * 计算Hello World! 中出现了几次l。
     */
    public static void Calculation() {
        String str = "Hello World!";
        int count = str.length()-str.replaceAll("l","").length();
        //将字符串中所有l移除，判断前后字符串长度差即可知道l出现次数。
        System.out.println(count);
    }
}