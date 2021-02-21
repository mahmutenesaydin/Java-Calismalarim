import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class frmCity extends javax.swing.JFrame 
{
    DefaultTableModel model;
    
    public frmCity()
    {
        initComponents();
        populateTable();
    }

    public void populateTable()
    {
        model = (DefaultTableModel)tblCities.getModel();
        model.setRowCount(0);
        
        try 
        {
          ArrayList<City> cities = getCities();
            for(City city : cities)
            {
            Object[] row = 
            {
                city.getId(), city.getName(), city.getCountryCode(),city.getDistrict(),city.getPopulation()
            };
            model.addRow(row);
            }
        } 
        catch(SQLException ex) {
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCities = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        txtCountryCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPopulation = new javax.swing.JTextField();
        txtDistrict = new javax.swing.JTextField();
        lblSearch1 = new javax.swing.JLabel();
        lblSearch2 = new javax.swing.JLabel();
        lblSearch3 = new javax.swing.JLabel();
        lblSearch4 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCities.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblCities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "CountryCode", "District", "Population"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCities);

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lblSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSearch.setText("Aranacak:");

        txtCountryCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCountryCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCountryCodeKeyReleased(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        txtPopulation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPopulation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPopulationKeyReleased(evt);
            }
        });

        txtDistrict.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDistrict.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDistrictKeyReleased(evt);
            }
        });

        lblSearch1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSearch1.setText("İsim");

        lblSearch2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSearch2.setText("Kodu");

        lblSearch3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSearch3.setText("Nufüs");

        lblSearch4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSearch4.setText("Bölge");

        btnInsert.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInsert.setText("Ekle");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 169, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearch4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCountryCode, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCountryCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearch4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //ARAMA YAPTIĞIMIZ
    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String searchKey = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(model); //TableRowSorter; sıralama, filtreleme yapıyor
        tblCities.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtCountryCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountryCodeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountryCodeKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtPopulationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPopulationKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPopulationKeyReleased

    private void txtDistrictKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDistrictKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistrictKeyReleased

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        
        try
        {
            connection = dbHelper.getConnection();
            String sql = "insert into City(Name,CountryCode,District,Population) values(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,txtName.getText());
            statement.setString(2,txtCountryCode.getText());
            statement.setString(3,txtDistrict.getText());
            statement.setInt(4,Integer.valueOf(txtPopulation.getText()));
            int result = statement.executeUpdate();
            populateTable();
        }
        catch (SQLException exception)
        {
            dbHelper.showErrorMessage(exception);
        }
        finally
        {
            try {
                statement.close();
                connection.close();
            }
            catch (SQLException ex)
            {
            }
        }
        
    }//GEN-LAST:event_btnInsertActionPerformed

    //LİSTELEDİĞİMİZ
    public ArrayList<City> getCities() throws SQLException
    {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null; 
        ResultSet resultSet;
        ArrayList<City> cities = null;        
        
        try
        {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from City");
            cities = new ArrayList<City>();
            while(resultSet.next())
            {
                cities.add(new City(
                        resultSet.getInt("ID"),
                        resultSet.getString("Name"),
                        resultSet.getString("CountryCode"),
                        resultSet.getString("District"),
                        resultSet.getInt("Population")
                ));
            }
        }
        catch (SQLException exception)
        {
            dbHelper.showErrorMessage(exception);
        }
        finally
        {
            statement.close();
            connection.close();
        }
        return cities;
    }


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
            java.util.logging.Logger.getLogger(frmCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblSearch1;
    private javax.swing.JLabel lblSearch2;
    private javax.swing.JLabel lblSearch3;
    private javax.swing.JLabel lblSearch4;
    private javax.swing.JTable tblCities;
    private javax.swing.JTextField txtCountryCode;
    private javax.swing.JTextField txtDistrict;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPopulation;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
