package com.liuheng.project01;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        System.out.println("************欢迎来到学生管理系统************");
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> al = new ArrayList<>();
        loop: while (true) {
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择：");
            String str = sc.next();
            switch (str) {
                case "1" -> addStudent(al);
                case "2" -> deleteStudent(al);
                case "3" -> setStudent(al);
                case "4" -> getStudent(al);
                case "5" -> {
                    System.out.println("系统退出！");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    public static void addStudent(ArrayList<Student> al) {
        Scanner sc = new Scanner(System.in);

        String id = "";
        while (true){
            System.out.println("请输入学生id:");
            id = sc.next();
            boolean flag = checkId(al, id);
            if(flag) {
                System.out.println("当前学生id已经存在!");
            }else {
                break;
            }
        }

        System.out.println("请输入学生姓名:");
        String name = sc.next();

        System.out.println("请输入学生年龄:");
        int age = sc.nextInt();

        Student stu = new Student(id, name, age);
        al.add(stu);
    }

    public static void getStudent(ArrayList<Student> al) {
        System.out.println("查询学生");
        if(al.size() == 0){
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }

        System.out.println("id\t\t姓名\t\t年龄");
        for (Student stu : al) {
            System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t\t" + stu.getAge());
        }
    }

    public static void setStudent(ArrayList<Student> al) {
        System.out.println("请输入学生id：");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int index = checkIndex(al, id);

        if(index == -1) {
            System.out.println("学生id不存在!");
            return;
        }

        Student stu = al.get(index);

        System.out.println("请输入学生姓名:");
        String name = sc.next();
        stu.setName(name);

        System.out.println("请输入学生年龄:");
        int age = sc.nextInt();
        stu.setAge(age);
    }

    public static void deleteStudent(ArrayList<Student> al) {
        System.out.println("请输入学生id：");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();

        for (int i = 0; i < al.size(); i++) {
            String sId = al.get(i).getId();
            if(sId.equals(id)){
                al.remove(i);
                System.out.println("删除学生信息成功");
                return;
            }
        }
        System.out.println("学生id不存在！");
    }

    public static boolean checkId(ArrayList<Student> al, String id) {
        for (int i = 0; i < al.size(); i++) {
            String sId = al.get(i).getId();
            if(sId.equals(id)){
                return true;
            }
        }
        return false;
    }

    public static int checkIndex(ArrayList<Student> al, String id) {
        for (int i = 0; i < al.size(); i++) {
            String sId = al.get(i).getId();
            if(sId.equals(id)){
                return i;
            }
        }
        return -1;
    }
}
