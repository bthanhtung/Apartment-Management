package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import main.ConnectDB.KetNoi;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author TUNGBT-TRUNGNM
 */
public class ThongKeDoanhThu extends javax.swing.JFrame {

    public ThongKeDoanhThu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("D:\\Project\\QuanLyChungCu\\QuanLICC\\src\\main\\images\\statistics_48px.png").getImage());
        pnChart.setLayout(new java.awt.BorderLayout()); 
        Pie3DChar();
    }
        public ThongKeDoanhThu(String loginName, int role) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setLoginName(loginName); 
        this.setRole(role);
        if (getRole() == 1)
        {
        this.setTitle(getLoginName() +" [Admin]");
        }
        else
        {
        this.setTitle(getLoginName() +" [Nhân viên]");    
        }
//        this.setIconImage(new ImageIcon("D:\\Project\\QuanLyChungCu\\QuanLICC\\src\\main\\images\\statistics_48px.png").getImage());
        pnChart.setLayout(new java.awt.BorderLayout());    
        Pie3DChar();
    }
    private String loginName;
    private int role;
    public void setRole(int role)
    {
        this.role = role;
    }
    public int getRole()
    {
        return this.role;
    }
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    public String getLoginName()
    {
        return this.loginName;
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
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnChart = new javax.swing.JPanel();
        btnBarChart = new javax.swing.JButton();
        btn3DPie = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thống kê");

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/statistics_48px.png"))); // NOI18N
        jLabel15.setText("Thống kê");

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

        pnChart.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnChartLayout = new javax.swing.GroupLayout(pnChart);
        pnChart.setLayout(pnChartLayout);
        pnChartLayout.setHorizontalGroup(
            pnChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnChartLayout.setVerticalGroup(
            pnChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );

        btnBarChart.setText("Căn hộ đã bán biểu đồ cột");
        btnBarChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarChartActionPerformed(evt);
            }
        });

        btn3DPie.setText("Căn hộ đã bán biểu đồ tròn");
        btn3DPie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3DPieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(429, Short.MAX_VALUE)
                .addComponent(btn3DPie, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addComponent(pnChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pnChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3DPie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int getDuLieu(int item)
    {
 //Lấy dữ liệu từ cơ sở dữ liệu cho vào mảng thống kê
        int ketqua = 0;
        switch (item)
        {
            case 0:
            {
                KetNoi ketNoi =new KetNoi();
                ketNoi.Mo();
                String query = "select COUNT(MACANHO) as TONG from CANHO Where CANHO.giaBan between 0 and 500";
                System.out.println(query);
                ResultSet rs = ketNoi.LayDL(query);
                try {
                    while(rs.next())
                        {
                            ketqua = rs.getInt(1);
//                          System.out.println(ketqua);

                        }
                    ketNoi.DongKetNoi();
                } catch (SQLException ex) {
                    Logger.getLogger(TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ketqua);
                }
            return ketqua;
            }
            case 1:
            {
                KetNoi ketNoi =new KetNoi();
                ketNoi.Mo();                
                String query = "select COUNT(MACANHO) AS TONG from CANHO Where CANHO.giaBan between 500 and 1000";
                System.out.println(query);
                ResultSet rs = ketNoi.LayDL(query);
                try {
                    while(rs.next())
                        {
                            ketqua = rs.getInt(1);
//                          System.out.println(ketqua);  

                        }
                    ketNoi.DongKetNoi();
                } catch (SQLException ex) {
                    Logger.getLogger(TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ketqua);
                }
            return ketqua;    
            }
            case 2:
            {
                KetNoi ketNoi =new KetNoi();
                ketNoi.Mo();
                String query = "select COUNT(MACANHO) AS TONG from CANHO Where CANHO.giaBan between 1000 and 10000";
                System.out.println(query);
                ResultSet rs = ketNoi.LayDL(query);
                try {
                    while(rs.next())
                        {
                            ketqua = rs.getInt(1);
//                          System.out.println(ketqua); 
                        }
                    ketNoi.DongKetNoi();
                } catch (SQLException ex) {
                    Logger.getLogger(TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("add du lieu vao bang that bai!");
                }
            return ketqua;    
            }
            case 3:
            {
                KetNoi ketNoi =new KetNoi();
                ketNoi.Mo();
                String query = "select COUNT(MACANHO) AS TONG from CANHO Where CANHO.giaBan >= 10000";
                System.out.println(query);
                ResultSet rs = ketNoi.LayDL(query);
                try {
                    while(rs.next())
                        {
                            ketqua = rs.getInt(1);
//                          System.out.println(ketqua);        
                        }
                    ketNoi.DongKetNoi();
                } catch (SQLException ex) {
                    Logger.getLogger(TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("add du lieu vao bang that bai!");
                }
            return ketqua;
            }
        }
        System.out.println(ketqua);
        return 0;
    }
    private void btnBarChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarChartActionPerformed
        // create bar chart
        JFreeChart barChart = ChartFactory.createBarChart(
            "Thống kê nhà bán",
            "Mức giá", "Doanh số",
            createDataset(),
            PlotOrientation.VERTICAL,
            true, true, false);
        // set color
        CategoryPlot plot = (CategoryPlot) barChart.getPlot();
        plot.getRenderer().setSeriesPaint(0, Color.BLUE);
        // create chart panel the add it to swing panel in  jframe
        ChartPanel chartPanel = new ChartPanel(barChart);
        pnChart.removeAll();        // clear panel before add new chart
        pnChart.add(chartPanel, BorderLayout.CENTER);
        pnChart.validate();          // refresh panel to display new chart
    }//GEN-LAST:event_btnBarChartActionPerformed
    public void Pie3DChar()
    {
                // create dataset for pie chart
        float[] thongKe = new float[4];
        thongKe[0] = getDuLieu(0);
        thongKe[1] = getDuLieu(1);
        thongKe[2] = getDuLieu(2);
        thongKe[3] = getDuLieu(3);
        System.out.println(thongKe[0]+" "+thongKe[1]+" "+thongKe[2]+" "+thongKe[3]);
        float tongCong = thongKe[0]+thongKe[1]+thongKe[2]+thongKe[3];
        thongKe[0] = Math.round(thongKe[0]*100/tongCong);
        thongKe[1] = Math.round(thongKe[1]*100/tongCong);
        thongKe[2] = Math.round(thongKe[2]*100/tongCong);
        thongKe[3] = Math.round(thongKe[3]*100/tongCong);
        System.out.println(tongCong+" "+thongKe[0]+" "+thongKe[1]+" "+thongKe[2]+" "+thongKe[3]);
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Từ 0 - 500 triệu", new Double(thongKe[0]));
        dataset.setValue("Từ 500 - 1 tỷ", new Double(thongKe[1]));
        dataset.setValue("Từ 1 - 10 tỷ", new Double(thongKe[2]));
        dataset.setValue("Lớn hơn 10 tỷ", new Double(thongKe[3]));
        // create pir chart
        JFreeChart chart = ChartFactory.createPieChart3D(
            "Thống kê nhà bán", // chart title
            dataset, // data
            true, // include legend
            true,
            true);
        // set chart properties
        final PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator("{0} = {1}");
        final PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(270);
        plot.setForegroundAlpha(0.60f);
        plot.setInteriorGap(0.02);
        plot.setLabelGenerator(labelGenerator);
        // create chart panel the add it to swing panel in  jframe
        ChartPanel chartPanel = new ChartPanel(chart);
        pnChart.removeAll();        // clear panel before add new chart
        pnChart.add(chartPanel, BorderLayout.CENTER);
        pnChart.validate();         // refresh panel to display new chart
    }
    private void btn3DPieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3DPieActionPerformed
        Pie3DChar();
    }//GEN-LAST:event_btn3DPieActionPerformed
    private DefaultCategoryDataset createDataset() {
        // same dataset for line chart and bar chart
        int[] thongKe = new int[4];
        thongKe[0] = getDuLieu(0);
        thongKe[1] = getDuLieu(1);
        thongKe[2] = getDuLieu(2);
        thongKe[3] = getDuLieu(3);
        System.out.println(thongKe[0]+" "+thongKe[1]+" "+thongKe[2]+" "+thongKe[3]);
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(thongKe[0], "Căn hộ", "Từ 0 - 500 triệu");
        dataset.addValue(thongKe[1], "Căn hộ", "Từ 500 - 1 tỷ");
        dataset.addValue(thongKe[2], "Căn hộ", "Từ 1 - 10 tỷ");
        dataset.addValue(thongKe[3], "Căn hộ", "Lớn hơn 10 tỷ");
        return dataset;
    }
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
            java.util.logging.Logger.getLogger(ThongKeDoanhThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeDoanhThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeDoanhThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeDoanhThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKeDoanhThu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn3DPie;
    private javax.swing.JButton btnBarChart;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnChart;
    // End of variables declaration//GEN-END:variables
}