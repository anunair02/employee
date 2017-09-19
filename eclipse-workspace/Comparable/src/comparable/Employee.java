package comparable;

public  class Employee {
String name;
 int experience;
String company;

public Employee(String name, int experience, String company) {
	super();
	this.name = name;
	this.experience = experience;
	this.company = company;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}

public String toString()
{
	return "Name: " +name+ " Experience: " +experience+ " Company: " +company+ "\n";
}



public int compareTo(Employee e) {
	// TODO Auto-generated method stub
	return 0;
}
}