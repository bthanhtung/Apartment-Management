package main;

import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.ConnectDB.KetNoi;

/**
 *
 * @author TUNGBT-TRUNGNM
 */
public class KhuCanHo extends javax.swing.JFrame {

    public KhuCanHo() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getDulieu();
    }
    
    KetNoi ketNoi = new KetNoi();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        panel_KhuCanHo = new javax.swing.JPanel();
        panel_ThongTin = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        khuCanHo_jTextField_soTang = new javax.swing.JTextField();
        khuCanHo_jTextField_tenKhu = new javax.swing.JTextField();
        khuCanHo_jTextField_soCan = new javax.swing.JTextField();
        khuCanHo_jTextField_diaChi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        khuCanHo_jTextField_timKiem = new javax.swing.JTextField();
        khuCanHo_jButton_them = new javax.swing.JButton();
        khuCanHo_jButton_sua = new javax.swing.JButton();
        khuCanHo_jButton_xoa = new javax.swing.JButton();
        khuCanHo_jButton_tim = new javax.swing.JButton();
        khuCanHo_jButton_reset = new javax.swing.JButton();
        khuCanHo_jComboBox_typeTimKiem = new javax.swing.JComboBox<>();
        khuCanHo_jTextField_maKhu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_KhuCanHo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/home_48px_1.png"))); // NOI18N
        jLabel15.setText("Khu căn hộ");

        panel_KhuCanHo.setPreferredSize(new java.awt.Dimension(800, 500));

        panel_ThongTin.setBackground(new java.awt.Color(204, 255, 204));
        panel_ThongTin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel_ThongTin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Mã khu");
        panel_ThongTin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Tên khu");
        panel_ThongTin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Số tầng");
        panel_ThongTin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Số căn");
        panel_ThongTin.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Địa chỉ");
        panel_ThongTin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));
        panel_ThongTin.add(khuCanHo_jTextField_soTang, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 121, -1));
        panel_ThongTin.add(khuCanHo_jTextField_tenKhu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 140, -1));
        panel_ThongTin.add(khuCanHo_jTextField_soCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 121, -1));
        panel_ThongTin.add(khuCanHo_jTextField_diaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 140, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Tìm kiếm");
        panel_ThongTin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));
        panel_ThongTin.add(khuCanHo_jTextField_timKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 120, -1));

        khuCanHo_jButton_them.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        khuCanHo_jButton_them.setText("THÊM");
        khuCanHo_jButton_them.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khuCanHo_jButton_themMouseClicked(evt);
            }
        });
        khuCanHo_jButton_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                khuCanHo_jButton_themActionPerformed(evt);
            }
        });
        panel_ThongTin.add(khuCanHo_jButton_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        khuCanHo_jButton_sua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        khuCanHo_jButton_sua.setText("SỬA");
        khuCanHo_jButton_sua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khuCanHo_jButton_suaMouseClicked(evt);
            }
        });
        panel_ThongTin.add(khuCanHo_jButton_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        khuCanHo_jButton_xoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        khuCanHo_jButton_xoa.setText("XOÁ");
        khuCanHo_jButton_xoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khuCanHo_jButton_xoaMouseClicked(evt);
            }
        });
        panel_ThongTin.add(khuCanHo_jButton_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        khuCanHo_jButton_tim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        khuCanHo_jButton_tim.setText("Tìm");
        khuCanHo_jButton_tim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khuCanHo_jButton_timMouseClicked(evt);
            }
        });
        panel_ThongTin.add(khuCanHo_jButton_tim, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        khuCanHo_jButton_reset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        khuCanHo_jButton_reset.setText("Reset");
        khuCanHo_jButton_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khuCanHo_jButton_resetMouseClicked(evt);
            }
        });
        panel_ThongTin.add(khuCanHo_jButton_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, 25));

        khuCanHo_jComboBox_typeTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã khu", "Tên khu" }));
        panel_ThongTin.add(khuCanHo_jComboBox_typeTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, -1, -1));
        panel_ThongTin.add(khuCanHo_jTextField_maKhu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 140, -1));

        table_KhuCanHo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã khu", "Tên khu", "Số tầng", "Số căn/tầng", "Địa chỉ"
            }
        ));
        table_KhuCanHo.setFocusable(false);
        table_KhuCanHo.setIntercellSpacing(new java.awt.Dimension(0, 0));
        table_KhuCanHo.setRowHeight(25);
        table_KhuCanHo.setSelectionBackground(new java.awt.Color(232, 57, 95));
        table_KhuCanHo.setShowVerticalLines(false);
        table_KhuCanHo.getTableHeader().setReorderingAllowed(false);
        table_KhuCanHo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_KhuCanHoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_KhuCanHo);

        javax.swing.GroupLayout panel_KhuCanHoLayout = new javax.swing.GroupLayout(panel_KhuCanHo);
        panel_KhuCanHo.setLayout(panel_KhuCanHoLayout);
        panel_KhuCanHoLayout.setHorizontalGroup(
            panel_KhuCanHoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_KhuCanHoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_KhuCanHoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_ThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_KhuCanHoLayout.setVerticalGroup(
            panel_KhuCanHoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_KhuCanHoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_ThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel_KhuCanHo, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(panel_KhuCanHo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void khuCanHo_jButton_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_khuCanHo_jButton_themActionPerformed
        
        ketNoi.Mo();
        
        Pattern patternMaKhu = Pattern.compile("\\D{3}");
        Matcher matcherMaKhu = patternMaKhu.matcher(khuCanHo_jTextField_maKhu.getText());
        if(!matcherMaKhu.matches())
        JOptionPane.showMessageDialog(this, "Mã khu...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        Pattern patternTenKhu = Pattern.compile("\\D{4,10}");
        Matcher matcherTenKhu = patternTenKhu.matcher(khuCanHo_jTextField_tenKhu.getText());
        if(!matcherTenKhu.matches())
        JOptionPane.showMessageDialog(this, "Tên khu...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        Pattern patternSoTang = Pattern.compile("\\d{1,2}");
        Matcher matcherSoTang = patternSoTang.matcher(khuCanHo_jTextField_soTang.getText());
        if(!matcherSoTang.matches())
        JOptionPane.showMessageDialog(this, "Số tầng...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        Pattern patternSoCan = Pattern.compile("\\d{1,2}");
        Matcher matcherSoCan = patternSoCan.matcher(khuCanHo_jTextField_soCan.getText());
        if(!matcherSoCan.matches())
        JOptionPane.showMessageDialog(this, "Số căn...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        Pattern patternDiaChi = Pattern.compile("");
        Matcher matcherDiaChi = patternDiaChi.matcher(khuCanHo_jTextField_diaChi.getText());
        if(matcherDiaChi.matches())
        JOptionPane.showMessageDialog(this, "Địa chỉ...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        boolean check = true;
        int n = table_KhuCanHo.getRowCount();
        for (int i=0; i<n; i++)
            if (khuCanHo_jTextField_maKhu.getText().trim().equals(((String)table_KhuCanHo.getValueAt(i, 0)).trim())){
                JOptionPane.showMessageDialog(this, "Mã trùng", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                check = false;
            }
        if(check)
        try{
            if(matcherMaKhu.matches() && matcherTenKhu.matches() && matcherSoTang.matches() 
               && matcherSoCan.matches() && !matcherDiaChi.matches()){
                String maKhu = khuCanHo_jTextField_maKhu.getText();
                String tenKhu = khuCanHo_jTextField_tenKhu.getText();
                String diaChi = khuCanHo_jTextField_diaChi.getText();
                String soTang = khuCanHo_jTextField_soTang.getText();
                String soCan = khuCanHo_jTextField_soCan.getText();
                String query = "INSERT INTO KHUCANHO VALUES('"+maKhu+"','"+tenKhu+"',"+soTang+",'"
                +soCan+"',N'"+diaChi+"')";
            
            ketNoi.CapNhat(query);
            JOptionPane.showMessageDialog(this, "Đã thêm...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(query);  
            }
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gâu gâu...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        }

        this.getDulieu();
        
    }//GEN-LAST:event_khuCanHo_jButton_themActionPerformed

    
    private void khuCanHo_jButton_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khuCanHo_jButton_resetMouseClicked
        
        khuCanHo_jTextField_maKhu.setText("");
        khuCanHo_jTextField_diaChi.setText("");
        khuCanHo_jTextField_soCan.setText("");
        khuCanHo_jTextField_soTang.setText("");
        khuCanHo_jTextField_tenKhu.setText("");
        khuCanHo_jTextField_timKiem.setText("");
        this.getDulieu();
        
    }//GEN-LAST:event_khuCanHo_jButton_resetMouseClicked

    private void khuCanHo_jButton_suaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khuCanHo_jButton_suaMouseClicked
        
        ketNoi.Mo();
        String query;
        
        Pattern patternMaKhu = Pattern.compile("\\D{3}");
        Matcher matcherMaKhu = patternMaKhu.matcher(khuCanHo_jTextField_maKhu.getText());
        if(!matcherMaKhu.matches())
        JOptionPane.showMessageDialog(this, "Mã khu...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        Pattern patternTenKhu = Pattern.compile("\\D{4,10}");
        Matcher matcherTenKhu = patternTenKhu.matcher(khuCanHo_jTextField_tenKhu.getText());
        if(!matcherTenKhu.matches())
        JOptionPane.showMessageDialog(this, "Tên khu...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        Pattern patternSoTang = Pattern.compile("\\d{1,2}");
        Matcher matcherSoTang = patternSoTang.matcher(khuCanHo_jTextField_soTang.getText());
        if(!matcherSoTang.matches())
        JOptionPane.showMessageDialog(this, "Số tầng...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        Pattern patternSoCan = Pattern.compile("\\d{1,2}");
        Matcher matcherSoCan = patternSoCan.matcher(khuCanHo_jTextField_soCan.getText());
        if(!matcherSoCan.matches())
        JOptionPane.showMessageDialog(this, "Số căn...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        Pattern patternDiaChi = Pattern.compile("\\D{2,50}");
        Matcher matcherDiaChi = patternDiaChi.matcher(khuCanHo_jTextField_diaChi.getText());
        if(!matcherDiaChi.matches())
        JOptionPane.showMessageDialog(this, "Địa chỉ...", "Dialog", JOptionPane.INFORMATION_MESSAGE);

        try{
            if(matcherMaKhu.matches() && matcherTenKhu.matches() && matcherSoTang.matches() && matcherSoCan.matches() && matcherDiaChi.matches()){
                String maKhu = khuCanHo_jTextField_maKhu.getText();
                String tenKhu = khuCanHo_jTextField_tenKhu.getText();
                String diaChi = khuCanHo_jTextField_diaChi.getText();
                String soTang = khuCanHo_jTextField_soTang.getText();
                String soCan = khuCanHo_jTextField_soCan.getText();
                
                int hangDuocChon = table_KhuCanHo.getSelectedRow();
                String maKhuTemp = table_KhuCanHo.getValueAt(hangDuocChon, 0).toString();
                if(!maKhu.equals(maKhuTemp))
                    JOptionPane.showMessageDialog(this, "Mã khu là cố định...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                else{
                query = "UPDATE KHUCANHO SET tenKhu=N'"+tenKhu+"', soTang='"
                +soTang+"', soCanHo='"+soCan+"', diaChi=N'"+diaChi+"' "
                + "where maKhu='"+maKhuTemp+"';";
                ketNoi.CapNhat(query);
                JOptionPane.showMessageDialog(this, "Đã cập nhật.....", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                System.out.println(query);
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gâu gâu...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        }

        this.getDulieu();

    }//GEN-LAST:event_khuCanHo_jButton_suaMouseClicked

    private void khuCanHo_jButton_xoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khuCanHo_jButton_xoaMouseClicked
        ketNoi.Mo();
        
        String maKhu = khuCanHo_jTextField_maKhu.getText();
        String tenKhu = khuCanHo_jTextField_tenKhu.getText();
        String diaChi = khuCanHo_jTextField_diaChi.getText();
        String soTang = khuCanHo_jTextField_soTang.getText();
        String soCanHo = khuCanHo_jTextField_soCan.getText();
        int hangDuocChon = table_KhuCanHo.getSelectedRow();
        String maTemp = table_KhuCanHo.getValueAt(hangDuocChon, 0).toString();
        String query1 = "DELETE from CANHO where maKhu='"+maKhu+"'";
        String query2 = "DELETE from KHUCANHO where maKhu='"+maKhu+"'";
        ketNoi.Mo();
        if (ketNoi.CapNhat(query2) && ketNoi.CapNhat(query1))
        {
            JOptionPane.showMessageDialog(panel_KhuCanHo, "Xoá được roài đó!!!!!");
        }
        else
               JOptionPane.showMessageDialog(panel_KhuCanHo, "Xoá không được làm lại đi!!!!");
        //Show
        this.getDulieu();
      
    }//GEN-LAST:event_khuCanHo_jButton_xoaMouseClicked

    private void table_KhuCanHoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_KhuCanHoMouseClicked
        // TODO add your handling code here:
        
        int rowSelected = table_KhuCanHo.getSelectedRow();
        khuCanHo_jTextField_maKhu.setText(table_KhuCanHo.getValueAt(rowSelected, 0).toString());
        khuCanHo_jTextField_tenKhu.setText(table_KhuCanHo.getValueAt(rowSelected, 1).toString());
        khuCanHo_jTextField_soTang.setText(table_KhuCanHo.getValueAt(rowSelected, 2).toString());
        khuCanHo_jTextField_soCan.setText(table_KhuCanHo.getValueAt(rowSelected, 3).toString());
        khuCanHo_jTextField_diaChi.setText(table_KhuCanHo.getValueAt(rowSelected, 4).toString());
        
        
        
    }//GEN-LAST:event_table_KhuCanHoMouseClicked

    private void khuCanHo_jButton_themMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khuCanHo_jButton_themMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_khuCanHo_jButton_themMouseClicked

    private void khuCanHo_jButton_timMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khuCanHo_jButton_timMouseClicked
        // TODO add your handling code here:
        String query;
        ketNoi.Mo();
        
        Pattern patternMaKhu = Pattern.compile("\\D{3}");
        Matcher matcherMaKhu = patternMaKhu.matcher(khuCanHo_jTextField_timKiem.getText());
//        if(!matcherMaKhu.matches())
//        JOptionPane.showMessageDialog(this, "Mã khu...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        Pattern patternTenKhu = Pattern.compile("\\D{4,10}");
        Matcher matcherTenKhu = patternTenKhu.matcher(khuCanHo_jTextField_timKiem.getText());
//        if(!matcherTenKhu.matches())
//        JOptionPane.showMessageDialog(this, "Tên khu...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
        if(khuCanHo_jComboBox_typeTimKiem.getSelectedItem() == "Mã khu"){
            if(!matcherMaKhu.matches())
                JOptionPane.showMessageDialog(this, "Mã tìm kiếm có 3 kí tự...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
            else {
                query = "SELECT * FROM KHUCANHO "
                    + "WHERE maKhu='"+khuCanHo_jTextField_timKiem.getText()+"';";
                System.out.println(query);
                Object[] columns = {"Mã khu","Tên khu","Số tầng","Số căn/tầng","Địa chỉ"};
                Object[] row = new Object[100];
                DefaultTableModel model = new DefaultTableModel();
                model.setColumnIdentifiers(columns);
                ResultSet rs = ketNoi.LayDL(query);
                ketNoi.CapNhat(query);
                try {
                    while(rs.next()){
                        Object rowData[] = new Object[5];
                        rowData[0]=rs.getString(1);
                        rowData[1]=rs.getString(2);
                        rowData[2]=rs.getString(3);
                        rowData[3]=rs.getString(4);
                        rowData[4]=rs.getString(5);
                        model.addRow(rowData);
                        table_KhuCanHo.setModel(model);
                        System.out.println("Kết quả trong bảng!");        
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(KhuCanHo.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Try-catch...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }else if(khuCanHo_jComboBox_typeTimKiem.getSelectedItem() == "Tên khu")
            if(!matcherTenKhu.matches())
                JOptionPane.showMessageDialog(this, "Tên khu không tồn tại ...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
            else{
            query = "SELECT * FROM KHUCANHO "
                + "WHERE tenKhu='"+khuCanHo_jTextField_timKiem.getText()+"';";
            System.out.println(query);
        Object[] columns = {"Mã khu","Tên khu","Số tầng","Số căn/tầng","Địa chỉ"};
        Object[] row = new Object[100];
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        ResultSet rs = ketNoi.LayDL(query);
        ketNoi.CapNhat(query);
        try {
            while(rs.next()){
                Object rowData[] = new Object[5]; 
                rowData[0]=rs.getString(1);
                rowData[1]=rs.getString(2);
                rowData[2]=rs.getString(3);
                rowData[3]=rs.getString(4);
                rowData[4]=rs.getString(5);
                model.addRow(rowData);
                table_KhuCanHo.setModel(model);
                System.out.println("Kết quả trong bảng!");   
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhuCanHo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Try-catch...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        }
            }
        
    }//GEN-LAST:event_khuCanHo_jButton_timMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KhuCanHo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhuCanHo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhuCanHo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhuCanHo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhuCanHo().setVisible(true);
            }
        });
    }
    public void getDulieu(){
        KetNoi ketNoi = new KetNoi();
        ketNoi.Mo();
        String query = "SELECT * FROM KHUCANHO;";
        System.out.println(query);
        ResultSet rs = ketNoi.LayDL(query);
// create a table model and set a Column Identifiers to this model 
        Object[] columns = {"Mã khu","Tên khu","Số tầng","Số căn/tầng","Địa chỉ"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table_KhuCanHo.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));        
        table_KhuCanHo.getTableHeader().setOpaque(false);
        table_KhuCanHo.getTableHeader().setBackground(new Color(32, 136, 203));
        table_KhuCanHo.getTableHeader().setForeground(new Color(255,255,255));
        table_KhuCanHo.setRowHeight(25);
// create an array of objects to set the row data
        Object[] row = new Object[4];
        try {
            while(rs.next()){
                Object rowData[] = new Object[7]; 
                rowData[0]=rs.getString(1);
                rowData[1]=rs.getString(2);
                rowData[2]=rs.getString(3);
                rowData[3]=rs.getString(4);
                rowData[4]=rs.getString(5);
                model.addRow(rowData);
                table_KhuCanHo.setModel(model);
                System.out.println("add du lieu vao bang thanh cong!");        
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinDanCu.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("add du lieu vao bang that bai!");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton khuCanHo_jButton_reset;
    private javax.swing.JButton khuCanHo_jButton_sua;
    private javax.swing.JButton khuCanHo_jButton_them;
    private javax.swing.JButton khuCanHo_jButton_tim;
    private javax.swing.JButton khuCanHo_jButton_xoa;
    private javax.swing.JComboBox<String> khuCanHo_jComboBox_typeTimKiem;
    private javax.swing.JTextField khuCanHo_jTextField_diaChi;
    private javax.swing.JTextField khuCanHo_jTextField_maKhu;
    private javax.swing.JTextField khuCanHo_jTextField_soCan;
    private javax.swing.JTextField khuCanHo_jTextField_soTang;
    private javax.swing.JTextField khuCanHo_jTextField_tenKhu;
    private javax.swing.JTextField khuCanHo_jTextField_timKiem;
    private javax.swing.JPanel panel_KhuCanHo;
    private javax.swing.JPanel panel_ThongTin;
    private javax.swing.JTable table_KhuCanHo;
    // End of variables declaration//GEN-END:variables
}
