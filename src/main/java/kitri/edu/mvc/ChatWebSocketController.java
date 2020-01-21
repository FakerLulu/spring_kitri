package kitri.edu.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatWebSocketController {

	@RequestMapping("/chat")
	public String chat() {
		return "chatwebsocket";
	}
}
