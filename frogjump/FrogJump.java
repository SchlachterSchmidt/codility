package frogjump;

public class FrogJump {
	
	public int solution(int x, int y, int d) {
		
		return (int)Math.ceil((double)(y - x) / d);
	}
}
