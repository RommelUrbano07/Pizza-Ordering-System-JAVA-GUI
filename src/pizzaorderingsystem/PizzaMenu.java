 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaorderingsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Margaux
 */
public class PizzaMenu extends javax.swing.JFrame {

    public static StringBuilder adminorder = new StringBuilder();
    public static StringBuilder order = new StringBuilder();
    public static int Price;
    public static int RegPrice;
    public static int LargePrice;
    /**
     * Creates new form PizzaMenu
     */
    public PizzaMenu() {
        initComponents();
        order.append("Order/s\n");
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
        jButton2 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Pepperoni = new javax.swing.JCheckBox();
        Prociutto = new javax.swing.JCheckBox();
        Margherita = new javax.swing.JCheckBox();
        MeatyProject = new javax.swing.JCheckBox();
        HawaiianPizza = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ChiliChicken = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(153, 51, 0));
        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BAKE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(530, 110, 160, 60);

        jLabel38.setBackground(new java.awt.Color(153, 51, 0));
        jLabel38.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Chili. Mozzarella Cheese");
        jLabel38.setOpaque(true);
        jPanel1.add(jLabel38);
        jLabel38.setBounds(1160, 600, 190, 30);

        jLabel37.setBackground(new java.awt.Color(153, 51, 0));
        jLabel37.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Onions, Mozzarella Cheese");
        jLabel37.setOpaque(true);
        jPanel1.add(jLabel37);
        jLabel37.setBounds(1140, 350, 210, 30);

        jLabel36.setBackground(new java.awt.Color(153, 51, 0));
        jLabel36.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Parmesan Cheese");
        jLabel36.setOpaque(true);
        jPanel1.add(jLabel36);
        jLabel36.setBounds(730, 600, 150, 30);

        jLabel35.setBackground(new java.awt.Color(153, 51, 0));
        jLabel35.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Mozzarella Cheese");
        jLabel35.setOpaque(true);
        jPanel1.add(jLabel35);
        jLabel35.setBounds(270, 620, 150, 30);

        jLabel34.setBackground(new java.awt.Color(153, 51, 0));
        jLabel34.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Bacon, BBQ base, ");
        jLabel34.setOpaque(true);
        jPanel1.add(jLabel34);
        jLabel34.setBounds(270, 600, 150, 25);

        jLabel33.setBackground(new java.awt.Color(153, 51, 0));
        jLabel33.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Mozzarella cheese");
        jLabel33.setOpaque(true);
        jPanel1.add(jLabel33);
        jLabel33.setBounds(270, 360, 150, 30);

        jLabel32.setBackground(new java.awt.Color(153, 51, 0));
        jLabel32.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Smoked Ham, Pepperoni, ");
        jLabel32.setOpaque(true);
        jPanel1.add(jLabel32);
        jLabel32.setBounds(270, 540, 198, 30);

        jLabel31.setBackground(new java.awt.Color(153, 51, 0));
        jLabel31.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Italian Sausage, Chicken, ");
        jLabel31.setOpaque(true);
        jPanel1.add(jLabel31);
        jLabel31.setBounds(270, 570, 210, 30);

        jLabel30.setBackground(new java.awt.Color(153, 51, 0));
        jLabel30.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Mozzarella Cheese, ");
        jLabel30.setOpaque(true);
        jPanel1.add(jLabel30);
        jLabel30.setBounds(720, 290, 160, 30);

        jLabel29.setBackground(new java.awt.Color(153, 51, 0));
        jLabel29.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Oregano, Tomato base ");
        jLabel29.setOpaque(true);
        jPanel1.add(jLabel29);
        jLabel29.setBounds(720, 320, 186, 30);

        jLabel28.setBackground(new java.awt.Color(153, 51, 0));
        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Prosciutto, Tomatoes");
        jLabel28.setOpaque(true);
        jPanel1.add(jLabel28);
        jLabel28.setBounds(730, 540, 170, 30);

        jLabel27.setBackground(new java.awt.Color(153, 51, 0));
        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Garlic, Tomato base");
        jLabel27.setOpaque(true);
        jPanel1.add(jLabel27);
        jLabel27.setBounds(730, 570, 160, 30);

        jLabel26.setBackground(new java.awt.Color(153, 51, 0));
        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Pepperoni, Green");
        jLabel26.setOpaque(true);
        jPanel1.add(jLabel26);
        jLabel26.setBounds(1140, 290, 150, 30);

        jLabel25.setBackground(new java.awt.Color(153, 51, 0));
        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Bellpepper, Tomato base");
        jLabel25.setOpaque(true);
        jPanel1.add(jLabel25);
        jLabel25.setBounds(1140, 320, 200, 30);

        jLabel24.setBackground(new java.awt.Color(153, 51, 0));
        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Chicken, Caramelized");
        jLabel24.setOpaque(true);
        jPanel1.add(jLabel24);
        jLabel24.setBounds(1160, 540, 180, 30);

        jLabel23.setBackground(new java.awt.Color(153, 51, 0));
        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Onions, Tomato base");
        jLabel23.setOpaque(true);
        jPanel1.add(jLabel23);
        jLabel23.setBounds(1160, 570, 170, 30);

