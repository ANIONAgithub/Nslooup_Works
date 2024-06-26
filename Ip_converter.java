import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener.*;
import java.net.InetAddress;
import java.util.Scanner;
import java.awt.event.*;

import javax.swing.*;;

public class Ip_converter {
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

        JLabel jl4 = new JLabel(
                "***IF YOU WANT TO SEE HOST NAME TO IP THEN WRITE (IP) or IP TO HOST NAME THEN WRITE (HOST) *** ");
        jl4.setBounds(400, 90, 700, 30);
        jl4.setVisible(true);
        jf.add(jl4);

        JLabel jl5 = new JLabel("WRITE IP OR HOST (ANY ONE)");
        jl5.setBounds(500, 140, 500, 30);
        jl5.setVisible(true);
        jl5.setFont(new Font("", Font.PLAIN, 18));
        jf.add(jl5);

        JTextField tf1 = new JTextField();
        tf1.setBounds(500, 180, 300, 40);
        tf1.setFont(new Font("", Font.PLAIN, 18));
        tf1.setVisible(true);
        jf.add(tf1);

        JLabel jl3 = new JLabel("Host Name or IP Address");
        jl3.setBounds(500, 240, 300, 70);
        jl3.setFont(new Font("", Font.PLAIN, 20));
        jl3.setVisible(true);
        jf.add(jl3);

        JTextField tf = new JTextField();
        tf.setBounds(500, 300, 300, 40);
        tf.setFont(new Font("", Font.PLAIN, 18));
        tf.setVisible(true);
        jf.add(tf);

        JButton b1 = new JButton("Click ");
        b1.setBounds(570, 400, 150, 40);
        b1.setFont(new Font("", Font.PLAIN, 20));
        b1.setVisible(true);
        jf.add(b1);

        JLabel jl1 = new JLabel();
        jl1.setBounds(500, 350, 1000, 30);
        jl1.setFont(new Font("", Font.PLAIN, 18));
        jl1.setVisible(true);
        jf.add(jl1);

        JCheckBox jc = new JCheckBox("Host To Ip ");
        jc.setBounds(500, 490, 100, 20);
        jf.add(jc);
        jc.setVisible(true);

        JCheckBox jc1 = new JCheckBox("Ip To Host");
        jc1.setBounds(500, 450, 500, 30);
        jf.add(jc1);
        jc1.setVisible(true);

        // b1.addActionListener(new ActionListener(){
        // public void actionPerformed(ActionEvent e){

        // jc.addItemListener(new ItemListener() {

        // @Override
        // public void itemStateChanged(java.awt.event.ItemEvent e) {
        // Scanner sc= new Scanner(System.in);

        // try{
        // String ipx =tf.getText();
        // String Host =tf.getText();
        // String Decition = tf1.getText();

        // if(e.getStateChange()==1){

        // String ip =java.net.InetAddress.getByName(Host).getHostAddress();
        // jl1.setText(ip + " Address of "+ Host );
        // jc1.setSelected(false);
        // }

        // }

        // catch(Exception e1){
        // System.out.println(e1);

        // }
        // }
        // });

        // jc1.addItemListener(new ItemListener() {

        // @Override
        // public void itemStateChanged(java.awt.event.ItemEvent e) {
        // try{
        // String ipx =tf.getText();
        // String Host =tf.getText();
        // String Decition = tf1.getText();

        // if(e.getStateChange()==1){
        // InetAddress inetAddress = InetAddress.getByName(ipx);
        // String Host_name =inetAddress.getHostName();
        // jl1.setText(Host_name +"Address is "+ipx);
        // jc.setSelected(false);
        // }
        // }

        // catch(Exception e1){
        // System.out.println(e1);

        // }
        // }
        // });

        // }
        // });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ipx = tf.getText();
                String Host = tf.getText();
                String Decition = tf1.getText();
                try {

                    if (Decition.toLowerCase().equals("ip")) {
                        String ip = java.net.InetAddress.getByName(Host).getHostAddress();
                        jl1.setText(ip + "  Address of  " + Host);
                    } else if (Decition.toLowerCase().equals("host")) {
                        InetAddress inetAddress = InetAddress.getByName(ipx);
                        String Host_name = inetAddress.getHostName();
                        jl1.setText(Host_name + "Address is " + ipx);
                    } else {
                        System.out.println("Kindly check your input information ");
                    }

                }

                catch (Exception ei) {
                    System.out.println(ei);
                }

            }

        });

    }

}
