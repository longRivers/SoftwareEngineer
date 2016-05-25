import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class box {
	public static void main(String args[]){
		System.out.print("请输入数字M：");
		Scanner input = new Scanner(System.in);
		ArrayList a = new ArrayList();
		int m = input.nextInt();
		float r1 , r2;
		r1 = 1;
		r2 = 0;
		Circle C = new DiagCircle(0, 0, 1);
		C.calculate();
		r1 = C.getR();
		if(m == 1){
			System.out.println("圆心：" + "("+C.getPoint().getX()+", "
					+C.getPoint().getY()+")"+";"+"半径: "+C.getR());
		}
		
		while(Math.abs(r1-r2)!=0){
			if(C.getPoint().getX() == C.getPoint().getY()){
				
			}
			int i;
		};
		
		System.out.println("圆心：" + "("+C.getPoint().getX()+", "
				+C.getPoint().getY()+")"+";"+"半径: "+C.getR());
	}
}

class Point{
	protected float x;
	protected float y;
	public Point(float x, float y){
		this.x = x;
		this.y = y;
	}
	
	public float getX(){
		return this.x;
	}
	public float getY(){
		return this.y;
	}
}

class Circle{
	protected Point point;
	protected float r;
	protected ArrayList<Circle> parentCircle = new ArrayList();
	public Circle(float x, float y, float r){
		this.point = new Point(x, y);
		this.r = r;
	}
	
	public void calculate(){
		Circle InitCircle;
		System.out.println("bbb");
	}
	public Point getPoint(){
		return this.point;
	}
	public float getR(){
		return this.r;
	}
}

class DiagCircle extends Circle{

	//对角线上的圆
	public DiagCircle(float x, float y, float r) {
		//float x = parentCircle.getPoint().getX();
	//	float y = parentCircle.getPoint().getY();
		//float r = parentCircle.getR();
		super(x, y, r);
		// TODO Auto-generated constructor stub
	}
	public void calculate(Circle a){
		System.out.println("aaa");
		this.point.x = 2;
		this.point.y = 6;
		this.r = 5;
		
	}
}

class DCutCircle extends Circle{
	//与两个圆相切的圆，既double-cut
	public DCutCircle(float x, float y, float r){
		super(x, y, r);
	}
	public void calcute(Circle a, Circle b){
		System.out.println("double-cut");
	}
}

class TCutCircle extends Circle{
	//与三个圆相切的圆
	public TCutCircle(float x, float y, float r){
		super(x, y, r);
	}
	public void calcute(){
		System.out.println("three-cut");
	}
}
