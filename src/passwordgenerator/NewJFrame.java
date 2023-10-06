package passwordgenerator;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class NewJFrame extends javax.swing.JFrame {

    Password contrasenia = new Password();

    public NewJFrame() {
        initComponents();
        setTitle("Password Generator");
        setResizable(false);
        GeneratedPassword.setEnabled(false);
        Copy.setEnabled(false);
        setIconImage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Numbers = new javax.swing.JCheckBox();
        GeneratedPassword = new javax.swing.JTextField();
        Specials = new javax.swing.JCheckBox();
        Generate = new javax.swing.JButton();
        Copy = new javax.swing.JButton();
        slider = new javax.swing.JSlider();
        sliderValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Numbers.setSelected(true);
        Numbers.setText("Numbers");
        Numbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumbersActionPerformed(evt);
            }
        });

        GeneratedPassword.setText("Password");
        GeneratedPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneratedPasswordActionPerformed(evt);
            }
        });

        Specials.setSelected(true);
        Specials.setText("Special");
        Specials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecialsActionPerformed(evt);
            }
        });

        Generate.setText("Generate");
        Generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateActionPerformed(evt);
            }
        });

        Copy.setText("Copy");
        Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyActionPerformed(evt);
            }
        });

        slider.setValue(8);
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        sliderValue.setText("8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Numbers)
                                .addGap(18, 18, 18)
                                .addComponent(Specials)
                                .addGap(18, 18, 18)
                                .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Generate))
                        .addGap(15, 15, 15)
                        .addComponent(sliderValue))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GeneratedPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Copy, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GeneratedPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Copy, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Numbers)
                    .addComponent(Specials)
                    .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderValue))
                .addGap(18, 18, 18)
                .addComponent(Generate)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumbersActionPerformed
        boolean isNumbersSelected = Numbers.isSelected();

        if (isNumbersSelected) {
            contrasenia.setIncludeNumbers(true);
        } else {
            contrasenia.setIncludeNumbers(false);
        }

        if (isNumbersSelected) {
            System.out.println("Numbers is enabled");
        } else {
            System.out.println("Numbers is disabled");
        }
    }//GEN-LAST:event_NumbersActionPerformed

    private void SpecialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecialsActionPerformed
        boolean isSpecialsSelected = Specials.isSelected();

        if (isSpecialsSelected) {
            contrasenia.setIncludeSpecials(true);
        } else {
            contrasenia.setIncludeSpecials(false);
        }

        if (isSpecialsSelected) {
            System.out.println("specials is enabled");
        } else {
            System.out.println("specials is disabled");
        }
    }//GEN-LAST:event_SpecialsActionPerformed

    private void GeneratedPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneratedPasswordActionPerformed

    }//GEN-LAST:event_GeneratedPasswordActionPerformed

    private void GenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateActionPerformed
        GeneratedPassword.setEnabled(true);
        Copy.setEnabled(true);

        contrasenia.generatePassword(); // Generar la contraseña
        String password = contrasenia.getPassword();

        System.out.println(password);
        // Borra el texto anterior en el JTextField
        GeneratedPassword.setText("");

        // Agrega la nueva contraseña al JTextField
        GeneratedPassword.setText(password);

    }//GEN-LAST:event_GenerateActionPerformed

    private void CopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyActionPerformed

        String textToCopy = GeneratedPassword.getText();
        StringSelection stringSelection = new StringSelection(textToCopy);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_CopyActionPerformed

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        int sliderGetValue = slider.getValue();

        sliderValue.setText("" + sliderGetValue);
        contrasenia.setLength(sliderGetValue);
        System.out.println("lenght has been set to " + sliderGetValue);
    }//GEN-LAST:event_sliderStateChanged

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Copy;
    private javax.swing.JButton Generate;
    private javax.swing.JTextField GeneratedPassword;
    private javax.swing.JCheckBox Numbers;
    private javax.swing.JCheckBox Specials;
    private javax.swing.JSlider slider;
    private javax.swing.JLabel sliderValue;
    // End of variables declaration//GEN-END:variables
}
