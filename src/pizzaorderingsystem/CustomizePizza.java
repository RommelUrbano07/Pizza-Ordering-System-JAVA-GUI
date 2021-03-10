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
public class CustomizePizza extends javax.swing.JFrame {

    public static int price = 0;
    int vallarge = 0;
    int valreg = 0;
    StringBuilder order = new StringBuilder();
    public static StringBuilder adminorder = new StringBuilder();
    boolean returnvarReg = false;
    boolean returnvarLarge = false;

    /**
     * Creates new form CustomizePizza
     */
    public CustomizePizza() {
        initComponents();
    }

    public boolean Sauce(boolean x) {
        order.append("Order Number: "+SummaryOfOrdersCustom.Order+"\n");
        order.append("Order:\n");
        order.append("  Sauce: \n");
        adminorder.append(SummaryOfOrdersCustom.Order+";");
        adminorder.append("Order:;");
        adminorder.append("Sauce:;");
        if (Barbeque.isSelected()) {
            order.append("      BBQ \n\n");
            adminorder.append("BBQ;");
            x = true;
        } else if (Red.isSelected()) {
            order.append("      Red \n\n");
            adminorder.append("Red;");
            x = true;
        } else if (White.isSelected()) {
            order.append("      White \n\n");
            adminorder.append("White;");
            x = true;
        } else if (Pesto.isSelected()) {
            order.append("      Pesto \n\n");
            adminorder.append("Pesto;");
            x = true;
        } else if (OliveOil.isSelected()) {
            order.append("      Olive Oil \n\n");
            adminorder.append("Olive Oil;");
            x = true;
        } else {
            x = false;
            return x;
        }
        return x;
    }

