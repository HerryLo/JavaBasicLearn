package com.javabase01.apitest;

public class CloneUser implements Cloneable  {
    private String name;
    private String password;
    private String path;
    private int[] data;

    public CloneUser() {}

    public CloneUser(int[] data, String name, String password, String path) {
        this.data = data;
        this.name = name;
        this.password = password;
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    // 重写Object中的toString方法
    public String toString() {
        return "用户名称："+name+"，密码："+password+"，图片地址："+path+"，进度数据："+arraytoString(data);
    }

    private String arraytoString(int[] data) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < data.length; i++) {
            if(i == data.length-1) {
                sb.append(data[i]);
            }else {
                sb.append(data[i]+",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
