/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Business.Cliente;
import Business.Componente;
import Business.Facade;
import Business.Pacote;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class ConfiguracaoConcluir extends javax.swing.JFrame {

    ArrayList<Componente> escolhidos;
    int nif;
    int preco;
    Cliente cliente;
    String passado;
    ArrayList<Cliente> clientes;
    HashMap<Pacote,ArrayList<Componente>> pacotesEscolhidos;
    ArrayList<Componente> escolhidos1;
    /**
     * 
     * Creates new form ConfiguraçãoConcluir
     */
    public ConfiguracaoConcluir() {
        initComponents();
    }
    
    public ConfiguracaoConcluir(ArrayList<Componente> escolhidos,int nif,Cliente cliente, String passado, ArrayList<Cliente> clientes,HashMap<Pacote,ArrayList<Componente>> pE) {
        initComponents();
        this.pacotesEscolhidos=pE;
        this.escolhidos=escolhidos;
        ArrayList<Componente> escolhidos1=new ArrayList<Componente>();
        for(Componente c : this.escolhidos)
            escolhidos1.add(c);
        this.escolhidos1=escolhidos1;
        this.nif=nif;
        int preco=0;
        DefaultListModel dlm = new DefaultListModel();
        for(Pacote p : this.pacotesEscolhidos.keySet()){
            for(Componente c : escolhidos1)
                if(this.pacotesEscolhidos.get(p).contains(c))
                    this.escolhidos.remove(c);
        }
        
        
        
        
        
        
        
        
        try{
            if(Facade.verificaPacotes1(this.escolhidos).size()>=1){
                HashMap<Pacote,ArrayList<Componente>> verificaP = Facade.verificaPacotes1(this.escolhidos);
                for(Pacote p : verificaP.keySet())
                    this.pacotesEscolhidos.put(p,verificaP.get(p));
            }
                
        }
        catch(Exception e){JOptionPane.showMessageDialog(null,e.getMessage());}
        
        
        
        for(Pacote p : this.pacotesEscolhidos.keySet()){
            for(Componente c : escolhidos1)
                if(this.pacotesEscolhidos.get(p).contains(c))
                    this.escolhidos.remove(c);
        }
        
        
        
        
        
        
        
        
        
        
        
        for(Componente c : this.escolhidos){
            dlm.addElement(c.toString());
            preco=preco+c.getPreco();
        }
        for(Pacote p : this.pacotesEscolhidos.keySet()){
            dlm.addElement(p.toString1());
            for(Componente c : this.pacotesEscolhidos.get(p))
                dlm.addElement("           "+c.toString() + "  ["+p.getNome()+"]");
            preco=preco+p.getPreco();
        }
        this.preco=preco;
        JList jl = new JList(dlm);
        this.jScrollPane1.setViewportView(jl);
        this.jLabel1.setText(""+preco);
        this.cliente=cliente;
        this.passado=passado;
        this.clientes=clientes;
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Preço");

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Componentes selecionados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(43, 43, 43)
                        .addComponent(jButton2)))
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new FichaCliente(this.cliente,this.passado,this.clientes).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Facade.criarConfiguracao(this.escolhidos1,this.nif,this.preco);
        }
        catch(Exception e){}
        new FichaCliente(this.cliente,this.passado,this.clientes).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConfiguracaoConcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfiguracaoConcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfiguracaoConcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfiguracaoConcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfiguracaoConcluir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
