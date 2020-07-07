package e_oop.score;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		Student[] students = new Student[10];

		for (int i = 0; i < students.length; i++) {
			Student student = new Student();

			student.name = "학생" + (i + 1);
			student.rank = 1;
			student.kor = (int) (Math.random() * 101);
			student.eng = (int) (Math.random() * 101);
			student.math = (int) (Math.random() * 101);
			students[i] = student;
			students[i].sum = students[i].kor + students[i].eng
					+ students[i].math;
			students[i].avg = Math.round((double) students[i].sum / 3 * 100) / 100.0;
		}

		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if (students[i].sum < students[j].sum) {
					students[i].rank++;
				}
			}
		}
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if (students[i].rank < students[j].rank) {
					Student temp = students[i];
					students[i] = students[j];
					students[j] = temp;
				}
			}
		}

		System.out.println("이름\t국어\t수학\t영어\t합계\t평균\t석차");

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].name + "\t" + students[i].kor + "\t"
					+ students[i].eng + "\t" + students[i].math + "\t"
					+ students[i].sum + "\t" + students[i].avg + "\t"
					+ students[i].rank + "\t");
		}
		

	}

}
