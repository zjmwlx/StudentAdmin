import java.util.Scanner;

public class Main {// 主程序

	public static void main(String[] args) {
		/** 声明Scanner */
		Scanner scanner = new Scanner(System.in);
		/** 声明学生管理器 */
		Admin admin = new Admin();
		/** 选择要执行的操作的编号 */
		int num;

		/** 程序开始的提示信息 */
		System.out.println("***请输入学生人数***");
		/** total:学生总数 */
		int total = scanner.nextInt();
		/** 保存学生信息的数组 */
		Student[] students = new Student[total];
		while (true) {
			/** 打印提示信息，让用户选择要执行的操作 */
			System.out.println("***你要执行的操作***\n" + ">10:添加一个学生\n" + ">11:根据编号查找学生\n" + ">12:根据编号更新学生的基本信息\n"
					+ ">13:根据编号删除学生\n" + ">14:根据某门成绩进行排序\n" + ">15:根据总分进行排序\n" + ">16:根据编号录入学生各科成绩\n" + ">99:退出系统");
			num = scanner.nextInt();
			/** 判断用户输入是否有误 */
			if ((num != 10) && (num != 11) && (num != 12) && (num != 13) && (num != 14) && (num != 15) && (num != 16)
					&& (num != 99) && (num != 17)) {
				System.out.println("请输入正确的操作编号！");
			} else {
				switch (num) {
				/* 添加学生 */
				case 10:
					System.out.println("请输入要添加的学生的姓名：");
					String name = scanner.next();
					System.out.println("请输入要添加的学生的年龄：");
					int age = scanner.nextInt();
					admin.AddStudent(name, age, students);
					break;
				/* 查找学生 */
				case 11:
					System.out.println("请输入要查找学生的编号：");
					int findNo = scanner.nextInt();
					if (admin.find(findNo, students) != null) {
						admin.printTitle();
						System.out.println(admin.find(findNo, students));
					} else {
						System.out.println("没有查询到该编号的同学，请检查编号是否正确！");
					}
					break;
				/* 更新学生信息 */
				case 12:
					System.out.println("请输入要更新学生的编号：");
					int changeNo = scanner.nextInt();
					if (admin.find(changeNo, students) != null) {
						admin.change(changeNo, students);
						admin.print(students);
					} else {
						System.out.println("没有查询到该编号的同学，请检查编号是否正确！");
					}

					break;
				/* 删除学生 */
				case 13:
					while (true) {
						System.out.println("请输入要删除的学生编号：");
						int deleteNo = scanner.nextInt();
						if (0 <= deleteNo && deleteNo < students.length) {
							if (admin.find(deleteNo, students) != null) {
								admin.delete(deleteNo, students);
								admin.print(students);
								break;
							} else {
								System.out.println("没有查询到该编号的同学，请检查编号是否正确！");
							}
						} else {
							System.out.println("请输入正确的学生编号！");
						}
					}
					break;
					/** 根据某们课程的成绩排序 */
				case 14:
					System.out.println("请选择要排序的课程：\n*1  java\t *2  C#\t *3  HTML\t *4  SQL");
					while (true) {
						int sortNo = scanner.nextInt();
						if (1 <= sortNo && sortNo <= 4) {
							admin.sort(sortNo, students);
							break;
						} else {
							System.out.println("输入有误，请重新输入：");
						}
					}
					break;
					/** 根据总成绩排序 */
				case 15:
					admin.sumSort(students);

					break;
				case 16:
					System.out.println("请输入学生编号：");
					int inputNo = scanner.nextInt();
					if(0<=inputNo&&inputNo<students.length){
						if (students[inputNo] != null) {
							admin.input(inputNo, students);
						} else {
							System.out.println("没有该同学，请检查输入的编号是否正确！");
						}
					}else {
						System.out.println("没有该同学，请检查输入的编号是否正确！");
					}
					

					break;
				case 99:
					System.out.println("退出系统");
					break;

				default:
					break;
				}
			}

		}

	}

}
