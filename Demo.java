class Demo{
	int roll;
	String name;
	double marks;
	public static void main(String args[]){
		Demo d1= new Demo();
		Demo d2= new Demo();
		System.out.println(d1.roll);
		System.out.println(d1.name);
		System.out.println(d1.marks);
		d1.roll=20;
		d1.name="Dev";
		d1.marks=0.00;
		d2.roll=21;
		d2.name="D";
		d2.marks=10.00;
		System.out.println(d1.roll);
		System.out.println(d1.name);
		System.out.println(d1.marks);
		System.out.println(d2.roll);
		System.out.println(d2.name);
		System.out.println(d2.marks);
	}
}