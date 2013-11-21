/**
 * �޼��� �߼� Ŭ����
 * @author �ֿ���
 *
 */
abstract class MessageSender {
    String title;
    String senderName;
    /**
     * MessageSender Ŭ���� ������
     * @param title : ����
     * @param senderName : ������ ��� �̸�
     */
    MessageSender(String title, String senderName) {
        this.title = title;
        this.senderName = senderName;
    }
    /**
     * �޼����� �۽��Ѵ�.
     * @param recipient : �޴� ��� ����(email,phoneNumber)
     */
    abstract void sendMessage(String recipient);  
}
