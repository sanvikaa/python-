class parent
{
	int x,y;
	parent(int a,int b)
	{
		x=a;
		y=b;
	}
}
class child extends parent
{
	int z;
	child(int a,int b,int c)
	{
		super(a,b);
		z=c;
	}
	int sum()
	{
		return(x+y+z);
	}
}
class single_demo1
{
	public static void main(String args[])
	{
		child n=new child(10,20,30);
		System.out.println("sum="+n.sum());
	}
}