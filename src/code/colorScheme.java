package code;

import java.awt.Color;
import java.awt.Font;

/**
 * Color Scheme
 * @author Jason
 * The defined color scheme set for the display
 */
public final class colorScheme{
	private String colorSchemeName;
	private Fonts heading1, heading2, heading3, heading4;
	private Fonts paragraph1, paragraph2, paragraph3;
	private Fonts signature, about, errorMessages;
	private Color backgroundColor;

	/**
	 * The Color Scheme Constructors
	 */
	public colorScheme() {
		// Color Scheme Title
		colorSchemeName = "Default";
		
		// Background Color
		backgroundColor = new Color(255, 255, 255);
		
		
		// Preset Headings
		heading1 = new Fonts(new Font("Dialog", 0, 28));
		heading2 = new Fonts(new Font("Dialog", 0, 24));
		heading3 = new Fonts(new Font("Dialog", 0, 20));
		heading4 = new Fonts(new Font("Dialog", 0, 16));
		
		// Preset Paragraph
		paragraph1 = new Fonts(new Font("Dialog", 0, 14));
		paragraph2 = new Fonts(new Font("Dialog", 0, 12));
		paragraph3 = new Fonts(new Font("Dialog", 0, 10));
		
		// Preset Signature
		signature = new Fonts(new Font("Dialog", 0, 10));
				
		// Preset About
		about = new Fonts(new Font("Dialog", 0, 16));
		
		// Preset Error Messages
		errorMessages = new Fonts(new Font("Dialog", 0, 16));
	}	
	
	/**
	 * The Color Scheme Constructors
	 * @param s The Title of the Color Scheme
	 */
	public colorScheme(String s) {
		// Color Scheme Title
		colorSchemeName = s;
		
		// Background Color
		backgroundColor = new Color(255, 255, 255);
		
		// Preset Headings
		heading1 = new Fonts(new Font("Dialog", 0, 28));
		heading2 = new Fonts(new Font("Dialog", 0, 24));
		heading3 = new Fonts(new Font("Dialog", 0, 20));
		heading4 = new Fonts(new Font("Dialog", 0, 16));
		
		// Preset Paragraph
		paragraph1 = new Fonts(new Font("Dialog", 0, 14));
		paragraph2 = new Fonts(new Font("Dialog", 0, 12));
		paragraph3 = new Fonts(new Font("Dialog", 0, 10));
		
		// Preset Signature
		signature = new Fonts(new Font("Dialog", 0, 10));
		
		// Preset About
		about = new Fonts(new Font("Dialog", 0, 16));
		
		// Preset Error Messages
		errorMessages = new Fonts(new Font("Dialog", 0, 16));
	}
	
	/**
	 * The Color Scheme Constructors
	 * @param s The Title of the Color Scheme
	 */
	public colorScheme(String s, int backgroundR, int backgroundG, int backgroundB) {
		// Color Scheme Title
		colorSchemeName = s;
		// Background Color
		backgroundColor = new Color(backgroundR, backgroundG, backgroundB);
		
		// Preset Headings
		heading1 = new Fonts(new Font("Dialog", 0, 28));
		heading2 = new Fonts(new Font("Dialog", 0, 24));
		heading3 = new Fonts(new Font("Dialog", 0, 20));
		heading4 = new Fonts(new Font("Dialog", 0, 16));
		
		// Preset Paragraph
		paragraph1 = new Fonts(new Font("Dialog", 0, 14));
		paragraph2 = new Fonts(new Font("Dialog", 0, 12));
		paragraph3 = new Fonts(new Font("Dialog", 0, 10));

		// Preset Signature
		signature = new Fonts(new Font("Dialog", 0, 10));
		
		// Preset About
		about = new Fonts(new Font("Dialog", 0, 16));
		
		// Preset Error Messages
		errorMessages = new Fonts(new Font("Dialog", 0, 16));
	}
	
	/**
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
	 * Sets the Font's name, style and size
	 * @param headingNo Which Heading font to set
	 * @param fontName The Font name
	 * @param fontStyle The Font style
	 * @param fontSize The Font Size
	 */
	public void setHeadingFonts(int headingNo, String fontName, int fontStyle, int fontSize){
		
		// Sets Heading 1
		if(headingNo == 1) {
			heading1 = new Fonts(new Font(fontName, fontStyle, fontSize));
		}
		// Sets Heading 2
		else if(headingNo == 2) {
			heading2 = new Fonts(new Font(fontName, fontStyle, fontSize));
		}
		// Sets Heading 3
		else if(headingNo == 3) {
			heading3 = new Fonts(new Font(fontName, fontStyle, fontSize));
		}
		// Sets Heading 4
		else if(headingNo == 4) {
			heading4 = new Fonts(new Font(fontName, fontStyle, fontSize));
		}
	}
	
