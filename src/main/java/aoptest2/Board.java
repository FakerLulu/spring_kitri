package aoptest2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("board")
public class Board {
	public List getList() {
		System.out.println("게시물 리스트 소환하는 중");
		ArrayList<String> list = new ArrayList<String>();
		list.add("1:제목1:내용1");
		list.add("2:제목2:내용2");
		list.add("3:제목3:내용3");
		return list;

	}

	public void insert(int seq) {
		System.out.println(seq + "번 게시물입니다");
	}
}
