import java.util.Scanner;

public class Main {// ������

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
			System.out.println("***��Ҫִ�еĲ���***\n" + ">10:���һ��ѧ��\n" + ">11:���ݱ�Ų���ѧ��\n" + ">12:���ݱ�Ÿ���ѧ���Ļ�����Ϣ\n"
					+ ">13:���ݱ��ɾ��ѧ��\n" + ">14:����ĳ�ųɼ���������\n" + ">15:�����ֽܷ�������\n" + ">16:���ݱ��¼��ѧ�����Ƴɼ�\n" + ">99:�˳�ϵͳ");
			num = scanner.nextInt();
			/** �ж��û������Ƿ����� */
			if ((num != 10) && (num != 11) && (num != 12) && (num != 13) && (num != 14) && (num != 15) && (num != 16)
					&& (num != 99) && (num != 17)) {
				System.out.println("��������ȷ�Ĳ�����ţ�");
			} else {
				switch (num) {
				/* ���ѧ�� */
				case 10:
					System.out.println("������Ҫ��ӵ�ѧ����������");
					String name = scanner.next();
					System.out.println("������Ҫ��ӵ�ѧ�������䣺");
					int age = scanner.nextInt();
					admin.AddStudent(name, age, students);
					break;
				/* ����ѧ�� */
				case 11:
					System.out.println("������Ҫ����ѧ���ı�ţ�");
					int findNo = scanner.nextInt();
					if (admin.find(findNo, students) != null) {
						admin.printTitle();
						System.out.println(admin.find(findNo, students));
					} else {
						System.out.println("û�в�ѯ���ñ�ŵ�ͬѧ���������Ƿ���ȷ��");
					}
					break;
				/* ����ѧ����Ϣ */
				case 12:
					System.out.println("������Ҫ����ѧ���ı�ţ�");
					int changeNo = scanner.nextInt();
					if (admin.find(changeNo, students) != null) {
						admin.change(changeNo, students);
						admin.print(students);
					} else {
						System.out.println("û�в�ѯ���ñ�ŵ�ͬѧ���������Ƿ���ȷ��");
					}

					break;
				/* ɾ��ѧ�� */
				case 13:
					while (true) {
						System.out.println("������Ҫɾ����ѧ����ţ�");
						int deleteNo = scanner.nextInt();
						if (0 <= deleteNo && deleteNo < students.length) {
							if (admin.find(deleteNo, students) != null) {
								admin.delete(deleteNo, students);
								admin.print(students);
								break;
							} else {
								System.out.println("û�в�ѯ���ñ�ŵ�ͬѧ���������Ƿ���ȷ��");
							}
						} else {
							System.out.println("��������ȷ��ѧ����ţ�");
						}
					}
					break;
					/** ����ĳ�ǿγ̵ĳɼ����� */
				case 14:
					System.out.println("��ѡ��Ҫ����Ŀγ̣�\n*1  java\t *2  C#\t *3  HTML\t *4  SQL");
					while (true) {
						int sortNo = scanner.nextInt();
						if (1 <= sortNo && sortNo <= 4) {
							admin.sort(sortNo, students);
							break;
						} else {
							System.out.println("�����������������룺");
						}
					}
					break;
					/** �����ܳɼ����� */
				case 15:
					admin.sumSort(students);

					break;
				case 16:
					System.out.println("������ѧ����ţ�");
					int inputNo = scanner.nextInt();
					if(0<=inputNo&&inputNo<students.length){
						if (students[inputNo] != null) {
							admin.input(inputNo, students);
						} else {
							System.out.println("û�и�ͬѧ����������ı���Ƿ���ȷ��");
						}
					}else {
						System.out.println("û�и�ͬѧ����������ı���Ƿ���ȷ��");
					}
					

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
