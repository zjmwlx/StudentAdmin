import java.util.Scanner;

public class Text {// ������

	public static void main(String[] args) {
		/** ����Scanner */
		Scanner scanner = new Scanner(System.in);
		/** ����ѧ�������� */
		Admin admin = new Admin();
		/** ѡ��Ҫִ�еĲ����ı�� */
		int num;

		/** ����ʼ����ʾ��Ϣ */
		System.out.println("***������ѧ������***");
		/** total:ѧ������ */
		int total = scanner.nextInt();
		/** ����ѧ����Ϣ������ */
		Student[] students = new Student[total];
		while (true) {
			/** ��ӡ��ʾ��Ϣ�����û�ѡ��Ҫִ�еĲ��� */
			System.out.println("***��Ҫִ�еĲ���***\n" + ">10:���һ��ѧ��\n" + ">11:������ѧ��\n" + ">12:���ݱ�Ÿ���ѧ���Ļ�����Ϣ\n"
					+ ">13:���ݱ��ɾ��ѧ��\n" + ">14:���ݱ������ѧ���ĸ��ųɼ�\n" + ">15:����ĳ�ųɼ���������\n" + ">16:�����ֽܷ�������\n" + ">17:����ƽ���ֽ�������\n" +">99:�˳�ϵͳ");
			num = scanner.nextInt();
			/** �ж��û������Ƿ����� */
			if ((num != 10) && (num != 11) && (num != 12) && (num != 13) && (num != 14) && (num != 15) && (num != 16)
					&& (num != 99)&&(num!=17)) {
				System.out.println("��������ȷ�Ĳ�����ţ�");
			}else{
				switch (num) {
				case 10:
					System.out.println("������Ҫ��ӵ�ѧ����������");
					String name = scanner.next();
					System.out.println("������Ҫ��ӵ�ѧ�������䣺");
					int age = scanner.nextInt();
					admin.AddStudent(name, age, students);
					break;
				case 11:
					System.out.println("������Ҫ����ѧ���ı�ţ�");
					int findNo = scanner.nextInt();
					if (admin.find(findNo,students)!=null) {
						admin.printTitle();
						System.out.println(admin.find(findNo,students));
					}else {
						System.out.println("û�в�ѯ���ñ�ŵ�ͬѧ���������Ƿ���ȷ��");
					}
					break;
				case 12:
					System.out.println("������Ҫ����ѧ���ı�ţ�");
					int changeNo = scanner.nextInt();
					if(admin.find(changeNo, students)!=null){
						admin .change(changeNo,students);
						admin.print(students);
					}else{
						System.out.println("û�в�ѯ���ñ�ŵ�ͬѧ���������Ƿ���ȷ��");
					}
					
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
				case 17:
					System.out.println("����ƽ���ֽ�������");
					break;
				case 99:
					System.out.println("�˳�ϵͳ");
					break;

				default:
					break;
				}
			}

		}

	}

}
