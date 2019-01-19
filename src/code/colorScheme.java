package code;

import java.awt.Color;
import java.awt.Font;

public class colorScheme {
	private static String purpose;
	private static String family, name, style;
	private static int r, g, b, size;
	private static int[] color;
	private static Font Heading1, Heading2, Heading3, Heading4;
	private static Font paragraph1, paragraph2, paragraph3;
	private static Color backgroundColor;
	
	public colorScheme() {
		family = "Dialog";
		name = "Dialog";
		style = "plain";
		size = 12;
		color = new int[3];
		color[0] = color[1] = color[2] = 0;
		backgroundColor = new Color(255, 255, 255);
		
	}

	public colorScheme(String s) {
		purpose = s;
		family = "Dialog";
		name = "Dialog";
		style = "plain";
		size = 12;
		r=g=b=0;
	}
	
	

	public void setBackgroundColor(int R, int G, int B) {
		backgroundColor = new Color(R, G, B);
	}
	
	public Color getBackgroundColor() {
		return backgroundColor;
	}
}
