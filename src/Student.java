
public class Student {
	private int no;
	private String name;
	private int age;

	private int java;
	private int C__;
	private int html;
	private int sql;

	private int sum;
	private double avg;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getC__() {
		return C__;
	}
	public void setC__(int c__) {
		C__ = c__;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public int getSql() {
		return sql;
	}
	public void setSql(int sql) {
		this.sql = sql;
	}
	public int getSum() {
		return sum;
	}
	public void setSum() {
		this.sum = this.C__+this.html+this.java+this.sql;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		setSum();
		this.avg = this.sum/4;
	}
	@Override
	public String toString() {
		 String Str = "\t" + getNo() + "\t" + getName() + "\t" + getAge() + "\t"
				+ getJava() + "\t" + getC__() + "\t" + getHtml() + "\t" + getSql()
				+ "\t" + getSum() + "\t" + getAvg();
		 return Str;
	}
	
	
}
