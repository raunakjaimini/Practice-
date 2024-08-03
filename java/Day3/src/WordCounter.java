import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class WordCounter {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("Word Counter");
        jframe.setLayout(null);
        jframe.setBounds(100,100,500,500);
        jframe.setVisible(true);
        JTextArea textArea = new JTextArea();
        textArea.setBounds(50,50,300,200);
        JButton button = new JButton("Check");
        button.setBounds(180,300,100,30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                if (!text.equals("")){
                    String[] words = text.split("\\s");
                    JOptionPane.showMessageDialog(jframe,"Total words:"+words.length);
                }
            }
        });
        jframe.add(textArea);
        jframe.add(button);
    }
}