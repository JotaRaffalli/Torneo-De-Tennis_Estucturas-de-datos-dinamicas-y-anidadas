/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Consulta;

import Fuente.CLD_Equipo;
import Fuente.CND_Equipo;
import Fuente.CNS_Categoria;
import javax.swing.JTabbedPane;

/**
 *
 * @author Jose Luis
 */
public class TabEquipos extends javax.swing.JPanel {
    
private CLD_Equipo listaEquipo = new CLD_Equipo();    
    
    public TabEquipos(CLD_Equipo lista) {
        initComponents();
        listaEquipo= lista;
        llenarListaEquiposBox();
    }
    public void llenarListaEquiposBox (){
    CND_Equipo NodoAux;
    NodoAux = listaEquipo.getCabeza();
        while(NodoAux!=null)
        {
        listaEquiposBox.addItem(NodoAux.getSexo());
        NodoAux=NodoAux.getProx();
        }
    }
        public void cerrarTabs(){
        JTabbedPane padre=(JTabbedPane)this.getParent();
         if(padre!=null){
            if(((JTabbedPane)this.getParent()).getTabCount()>2){
                int aux=((JTabbedPane)this.getParent()).getTabCount();
                    for(int i=2; i<aux;i++){
                    ((JTabbedPane)this.getParent().getParent().getParent()).removeTabAt(4);
                    }  
                }  
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Equipo = new javax.swing.JPanel();
        verJugadores = new javax.swing.JButton();
        listaEquiposBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        verJugadores.setText("Ver Jugadores");
        verJugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verJugadoresMouseClicked(evt);
            }
        });

        jLabel3.setText("Tipo de Equipo");

        javax.swing.GroupLayout EquipoLayout = new javax.swing.GroupLayout(Equipo);
        Equipo.setLayout(EquipoLayout);
        EquipoLayout.setHorizontalGroup(
            EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EquipoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(EquipoLayout.createSequentialGroup()
                        .addComponent(listaEquiposBox, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(verJugadores)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        EquipoLayout.setVerticalGroup(
            EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EquipoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(EquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verJugadores)
                    .addComponent(listaEquiposBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Equipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Equipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void verJugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verJugadoresMouseClicked
        // TODO add your handling code here:
        String tipoEqui=listaEquiposBox.getSelectedItem().toString();
        CND_Equipo auxEqui = listaEquipo.buscar(tipoEqui);
        abrirJugadores (auxEqui);
    }//GEN-LAST:event_verJugadoresMouseClicked
private void abrirJugadores (CND_Equipo nodoEqui)
{
            //cerrarTabs();
            ((JTabbedPane)this.getParent()).addTab("Equipo "+nodoEqui.getSexo(), new TabJugadores(nodoEqui.getAtletas()));
            ((JTabbedPane)this.getParent()).setSelectedIndex(4);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Equipo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox listaEquiposBox;
    private javax.swing.JButton verJugadores;
    // End of variables declaration//GEN-END:variables
}
