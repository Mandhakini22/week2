
public class Gifts {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int w[]=new int[n];
	for(int i=0;i<n;i++)
	{
	w[i]=sc.nextInt();

	}
	int l,h;
	l=sc.nextInt();
	h=sc.nextInt();
	Choclates c= new Choclates();
	Sweets s=new Sweets();
	System.out.println(s.weight(w,l,h)+c.weight(w,l,h));
	System.out.println(s.count(w,l,h)+c.count(w,l,h));


	}
	}


