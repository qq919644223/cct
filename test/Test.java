package test;

import java.math.BigDecimal;
import java.util.*;

public class Test {
    private int a;
    boolean boo = true;
    private Dog dog;
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public boolean isBoo() {
        return boo;
    }

    public void setBoo(boolean boo) {
        this.boo = boo;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }


    public void pupAge(){
        BigDecimal age = new BigDecimal(21);
        BigDecimal age2 = new BigDecimal(10);
        BigDecimal dogAge = age.divide(age2).setScale(2,BigDecimal.ROUND_UP);
        BigDecimal add = age.add(age2);
        BigDecimal mu = age.multiply(age2);
        BigDecimal sub = age.subtract(age2);
        System.out.println("小狗的年龄是："+add);
    }
    public static void main (String[] args){
        Test test = new Test();
       // test.pupAge();
    //    int a = 10;
   //     int b = 10;
  //      int c = a++;//先赋值后运算
  //      int d = ++b;
       // System.out.println(c);
      //  System.out.println();

    //    String str = "Hello World!";
   //     String str2 = "Hello Java!";
   //     String str3 = str.concat(str2);
   //     System.out.println(str3);

        List<Dog> dogs = new ArrayList<>();
        Dog dog = new Dog();
        dog.setAge("12");
        dog.setName("tom");
        dogs.add(dog);

        Iterator<Dog> it = dogs.iterator();
        System.out.println(it.next());

    //    System.out.println(dogs.get(0));

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        List<String> list2 = new ArrayList<>();
        list2.add("d");
        list2.add("e");
        list2.add("f");
        list.addAll(list2);
     //  list.remove("d");
     //   list.removeAll(list2);
    //    list.retainAll(list2); //取交集
    //    list.set(0,"g");
        String[] str = (String [])list.toArray(new String[0]);


        boolean boo = list.contains("a");
        boolean boo1 = list.contains(list2);
        boolean boo2 = list.containsAll(list2);
        //System.out.println(boo);
   //     System.out.println(boo2);

        if (null != list && 0 < list.size()){

        }

     //   for (String str2 : str){
    //        System.out.println(str2);
    //    }

   //     for (int i = 0; i <list.size() ; i++) {
   //         System.out.println(list.get(i));
    //    }


        Map<String,String> map = new HashMap<>();
        map.put("a","a1");
        map.put("b","b1");
        map.put("c","c1");
        Map<String,String> map2 = new HashMap<>();
        map2.put("d","d1");
        map2.put("e","e1");
        map2.put("f","f1");

        map.putAll(map2);
        map.containsKey("a");
        System.out.println(map2.get("f"));

        /**
         * Map遍历方法
         */
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
        }

        for (String key : map.values()){
            System.out.println(key);
        }


    }



}
