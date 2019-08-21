package q4;

public class Contacts implements Comparable 
{
	String name; 
	String email; 
	Long mobile; 
	String address;
	
	public Contacts()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Contacts(String name, String email, Long mobile, String address) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Contacts c=(Contacts)o;
		if(this.mobile==c.mobile)
		{
			return 0;
		}
		else if(this.mobile>c.mobile)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+"-"+this.mobile+"\n";
	} 
	
}