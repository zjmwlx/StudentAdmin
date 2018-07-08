import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Admin {// 用来管理学生
	Scanner scanner = new Scanner(System.in);

	/** 打印表头 */
	public void printTitle() {
		System.out.println("\t编号 \t姓名 \t年龄\tjava\tC#\tHTML\tSQL\t总分\t平均分");
	}

	/** 刷新输出学生数组 */
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
		int i = this.setIndex(students);
		/** 判断是否添加完所有的学生，如果没有则继续添加 */
		if (i == -1) {
			System.out.println(students.length + "名学生已全部添加完毕！");
		} else {
			student.setName(name);
			student.setAge(age);
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

	/** 根据编号查找学生 */
	public Student find(int no, Student[] students) {
		for (Student stu : students) {
			if (stu.getNo() == no) {
				return stu;
			}
		}
		return null;

	}

	/** 根据编号修改学生信息 */
	public void change(int changeNo, Student[] students) {
		Student changeStu = find(changeNo, students);
		System.out.println(changeNo + "号学生信息如下：");
		printTitle();
		System.out.println(changeStu);
		boolean y = true;
		while (y) {
			System.out.println("请选择要修改的内容：\n>1更改姓名\n>2更改年龄\n>3更改java成绩\n>4更改C#成绩\n>5更改HTML成绩\n>6更改SQL成绩\n>0退出更改");
			int importNo = scanner.nextInt();
			switch (importNo) {
			// 更改学生姓名
			case 1:
				System.out.println("请输入姓名：");
				changeStu.setName(scanner.next());
				printTitle();
				System.out.println(changeStu);
				break;
			// 更该学生年龄
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
				y = false;
				break;
			}
		}
	}

	/** 删除学生 */
	public void delete(int deleteNo, Student[] students) {
		Student deleteStu = find(deleteNo, students);
		System.out.println(deleteNo + "号学生信息如下：");
		printTitle();
		System.out.println(deleteStu);
		System.out.println("确定要删除该学生信息吗？\n*1  是\t*0  否");
		// 让用户孺人是否真的要删除，以免误操作
		if (scanner.nextInt() == 1) {
			// 判断要删除的是否是最后一位学生，
			if (deleteNo != students.length - 1) {
				for (int i = deleteNo; i < students.length - 1; i++) {
					students[i] = students[i + 1];
				}
				// students[deleteNo]=null;
			} else {
				students[deleteNo] = null;
			}
		}

	}

	/** 根据某们课程成绩进行排序 */
	public void sort(int sortNo, Student[] students) {
		switch (sortNo) {
		// 根据java排序
		case 1:
			for (int i = 0; i <= students.length - 1; i++) {
				for (int j = i + 1; j < students.length; j++) {
					if (students[i].getJava() < students[j].getJava()) {
						Student a = students[i];
						students[i] = students[j];
						students[j] = a;
					}
				}
			}
			this.print(students);
			break;
		// 根据C#排序
		case 2:
			for (int i = 0; i <= students.length - 1; i++) {
				for (int j = i + 1; j < students.length; j++) {
					if (students[i].getC__() < students[j].getC__()) {
						Student a = students[i];
						students[i] = students[j];
						students[j] = a;
					}
				}
			}
			this.print(students);
			break;
		// 根据HTML排序
		case 3:
			for (int i = 0; i <= students.length - 1; i++) {
				for (int j = i + 1; j < students.length; j++) {
					if (students[i].getHtml() < students[j].getHtml()) {
						Student a = students[i];
						students[i] = students[j];
						students[j] = a;
					}
				}
			}
			this.print(students);
			break;
		// 根据SQL排序
		case 4:
			for (int i = 0; i <= students.length - 1; i++) {
				for (int j = i + 1; j < students.length; j++) {
					if (students[i].getSql() < students[j].getSql()) {
						Student a = students[i];
						students[i] = students[j];
						students[j] = a;
					}
				}
			}
			this.print(students);
			break;

		}

	}

	public void sumSort(Student[] students) {
		for (int i = 0; i <= students.length - 1; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (students[i].getSum() < students[j].getSum()) {
					Student a = students[i];
					students[i] = students[j];
					students[j] = a;
				}
			}
		}
		this.print(students);

	}

	/** 输入各科成绩 */

	public void input(int inputNo, Student[] students) {
		System.out.println("请输入该同学的java成绩：");
		students[inputNo].setJava(scanner.nextInt());
		System.out.println("请输入该同学的C#成绩：");
		students[inputNo].setC__(scanner.nextInt());
		System.out.println("请输入该同学的HTML成绩：");
		students[inputNo].setHtml(scanner.nextInt());
		System.out.println("请输入该同学的SQL成绩：");
		students[inputNo].setSql(scanner.nextInt());
		this.print(students);
	}

}
