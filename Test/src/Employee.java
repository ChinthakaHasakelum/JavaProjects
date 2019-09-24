
public class Employee implements Cloneable{
	
	
	static{
		
		System.out.println("Inititalization done");
		
	}
	
	public String xcode="X001";
	
	private int id;
	public static final String companyName="Virtusa";
	public static String segment="java";
	
	public static final Integer code=10;

	public static String getEmployee(){
		
		return "Hasakelum";
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((xcode == null) ? 0 : xcode.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (xcode == null) {
			if (other.xcode != null)
				return false;
		} else if (!xcode.equals(other.xcode))
			return false;
		return true;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee() {
		System.out.println("++Constructor++");
	}
	
	
	

}
