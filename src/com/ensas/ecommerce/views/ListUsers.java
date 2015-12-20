package com.ensas.ecommerce.views;

import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView.TableRow;


import com.sun.faces.renderkit.html_basic.ButtonRenderer;



public class ListUsers extends JPanel{

	
	private JTable products;
	public ListUsers() {
		// TODO Auto-generated constructor stub
		
		
		 DefaultTableModel model = new DefaultTableModel();
		    
		    products=new JTable(model);
		    model.addColumn("id");
		    model.addColumn("first name");
		    model.addColumn("last name ");
		    model.addColumn("email ");
		    
		 
		    
		    model.addRow(new Object[] {1,"mohamed","boutchekkoucht",new ButtonRenderer()});
		    add(new JScrollPane(products));
		    
	}
	
	
	public JTable getProducts() {
		return products;
	}
	public void setProducts(JTable products) {
		this.products = products;
	}

	
	
}
