/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyInputForm;

/**
 *
 * @author rian
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MyInputForm_AgusSalimH_1941723007 extends JFrame {

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JPanel panel;

    public MyInputForm_AgusSalimH_1941723007() {
        createTextField();
        createButton();
        createPanle();
        setSize(FRAME_WIDTH, FRAME_WIDTH);
    }
// Percobaan ke dua
//    urutan berpengarus ke tampilan add dulu dari kiri

    private void createTextField() {
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai C: ");
        cLabel = new JLabel("Hasil: ");

        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }

    private void createButton() {
        button = new JButton("Calculate");
        class AddInterestListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil; " + c);
            }

        }
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }

    private void createPanle() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(cLabel);
        add(panel);
    }

//    private void setSize(int FRAME_WIDTH, int FRAME_WIDTH0) {
//        
//    }

//    private void add(JPanel panel) {
//        
//    }

}
