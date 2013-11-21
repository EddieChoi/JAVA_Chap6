public class InterfaceEx1 {	
	public static void main(String[] args) {
		SeparateVolume obj1 = new SeparateVolume("863?777개","개미","베르베르");
		AppCDInfo obj2 = new AppCDInfo("2007-7001","Redhat");
		obj1.checkOut("최웅권","2013-11-21");
		obj2.checkOut("최웅권","2013-11-21");
		
		obj1.checkOut("홍길동","2013-11-21");
		
		obj1.checkIn();
		obj2.checkIn();
	}
}
