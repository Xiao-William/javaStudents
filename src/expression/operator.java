package expression;

public class operator {

    public static void main(String[] arg) {

        // TODO: 2023/9/9   所谓运算符就是参与 数据运算的符号 Java定义的不能定义
        //+ - * /  %   会发生类型转换 类型存储位数大的是最后的返回结果
//    byte b1 =100
//    long b2 =20;
//    int c =1000;
//    //b1 +b2  结果会int类型
//    int num =(byte) (b1+b2);  //数据强制转换
//    //二元运算符号
//    int i =true?1:2;
//    System.out.println(num);
//    char ch = 'a';//对
//
//    long  k =100L
//    int in = 16;//对
//    float d = .314F;//对
//    double result = ch + in + d;//对，等号右边的运算结果是float类型，float类型可以直接赋值给double类型
//    System.out.println(result);
        //关系表达式 结果都是布尔值
        int i = 10;
        int j = 20;
        int k = (j + 10);
        int g = 10;
        boolean bool = (g > 5) | (g < 6);
        System.out.println(bool);

    }
}




