package com.qjh.controller;

/**
 * 通过实现Runnable接口实现多线程
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
