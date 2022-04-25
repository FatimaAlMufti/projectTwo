
public class Teachers {
private int teacher_id;
private String name;
private String major;
public int getTeacher_id() {
	return teacher_id;
}
public void setTeacher_id(int teacher_id) {
	this.teacher_id = teacher_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}
@Override
public String toString() {
	return "Teachers [teacher_id=" + teacher_id + ", name=" + name + ", major=" + major + "]";
}

}