    public boolean Toppings(boolean y) {
        order.append("  Toppings: \n");
        adminorder.append("Toppings:;");
        if (MozzarellaCheese.isSelected()) {
            order.append("      Mozzarella Cheese;");
            adminorder.append("Mozzarella Cheese;");
            y = true;
        }
        if (ParmesanCheese.isSelected()) {
            order.append("      Parmesan Cheese \n");
            adminorder.append("Parmesan Cheese;");
            y = true;
        }
        if (FetaCheese.isSelected()) {
            order.append("      Feta Cheese \n");
            adminorder.append("Feta Cheese;");
            y = true;
        }
        if (GorgonzolaCheese.isSelected()) {
            order.append("Gorgonzola Cheese \n");
            adminorder.append("Gorgonzola Cheese;");
            y = true;
        }
        if (RicottaCheese.isSelected()) {
            order.append("      Ricotta Cheese \n");
            adminorder.append("Ricotta Cheese;");
            y = true;
        }
        if (Pepperoni.isSelected()) {
            order.append("      Pepperoni \n");
            adminorder.append("Pepperoni;");
            y = true;
        }
        if (Anchovies.isSelected()) {
            order.append("      Anchovies \n");
            adminorder.append("Anchovies;");
            y = true;
        }
        if (Meatball.isSelected()) {
            order.append("      Meatball \n");
            adminorder.append("Meatbal;");
            y = true;
        }
        if (Tuna.isSelected()) {
            order.append("      Tuna \n");
            adminorder.append("Tuna;");
            y = true;
        }
        if (Ham.isSelected()) {
            order.append("      Ham \n");
            adminorder.append("Ham;");
            y = true;
        }
        if (Bacon.isSelected()) {
            order.append("      Bacon \n");
            adminorder.append("Bacon;");
            y = true;
        }
        if (Prosciutto.isSelected()) {
            order.append("      Prosciutto \n");
            adminorder.append("Prosciutto;");
            y = true;
        }
        if (Chicken.isSelected()) {
            order.append("      Chicken \n");
            adminorder.append("Chicken;");
            y = true;
        }
        if (SpicyItalianSausage.isSelected()) {
            order.append("      Spicy Italian Sausage \n");
            adminorder.append("Spicy Italian Sausage;");
            y = true;
        }
        if (GreenBellPepper.isSelected()) {
            order.append("      Green Bellpepper \n");
            adminorder.append("Green Bellpepper;");
            y = true;
        }
        if (FreshMushrooms.isSelected()) {
            order.append("      Fresh Mushrooms \n");
            adminorder.append("Fresh Mushrooms;");
            y = true;
        }
        if (RedOnions.isSelected()) {
            order.append("      Red Onions \n");
            adminorder.append("Red Onions;");
            y = true;
        }
        if (RoastedRedBellpepper.isSelected()) {
            order.append("      Roasted Red Bellpepper \n");
            adminorder.append("Roasted Red Bellpepper;");
            y = true;
        }
        if (BlackOlives.isSelected()) {
            order.append("      Black Olives \n");
            adminorder.append("Black Olives;");
            y = true;
        }
        if (Pineapple.isSelected()) {
            order.append("      Pineapple \n");
            adminorder.append("Pineapple;");
            y = true;
        }
        if (CaramelizedOnions.isSelected()) {
            order.append("      Caramelized Onions \n");
            adminorder.append("Caramelized Onions;");
            y = true;
        }
        if (Jalapeno.isSelected()) {
            order.append("      Jalapeno \n");
            adminorder.append("Jalapeno;");
            y = true;
        }
        if (Rosemary.isSelected()) {
            order.append("      Rosemary \n");
            adminorder.append("Rosemary;");
            y = true;
        }
        if (Cilantro.isSelected()) {
            order.append("      Cilantro \n");
            adminorder.append("Cilantro;");
            y = true;
        }
        if (Basil.isSelected()) {
            order.append("      Basil \n");
            adminorder.append("Basil;");
            y = true;
        }
        if (Broccoli.isSelected()) {
            order.append("      Broccoli \n");
            adminorder.append("Broccoli;");
            y = true;
        }
        if (Artichokes.isSelected()) {
            order.append("      Artichokes \n");
            adminorder.append("Artichokes;");
            y = true;
        }
        if (Tomato.isSelected()) {
            order.append("      Tomato \n");
            adminorder.append("Tomato;");
            y = true;
        }
        if (Corn.isSelected()) {
            order.append("      Corn \n");
            adminorder.append("Corn;");
            y = true;
        }
        if (Garlic.isSelected()) {
            order.append("      Garlic \n");
            adminorder.append("Garlic;");
            y = true;
        }
        order.append("\n");
        return y;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        GreenBellPepper = new javax.swing.JRadioButton();
        FreshMushrooms = new javax.swing.JRadioButton();
        RedOnions = new javax.swing.JRadioButton();
        Tomato = new javax.swing.JRadioButton();
        BlackOlives = new javax.swing.JRadioButton();
        CaramelizedOnions = new javax.swing.JRadioButton();
        Garlic = new javax.swing.JRadioButton();
        Corn = new javax.swing.JRadioButton();
        RoastedRedBellpepper = new javax.swing.JRadioButton();
        Artichokes = new javax.swing.JRadioButton();
        Pineapple = new javax.swing.JRadioButton();
        Jalapeno = new javax.swing.JRadioButton();
        Cilantro = new javax.swing.JRadioButton();
        Rosemary = new javax.swing.JRadioButton();
        Basil = new javax.swing.JRadioButton();
        Broccoli = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        Pepperoni = new javax.swing.JRadioButton();
        Ham = new javax.swing.JRadioButton();
        Bacon = new javax.swing.JRadioButton();
        Meatball = new javax.swing.JRadioButton();
        SpicyItalianSausage = new javax.swing.JRadioButton();
        Anchovies = new javax.swing.JRadioButton();
        Prosciutto = new javax.swing.JRadioButton();
        Chicken = new javax.swing.JRadioButton();
        Tuna = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        MozzarellaCheese = new javax.swing.JRadioButton();
        ParmesanCheese = new javax.swing.JRadioButton();
        FetaCheese = new javax.swing.JRadioButton();
        GorgonzolaCheese = new javax.swing.JRadioButton();
        RicottaCheese = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        White = new javax.swing.JRadioButton();
        Pesto = new javax.swing.JRadioButton();
        OliveOil = new javax.swing.JRadioButton();
        Red = new javax.swing.JRadioButton();
        Barbeque = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        LargeSpinner = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        RegularSpinner = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jButton3.setText("RESET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1080, 620, 100, 40);

        jLabel16.setBackground(new java.awt.Color(204, 102, 0));
        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Fresh from the hot oven!");
        jLabel16.setOpaque(true);
        jPanel1.add(jLabel16);
        jLabel16.setBounds(1070, 490, 240, 40);

        jLabel15.setBackground(new java.awt.Color(204, 102, 0));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("3 minutes cooking time");
        jLabel15.setOpaque(true);
        jPanel1.add(jLabel15);
        jLabel15.setBounds(1070, 450, 240, 40);

        jButton1.setBackground(new java.awt.Color(153, 51, 0));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BAKE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1110, 550, 160, 60);

        jLabel14.setFont(new java.awt.Font("Century", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 0));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/pizzalogo.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, 0, 190, 180);

