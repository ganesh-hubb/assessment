package javaq;
import java.util.Random;

public class shuffle {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,6,7};
		int temp;
		for(int i=0;i<a.length;i++) {
			int s=new Random().nextInt(a.length);
			temp=a[i];
			a[i]=a[s];
			a[s]=temp;
		}
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	}
}
