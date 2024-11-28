/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpl2;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author Alfin
 */
public class TaskTableModel extends AbstractTableModel {
    private final String[] columnNames = {"Status", "Nama Tugas", "Waktu Terakhir"};
    private final List<Task> tasks;

    public TaskTableModel(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public int getRowCount() {
        return tasks.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Task task = tasks.get(rowIndex);
        switch (columnIndex) {
            case 0: return task.getStatus(); // Status
            case 1: return task.getName();   // Nama Tugas
            case 2: return task.getLastTime(); // Waktu Terakhir
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}