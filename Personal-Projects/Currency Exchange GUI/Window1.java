import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Window1 implements ActionListener{
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel label;
    private static JTextField input;
    private static JLabel label2;
    private static JTextField input2;
    private static JButton button;
    private static JLabel result;
    public static void main(){
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);


        label = new JLabel("Exchange USD to foreign currency:");
        label.setBounds(10,10,350,50);
        panel.add(label);

        input = new JTextField(5);
        input.setBounds(10,50,165,25);
        panel.add(input);

        label2 = new JLabel("Type a 3 letter currency abbreviation below:");
        label2.setBounds(10,90,300,50);
        panel.add(label2);

        input2 = new JTextField(3);
        input2.setBounds(10,120,165,25);
        panel.add(input2);

        button = new JButton("Enter");
        button.setBounds(10,150,75,25);
        panel.add(button);

        button.addActionListener(new Window1());

        result = new JLabel("");
        result.setBounds(10,170,350,100);
        panel.add(result);

        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String x = input.getText();
        String y = input2.getText();
        Exchange1 ex = new Exchange1();
        double ret = ex.main(x,y);
        String z = String.format("%.2f", ret);
        String s = "";
        if(ret == -1){
            s = "Invalid currency input. Please enter an offered currency.";
        }else{
            s = "Your $" + x + " is " + z + " " + y + ".";
        }
        result.setText(s);
    }
}
