import java.util.Scanner;

public class Admin {// ��������ѧ��
	Scanner scanner = new Scanner(System.in);
	/**��ӡ��ͷ*/
	public void printTitle() {
		System.out.println("\t��� \t���� \t����\tjava\tC#\tHTML\tSQL\t�ܷ�\tƽ����");
	}
	/**ˢ�����ѧ������*/
	public void print(Student[] students) {
		printTitle();
		for (int j = 0; j < students.length; j++) {
			if (students[j] != null) {
				System.out.println(students[j]);
			}
		}
	}
		/** ���ѧ�� */
		public void AddStudent(String name, int age, Student[] students) {
			/** ����Ҫ��ӵ�ѧ������ */
			Student student = new Student();
			student.setName(name);
			student.setAge(age);
			int i = this.setIndex(students);
			/** �ж��Ƿ���������е�ѧ�������û���������� */
			if (i == -1) {
				System.out.println(students.length + "��ѧ����ȫ�������ϣ�");
			} else {
				student.setNo(i);
				students[i] = student;
			}
			/** �����ɺ��������ѧ����Ϣ�� */
			print(students);
		}
	

	/** �ж���ӵ���ڼ���ѧ�� */
	private int setIndex(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				return i;
			}
		}
		return -1;
	}
	/**���ݱ�Ų���ѧ��*/
	public Student find(int no, Student[] students) {
		for(Student stu:students){
			if(stu.getNo()==no){
				return stu;
			}
		}
		return null;

	}
	/**���ݱ���޸�ѧ����Ϣ*/
	public void change(int changeNo, Student[] students) {
		Student changeStu = find(changeNo, students);
		System.out.println(changeNo+"��ѧ����Ϣ���£�");
		printTitle();
		System.out.println(changeStu);
		boolean y = true;
		while(y){
		System.out.println("��ѡ��Ҫ�޸ĵ����ݣ�\n>1��������\n>2��������\n>3����java�ɼ�\n>4����C#�ɼ�\n>5����HTML�ɼ�\n>6����SQL�ɼ�\n>0�˳�����");
		int importNo = scanner.nextInt();
		switch (importNo) {
		case 1:
			System.out.println("������������");
			changeStu.setName(scanner.next());
			printTitle();
			System.out.println(changeStu);
			break;
		case 2:
			System.out.println("���������䣺");
			changeStu.setAge(scanner.nextInt());
			printTitle();
			System.out.println(changeStu);
			break;
		case 3:
			System.out.println("������java�ɼ���");
			changeStu.setJava(scanner.nextInt());
			printTitle();
			System.out.println(changeStu);
			break;
		case 4:
			System.out.println("������C#�ɼ���");
			changeStu.setC__(scanner.nextInt());
			printTitle();
			System.out.println(changeStu);
			break;
		case 5:
			System.out.println("������HTML�ɼ���");
			changeStu.setHtml(scanner.nextInt());
			printTitle();
			System.out.println(changeStu);
			break;
		case 6:
			System.out.println("������SQL�ɼ���");
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
