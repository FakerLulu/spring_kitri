package aoptest1;

import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;

public class Common {

	public void print() {
		System.out.println("<<<메소드 시이이이자아아아아악 하게엤습니다아아아아아아아아아아아아>>>");
	}

	public void printResult(Object retVal) {// 포인트 컷 대상 메소드 수행 종료의 리턴값을 활용해 보가써
		System.out.println("<<<< 메소드 리턴값 : " + retVal + " >>>>");
	}

	public void printAround(ProceedingJoinPoint joinPoint) { // 조인포인트 = 대상이 된 메소드 정보를 가지고 있다.
		System.out.println("<<<< 메소드 둘러치기 : 메소드 시작합니다 >>>>");
		try {
			Object val = joinPoint.proceed();
			System.out.println(joinPoint.getTarget());
			System.out.println(joinPoint.getSignature());
			if (val instanceof List) {
				for (Object o : (List) val) {
					System.out.println(o);
				}
			}
		} catch (Throwable e) {
			e.printStackTrace();
		} // 핵심 관심 실행
		System.out.println("<<<< 메소드 둘러치기 : 메소드 끝낼겁니다>>>>");
	}
}
