package treeMapExample;

// Question 1

enum Gender{
	MALE,
	FEMALE
	};
class Contact //implements Comparable<Contact>
{
	long phoneNumber;
	String name;
	String email;
	Gender gender;
	
	public Contact(long phno,String name,String email,Gender gen)
	{
		this.phoneNumber=phno;
		this.name=name;
		this.email=email;
		this.gender=gen;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public String toString()
	{
		return (phoneNumber+"\t"+name+"\t"+email+"\t"+gender);
	}
}

