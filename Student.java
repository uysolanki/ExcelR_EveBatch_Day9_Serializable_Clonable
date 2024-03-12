package day9.serializationdemo.inheritance;

public class Student extends Person {
		private int rno;
		private String stream;
		public Student() {
			super();
		}
		public Student(int adharNo, String name, int rno, String stream) {
			super(adharNo, name);
			this.rno=rno;
			this.stream=stream;
			
		}
		public int getRno() {
			return rno;
		}
		public void setRno(int rno) {
			this.rno = rno;
		}
		public String getStream() {
			return stream;
		}
		public void setStream(String stream) {
			this.stream = stream;
		}
		
		
		
}
