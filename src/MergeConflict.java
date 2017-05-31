
public class MergeConflict
{
	int data;
	String name;
	
	public void nameMethod()
	{
		name = "Bob";
	}
	
	public int dataMethod()
	{
		int x;
		x = 2;
		return 2;
	} 
	
	@Override
	public String toString()
	{
		return name+data;
	}
}
