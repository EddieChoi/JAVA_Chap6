
public class MessageSenderMain {
	public static void main(String[] args) {
		EMailSender obj1 = new EMailSender(
				"������ �����մϴ�.",
				"������",
				"admin@kaywon.ac.kr",
				"10% ���� ������ ����Ǿ����ϴ�."
				);
		SMSSender obj2 = new SMSSender(
				"������ �����մϴ�.",
				"������",
				"02-0000-0000",
				"10% ���� ������ ����Ǿ����ϴ�."
				);
		obj1.sendMessage("faceoff9110@gmail.com");
		obj2.sendMessage("010-4106-5245");
	}
}