        GreenBellPepper.setBackground(new java.awt.Color(255, 153, 0));
        GreenBellPepper.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        GreenBellPepper.setForeground(new java.awt.Color(51, 0, 0));
        GreenBellPepper.setText("Green Bellpepper");
        GreenBellPepper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreenBellPepperActionPerformed(evt);
            }
        });
        jPanel1.add(GreenBellPepper);
        GreenBellPepper.setBounds(10, 520, 240, 40);

        FreshMushrooms.setBackground(new java.awt.Color(255, 153, 0));
        FreshMushrooms.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        FreshMushrooms.setForeground(new java.awt.Color(51, 0, 0));
        FreshMushrooms.setText("Fresh Mushrooms");
        FreshMushrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FreshMushroomsActionPerformed(evt);
            }
        });
        jPanel1.add(FreshMushrooms);
        FreshMushrooms.setBounds(250, 520, 240, 40);

        RedOnions.setBackground(new java.awt.Color(255, 153, 0));
        RedOnions.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        RedOnions.setForeground(new java.awt.Color(51, 0, 0));
        RedOnions.setText("Red Onions");
        RedOnions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedOnionsActionPerformed(evt);
            }
        });
        jPanel1.add(RedOnions);
        RedOnions.setBounds(490, 520, 170, 40);

        Tomato.setBackground(new java.awt.Color(255, 153, 0));
        Tomato.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Tomato.setForeground(new java.awt.Color(51, 0, 0));
        Tomato.setText("Tomato");
        Tomato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TomatoActionPerformed(evt);
            }
        });
        jPanel1.add(Tomato);
        Tomato.setBounds(530, 600, 130, 40);

        BlackOlives.setBackground(new java.awt.Color(255, 153, 0));
        BlackOlives.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        BlackOlives.setForeground(new java.awt.Color(51, 0, 0));
        BlackOlives.setText("Black Olives");
        BlackOlives.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlackOlivesActionPerformed(evt);
            }
        });
        jPanel1.add(BlackOlives);
        BlackOlives.setBounds(10, 560, 180, 40);

        CaramelizedOnions.setBackground(new java.awt.Color(255, 153, 0));
        CaramelizedOnions.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        CaramelizedOnions.setForeground(new java.awt.Color(51, 0, 0));
        CaramelizedOnions.setText("Caramelized Onions");
        CaramelizedOnions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaramelizedOnionsActionPerformed(evt);
            }
        });
        jPanel1.add(CaramelizedOnions);
        CaramelizedOnions.setBounds(340, 560, 270, 40);

        Garlic.setBackground(new java.awt.Color(255, 153, 0));
        Garlic.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Garlic.setForeground(new java.awt.Color(51, 0, 0));
        Garlic.setText("Garlic");
        Garlic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GarlicActionPerformed(evt);
            }
        });
        jPanel1.add(Garlic);
        Garlic.setBounds(750, 600, 130, 40);

        Corn.setBackground(new java.awt.Color(255, 153, 0));
        Corn.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Corn.setForeground(new java.awt.Color(51, 0, 0));
        Corn.setText("Corn");
        Corn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CornActionPerformed(evt);
            }
        });
        jPanel1.add(Corn);
        Corn.setBounds(660, 600, 90, 40);

        RoastedRedBellpepper.setBackground(new java.awt.Color(255, 153, 0));
        RoastedRedBellpepper.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        RoastedRedBellpepper.setForeground(new java.awt.Color(51, 0, 0));
        RoastedRedBellpepper.setText("Roasted Red Bellpepper");
        RoastedRedBellpepper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoastedRedBellpepperActionPerformed(evt);
            }
        });
        jPanel1.add(RoastedRedBellpepper);
        RoastedRedBellpepper.setBounds(660, 520, 320, 40);

        Artichokes.setBackground(new java.awt.Color(255, 153, 0));
        Artichokes.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Artichokes.setForeground(new java.awt.Color(51, 0, 0));
        Artichokes.setText("Artichokes");
        Artichokes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtichokesActionPerformed(evt);
            }
        });
        jPanel1.add(Artichokes);
        Artichokes.setBounds(370, 600, 160, 40);

        Pineapple.setBackground(new java.awt.Color(255, 153, 0));
        Pineapple.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Pineapple.setForeground(new java.awt.Color(51, 0, 0));
        Pineapple.setText("Pineapple");
        Pineapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PineappleActionPerformed(evt);
            }
        });
        jPanel1.add(Pineapple);
        Pineapple.setBounds(190, 560, 150, 40);

        Jalapeno.setBackground(new java.awt.Color(255, 153, 0));
        Jalapeno.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Jalapeno.setForeground(new java.awt.Color(51, 0, 0));
        Jalapeno.setText("Jalapeño");
        Jalapeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JalapenoActionPerformed(evt);
            }
        });
        jPanel1.add(Jalapeno);
        Jalapeno.setBounds(610, 560, 140, 40);

        Cilantro.setBackground(new java.awt.Color(255, 153, 0));
        Cilantro.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Cilantro.setForeground(new java.awt.Color(51, 0, 0));
        Cilantro.setText("Cilantro");
        Cilantro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CilantroActionPerformed(evt);
            }
        });
        jPanel1.add(Cilantro);
        Cilantro.setBounds(900, 560, 130, 40);

        Rosemary.setBackground(new java.awt.Color(255, 153, 0));
        Rosemary.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Rosemary.setForeground(new java.awt.Color(51, 0, 0));
        Rosemary.setText("Rosemary");
        Rosemary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RosemaryActionPerformed(evt);
            }
        });
        jPanel1.add(Rosemary);
        Rosemary.setBounds(750, 560, 150, 40);

        Basil.setBackground(new java.awt.Color(255, 153, 0));
        Basil.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Basil.setForeground(new java.awt.Color(51, 0, 0));
        Basil.setText("Basil");
        Basil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasilActionPerformed(evt);
            }
        });
        jPanel1.add(Basil);
        Basil.setBounds(150, 600, 90, 40);

        Broccoli.setBackground(new java.awt.Color(255, 153, 0));
        Broccoli.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Broccoli.setForeground(new java.awt.Color(51, 0, 0));
        Broccoli.setText("Broccoli");
        Broccoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BroccoliActionPerformed(evt);
            }
        });
        jPanel1.add(Broccoli);
        Broccoli.setBounds(240, 600, 130, 40);

        jLabel13.setBackground(new java.awt.Color(0, 102, 0));
        jLabel13.setFont(new java.awt.Font("Century", 1, 26)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("VEGGIE set go!");
        jLabel13.setOpaque(true);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 460, 210, 40);

        Pepperoni.setBackground(new java.awt.Color(255, 153, 0));
        Pepperoni.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Pepperoni.setForeground(new java.awt.Color(51, 0, 0));
        Pepperoni.setText("Pepperoni");
        Pepperoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PepperoniActionPerformed(evt);
            }
        });
        jPanel1.add(Pepperoni);
        Pepperoni.setBounds(10, 370, 150, 40);

        Ham.setBackground(new java.awt.Color(255, 153, 0));
        Ham.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Ham.setForeground(new java.awt.Color(51, 0, 0));
        Ham.setText("Ham (Canadian Bacon)");
        Ham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HamActionPerformed(evt);
            }
        });
        jPanel1.add(Ham);
        Ham.setBounds(560, 370, 330, 40);

        Bacon.setBackground(new java.awt.Color(255, 153, 0));
        Bacon.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Bacon.setForeground(new java.awt.Color(51, 0, 0));
        Bacon.setText("Bacon");
        Bacon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaconActionPerformed(evt);
            }
        });
        jPanel1.add(Bacon);
        Bacon.setBounds(890, 370, 110, 40);

        Meatball.setBackground(new java.awt.Color(255, 153, 0));
        Meatball.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Meatball.setForeground(new java.awt.Color(51, 0, 0));
        Meatball.setText("Meatball");
        Meatball.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeatballActionPerformed(evt);
            }
        });
        jPanel1.add(Meatball);
        Meatball.setBounds(320, 370, 140, 40);

        SpicyItalianSausage.setBackground(new java.awt.Color(255, 153, 0));
        SpicyItalianSausage.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        SpicyItalianSausage.setForeground(new java.awt.Color(51, 0, 0));
        SpicyItalianSausage.setText("Spicy Italian Sausage");
        SpicyItalianSausage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpicyItalianSausageActionPerformed(evt);
            }
        });
        jPanel1.add(SpicyItalianSausage);
        SpicyItalianSausage.setBounds(490, 410, 280, 40);

        Anchovies.setBackground(new java.awt.Color(255, 153, 0));
        Anchovies.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Anchovies.setForeground(new java.awt.Color(51, 0, 0));
        Anchovies.setText("Anchovies");
        Anchovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnchoviesActionPerformed(evt);
            }
        });
        jPanel1.add(Anchovies);
        Anchovies.setBounds(160, 370, 160, 40);

        Prosciutto.setBackground(new java.awt.Color(255, 153, 0));
        Prosciutto.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Prosciutto.setForeground(new java.awt.Color(51, 0, 0));
        Prosciutto.setText("Prosciutto");
        Prosciutto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsciuttoActionPerformed(evt);
            }
        });
        jPanel1.add(Prosciutto);
        Prosciutto.setBounds(1000, 370, 150, 40);

        Chicken.setBackground(new java.awt.Color(255, 153, 0));
        Chicken.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Chicken.setForeground(new java.awt.Color(51, 0, 0));
        Chicken.setText("Chicken");
        Chicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChickenActionPerformed(evt);
            }
        });
        jPanel1.add(Chicken);
        Chicken.setBounds(360, 410, 130, 40);

        Tuna.setBackground(new java.awt.Color(255, 153, 0));
        Tuna.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Tuna.setForeground(new java.awt.Color(51, 0, 0));
        Tuna.setText("Tuna");
        Tuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TunaActionPerformed(evt);
            }
        });
        jPanel1.add(Tuna);
        Tuna.setBounds(460, 370, 100, 40);

        jLabel12.setBackground(new java.awt.Color(204, 0, 0));
        jLabel12.setFont(new java.awt.Font("Century", 1, 26)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("MEAT your match!");
        jLabel12.setOpaque(true);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 310, 260, 40);

        MozzarellaCheese.setBackground(new java.awt.Color(255, 153, 0));
        MozzarellaCheese.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        MozzarellaCheese.setForeground(new java.awt.Color(51, 0, 0));
        MozzarellaCheese.setText("Mozzarella Cheese");
        MozzarellaCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MozzarellaCheeseActionPerformed(evt);
            }
        });
        jPanel1.add(MozzarellaCheese);
        MozzarellaCheese.setBounds(10, 250, 260, 40);

        ParmesanCheese.setBackground(new java.awt.Color(255, 153, 0));
        ParmesanCheese.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ParmesanCheese.setForeground(new java.awt.Color(51, 0, 0));
        ParmesanCheese.setText("Parmesan  Cheese");
        ParmesanCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParmesanCheeseActionPerformed(evt);
            }
        });
        jPanel1.add(ParmesanCheese);
        ParmesanCheese.setBounds(270, 250, 250, 40);

        FetaCheese.setBackground(new java.awt.Color(255, 153, 0));
        FetaCheese.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        FetaCheese.setForeground(new java.awt.Color(51, 0, 0));
        FetaCheese.setText("Feta Cheese");
        FetaCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FetaCheeseActionPerformed(evt);
            }
        });
        jPanel1.add(FetaCheese);
        FetaCheese.setBounds(520, 250, 190, 40);

        GorgonzolaCheese.setBackground(new java.awt.Color(255, 153, 0));
        GorgonzolaCheese.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        GorgonzolaCheese.setForeground(new java.awt.Color(51, 0, 0));
        GorgonzolaCheese.setText("Gorgonzola Cheese");
        GorgonzolaCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GorgonzolaCheeseActionPerformed(evt);
            }
        });
        jPanel1.add(GorgonzolaCheese);
        GorgonzolaCheese.setBounds(710, 250, 270, 40);

        RicottaCheese.setBackground(new java.awt.Color(255, 153, 0));
        RicottaCheese.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        RicottaCheese.setForeground(new java.awt.Color(51, 0, 0));
        RicottaCheese.setText("Ricotta Cheese");
        RicottaCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RicottaCheeseActionPerformed(evt);
            }
        });
        jPanel1.add(RicottaCheese);
        RicottaCheese.setBounds(980, 250, 210, 40);

        jLabel11.setBackground(new java.awt.Color(255, 153, 0));
        jLabel11.setFont(new java.awt.Font("Century", 1, 26)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CHEESE wisely!");
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 210, 230, 40);

        jLabel9.setBackground(new java.awt.Color(153, 51, 0));
        jLabel9.setFont(new java.awt.Font("Century", 1, 26)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("STEP 4:How many?");
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(540, 200, 260, 40);

        White.setBackground(new java.awt.Color(255, 153, 0));
        buttonGroup1.add(White);
        White.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        White.setForeground(new java.awt.Color(51, 0, 0));
        White.setText("White");
        jPanel1.add(White);
        White.setBounds(740, 100, 110, 40);

        Pesto.setBackground(new java.awt.Color(255, 153, 0));
        buttonGroup1.add(Pesto);
        Pesto.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Pesto.setForeground(new java.awt.Color(51, 0, 0));
        Pesto.setText("Pesto");
        jPanel1.add(Pesto);
        Pesto.setBounds(850, 100, 90, 40);

        OliveOil.setBackground(new java.awt.Color(255, 153, 0));
        buttonGroup1.add(OliveOil);
        OliveOil.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        OliveOil.setForeground(new java.awt.Color(51, 0, 0));
        OliveOil.setText("Olive Oil");
        jPanel1.add(OliveOil);
        OliveOil.setBounds(940, 100, 130, 40);

        Red.setBackground(new java.awt.Color(255, 153, 0));
        buttonGroup1.add(Red);
        Red.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Red.setForeground(new java.awt.Color(51, 0, 0));
        Red.setText("Red");
        Red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedActionPerformed(evt);
            }
        });
        jPanel1.add(Red);
        Red.setBounds(660, 100, 80, 40);

        Barbeque.setBackground(new java.awt.Color(255, 153, 0));
        buttonGroup1.add(Barbeque);
        Barbeque.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Barbeque.setForeground(new java.awt.Color(51, 0, 0));
        Barbeque.setText("Barbeque");
        Barbeque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarbequeActionPerformed(evt);
            }
        });
        jPanel1.add(Barbeque);
        Barbeque.setBounds(510, 100, 150, 40);

        jLabel20.setBackground(new java.awt.Color(153, 51, 0));
        jLabel20.setFont(new java.awt.Font("Century", 1, 26)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("STEP 2: TOP it real good!");
        jLabel20.setOpaque(true);
        jPanel1.add(jLabel20);
        jLabel20.setBounds(190, 150, 340, 40);

        jLabel8.setBackground(new java.awt.Color(153, 51, 0));
        jLabel8.setFont(new java.awt.Font("Century", 1, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("STEP 1: SAUCE it up!");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(190, 100, 300, 40);

        jLabel6.setBackground(new java.awt.Color(153, 0, 0));
        jLabel6.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("BUILD YOUR OWN PIZZA");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(490, 10, 520, 50);

        jLabel7.setFont(new java.awt.Font("Century", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/chefpizza.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1090, 0, 260, 300);

        jLabel21.setBackground(new java.awt.Color(153, 51, 0));
        jLabel21.setFont(new java.awt.Font("Century", 1, 26)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("STEP 3: Size matters!");
        jLabel21.setOpaque(true);
        jPanel1.add(jLabel21);
        jLabel21.setBounds(540, 150, 290, 40);

        LargeSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel1.add(LargeSpinner);
        LargeSpinner.setBounds(1020, 200, 80, 40);

        jLabel22.setBackground(new java.awt.Color(255, 153, 0));
        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("LARGE P399");
        jLabel22.setOpaque(true);
        jPanel1.add(jLabel22);
        jLabel22.setBounds(1000, 150, 130, 40);

        jLabel23.setBackground(new java.awt.Color(255, 153, 0));
        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("REGULAR P299");
        jLabel23.setOpaque(true);
        jPanel1.add(jLabel23);
        jLabel23.setBounds(840, 150, 150, 40);

        RegularSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel1.add(RegularSpinner);
        RegularSpinner.setBounds(870, 200, 80, 40);

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1200, 620, 90, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(710, -10, 620, 343);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 340, 610, 343);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-10, 0, 620, 343);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(610, 340, 620, 343);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(610, 0, 620, 343);

        jLabel18.setBackground(new java.awt.Color(153, 51, 0));
        jLabel18.setFont(new java.awt.Font("Century", 1, 26)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("STEP 2: TOP it real good!");
        jLabel18.setOpaque(true);
        jPanel1.add(jLabel18);
        jLabel18.setBounds(530, 160, 340, 40);

        jLabel17.setBackground(new java.awt.Color(153, 51, 0));
        jLabel17.setFont(new java.awt.Font("Century", 1, 26)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("STEP 2: TOP it real good!");
        jLabel17.setOpaque(true);
        jPanel1.add(jLabel17);
        jLabel17.setBounds(180, 160, 340, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/woodenbackground.jpg"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(720, 340, 620, 343);

        jLabel19.setBackground(new java.awt.Color(153, 51, 0));
        jLabel19.setFont(new java.awt.Font("Century", 1, 26)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("STEP 2: TOP it real good!");
        jLabel19.setOpaque(true);
        jPanel1.add(jLabel19);
        jLabel19.setBounds(190, 150, 340, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1337, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ParmesanCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParmesanCheeseActionPerformed
        if (ParmesanCheese.isSelected() == false) {
            ParmesanCheese.setSelected(true);
        }
    }//GEN-LAST:event_ParmesanCheeseActionPerformed

    private void FetaCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FetaCheeseActionPerformed
        if (FetaCheese.isSelected() == false) {
            FetaCheese.setSelected(true);
        }
    }//GEN-LAST:event_FetaCheeseActionPerformed

    private void GreenBellPepperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreenBellPepperActionPerformed
        if (GreenBellPepper.isSelected() == false) {
            GreenBellPepper.setSelected(true);
        }
    }//GEN-LAST:event_GreenBellPepperActionPerformed

    private void BarbequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarbequeActionPerformed
        if (Barbeque.isSelected() == false) {
            Barbeque.setSelected(true);
        }
    }//GEN-LAST:event_BarbequeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new PizzaMenu().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int reg = (Integer) RegularSpinner.getValue();
        int large = (Integer) LargeSpinner.getValue();
        if (Sauce(false) && Toppings(false) == true) {
            if (reg != 0 || large != 0) {
                SummaryOfOrdersCustom custom = new SummaryOfOrdersCustom();
                order.append("  Size/s selected: \n");
                adminorder.append("  Size/s selected:;");
                if (reg >= 1) {
                    order.append("      Regular 9 inches Quantity: ").append(reg).append("\n");
                    adminorder.append("Regular 9 inches Quantity: ").append(reg+";");
                    valreg = 299 * reg;
                    price = price + valreg;

                    returnvarReg = true;
                }
                if (large >= 1) {
                    order.append("      Large 11 inches Quantity: ").append(large).append("\n");
                    adminorder.append("      Large 11 inches Quantity: ").append(large+";");
                    vallarge = 399 * large;
                    price = price + vallarge;
                    returnvarLarge = true;
                }
                order.append("\n");
                order.append("The total price of your Order is: ").append(price+"\n");
                adminorder.append(price+"\n");
                this.setVisible(false);
                custom.jTextArea1.setText(order.toString());
                custom.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Please indicate the number of Orders you would want per Size");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Order Invalid, No/Incomplete items were Selected");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void RedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RedActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        RegularSpinner.setValue(0);
        LargeSpinner.setValue(0);
        buttonGroup1.clearSelection();
        Anchovies.setSelected(false);
        Artichokes.setSelected(false);
        Bacon.setSelected(false);
        Barbeque.setSelected(false);
        Basil.setSelected(false);
        BlackOlives.setSelected(false);
        Broccoli.setSelected(false);
        CaramelizedOnions.setSelected(false);
        Chicken.setSelected(false);
        Cilantro.setSelected(false);
        Corn.setSelected(false);
        FetaCheese.setSelected(false);
        FreshMushrooms.setSelected(false);
        Garlic.setSelected(false);
        GorgonzolaCheese.setSelected(false);
        GreenBellPepper.setSelected(false);
        Ham.setSelected(false);
        Jalapeno.setSelected(false);
        Meatball.setSelected(false);
        MozzarellaCheese.setSelected(false);
        OliveOil.setSelected(false);
        ParmesanCheese.setSelected(false);
        Pepperoni.setSelected(false);
        Pesto.setSelected(false);
        Pineapple.setSelected(false);
        Prosciutto.setSelected(false);
        Red.setSelected(false);
        RedOnions.setSelected(false);
        RicottaCheese.setSelected(false);
        RoastedRedBellpepper.setSelected(false);
        Rosemary.setSelected(false);
        SpicyItalianSausage.setSelected(false);
        Tomato.setSelected(false);
        Tuna.setSelected(false);
        White.setSelected(false);


    }//GEN-LAST:event_jButton3ActionPerformed

    private void MozzarellaCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MozzarellaCheeseActionPerformed
        if (MozzarellaCheese.isSelected() == false) {
            MozzarellaCheese.setSelected(true);
        }
    }//GEN-LAST:event_MozzarellaCheeseActionPerformed

    private void GorgonzolaCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GorgonzolaCheeseActionPerformed
        if (GorgonzolaCheese.isSelected() == false) {
            GorgonzolaCheese.setSelected(true);
        }
    }//GEN-LAST:event_GorgonzolaCheeseActionPerformed

    private void RicottaCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RicottaCheeseActionPerformed
        if (RicottaCheese.isSelected() == false) {
            RicottaCheese.setSelected(true);
        }
    }//GEN-LAST:event_RicottaCheeseActionPerformed

    private void PepperoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PepperoniActionPerformed
        if (Pepperoni.isSelected() == false) {
            Pepperoni.setSelected(true);
        }
    }//GEN-LAST:event_PepperoniActionPerformed

    private void AnchoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnchoviesActionPerformed
        if (Anchovies.isSelected() == false) {
            Anchovies.setSelected(true);
        }
    }//GEN-LAST:event_AnchoviesActionPerformed

    private void MeatballActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeatballActionPerformed
        if (Meatball.isSelected() == false) {
            Meatball.setSelected(true);
        }
    }//GEN-LAST:event_MeatballActionPerformed

    private void TunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TunaActionPerformed
        if (Tuna.isSelected() == false) {
            Tuna.setSelected(true);
        }
    }//GEN-LAST:event_TunaActionPerformed

    private void HamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HamActionPerformed
        if (Ham.isSelected() == false) {
            Ham.setSelected(true);
        }
    }//GEN-LAST:event_HamActionPerformed

    private void BaconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaconActionPerformed
        if (Bacon.isSelected() == false) {
            Bacon.setSelected(true);
        }
    }//GEN-LAST:event_BaconActionPerformed

    private void ProsciuttoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsciuttoActionPerformed
        if (Prosciutto.isSelected() == false) {
            Prosciutto.setSelected(true);
        }
    }//GEN-LAST:event_ProsciuttoActionPerformed

    private void ChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChickenActionPerformed
        if (Chicken.isSelected() == false) {
            Chicken.setSelected(true);
        }
    }//GEN-LAST:event_ChickenActionPerformed

    private void SpicyItalianSausageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpicyItalianSausageActionPerformed
        if (SpicyItalianSausage.isSelected() == false) {
            SpicyItalianSausage.setSelected(true);
        }
    }//GEN-LAST:event_SpicyItalianSausageActionPerformed

    private void FreshMushroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FreshMushroomsActionPerformed
        if (FreshMushrooms.isSelected() == false) {
            FreshMushrooms.setSelected(true);
        }
    }//GEN-LAST:event_FreshMushroomsActionPerformed

    private void RedOnionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedOnionsActionPerformed
        if (RedOnions.isSelected() == false) {
            RedOnions.setSelected(true);
        }
    }//GEN-LAST:event_RedOnionsActionPerformed

    private void RoastedRedBellpepperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoastedRedBellpepperActionPerformed
        if (RoastedRedBellpepper.isSelected() == false) {
            RoastedRedBellpepper.setSelected(true);
        }
    }//GEN-LAST:event_RoastedRedBellpepperActionPerformed

    private void BlackOlivesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlackOlivesActionPerformed
        if (BlackOlives.isSelected() == false) {
            BlackOlives.setSelected(true);
        }
    }//GEN-LAST:event_BlackOlivesActionPerformed

    private void PineappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PineappleActionPerformed
        if (Pineapple.isSelected() == false) {
            Pineapple.setSelected(true);
        }
    }//GEN-LAST:event_PineappleActionPerformed

    private void CaramelizedOnionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaramelizedOnionsActionPerformed
        if (CaramelizedOnions.isSelected() == false) {
            CaramelizedOnions.setSelected(true);
        }
    }//GEN-LAST:event_CaramelizedOnionsActionPerformed

    private void JalapenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JalapenoActionPerformed
        if (Jalapeno.isSelected() == false) {
            Jalapeno.setSelected(true);
        }
    }//GEN-LAST:event_JalapenoActionPerformed

    private void RosemaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RosemaryActionPerformed
        if (Rosemary.isSelected() == false) {
            Rosemary.setSelected(true);
        }
    }//GEN-LAST:event_RosemaryActionPerformed

    private void CilantroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CilantroActionPerformed
        if (Cilantro.isSelected() == false) {
            Cilantro.setSelected(true);
        }
    }//GEN-LAST:event_CilantroActionPerformed

    private void BasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasilActionPerformed
        if (Basil.isSelected() == false) {
            Basil.setSelected(true);
        }
    }//GEN-LAST:event_BasilActionPerformed

    private void BroccoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BroccoliActionPerformed
        if (Broccoli.isSelected() == false) {
            Broccoli.setSelected(true);
        }
    }//GEN-LAST:event_BroccoliActionPerformed

    private void ArtichokesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtichokesActionPerformed
        if (Artichokes.isSelected() == false) {
            Artichokes.setSelected(true);
        }
    }//GEN-LAST:event_ArtichokesActionPerformed

    private void TomatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TomatoActionPerformed
        if (Tomato.isSelected() == false) {
            Tomato.setSelected(true);
        }
    }//GEN-LAST:event_TomatoActionPerformed

    private void CornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CornActionPerformed
        if (Corn.isSelected() == false) {
            Corn.setSelected(true);
        }
    }//GEN-LAST:event_CornActionPerformed

    private void GarlicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GarlicActionPerformed
        if (Garlic.isSelected() == false) {
            Garlic.setSelected(true);
        }
    }//GEN-LAST:event_GarlicActionPerformed

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
            java.util.logging.Logger.getLogger(CustomizePizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomizePizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomizePizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomizePizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomizePizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Anchovies;
    private javax.swing.JRadioButton Artichokes;
    private javax.swing.JRadioButton Bacon;
    private javax.swing.JRadioButton Barbeque;
    private javax.swing.JRadioButton Basil;
    private javax.swing.JRadioButton BlackOlives;
    private javax.swing.JRadioButton Broccoli;
    private javax.swing.JRadioButton CaramelizedOnions;
    private javax.swing.JRadioButton Chicken;
    private javax.swing.JRadioButton Cilantro;
    private javax.swing.JRadioButton Corn;
    private javax.swing.JRadioButton FetaCheese;
    private javax.swing.JRadioButton FreshMushrooms;
    private javax.swing.JRadioButton Garlic;
    private javax.swing.JRadioButton GorgonzolaCheese;
    private javax.swing.JRadioButton GreenBellPepper;
    private javax.swing.JRadioButton Ham;
    private javax.swing.JRadioButton Jalapeno;
    private javax.swing.JSpinner LargeSpinner;
    private javax.swing.JRadioButton Meatball;
    private javax.swing.JRadioButton MozzarellaCheese;
    private javax.swing.JRadioButton OliveOil;
    private javax.swing.JRadioButton ParmesanCheese;
    private javax.swing.JRadioButton Pepperoni;
    private javax.swing.JRadioButton Pesto;
    private javax.swing.JRadioButton Pineapple;
    private javax.swing.JRadioButton Prosciutto;
    private javax.swing.JRadioButton Red;
    private javax.swing.JRadioButton RedOnions;
    private javax.swing.JSpinner RegularSpinner;
    private javax.swing.JRadioButton RicottaCheese;
    private javax.swing.JRadioButton RoastedRedBellpepper;
    private javax.swing.JRadioButton Rosemary;
    private javax.swing.JRadioButton SpicyItalianSausage;
    private javax.swing.JRadioButton Tomato;
    private javax.swing.JRadioButton Tuna;
    private javax.swing.JRadioButton White;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
