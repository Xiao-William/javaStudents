package dataType;


//源代码文件

public class dataType {

    //Main 是程序入口
    public  static void  main(String[] arg){

         String name  ="张三";
         //比特 bit  计算机运算的最小存储单位
         // 字节 byte 计算机数据的最小单位 文件的大小
        //1 byte = 8 bit     1KB--> 1024byte   1024KB--->1MB  1024MB--->1GB
        // java  数据类型他可以确定数据的范围


        //1.基本数据类型
        //1.1 整数类型   位数表示的是存储空间的大小
        //byte:8位
        //short:10位
        //int 32位
        //long 64位
        // TODO: 2023/9/9  含有小数点的类型就是浮点类型
        //根据计算分为  float 单精度 double 双精度
        float float1 = 12.1F;  //加个 f
        double double1 =12.1;
        // TODO: 2023/9/9  字符类型
        //连续的字符组成就是字符串
        char ch ='@';
        // TODO: 2023/9/9  布尔类型  只有两个值
        boolean t =true;
        boolean f =false;





        // TODO: 2023/9/9  基本数据 数据类型的转换
        //小的给大的  安装空间的大小转换  byte-->short ---> int --->long--->float--->double
         byte b =10;
         short s =b;
         int i =s;
         long l =i;
         float fl =l;
         double double3 =fl;


         //2引用数据类型
        // TODO: 2023/9/9   所谓的引用数据类型 可以被引用的数据类型  被引用 : String  str ="abc";  栈里的 "abc"  被 String str 引用 在内存里面     简单数据类型 没有被引用直接存储子啊堆里面


    }
}
