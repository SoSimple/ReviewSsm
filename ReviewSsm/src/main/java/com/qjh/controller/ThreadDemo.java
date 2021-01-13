package com.qjh.controller;
/*
* 实现多线程的方法一：继承Thread 类
* */
public class ThreadDemo extends Thread{

    @Override
    public void run() {
        //super.run();
        while(true){
            System.out.println(Thread.currentThread().getName()+"is running……");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        ThreadDemo threadDemo=new ThreadDemo();
        ThreadDemo threadDemo1=new ThreadDemo();
        /*启动当前线程*/
        threadDemo.start();
        threadDemo1.start();
        while(true){
            System.out.println(Thread.currentThread().getName()+"is run ");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
