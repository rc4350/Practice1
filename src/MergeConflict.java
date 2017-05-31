
public class MergeConflict
{
	int data;
	String name;
	
	public String nameMethod()
	{
<<<<<<< HEAD
		
	return name;
=======
		name = "Bob";
>>>>>>> master
	}
	
	public int dataMethod()
	{
	} 
>>>>>>> master
	
	@Override
	public String toString()
	{
		return name+data;
	}
}

<<<<<<< HEAD
		int result = 0;
		for (int x=0; x<name.length(); x++)
		{
			result = name.charAt(x) + result;
			
		}
		data = ++result % name.length();
		return result;
	}

=======