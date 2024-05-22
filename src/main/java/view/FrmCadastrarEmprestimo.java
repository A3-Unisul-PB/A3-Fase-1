package view;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Amigo;
import model.Emprestimo;

public class FrmCadastrarEmprestimo extends javax.swing.JFrame {

    private Emprestimo objetoEmprestimo;
    
    public FrmCadastrarEmprestimo() {
        initComponents();
        this.objetoEmprestimo = new Emprestimo();
        this.carregarAmigos();
        this.carregarFerramentas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dropdownAmigos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dropdownFerramentas = new javax.swing.JComboBox<>();
        mensagemEmprestimo = new javax.swing.JLabel();
        btnEmprestar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        inputDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empréstimos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dropdownAmigos.setToolTipText("Nome do Amigo");
        dropdownAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownAmigosActionPerformed(evt);
            }
        });
        getContentPane().add(dropdownAmigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 36, -1, -1));

        jLabel1.setText("Amigos:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 14, -1, -1));

        jLabel2.setText("Ferramentas:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 14, -1, -1));

        dropdownFerramentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Machado", "Broca", "Machadinha", "Parafusadeira", "Chave de Fenda" }));
        dropdownFerramentas.setToolTipText("Ferramenta do empréstimo");
        dropdownFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownFerramentasActionPerformed(evt);
            }
        });
        getContentPane().add(dropdownFerramentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 36, -1, -1));

        mensagemEmprestimo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(mensagemEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 96, 286, 29));

        btnEmprestar.setText("Emprestar");
        btnEmprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmprestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 163, 300, 33));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 214, 300, 33));

        inputDate.setText("26/05/2024");
        inputDate.setToolTipText("Data de devolução");
        getContentPane().add(inputDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 36, -1, -1));

        jLabel3.setText("Data Limite:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 14, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestarActionPerformed
            
    }//GEN-LAST:event_btnEmprestarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void dropdownAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownAmigosActionPerformed
        String amigo = dropdownAmigos.getSelectedItem().toString();
        String ferramenta = dropdownFerramentas.getSelectedItem().toString();
        String inputDate = this.inputDate.getText();
            
        mensagemEmprestimo.setText(amigo + " irá pegar " + ferramenta + " emprestado até " + inputDate + ", certo?");
    }//GEN-LAST:event_dropdownAmigosActionPerformed

    private void dropdownFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownFerramentasActionPerformed
        String amigo = dropdownAmigos.getSelectedItem().toString();
        String ferramenta = dropdownFerramentas.getSelectedItem().toString();
        String inputDate = this.inputDate.getText();
            
        mensagemEmprestimo.setText(amigo + " irá pegar " + ferramenta + " emprestado até " + inputDate + ", certo?");
    }//GEN-LAST:event_dropdownFerramentasActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadastrarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastrarEmprestimo().setVisible(true);
            }
        });
    }
    
    public void carregarAmigos() {
        ArrayList<Emprestimo> amigos = objetoEmprestimo.getMinhaLista();
        
        for (Emprestimo e : amigos) {
            dropdownAmigos.addItem(objetoEmprestimo.getUserById(e.getIdAmigo()));
        }
    }
    
    public void carregarFerramentas() {
        ArrayList<Emprestimo> ferramentas = objetoEmprestimo.getMinhaLista();
        
        for (Emprestimo e : ferramentas) {
            dropdownAmigos.addItem(objetoEmprestimo.getFerramentaById(e.getIdFerramenta()));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEmprestar;
    private javax.swing.JComboBox<String> dropdownAmigos;
    private javax.swing.JComboBox<String> dropdownFerramentas;
    private javax.swing.JTextField inputDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel mensagemEmprestimo;
    // End of variables declaration//GEN-END:variables
}
