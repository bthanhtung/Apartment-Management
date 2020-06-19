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
public class ThongTinDanCu extends javax.swing.JFrame {

    public ThongTinDanCu() {
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
        panel_ThongTinDanCu = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        khachHang_jTextField_soDienThoai = new javax.swing.JTextField();
        khachHang_jTextField_soCMND = new javax.swing.JTextField();
        khachHang_jTextField_queQuan = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        khachHang_jTextField_maKhachHang = new javax.swing.JTextField();
        khachHang_jTextField_tenKhachHang = new javax.swing.JTextField();
        khachHang_jTextField_ngaySinh = new javax.swing.JTextField();
        khachHang_jComboBox_gioiTinh = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        khachHang_jButton_reset = new javax.swing.JButton();
        khachHang_jButton_xoa = new javax.swing.JButton();
        khachHang_jButton_sua = new javax.swing.JButton();
        khachHang_jButton_them = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        khachHang_jTextField_timKiem = new javax.swing.JTextField();
        khachHang_jComboBox_typeTK = new javax.swing.JComboBox<>();
        khachHang_jButton_timKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ThongTinDanCu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/group_52px_1.png"))); // NOI18N
        jLabel15.setText("Khách hàng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel15)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        panel_ThongTinDanCu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(khachHang_jTextField_soDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 110, -1));

        khachHang_jTextField_soCMND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                khachHang_jTextField_soCMNDActionPerformed(evt);
            }
        });
        jPanel2.add(khachHang_jTextField_soCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 110, -1));
        jPanel2.add(khachHang_jTextField_queQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 150, -1));

        jLabel33.setText("Quê quán");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        jLabel32.setText("Số CMND");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        jLabel31.setText("Số điện thoại");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));
        jPanel2.add(khachHang_jTextField_maKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 110, -1));
        jPanel2.add(khachHang_jTextField_tenKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 110, -1));
        jPanel2.add(khachHang_jTextField_ngaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 110, -1));

        khachHang_jComboBox_gioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        jPanel2.add(khachHang_jComboBox_gioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 90, -1));

        jLabel27.setText("Mã khách hàng");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel28.setText("Tên khách hàng");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel29.setText("Ngày sinh");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jLabel30.setText("Giới tính");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        khachHang_jButton_reset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        khachHang_jButton_reset.setText("Reset");
        khachHang_jButton_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khachHang_jButton_resetMouseClicked(evt);
            }
        });
        jPanel2.add(khachHang_jButton_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        khachHang_jButton_xoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        khachHang_jButton_xoa.setText("Xoá");
        khachHang_jButton_xoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khachHang_jButton_xoaMouseClicked(evt);
            }
        });
        jPanel2.add(khachHang_jButton_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        khachHang_jButton_sua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        khachHang_jButton_sua.setText("Sửa");
        khachHang_jButton_sua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khachHang_jButton_suaMouseClicked(evt);
            }
        });
        jPanel2.add(khachHang_jButton_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        khachHang_jButton_them.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        khachHang_jButton_them.setText("Thêm");
        khachHang_jButton_them.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khachHang_jButton_themMouseClicked(evt);
            }
        });
        jPanel2.add(khachHang_jButton_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        jLabel1.setText("Tìm kiếm");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));
        jPanel2.add(khachHang_jTextField_timKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 110, -1));

        khachHang_jComboBox_typeTK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã khách hàng", "Tên khách hàng", "Giới tính" }));
        jPanel2.add(khachHang_jComboBox_typeTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, -1, -1));

        khachHang_jButton_timKiem.setText("Tìm kiếm");
        khachHang_jButton_timKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khachHang_jButton_timKiemMouseClicked(evt);
            }
        });
        jPanel2.add(khachHang_jButton_timKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, -1, -1));

        panel_ThongTinDanCu.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 920, 210));

        table_ThongTinDanCu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Ngày sinh", "Giới tính", "Số điện thoại", "Số CMND", "Quê quán"
            }
        ));
        table_ThongTinDanCu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_ThongTinDanCuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_ThongTinDanCu);

        panel_ThongTinDanCu.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 10, 910, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel_ThongTinDanCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_ThongTinDanCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void khachHang_jTextField_soCMNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_khachHang_jTextField_soCMNDActionPerformed
        
    }//GEN-LAST:event_khachHang_jTextField_soCMNDActionPerformed

    private void khachHang_jButton_themMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khachHang_jButton_themMouseClicked
        
        ketNoi.Mo();
      
        Pattern patternMaKH = Pattern.compile("\\d{6}");
        Matcher matcherMaKH = patternMaKH.matcher(khachHang_jTextField_maKhachHang.getText());
        if(!matcherMaKH.matches())
       //   maKhachHang = khachHang_jTextField_maKhachHang.getText();
        JOptionPane.showMessageDialog(this, "Mã khách hàng là số có 6 chữ số...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
      
        Pattern patternTenKH = Pattern.compile("\\D{2,45}");
        Matcher matcherTenKH = patternTenKH.matcher(khachHang_jTextField_tenKhachHang.getText());
        if(!matcherTenKH.matches())
        //  tenKhachHang = khachHang_jTextField_tenKhachHang.getText();
        JOptionPane.showMessageDialog(this, "Tên khách hàng dài hơn 5 kí tự", "Dialog", JOptionPane.INFORMATION_MESSAGE);
      
        Pattern patternNgaySinh = Pattern.compile("\\d{4}[-|/]\\d{1,2}[-|/]\\d{1,2}");
        Matcher matcherNgaySinh= patternNgaySinh.matcher(khachHang_jTextField_ngaySinh.getText());
        if(!matcherNgaySinh.matches())
          //ngaySinh = khachHang_jTextField_ngaySinh.getText();
        JOptionPane.showMessageDialog(this, "Nhập đúng định dạng yyyy-mm-dd", "Dialog", JOptionPane.INFORMATION_MESSAGE);
      
        Pattern patternQueQuan = Pattern.compile("\\D{5,45}");
        Matcher matcherQueQuan = patternQueQuan.matcher(khachHang_jTextField_queQuan.getText());
        if(!matcherQueQuan.matches())
         // queQuan = khachHang_jTextField_queQuan.getText();
        JOptionPane.showMessageDialog(this, "Nhập lại quê quán, phải dài hơn 5 kí tự", "Dialog", JOptionPane.INFORMATION_MESSAGE);
      
        Pattern patternSoCMND = Pattern.compile("\\d{9,12}");
        Matcher matcherSoCMND = patternSoCMND.matcher(khachHang_jTextField_soCMND.getText().trim());
        if(!matcherSoCMND.matches())
          //soCMND = khachHang_jTextField_soCMND.getText();
        JOptionPane.showMessageDialog(this, "Số CMND từ 9-12 số", "Dialog", JOptionPane.INFORMATION_MESSAGE);
      
        Pattern patternSoDienThoai = Pattern.compile("\\d{10}");
        Matcher matcherSoDienThoai = patternSoDienThoai.matcher(khachHang_jTextField_soDienThoai.getText());
        if(!matcherSoDienThoai.matches())
          //soDienThoai = khachHang_jTextField_soDienThoai.getText();
        JOptionPane.showMessageDialog(this, "Số điện thoại là 10 số nhé...", "Dialog", JOptionPane.INFORMATION_MESSAGE);

        String gioiTinh = (String)khachHang_jComboBox_gioiTinh.getSelectedItem();
        if (gioiTinh.equals("Nam"))
           gioiTinh = "1";
        else
           gioiTinh = "0";
        
        boolean check = true;
        int n = table_ThongTinDanCu.getRowCount();
        for (int i=0; i<n; i++)
            if (khachHang_jTextField_maKhachHang.getText().trim().equals(((String)table_ThongTinDanCu.getValueAt(i, 0)).trim())){
                JOptionPane.showMessageDialog(this, "Mã trùng", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                check = false;
            }
        if(check)
        try{
        if(matcherMaKH.matches() && matcherTenKH.matches() && matcherNgaySinh.matches() 
               && matcherSoDienThoai.matches() && matcherSoCMND.matches() && matcherQueQuan.matches()){
            String maKhachHang = khachHang_jTextField_maKhachHang.getText();
            String tenKhachHang = khachHang_jTextField_tenKhachHang.getText();
            String ngaySinh = khachHang_jTextField_ngaySinh.getText();
            String queQuan = khachHang_jTextField_queQuan.getText();
            String soCMND = khachHang_jTextField_soCMND.getText();
            String soDienThoai = khachHang_jTextField_soDienThoai.getText();
            String query = "INSERT INTO KHACHHANG VALUES('"+maKhachHang+"',N'"+tenKhachHang+"','"+ngaySinh+"',"
              +gioiTinh+",'"+soDienThoai+"','"+soCMND+"',N'"+queQuan+"')";
            System.out.println(query);
            ketNoi.CapNhat(query);
            JOptionPane.showMessageDialog(this, "Đã thêm...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        }
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gâu gâu...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        }
                    
        
        this.getDulieu();
    }//GEN-LAST:event_khachHang_jButton_themMouseClicked

    private void khachHang_jButton_suaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khachHang_jButton_suaMouseClicked
        
        ketNoi.Mo();
 
        Pattern patternTenKH = Pattern.compile("\\D{5,45}");
        Matcher matcherTenKH = patternTenKH.matcher(khachHang_jTextField_tenKhachHang.getText().trim());
        if(!matcherTenKH.matches())
        //  tenKhachHang = khachHang_jTextField_tenKhachHang.getText();
        JOptionPane.showMessageDialog(this, "Tên khách hàng dài hơn 5 kí tự", "Dialog", JOptionPane.INFORMATION_MESSAGE);
      
        Pattern patternNgaySinh = Pattern.compile("\\d{4}[-|/]\\d{1,2}[-|/]\\d{1,2}");
        Matcher matcherNgaySinh= patternNgaySinh.matcher(khachHang_jTextField_ngaySinh.getText());
        if(!matcherNgaySinh.matches())
          //ngaySinh = khachHang_jTextField_ngaySinh.getText();
        JOptionPane.showMessageDialog(this, "Nhập đúng định dạng yyyy-mm-dd", "Dialog", JOptionPane.INFORMATION_MESSAGE);
      
        Pattern patternQueQuan = Pattern.compile("\\D{5,45}");
        Matcher matcherQueQuan = patternQueQuan.matcher(khachHang_jTextField_queQuan.getText().trim());
        if(!matcherQueQuan.matches())
         // queQuan = khachHang_jTextField_queQuan.getText();
        JOptionPane.showMessageDialog(this, "Nhập lại quê quán", "Dialog", JOptionPane.INFORMATION_MESSAGE);
      
        Pattern patternSoCMND = Pattern.compile("\\d{9,12}");
        Matcher matcherSoCMND = patternSoCMND.matcher(khachHang_jTextField_soCMND.getText().trim());
        if(!matcherSoCMND.matches())
          //soCMND = khachHang_jTextField_soCMND.getText();
        JOptionPane.showMessageDialog(this, "Số CMND: 9 hoặc 12 số", "Dialog", JOptionPane.INFORMATION_MESSAGE);
      
        Pattern patternSoDienThoai = Pattern.compile("\\d{10}");
        Matcher matcherSoDienThoai = patternSoDienThoai.matcher(khachHang_jTextField_soDienThoai.getText());
        if(!matcherSoDienThoai.matches())
          //soDienThoai = khachHang_jTextField_soDienThoai.getText();
        JOptionPane.showMessageDialog(this, "Số điện thoại là 10 số nhé...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
      
        String gioiTinh = (String)khachHang_jComboBox_gioiTinh.getSelectedItem();
        if (gioiTinh.equals("Nam"))
           gioiTinh = "1";
        else
           gioiTinh = "0";
        try{
        if(matcherTenKH.matches() && matcherNgaySinh.matches() && matcherSoDienThoai.matches() && matcherSoCMND.matches() && matcherQueQuan.matches()){
//            String maKhachHang = khachHang_jTextField_maKhachHang.getText();
            String tenKhachHang = khachHang_jTextField_tenKhachHang.getText();
            String ngaySinh = khachHang_jTextField_ngaySinh.getText();
            String queQuan = khachHang_jTextField_queQuan.getText();
            String soCMND = khachHang_jTextField_soCMND.getText();
            String soDienThoai = khachHang_jTextField_soDienThoai.getText();
            int hangDuocChon = table_ThongTinDanCu.getSelectedRow();
            String maKHTemp = table_ThongTinDanCu.getValueAt(hangDuocChon, 0).toString();
            String query = "UPDATE KHACHHANG SET tenKhachHang=N'"+tenKhachHang+"', ngaySinh='"
                +ngaySinh+"', soDienThoai='"+soDienThoai+"', soCMND='"+soCMND+"', queQuan=N'"+queQuan+"' "
                + "where maKhachHang="+maKHTemp;
            System.out.println(query);
            ketNoi.CapNhat(query);
        }
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Looxisadasdasdasdsa", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        }
        
        //show
        this.getDulieu();       

    }//GEN-LAST:event_khachHang_jButton_suaMouseClicked

    private void khachHang_jButton_xoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khachHang_jButton_xoaMouseClicked
        
        //        String maKhachHang = khachHang_jTextField_maKhachHang.getText();
//        String tenKhachHang = khachHang_jTextField_tenKhachHang.getText();
//        String ngaySinh = khachHang_jTextField_ngaySinh.getText();
//        String soDienThoai = khachHang_jTextField_soDienThoai.getText();
//        String soCMND = khachHang_jTextField_soCMND.getText();
//        String queQuan = khachHang_jTextField_queQuan.getText();
        int hangDuocChon = table_ThongTinDanCu.getSelectedRow();
        String maKHTemp = table_ThongTinDanCu.getValueAt(hangDuocChon, 0).toString();
        String query = "DELETE FROM KHACHHANG WHERE maKhachHang="+maKHTemp;
        ketNoi.Mo();
        ketNoi.CapNhat(query);
        
        this.getDulieu();
        
    }//GEN-LAST:event_khachHang_jButton_xoaMouseClicked

    private void khachHang_jButton_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khachHang_jButton_resetMouseClicked
        
        khachHang_jTextField_maKhachHang.setText("");
        khachHang_jTextField_tenKhachHang.setText("");
        khachHang_jTextField_ngaySinh.setText("");
        khachHang_jComboBox_gioiTinh.setSelectedIndex(0);
        khachHang_jTextField_soDienThoai.setText("");
        khachHang_jTextField_soCMND.setText("");
        khachHang_jTextField_queQuan.setText("");
        khachHang_jTextField_timKiem.setText("");
        this.getDulieu();
        
    }//GEN-LAST:event_khachHang_jButton_resetMouseClicked

    private void khachHang_jButton_timKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khachHang_jButton_timKiemMouseClicked
        
        ketNoi.Mo();
        String query;
        if(khachHang_jComboBox_typeTK.getSelectedItem() == "Mã khách hàng"){
            query = "SELECT * FROM KHACHHANG "
                + "WHERE maKhachHang='"+khachHang_jTextField_timKiem.getText()+"';";
            
        }
            
        else if(khachHang_jComboBox_typeTK.getSelectedItem() == "Tên khách hàng")
             query = "SELECT * FROM KHACHHANG "
                + "WHERE tenKhachHang='"+khachHang_jTextField_timKiem.getText()+"';";
                       
        else  query = "SELECT * FROM KHACHHANG "
                + "WHERE gioiTinh="+khachHang_jTextField_timKiem.getText()+";";
            
        System.out.println(query);
        Object[] columns = {"Mã khách hàng","Tên khách hàng","Ngày sinh","Giới tính","Số điện thoại","Số CMND","Quê quán"};
        Object[] row = new Object[100];
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        ResultSet rs = ketNoi.LayDL(query);
        ketNoi.CapNhat(query);
        try {
            while(rs.next())
            {
                Object rowData[] = new Object[7]; 
                rowData[0]=rs.getString(1);
                rowData[1]=rs.getString(2);
                rowData[2]=rs.getString(3);
                rowData[3]=rs.getString(4);
                rowData[4]=rs.getString(5);
                rowData[5]=rs.getString(6);
                rowData[6]=rs.getString(7);
                model.addRow(rowData);
                table_ThongTinDanCu.setModel(model);
                System.out.println("add du lieu vao bang thanh cong!");        
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinDanCu.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("add du lieu vao bang that bai!");
        }
        
      //  this.getDulieu();
        
    }//GEN-LAST:event_khachHang_jButton_timKiemMouseClicked

    private void table_ThongTinDanCuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_ThongTinDanCuMouseClicked
        
        int index = table_ThongTinDanCu.getSelectedRow();
        khachHang_jTextField_maKhachHang.setText((String)table_ThongTinDanCu.getValueAt(index, 0));
        khachHang_jTextField_tenKhachHang.setText((String)table_ThongTinDanCu.getValueAt(index, 1));
        khachHang_jTextField_ngaySinh.setText((String)table_ThongTinDanCu.getValueAt(index, 2));
        khachHang_jTextField_queQuan.setText((String)table_ThongTinDanCu.getValueAt(index, 6));
        khachHang_jTextField_soCMND.setText((String)table_ThongTinDanCu.getValueAt(index, 5));
        khachHang_jTextField_soDienThoai.setText((String)table_ThongTinDanCu.getValueAt(index, 4));
        if (((String)table_ThongTinDanCu.getValueAt(index, 3)).equals("1"))
            khachHang_jComboBox_gioiTinh.setSelectedIndex(0);
        else
            khachHang_jComboBox_gioiTinh.setSelectedIndex(1);
    }//GEN-LAST:event_table_ThongTinDanCuMouseClicked

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
            java.util.logging.Logger.getLogger(ThongTinDanCu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinDanCu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinDanCu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinDanCu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinDanCu().setVisible(true);
            }
        });
    }
    
    public void getDulieu(){
        KetNoi ketNoi = new KetNoi();
        ketNoi.Mo();
        String query = "SELECT * FROM KHACHHANG;";
        System.out.println(query);
        ResultSet rs = ketNoi.LayDL(query);
        
//        create a table model and set a Column Identifiers to this model 
        Object[] columns = {"Mã khách hàng","Tên khách hàng","Ngày sinh","Giới tính","Số điện thoại","Số CMND","Quê quán"};
        Object[] row = new Object[100];
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table_ThongTinDanCu.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));        
        table_ThongTinDanCu.getTableHeader().setOpaque(false);
        table_ThongTinDanCu.getTableHeader().setBackground(new Color(32, 136, 203));
        table_ThongTinDanCu.getTableHeader().setForeground(new Color(255,255,255));
        table_ThongTinDanCu.setRowHeight(25);
