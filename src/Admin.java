import java.util.Scanner;

public class Admin {// 用来管理学生
	Scanner scanner = new Scanner(System.in);
	/**打印表头*/
	public void printTitle() {
		System.out.println("\t编号 \t姓名 \t年龄\tjava\tC#\tHTML\tSQL\t总分\t平均分");
	}
	/**刷新输出学生数组*/
	public void print(Student[] students) {
		printTitle();
		for (int j = 0; j < students.length; j++) {
			if (students[j] != null) {
				System.out.println(students[j]);
			}
		}
	}
		/** 添加学生 */
		public void AddStudent(String name, int age, Student[] students) {
			/** 创建要添加的学生对象 */
			Student student = new Student();
			student.setName(name);
			student.setAge(age);
			int i = this.setIndex(students);
			/** 判断是否添加完所有的学生，如果没有则继续添加 */
			if (i == -1) {
				System.out.println(students.length + "名学生已全部添加完毕！");
			} else {
				student.setNo(i);
				students[i] = student;
			}
			/** 添加完成后输出所有学生信息。 */
			print(students);
		}
	

	/** 判断添加到里第几个学生 */
	private int setIndex(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				return i;
			}
		}
		return -1;
	}
	/**根据编号查找学生*/
	public Student find(int no, Student[] students) {
		for(Student stu:students){
			if(stu.getNo()==no){
				return stu;
			}
		}
		return null;

	}
	/**根据编号修改学生信息*/
	public void change(int changeNo, Student[] students) {
		Student changeStu = find(changeNo, students);
		System.out.println(changeNo+"号学生信息如下：");
		printTitle();
		System.out.println(changeStu);
		boolean y = true;
		while(y){
		System.out.println("请选择要修改的内容：\n>1更改姓名\n>2更改年龄\n>3更改java成绩\n>4更改C#成绩\n>5更改HTML成绩\n>6更改SQL成绩\n>0退出更改");
		int importNo = scanner.nextInt();
		switch (importNo) {
		case 1:
			System.out.println("请输入姓名：");
			changeStu.setName(scanner.next());
			printTitle();
			System.out.println(changeStu);
			break;
		case 2:
			System.out.println("请输入年龄：");
			changeStu.setAge(scanner.nextInt());
			printTitle();
			System.out.println(changeStu);
			break;
		case 3:
			System.out.println("请输入java成绩：");
			changeStu.setJava(scanner.nextInt());
			printTitle();
			System.out.println(changeStu);
			break;
		case 4:
			System.out.println("请输入C#成绩：");
			changeStu.setC__(scanner.nextInt());
			printTitle();
			System.out.println(changeStu);
			break;
		case 5:
			System.out.println("请输入HTML成绩：");
			changeStu.setHtml(scanner.nextInt());
			printTitle();
			System.out.println(changeStu);
			break;
		case 6:
			System.out.println("请输入SQL成绩：");
			changeStu.setSql(scanner.nextInt());
			printTitle();
			System.out.println(changeStu);
			break;
		case 0:
			y=false;
			break;
		}
		}
	}
	
}
