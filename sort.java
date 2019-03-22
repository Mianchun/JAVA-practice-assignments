
public class sort {
    public static void main(String[] args)
    {
    	if (args.length < 3)
    	{
    		System.out.println("Re-execute with at least 3 words ");
    		System.exit(-1);
    	}

    	System.out.println("Before the sort:");
    	for (int i=0; i < args.length; i++)
    		System.out.println(args[i]);

    	String single=args[0];
    	for (int j=1; j<args.length; j++)
    	{
    		single= single+" "+args[j];
    	}
    	System.out.println(single);

    	System.out.println("\nAfter the sort: ");
    	for (int k=0; k<args.length-1; k++)           // The sort algorithm. There should be (args.length-1) times loops to place all the elements.
    	{
    		for (int m=0; m<args.length-k-1; m++)     // Loop for every element except the elements that have been placed in the right position.
    		{
    			if (args[m].compareTo(args[m+1])>0)     // compare two elements next to each other
    			{
    				String temp=args[m];       // If former element is larger than the latter one, exchanging their positions.
    				args[m]=args[m+1];
    				args[m+1]=temp;
    			}                               // After the first loop, the largest element will be placed at the last position of the array.
    		}

    	}

    	for (String element: args)
    	{
    		StringBuffer text=new StringBuffer(element);
    		System.out.println(text);
    	}

    	StringBuffer whole=new StringBuffer(args[0]);
    	for (int n=1; n<args.length; n++)
    		whole.append(" "+args[n]);

    	System.out.println(whole);
    }
}
