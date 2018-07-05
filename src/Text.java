import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		/** 声明Scanner */
		Scanner scanner = new Scanner(System.in);
		
		/** 选择要执行的操作的编号 */
		int num;

		System.out.println("***请输入学生人数***");
		/** total:学生总数 */
		int total = scanner.nextInt();
		Student[] students = new Student[total];
		System.out.println("***你要执行的操作***\n" + ">10:添加一个学生\n" + ">11:查找以学生\n" + ">12:根据编号更新学生的基本信息\n" + ">13:根据编号删除学生\n"
				+ ">14:根据编号输入学生的各门成绩\n" + ">15:根据某门成绩进行排序\n" + ">16:根据总分进行排序\n" + ">99:退出系统");
		num = scanner.nextInt();
		if (num !=10&&num !=11&&num !=12&&num !=13&&num != 14&&num != 15&&num != 16&&num != 99) {
			System.out.println("请输入正确的操作编号！");
		}
		switch (num) {
		case 10:
			System.out.println("添加学生");
			break;
		case 11:
			System.out.println("查找学生");

			break;
		case 12:
			System.out.println("更新学生的基本信息");
			break;
		case 13:
			System.out.println("删除学生");
			break;

		case 14:
			System.out.println("输入学生的各门成绩");
			break;
		case 15:
			System.out.println("根据某门成绩进行排序");
			break;
		case 16:
			System.out.println("根据总分进行排序");
			break;
		case 99:
			System.out.println("退出系统");
			break;

		default:
			break;
		}

		/*
		 * System.out.println("\t编号 \t姓名 \t年龄\tjava\tC#\tHTML\tSQL\t总分\t平均分");
		 * Student student = new Student(); student.setNo(0);
		 * student.setName("小李"); student.setAge(24); student.setJava(70);
		 * student.setC__(65); student.setHtml(88); student.setSql(68);
		 * //student.setSum(); student.setAvg();
		 * 
		 * System.out.println(student.toString());
		 */

	}

}
