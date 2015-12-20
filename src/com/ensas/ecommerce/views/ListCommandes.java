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




public class ListCommandes extends JPanel{

	
	private JTable products;
	public ListCommandes() {
		// TODO Auto-generated constructor stub
		
		
		 DefaultTableModel model = new DefaultTableModel();
		    
		    products=new JTable(model);
		    model.addColumn("id");
		    model.addColumn("product");
		    model.addColumn("details");
		    
		    
		    add(new JScrollPane(products));
		    
	}
	
	
	public JTable getProducts() {
		return products;
	}
	public void setProducts(JTable products) {
		this.products = products;
	}

	
	
}
