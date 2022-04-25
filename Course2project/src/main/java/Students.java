
public class Students {
	private int student_id;
	private String name;
	private int class_id;
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	@Override
	public String toString() {
		return "Students [student_id=" + student_id + ", name=" + name  
				+ ", class_id=" + class_id + "]";
	}
	
	
}
