package tester;

public class calc {


	

		
			public double add(int a,int b) {
				return a+b;
			}
			public double sub(int a,int b) {
				return a-b;
			}
			public double mul(int a,int b) {
				return a*b;
			}
			public double div(int a,int b) {
				return a/b;
			}
			public static void main(String[] args) {
			calc calc=new calc();
			//testcase1:Addition
			double result1=calc.add(10,5);
			System.out.println("tc01-Addition:"+result1);
			if(result1==15){
			System.out.println("test case 1 is passed");
			}
			else{
			System.out.println("test case failed");
			}

			//testcase2:subtraction
			double result2=calc.sub(10,5);
			System.out.println("tc02-subtraction:"+result2);
			if(result2==5){
			System.out.println("test case 2 is passed");
			}
			else{
			System.out.println("test case failed");
			}

			//testcase:Multiplication
			double result3=calc.mul(10,5);
			System.out.println("tc03-Multiplication:"+result3);
			if(result3==50){
			System.out.println("test case 3 is passed");
			}
			else{
			System.out.println("test case failed");
			}
			 
			//testcase:Division
			double result4=calc.div(10,5);
			System.out.println("tc04-Division:"+result4);
			if(result4==2){
			System.out.println("test case 4 is passed");
			}
			else{
			System.out.println("test case failed");
			}
			 
			
			



		}

	}