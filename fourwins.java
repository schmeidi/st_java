import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 27.10.2012
  * @author 
  */

public class fourwins extends Frame {
  // Anfang Attribute
  
  private Button button1 = new Button();
  private Button button2 = new Button();
  // Ende Attribute
  
  
  public fourwins(String title) { 
    // Frame-Initialisierung
    super(title);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) { dispose(); }
    });
    int frameWidth = 715; 
    int frameHeight = 430;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Panel cp = new Panel(null);
    add(cp);
    
    // Komponenten
    // Restartbutton
    button1.setBounds(568, 360, 129, 33);
    button1.setLabel("Neustart");
    button1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button1_ActionPerformed(evt);
      }
    });
    cp.add(button1);
    // Ende Restartbutton
    
    // Anfang Beendenbutton
    button2.setBounds(432, 360, 129, 33);
    button2.setLabel("Beenden");
    button2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button2_ActionPerformed(evt);
      }
    });
    cp.add(button2);
    // Ende Beendenbutton
    // Ende Komponenten
    
    setVisible(true);
  } // end of public fourwins
  
  // Anfang Methoden
  
  public void button1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of button1_ActionPerformed
  
  public void button2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of button2_ActionPerformed

  // Ende Methoden
  
  public static void main(String[] args) {
    new fourwins("fourwins");
  } // end of main
  
} // end of class fourwins

private class HandlerClass implements MousListener, MouseMotionListener {
        public void mouseClicked (MouseEvent event) { 
        
        }
}
