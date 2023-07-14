import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{
    private static JFrame frame;
    private static JLabel label;
    private static JPanel panel;
    private static JButton button1;
    private static JButton button2;
    private static JLabel label2;
    private static JLabel label3;
    private static JLabel label4;
    public static void main(String[] args){
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(400,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        label = new JLabel("Currency Exchange System");
        label.setBounds(10,20,250,25);
        panel.add(label);

        button1 = new JButton("USD to other");
        button2 = new JButton("Other to USD");
        button1.setBounds(10,50,120,30);
        panel.add(button1);
        button2.setBounds(10,80,120,30);
        panel.add(button2);

        button1.addActionListener(new GUI());
        button2.addActionListener(new GUI());

        label2 = new JLabel("The following are valid codes:");
        label2.setBounds(10,110,200,25);
        panel.add(label2);
        label3 = new JLabel("EUR, GBP, INR, AUD, CAD,");
        label3.setBounds(10,130,200,25);
        panel.add(label3);
        label4 = new JLabel("SGD, CHF, JPY, CNY");
        label4.setBounds(10,150,200,25);
        panel.add(label4);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            Window1 w1 = new Window1();
            frame.setVisible(false);
            w1.main();
        }else{
            Window2 w2 = new Window2();
            frame.setVisible(false);
            w2.main();
        }
    }
}
