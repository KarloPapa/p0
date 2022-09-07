package p0;

import java.util.Arrays;

public class Test {
	
	
	public static void main(String[] args) {
		MyIntArray nums = new MyIntArray(4);
		nums.set(0, 1);
		nums.set(1, 2);
		nums.set(2, 2);
		nums.set(3, 4);
		MyIntArray nums1 = new MyIntArray(5);
		nums1.set(0, 2);
		nums1.set(1, 2);
		nums1.set(2, 2);
		nums1.set(3, 4);
		nums1.set(4, 4);
		MyString str1 = new MyString("Hello world!");
		MyString str2 = new MyString("ll");
		MyString str3 = new MyString("Hello world!");
		MyString str4 = new MyString("0");
		MyString str5 = new MyString("ABABABabababa");
		MyString str6 = new MyString("zzyyaa");

		
		
		
		System.out.println(Arrays.toString(Practice.reverseOrder(nums)));
		System.out.println(Arrays.toString(Practice.reverseOrder(nums1)));
		System.out.println(Practice.findClumps(nums));
		System.out.println(Practice.findClumps(nums1));
		System.out.println(Practice.removeMyString(str1, str2));
		System.out.println(Practice.removeMyString(str3, str4));
		System.out.println(Practice.countChar(str5, 'a'));
		System.out.println(Practice.countChar(str6, '2'));
		
		
		Nation aztec = new Nation("Aztec", 2045);
		Nation mongolian = new Nation("Mongolian", 3066);
		Nation sumerian = new Nation("Sumerian", 1578);
		
		System.out.println(aztec.toString());
		aztec.setEnemy(mongolian);
		System.out.println(aztec.toString());
		aztec.setAlly(sumerian);
		System.out.println(aztec.toString());
		
		System.out.println(aztec.getRelationship(mongolian));
		aztec.backstab();
		System.out.println(aztec.getRelationship(mongolian));
		
		FireNation aztec1 = new FireNation("Aztec", 2045, "Eagle Warrior", 390);
		System.out.println(aztec1.toString());
		aztec1.setEnemy(sumerian);
		aztec1.setAlly(mongolian);
		System.out.println(aztec1.toString());
		
		System.out.println(aztec1.getRelationship(mongolian));
		aztec1.backstab();
		System.out.println(aztec1.getRelationship(mongolian));
		System.out.println(aztec1.toString());

		
	}

}