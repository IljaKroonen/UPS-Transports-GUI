/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaws.ws.gui;

import iaws.ws.transports.RatedLineType;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class LinesTableModel implements TableModel {

    private List<RatedLineType> data;
    private final List<TableModelListener> listeners;
    
    public LinesTableModel(List<RatedLineType> data) {
        this.data = data;
        listeners = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String[] columnNames = {"Identifiant", "Nom", "Likes", "Dislikes"};
        return columnNames[columnIndex];
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
        RatedLineType ratedLine = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return ratedLine.getId();
            case 1:
                return ratedLine.getFriendlyName();
            case 2:
                return ratedLine.getLikes();
            case 3:
                return ratedLine.getDislikes();
            default:
                throw new UnsupportedOperationException("Invalid access");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not editable");
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        listeners.add(l);
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        listeners.remove(l);
    }

    public void updateContent(List<RatedLineType> data) {
        this.data = data;
        for(TableModelListener listener : listeners) {
            listener.tableChanged(new TableModelEvent(this));
        }
    }
    
    public RatedLineType get(int index) {
        return data.get(index);
    }
}