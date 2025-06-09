public class App {

    // public static void main(String[] args) throws Exception {
	// 	float f4 = 145236589L;
	// 	float f5 = f4+1;
	// 	System.out.println(f4==f5);
	// 	System.out.println(f4);
	// 	System.out.println(f5);
    // }

    // public static void main(String[] args){
	// 	boolean b1 = true;
	// 	boolean b2 = false;
	// 	if(b1){
	// 		System.out.println("b1 is true");
	// 	}else{
	// 		System.out.println("b1 is false");			
	// 	}
    // }

    // public static void main(String[] args){
	// 	int a = 3;
	// 	long b = 4;
	// 	long c = a + b;
	// 	double d = 3+3.14;  //3是int,3.14是double,int会提升为 double
	// 	double d1 = 31/3; //两个int相除时，结果仍是int,整数除法后转为 double
	// 	int d2 = 31/3; //直接保留整数部分
	// 	double d3 = 31.0/3; //int会提升为double，结果也是double
	// 	System.out.println(c);
	// 	System.out.println(d);
	// 	System.out.println(d1);
	// 	System.out.println(d2);
	// 	System.out.println(d3);
	// }

    // public static void main(String[] args){	
	// 	int a = 3;
	// 	int b =4;
	// 	System.out.println(a>b); //false
	// 	char d = 'h';
	// 	System.out.println((int)d);//=104
	// 	System.out.println((int)d>100);//true
    // }

    // public static void main(String[] args){	
	// 	// boolean c = 1>2 && 2>(3/0);;
	// 	// System.out.println(c); 
	// 	//boolean d = 1>2 & 2>(3/0);
	// 	//System.out.println(d);		
	// 	boolean b1 = true;
	// 	boolean b2 = false;
	// 	System.out.println(b1&b2); 
	// 	System.out.println(b1|b2); 
	// }

    public static void main(String[] args){		
		System.out.println(12>>2);// =12/2/2,右移运算符，右移1位相当于除2取商
		System.out.println(12<<3);// =12*3*3,左移运算符，左移1位相当于乘 2
		System.out.println(~2);
		int a = 7;
		int b = 8;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~b);
		
	}


}


