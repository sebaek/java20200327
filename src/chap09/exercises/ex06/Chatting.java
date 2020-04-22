package chap09.exercises.ex06;

public class Chatting {
	class Chat {
		void start() {
		}

		void sendMessage(String message) {
		}
	}

	void startCat(String chatId) {
		String nickName = chatId;
		Chat chat = new Chat() {
			@Override
			public void start() {
				while (true) {
					String inputDate = "안녕하세요";
					String message = "[" + nickName + "]" + inputDate;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
}













