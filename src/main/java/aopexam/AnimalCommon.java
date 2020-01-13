package aopexam;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AnimalCommon {
	@Pointcut("execution(String aopexam.*.lunch(..))")
	public void pc() {

	}

	@Around("pc()")
	public void eatCommon(ProceedingJoinPoint joinpoint) {

		try {
			System.out.println("점심 뭐 먹었어요?");
			Object ret = joinpoint.proceed();
			if (ret instanceof String) {
				String animal = joinpoint.getTarget().getClass().getSimpleName();
				System.out.println(animal + " 님은 " + ret + " 먹었군요.");
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

}
