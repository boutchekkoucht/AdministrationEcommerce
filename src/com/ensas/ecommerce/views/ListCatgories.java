package com.ensas.ecommerce.views;

import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView.TableRow;

import metier.Categorie;

import com.ensas.ecommerce.datas.Product;



public class ListCatgories extends JPanel{

	
	private JTable products;
	public ListCatgories(List<Categorie> liste) {
		// TODO Auto-generated constructor stub
		
		
		 DefaultTableModel model = new DefaultTableModel();
		    
		    products=new JTable(model);
		    model.addColumn("id");
		    model.addColumn("user");
		    model.addColumn("date");
		    model.addColumn("details");
		    
		    for(Categorie c:liste){
				   model.addRow(new Object[] {c.getIdCategorie(),c.getNomCategorie(),c.getDescription(),"detail"});
				   
			   }
			 
		 
		    	// model.addRow(new Object[] {c.getIdCategorie(),c.getNomCategorie(),c.get,"detail"});
		    
		   
		    add(new JScrollPane(products));
		    
	}
	
	
	public JTable getProducts() {
		return products;
	}
	public void setProducts(JTable products) {
		this.products = products;
	}

	
	
}
