import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		/** ����Scanner */
		Scanner scanner = new Scanner(System.in);
		
		/** ѡ��Ҫִ�еĲ����ı�� */
		int num;

		System.out.println("***������ѧ������***");
		/** total:ѧ������ */
		int total = scanner.nextInt();
		Student[] students = new Student[total];
		System.out.println("***��Ҫִ�еĲ���***\n" + ">10:���һ��ѧ��\n" + ">11:������ѧ��\n" + ">12:���ݱ�Ÿ���ѧ���Ļ�����Ϣ\n" + ">13:���ݱ��ɾ��ѧ��\n"
				+ ">14:���ݱ������ѧ���ĸ��ųɼ�\n" + ">15:����ĳ�ųɼ���������\n" + ">16:�����ֽܷ�������\n" + ">99:�˳�ϵͳ");
		num = scanner.nextInt();
		if (num !=10&&num !=11&&num !=12&&num !=13&&num != 14&&num != 15&&num != 16&&num != 99) {
			System.out.println("��������ȷ�Ĳ�����ţ�");
		}
		switch (num) {
		case 10:
			System.out.println("���ѧ��");
			break;
		case 11:
			System.out.println("����ѧ��");

			break;
		case 12:
			System.out.println("����ѧ���Ļ�����Ϣ");
			break;
		case 13:
			System.out.println("ɾ��ѧ��");
			break;

		case 14:
			System.out.println("����ѧ���ĸ��ųɼ�");
			break;
		case 15:
			System.out.println("����ĳ�ųɼ���������");
			break;
		case 16:
			System.out.println("�����ֽܷ�������");
			break;
		case 99:
			System.out.println("�˳�ϵͳ");
			break;

		default:
			break;
		}

		/*
		 * System.out.println("\t��� \t���� \t����\tjava\tC#\tHTML\tSQL\t�ܷ�\tƽ����");
		 * Student student = new Student(); student.setNo(0);
		 * student.setName("С��"); student.setAge(24); student.setJava(70);
		 * student.setC__(65); student.setHtml(88); student.setSql(68);
		 * //student.setSum(); student.setAvg();
		 * 
		 * System.out.println(student.toString());
		 */

	}

}
