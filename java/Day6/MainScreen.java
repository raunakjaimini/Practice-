package Day6;

import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;

public class MainScreen  extends JFrame{

    public MainScreen() throws HeadlesssException{
        createNavButtonsPanel();

    }
    public void createNavButtonsPanel(){
        JPanel p1 = new JPanel();
        TitledBorder titledBorder = BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(GRAY,1),"Navigation Buttons", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION);
            p1.setBorder(titledBorder);
        
    }
    public static void main(Stringp[] args){
        MainScreen mainScreen = new MainScreen
    }
        
    }
    
}
