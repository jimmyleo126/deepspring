package deepspring.chapter06.l06;

public class SimplePostProcess {
	
	private String connectionString;
	
	private String password;
	
	private String username;
	
	public SimplePostProcess() {
		System.out.println("dfdfdfd");
	}

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "SimplePostProcess [connectionString=" + connectionString + ", password=" + password + ", username="
				+ username + "]";
	}
	
	
	
	

}
