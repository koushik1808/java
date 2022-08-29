public class ArmstrongNumberKoushik2 {
	public int count(int n) {
		int c=0;
		while(n!=0) {
			c++;
			n/=10;
		}
		return c;
	}
	public int ams(int n) {
		int c=count(n);
		int x=0;
		while(n!=0) {
			int r=n%10;
			x+=Math.pow(r,c);
			n/=10;
		}
		return x;
	}
	public boolean chack(int n) {
		boolean a=true;
		int x=ams(n);
		if(x!=n) {
			a=false;
		}
		return a;
	}
}
