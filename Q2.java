
public class Q2 {

	public static void main(String[] args) {
		System.out.println(compressedData("aaaabbcd"));
	}

	public static String compressedData(Object data) {
		String input = String.valueOf(data), compressed = "";
		int i = 0, n = input.length(), count = 1;
		
		while (i < n - 1) {
			if (input.charAt(i) == input.charAt(i + 1)) {
				count++;
			} else {
				if (count == 1) {
					compressed += input.charAt(i);
				} else {
					compressed += input.charAt(i) + String.valueOf(count);
				}
				
				count = 1;
			}
			
			i++;
		}
		
		if (count == 1) {
			compressed += input.charAt(i);
		} else {
			compressed += input.charAt(i) + String.valueOf(count);
		}
		
		return compressed;
	}
	
	public static String decompress(String data) {
		String decompressed = "";
		int n = data.length();
		String count = "";
		
		for (int i = 0; i < n; i++) {
			if (data.charAt(i) >= 50 && data.charAt(i) <= 57) {
				count += data.charAt(i);
			} else {
				if (count.equals("")) {
					
				}
				count = "";
			}
		}
		
		return "";
	}
}
