
public class Sweets {
	public int weight(int w[],int l, int h)
	{
	int wt=0;
	for (int i=0;i<w.length;i++)
	{
	if(w[i]>=l&&w[i]<=h)
	{

	wt=wt+w[i];
	}
	}
	return wt;
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


