
public class StudentBean {

	int id;
	String name;
	int age;
	String emailaddress;

	public int getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public int getage() {
		return age;
	}
	
	public void setage(int age) {
		this.age = age;
	}
	
	public String getemailaddress() {
		return emailaddress;
	}
		
	public void setemailid(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	
	public String toString() {
		return "StudentBean [id="+ id + ",name = "+ name + ",email = " + emailaddress + "]";
	}
	
	
}
