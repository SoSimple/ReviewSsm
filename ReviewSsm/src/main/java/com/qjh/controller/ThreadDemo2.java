package com.qjh.controller;

/**
 * 通过实现Runnable接口实现多线程
 *
 * 实现Runnable接口比继承Thread类所具有的优势
 *1、适合多个相同的程序代码的线程去处理同一资源
 *2、可以避免java中单继承的限制
 *3、增加程序的健壮性，代码可以被多个线程共享、代码和数据独立
 *4、线程池只能放入实现Runnable或Callable类线程，不能直接放入继承Thread的类
 */
public class ThreadDemo2 implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println(Thread.currentThread().getName()+"is run");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Runnable ThreadDemo2 = new ThreadDemo2();

        new Thread(ThreadDemo2).start();
        new Thread(ThreadDemo2).start();
        new Thread(ThreadDemo2).start();

        while(true){
            System.out.println(Thread.currentThread().getName()+"is run");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
