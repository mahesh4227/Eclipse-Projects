package sample;

 class Parent {
	void display()
	{
		System.out.println("inside parent");
	}
}


 class Child extends Parent{
	void display()
	{
		System.out.println("inside child");
	}
}
 class Reference
{
	public static void main(String[] args) {
       Child c=new Child();
       Parent p=new Parent();
       p.display();
       p=c;
       p.display();
       c=(Child)p;
       c.display();
       
	}
}



