// Java exception handling
public class Ex1{
    public static void main(String[] args){
        try{
            String s1 = args[0];
            String s2 = args[1];
            System.out.println(s1 + s2);
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            System.out.println(a + b);
            System.out.println(a / b);
        }
        catch(Exception e){
            System.out.println("please enter two numbers to add and divide"+e);
        }
    }
}