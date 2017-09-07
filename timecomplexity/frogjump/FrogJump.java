package timecomplexity.frogjump;

public class FrogJump {
	
	/*
	 * Count minimal number of jumps from position X to Y
	 */
	
	public int solution(int x, int y, int d) {
		
		return (int)Math.ceil((double)(y - x) / d);
	}
}
