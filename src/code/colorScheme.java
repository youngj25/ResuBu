package code;

public class colorScheme {
	private static String purpose;
	private static String family, name, style;
	private static int r, g, b, size;
	private static int[] color;
	
	public colorScheme() {
		family = "Dialog";
		name = "Dialog";
		style = "plain";
		size = 12;
		color = new int[3];
		color[0] = color[1] = color[2] = 0;
	}

	public colorScheme(String s) {
		purpose = s;
		family = "Dialog";
		name = "Dialog";
		style = "plain";
		size = 12;
		r=g=b=0;
	}
	
	

	public void setColor(int R, int G, int B) {
		color[0] = R;
		color[0] = G;
		color[0] = B;
	}
	
	public int[] getColor() {
		return color;
	}
}
