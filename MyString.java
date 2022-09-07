package p0;

public class MyString {

	String contents;
	private int length;
	
	public MyString(String str) {
		this.contents = str;
		this.length = str.length();
	}
	
	public String getContents() {
		return this.contents;
	}
	
	public int getLength() {
		return this.length;
	}
	
}