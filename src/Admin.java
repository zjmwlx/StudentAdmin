import java.util.Scanner;

public class Admin {//��������ѧ��
	Scanner scanner = new Scanner(System.in);
	/**���ѧ��*/
	public void  AddStudent(String name,int age,Student[] students) {
		/**����Ҫ��ӵ�ѧ������*/
		Student student = new Student();
		student.setName(name);
		student.setAge(age);
		int i = this.setIndex(students);
		/**�ж��Ƿ���������е�ѧ�������û����������*/
		if(i == -1){
			System.out.println(students.length+"��ѧ����ȫ�������ϣ�");
		}else{
			students[i]  =student;
		}
		/**�������顣���ѧ��*/
		for(int j = 0;j<students.length;j++){
		
			System.out.println(students[j]);
		}
		}
	
	/**�ж���ӵ���ڼ���ѧ��*/
	private int setIndex(Student[] students) {
		for(int i=0;i<students.length;i++){
			if (students[i]==null) {
				return i;
			}
		}
		return -1;	
	}
}
