package play;
import java.util.*;

public class firstplay{
	public int n,i,fact=1;
	public void fact(){
		Scanner num=new Scanner(System.in);
		System.out.println("Enter num ");
		int n=num.nextInt();
		for(i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println(fact);
}
}
	