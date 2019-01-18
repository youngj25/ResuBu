package code;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;
import java.awt.print.*;

public class GUI extends Frame implements Printable, ActionListener{
	/**
	 * File Parameters
	 */
	private static final long serialVersionUID = 1L;
    private static String []Jabout={"A program that will display the battlefield for future game development"};
    private static String command = "";
    private static String jay="Jason A. Young";
    private static  Frame frame;
    private static User_Account user = new User_Account();
    
    
    /**
     * creates a Frame
     */    
    public static void main(String[] args){
        frame = new  GUI();
        frame.setResizable(false);
        frame.setSize(800,700);
        frame.setVisible(true);
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
        
    public int print(Graphics g, PageFormat pf, int page) throws
                                                        PrinterException {

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
            	System.out.println(stringSize);
            	stringSize= stringSize*25/3;
            	System.out.println(stringSize);
            	
                Font k=new Font(g.getFont().getName(),g.getFont().getStyle(),25);
                g.setFont(k);
                g.setColor(Color.BLACK);
                g.drawString(user.getFirstName()+" "+user.getMiddleName().substring(0,1)+". "+user.getLastName(), (int)(ww/2-stringSize),100);
                k=new Font(g.getFont().getName(),g.getFont().getStyle(),12);
                g.setFont(k);
                
                
                g.setColor(Color.BLUE);
                g.drawString(jay,ww-100, wh-20);
                g.setColor(Color.BLACK);
            }
            else if("Print".equals(command)){
                
                    
                g.setColor(Color.BLACK);
                
            }    
            
                
        }
	
}

