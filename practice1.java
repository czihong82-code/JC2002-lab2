package Practice;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //获取用户输入两个整数
        System.out.print("请输入第一个整数：");
        int start = sc.nextInt();

        System.out.print("请输入第二个整数：");
        int end = sc.nextInt();

        //条件判断:start大于end输入错误
        if (start > end) {
            System.out.println("输入错误");
        } else {
            int sum = 0;
            //循环从start到end增加
            for (int i = start; i < end; i++) {
                sum = sum + i;
            }
            System.out.println("从" + start + "到" + end + "的和为：" + sum);
        }
    }
}
