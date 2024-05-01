import javax.swing.*;
import java.awt.*;
public class Main{
    public static void main(String[] args) {
           Frame f = new Frame();
           Button b1 = new Button("hit me with your car");
           b1.setBounds(100,50,50,50);
           f.add(b1);
           // Button 2 created
            // Submit button
            Button b2 = new Button("SUBMIT");
            b2.setBounds(100, 101, 50, 50);
            f.add(b2);
        
            // Button 3 created
            // Cancel button
            Button b3 = new Button("CANCEL");
            b3.setBounds(100, 150, 80, 50);
            JColorChooser cc = new JColorChooser();
            cc.add(b3);
            f.add(b3);
    
            f.setSize(500, 500);
            f.setLayout(null);
            f.setVisible(true);
    }
}
       