package exercise2;

class Rectangle{
	double length;
	double width;
	void setRectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	
	double getArea() {
		return this.length *this.width;
	}
}

class Box extends Rectangle{
	
	double height;

	void setBox(double length,double width,double height) {
		this.length=length;
		this.width=width;
		this.height=height;
	}
	
	double getVolume() {
		return this.length *this.width *this.height;
	}
}

public class program5 {
	public static void main(String args[]) {
		Box b=new Box();
		b.setBox(1, 1, 1);
		System.out.print(b.getVolume());
	}
}
