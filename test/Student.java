package test;
/**
 * 学生实体类
 * chenchaotao
 * 2020-03-04 17:20
 */

public class Student {
    /**
     * 学生姓名
     */
    private String name;
    /**
     * 学生年龄
     */
    private int age;

    public Student(String name, int age, int grade, String stuclass) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.stuclass = stuclass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getStuclass() {
        return stuclass;
    }

    public void setStuclass(String stuclass) {
        this.stuclass = stuclass;
    }

    /**
     * 学生成绩
     */
    private int grade;
    /**
     * 学生班级
     */
    private String stuclass;

}
