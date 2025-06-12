// public class SxtStu {
//     //属性 静态特征
//     int id ;
//     int age;
//     String sname;
//     //方法 行为特征
//     public  void study(){
//         System.out.println("study");
//     }
//     public  void kickball(){
//         System.out.println("kickball");
//     }
//     public  static void main(String[] args){
//         SxtStu s1 = new SxtStu();//地址给s1
//         System.out.println(s1.id);
//         System.out.println(s1.sname);
//         s1.id =10;
//         s1.sname = "zhangsan";
//         System.out.println(s1.id);
//         System.out.println(s1.sname);
//     }
// }


// public class Point {
//     double x,y;
//     Point(double _x,double _y){
//         x = _x;
//         y =_y;
//     }
//     public double getDistance(Point p){
//         double d = Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
//         return d;
//     }
//     public static void main(String[] args){
//         Point p1 = new Point(3.5,5.6);
//         Point origin = new Point(4.5,6.6);
//         System.out.println(p1.getDistance(origin));
//     }
// }


// public class TestThis {
//     int a,b,c;
//     TestThis(){
//         System.out.println("正要初始化的对象"+this);
//     }
//     TestThis(int a,int b){
//         //TestThis();//无法调用上面的构造方法
//         this();//调用无参构造器，必须位于第一行
//         this.a=a;
//         this.b=b;

//     }
//     TestThis(int a,int b,int c){
//         this(a,b);//调用带参的构造器，必须位于第一行
//         this.c=c;
//     }

//     public static void main(String[] args){
//         TestThis hi = new TestThis(2,3);
//     }
// }


// public class TestStatic {
//     int id;
//     String name;
//     String pwd;
//     static String company = "BJ";
//     public TestStatic(int id,String name){
//         this.id=id;
//         this.name=name;
//         System.out.println(id + name);
//         System.out.println(name);
//     }
//     public void login(){
//         System.out.println(name);
//     }
//     public static void printCompany(){
//        // login();//Non-static method 'login()' cannot be referenced from a static context,调用非静态成员，编译就会报错
//         System.out.println(company);
//     }
//     public static void main(String[] args){
//         TestStatic u = new TestStatic(101,"吴");
//         TestStatic.printCompany();

//     }
// }


// public class TestExtends {
//     public static void main (String[] args) {
//         Student s1 = new Student("wu", 180, "化学");
//         s1.learn();
//         s1.rest();
//         System.out.println(s1 instanceof Student);
//         //二元运算符，左边是对象，右边是类,当对象是右面类或子类所创建对象时，返回 true；否则，返回 false
//         System.out.println(s1 instanceof Person);
//         // System.out.println(s1 instanceof boy);

//     }
// }
// class Person extends Object{
//     String name;
//     int height;
//     public void rest(){
//         System.out.println("rest");
//     }
// }
// class Student extends Person{
//     String major;
//     public void learn(){
//         System.out.println("learn");
//         rest();//继承person类里的rest
//         System.out.println(this.name + this.height + this.major);
//     }
//     public Student(String name,int height,String major){
//         this.name=name;
//         this.height=height;
//         this.major=major;
//     }
// }



// public class TestOverRide {
//     public static void main(String[] args){
//         Horse h = new Horse();
//         Plane p = new Plane();
//         h.run();
//         h.getVehicle();
//         p.run();
//     }

// }
// class Vehicle{
//     public void run(){
//         System.out.println("run...");
//     }
//     public Vehicle getVehicle(){
//         System.out.println("给你一个交通工具！");
//         return null;
//     }
// }
// class Horse extends Vehicle{
//     @Override
//     public void run() {
//         System.out.println("dididi");
//     }

//     @Override
//     public Vehicle getVehicle() {
//         return new Horse();
//     }
// }
// class Plane extends Vehicle{
//     // @Override
//     // public void run() {
//     //     System.out.println("feifeifei");
//     // }
// }


public class TestSuper02 {
    public static void main(String[] args) {
        new ChildClass2();
    }
}

class FatherClass2{
    public FatherClass2(){
        System.out.println("创建FatherClass2");
    }
}
class  ChildClass2 extends FatherClass2 {
    public ChildClass2(){
        super();默认加上父类无参构造器
        System.out.println("创建ChildClass2");
    }
}




