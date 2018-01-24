package org.spring.springbase;

import javafx.scene.paint.Stop;

/**
 * @Author:gaoty
 * @created 2017/12/25 20:58
 **/


public class ExceptionTest {
    public int test1(){
        int devider = 10;
        int result = 100;
        try{
            while(devider>-1){
                devider--;
                result = result+100/devider;
            }
            return result;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("异常抛出了！！！！！");
            System.out.println("异常抛出了！！！！！");
            System.out.println("异常抛出了！！！！！");
            System.out.println("异常抛出了！！！！！");
            System.out.println("异常抛出了！！！！！");
            System.out.println("异常抛出了！！！！！");
            return -1;
        }
    }
    public int test2(){
        int devider = 10;
        int result = 100;
            while(devider>-1){
                devider--;
                result = result+100/devider;
            }
            return result;
    }
    public int test3(){
        int devider = 10;
        int result = 100;
        try{
            while(devider>-1){
                devider--;
                result = result+100/devider;
            }
            return result;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("异常抛出了！！！！！");
            System.out.println("异常抛出了！！！！！");
            System.out.println("异常抛出了！！！！！");
            System.out.println("异常抛出了！！！！！");
            System.out.println("异常抛出了！！！！！");
            System.out.println("异常抛出了！！！！！");
            return 999;
        }finally {
            System.out.println("这是finnally！！！！！！");
            System.out.println("result的值：" + result);
            return result;
        }

    }




    public static void main(String args[]){
        ExceptionTest t1 = new ExceptionTest();
        //System.out.println("test1方法执行完毕！result的值为："+t1.test1());
        //System.out.println("test1方法执行完毕！result的值为："+t1.test2());
        System.out.println("test3方法执行完毕！result的值为："+t1.test3());
    }
}
