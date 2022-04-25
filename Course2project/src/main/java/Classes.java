
public class Classes {
	private int class_id;
	private String section;
	private int subject;
	private int teacher;

	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public int getSubject() {
		return subject;
	}

	public void setSubject(int subject) {
		this.subject = subject;
	}

	public int getTeacher() {
		return teacher;
	}

	public void setTeacher(int teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Class_info [class_id=" + class_id + ", section=" + section + ", subject=" + subject + ", teacher="
				+ teacher + "]";
	}
}
