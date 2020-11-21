/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.ConexaoDAO;
import DAO.GeneroDAO;
import DAO.UsuarioDAO;
import DTO.GeneroDTO;
import DTO.Teste;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Igor
 */
public class GenerosFavoritos extends javax.swing.JFrame {

    /**
     * Creates new form GenerosFavoritos
     */
    public GenerosFavoritos() {
        initComponents();
    }
    
    /*RECEBE O ID DO USUÁRIO E ARMAZENA NA LABEL.*/
      public GenerosFavoritos(int id) {
        initComponents();
         jLabel4.setText(Integer.toString(id));
        //jLabel4.setText(Integer.toString(jLabel1.getText()));
    }
      
      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaGenerosFavoritos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAdicionarGeneroFavorito = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaGenerosAdicionados = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnListarGenero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        panel2.setBackground(new java.awt.Color(0, 204, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("@CopyRight 2020");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(227, 227, 227))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tabelaGenerosFavoritos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Gênero"
            }
        ));
        jScrollPane1.setViewportView(tabelaGenerosFavoritos);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("SELECIONE SEUS GÊNEROS FAVORITOS!");

        btnAdicionarGeneroFavorito.setBackground(new java.awt.Color(0, 153, 51));
        btnAdicionarGeneroFavorito.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdicionarGeneroFavorito.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarGeneroFavorito.setText("ADICIONAR GÊNERO");
        btnAdicionarGeneroFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarGeneroFavoritoActionPerformed(evt);
            }
        });

        tabelaGenerosAdicionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Gêneros Adicionados"
            }
        ));
        jScrollPane2.setViewportView(tabelaGenerosAdicionados);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Gêneros Favoritos");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("USUÁRIO");

        btnListarGenero.setBackground(new java.awt.Color(0, 153, 51));
        btnListarGenero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnListarGenero.setForeground(new java.awt.Color(255, 255, 255));
        btnListarGenero.setText(" LISTAR GÊNEROS");
        btnListarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarGeneroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnListarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnAdicionarGeneroFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarGeneroFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarGeneroFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarGeneroFavoritoActionPerformed
        //pegarIdgenero();
        PreparedStatement ps;
        Connection con;
        
        UsuarioDTO objusuarioDTO = new UsuarioDTO();
        /*TIVEMOS QUE CRIAR UMA VARIÁVEL QUE ARMAZENASSE O CONTEÚDO DA LABEL QUE É O ID DO USUÁRIO.
        PARA DEPOIS INSERIRMOS NO BANCO.*/
        int id = Integer.parseInt(jLabel4.getText());
        
        
        /*
        String sql = "select * from usuario WHERE userId=?";
        con = new ConexaoDAO().conectaBD();

        try {
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
               
               objusuarioDTO.setUserid(rs.getInt("userId"));
            } 
        }       
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao puxar o id do usuario no banco: "+erro);
        }*/
       
         
       
    
         // UsuarioDAO objusuariodao = new UsuarioDAO();
          //ArrayList<UsuarioDTO> lista = objusuariodao.PesquisarIdUsuario();
          
          
        
        int setar;
        int genderId;
        /*A VARIÁVEL setar ARMAZENA O NÚMERO DA LINHA CLICADA ATRAVÉS DO MÉTODO getSelectRow()*/
        setar = tabelaGenerosFavoritos.getSelectedRow();
        /*A VARIÁVEL genderId ARMAZENA O NÚMERO QUE REFERENCIA A LINHA E COLUNA CLICADA PELO USUÁRIO.*/ 
        genderId = Integer.parseInt(tabelaGenerosFavoritos.getModel().getValueAt(setar, 0).toString());
          
         
        /*A QUERY ARMAZENA O ID DO USUÁRIO E DO GÊNERO NO BANCO.*/
        String sql2 = "insert into favorito (usuario, genero) values (?,?)";      
        con = new ConexaoDAO().conectaBD();
        
        try {
            
            ps = con.prepareStatement(sql2);
            ps.setInt(1, id);
            ps.setInt(2,genderId);

            ps.execute();
            ps.close();

        } 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir o id do usuario no banco" + erro);
        } 
        
       
        
        
        
        /*LISTA OS GÊNEROS FAVORITOS NA TABELA.*/
        listargenerosadicionados();
        
    }//GEN-LAST:event_btnAdicionarGeneroFavoritoActionPerformed

    private void btnListarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarGeneroActionPerformed
        /*O MÉTODO DO BOTÃO CHAMA O MÉTODO ABAIXO PARA LISTAR OS GÊNEROS NA LISTA.*/
        listarGeneros();
    }//GEN-LAST:event_btnListarGeneroActionPerformed

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
            java.util.logging.Logger.getLogger(GenerosFavoritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerosFavoritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerosFavoritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerosFavoritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerosFavoritos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarGeneroFavorito;
    private javax.swing.JButton btnListarGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JTable tabelaGenerosAdicionados;
    private javax.swing.JTable tabelaGenerosFavoritos;
    // End of variables declaration//GEN-END:variables

     private void listarGeneros(){
        try {
            GeneroDAO objGeneroDAO = new GeneroDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaGenerosFavoritos.getModel();
            model.setNumRows(0);
            
            ArrayList<GeneroDTO> lista = objGeneroDAO.PesquisarGenero();
            
            for(int num = 0; num < lista.size(); num ++){
                model.addRow(new Object[]{
            /*ENQUANTO HOUVER DADOS NO ARRAYLIST MOSTRAR NA TABELA.*/
                    lista.get(num).getId(),
                    lista.get(num).getNome_genero()
                });
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os generos: " + erro);
        }
    }

    /*
    private void pegarIdgenero(){
        int setar;
        int genderId;
        
        setar = tabelaGenerosFavoritos.getSelectedRow();
          
        genderId = Integer.parseInt(tabelaGenerosFavoritos.getModel().getValueAt(setar, 0).toString());
          
        String sql = "insert into favorito (genero) values (?)";      
        Connection con = new ConexaoDAO().conectaBD();
        PreparedStatement pstm;
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, genderId);
           
            pstm.execute();
            pstm.close();

        } 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir o id do genero" + erro);
        }   
    } */

    private void listargenerosadicionados(){
        
        int id = Integer.parseInt(jLabel4.getText());;
        
        try {
            GeneroDAO objGeneroDAO = new GeneroDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaGenerosAdicionados.getModel();
            model.setNumRows(0);
            
            ArrayList<GeneroDTO> lista = objGeneroDAO.PesquisarGenerosAdicionados(id);
            
            for(int num = 0; num < lista.size(); num ++){
                model.addRow(new Object[]{
            /*ENQUANTO HOUVER DADOS NO ARRAYLIST MOSTRAR NA TABELA.*/
                    lista.get(num).getNome_genero()
                });
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os generos favoritos: " + erro);
        }    
    }

    /*
    private void pegarid(UsuarioDTO objusuariodto){
        PreparedStatement ps;
        Connection con;
        
          String sql = "select * from usuario";
        con = new ConexaoDAO().conectaBD();
        
         
        
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
               UsuarioDTO objusuarioDTO = new UsuarioDTO();
               objusuarioDTO.setUserid(rs.getInt("userId"));
            } 
        } 
        
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao puxar o id do usuario no banco: "+erro);
        }

        
        String sql2 = "insert into favorito (usuario) values (?)";      
        con = new ConexaoDAO().conectaBD();
        
        try {

            ps = con.prepareStatement(sql2);
            ps.setInt(1, objusuariodto.getUserid());

            ps.execute();
            ps.close();

        } 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir usuário no banco" + erro);
        } 
    } */
    
    
    
    
    
}