        jLabel22.setBackground(new java.awt.Color(153, 51, 0));
        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Pineapple, Tomato base,");
        jLabel22.setOpaque(true);
        jPanel1.add(jLabel22);
        jLabel22.setBounds(270, 330, 200, 30);

        jLabel21.setBackground(new java.awt.Color(153, 51, 0));
        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Fresh Smoked Ham,  ");
        jLabel21.setOpaque(true);
        jPanel1.add(jLabel21);
        jLabel21.setBounds(270, 300, 190, 30);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/pizzano3.png"))); // NOI18N
        jPanel1.add(jLabel20);
        jLabel20.setBounds(440, 170, 320, 270);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/pizzano4.png"))); // NOI18N
        jPanel1.add(jLabel19);
        jLabel19.setBounds(450, 440, 280, 270);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/pizzano5.png"))); // NOI18N
        jPanel1.add(jLabel18);
        jLabel18.setBounds(870, 160, 320, 270);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/pizzano2.png"))); // NOI18N
        jPanel1.add(jLabel17);
        jLabel17.setBounds(880, 420, 320, 270);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/pizzano2.png"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(-10, 440, 290, 270);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/pizzano1.png"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(-10, 180, 280, 270);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/pizzalogo.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, 0, 190, 190);

        Pepperoni.setBackground(new java.awt.Color(255, 255, 255));
        Pepperoni.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Pepperoni.setForeground(new java.awt.Color(153, 0, 0));
        Pepperoni.setText("Pepperoni");
        Pepperoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PepperoniActionPerformed(evt);
            }
        });
        jPanel1.add(Pepperoni);
        Pepperoni.setBounds(1170, 220, 130, 50);

        Prociutto.setBackground(new java.awt.Color(255, 255, 255));
        Prociutto.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Prociutto.setForeground(new java.awt.Color(153, 0, 0));
        Prociutto.setText("Prociutto");
        Prociutto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProciuttoActionPerformed(evt);
            }
        });
        jPanel1.add(Prociutto);
        Prociutto.setBounds(730, 470, 160, 50);

        Margherita.setBackground(new java.awt.Color(255, 255, 255));
        Margherita.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Margherita.setForeground(new java.awt.Color(153, 0, 0));
        Margherita.setText("Margherita");
        Margherita.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Margherita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MargheritaActionPerformed(evt);
            }
        });
        jPanel1.add(Margherita);
        Margherita.setBounds(730, 220, 140, 50);

        MeatyProject.setBackground(new java.awt.Color(255, 255, 255));
        MeatyProject.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        MeatyProject.setForeground(new java.awt.Color(153, 0, 0));
        MeatyProject.setText("Meaty Project");
        MeatyProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeatyProjectActionPerformed(evt);
            }
        });
        jPanel1.add(MeatyProject);
        MeatyProject.setBounds(280, 470, 160, 50);

        HawaiianPizza.setBackground(new java.awt.Color(255, 255, 255));
        HawaiianPizza.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        HawaiianPizza.setForeground(new java.awt.Color(153, 0, 0));
        HawaiianPizza.setText("Hawaiian Pizza");
        HawaiianPizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HawaiianPizzaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HawaiianPizzaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HawaiianPizzaMousePressed(evt);
            }
        });
        HawaiianPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HawaiianPizzaActionPerformed(evt);
            }
        });
        jPanel1.add(HawaiianPizza);
        HawaiianPizza.setBounds(280, 230, 170, 50);

        jButton1.setBackground(new java.awt.Color(255, 204, 102));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 0));
        jButton1.setText("Click here to build your own ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(190, 90, 260, 40);

        jButton4.setText("RESET");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(1200, 30, 120, 70);

        jLabel13.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("STEP 1: Choose a Project Pizza's Masterpizza or Build your own Pizza");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(180, 50, 870, 40);

        jLabel11.setBackground(new java.awt.Color(153, 0, 0));
        jLabel11.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("PIZZA PROJECT MENU");
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(460, 0, 480, 50);

        jLabel10.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("STEP 2: Place Your Order!");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(180, 140, 340, 40);

        jButton5.setText("Check Your Orders!");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(770, 110, 160, 70);

        jButton3.setText("LOG OUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1070, 30, 120, 70);

        ChiliChicken.setBackground(new java.awt.Color(255, 255, 255));
        ChiliChicken.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        ChiliChicken.setForeground(new java.awt.Color(153, 0, 0));
        ChiliChicken.setText("Chili Chicken");
        ChiliChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChiliChickenActionPerformed(evt);
            }
        });
        jPanel1.add(ChiliChicken);
        ChiliChicken.setBounds(1160, 480, 160, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(730, 410, 630, 340);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jLabel2.setText("jLabel1");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 630, 340);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jLabel3.setText("jLabel1");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 340, 630, 340);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jLabel4.setText("jLabel1");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 400, 630, 340);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jLabel7.setText("jLabel1");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(620, 60, 630, 340);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jLabel5.setText("jLabel1");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(620, 400, 630, 340);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jLabel6.setText("jLabel1");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(620, 0, 630, 340);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jLabel8.setText("jLabel1");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(730, 0, 630, 340);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jLabel9.setText("jLabel1");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(730, 340, 630, 340);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1355, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PepperoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PepperoniActionPerformed
        if (Pepperoni.isSelected()) {
            order.append("Pepperoni Pizza\n");
            adminorder.append("Pepperoni Pizza;");
            new RegLarge().setVisible(true);
        }
        else
        {
            Pepperoni.setSelected(true);
        }
    }//GEN-LAST:event_PepperoniActionPerformed

    private void MeatyProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeatyProjectActionPerformed
        if (MeatyProject.isSelected()) {
            order.append("MeatyProject Pizza\n");
            adminorder.append("MeatyProject Pizza;");
            new RegLarge().setVisible(true);
        }
        else
        {
            MeatyProject.setSelected(true);
        }

    }//GEN-LAST:event_MeatyProjectActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new CustomizePizza().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new MainMenu().setVisible(true);
        if(Login.logincondition==true){
            Login.logincondition=false;
            JOptionPane.showMessageDialog(rootPane,"You Have been Logged Out");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (HawaiianPizza.isSelected() == false
                && Margherita.isSelected() == false
                && Pepperoni.isSelected() == false
                && MeatyProject.isSelected() == false
                && Prociutto.isSelected() == false
                && ChiliChicken.isSelected() == false) {
            JOptionPane.showMessageDialog(rootPane, "No Items were selected");

        } else {
            SummaryOfOrdersPremade premade = new SummaryOfOrdersPremade();
            order.append("The Total Price is: "+ (RegPrice+LargePrice)+"\n");
            adminorder.append((RegPrice+LargePrice));
            premade.jTextArea1.setText(order.toString());
            premade.setVisible(true);
            this.setVisible(false);
        }
        order.delete(0,order.length());
        adminorder.delete(0,order.length());
        


    }//GEN-LAST:event_jButton2ActionPerformed


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ChiliChicken.setSelected(false);
        HawaiianPizza.setSelected(false);
        Margherita.setSelected(false);
        MeatyProject.setSelected(false);
        Pepperoni.setSelected(false);
        Prociutto.setSelected(false);
        order.delete(0, order.length());
        order.append("Order/s\n");
        adminorder.delete(0, order.length());
        adminorder.append("PREMADE;");
        Price = 0;
        RegPrice = 0;
        LargePrice = 0;
        JOptionPane.showMessageDialog(rootPane, "You have cleared your Cart! ");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void MargheritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MargheritaActionPerformed
        if (Margherita.isSelected()) {
            order.append("Margherita Pizza\n");
            adminorder.append("Margherita Pizza;");
            new RegLarge().setVisible(true);
        }
        else
        {
            Margherita.setSelected(true);
        }
    }//GEN-LAST:event_MargheritaActionPerformed


    private void ProciuttoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProciuttoActionPerformed
        if (Prociutto.isSelected()) {
            order.append("Prociutto Pizza\n");
            adminorder.append("Prociutto Pizza;");
            new RegLarge().setVisible(true);
        }
        else
        {
            Prociutto.setSelected(true);
        }
    }//GEN-LAST:event_ProciuttoActionPerformed


    private void ChiliChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChiliChickenActionPerformed
        if (ChiliChicken.isSelected()) {
            order.append("ChiliChicken Pizza\n");
            adminorder.append("ChiliChicken Pizza;");
            new RegLarge().setVisible(true);
        }
        else
        {
            ChiliChicken.setSelected(true);
        }
    }//GEN-LAST:event_ChiliChickenActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JOptionPane.showMessageDialog(rootPane, order + "\nRegular Pizza's Total Price" + RegPrice + "\n" + 
                "Large Pizza's Total Price" + LargePrice + "\n"+"Total Price: "+(RegPrice+LargePrice)+"\n" );
    }//GEN-LAST:event_jButton5ActionPerformed

    private void HawaiianPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HawaiianPizzaActionPerformed
        if (HawaiianPizza.isSelected()) {
            order.append("Hawaiian Pizza\n");
            adminorder.append("Hawaiian Pizza;");
            new RegLarge().setVisible(true);
        }
        else
        {
            HawaiianPizza.setSelected(true);
        }
    }//GEN-LAST:event_HawaiianPizzaActionPerformed

    private void HawaiianPizzaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HawaiianPizzaMousePressed

    }//GEN-LAST:event_HawaiianPizzaMousePressed

    private void HawaiianPizzaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HawaiianPizzaMouseEntered

    }//GEN-LAST:event_HawaiianPizzaMouseEntered

    private void HawaiianPizzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HawaiianPizzaMouseClicked

    }//GEN-LAST:event_HawaiianPizzaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JCheckBox ChiliChicken;
    public static javax.swing.JCheckBox HawaiianPizza;
    public static javax.swing.JCheckBox Margherita;
    public static javax.swing.JCheckBox MeatyProject;
    public javax.swing.JCheckBox Pepperoni;
    public static javax.swing.JCheckBox Prociutto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
