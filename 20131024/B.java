/**
 * 생성자 상속관계 : 자식 클래스
 * @author 최웅권
 *
 */
public class B extends A{

	int c;
	int d;	
	B(int a, int b) {
		super(a, b);
	}
	B(int a, int b, int c){
		super(a, b);
		this.c = c;
	}
	B(int a, int b, int c, int d){
		super(a, b);
		this.c = c;
		this.d = d;
	}
}
