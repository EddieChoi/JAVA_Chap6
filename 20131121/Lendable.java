/**
 * 대출가능 인터페이스
 * @author 최웅권
 *
 */
interface Lendable {
	/**
	 * 대출한다.
	 * @param borrowe : 대출자 이름
	 * @param date : 대출 날짜
	 */
    void checkOut(String borrower, String date); 
    /**
     * 반납한다.
     */
    void checkIn(); 
}