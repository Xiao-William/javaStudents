package OOP;

public class oopProps {
    public static void main(String[] args) {
        // TODO: 2023/9/9  1.声明类
        // TODO: 2023/9/9  2.创建对象的语法
        Cooking cooking = new Cooking();
        cooking.name = "红烧排骨";
        cooking.execute();

    }
}

class Cooking {
    String name;
    String type = "红烧";
    String relish = "大料";

//    执行
    void  execute(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.relish);
    }
}