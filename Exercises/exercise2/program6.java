package exercise2;



public class program6 {
	public static void main(String[] args){
		
		Student stuArray[]=new Student[10];  
		for(int i=0;i<10;i++){
			stuArray[i]=new Student();
			}
		
		stuArray[1].setinfo(55, "Name1");
		stuArray[2].setinfo(50, "Name3","Bombay,India");
		stuArray[3].setinfo(45, "Name4","Bhopal,India");
		stuArray[4].setinfo(30, "Name6","Pune,India");
		stuArray[5].setinfo(65, "Name7","Delhi,India");
		stuArray[6].setinfo(55, "Name9");
		stuArray[7].setinfo(30, "Name6","Pune,India");
		stuArray[8].setinfo(65, "Name7","Delhi,India");
		stuArray[9].setinfo(55, "Name9");



	
	for(Student s :stuArray){
	System.out.println(s);
	}

	}

}


class Student{
String name;
int age;
String address;

public Student(){
this.name="unknown";
this.age=0;
this.address="not avaliable";
}

public void setinfo(int age,String name){
this.name=name;
this.age=age;
}

public void setinfo(int age ,String name,String address){
this.name=name;
this.age=age;
this.address=address;
}

public String toString(){
return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
}

}