//        create an array of objects to set the row data
        try {
            while(rs.next()){
                Object rowData[] = new Object[7]; 
                rowData[0]=rs.getString(1);
                rowData[1]=rs.getString(2);
                rowData[2]=rs.getString(3);
                rowData[3]=rs.getString(4);
                rowData[4]=rs.getString(5);
                rowData[5]=rs.getString(6);
                rowData[6]=rs.getString(7);
                model.addRow(rowData);
                table_ThongTinDanCu.setModel(model);
                System.out.println("add du lieu vao bang thanh cong!");        
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinDanCu.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("add du lieu vao bang that bai!");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton khachHang_jButton_reset;
    private javax.swing.JButton khachHang_jButton_sua;
    private javax.swing.JButton khachHang_jButton_them;
    private javax.swing.JButton khachHang_jButton_timKiem;
    private javax.swing.JButton khachHang_jButton_xoa;
    private javax.swing.JComboBox<String> khachHang_jComboBox_gioiTinh;
    private javax.swing.JComboBox<String> khachHang_jComboBox_typeTK;
    private javax.swing.JTextField khachHang_jTextField_maKhachHang;
    private javax.swing.JTextField khachHang_jTextField_ngaySinh;
    private javax.swing.JTextField khachHang_jTextField_queQuan;
    private javax.swing.JTextField khachHang_jTextField_soCMND;
    private javax.swing.JTextField khachHang_jTextField_soDienThoai;
    private javax.swing.JTextField khachHang_jTextField_tenKhachHang;
    private javax.swing.JTextField khachHang_jTextField_timKiem;
    private javax.swing.JPanel panel_ThongTinDanCu;
    private javax.swing.JTable table_ThongTinDanCu;
    // End of variables declaration//GEN-END:variables
}
