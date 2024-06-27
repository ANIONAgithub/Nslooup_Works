import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener.*;
import java.net.InetAddress;
import java.awt.event.*;

import javax.swing.*;;

public class Ip_converter {
    private static String re;

    public static void main(String[] args) {
        JFrame jf = new JFrame("Example");
        jf.setSize(300, 400);
        jf.setVisible(true);
        jf.setLayout(null);

        JLabel jl6 = new JLabel("Flexible Nslookup ");
        jl6.setBounds(550, 10, 500, 60);
        jl6.setFont(new Font("", Font.PLAIN, 24));
        jl6.setVisible(true);
        jf.add(jl6);

        JLabel jl3 = new JLabel("Host Name or IP Address");
        jl3.setBounds(500, 260, 300, 70);
        jl3.setFont(new Font("", Font.PLAIN, 20));
        jl3.setVisible(true);
        jf.add(jl3);

        JTextField tf = new JTextField();
        tf.setBounds(500, 325, 300, 40);
        tf.setFont(new Font("", Font.PLAIN, 18));
        tf.setEditable(false);
        tf.setVisible(true);
        jf.add(tf);

        JButton b1 = new JButton("Click ");
        b1.setBounds(550, 470, 150, 40);
        b1.setFont(new Font("", Font.PLAIN, 20));
        b1.setVisible(true);
        jf.add(b1);

        JLabel jl1 = new JLabel();
        jl1.setBounds(450, 400, 1000, 30);
        jl1.setFont(new Font("", Font.PLAIN, 24));
        jl1.setVisible(true);
        jf.add(jl1);

        JLabel jl4 = new JLabel(
                "select Any One Option : ");
        jl4.setBounds(475, 90, 700, 30);
        jl4.setFont(new Font("", Font.PLAIN, 24));
        jl4.setVisible(true);
        jf.add(jl4);

        JCheckBox jc = new JCheckBox("Domain To Ip ");
        jc.setBounds(500, 150, 500, 20);
        jc.setFont(new Font("", Font.PLAIN, 20));
        jf.add(jc);
        jc.setVisible(true);

        JCheckBox jc1 = new JCheckBox("Ip To Domain ");
        jc1.setBounds(500, 200, 500, 30);
        jc1.setFont(new Font("", Font.PLAIN, 20));
        jf.add(jc1);
        jc1.setVisible(true);
        JLabel jl5 = new JLabel();
        jl5.setBounds(500, 350, 1000, 30);
        jl5.setFont(new Font("", Font.PLAIN, 24));
        jl5.setVisible(true);
        jf.add(jl5);

        jc.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(java.awt.event.ItemEvent e) {
                if (e.getStateChange() == 1) {
                    jc1.setSelected(false);
                    re = "ip";
                    tf.setEditable(true);
                }
            }
        });

        jc1.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(java.awt.event.ItemEvent e) {
                if (e.getStateChange() == 1) {
                    jc.setSelected(false);
                    re = "host";
                    tf.setEditable(true);
                }
            }
        });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String ipx = tf.getText();
                String Host = tf.getText();
                try {
                    if (re.toLowerCase().equals("ip")) {

                        String ip = java.net.InetAddress.getByName(Host).getHostAddress();
                        jl1.setText(Host + " Ip Address Is " + ip);
                    } else if (re.toLowerCase().equals("host")) {
                        InetAddress inetAddress = InetAddress.getByName(ipx);
                        String Host_name = inetAddress.getHostName();

                        jl1.setText(ipx + "Domain Name is" + Host);
                    }

                }

                catch (Exception e1) {
                    System.out.println(e1);
                }

            }

        });

    }

}
