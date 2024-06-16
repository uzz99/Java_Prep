package com.beyond.inherit;

import java.util.Scanner;

import com.beyond.inherit.practice.Employee;
import com.beyond.inherit.practice.Person;
import com.beyond.inherit.practice.Student;

public class Application {

	public static void main(String[] args) {

			// 학생 정보
			Person[] student = new Student[3];
			student[0] = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
			student[1] = new Student("김말똥",21,187.3,80.0,2,"경영학과");
			student[2] = new Student("강개순",23,167.0,45.0,4,"정보통신공학과");
			
			for (Person stu : student) {
				System.out.println(stu.information());
			}
			
			/*********************************************************************************/
			// 사원 정보
			Scanner sc= new Scanner(System.in);
			char c = '\u0000';
			Person[] employee = new Employee[10];
			int cnt = 0;
			
			while(true) {
				System.out.println("계속 추가하시겠습니까? > ");
				c = sc.nextLine().charAt(0);
				if(c=='y' || c=='Y') {
					System.out.println("정보를 입력하세요.");
					String name = sc.nextLine();
					int age = sc.nextInt();
					double height = sc.nextDouble();
					double weight = sc.nextDouble();
					int salary = sc.nextInt();
					sc.nextLine();
					String dept = sc.nextLine();

					employee[cnt] = new Employee(name,age,height,weight,salary,dept);
					cnt++;
				}
				else {
					System.out.println("종료합니다.");
					break;
				}
			}
			// 출력
			for (Person emp : employee) {
				if(emp!=null) {
				System.out.println(emp.information());
				}
			}
			
			
	}

}
