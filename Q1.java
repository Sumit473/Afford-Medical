import java.util.*;

public class Q1 {
	class Input {
		int chunk;
		byte[] data;
		
		Input(int chunk, byte[] data) {
			this.chunk = chunk;
			this.data = data;
		}
	}
	
	ArrayList<Input> input = new ArrayList<>();
	
	public static void main(String[] args) {
		
	}
	
	public void receive(int chunk, byte[] data) {
		int n = input.size(), i = 0;
		
		while(i < n) {
			if (input.get(i).chunk > chunk) {		
				input.add(i, new Input(chunk, data));
				break;
			}
			
			i++;
		}
		
		if (i == n) {
			input.add(new Input(chunk, data));
		}
	}
}