	/**
	 * This method changes the heading color of the headingNo# Heading to the R, G, B values
	 * @param headingNo The number Heading you would like to change
	 * @param R The Red value of the new Color
	 * @param G The Green value of the new Color
	 * @param B The Blue value of the new Color
	 */
	public void setHeadingColor(int headingNo, int R, int G, int B) {
		// Sets Heading 1
		if(headingNo == 1) {
			heading1.setFontColor( R, G, B);
		}
		// Sets Heading 2
		else if(headingNo == 2) {
			heading2.setFontColor( R, G, B);
		}
		// Sets Heading 3
		else if(headingNo == 3) {
			heading3.setFontColor( R, G, B);
		}
		// Sets Heading 4
		else if(headingNo == 4) {
			heading4.setFontColor( R, G, B);
		}
	}
	

	/**
	 * Returns the specified Heading Font based on the headingNo
	 * @param headingNo The number of the wanted paragraph
	 * @return Returns the specified Heading Font
	 */
	public Fonts getHeadingFonts(int headingNo) {
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
	 * Get the Heading Color of the Specified Heading, using the headingNo.
	 * For example headingNo = 1, returns the color for Heading 1
	 * @param headingNo Specifies which heading color to return.
	 * @return The specified heading color
	 */
	public Color getHeadingColor(int headingNo) {
		// Sets Heading 1
		if(headingNo == 1) {
			return heading1.getFontColor();
		}
		// Sets Heading 2
		else if(headingNo == 2) {
			return heading2.getFontColor();
		}
		// Sets Heading 3
		else if(headingNo == 3) {
			return heading3.getFontColor();
		}
		// Sets Heading 4
		else if(headingNo == 4) {
			return heading4.getFontColor();
		}
		// If paragraphNo is incorrect
		return null;
	}
	
	/**
	 * Sets the Font's name, style and size
	 * @param paragraphNo Which paragraph font to set
	 * @param fontName The Font name
	 * @param fontStyle The Font style
	 * @param fontSize The Font Size
	 */
	public void setParagraphFonts(int paragraphNo, String fontName, int fontStyle, int fontSize){
		// Sets Paragraph 1
		if(paragraphNo == 1) {
			paragraph1 = new Fonts(new Font(fontName, fontStyle, fontSize));
		}
		// Sets Paragraph 2
		else if(paragraphNo == 2) {
			paragraph2 = new Fonts(new Font(fontName, fontStyle, fontSize));
		}
		// Sets paragraph 3
		else if(paragraphNo == 3) {
			paragraph3 = new Fonts(new Font(fontName, fontStyle, fontSize));
		}
	}
	
	/**
	 * Sets the Paragraph color of the specified paragraph
	 * @param paragraphNo Specifies which Paragraph you want to set the color for
	 * @param R The Red Value of the new Color
	 * @param G The Green Value of the new Color
	 * @param B The Blue Value of the new Color
	 */
	public void setParagraphColor(int paragraphNo, int R, int G, int B) {
		// Sets Paragraph 1
		if(paragraphNo == 1) {
			paragraph1.setFontColor( R, G, B);
		}
		// Sets Paragraph 2
		else if(paragraphNo == 2) {
			paragraph2.setFontColor( R, G, B);
		}
		// Sets paragraph 3
		else if(paragraphNo == 3) {
			paragraph3.setFontColor( R, G, B);
		}
	}
	
	/**
	 * Get Paragraph Fonts
	 * @param paragraphNo The number of the wanted paragraph
	 * @return Returns the specified Paragraph Font
	 */
	public Fonts getParagraphFonts(int paragraphNo) {
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
	 * Get Paragraph Color
	 * @param paragraphNo The number of the wanted paragraph
	 * @return Returns the specified Paragraph Color
	 */
	public Color getParagraphColor(int paragraphNo) {
		// Sets Paragraph 1
		if(paragraphNo == 1) {
			return paragraph1.getFontColor();
		}
		// Sets Paragraph 2
		else if(paragraphNo == 2) {
			return paragraph2.getFontColor();
		}
		// Sets Paragraph 3
		else if(paragraphNo == 3) {
			return paragraph3.getFontColor();
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
	
	/**
	 * Sets the Font for the About Messages
	 * @param fontName The Font Name
	 * @param fontStyle The Font Style, 0 for Plain
	 * @param fontSize The Font Size
	 */
	public void setAboutFont(String fontName, int fontStyle, int fontSize) {
		about = new Fonts(new Font(fontName, fontStyle, fontSize));
	}
	
	/**
	 * Sets the Color of the About Messages 
	 * @param R The Red Value of the new Color
	 * @param G The Green Value of the new Color
	 * @param B The Blue Value of the new Color
	 */
	public void setAboutColor(int R, int G, int B) {
		about.setFontColor( R, G, B);
	}
	
	/**
	 * Returns the Fonts of the About Messages
	 * @return The Fonts of the About Messages
	 */
	public Fonts getAboutFont() {
		return about;
	}
	
	/**
	 * Returns the Color of the About Messages
	 * @return The Color of the About Messages
	 */
	public Color getAboutColor() {
		return  about.getFontColor();
	}
	
	/**
	 * Set the Font of the Signature Messages
	 * @param fontName The Font Name
	 * @param fontStyle The Font Style, as an example. Style 0 is plain
	 * @param fontSize The Font Size
	 */
	public void setSignatureFont(String fontName, int fontStyle, int fontSize) {
		signature = new Fonts(new Font(fontName, fontStyle, fontSize));
	}
	
	/**
	 * Sets the Color of the Signature Messages
	 * @param R The Red Value of the New Color
	 * @param G The Green Value of the New Color
	 * @param B The Blue Value of the New Color
	 */
	public void setSignatureColor(int R, int G, int B) {
		signature.setFontColor( R, G, B);
	}
	
	/**
	 * Returns the Color of the Signature Message
	 * @return The Color of the Signature Message
	 */
	public Color getSignatureColor() {
		return signature.getFontColor();
	}
	
	/**
	 * Returns the Font of the Signature Message
	 * @return 
	 */
	public Fonts getSignatureFont() {
		return signature;
	}
	
	/**
	 * Sets the Font of the Error Message
	 * @param fontName The Font Name
	 * @param fontStyle The Font Style. Example Font Style 0, equals plain
	 * @param fontSize The Font Size
	 */
	public void setErrorMessagesFont(String fontName, int fontStyle, int fontSize) {
		errorMessages = new Fonts(new Font(fontName, fontStyle, fontSize));
	}
	
	/**
	 * Sets the Color of the Error Messages
	 * @param R The Red Value of the New Color
	 * @param G The Green Value of the New Color
	 * @param B The Blue Value of the New Color
	 */
	public void setErrorMessagesColor(int R, int G, int B) {
		errorMessages.setFontColor( R, G, B);
	}
	
	/**
	 * Returns the  Error Messages Color 
	 * @return The Error Messages Color
	 */
	public Color getErrorMessagesColor() {
		return errorMessages.getFontColor();
	}
	
	/**
	 * Returns the Font of the Error Messages
	 * @return The Font of the Error Messages
	 */
	public Fonts getErrorMessagesFont() {
		return errorMessages;
	}
	
	/**
	 * Returns the ColorScheme Name
	 */
	public String toString() {
		return colorSchemeName;		
	}
}

/**
 * Fonts extends Font and adds Color option such that Fonts style can have their own Fonts Color
 * @author Jason
 */
class Fonts extends Font{
	private Color fontColor;
	private static final long serialVersionUID = 1L;

	/**
	 * Fonts Constructor
	 * @param arg0
	 */
	protected Fonts(Font arg0) {
		super(arg0);
		fontColor = new Color(0, 0, 0);
	}	
	
	/**
	 * Fonts Constructor
	 * @param arg0 The Original Font Variable
	 * @param R The Red Value of the New Color
	 * @param G The Green Value of the New Color
	 * @param B The Blue Value of the New Color
	 */
	protected Fonts(Font arg0,int R, int G, int B) {
		super(arg0);
		fontColor = new Color(R, G, B);
	}
	
	/**
	 * Sets the Font Color
	 * @param R The Red Value of the New Color
 	 * @param G The Green Value of the New Color
	 * @param B The Blue Value of the New Color
	 */
	public void setFontColor(int R, int G, int B) {
		fontColor = new Color(R, G, B);
	}
	
	/**
	 * Returns the Font Color
	 * @return The Font Color
	 */
	public Color getFontColor() {
		return fontColor;
	}
}
