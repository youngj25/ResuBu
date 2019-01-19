package code;

import java.awt.Color;
import java.awt.Font;

public class colorScheme {
	private static String colorSchemeName;
	private static Font heading1, heading2, heading3, heading4;
	private static Font paragraph1, paragraph2, paragraph3;
	private static Color backgroundColor;
	
	/**
	 * Color Scheme
	 * The Color Scheme Constructors
	 * @param s The Title of the Color Scheme
	 */
	public colorScheme(String s) {
		// Color Scheme Title
		colorSchemeName = s;
		
		// Preset Headings
		heading1 = new Font("Dialog", 0,28);
		heading2 = new Font("Dialog", 0,24);
		heading3 = new Font("Dialog", 0,20);
		heading4 = new Font("Dialog", 0,16);
		
		// Preset Paragraph
		paragraph1 = new Font("Dialog", 0,14);
		paragraph2 = new Font("Dialog", 0,12);
		paragraph3 = new Font("Dialog", 0,10);
		
		//new Font(g.getFont().getName(),g.getFont().getStyle(),25);
        
		
		// Background
		backgroundColor = new Color(255, 255, 255);
	}
	
	/**
	 * Set Color Scheme Title
	 * Set's the Color Scheme Title with the given String
	 * @param s The New Color Scheme Title
	 */
	public void setColorSchemeTitle(String s) {
		colorSchemeName = s;
	}
	
	/**
	 * Get Color Scheme Title
	 * Returns the Color Scheme Title
	 * @return The Color Scheme Title
	 */
	public String getColorSchemeTitle() {
		return colorSchemeName;
	}
	

	/**
	 * Set Heading Font
	 * Sets the Font's name, style and size
	 * @param headingNo Which Heading font to set
	 * @param fontName The Font name
	 * @param fontStyle The Font style
	 * @param fontSize The Font Size
	 */
	public void setHeadingFont(int headingNo, String fontName, int fontStyle, int fontSize){
		// Sets Heading 1
		if(headingNo == 1) {
			heading1 = new Font(fontName, fontStyle, fontSize);
		}
		// Sets Heading 2
		else if(headingNo == 2) {
			heading2 = new Font(fontName, fontStyle, fontSize);
		}
		// Sets Heading 3
		else if(headingNo == 3) {
			heading3 = new Font(fontName, fontStyle, fontSize);
		}
		// Sets Heading 4
		else if(headingNo == 4) {
			heading4 = new Font(fontName, fontStyle, fontSize);
		}
	}
	

	/**
	 * Get Heading Font
	 * @param headingNo The number of the wanted paragraph
	 * @return Returns the specified Heading Font
	 */
	public Font getHeadingFont(int headingNo) {
		// Sets Heading 1
		if(headingNo == 1) {
			return heading1;
		}
		// Sets Heading 2
		else if(headingNo == 2) {
			return heading2;
		}
		// Sets Heading 3
		else if(headingNo == 3) {
			return heading3;
		}
		// Sets Heading 4
		else if(headingNo == 4) {
			return heading4;
		}
		
		// If headingNo is incorrect
		return null;
	}
	
	
	
	/**
	 * Set Paragraph Font
	 * Sets the Font's name, style and size
	 * @param paragraphNo Which paragraph font to set
	 * @param fontName The Font name
	 * @param fontStyle The Font style
	 * @param fontSize The Font Size
	 */
	public void setParagraphFont(int paragraphNo, String fontName, int fontStyle, int fontSize){
		// Sets Paragraph 1
		if(paragraphNo == 1) {
			paragraph1 = new Font(fontName, fontStyle, fontSize);
		}
		// Sets Paragraph 2
		else if(paragraphNo == 2) {
			paragraph2 = new Font(fontName, fontStyle, fontSize);
		}
		// Sets paragraph 3
		else if(paragraphNo == 3) {
			paragraph3 = new Font(fontName, fontStyle, fontSize);
		}
	}
	
	/**
	 * Get Paragraph Font
	 * @param paragraphNo The number of the wanted paragraph
	 * @return Returns the specified Paragraph Font
	 */
	public Font getParagraphFont(int paragraphNo) {
		// Sets Paragraph 1
		if(paragraphNo == 1) {
			return paragraph1;
		}
		// Sets Paragraph 2
		else if(paragraphNo == 2) {
			return paragraph2;
		}
		// Sets Paragraph 3
		else if(paragraphNo == 3) {
			return paragraph3;
		}
		
		// If paragraphNo is incorrect
		return null;
	}
	
	
	/**
	 * Sets the Background Color
	 * @param R The Red Color Value 0-255
	 * @param G The Green Color Value 0-255
	 * @param B The Blue Color Value 0-255
	 */
	public void setBackgroundColor(int R, int G, int B) {
		backgroundColor = new Color(R, G, B);
	}
	
	/**
	 * Get Background Color
	 * @return Returns the Background Color
	 */
	public Color getBackgroundColor() {
		return backgroundColor;
	}
}
