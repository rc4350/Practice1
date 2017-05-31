
public class MergeConflict
{
	int data;
	String name;
	
	public void nameMethod()
	{
		name = "Bob";
	}
	
	public void dataMethod()
	{
	} 
	
	@Override
	public String toString()
	{
		return name+data;
	}
}
