
package com.posystem.gui;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Order extends javax.swing.JFrame {
    
    String iTax, iSubTotal, iTotal;
    double [] itemcost = new double[20];
    DefaultTableModel model;
    
    
    public Order() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        model = new DefaultTableModel();
        productTbl.setModel(model);
        model.addColumn("Product Name");
        model.addColumn("Price");
        model.addColumn("Quantity");
        model.addColumn("Size");
        model.addColumn("Color");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OrderMainPanel = new javax.swing.JPanel();
        CategoryPanel = new javax.swing.JPanel();
        CategoryLabel = new javax.swing.JLabel();
        FruitCategory = new javax.swing.JLabel();
        Apple = new javax.swing.JLabel();
        Grapes = new javax.swing.JLabel();
        Clover = new javax.swing.JLabel();
        Nova = new javax.swing.JLabel();
        Piattos = new javax.swing.JLabel();
        Silka = new javax.swing.JLabel();
        Bioderm = new javax.swing.JLabel();
        Safeguard = new javax.swing.JLabel();
        iPhone = new javax.swing.JLabel();
        Android = new javax.swing.JLabel();
        Laptop = new javax.swing.JLabel();
        Desktop = new javax.swing.JLabel();
        Umbrella = new javax.swing.JLabel();
        Pants = new javax.swing.JLabel();
        TShirt = new javax.swing.JLabel();
        SnacksCategory = new javax.swing.JLabel();
        SoapCategory = new javax.swing.JLabel();
        GadgetCategory = new javax.swing.JLabel();
        MoreCategory = new javax.swing.JLabel();
        Orange = new javax.swing.JLabel();
        MainScreenPanel = new javax.swing.JPanel();
        CostReceiptPanel = new javax.swing.JPanel();
        CostReceiptLabel = new javax.swing.JLabel();
        TaxLabel = new javax.swing.JLabel();
        SubTotalLabel = new javax.swing.JLabel();
        TotalLabel = new javax.swing.JLabel();
        TaxField = new javax.swing.JTextField();
        SubTotalField = new javax.swing.JTextField();
        TotalField = new javax.swing.JTextField();
        ClearButton = new javax.swing.JButton();
        TotalButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        OrderButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTbl = new javax.swing.JTable();
        CustomPanel = new javax.swing.JPanel();
        CustomLabel = new javax.swing.JLabel();
        ProductNameLabel = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        PriceValue = new javax.swing.JLabel();
        QtyLabel = new javax.swing.JLabel();
        QtyField = new javax.swing.JTextField();
        SizeLabel = new javax.swing.JLabel();
        SizeCombo = new javax.swing.JComboBox<>();
        ColorLabel = new javax.swing.JLabel();
        ColorCombo = new javax.swing.JComboBox<>();
        AddButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1350, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OrderMainPanel.setBackground(new java.awt.Color(89, 171, 227));
        OrderMainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 49, 63), 4));
        OrderMainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CategoryPanel.setBackground(new java.awt.Color(89, 171, 227));

        CategoryLabel.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        CategoryLabel.setForeground(new java.awt.Color(52, 73, 94));
        CategoryLabel.setText("Categories");
        CategoryLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        FruitCategory.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        FruitCategory.setForeground(new java.awt.Color(52, 73, 94));
        FruitCategory.setText("   FRUITS");
        FruitCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Apple.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Apple.setForeground(new java.awt.Color(52, 73, 94));
        Apple.setText("    Apple");
        Apple.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        Apple.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Apple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AppleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AppleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AppleMouseExited(evt);
            }
        });

        Grapes.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Grapes.setForeground(new java.awt.Color(52, 73, 94));
        Grapes.setText("   Grapes");
        Grapes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        Grapes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Grapes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GrapesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GrapesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GrapesMouseExited(evt);
            }
        });

        Clover.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Clover.setForeground(new java.awt.Color(52, 73, 94));
        Clover.setText("   Clover");
        Clover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        Clover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloverMouseExited(evt);
            }
        });

        Nova.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Nova.setForeground(new java.awt.Color(52, 73, 94));
        Nova.setText("    Nova");
        Nova.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        Nova.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Nova.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NovaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NovaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NovaMouseExited(evt);
            }
        });

        Piattos.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Piattos.setForeground(new java.awt.Color(52, 73, 94));
        Piattos.setText("   Piattos");
        Piattos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        Piattos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Piattos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PiattosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PiattosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PiattosMouseExited(evt);
            }
        });

        Silka.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Silka.setForeground(new java.awt.Color(52, 73, 94));
        Silka.setText("     Silka");
        Silka.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        Silka.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Silka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SilkaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SilkaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SilkaMouseExited(evt);
            }
        });

        Bioderm.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Bioderm.setForeground(new java.awt.Color(52, 73, 94));
        Bioderm.setText("   Bioderm");
        Bioderm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        Bioderm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bioderm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BiodermMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BiodermMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BiodermMouseExited(evt);
            }
        });

        Safeguard.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Safeguard.setForeground(new java.awt.Color(52, 73, 94));
        Safeguard.setText(" Safeguard");
        Safeguard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        Safeguard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Safeguard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SafeguardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SafeguardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SafeguardMouseExited(evt);
            }
        });

        iPhone.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        iPhone.setForeground(new java.awt.Color(52, 73, 94));
        iPhone.setText("    iPhone");
        iPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        iPhone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iPhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iPhoneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iPhoneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iPhoneMouseExited(evt);
            }
        });

        Android.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Android.setForeground(new java.awt.Color(52, 73, 94));
        Android.setText("   Android");
        Android.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        Android.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Android.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AndroidMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AndroidMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AndroidMouseExited(evt);
            }
        });

        Laptop.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Laptop.setForeground(new java.awt.Color(52, 73, 94));
        Laptop.setText("    Laptop");
        Laptop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        Laptop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Laptop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LaptopMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LaptopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LaptopMouseExited(evt);
            }
        });

        Desktop.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Desktop.setForeground(new java.awt.Color(52, 73, 94));
        Desktop.setText("   Desktop");
        Desktop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        Desktop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Desktop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DesktopMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DesktopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DesktopMouseExited(evt);
            }
        });

        Umbrella.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Umbrella.setForeground(new java.awt.Color(52, 73, 94));
        Umbrella.setText("  Umbrella");
        Umbrella.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        Umbrella.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Umbrella.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UmbrellaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UmbrellaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UmbrellaMouseExited(evt);
            }
        });

        Pants.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Pants.setForeground(new java.awt.Color(52, 73, 94));
        Pants.setText("    Pants");
        Pants.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        Pants.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pants.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PantsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PantsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PantsMouseExited(evt);
            }
        });

        TShirt.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        TShirt.setForeground(new java.awt.Color(52, 73, 94));
        TShirt.setText("   T-Shirt");
        TShirt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        TShirt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TShirt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TShirtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TShirtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TShirtMouseExited(evt);
            }
        });

        SnacksCategory.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        SnacksCategory.setForeground(new java.awt.Color(52, 73, 94));
        SnacksCategory.setText("  SNACKS");
        SnacksCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        SoapCategory.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        SoapCategory.setForeground(new java.awt.Color(52, 73, 94));
        SoapCategory.setText("    SOAP");
        SoapCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        GadgetCategory.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        GadgetCategory.setForeground(new java.awt.Color(52, 73, 94));
        GadgetCategory.setText("   GADGET");
        GadgetCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        MoreCategory.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        MoreCategory.setForeground(new java.awt.Color(52, 73, 94));
        MoreCategory.setText("    MORE");
        MoreCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Orange.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Orange.setForeground(new java.awt.Color(52, 73, 94));
        Orange.setText("   Orange");
        Orange.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        Orange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Orange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrangeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OrangeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OrangeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CategoryPanelLayout = new javax.swing.GroupLayout(CategoryPanel);
        CategoryPanel.setLayout(CategoryPanelLayout);
        CategoryPanelLayout.setHorizontalGroup(
            CategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CategoryPanelLayout.createSequentialGroup()
                .addGroup(CategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CategoryPanelLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(CategoryLabel))
                    .addGroup(CategoryPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FruitCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Apple, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Orange, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Grapes, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SnacksCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Piattos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Clover, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Nova, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SoapCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Silka, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bioderm, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Safeguard, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(CategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GadgetCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Android, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Laptop, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MoreCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Umbrella, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pants, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TShirt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(100, 100, 100))
        );
        CategoryPanelLayout.setVerticalGroup(
            CategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CategoryPanelLayout.createSequentialGroup()
                .addComponent(CategoryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FruitCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(CategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CategoryPanelLayout.createSequentialGroup()
                        .addComponent(Apple, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(Orange)
                        .addGap(4, 4, 4)
                        .addComponent(Grapes)
                        .addGap(29, 29, 29)
                        .addComponent(SnacksCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Piattos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Clover, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(CategoryPanelLayout.createSequentialGroup()
                        .addComponent(GadgetCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Android, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Laptop, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(CategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CategoryPanelLayout.createSequentialGroup()
                        .addComponent(Nova, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SoapCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Silka, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(Bioderm, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CategoryPanelLayout.createSequentialGroup()
                        .addComponent(MoreCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Umbrella, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(Pants, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TShirt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Safeguard, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        OrderMainPanel.add(CategoryPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 416, 700));

        MainScreenPanel.setBackground(new java.awt.Color(89, 171, 227));

        javax.swing.GroupLayout MainScreenPanelLayout = new javax.swing.GroupLayout(MainScreenPanel);
        MainScreenPanel.setLayout(MainScreenPanelLayout);
        MainScreenPanelLayout.setHorizontalGroup(
            MainScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        MainScreenPanelLayout.setVerticalGroup(
            MainScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );

        OrderMainPanel.add(MainScreenPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 21, -1, -1));

        CostReceiptPanel.setBackground(new java.awt.Color(102, 153, 255));

        CostReceiptLabel.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        CostReceiptLabel.setForeground(new java.awt.Color(52, 73, 94));
        CostReceiptLabel.setText("Cost & Receipt");
        CostReceiptLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TaxLabel.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        TaxLabel.setForeground(new java.awt.Color(52, 73, 94));
        TaxLabel.setText("Tax");
        TaxLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        SubTotalLabel.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        SubTotalLabel.setForeground(new java.awt.Color(52, 73, 94));
        SubTotalLabel.setText("SubTotal");
        SubTotalLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TotalLabel.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        TotalLabel.setForeground(new java.awt.Color(52, 73, 94));
        TotalLabel.setText("Total");
        TotalLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TaxField.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        TaxField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TaxField.setText("0");
        TaxField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));
        TaxField.setEnabled(false);

        SubTotalField.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        SubTotalField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SubTotalField.setText("0");
        SubTotalField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));
        SubTotalField.setEnabled(false);

        TotalField.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        TotalField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TotalField.setText("0");
        TotalField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));
        TotalField.setEnabled(false);

        ClearButton.setBackground(new java.awt.Color(51, 153, 255));
        ClearButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        ClearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClearButton.setEnabled(false);
        ClearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClearButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClearButtonMouseExited(evt);
            }
        });
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        TotalButton.setBackground(new java.awt.Color(51, 153, 255));
        TotalButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        TotalButton.setText("Total");
        TotalButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        TotalButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TotalButton.setEnabled(false);
        TotalButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TotalButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TotalButtonMouseExited(evt);
            }
        });
        TotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalButtonActionPerformed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(250, 0, 0));
        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitButtonMouseExited(evt);
            }
        });
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        OrderButton.setBackground(new java.awt.Color(51, 153, 255));
        OrderButton.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        OrderButton.setText("ORDER");
        OrderButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        OrderButton.setEnabled(false);
        OrderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OrderButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OrderButtonMouseExited(evt);
            }
        });
        OrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderButtonActionPerformed(evt);
            }
        });

        productTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Quantity", "Size", "Color"
            }
        ));
        jScrollPane1.setViewportView(productTbl);

        javax.swing.GroupLayout CostReceiptPanelLayout = new javax.swing.GroupLayout(CostReceiptPanel);
        CostReceiptPanel.setLayout(CostReceiptPanelLayout);
        CostReceiptPanelLayout.setHorizontalGroup(
            CostReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CostReceiptPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(CostReceiptPanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(CostReceiptLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(CostReceiptPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(TotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(OrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CostReceiptPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CostReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CostReceiptPanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(TaxLabel)
                        .addGap(12, 12, 12)
                        .addComponent(TaxField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CostReceiptPanelLayout.createSequentialGroup()
                        .addComponent(SubTotalLabel)
                        .addGap(12, 12, 12)
                        .addComponent(SubTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CostReceiptPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(TotalLabel)
                        .addGap(12, 12, 12)
                        .addComponent(TotalField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        CostReceiptPanelLayout.setVerticalGroup(
            CostReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CostReceiptPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(CostReceiptLabel)
                .addGap(50, 50, 50)
                .addGroup(CostReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TaxLabel)
                    .addComponent(TaxField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(CostReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubTotalLabel)
                    .addGroup(CostReceiptPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(SubTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(CostReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TotalLabel)
                    .addGroup(CostReceiptPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(TotalField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CostReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CostReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(OrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        OrderMainPanel.add(CostReceiptPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 21, -1, 679));

        CustomPanel.setBackground(new java.awt.Color(102, 153, 255));

        CustomLabel.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        CustomLabel.setForeground(new java.awt.Color(52, 73, 94));
        CustomLabel.setText("Custom");
        CustomLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ProductNameLabel.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        ProductNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProductNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        PriceLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PriceLabel.setForeground(new java.awt.Color(52, 73, 94));
        PriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PriceLabel.setText("Price");

        PriceValue.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PriceValue.setForeground(java.awt.Color.green);
        PriceValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        QtyLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        QtyLabel.setForeground(new java.awt.Color(52, 73, 94));
        QtyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QtyLabel.setText("Quantity");

        QtyField.setBackground(new java.awt.Color(255, 255, 255));
        QtyField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        QtyField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        QtyField.setEnabled(false);

        SizeLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SizeLabel.setForeground(new java.awt.Color(52, 73, 94));
        SizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SizeLabel.setText("Size");

        SizeCombo.setBackground(new java.awt.Color(255, 255, 255));
        SizeCombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SizeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L" }));
        SizeCombo.setSelectedItem(null);
        SizeCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SizeCombo.setEnabled(false);

        ColorLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ColorLabel.setForeground(new java.awt.Color(52, 73, 94));
        ColorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ColorLabel.setText("Color");

        ColorCombo.setBackground(new java.awt.Color(255, 255, 255));
        ColorCombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ColorCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "White", "Red", "Green", "Blue", "Yellow", "Black" }));
        ColorCombo.setSelectedItem(null);
        ColorCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ColorCombo.setEnabled(false);

        AddButton.setBackground(new java.awt.Color(250, 0, 0));
        AddButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        AddButton.setText("ADD");
        AddButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        AddButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddButton.setEnabled(false);
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddButtonMouseExited(evt);
            }
        });
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CustomPanelLayout = new javax.swing.GroupLayout(CustomPanel);
        CustomPanel.setLayout(CustomPanelLayout);
        CustomPanelLayout.setHorizontalGroup(
            CustomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProductNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PriceValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CustomPanelLayout.createSequentialGroup()
                .addGroup(CustomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CustomPanelLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(CustomLabel))
                    .addGroup(CustomPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CustomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(CustomPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(SizeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CustomPanelLayout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addComponent(QtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CustomPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(CustomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SizeLabel)
                            .addComponent(ColorLabel))))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(CustomPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(ColorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        CustomPanelLayout.setVerticalGroup(
            CustomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CustomLabel)
                .addGap(18, 18, 18)
                .addComponent(ProductNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PriceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PriceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(QtyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SizeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SizeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ColorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CustomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        OrderMainPanel.add(CustomPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 190, 320, 510));

        getContentPane().add(OrderMainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 733));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AppleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppleMouseEntered
        Apple.setForeground(Color.WHITE);
    }//GEN-LAST:event_AppleMouseEntered

    private void AppleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppleMouseExited
        Apple.setForeground(new Color(52,73,94));
    }//GEN-LAST:event_AppleMouseExited

    private void OrangeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrangeMouseEntered
        Orange.setForeground(Color.WHITE);
    }//GEN-LAST:event_OrangeMouseEntered

    private void OrangeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrangeMouseExited
        Orange.setForeground(new Color(52,73,94));
    }//GEN-LAST:event_OrangeMouseExited

    private void GrapesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GrapesMouseEntered
        Grapes.setForeground(Color.WHITE);
    }//GEN-LAST:event_GrapesMouseEntered

    private void GrapesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GrapesMouseExited
        Grapes.setForeground(new Color(52,73,94));
    }//GEN-LAST:event_GrapesMouseExited

    private void PiattosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PiattosMouseEntered
        Piattos.setForeground(Color.WHITE);
    }//GEN-LAST:event_PiattosMouseEntered

    private void PiattosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PiattosMouseExited
        Piattos.setForeground(new Color(52,73,94));
    }//GEN-LAST:event_PiattosMouseExited

    private void CloverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloverMouseEntered
        Clover.setForeground(Color.WHITE);
    }//GEN-LAST:event_CloverMouseEntered

    private void CloverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloverMouseExited
        Clover.setForeground(new Color(52,73,94));
    }//GEN-LAST:event_CloverMouseExited

    private void NovaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NovaMouseEntered
        Nova.setForeground(Color.WHITE);
    }//GEN-LAST:event_NovaMouseEntered

    private void NovaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NovaMouseExited
        Nova.setForeground(new Color(52,73,94));
    }//GEN-LAST:event_NovaMouseExited

    private void SilkaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SilkaMouseEntered
        Silka.setForeground(Color.WHITE);
    }//GEN-LAST:event_SilkaMouseEntered

    private void SilkaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SilkaMouseExited
        Silka.setForeground(new Color(52,73,94));
    }//GEN-LAST:event_SilkaMouseExited

    private void BiodermMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BiodermMouseEntered
        Bioderm.setForeground(Color.WHITE);
    }//GEN-LAST:event_BiodermMouseEntered

    private void BiodermMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BiodermMouseExited
        Bioderm.setForeground(new Color(52,73,94));
    }//GEN-LAST:event_BiodermMouseExited

    private void SafeguardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SafeguardMouseEntered
        Safeguard.setForeground(Color.WHITE);
    }//GEN-LAST:event_SafeguardMouseEntered

    private void SafeguardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SafeguardMouseExited
        Safeguard.setForeground(new Color(52,73,94));
    }//GEN-LAST:event_SafeguardMouseExited

    private void iPhoneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iPhoneMouseEntered
        iPhone.setForeground(Color.WHITE);
    }//GEN-LAST:event_iPhoneMouseEntered

    private void iPhoneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iPhoneMouseExited
        iPhone.setForeground(new Color(52,73,94));
    }//GEN-LAST:event_iPhoneMouseExited

    private void AndroidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndroidMouseEntered
        Android.setForeground(Color.WHITE);
    }//GEN-LAST:event_AndroidMouseEntered

    private void AndroidMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndroidMouseExited
        Android.setForeground(new Color(52,73,94));
    }//GEN-LAST:event_AndroidMouseExited

    private void LaptopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LaptopMouseEntered
        Laptop.setForeground(Color.WHITE);
    }//GEN-LAST:event_LaptopMouseEntered

    private void LaptopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LaptopMouseExited
        Laptop.setForeground(new Color(52,73,94));
    }//GEN-LAST:event_LaptopMouseExited

    private void DesktopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DesktopMouseEntered
        Desktop.setForeground(Color.WHITE);
    }//GEN-LAST:event_DesktopMouseEntered

    private void DesktopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DesktopMouseExited
        Desktop.setForeground(new Color(52,73,94));
    }//GEN-LAST:event_DesktopMouseExited

    private void UmbrellaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UmbrellaMouseEntered
        Umbrella.setForeground(Color.WHITE);
    }//GEN-LAST:event_UmbrellaMouseEntered

    private void UmbrellaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UmbrellaMouseExited
        Umbrella.setForeground(new Color(52,73,94));
    }//GEN-LAST:event_UmbrellaMouseExited

    private void PantsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PantsMouseEntered
        Pants.setForeground(Color.WHITE);
    }//GEN-LAST:event_PantsMouseEntered

    private void PantsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PantsMouseExited
        Pants.setForeground(new Color(52,73,94));
    }//GEN-LAST:event_PantsMouseExited

    private void TShirtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TShirtMouseEntered
        TShirt.setForeground(Color.WHITE);
    }//GEN-LAST:event_TShirtMouseEntered

    private void TShirtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TShirtMouseExited
        TShirt.setForeground(new Color(52,73,94));
    }//GEN-LAST:event_TShirtMouseExited

    private void AppleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppleMouseClicked
        this.template("Apple",25.50,false,false);
        this.cost(0, 25.50);
    }//GEN-LAST:event_AppleMouseClicked

    private void OrangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrangeMouseClicked
        this.template("Orange",25.75,false,false);
        this.cost(1, 25.75);
    }//GEN-LAST:event_OrangeMouseClicked

    private void GrapesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GrapesMouseClicked
        this.template("Grapes",80.25,false,false);
        this.cost(2, 80.25);
    }//GEN-LAST:event_GrapesMouseClicked

    private void PiattosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PiattosMouseClicked
        this.template("Piattos",15.00,false,false);
        this.cost(3, 15.00);
    }//GEN-LAST:event_PiattosMouseClicked

    private void CloverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloverMouseClicked
        this.template("Clover",8.00,false,false);
        this.cost(4, 8.00);
    }//GEN-LAST:event_CloverMouseClicked

    private void NovaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NovaMouseClicked
        this.template("Nova",15.00,false,false);
        this.cost(5, 15.00);
    }//GEN-LAST:event_NovaMouseClicked

    private void SilkaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SilkaMouseClicked
        this.template("Silka",32.50,false,false);
        this.cost(6, 32.50);
    }//GEN-LAST:event_SilkaMouseClicked

    private void BiodermMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BiodermMouseClicked
        this.template("Bioderm",25.75,false,false);
        this.cost(7, 25.75);
    }//GEN-LAST:event_BiodermMouseClicked

    private void ClearButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearButtonMouseEntered
        ClearButton.setBackground(new Color(0,204,255));
        ClearButton.setFocusable(false);
    }//GEN-LAST:event_ClearButtonMouseEntered

    private void ClearButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearButtonMouseExited
        ClearButton.setBackground(new Color(34,167,240));
    }//GEN-LAST:event_ClearButtonMouseExited

    private void SafeguardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SafeguardMouseClicked
        this.template("Safeguard",20.00,false,false);
        this.cost(8, 20.00);
    }//GEN-LAST:event_SafeguardMouseClicked

    private void iPhoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iPhoneMouseClicked
        this.template("iPhone",7800.99,false,true);
        this.cost(9, 7800.99);
    }//GEN-LAST:event_iPhoneMouseClicked

    private void AndroidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndroidMouseClicked
        this.template("Android",5000.99,false,true);
        this.cost(10, 5000.99);
    }//GEN-LAST:event_AndroidMouseClicked

    private void LaptopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LaptopMouseClicked
        this.template("Laptop",12999.00,false,true);
        this.cost(11, 12999.00);
    }//GEN-LAST:event_LaptopMouseClicked

    private void DesktopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DesktopMouseClicked
        this.template("Desktop",17999.99,false,true);
        this.cost(12, 17999.99);
    }//GEN-LAST:event_DesktopMouseClicked

    private void UmbrellaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UmbrellaMouseClicked
        this.template("Umbrella",150.00,false,true);
        this.cost(13, 150.00);
    }//GEN-LAST:event_UmbrellaMouseClicked

    private void PantsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PantsMouseClicked
        this.template("Pants",400.00,true,true);
        this.cost(14, 400.00);
    }//GEN-LAST:event_PantsMouseClicked

    private void TShirtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TShirtMouseClicked
        this.template("TShirt",300.00,true,true);
        this.cost(15, 300.00);
    }//GEN-LAST:event_TShirtMouseClicked

    private void TotalButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TotalButtonMouseEntered
        TotalButton.setBackground(new Color(0,204,255));
        TotalButton.setFocusable(false);
    }//GEN-LAST:event_TotalButtonMouseEntered

    private void TotalButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TotalButtonMouseExited
        TotalButton.setBackground(new Color(34,167,240));
    }//GEN-LAST:event_TotalButtonMouseExited

    private void ExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseEntered
        ExitButton.setBackground(new Color(255,102,102));
        ExitButton.setFocusable(false);
    }//GEN-LAST:event_ExitButtonMouseEntered

    private void ExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseExited
        ExitButton.setBackground(new Color(250,0,0));
    }//GEN-LAST:event_ExitButtonMouseExited

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        TaxField.setText("0");SubTotalField.setText("0");TotalField.setText("0");
        model.setRowCount(0);
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void TotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalButtonActionPerformed
        
        itemcost[16] = itemcost[0]+itemcost[1]+itemcost[2]+itemcost[3]+itemcost[4];
        itemcost[17] = itemcost[5]+itemcost[6]+itemcost[7]+itemcost[8]+itemcost[9]+itemcost[10]+itemcost[11];
        itemcost[18] = itemcost[12]+itemcost[13]+itemcost[14]+itemcost[15];
        itemcost[19] = itemcost[16]+itemcost[17]+itemcost[18];
        
        iTax = String.format("P%.2f", itemcost[19]*.12);
        iSubTotal = String.format("P%.2f", itemcost[19]);
        iTotal = String.format("P%.2f", itemcost[19]+(itemcost[19]*.12));

        String tax = String.valueOf(iTax);
        String sub = String.valueOf(iSubTotal);
        String total = String.valueOf(iTotal);

        TaxField.setText(tax);
        SubTotalField.setText(sub);
        TotalField.setText(total);
        
    }//GEN-LAST:event_TotalButtonActionPerformed

    private void OrderButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderButtonMouseEntered
        OrderButton.setBackground(new Color(0,204,255));
    }//GEN-LAST:event_OrderButtonMouseEntered

    private void OrderButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderButtonMouseExited
        OrderButton.setBackground(new Color(34,167,240));
    }//GEN-LAST:event_OrderButtonMouseExited

    private void AddButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseEntered
        AddButton.setBackground(new Color(255,102,102));
        AddButton.setFocusable(false);
    }//GEN-LAST:event_AddButtonMouseEntered

    private void AddButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseExited
        AddButton.setBackground(new Color(250,0,0));
    }//GEN-LAST:event_AddButtonMouseExited
    
    private void OrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderButtonActionPerformed
        String filePath = "C:\\Users\\Ren\\Documents\\NetBeansProjects\\POSystemGUI\\purchase.txt";
        File file = new File(filePath);

        FileWriter fw;
        try {
            fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0; i<productTbl.getRowCount(); i++){
                for(int j=0; j<productTbl.getColumnCount(); j++){
                    if(model.getValueAt(0, i) == null){
                        bw.write(" ");
                    }else if(model.getValueAt(0, j) == null){
                        bw.write(" ");
                    }else{
                    bw.write((String)productTbl.getValueAt(i, j).toString()+" ");
                    }
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
            
            JOptionPane.showMessageDialog(null, "Order Successful!");
            TaxField.setText("0");SubTotalField.setText("0");TotalField.setText("0");
            model.setRowCount(0);
            
        } catch (IOException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_OrderButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        this.addBtn();  
    }//GEN-LAST:event_AddButtonActionPerformed
    
    public void template(String product, double price, boolean vi, boolean vii){
        this.enableAll();
        ProductNameLabel.setText(product);
        PriceValue.setText(String.format("P%.2f", price));
        SizeCombo.setEnabled(vi);
        ColorCombo.setEnabled(vii);
    }   
    
    public void enableBtn(){
        ClearButton.setEnabled(true);
        TotalButton.setEnabled(true);
        OrderButton.setEnabled(true);
    }
    
    public void disableBtn(){
        QtyField.setEnabled(false);
        SizeCombo.setEnabled(false);
        ColorCombo.setEnabled(false);
        AddButton.setEnabled(false);
    }
    
    public void enableAll(){
        QtyField.setEnabled(true);
        SizeCombo.setEnabled(true);
        ColorCombo.setEnabled(true);
        AddButton.setEnabled(true);
    }
    
    public void resetAll(){
        ProductNameLabel.setText("");
        PriceValue.setText("");
        QtyField.setText("");
        SizeCombo.setSelectedItem(null);
        ColorCombo.setSelectedItem(null);
    }
    
    public void cost(int i, double p){
        itemcost[i] += p;
    }
    
    public void addBtn(){
        int qty = Integer.valueOf(QtyField.getText());
        String proD = ProductNameLabel.getText();
        String priC = PriceValue.getText();
        String sizE = (String)SizeCombo.getSelectedItem();
        String colr = (String)ColorCombo.getSelectedItem();
        
//        itemcost[i] += p * qty;
        
        Object[] columns = {proD, priC, qty, sizE, colr};
        model.addRow(columns);
        
        this.resetAll();
        this.disableBtn();
        this.enableBtn();
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Order().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    public javax.swing.JLabel Android;
    public javax.swing.JLabel Apple;
    public javax.swing.JLabel Bioderm;
    private javax.swing.JLabel CategoryLabel;
    private javax.swing.JPanel CategoryPanel;
    private javax.swing.JButton ClearButton;
    public javax.swing.JLabel Clover;
    public javax.swing.JComboBox<String> ColorCombo;
    public javax.swing.JLabel ColorLabel;
    private javax.swing.JLabel CostReceiptLabel;
    private javax.swing.JPanel CostReceiptPanel;
    private javax.swing.JLabel CustomLabel;
    private javax.swing.JPanel CustomPanel;
    public javax.swing.JLabel Desktop;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel FruitCategory;
    private javax.swing.JLabel GadgetCategory;
    public javax.swing.JLabel Grapes;
    public javax.swing.JLabel Laptop;
    private javax.swing.JPanel MainScreenPanel;
    private javax.swing.JLabel MoreCategory;
    public javax.swing.JLabel Nova;
    public javax.swing.JLabel Orange;
    private javax.swing.JButton OrderButton;
    private javax.swing.JPanel OrderMainPanel;
    public javax.swing.JLabel Pants;
    public javax.swing.JLabel Piattos;
    public javax.swing.JLabel PriceLabel;
    public javax.swing.JLabel PriceValue;
    public javax.swing.JLabel ProductNameLabel;
    public javax.swing.JTextField QtyField;
    public javax.swing.JLabel QtyLabel;
    public javax.swing.JLabel Safeguard;
    public javax.swing.JLabel Silka;
    public javax.swing.JComboBox<String> SizeCombo;
    public javax.swing.JLabel SizeLabel;
    private javax.swing.JLabel SnacksCategory;
    private javax.swing.JLabel SoapCategory;
    private javax.swing.JTextField SubTotalField;
    private javax.swing.JLabel SubTotalLabel;
    public javax.swing.JLabel TShirt;
    private javax.swing.JTextField TaxField;
    private javax.swing.JLabel TaxLabel;
    private javax.swing.JButton TotalButton;
    private javax.swing.JTextField TotalField;
    private javax.swing.JLabel TotalLabel;
    public javax.swing.JLabel Umbrella;
    public javax.swing.JLabel iPhone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productTbl;
    // End of variables declaration//GEN-END:variables
}