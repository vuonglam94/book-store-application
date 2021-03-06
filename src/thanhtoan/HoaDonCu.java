/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thanhtoan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author My PC
 */
public class HoaDonCu extends javax.swing.JFrame {

    /**
     * Creates new form HoaDonCu2
     */
    int soHoaDon;
    int soThuTu;
    File file =new File();
    public HoaDonCu() {
        this.setVisible(rootPaneCheckingEnabled);
        initComponents();
        tfSoHoaDon.setEnabled(false);
        tfSoThuTu.setEnabled(false);
        soThuTu=1;
        file.docMaHoaDon();
        soHoaDon=file.soHoaDon-1;
        if(soHoaDon!=0){
        tfSoHoaDon.setText(Integer.toString(soHoaDon));
        docFile(soThuTu);
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

        jLabel1 = new javax.swing.JLabel();
        tfSoHoaDon = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        btPrevious = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfSoThuTu = new javax.swing.JTextField();

        setTitle("Hóa Đơn Cũ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Số Hóa Đơn");

        tfSoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSoHoaDonActionPerformed(evt);
            }
        });

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane2.setViewportView(jTextArea);

        btPrevious.setText("Trước");
        btPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPreviousActionPerformed(evt);
            }
        });

        btNext.setText("Sau");
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });

        jLabel2.setText("Số Thứ Tự");

        tfSoThuTu.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btPrevious)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNext, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSoThuTu, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfSoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSoHoaDon)
                    .addComponent(btPrevious)
                    .addComponent(btNext)
                    .addComponent(jLabel2)
                    .addComponent(tfSoThuTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPreviousActionPerformed
        
        if(soThuTu==1) JOptionPane.showMessageDialog(null,"Đã trở về hóa đơn đầu tiên !");
        else{
            soThuTu--;
            docFile(soThuTu);
            
        }
    }//GEN-LAST:event_btPreviousActionPerformed

    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextActionPerformed
        
        if(soThuTu==soHoaDon) JOptionPane.showMessageDialog(null,"Đã đến hóa đơn cuối cùng !");
        else{
            soThuTu++;
            docFile(soThuTu);
           
        }
    }//GEN-LAST:event_btNextActionPerformed

    private void tfSoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSoHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSoHoaDonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HoaDonCu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HoaDonCu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HoaDonCu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HoaDonCu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        new HoaDonCu();
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HoaDonCu().setVisible(true);
//            }
//        });
//    }
public  void docFile(int index) {
    String result = "";
    String fileName =layTenFile(index);
   try {
      BufferedReader reader = new BufferedReader(new FileReader(fileName));
      String ln=null;
        try {
            while((ln=reader.readLine())!=null){
                result += ln + "\r\n";
            } 
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(HoaDonCu.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Lỗi đọc ghi!");
        }
      
   } catch (FileNotFoundException ex) {
         System.out.println("Không tìm thấy file!");
   }
   jTextArea.setText(result);
   tfSoThuTu.setText(Integer.toString(soThuTu));
}
public String layTenFile(int index){
        String result= Integer.toString(index);
        int strLen=result.length();
        for(int i=0;i<10-strLen;i++)
            result="0"+result;
        result="data/MH"+result+".txt";
        return result;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNext;
    private javax.swing.JButton btPrevious;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField tfSoHoaDon;
    private javax.swing.JTextField tfSoThuTu;
    // End of variables declaration//GEN-END:variables
}
