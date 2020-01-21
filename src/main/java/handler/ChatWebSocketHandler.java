package handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

@Component("chatwsh")
public class ChatWebSocketHandler implements WebSocketHandler {

	static List<WebSocketSession> list = new ArrayList<WebSocketSession>();

	@Override
	// 클라이언트와 연결시
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		list.add(session);
		System.out.println("사용자 추가 : " + session + "// 접속자 : " + list.size());
	}

	@Override
	// 메시지 받음
	// seesion : 클라이언트, message : 메시지
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
		String msg = (String) message.getPayload();
		for (WebSocketSession ws : list) {
			WebSocketMessage<String> smsg = new TextMessage(msg);
			ws.sendMessage(smsg);
		}
		System.out.println(message + " 메시지 전송완료");
	}

	@Override
	public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {

	}

	@Override
	// 클라이언트와 연결 해제
	public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
		list.remove(session);
		System.out.println("사용자 제거 : " + session + "// 접속자 : " + list.size());

	}

	@Override
	// 메시지 크면 자르자(필수 아님)
	public boolean supportsPartialMessages() {
		return false;
	}

}
