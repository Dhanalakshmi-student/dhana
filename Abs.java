abstract class Abs{
void add(int a){
a++;
System.out.println(a);
}
abstract void sub(int a,int b);
}
class TestAbs extends Abs{
@Override
void sub(int a,int b){
System.out.println(a-b);
}
public static void main(String[] args){

  Abs a=new TestAbs();
  a.add(1);
  a.sub(12,2);
}
}