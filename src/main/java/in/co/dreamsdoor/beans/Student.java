package in.co.dreamsdoor.beans;

public class Student {
	private int id;
	private String name;
	private String std;

	public Student(int id, String name, String std) {
		super();
		this.id = id;
		this.name = name;
		this.std = std;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

}
