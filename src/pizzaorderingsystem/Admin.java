/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaorderingsystem;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Admin extends javax.swing.JFrame {

    public static StringBuilder orderadmin = new StringBuilder();
    public static boolean area1 = false;
    public static boolean area2 = false;
    StringBuilder sbf = new StringBuilder();
    public static int price = PizzaMenu.Price;
    public static String file = "C:\\Users\\Asus\\Downloads\\Compressed\\PizzaOrderingSystem\\src\\pizzaorderingsystem\\OrderSummaryPreMade.txt";
    public static String file2 = "C:\\Users\\Asus\\Downloads\\Compressed\\PizzaOrderingSystem\\src\\pizzaorderingsystem\\OrderSummaryCustomized.txt";
    public static String file3 = "C:\\Users\\Asus\\Downloads\\Compressed\\PizzaOrderingSystem\\src\\pizzaorderingsystem\\Registry.txt";
    public static boolean clear = false;
    public static double finalprice = 0;
    public static int  pointer=0;

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel11.setBackground(new java.awt.Color(153, 0, 0));
        jLabel11.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ADMIN");
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(390, 50, 190, 50);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/pizzalogo.png"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(0, 0, 190, 190);

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("COMPUTE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(670, 410, 160, 50);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("AMOUNT");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(660, 160, 180, 50);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(200, 160, 370, 370);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Total Price:");
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(660, 230, 180, 60);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TYPE OF PIZZA", "PREMADE", "CUSTOM" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(30, 220, 150, 50);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(660, 310, 180, 70);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(60, 360, 90, 50);

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("DISPLAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 420, 140, 50);

        jButton4.setBackground(new java.awt.Color(153, 0, 0));
        jButton4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(30, 490, 140, 50);

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("PAID");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(680, 470, 140, 50);

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ORDER #");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 290, 150, 60);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/chefpizza3.png"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(-10, -10, 1140, 830);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 340, 630, 340);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jLabel5.setText("jLabel1");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 630, 340);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jLabel6.setText("jLabel1");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 630, 340);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jLabel4.setText("jLabel1");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 490, 630, 340);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1071, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String OrderNumber = jTextField5.getText();
        System.out.println(Login.UserIndex + "UserIndex");
        try {
            BufferedReader premade = new BufferedReader(new FileReader(file));
            BufferedReader customized = new BufferedReader(new FileReader(file2));
            BufferedWriter var = new BufferedWriter(new FileWriter("C:\\Users\\Asus\\Downloads\\Compressed\\PizzaOrderingSystem\\src\\pizzaorderingsystem\\Sample.txt"));
            String line = "";
            String line2 = "";
            String orderline = "";
            switch (jComboBox1.getSelectedIndex()) {
                case 0:
                    JOptionPane.showMessageDialog(rootPane, "Type of Pizza not Selected!");
                    break;
                case 1:
                    int num = 0;
                    while ((line = premade.readLine()) != null) {

                        String values[] = line.split(";");
                        if (OrderNumber.equals(values[0])) {
                            jTextField3.setText(values[values.length - 1]);
                            for (int i = 0; i < values.length; i++) {
                                orderadmin.append(values[i] + "\n");
                                orderline = orderline + values[i] + ";";
                            }
                        }
                            
                        num++;
                    }

                    System.out.println(orderline + "");
                    jTextArea2.setText(orderadmin + "");
                    String[] sub = orderline.split(";");
                    var.write(sub[sub.length - 1]);
                    num = 0;
                    break;
                case 2:
                    int num2 = 0;
                    while ((line2 = customized.readLine()) != null) {

                        String values[] = line.split(";");
                        if (OrderNumber.equals(values[0])) {
                            jTextField3.setText(values[values.length - 1]);
                            for (int i = 0; i < values.length; i++) {
                                orderadmin.append(values[i] + "\n");

                                orderline = orderline + values[i] + ";";
                            }

                        }

                        num2++;
                    }
                    System.out.println(orderline + "");
                    jTextArea2.setText(orderadmin + "");
                    String[] sub2 = orderline.split(";");
                    var.write(sub2[sub2.length - 1]);
                    num = 0;

                    var.close();
                    break;
                default:
                    break;
            }

            jTextArea2.setText(orderadmin + "");
            orderadmin.delete(0, orderadmin.length());

        } catch (Exception e) {

        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            int Amount = Integer.parseInt(jTextField1.getText());
            Double TotalPrice = Double.parseDouble(jTextField3.getText());
            jTextField4.setText(Amount - TotalPrice + "");
            if ((Amount - TotalPrice) < 0) {
                JOptionPane.showMessageDialog(rootPane, "Insufficient Amount Entered, Try Again");
                jTextField1.setText("");
                jTextField4.setText("");
            } else {
                clear = true;
                finalprice = Amount - TotalPrice;
                BufferedWriter bfw = new BufferedWriter(new FileWriter("C:\\Users\\Asus\\Downloads\\Compressed\\PizzaOrderingSystem\\src\\pizzaorderingsystem\\Sample.txt"));
                bfw.write(finalprice + "");
                bfw.close();
            }
        } catch (HeadlessException | IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Invalid Entries, Check Inputs, Must only be Numbers");
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       area1 = true;
        area2 = true;
        String pointsindex = "C:\\Users\\Asus\\Downloads\\Compressed\\PizzaOrderingSystem\\src\\pizzaorderingsystem\\PointsIndex.txt";
        String registry = "C:\\Users\\Asus\\Downloads\\Compressed\\PizzaOrderingSystem\\src\\pizzaorderingsystem\\Registry.txt";

        if (clear == true) {
            if (Login.logincondition == true) {
                Login.logincondition = false;
                Login.UserIndex = 0;
                JOptionPane.showMessageDialog(rootPane, "User has been Logged Out");
                System.out.println("Checkpoint");
                try {
                    BufferedReader regread = new BufferedReader(new FileReader(registry));
                    BufferedWriter indexwrite = new BufferedWriter(new FileWriter(pointsindex));
                    String line = null;
                    int i = 0;
                    while ((line = regread.readLine()) != null) {
                        System.out.println(Login.UserIndex);
                        if (i == pointer) {
                            System.out.println(line + "Check");
                            String[] values = line.split(";");
                            
                            int number = Integer.parseInt(values[values.length - 1]);
                            for (int j = 0; j < values.length; j++) {
                                if (j + 1 == values.length) {
                                    sbf.append((number + (price/ 50)) + "");
                                    System.out.println("Points" + number + price/50);
                                } else {
                                    sbf.append(values[j] + ";");
                                }
                            }
                            sbf.append("\n");
                        } else {
                            String[] values = line.split(";");
                            for (int j = 0; j < values.length; j++) {
                                if (j + 1 == values.length) {

                                    System.out.println("Passed");
                                    sbf.append(values[j] + "");
                                } else {
                                    sbf.append(values[j] + ";");
                                }
                            }
                            sbf.append("\n");
                        }

                        System.out.println(line);
                        i++;
                    }
                    indexwrite.write(sbf + "");
                    System.out.println(sbf + "");
                    indexwrite.close();
                    sbf.delete(0, sbf.length());
                    Login.UserIndex = 0;
                    Login.logincondition = false;
                    new Chef().setVisible(true);
                    jComboBox1.setSelectedIndex(0);
                    jTextField1.setText("");
                    jTextField3.setText("");
                    
                    jTextField4.setText("");
                    jTextField5.setText("");
                    jTextArea2.setText("");
                } catch (Exception e) {
                }
                try {
                    BufferedReader regread = new BufferedReader(new FileReader(pointsindex));
                    BufferedWriter indexwrite = new BufferedWriter(new FileWriter(registry));
                    String line = null;
                    while ((line = regread.readLine()) != null) {
                        String[] val = line.split(";");
                        for (int j = 0; j < val.length; j++) {
                            if (j + 1 == val.length) {
                                indexwrite.write(val[j] + "");
                            } else {
                                indexwrite.write(val[j] + ";");
                            }
                        }
                        indexwrite.newLine();
                    }
                    indexwrite.close();

                } catch (Exception e) {
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Thank You, Next");
            }
            this.setVisible(false);
            new Chef().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Check Customer Payment");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextArea2.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        jTextField3.setText("");
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
