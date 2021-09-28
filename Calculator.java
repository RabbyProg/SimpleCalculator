/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorv2;

/**
 *
 * @author LENOVO
 */
public class Calculator extends javax.swing.JFrame {
    
    double num, ans;
    int calculation;

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        
        onbtn.setEnabled(false); //on disable
    }
    
    public void arithmetic_operation()
    {
        switch(calculation)
        {
            case 1: //add
                ans = num + Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
                
            case 2: //subtract
                ans = num - Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;  
                
            case 3: //multiply
                ans = num * Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
                
            case 4: //division
                ans = num / Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;    
                
        }    
    }
    public void enable()
    {
        jTextField1.setEnabled(true);
        
        onbtn.setEnabled(false); //on disable
        offbtn.setEnabled(true); //off enable
        
        backspace.setEnabled(true);
        clearbtn.setEnabled(true);
        sumbtn.setEnabled(true);
        ninebtn.setEnabled(true);
        minusbtn.setEnabled(true);
        sevenbtn.setEnabled(true);
        eightbtn.setEnabled(true);
        fourbtn.setEnabled(true);
        fivebtn.setEnabled(true);
        sixbtn.setEnabled(true);
        multiplicationbtn.setEnabled(true);
        onebtn.setEnabled(true);
        twobtn.setEnabled(true);
        threebtn.setEnabled(true);
        divisionbtn.setEnabled(true);
        zerobtn.setEnabled(true);
        dotbtn.setEnabled(true);
        equalbtn.setEnabled(true);
          
        
    }

    public void disable()
    {
        jTextField1.setEnabled(false);
        
        onbtn.setEnabled(true); //for ON enable
        offbtn.setEnabled(false); //off disabled
        
        
        backspace.setEnabled(false);
        clearbtn.setEnabled(false);
        sumbtn.setEnabled(false);
        ninebtn.setEnabled(false);
        minusbtn.setEnabled(false);
        sevenbtn.setEnabled(false);
        eightbtn.setEnabled(false);
        fourbtn.setEnabled(false);
        fivebtn.setEnabled(false);
        sixbtn.setEnabled(false);
        multiplicationbtn.setEnabled(false);
        onebtn.setEnabled(false);
        twobtn.setEnabled(false);
        threebtn.setEnabled(false);
        divisionbtn.setEnabled(false);
        zerobtn.setEnabled(false);
        dotbtn.setEnabled(false);
        equalbtn.setEnabled(false);
        
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
        jTextField1 = new javax.swing.JTextField();
        onbtn = new javax.swing.JRadioButton();
        offbtn = new javax.swing.JRadioButton();
        backspace = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        sumbtn = new javax.swing.JButton();
        ninebtn = new javax.swing.JButton();
        minusbtn = new javax.swing.JButton();
        sevenbtn = new javax.swing.JButton();
        eightbtn = new javax.swing.JButton();
        fourbtn = new javax.swing.JButton();
        fivebtn = new javax.swing.JButton();
        sixbtn = new javax.swing.JButton();
        multiplicationbtn = new javax.swing.JButton();
        onebtn = new javax.swing.JButton();
        twobtn = new javax.swing.JButton();
        threebtn = new javax.swing.JButton();
        divisionbtn = new javax.swing.JButton();
        zerobtn = new javax.swing.JButton();
        dotbtn = new javax.swing.JButton();
        equalbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 150));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(onbtn);
        onbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        onbtn.setText("ON");
        onbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onbtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(offbtn);
        offbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        offbtn.setText("OFF");
        offbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offbtnActionPerformed(evt);
            }
        });

        backspace.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backspace.setText("<--");
        backspace.setPreferredSize(new java.awt.Dimension(60, 35));
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        clearbtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        clearbtn.setText("C");
        clearbtn.setPreferredSize(new java.awt.Dimension(60, 35));
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        sumbtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        sumbtn.setText("+");
        sumbtn.setPreferredSize(new java.awt.Dimension(60, 35));
        sumbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumbtnActionPerformed(evt);
            }
        });

        ninebtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ninebtn.setText("9");
        ninebtn.setPreferredSize(new java.awt.Dimension(60, 35));
        ninebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ninebtnActionPerformed(evt);
            }
        });

        minusbtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        minusbtn.setText("-");
        minusbtn.setPreferredSize(new java.awt.Dimension(60, 35));
        minusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusbtnActionPerformed(evt);
            }
        });

        sevenbtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        sevenbtn.setText("7");
        sevenbtn.setPreferredSize(new java.awt.Dimension(60, 35));
        sevenbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenbtnActionPerformed(evt);
            }
        });

        eightbtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        eightbtn.setText("8");
        eightbtn.setPreferredSize(new java.awt.Dimension(60, 35));
        eightbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightbtnActionPerformed(evt);
            }
        });

        fourbtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        fourbtn.setText("4");
        fourbtn.setPreferredSize(new java.awt.Dimension(60, 35));
        fourbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourbtnActionPerformed(evt);
            }
        });

        fivebtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        fivebtn.setText("5");
        fivebtn.setPreferredSize(new java.awt.Dimension(60, 35));
        fivebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fivebtnActionPerformed(evt);
            }
        });

        sixbtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        sixbtn.setText("6");
        sixbtn.setPreferredSize(new java.awt.Dimension(60, 35));
        sixbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixbtnActionPerformed(evt);
            }
        });

        multiplicationbtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        multiplicationbtn.setText("*");
        multiplicationbtn.setPreferredSize(new java.awt.Dimension(60, 35));
        multiplicationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationbtnActionPerformed(evt);
            }
        });

        onebtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        onebtn.setText("1");
        onebtn.setPreferredSize(new java.awt.Dimension(60, 35));
        onebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onebtnActionPerformed(evt);
            }
        });

        twobtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        twobtn.setText("2");
        twobtn.setPreferredSize(new java.awt.Dimension(60, 35));
        twobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twobtnActionPerformed(evt);
            }
        });

        threebtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        threebtn.setText("3");
        threebtn.setPreferredSize(new java.awt.Dimension(60, 35));
        threebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threebtnActionPerformed(evt);
            }
        });

        divisionbtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        divisionbtn.setText("/");
        divisionbtn.setPreferredSize(new java.awt.Dimension(60, 35));
        divisionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionbtnActionPerformed(evt);
            }
        });

        zerobtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        zerobtn.setText("0");
        zerobtn.setPreferredSize(new java.awt.Dimension(60, 35));
        zerobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zerobtnActionPerformed(evt);
            }
        });

        dotbtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        dotbtn.setText(".");
        dotbtn.setPreferredSize(new java.awt.Dimension(60, 35));
        dotbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotbtnActionPerformed(evt);
            }
        });

        equalbtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        equalbtn.setText("=");
        equalbtn.setPreferredSize(new java.awt.Dimension(60, 35));
        equalbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Calculator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(zerobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(dotbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(equalbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(onebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(twobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(threebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(divisionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(sevenbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(eightbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(ninebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(minusbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(fourbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(fivebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(sixbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(multiplicationbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(onbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(offbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sumbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 6, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(onbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(offbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backspace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sumbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ninebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(minusbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sevenbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eightbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sixbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(multiplicationbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fourbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fivebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(threebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(divisionbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(onebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(twobtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equalbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zerobtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dotbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        
        int length = jTextField1.getText().length();
        int number = jTextField1.getText().length() - 1;
        String store;
        
        if(length > 0)
        {
            StringBuilder back = new StringBuilder(jTextField1.getText());
            back.deleteCharAt(number);
            store = back.toString();
            jTextField1.setText(store);
        }
    }//GEN-LAST:event_backspaceActionPerformed

    private void onbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onbtnActionPerformed
        enable();
    }//GEN-LAST:event_onbtnActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void offbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offbtnActionPerformed
        disable();
    }//GEN-LAST:event_offbtnActionPerformed

    private void onebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onebtnActionPerformed
        jTextField1.setText(jTextField1.getText() + "1");
    }//GEN-LAST:event_onebtnActionPerformed

    private void twobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twobtnActionPerformed
        jTextField1.setText(jTextField1.getText() + "2");
    }//GEN-LAST:event_twobtnActionPerformed

    private void threebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threebtnActionPerformed
        jTextField1.setText(jTextField1.getText() + "3");
    }//GEN-LAST:event_threebtnActionPerformed

    private void fourbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourbtnActionPerformed
        jTextField1.setText(jTextField1.getText() + "4");
    }//GEN-LAST:event_fourbtnActionPerformed

    private void fivebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fivebtnActionPerformed
        jTextField1.setText(jTextField1.getText() + "5");
    }//GEN-LAST:event_fivebtnActionPerformed

    private void sixbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixbtnActionPerformed
        jTextField1.setText(jTextField1.getText() + "6");
    }//GEN-LAST:event_sixbtnActionPerformed

    private void sevenbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenbtnActionPerformed
        jTextField1.setText(jTextField1.getText() + "7");
    }//GEN-LAST:event_sevenbtnActionPerformed

    private void eightbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightbtnActionPerformed
        jTextField1.setText(jTextField1.getText() + "8");
    }//GEN-LAST:event_eightbtnActionPerformed

    private void ninebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ninebtnActionPerformed
        jTextField1.setText(jTextField1.getText() + "9");
    }//GEN-LAST:event_ninebtnActionPerformed

    private void sumbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumbtnActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation = 1;
        jTextField1.setText("");
        jLabel1.setText(num + "+");
    }//GEN-LAST:event_sumbtnActionPerformed

    private void minusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusbtnActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation = 2;
        jTextField1.setText("");
        jLabel1.setText(num + "-");
    }//GEN-LAST:event_minusbtnActionPerformed

    private void multiplicationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationbtnActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation = 3;
        jTextField1.setText("");
        jLabel1.setText(num + "*");
    }//GEN-LAST:event_multiplicationbtnActionPerformed

    private void divisionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionbtnActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation = 4;
        jTextField1.setText("");
        jLabel1.setText(num + "/");
    }//GEN-LAST:event_divisionbtnActionPerformed

    private void dotbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotbtnActionPerformed
        jTextField1.setText(jTextField1.getText() + ".");
    }//GEN-LAST:event_dotbtnActionPerformed

    private void zerobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zerobtnActionPerformed
        jTextField1.setText(jTextField1.getText() + "0");
    }//GEN-LAST:event_zerobtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        jTextField1.setText("");
    }//GEN-LAST:event_clearbtnActionPerformed

    private void equalbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalbtnActionPerformed
        
        arithmetic_operation();
        jLabel1.setText("");
    }//GEN-LAST:event_equalbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backspace;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton divisionbtn;
    private javax.swing.JButton dotbtn;
    private javax.swing.JButton eightbtn;
    private javax.swing.JButton equalbtn;
    private javax.swing.JButton fivebtn;
    private javax.swing.JButton fourbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton minusbtn;
    private javax.swing.JButton multiplicationbtn;
    private javax.swing.JButton ninebtn;
    private javax.swing.JRadioButton offbtn;
    private javax.swing.JRadioButton onbtn;
    private javax.swing.JButton onebtn;
    private javax.swing.JButton sevenbtn;
    private javax.swing.JButton sixbtn;
    private javax.swing.JButton sumbtn;
    private javax.swing.JButton threebtn;
    private javax.swing.JButton twobtn;
    private javax.swing.JButton zerobtn;
    // End of variables declaration//GEN-END:variables
}
