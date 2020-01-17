package boxingandunboxing;

public class BoxingAndUnboxing {
public static void main(String []args)
{
	//BOXING
	int i=100;
	//auto boxing
	Integer i1=i;
	//Using Integer constructor
	Integer i2 = new Integer(i);
	//boxing using type cast
	Integer i3=(Integer)i;
	System.out.println(i1);
	System.out.println(i2);
	System.out.println(i3);
	//UNBOXING
	int i4=i3;
	int i5=(int)i4;
	System.out.println(i4);
	System.out.println(i5);
	
}
 }
