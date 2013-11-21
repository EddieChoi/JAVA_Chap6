/**
 * 메세지 발송 클래스
 * @author 최웅권
 *
 */
abstract class MessageSender {
    String title;
    String senderName;
    /**
     * MessageSender 클래스 생성자
     * @param title : 제목
     * @param senderName : 보내는 사람 이름
     */
    MessageSender(String title, String senderName) {
        this.title = title;
        this.senderName = senderName;
    }
    /**
     * 메세지를 송신한다.
     * @param recipient : 받는 사람 정보(email,phoneNumber)
     */
    abstract void sendMessage(String recipient);  
}
