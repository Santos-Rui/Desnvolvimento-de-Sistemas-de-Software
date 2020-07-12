/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Business.Cliente;
import Business.Componente;
import Business.Facade;
import Exceptions.NaoExistemClientesException;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author pc
 */
public class CriarPacoteComponentes extends javax.swing.JFrame {
    
    Boolean incompatibilidades=false;
    String nomePacote=null;
    Boolean adicionar=true;
    ArrayList<Componente> componentes=new ArrayList<>();
    ArrayList<Componente> escolhidos=new ArrayList<>();
    JList jl1=new JList();
    JList jl2=new JList();
    DefaultListModel dlm=new DefaultListModel();
    
    public CriarPacoteComponentes() {
        initComponents();
        desenharScrollable();
        this.pack();
    }
    
    public CriarPacoteComponentes (String nomePacote) {
        initComponents();
        desenharScrollable();
        this.pack();
        this.nomePacote=nomePacote;
        this.jl2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.jl2.setLayoutOrientation(JList.VERTICAL);
    }
    
    public void desenharScrollable () {
        try{
            this.componentes = Facade.getComponentes();
            DefaultListModel dlmC = new DefaultListModel();
            for(Componente c : this.componentes)
                dlmC.addElement(c.toString1());
            this.jl1 = new JList(dlmC);
            this.jl1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            this.jl1.setLayoutOrientation(JList.VERTICAL);
            this.jScrollPane1.setViewportView(jl1);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Remover");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Concluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Catálogo de componentes");

        jLabel2.setText("Escolhidos");

        jButton3.setText("Adicionar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton4)
                                .addGap(40, 40, 40)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel1)))
                        .addGap(114, 114, 114))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 140, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(46, 46, 46)
                                .addComponent(jButton2)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(150, 150, 150))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new CriarPacoteNome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!this.escolhidos.contains(this.componentes.get(jl1.getSelectedIndex()))){
        this.dlm.addElement(this.componentes.get(jl1.getSelectedIndex()).toString1());
        this.jl2=new JList(this.dlm);
        this.jScrollPane2.setViewportView(this.jl2);
        this.escolhidos.add(this.componentes.get(jl1.getSelectedIndex()));
        }
        try {
        if (Facade.existemIncompatibilidades(this.escolhidos)){
            this.incompatibilidades=true;
            //jScrollPane1.setVisible(false);
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            jButton4.setVisible(false);
            //jLabel1.setVisible(false);
            try{
            HashSet<String> incompativeis = Facade.listaIncompatibilidades(this.escolhidos);
            StringBuilder sb = new StringBuilder();
            sb.append("Os seguinte componentes estão a gerar incompatibilidades:\n");
            for(String s : incompativeis)
                sb.append(s);
            JOptionPane.showMessageDialog(null,sb.toString());
                }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }      
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.escolhidos.remove(jl2.getSelectedIndex());
        this.dlm.remove(jl2.getSelectedIndex());
        this.jl2=new JList(this.dlm);
        jScrollPane2.setViewportView(jl2);
        try {
        if (!Facade.existemIncompatibilidades(this.escolhidos)){
            this.incompatibilidades=false;
            jScrollPane1.setVisible(true);
            jButton2.setVisible(true);
            jButton3.setVisible(true);
            jButton4.setVisible(true);
            jLabel1.setVisible(true); 
        }
        else {
            try{
            HashSet<String> incompativeis = Facade.listaIncompatibilidades(this.escolhidos);
            StringBuilder sb = new StringBuilder();
            sb.append("Os seguinte componentes estão a gerar incompatibilidades:\n");
            for(String s : incompativeis)
                sb.append(s);
            JOptionPane.showMessageDialog(null,sb.toString());
                }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(this.escolhidos.size()>=2){
        try{
        Facade.criarPacote(this.nomePacote,this.escolhidos);
        JOptionPane.showMessageDialog(null,"Pacote "+this.nomePacote+" criado com sucesso");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        new MenuPacotes().setVisible(true);
        this.dispose();
        }
        else
            JOptionPane.showMessageDialog(null,"São necessários no mínimo dois componentes para se criar um pacote!");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CriarPacoteComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarPacoteComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarPacoteComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarPacoteComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarPacoteComponentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
