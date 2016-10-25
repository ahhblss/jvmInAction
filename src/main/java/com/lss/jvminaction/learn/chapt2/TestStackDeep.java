package com.lss.jvminaction.learn.chapt2;

/**
 * Created by Sean.liu on 2016/10/25.
 */
public class TestStackDeep {
    private static int count = 0;

    /**
     * 局部变量少的函数可以支持更深的函数调用
     */
    public static void recursion()
    {
        //count =2702
        count++;
        System.out.println("deep of calling:"+count);
        recursion();

    }

    public static void recursion(long a,long b,long c){
        //count=800
        long e =1,f =2,g = 3,d = 5,h = 6,i = 7,x = 10,y =11,z=12;
        System.out.println("deep of calling:"+count);
        count++;
        recursion(a,b,c);
    }


    public static void main(String[] args) {
        try {
//            recursion();
            recursion(0,0,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
