/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iaws.ws.gui;

import iaws.ws.transports.StopPointType;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Ilja
 */
public class StopPointsTableModel implements TableModel {
    private List<StopPointType> data;
    private final List<TableModelListener> listeners;
    
    public StopPointsTableModel() {
        data = new ArrayList<>();
        listeners = new ArrayList<>();
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
        String[] columns = { "Id", "Nom" };
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
        StopPointType stopPoint = data.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return stopPoint.getId();
            case 1:
                return stopPoint.getFriendlyName();
            default:
                throw new UnsupportedOperationException("Illegal getValueAt()");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Call is not editable");
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        listeners.add(l);
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        listeners.remove(l);
    }
    
    public void updateContent(List<StopPointType> data) {
        this.data = data;
        for(TableModelListener listener : listeners) {
                listener.tableChanged(new TableModelEvent(this));
        }
    }
    
    public StopPointType get(int index) {
        return data.get(index);
    }
}
