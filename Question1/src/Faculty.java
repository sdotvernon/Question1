
public class Faculty extends Employee{
	private String officeHours;
	private int rank;
	public Faculty(){
		
	}
	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public String toString(){
		
		return  "Faculty: " + getName();
	
	}
}
