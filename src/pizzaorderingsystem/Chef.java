/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaorderingsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Chef extends javax.swing.JFrame {

    StringBuilder chefOrders = new StringBuilder();

    /**
     * Creates new form Chef
     */
    public Chef() {
        initComponents();
        String file = "C:\\Users\\Asus\\Downloads\\Compressed\\PizzaOrderingSystem\\src\\pizzaorderingsystem\\OrderSummaryPreMade.txt";
        String line = null;
        if (Admin.area1 == true) {

            try (BufferedReader br2 = new BufferedReader(new FileReader(file))) {
                while ((line = br2.readLine()) != null) {
                    String[] values = line.split(";");
                    for (String value : values) {
                        chefOrders.append(value + "\n");
                    }
                    jTextArea3.setText(chefOrders + "");
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(rootPane, "Error Reading File");
            }
            System.out.println("Checkpoint");
        }

        String file2 = "C:\\Users\\Asus\\Downloads\\Compressed\\PizzaOrderingSystem\\src\\pizzaorderingsystem\\OrderSummaryCustomized.txt";
        String line2 = null;
        if (Admin.area2 == true) {

            try (BufferedReader br1 = new BufferedReader(new FileReader(file2))) {
                while ((line2 = br1.readLine()) != null) {
                    String[] values = line2.split(";");
                    for (String value : values) {
                        chefOrders.append(value + "\n");
                    }
                    jTextArea2.setText(chefOrders + "");
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(rootPane, "Error Reading File");
            }
            System.out.println("Checkpoint");
        }
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setLayout(null);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(200, 390, 560, 280);

        jButton3.setText("Back to Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(40, 380, 120, 23);

        jLabel11.setBackground(new java.awt.Color(153, 0, 0));
        jLabel11.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CHEF'S LIST OF ORDERS");
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(360, 20, 550, 50);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(200, 90, 560, 260);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/pizzalogo.png"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(0, 0, 190, 190);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/chefpizza3.png"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(0, 0, 1150, 750);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(510, 0, 630, 340);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jLabel2.setText("jLabel1");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 370, 630, 340);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jLabel5.setText("jLabel1");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 200, 630, 340);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jLabel4.setText("jLabel1");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 630, 340);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(260, 200, 166, 96);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1135, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.setVisible(false);
       new MainMenu().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Chef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chef().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    public static javax.swing.JTextArea jTextArea2;
    public static javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}