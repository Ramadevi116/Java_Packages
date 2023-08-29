import play.firstplay;
import play.secondplay;
import java.util.Scanner;
class mainclass{
    public static void main(String[] args){
        firstplay obj=new firstplay();
        obj.fact();
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	secondplay obj1=new secondplay();
	long res=obj1.multiplyNumbers(n);
	System.out.println(res);

    }
}