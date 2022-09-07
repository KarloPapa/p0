package p0;

public class Practice {
	
	
	
	/**
	 * @param MyIntArray arr
	 * @return MyIntArray reversedArray: arr in reversed order
	 * doesnt initialize reversedArray
	 * Starts at index length but arrays are length -1 for index
	 * make it return int[]
	 */ 
	public static int[] reverseOrder(MyIntArray arr) {
		
		int[] reversedArray = new int[arr.size];
		for (int i=0; i<arr.size; i++) {
			for(int n=arr.size - 1; n>=0; n--) {
				reversedArray[i] = arr.get(n);
				i++;
				
			}
			
		}
		return reversedArray;
		
	}
	
	
	
	/**
	 * @param MyIntArray arr
	 * @return int clumps : the number of clumps found
	 * clumps and inClump needed to be initialized
	 * i needs to start at index 1 or else array index out of bounds will be thrown
	 * add if arr at i != arr at i-1 then inclump false
	 */
	public static int findClumps(MyIntArray arr) {
		
		int clumps = 0;
		Boolean inClump = false;
		
		for (int i=1; i<arr.size; i++) {
			
			if (arr.get(i) == arr.get(i-1) && !inClump) {
				clumps += 1;
				inClump = true;
			}
			
			if (inClump && arr.get(i) != arr.get(i-1)) {
				inClump = false;
			}
			
			
		}
		
		return clumps;
				
	}
	
	
	/**
	 * 
	 * @param myString base: the original myString
	 * @param myString remove: the sequence to remove from myString
	 * @return base = base - remove
	 * needed to make contents public 
	 * get the string from remove (contents)
	 * return base
	 * make return string instead of mystring
	 * set base.contents equal to new string
	 */
	public static String removeMyString(MyString base, MyString remove) {
		
		base.contents = base.contents.replace(remove.contents, "");
		
		return base.contents;
		
	}
	
	
	
	/**
	 * @param MyString base
	 * @param char c
	 * @return the number of times c appears in base
	 */
	public static int countChar(MyString base, char c) {
			
			String baseString = base.contents;
			return countCharHelper(baseString, c);
		
	}
	
	
	/**
	 * @param String baseString
	 * @param char c
	 * @param int index
	 * @return the number of times c appears in base
	 * delete index
	 */
	public static int countCharHelper(String baseString, char c) {
        int charCount = 0;
		for(int n = 0; n<baseString.length(); n++) {
			if (Character.toLowerCase(baseString.charAt(n)) == Character.toLowerCase(c)) {
				charCount = charCount + 1;
				
			}
			n++;
		}
		return charCount;
	}
}
		

