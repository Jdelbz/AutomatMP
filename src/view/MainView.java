/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import controller.MainController;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author joshd
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    
    private int location = 0; // 0 = earth, 1 = mars
    private int numOfSelected = 0; // 0 none, 2 max
    private int humanSelected = 0;
    private int humanSelected1 = 0;
    private int cowSelected = 0;
    private int lionSelected = 0;
    private int grainSelected = 0;
    private MainController control; 
    
    public MainView() {
        initComponents();
        initImages();
        setVisible(true);
    }
    
    public void setControl(MainController control){
        this.control = control;
    }
    
    public void initImages(){
        HumanRight.setVisible(false);
        HumanRight1.setVisible(false);
        LionRight.setVisible(false);
        GrainRight.setVisible(false);
        CowRight.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGPanel = new javax.swing.JPanel();
        ShipImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SwapBtn = new javax.swing.JButton();
        HumanRight = new javax.swing.JLabel();
        HumanRight1 = new javax.swing.JLabel();
        LionRight = new javax.swing.JLabel();
        GrainRight = new javax.swing.JLabel();
        CowRight = new javax.swing.JLabel();
        HumanLeft = new javax.swing.JLabel();
        HumanLeft1 = new javax.swing.JLabel();
        LionLeft = new javax.swing.JLabel();
        GrainLeft = new javax.swing.JLabel();
        CowLeft = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        BGPanel.setBackground(new java.awt.Color(255, 255, 255));
        BGPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ShipImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Spaceship-default.png"))); // NOI18N
        BGPanel.add(ShipImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 146, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/earth.jpg"))); // NOI18N
        BGPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 627, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mars.jpg"))); // NOI18N
        BGPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 627, -1, -1));

        SwapBtn.setBackground(new java.awt.Color(255, 255, 255));
        SwapBtn.setText("->");
        SwapBtn.setOpaque(false);
        SwapBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SwapBtnActionPerformed(evt);
            }
        });
        BGPanel.add(SwapBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 348, -1, -1));

        HumanRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Human.png"))); // NOI18N
        HumanRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HumanRightMouseClicked(evt);
            }
        });
        BGPanel.add(HumanRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 11, -1, -1));

        HumanRight1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Human.png"))); // NOI18N
        HumanRight1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HumanRight1MouseClicked(evt);
            }
        });
        BGPanel.add(HumanRight1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 135, -1, -1));

        LionRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lion.png"))); // NOI18N
        LionRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LionRightMouseClicked(evt);
            }
        });
        BGPanel.add(LionRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 259, -1, -1));

        GrainRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grain.png"))); // NOI18N
        GrainRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GrainRightMouseClicked(evt);
            }
        });
        BGPanel.add(GrainRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        CowRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cow.png"))); // NOI18N
        CowRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CowRightMouseClicked(evt);
            }
        });
        BGPanel.add(CowRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 466, -1, -1));

        HumanLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Human.png"))); // NOI18N
        HumanLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HumanLeftMouseClicked(evt);
            }
        });
        BGPanel.add(HumanLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 11, -1, -1));

        HumanLeft1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Human.png"))); // NOI18N
        HumanLeft1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HumanLeft1MouseClicked(evt);
            }
        });
        BGPanel.add(HumanLeft1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 140, -1, -1));

        LionLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lion.png"))); // NOI18N
        LionLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LionLeftMouseClicked(evt);
            }
        });
        BGPanel.add(LionLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 264, -1, -1));

        GrainLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grain.png"))); // NOI18N
        GrainLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GrainLeftMouseClicked(evt);
            }
        });
        BGPanel.add(GrainLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 365, -1, -1));

        CowLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cow.png"))); // NOI18N
        CowLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CowLeftMouseClicked(evt);
            }
        });
        BGPanel.add(CowLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 471, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HumanLeftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HumanLeftMouseClicked
        // TODO add your handling code here:
        if(location == 0 && humanSelected == 0 && numOfSelected < 2){
            numOfSelected++;
            humanSelected = 1;
            HumanLeft.setVisible(false);
            if(numOfSelected == 1){
                    ShipImage.setIcon(new ImageIcon(getClass().getResource("../images/Spaceship-Human.png")));
                    ShipImage.revalidate();
            }else{
                if(humanSelected1 == 1){
                    //setIcon to images/Spaceship-HumanHuman.png
                    ShipImage.setIcon(new ImageIcon(getClass().getResource("../images/Spaceship-HumanHuman.png")));
                    ShipImage.revalidate();
                } else if(lionSelected == 1){
                    //setIcon to images/Spaceship-HumanLion.png
                    ShipImage.setIcon(new ImageIcon(getClass().getResource("../images/Spaceship-HumanLion.png")));
                    ShipImage.revalidate();
                } else if(cowSelected == 1){
                    //setIcon to images/Spaceship-CowHuman.png
                    ShipImage.setIcon(new ImageIcon(getClass().getResource("../images/Spaceship-CowHuman.png")));
                    ShipImage.revalidate();
                } else if(grainSelected == 1){
                    //setIcon to images/Spaceship-GrainHuman.png
                    ShipImage.setIcon(new ImageIcon(getClass().getResource("../images/Spaceship-GrainHuman.png")));
                    ShipImage.revalidate();
                }
            }
            //spaceship will have 1 human
        }
    }//GEN-LAST:event_HumanLeftMouseClicked

    private void HumanLeft1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HumanLeft1MouseClicked
        // TODO add your handling code here:
        if(location == 0 && humanSelected1 == 0 && numOfSelected <2){
            numOfSelected++;
            humanSelected1 = 1;
            HumanLeft1.setVisible(false);
            if(numOfSelected == 1){
                try{
                    ShipImage.setIcon(new ImageIcon(ImageIO.read(new File("images/Spaceship-Human.png"))));
                } catch(IOException e){
          
                }
            }else{
                if(humanSelected == 1){
                    //setIcon to images/Spaceship-HumanHuman.png
                } else if(lionSelected == 1){
                    //setIcon to images/Spaceship-HumanLion.png
                } else if(cowSelected == 1){
                    //setIcon to images/Spaceship-CowHuman.png
                } else if(grainSelected == 1){
                    //setIcon to images/Spaceship-GrainHuman.png
                }
            }
            //spaceship will have 1 human
        }
    }//GEN-LAST:event_HumanLeft1MouseClicked

    private void LionLeftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LionLeftMouseClicked
        // TODO add your handling code here:
        if(location == 0 && lionSelected == 0 && numOfSelected <2){
            numOfSelected++;
            lionSelected = 1;
            LionLeft.setVisible(false);
            if(numOfSelected == 1){
                try{
                    ShipImage.setIcon(new ImageIcon(ImageIO.read(new File("images/Spaceship-Lion.png"))));
                } catch(IOException e){
          
                }
            }else{
                if(humanSelected == 1 || humanSelected1 == 1){
                    //setIcon to images/Spaceship-HumanLion.png
                } else if(cowSelected == 1){
                    //setIcon to images/Spaceship-CowLion.png
                } else if(grainSelected == 1){
                    //setIcon to images/Spaceship-GrainLion.png
                }
            }
            //spaceship will have lion
        }
    }//GEN-LAST:event_LionLeftMouseClicked

    private void GrainLeftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GrainLeftMouseClicked
        // TODO add your handling code here:
        if(location == 0 && grainSelected == 0 && numOfSelected <2){
            numOfSelected++;
            grainSelected = 1;
            GrainLeft.setVisible(false);
            if(numOfSelected == 1){
                try{
                    ShipImage.setIcon(new ImageIcon(ImageIO.read(new File("images/Spaceship-Grain.png"))));
                } catch(IOException e){
          
                }
            }else{
                if(humanSelected == 1 || humanSelected1 == 1){
                    //setIcon to images/Spaceship-GrainHuman.png
                } else if(lionSelected == 1){
                    //setIcon to images/Spaceship-GrainLion.png
                } else if(cowSelected == 1){
                    //setIcon to images/Spaceship-CowGrain.png
                }
            }
            //spaceship will have grain
        }
    }//GEN-LAST:event_GrainLeftMouseClicked

    private void CowLeftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CowLeftMouseClicked
        // TODO add your handling code here:
        if(location == 0 && cowSelected == 0 && numOfSelected <2){
            numOfSelected++;
            cowSelected = 1;
            CowLeft.setVisible(false);
            if(numOfSelected == 1){
                try{
                    ShipImage.setIcon(new ImageIcon(ImageIO.read(new File("images/Spaceship-Cow.png")))); //this throws an IOException
                } catch(IOException e){
          
                }
            }else{
                if(humanSelected == 1 || humanSelected1 == 1){
                    //setIcon to images/Spaceship-CowHuman.png
                } else if(lionSelected == 1){
                    //setIcon to images/Spaceship-CowLion.png
                }else if(grainSelected == 1){
                    //setIcon to images/Spaceship-CowGrain.png
                }
            }
            //spaceship will have cow
        }
    }//GEN-LAST:event_CowLeftMouseClicked

    private void HumanRightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HumanRightMouseClicked
        // TODO add your handling code here:
        if(location == 1 && humanSelected == 0 && numOfSelected <2){
            numOfSelected++;
            humanSelected = 1;
            HumanRight.setVisible(false);
            if(numOfSelected == 1){
                try{
                    ShipImage.setIcon(new ImageIcon(ImageIO.read(new File("images/Spaceship-Human.png"))));
                } catch(IOException e){
          
                }
            }else{
                if(humanSelected1 == 1){
                    //setIcon to images/Spaceship-HumanHuman.png
                } else if(lionSelected == 1){
                    //setIcon to images/Spaceship-HumanLion.png
                } else if(cowSelected == 1){
                    //setIcon to images/Spaceship-CowHuman.png
                } else if(grainSelected == 1){
                    //setIcon to images/Spaceship-GrainHuman.png
                }
            }
            //spaceship will have 1 human
        }
    }//GEN-LAST:event_HumanRightMouseClicked

    private void HumanRight1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HumanRight1MouseClicked
        // TODO add your handling code here:
        if(location == 1 && humanSelected1 == 0 && numOfSelected <2){
            numOfSelected++;
            humanSelected1 = 1;
            HumanRight1.setVisible(false);
            if(numOfSelected == 1){
                try{
                    ShipImage.setIcon(new ImageIcon(ImageIO.read(new File("images/Spaceship-Human.png"))));
                } catch(IOException e){
          
                }
            }else{
                if(humanSelected == 1){
                    //setIcon to images/Spaceship-HumanHuman.png
                } else if(lionSelected == 1){
                    //setIcon to images/Spaceship-HumanLion.png
                } else if(cowSelected == 1){
                    //setIcon to images/Spaceship-CowHuman.png
                } else if(grainSelected == 1){
                    //setIcon to images/Spaceship-GrainHuman.png
                }
            }
            //spaceship will have 1 human
        }
    }//GEN-LAST:event_HumanRight1MouseClicked

    private void LionRightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LionRightMouseClicked
        // TODO add your handling code here:
        if(location == 1 && lionSelected == 0 && numOfSelected <2){
            numOfSelected++;
            lionSelected = 1;
            LionRight.setVisible(false);
            if(numOfSelected == 1){
                try{
                    ShipImage.setIcon(new ImageIcon(ImageIO.read(new File("images/Spaceship-Lion.png"))));
                } catch(IOException e){
          
                }
            }else{
                if(humanSelected == 1 || humanSelected1 == 1){
                    //setIcon to images/Spaceship-HumanLion.png
                } else if(cowSelected == 1){
                    //setIcon to images/Spaceship-CowLion.png
                } else if(grainSelected == 1){
                    //setIcon to images/Spaceship-GrainLion.png
                }
            }
            //spaceship will have lion
        }
    }//GEN-LAST:event_LionRightMouseClicked

    private void GrainRightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GrainRightMouseClicked
        // TODO add your handling code here:
        if(location == 1 && grainSelected == 0 && numOfSelected <2){
            numOfSelected++;
            grainSelected = 1;
            GrainRight.setVisible(false);
            if(numOfSelected == 1){
                try{
                    ShipImage.setIcon(new ImageIcon(ImageIO.read(new File("images/Spaceship-Grain.png"))));
                } catch(IOException e){
          
                }
            }else{
                if(humanSelected == 1 || humanSelected1 == 1){
                    //setIcon to images/Spaceship-GrainHuman.png
                } else if(lionSelected == 1){
                    //setIcon to images/Spaceship-GrainLion.png
                } else if(cowSelected == 1){
                    //setIcon to images/Spaceship-CowGrain.png
                }
            }
            //spaceship will have grain
        }
    }//GEN-LAST:event_GrainRightMouseClicked

    private void CowRightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CowRightMouseClicked
        // TODO add your handling code here:
        if(location == 1 && cowSelected == 0 && numOfSelected <2){
            numOfSelected++;
            cowSelected = 1;
            CowRight.setVisible(false);
            if(numOfSelected == 1){
                try{
                    ShipImage.setIcon(new ImageIcon(ImageIO.read(new File("images/Spaceship-Cow.png")))); //this throws an IOException
                } catch(IOException e){
          
                }
            }else{
                if(humanSelected == 1 || humanSelected1 == 1){
                    //setIcon to images/Spaceship-CowHuman.png
                } else if(lionSelected == 1){
                    //setIcon to images/Spaceship-CowLion.png
                }else if(grainSelected == 1){
                    //setIcon to images/Spaceship-CowGrain.png
                }
            }
            //spaceship will have cow
        }
    }//GEN-LAST:event_CowRightMouseClicked

    private void SwapBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SwapBtnActionPerformed
        // TODO add your handling code here:
        String inputString = "";
        if(location == 0){
            if(humanSelected == 1){
                HumanRight.setVisible(true);
                humanSelected = 0;
                numOfSelected--;
                inputString = inputString + "HUMAN";
            }
            if(humanSelected1 == 1){
                HumanRight1.setVisible(true);
                humanSelected1 = 0;
                numOfSelected--;
                inputString = inputString + "HUMAN";
            }
            if(lionSelected == 1){
                LionRight.setVisible(true);
                lionSelected = 0;
                numOfSelected--;
                inputString = inputString + "LION";
            }
            if(cowSelected == 1){
                CowRight.setVisible(true);
                cowSelected = 0;
                numOfSelected--;
                inputString = inputString + "COW";
            }
            if(grainSelected == 1){
                GrainRight.setVisible(true);
                grainSelected = 0;
                numOfSelected--;
                inputString = inputString + "GRAIN";
            }
            SwapBtn.setLabel("<-");
            location = 1;
            System.out.println(inputString);
            if(!control.getGraph().moveCurrentViaInput(inputString + control.getGraph().getCurrent().getStateNumber())){
                JOptionPane.showMessageDialog(new JFrame(),
                "You failed your mission :(",
                "Invalid Move",
                JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }
            System.out.println(control.getGraph().getCurrent().getStateNumber());
            inputString = "";
        } else if(location == 1){
            if(humanSelected == 1){
                HumanLeft.setVisible(true);
                humanSelected = 0;
                numOfSelected--;
                inputString = inputString + "HUMAN";
            }
            if(humanSelected1 == 1){
                HumanLeft1.setVisible(true);
                humanSelected1 = 0;
                numOfSelected--;
                inputString = inputString + "HUMAN";
            }
            if(lionSelected == 1){
                LionLeft.setVisible(true);
                lionSelected = 0;
                numOfSelected--;
                inputString = inputString + "LION";
            }
            if(cowSelected == 1){
                CowLeft.setVisible(true);
                cowSelected = 0;
                numOfSelected--;
                inputString = inputString + "COW";
            }
            if(grainSelected == 1){
                GrainLeft.setVisible(true);
                grainSelected = 0;
                numOfSelected--;
                inputString = inputString + "GRAIN";
            }
            SwapBtn.setLabel("->");
            location = 0;
//            System.out.println(inputString + control.getGraph().getCurrent().getStateNumber());
            if(!control.getGraph().moveCurrentViaInput(inputString  + control.getGraph().getCurrent().getStateNumber())){
                JOptionPane.showMessageDialog(new JFrame(),
                "You failed your mission :(",
                "Invalid Move",
                JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }
            System.out.println(control.getGraph().getCurrent().getStateNumber());
            inputString = "";
        }
    }//GEN-LAST:event_SwapBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BGPanel;
    private javax.swing.JLabel CowLeft;
    private javax.swing.JLabel CowRight;
    private javax.swing.JLabel GrainLeft;
    private javax.swing.JLabel GrainRight;
    private javax.swing.JLabel HumanLeft;
    private javax.swing.JLabel HumanLeft1;
    private javax.swing.JLabel HumanRight;
    private javax.swing.JLabel HumanRight1;
    private javax.swing.JLabel LionLeft;
    private javax.swing.JLabel LionRight;
    private javax.swing.JLabel ShipImage;
    private javax.swing.JButton SwapBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
