import java.io.InputStreamReader;
import java.util.Scanner;

public class box {
	public static void main(String args[]){
		System.out.print("请输入数字M：");
		Scanner input = new Scanner(System.in);
		int s = input.nextInt();
		System.out.println(s);
	}
}

class point{
	float x;
	float y;
	
}

class circle{
	point p;
	float r;
}
