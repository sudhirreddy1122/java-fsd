class EmpInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

public class practiceproject4 {

public static void main(String[] args) {

	EmpInfo emp1=new EmpInfo();
	EmpInfo emp2=new EmpInfo();

	emp1.display();
	emp2.display();
	}
}


class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}


