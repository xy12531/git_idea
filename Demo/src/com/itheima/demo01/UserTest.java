package com.itheima.demo01;

/**
 * - 创建三个User对象,属性分别为:"刘备" 39,"关羽" 35,"张飞" 34.
 * - 将三个对象存入到User数组中(初始化方式不限)
 * - 定义方法 public static int getMinAgeInUserArr(User[] userArr)返回User数组中最小的年龄是多少.
 */
public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("刘备", 39);
        User user2 = new User("关羽", 35);
        User user3 = new User("张飞", 34);

        User[] userArr = {user1, user2, user3};

        System.out.println("数组中最小的年龄是" + getMinAgeInUserArr(userArr));
    }

    private static int getMinAgeInUserArr(User[] userArr) {
        int minAge = userArr[0].getAge();
        for (int i = 1; i < userArr.length; i++) {
            if (minAge>userArr[i].getAge()) {
                minAge = userArr[i].getAge();
            }
        }
        return minAge;
    }
}
