package com.ensas.ecommerce.views.produit;


import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



import com.ensas.ecommerce.views.Index;

import metier.Produit;




public class ListProduits extends JPanel{

	
	
	private JTable produits;

	public ListProduits(List<Produit> liste,Index index) {
		
		DefaultTableModel model = new DefaultTableModel();
	    
	    produits=new JTable(model);
	    model.addColumn("id");
	    model.addColumn("designation");
	    model.addColumn("description");
	    model.addColumn("prix");
	    model.addColumn("edit ");
	    model.addColumn("delete ");
	    model.addColumn("view ");
	    	
	    for(Produit p:liste){
	    	 model.addRow(new Object[] {p.getIdProduit(),p.getDesignation(),p.getDescription(),p.getPrix(),p.getIdProduit(),p.getIdProduit(),p.getIdProduit()});
	    }
	    	 
	    	 produits.getColumnModel().getColumn(4).setCellRenderer(new ButtonRenderer("edit"));
	    	 produits.getColumnModel().getColumn(4).setCellEditor(new ButtonEditor(new JTextField(),index,0));
	    	 
	    	 produits.getColumnModel().getColumn(5).setCellRenderer(new ButtonRenderer("delete"));
	    	 produits.getColumnModel().getColumn(5).setCellEditor(new ButtonEditor(new JTextField(),index,1));
	    	 
	    	 produits.getColumnModel().getColumn(6).setCellRenderer(new ButtonRenderer("view"));
	    	 produits.getColumnModel().getColumn(6).setCellEditor(new ButtonEditor(new JTextField(),index,2));
	    	 
	    add(new JScrollPane(produits));
	    setSize(450,100);
		    
	}
	
	
	

	
	
}

