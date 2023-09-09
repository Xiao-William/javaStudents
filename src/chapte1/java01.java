package chapte1;

//源代码文件

public class java01 {

    //Main 是程序入口
    public  static void  main(String[] arg){

        String str2="abc";
        String str1=  "abc" ;
        System.out.println(str1==str2);//true
        //变量使用 变量声明 变量初始化  变量使用
        // 变量声明 和变量初始化可以写一起  String name="张三";
        // TODO: 2023/9/9 标识符 标识数据的符号  就是标识符  用于起名


        String name;
        name="张三";
        System.out.printf(name);
        // TODO: 2023/9/9   标识符命名规则
         String username="张山";
        // TODO: 2023/9/9  符号只有 $ 和 _ 能够使用
        String _name="标识符";
        String $name="表示啊撒旦";
    }
}
