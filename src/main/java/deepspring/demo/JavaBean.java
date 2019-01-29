package deepspring.demo;

public class JavaBean implements Comparable<JavaBean>{
	
	private int id;
	private String alp;
	private String rank;
	
	
	
	public JavaBean() {
	}


	public JavaBean(int id, String alp, String rank) {
		super();
		this.id = id;
		this.alp = alp;
		this.rank = rank;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAlp() {
		return alp;
	}
	public void setAlp(String alp) {
		this.alp = alp;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}


	@Override
	public String toString() {
		return "JavaBean [id=" + id + ", alp=" + alp + ", rank=" + rank + "]";
	}


	@Override
	public int compareTo(JavaBean jb) {
//		if(this.getId() > jb.getId()) {
//			
//			return this.getAlp().compareTo(jb.getAlp());
//		}
		if(this.getId() > jb.getId()) {
			return 1;
		}else if(this.getId() < jb.getId()) {
			return -1;
		}else {
			if(this.getAlp().compareTo(jb.getAlp()) < 0) {
				return -1;
			}else if(this.getAlp().compareTo(jb.getAlp()) > 0) {
				return 1;
			}else {
				return 0;
			}
		}
	}
	
	
	
	

}
