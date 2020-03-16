package test;

import java.util.*;

    /**
     * 练习3
     * chenchaotao
     * 2020-03-04 17:20
     */
public class Test3
{
    public static void main(String[] args) {
        /**
         * 建立一个实体类Student类，属性：姓名，年龄，成绩，班级
         * 建立一个list1，包含 “张三，18岁，80分，1班”，“李四，19岁，100分，1班”，“王五，17岁，59分，1班”。
         */
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("张三",18,80,"1班"));
        list1.add(new Student("李四",19,100,"1班"));
        list1.add(new Student("王五",17,59,"1班"));

        /**
         * 建立一个list2，包含 “赵六，18岁，85分，2班”，“刘七，19岁，93分，2班”，“孙八，17岁，55分，2班”。
         */
        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("赵六",18,85,"2班"));
        list2.add(new Student("刘七",19,93,"2班"));
        list2.add(new Student("孙八",17,55,"2班"));

        /**
         * 整合两个list学生信息成一个新的list
         */
        List<Student> list3 = new ArrayList<>();
        list1.addAll(list2);
        list3 = list1;
        for (int i = 0; i < list3.size(); i++) {
          //  System.out.println(list1.get(i).getName()+","+list1.get(i).getAge()+"岁,"+list1.get(i).getGrade()+"分,"+list1.get(i).getStuclass());
        }

        /**
         * 按照分数给出学生信息排名
         */
        for (int i = 0; i < list3.size(); i++) {
            for (int j = 0; j < list3.size()-i-1; j++) {
                if (list1.get(j).getGrade() < list3.get(j+1).getGrade()) {
                    Student stu = list3.get(j);
                    list3.set(j,list3.get(j+1));
                    list3.set(j+1,stu);
                }
            }
        }
        for (int i = 0; i < list3.size(); i++) {
         //   System.out.println(list3.get(i).getName()+","+list3.get(i).getAge()+"岁,"+list3.get(i).getGrade()+"分,"+list3.get(i).getStuclass());
        }

        /**
         * 按照分数给出学生信息排名
         */
        Collections.sort(list3,new StudentComparetor());
        for (int i = 0; i < list3.size(); i++) {
     //       System.out.println(list3.get(i).getName()+","+list3.get(i).getAge()+"岁,"+list3.get(i).getGrade()+"分,"+list3.get(i).getStuclass());
        }


        /**
         * 输出不及格的学生信息
         */
        for (int i = 0; i < list3.size(); i++) {
            if (list3.get(i).getGrade()<60){
                //System.out.println(list3.get(i).getName()+","+list3.get(i).getAge()+"岁,"+list3.get(i).getGrade()+"分,"+list3.get(i).getStuclass());

            }
        }

        /**
         * 查找张三的信息
         */
        for (int i = 0; i < list3.size(); i++) {
            if ("张三".equals(list3.get(i).getName())){
   //          System.out.println(list3.get(i).getName()+","+list3.get(i).getAge()+"岁,"+list3.get(i).getGrade()+"分,"+list3.get(i).getStuclass());
            }
        }

        /**
         * 从list剔除年龄大于18岁的学生信息
         */
        for (int i = 0; i < list3.size(); i++) {
           if (list3.get(i).getAge()>18){
               list3.remove(i);
               /**
                * 当移除元素时，集合中的元素会往前缩进，下标改变，因此需要减回去
                */
               i--;
           }
        }
        for (int i = 0; i < list3.size(); i++) {
        //   System.out.println(list3.get(i).getName()+","+list3.get(i).getAge()+"岁,"+list3.get(i).getGrade()+"分,"+list3.get(i).getStuclass());
        }


        /**
         * 使用Map 完成练习1的习题
         */
        Map<Integer,Student> map = new TreeMap<>();
        map.put(1,new Student("张三",18,80,"1班"));
        map.put(2,new Student("李四",19,100,"1班"));
        map.put(3,new Student("王五",17,59,"1班"));
        Map<Integer,Student> map1 = new HashMap<>();
        map1.put(4,new Student("赵六",18,85,"2班"));
        map1.put(5,new Student("刘七",19,93,"2班"));
        map1.put(6,new Student("孙八",17,55,"2班"));

        /**
         * 整合两个list学生信息成一个新的list
         */
        map.putAll(map1);

        for (Map.Entry<Integer,Student> entry : map.entrySet()){
        //    System.out.println(entry.getValue().getName()+","+entry.getValue().getAge()+"岁,"+entry.getValue().getGrade()+"分,"+entry.getValue().getStuclass());
        }


        /**
         * 按照分数给出学生信息排名
         */
        List<Map.Entry<Integer, Student>> list = new ArrayList<>(map.entrySet());
        /**
         *将map转成list，再用比较器进行比较
         */

        Collections.sort(list,new GradeComparetor());
        for (Map.Entry<Integer,Student> entry : list){
         //     System.out.println(entry.getValue().getName()+","+entry.getValue().getAge()+"岁,"+entry.getValue().getGrade()+"分,"+entry.getValue().getStuclass());
        }

        /**
         * 输出不及格的学生信息
         */
        for (int i = 1; i <= map.size() ; i++) {
            if (map.get(i).getGrade()<60){
          //     System.out.println(map.get(i).getName()+","+map.get(i).getAge()+"岁,"+map.get(i).getGrade()+"分,"+map.get(i).getStuclass());
            }
        }

        /**
         * 查找张三的信息
         */
        for (int i = 1; i <= map.size() ; i++) {
            if ("张三".equals(map.get(i).getName())){
             //   System.out.println(map.get(i).getName()+","+map.get(i).getAge()+"岁,"+map.get(i).getGrade()+"分,"+map.get(i).getStuclass());
            }
        }

        /**
         * 从map剔除年龄大于18岁的学生信息
         */
        for (int i = 1; i <= map.size(); i++) {
            if (map.get(i).getAge()>18){
                map.remove(i);
            }
        }
        for (Map.Entry<Integer,Student> entry : map.entrySet()){
       //     System.out.println(entry.getValue().getName()+","+entry.getValue().getAge()+"岁,"+entry.getValue().getGrade()+"分,"+entry.getValue().getStuclass());
        }

    }


}
