package complex.numbers.gui;
import java.awt.Toolkit;
import static java.lang.Float.parseFloat;
public class JFrame extends javax.swing.JFrame {
        float r1, r2, i1 , i2;

    public JFrame() {
        initComponents();
        setCenter();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    private void setCenter(){
        Toolkit tool = Toolkit.getDefaultToolkit();
        double screenWidth = tool.getScreenSize().getWidth();
        double screenHeight = tool.getScreenSize().getHeight();
        double frameWidth = this.getWidth();
        double frameHeight = this.getHeight();
        double y = (screenHeight - frameHeight)/2;
        double x = (screenWidth - frameWidth)/2;
        this.setLocation((int)x,(int)y);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        realNum1_txtfield = new javax.swing.JTextField();
        realNum2_txtfield = new javax.swing.JTextField();
        imagNum2_txtfield = new javax.swing.JTextField();
        imagNum1_txtfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        plus_btn = new javax.swing.JButton();
        minus_btn = new javax.swing.JButton();
        division_btn = new javax.swing.JButton();
        multiple_btn = new javax.swing.JButton();
        realResult_txtfield = new javax.swing.JTextField();
        imagResult_txtfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Complex Numbers");

        jLabel2.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        jLabel2.setText("Number 1:");

        jLabel3.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        jLabel3.setText("Number 2:");

        realNum1_txtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        realNum2_txtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        imagNum2_txtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        imagNum1_txtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        jLabel4.setText("+");

        jLabel6.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        jLabel6.setText("i");

        jLabel7.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        jLabel7.setText("i");

        jLabel8.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        jLabel8.setText("Result:");

        plus_btn.setBackground(new java.awt.Color(102, 255, 102));
        plus_btn.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        plus_btn.setText("+");
        plus_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus_btnActionPerformed(evt);
            }
        });

        minus_btn.setBackground(new java.awt.Color(102, 255, 102));
        minus_btn.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        minus_btn.setText("-");
        minus_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minus_btnActionPerformed(evt);
            }
        });

        division_btn.setBackground(new java.awt.Color(102, 255, 102));
        division_btn.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        division_btn.setText("/");
        division_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                division_btnActionPerformed(evt);
            }
        });

        multiple_btn.setBackground(new java.awt.Color(102, 255, 102));
        multiple_btn.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        multiple_btn.setText("*");
        multiple_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiple_btnActionPerformed(evt);
            }
        });

        realResult_txtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        imagResult_txtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        imagResult_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagResult_txtfieldActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        jLabel11.setText("+");

        jLabel12.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        jLabel12.setText("+");

        jLabel9.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        jLabel9.setText("i");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(plus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multiple_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(division_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imagResult_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(realResult_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(realNum2_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(imagNum2_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(realNum1_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(imagNum1_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(realNum1_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagNum1_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(realNum2_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(imagNum2_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plus_btn)
                    .addComponent(division_btn)
                    .addComponent(multiple_btn)
                    .addComponent(minus_btn))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(realResult_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagResult_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void getNumbers(){
        r1 = parseFloat( realNum1_txtfield.getText());
        r2 = parseFloat(realNum2_txtfield.getText());
        i1 = parseFloat(imagNum1_txtfield.getText());
        i2 = parseFloat(imagNum2_txtfield.getText());
    }
    private void plus_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus_btnActionPerformed
         getNumbers();
        imagResult_txtfield.setText(String.valueOf(i1+i2));
        realResult_txtfield.setText(String.valueOf(r1+r2));
    }//GEN-LAST:event_plus_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        realNum1_txtfield.setText("");
        realNum2_txtfield.setText("");
        imagNum1_txtfield.setText("");
        imagNum2_txtfield.setText("");
        imagResult_txtfield.setText("");
        realResult_txtfield.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void minus_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minus_btnActionPerformed
        getNumbers();
        imagResult_txtfield.setText(String.valueOf(i1-i2));
        realResult_txtfield.setText(String.valueOf(r1-r2));
    }//GEN-LAST:event_minus_btnActionPerformed

    private void multiple_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiple_btnActionPerformed
         getNumbers();
         float finalReal = r1*r2 - i1*i2;
         float finalImag = r1*i2 + i1*r2;
         realResult_txtfield.setText(String.valueOf(finalReal));
         imagResult_txtfield.setText(String.valueOf(finalImag));
    }//GEN-LAST:event_multiple_btnActionPerformed

    private void division_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_division_btnActionPerformed
        getNumbers();
       float denominator = (r2*r2)+(i2*i2);
       float finalReal = (r1*r2 - i1*(-1*i2))/denominator;
       float finalImag = (r1*(-1*i2) + i1*r2)/denominator;
       realResult_txtfield.setText(String.valueOf(finalReal));
       imagResult_txtfield.setText(String.valueOf(finalImag));
    }//GEN-LAST:event_division_btnActionPerformed

    private void imagResult_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagResult_txtfieldActionPerformed
        // Nothing
    }//GEN-LAST:event_imagResult_txtfieldActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton division_btn;
    private javax.swing.JTextField imagNum1_txtfield;
    private javax.swing.JTextField imagNum2_txtfield;
    private javax.swing.JTextField imagResult_txtfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton minus_btn;
    private javax.swing.JButton multiple_btn;
    private javax.swing.JButton plus_btn;
    private javax.swing.JTextField realNum1_txtfield;
    private javax.swing.JTextField realNum2_txtfield;
    private javax.swing.JTextField realResult_txtfield;
    // End of variables declaration//GEN-END:variables
}
