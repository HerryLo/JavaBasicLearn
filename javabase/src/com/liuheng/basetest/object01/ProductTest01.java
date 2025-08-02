package com.liuheng.basetest.object01;

public class ProductTest01 {
    public static void main(String[] args) {
        Product pro = new Product(12312312,"洗发水",68,100);
        Product pro1 = new Product(67567578,"水杯水",40,90);
        Product pro2 = new Product(43534576,"热水壶",90,30);

        Product[] arr1 = new Product[3];

        arr1[0] = pro;
        arr1[1] = pro1;
        arr1[2] = pro2;
        System.out.println("id \t\t\t 名称 \t 价格 \t 数量");
        for (Product product : arr1) {
            product.getShowInfo();
        }
    }
}
