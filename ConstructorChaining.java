package assignments;

class Constructor
{
	
	Constructor()
	{
		System.out.println("calling parent default constructor");
	}
	Constructor(int x)
	
	{
		this();
		System.out.println("calling parent parameterized constructor");
		System.out.println(x);
		
	}
	Constructor(String name)
	{
		this(4);
		System.out.println("calling parent String parameterized constructor ");
		System.out.println(name);
	}
}
class ChildConstructor extends Constructor
{
	ChildConstructor()
	{
		super();
		System.out.println("calling child construcotr class");
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start of parent class constructors calls");
		 Constructor c=new Constructor("supriya");
		 
		 System.out.println("end of parent consturctor class");
		 
		 System.out.println("start of child class constructors callsr");
		 
		 ChildConstructor c1=new ChildConstructor();
		
		 System.out.println("end of child consturctor class");

	}

}
