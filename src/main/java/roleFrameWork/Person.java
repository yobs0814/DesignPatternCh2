package roleFrameWork;

public class Person {
	private Role role;
	public void setRole(Role role)
	{
		this.role=role;
	}
	
	public Role getRole(Role role)
	{
		return role;
	}
	
	public void printRole(){
		role.printRole();
	}
}
