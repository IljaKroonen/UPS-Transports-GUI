/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaws.ws.gui;

import iaws.ws.transports.BikeStationType;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Ilja
 */
public class BikeStationsTableModel implements TableModel {
    private final List<BikeStationType> data;
    private final List<TableModelListener> listeners;

    public BikeStationsTableModel(List<BikeStationType> data) {
        listeners = new ArrayList<>();
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String[] columns = {"Identifier", "Name"};
        return columns[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return Object.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        BikeStationType bikeStation = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return bikeStation.getNumber();
            case 1:
                return bikeStation.getFriendlyName();
            default:
                throw new UnsupportedOperationException("Invalid getValueAt()");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Cell is not editable");
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        listeners.add(l);
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        listeners.remove(l);
    }
    
    public BikeStationType get(int index) {
        return data.get(index);
    }
}
