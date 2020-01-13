package aopexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopExamMain {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AnimalConfig.class);
//		ApplicationContext ac = new ClassPathXmlApplicationContext("aopexam/aopexam.xml");
		Animal[] animal = new Animal[3];
		animal[0] = ac.getBean("dog", Animal.class);
		animal[1] = ac.getBean("cat", Animal.class);
		animal[2] = ac.getBean("rabbit", Animal.class);

		for (Animal a : animal) {
			a.lunch();
			System.out.println();
		}

	}
}

//출력할거
/*
 * 점심 뭐 먹었어요?
 * 
 * (동작) -> 핵심 관심
 * 
 * (대상) 님은 (결과) 먹었군요
 * 
 */
