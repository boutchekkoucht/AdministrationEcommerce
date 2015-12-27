package com.ensas.ecommerce.views.categorie;

import java.awt.GridLayout;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView.TableRow;

import com.ensas.ecommerce.views.ButtonEditor;
import com.ensas.ecommerce.views.ButtonRenderer;
import com.ensas.ecommerce.views.Index;

import entities.Categorie;




public class ListCatgories extends JPanel{

	
	
	private JTable categories;

	public ListCatgories(List<Categorie> liste,Index index) {
		
		DefaultTableModel model = new DefaultTableModel();
	    
	    categories=new JTable(model);
	    model.addColumn("id");
	    model.addColumn("first name");
	    model.addColumn("last name ");
	    model.addColumn("edit ");
	    model.addColumn("delete ");
	    model.addColumn("view ");
	    	
	    for(Categorie c:liste){
	    	 model.addRow(new Object[] {c.getIdCategorie(),c.getNomCategorie(),c.getDescription(),c.getIdCategorie(),c.getIdCategorie(),c.getIdCategorie()});
	    }
	    	 
	    	 categories.getColumnModel().getColumn(3).setCellRenderer(new ButtonRenderer("edit"));
	    	 categories.getColumnModel().getColumn(3).setCellEditor(new ButtonEditor(new JTextField(),index,0));
	    	 
	    	 categories.getColumnModel().getColumn(4).setCellRenderer(new ButtonRenderer("delete"));
	    	 categories.getColumnModel().getColumn(4).setCellEditor(new ButtonEditor(new JTextField(),index,1));
	    	 
	    	 categories.getColumnModel().getColumn(5).setCellRenderer(new ButtonRenderer("view"));
	    	 categories.getColumnModel().getColumn(5).setCellEditor(new ButtonEditor(new JTextField(),index,2));
	    	 
	    add(new JScrollPane(categories));
	    setSize(450,100);
		    
	}
	
	
	

	
	
}

