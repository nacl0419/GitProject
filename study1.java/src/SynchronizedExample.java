// public class Test01 {
//     public static void main(String[] args) {
//         int[] s;
//         s = new int[10];
//         for (int i = 0;i<10;i++){
//             s[i] = i+1;
//             System.out.println(s[i]);
//         }
//     }
// }


// class Man{
//     private int id;
//     private int age;
//     public Man(int id,int age){
//         super();
//         this.age=age;
//         this.id=id;
//        // System.out.println(id);
//         //System.out.println(age);
//     }
//     public int getId() {
//         return id;
//     }

//     public int getAge() {
//         return age;
//     }
// }
// public class Test01 {
//     public static void main(String[] args) {
//         Man[] mans;//声明引用类型数组
//         mans = new Man[10];//分配空间
//         Man m1 = new Man(1,11);
//         Man m2 = new Man(2,20);
//         mans[0] = m1;
//         mans[1] = m2;
//         System.out.println(mans[0].getId());
//         System.out.println(mans[0].getAge());
//         System.out.println(mans[0]);//赋值
//         System.out.println(mans[1]);

//     }
// }


//    public static void main(String[] args) {
//         int a2[] =new int[2];
//         boolean[] b = new boolean[2];
//         String[] s = new String[2];
//         System.out.println(a2[0]);//0
//         System.out.println(b[0]);//false
//         System.out.println(s[0]);//null

//     }


// public static void main(String[] args) {
//         String[] s = {"aa","bb","cc"};
//         for (String temp:s){
//             System.out.println(temp);
//         }
//     }


// public static void main(String[] args) {
//         String[] s = {"阿里","JD","SOHU"};
//         String[] sBak=new String[6];
//         System.arraycopy(s,0,sBak,0,s.length);
//         for (int i=0;i<sBak.length;i++){
//             System.out.print(sBak[i]+"\t");//阿里	JD	SOHU	null	null	null
//         }
//     }


// public static void main(String[] args) {
//     int[] a = {1,10,5,16,30,8};
//     System.out.println(Arrays.toString(a));//[1, 10, 5, 16, 30, 8]
//     Arrays.sort(a);
//     System.out.println(Arrays.toString(a));//[1, 5, 8, 10, 16, 30]
//     System.out.println(Arrays.binarySearch(a,120));
//     System.out.println(Arrays.binarySearch(a,8));
// }


// public class StringExample {
//     public static void main(String[] args) {
//         String str = "Hello, Java!";
//         System.out.println("Length: " + str.length());
//         System.out.println("Substring: " + str.substring(7));
//         System.out.println("Replace 'Java' with 'World': " + str.replace("Java", "World"));
//     }
// }


// public class ExceptionExample {
//     public static void main(String[] args) {
//         try {
//             int result = 10 / 0; // 可能会抛出异常
//         } catch (ArithmeticException e) {
//             System.out.println("Cannot divide by zero.");
//         } finally {
//             System.out.println("This block is always executed.");
//         }
//     }
// }


public class SynchronizedExample {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + example.counter);
    }
}


