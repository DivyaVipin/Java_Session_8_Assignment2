import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author DivyaVipin
 *
 */
class NegativeAgeException extends Exception
{
	String exceptionMessage;
	NegativeAgeException(String message) {
    	exceptionMessage=message;
    }
    public String toString(){ 
       return exceptionMessage;
    }
}
class Person
{
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	int age;
	Person()
	{
	}
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name: "+name+" Age: "+age);
	}
	public void checkAge(int age) 
	{
		if(age<0)
		{
			try {
				throw new NegativeAgeException("Please enter a positive number");
			} catch (NegativeAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Age is accepted");
		}
	}
	
}
public class Negative {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws NegativeAgeException,IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println ("Enter name "+"\n");
		 String name = br.readLine();
		 System.out.println ("Enter age"+"\n");
		 int age = Integer.parseInt(br.readLine());
		 Person person1=new Person(name,age);
		 person1.checkAge(age);
		 
		 
		 
	}

}
