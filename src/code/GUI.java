package code;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.print.*;

// import javax.swing.*;
// import java.io.*;
// import java.io.IOException;

public class GUI extends Frame implements Printable, ActionListener{
	/**
	 * File Parameters
	 */
	private static final long serialVersionUID = 1L;
    private static String []Jabout={"A program that will display the battlefield for future game development"};
    private static String command = "", jay="Jason A. Young";
    private static Frame frame;
    private static User_Account user = new User_Account();
    private static ArrayList <colorScheme> scheme = new ArrayList<colorScheme>();
    private static MenuItem Default, colorScheme1, colorScheme2, colorScheme3, colorScheme4, colorScheme5;    
    private static int menuThemeSelection = 0;
    
    /**
     * creates a Frame
     */    
    public static void main(String[] args){
        frame = new  GUI();
        frame.setResizable(false);
        frame.setSize(800,700);
        frame.setVisible(true);
        
        // Load the Color Scheme
        loadColorScheme();
    }
    
	public GUI() {
        setTitle("ResuBu");
        
        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        
        Menu fileMenu=new Menu("File");
        mb.add(fileMenu);
        
        MenuItem miAbout=new MenuItem("About");
        miAbout.addActionListener(this);
        fileMenu.add(miAbout);
        
        MenuItem miDefault =new MenuItem("Upload Default");
        miDefault.addActionListener(this);
        fileMenu.add(miDefault);
        
        MenuItem miBlank=new MenuItem("Blank");
        miBlank.addActionListener(this);
        fileMenu.add(miBlank);
        
        Menu colorSchemeSubMenu=new Menu("Color Schemes");
        fileMenu.add(colorSchemeSubMenu);
        
        Default=new MenuItem("Default");
        Default.addActionListener(this);
        colorSchemeSubMenu.add(Default);
        
        colorScheme1=new MenuItem("colorScheme1");
        colorScheme1.addActionListener(this);
        colorSchemeSubMenu.add(colorScheme1);
        
        colorScheme2=new MenuItem("colorScheme2");
        colorScheme2.addActionListener(this);
        colorSchemeSubMenu.add(colorScheme2);
        
        colorScheme3=new MenuItem("colorScheme3");
        colorScheme3.addActionListener(this);
        colorSchemeSubMenu.add(colorScheme3);
        
        colorScheme4=new MenuItem("colorScheme4");
        colorScheme4.addActionListener(this);
        colorSchemeSubMenu.add(colorScheme4);
        
        colorScheme5=new MenuItem("colorScheme5");
        colorScheme5.addActionListener(this);
        colorSchemeSubMenu.add(colorScheme5);
        
        MenuItem miExample=new MenuItem("Load Example");
        miExample.addActionListener(this);
        fileMenu.add(miExample);
        
        MenuItem miPrint=new MenuItem("Print");
        miPrint.addActionListener(this);
        fileMenu.add(miPrint);
        
        MenuItem miExit=new MenuItem("Exit");
        miExit.addActionListener(this);
        fileMenu.add(miExit);
        
        WindowListener l = new WindowAdapter(){
                        
            public void windowClosing(WindowEvent ev){
                System.exit(0);
            }
            
            public void windowActivated(WindowEvent ev){
                repaint();
            }
            
            public void windowStateChanged(WindowEvent ev){
                repaint();
            }
        
        };
        
        ComponentListener k = new ComponentAdapter(){
            public void componentResized(ComponentEvent e){
                repaint();           
            }
        };
        
        this.addWindowListener(l);
        this.addComponentListener(k);
    }

