package klef.Gifts;
public class Choclates {
	public class Choclates extends Sweets
	{
		public int weight(int w[],int l, int h)
		{
		int wgt=0;
		for (int i=0;i<w.length;i++)
		{
		if(w[i]>=l&&w[i]<=h)
		{

		wgt=wgt+w[i];
		}
		}
		return wgt;
		}
		public int count(int w[],int l, int h)
		{
		int cnt=0;
		for (int i=0;i<w.length;i++)
		{
		if(w[i]>=l&&w[i]<=h)
		{
		cnt++;
		}
		}
		return cnt;
		}
		}

}
