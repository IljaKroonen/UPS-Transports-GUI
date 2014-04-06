/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaws.ws.gui;

import iaws.ws.transports.LineType;
import iaws.ws.transports.StopPointType;
import iaws.ws.transports.StopPointsRequestType;
import iaws.ws.transports.StopPointsResponseType;
import iaws.ws.transports.StopTimeRequestType;
import iaws.ws.transports.StopTimeResponseType;
import iaws.ws.transports.WSTransport;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Ilja
 */
public class StopPointsFrame extends javax.swing.JFrame {

    private final StopPointsTableModel stopPointsTableModel;
    private final WSTransport service;

    /**
     * Creates new form StopPointsFrame
     *
     * @param service
     */
    public StopPointsFrame(WSTransport service) {
        stopPointsTableModel = new StopPointsTableModel();
        this.service = service;
        this.setVisible(false);
        initComponents();
    }

    public void update(LineType line) {
        StopPointsRequestType req = new StopPointsRequestType();
        req.setLine(line);
        StopPointsResponseType resp = service.stopPoints(req);
        stopPointsTableModel.updateContent(resp.getStopPoint());
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
        jTableStopPoints = new javax.swing.JTable();
        jButtonNextStop = new javax.swing.JButton();

        jTableStopPoints.setModel(stopPointsTableModel);
        jScrollPane1.setViewportView(jTableStopPoints);

        jButtonNextStop.setText("Prochain passage");
        jButtonNextStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextStopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNextStop)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonNextStop)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNextStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextStopActionPerformed
        int selection = jTableStopPoints.getSelectedRow();
        if (selection < 0) {
            return;
        }
        StopPointType stopPoint = stopPointsTableModel.get(selection);
        StopTimeRequestType req = new StopTimeRequestType();
        req.setStopPoint(stopPoint);
        LineType fakeLine = new LineType();
        fakeLine.setId(0L);
        fakeLine.setFriendlyName("");
        req.setLine(fakeLine);
        req.setStopPoint(stopPoint);
        XMLGregorianCalendar xmlDateTime;
        try {
            StopTimeResponseType resp = service.stopTime(req);
            xmlDateTime = resp.getDate();
        } catch (Exception e) {
            xmlDateTime = null;
        }
        String msg;
        if (xmlDateTime == null) {
            msg = "Pas de passage dans un avenir proche";
        } else {
            Date date = xmlDateTime.toGregorianCalendar().getTime();
            msg = date.toString();
        }
        JOptionPane.showMessageDialog(this, msg);
    }//GEN-LAST:event_jButtonNextStopActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNextStop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableStopPoints;
    // End of variables declaration//GEN-END:variables
}