	/**
     * Depending on the action that the user perform, it performs a certain action
     * @param ev What Action has just been performed by the user
     */
    public void actionPerformed (ActionEvent ev){
            command = ev.getActionCommand();                        
            
            if("About".equals(command))repaint();
            else if("Blank".equals(command)||"Upload Default".equals(command)){
                
                repaint();
            }
            else if("Default".equals(command)||scheme.get(1).getColorSchemeTitle().equals(command)||scheme.get(2).getColorSchemeTitle().equals(command)){
            	
            	if("Default".equals(command))
            		menuThemeSelection = 0;
            	else if(scheme.get(1).getColorSchemeTitle().equals(command))
            		menuThemeSelection = 1;
            	else if(scheme.get(2).getColorSchemeTitle().equals(command))
            		menuThemeSelection = 2;
            	else if(scheme.get(3).getColorSchemeTitle().equals(command))
            		menuThemeSelection = 3;
            	else if(scheme.get(4).getColorSchemeTitle().equals(command))
            		menuThemeSelection = 4;
            	else if(scheme.get(5).getColorSchemeTitle().equals(command))
            		menuThemeSelection = 5;
            		
            	System.out.println("color Theme Selected: "+command);
            		
            	frame.setBackground(scheme.get(menuThemeSelection).getBackgroundColor());
                
            	
            	
            	repaint();
            }
            else if("Load Example".equals(command)){
            	Data_Importer imports = new Data_Importer();
            	user = imports.loadUserData("Example");
            	repaint();
            }
            else if("Print".equals(command)){
                PrinterJob job = PrinterJob.getPrinterJob();
                 job.setPrintable(this);
                 boolean ok = job.printDialog();
                 if (ok) {
                     try {
                          job.print();
                     } catch (PrinterException ex) {
                      /* The job did not successfully complete */
                     }
                 }
            }
            else if("Exit".equals(command))System.exit(0);
            //repaint();
        }
        
    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {

        if (page > 0) { /* We have only one page, and 'page' is zero-based */
            return NO_SUCH_PAGE;
        }

        /* User (0,0) is typically outside the imageable area, so we must
         * translate by the X and Y values in the PageFormat to avoid clipping
         */
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        /* Now print the window and its visible contents */
        //frame.printAll(g);
        frame.print(g);
        
        /* tell the caller that this page is part of the printed document */
        return PAGE_EXISTS;
    }
        
        
    /**
     * Displays the graphic upon the frame
     * @param g Graphics currently being displayed
     */
    public void paint(Graphics g){
            int ww = (int)this.getWidth();
            int wh = (int)this.getHeight();
            
            if("About".equals(command)){
              int x = ww/4;
              int y = (int)(wh*.4);
              
              g.setColor(Color.BLACK);
              g.drawString("About:",25,75);
              g.drawLine(25,78,60,78);
              
              for(int z=0;z<Jabout.length;z++){
                  if(z==1)g.setColor(Color.RED);
                  else if(z==2)g.setColor(Color.MAGENTA);
                  else if(z==3)g.setColor(Color.BLUE);
                  else if(z==4)g.setColor(Color.GREEN);
                  g.drawString(Jabout[z], x, y+z*20);
                }
              g.setColor(Color.BLUE);
              g.drawString(jay,ww-100, wh-20);
              g.setColor(Color.BLACK);
            }
            
            // Load Example
            else if("Load Example".equals(command)){
            	
            	int stringSize = (user.getFirstName()+" "+user.getMiddleName().substring(0,1)+". "+user.getLastName()).length();
            	stringSize= stringSize*25/3;
            	
                g.setFont(scheme.get(0).getHeadingFonts(1));
                g.setColor(scheme.get(0).getParagraphColor(1));
                g.drawString(user.getFirstName()+" "+user.getMiddleName().substring(0,1)+". "+user.getLastName(), (int)(ww/2-stringSize),100);
                
                g.setFont(scheme.get(0).getHeadingFonts(3));
                g.setColor(scheme.get(0).getParagraphColor(1));
                g.drawString(user.getWork(0).getCompanyName(), (int)(ww/2-stringSize),450);
                g.drawString(user.getWork(1).getCompanyName(), (int)(ww/2-stringSize),475);
                g.drawString(user.getEducation(0).getTitle(), (int)(ww/2-stringSize),500);
                                
                g.setFont(scheme.get(0).getParagraphFonts(1));
                g.setColor(Color.BLUE);
                g.drawString(jay,ww-150, wh-20);
                g.setColor(Color.BLACK);
                
                frame.setBackground(scheme.get(0).getBackgroundColor());
            }
            else if("Print".equals(command)){
                g.setColor(Color.BLACK);
            } 
    }
	
	public static void loadColorScheme() {
		// Scheme
		/**
		menuThemeSelection = 0;
						  
		colorScheme cat = new colorScheme("Default");
		scheme.add(cat);
		
		colorScheme bat = new colorScheme("Midnight", 20, 120, 60);		
		scheme.add(bat);
		
		scheme.add(new colorScheme());
		scheme.add(new colorScheme());
		
		// scheme.add(new colorScheme("123", 20, 20, 160));
		// scheme.add(new colorScheme("456", 20, 20, 160));
		// scheme.add(new colorScheme("789", 20, 20, 160));
		
		scheme.get(0).setColorSchemeTitle("Default");
		scheme.get(1).setColorSchemeTitle("Midnight");
		scheme.get(2).setColorSchemeTitle("Dawn");
		
		
		scheme.set(1,new colorScheme("Midnight", 20, 40, 160));  
		
		
		
		for(int x=0; x<scheme.size(); x++)
			System.out.println(scheme.get(x).getColorSchemeTitle());
		// System.out.println(scheme.size());
		System.out.println("-------------------------------");
							
		System.out.println(cat.getColorSchemeTitle());
		System.out.println(bat.getColorSchemeTitle());
		
		for(int x=1; x<scheme.size() && x<6; x++) {
			if(x == 1)
				colorScheme1.setLabel(scheme.get(x).getColorSchemeTitle());
			else if(x == 2)
				colorScheme2.setLabel(scheme.get(x).getColorSchemeTitle());
			else if(x == 3)
				colorScheme3.setLabel(scheme.get(x).getColorSchemeTitle());
			else if(x == 4)
				colorScheme4.setLabel(scheme.get(x).getColorSchemeTitle());
			else if(x == 5)
				colorScheme5.setLabel(scheme.get(x).getColorSchemeTitle());
			
			// System.out.println(x);
		}
		
		frame.setBackground(scheme.get(0).getBackgroundColor());
		**/
		
		ArrayList<TestList> newList = new ArrayList<TestList>();
		newList.add(new TestList("bat"));
		newList.add(new TestList("blue jay"));
		newList.add(new TestList("cat"));
		newList.add(new TestList("fox"));
		newList.add(new TestList("whale"));
		
		newList.get(1).setWord("blue jay");
		
		//for(int x=0; x<newList.size(); x++)
			//System.out.println(newList.get(x).getWord());
		
		for(TestList tL:newList) 
	        System.out.println(">"+tL);  
	    
		
		
		/**
		ArrayList<String> list = new ArrayList<String>();
		list.add(new String("1. Apple"));
		list.add(new String("2. Banana"));
		list.add(new String("3. Grape"));
		list.add(new String("4. Orange"));
		list.add("5. Pear");
		list.add("6. Peach");
		for(int x=0; x<list.size(); x++)
			System.out.println(list.get(x));
		**/
	}
}

