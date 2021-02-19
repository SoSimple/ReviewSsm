package com.qjh.java.string;

import java.util.*;

public class StringReview {

    //intern

    /**
     * java 为了避免在一个系统中大量产生的String 对象，于是就设计了一个字符串池
     * 在字符串池中所容纳的都是String字符串对象，它的创建机智是这样的：创建一个字符串
     * 时。首先检查池中是否又字面值相等的字符串，如果有，则不再闯将，直接返回池中该对象
     * 的引用，若没有则创建之，然后放到池中，并返回新建对象的引用，这个池和我们平常所说
     * 的池概念非常相似。
     * 为什么使用new String("test")就不相等了？因为直接生命一个String对象是不检查
     * 字符串池的，也不会把对象放到池中，那么== 就无法判断
     * 为什么使用intern方法处理后就又相等了？因为intern会检查当前的对象池中是否有字面值
     * 相同的引用对象，如果有则返回池中对象，如果没有则放置在对象池中，并返回当前对象。
     */
    public static void testIntern(){
        String s1="This Is My Test";
        String s2="this is my test";

        String s3 = new String("This Is My Test");
        String s4 = new String("this is my test");

        System.out.println("s1==s2:"+s1==s2);
        System.out.println("equals:"+s1.equals(s2));

        System.out.println("s1==s3"+s1==s3);
        System.out.println("equals:"+s1.equals(s3));

        System.out.println("intern1"+s1.intern()==s3);
        System.out.println("intern2"+s1.intern().equals(s3));
        System.out.println("intern3"+s1.intern()==s3.intern());

    }

    /**
     * 自增的陷阱：i++是一个表达式，是有返回值的，它的返回值就是i自加前的值，Java对自加是这样处理的
     * 首先把的值，拷贝到一个临时变量区，然后对i变量加1，最后返回临时变量区的值。程序第一次
     * 循环时的详细处理步骤如下：i
     * 1 JVM 把i值（其值是0）拷贝到临时变量区
     * 2 i值加1，这时候i的值是1
     * 3 返回临时变量区的值，注意这个值是0，没修改过
     * 4 返回值赋值给i，此时i值被重置为0
     */
    public static void testAutoAdd(){
        int i=0;
        for (int j = 0; j <10; j++) {
            System.out.println("before add"+i);
            i++;
            System.out.println("for内"+i);
        }
        System.out.println("for后"+i);

        int k=0;
        for (int j = 0; j <10; j++) {
            System.out.println("before add"+k);
            k=k++;
            System.out.println("for内"+k);
        }
        System.out.println("for后"+k);
    }

    /**
     * 三元运算符的类型务必一致
     * 三元操作符类型的转换规则：
     * 1、若两个操作数不可转换，则不做转换，返回值为object类型
     * 2、若两个操作数是明确类型的表达式，则按照正常的二进制数字来转换，int类型转换
     * 为long类型，long类型转换为float类型等
     * 3、若两个操作数中有一个是数字S，另外一个是表达式，且其类型标示为T,那么，若
     * 数字S在T的范围内，则转换为T类型；若S超出了T类型的范围，则T转换为S类型
     */
    public static void testList(){
        ArrayList<String> list1 = new ArrayList<String>();

        ArrayList<String> list2 = new ArrayList<String>();

        list1.add("A");
        list1.add("B");

        list2.add("B");
        list2.add("C");

        //无重复的并集
        //删除在list1中出现的元素
        list2.removeAll(list1);
        list1.addAll(list2);

        Collections.shuffle(list1);
        for (int i = 0; i <list1.size(); i++) {
            System.out.println("并集-无重复"+list1.get(i));
        }
        //并集
        list1.addAll(list2);
        for (int i = 0; i <list1.size(); i++) {
            System.out.println("并集"+list1.get(i));
        }
        //交集
        list1.retainAll(list2);
        for (int i = 0; i <list1.size(); i++) {
            System.out.println("交集"+list1.get(i));
        }
        //差集
        list1.removeAll(list2);
        for (int i = 0; i <list1.size(); i++) {
            System.out.println("差集"+list1.get(i));
        }
    }

    /**
     * 遍历HashMap 集合
     */
    static void testHashMap(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"A");
        hashMap.put(2,"B");
        hashMap.put(3,"C");
        hashMap.put(4,"D");

        System.out.println("1、通过keySet 遍历key  再通过key 二次取值得到value");
        //1、通过keySet 遍历key  再通过key 二次取值得到value
        for (int key:hashMap.keySet()
             ) {
            System.out.println("key:"+key+" value:"+hashMap.get(key));
        }

        System.out.println("2、通过迭代器遍历集合");
        //2、通过迭代器遍历集合
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println("key:"+ next.getKey()+" value:"+ next.getValue());
        }
        System.out.println("3、通过 Map.Entry遍历key value");
        //3、通过 Map.Entry遍历key value  当数据量特别大的时候优先使用这种
        for (Map.Entry<Integer,String> entry:
             hashMap.entrySet()) {
            System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
        }
        System.out.println("4、通过values 遍历value 但是不能遍历key");
        //4、通过values 遍历value 但是不能遍历key
        for (String value:hashMap.values()
             ) {
            System.out.println("value:"+value);
        }

    }

    /**
     * 遍历list集合
     */
    static void traversalList(){

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        System.out.println("通过for循环遍历");
        //通过for循环遍历
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("通过增强for遍历");
        //通过增强for遍历
        for (String s:
             arrayList) {
            System.out.println(s);
        }
        System.out.println("使用迭代器遍历集合");
        //使用迭代器遍历集合
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }



    public static void main(String[] args) {
        //testIntern();
        //testAutoAdd();
        //testList();
        //testHashMap();
        traversalList();
    }
}
