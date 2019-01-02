package deepspring.chapter06.l05;

import java.util.Date;

public class UserManager {
	
	private Date dateValue;

	public Date getDateValue() {
		return dateValue;
	}

	public void setDateValue(Date dateValue) {
		this.dateValue = dateValue;
	}

	@Override
	public String toString() {
		return "UserManager [dateValue=" + dateValue + ", getDateValue()=" + getDateValue() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
