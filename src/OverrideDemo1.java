
public class OverrideDemo1 {
 public static void main(String[]args) {
	 Point orignal = new Point(30,50);
	 Point another = new Point (30,50);
	 if(orignal.equals(another)) System.out.println("같다.");
	 else System.out.println("다르다.");

 
 }
}


class Point extends Object{
	int x, y;
	public Point(int x, int y){
		this.x=x;
		this.y=y;
		
	}
@Override
//괄호안은 바꿀수가 없음
public boolean equals(Object obj) {
	Point child = (Point)obj;
	if(this.x==child.x && this.y==child.y) return true;
	else return false;
}

}




