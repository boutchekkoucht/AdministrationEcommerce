package com.ensas.ecommerce.views;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.print.attribute.standard.PDLOverrideSupported;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView.TableRow;

import metier.Categorie;




public class ListProducts extends JPanel{

	
	private JTable products;
	public ListProducts(Index index) {
		 DefaultTableModel model = new DefaultTableModel();
		    
		    products=new JTable(model);
		    model.addColumn("id");
		    model.addColumn("first name");
		    model.addColumn("last name ");
		    model.addColumn("edit ");
		    model.addColumn("delete ");
		    	
		    	 model.addRow(new Object[] {1,"mohamed","boutchekkoucht","22","11"});
		    	 
		    	 
		    	 products.getColumnModel().getColumn(3).setCellRenderer(new ButtonRenderer("edit"));
		    	 products.getColumnModel().getColumn(3).setCellEditor(new ButtonEditor(new JTextField(),index,0));
		    	 products.getColumnModel().getColumn(4).setCellRenderer(new ButtonRenderer("delete"));
		    	 products.getColumnModel().getColumn(4).setCellEditor(new ButtonEditor(new JTextField(),index,1));
		    	 
		    add(new JScrollPane(products));
		    setSize(450,100);
		    
	}
	
	
	public JTable getProducts() {
		return products;
	}
	public void setProducts(JTable products) {
		this.products = products;
	}

}







