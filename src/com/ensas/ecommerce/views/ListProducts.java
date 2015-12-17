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

import com.ensas.ecommerce.datas.Product;



public class ListProducts extends JPanel{

	
	private JTable products;
	public ListProducts() {
		// TODO Auto-generated constructor stub
		
		
		 DefaultTableModel model = new DefaultTableModel();
		    
		    products=new JTable(model);
		    model.addColumn("id");
		    model.addColumn("user");
		    model.addColumn("date");
		    model.addColumn("details");
		    
		   
		    
		    model.addRow(new Object[] { 1,"sami","12-12-12","detail"});
		    add(new JScrollPane(products));
		    
	}
	
	
	public JTable getProducts() {
		return products;
	}
	public void setProducts(JTable products) {
		this.products = products;
	}

	
	
}
