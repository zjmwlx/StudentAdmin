import java.util.Scanner;

public class Admin {//用来管理学生
	Scanner scanner = new Scanner(System.in);
	/**添加学生*/
	public void  AddStudent(String name,int age,Student[] students) {
		/**创建要添加的学生对象*/
		Student student = new Student();
		student.setName(name);
		student.setAge(age);
		int i = this.setIndex(students);
		/**判断是否添加完所有的学生，如果没有则继续添加*/
		if(i == -1){
			System.out.println(students.length+"名学生已全部添加完毕！");
		}else{
			students[i]  =student;
		}
		/**遍历数组。输出学生*/
		for(int j = 0;j<students.length;j++){
		
			System.out.println(students[j]);
		}
		}
	
	/**判断添加到里第几个学生*/
	private int setIndex(Student[] students) {
		for(int i=0;i<students.length;i++){
			if (students[i]==null) {
				return i;
			}
		}
		return -1;	
	}
}
