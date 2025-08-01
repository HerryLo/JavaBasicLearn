package com.liuheng.object03;

public class Test {
    public static void main(String[] args) {
        Student[] stuArr = new Student[3];

        Student stu1 = new Student("1231","小明",10);
        Student stu2 = new Student("5442","小民",9);
        Student stu3 = new Student("7892","小敏",10);

        stuArr[0] = stu1;
        stuArr[1] = stu2;
        stuArr[2] = stu3;

        Student stu4 = new Student("7894","小天",10);
        if(checkStudentId(stuArr, stu4.getId())) {
            System.out.println("当前学生id已存在");
        }else {
            int count = getCount(stuArr);
            if(count == stuArr.length) {
                Student[] newStuArr = createNewArray(stuArr);
                newStuArr[count] = stu4;
                for(Student stu:newStuArr){
                    showStudenInfo(stu);
                }
            }else{
                stuArr[count] = stu4;
                for(Student stu:stuArr){
                    showStudenInfo(stu);
                }
            }
        }
    }

    public static void showStudenInfo(Student stu) {
        System.out.println(stu.getId()+","+stu.getName()+","+stu.getAge());
    }

    public static Student[] createNewArray(Student[] arr) {
        Student[] newArr = new Student[arr.length+1];
        for(int i=0;i<arr.length;i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static int getCount(Student[] arr) {
        int count = 0;
        for (Student stu:arr){
            if(stu != null) {
                count++;
            }
        }
        return count;
    }

    public static boolean checkStudentId(Student[] arr, String id){
        boolean flag = false;
        for(Student stu:arr){
            if(stu != null){
                if(stu.getId() == id){
                    flag = true;
                }
            }
        }
        return flag;
    }
}
