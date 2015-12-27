package com.ensas.ecommerce.views;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import entities.Categorie;

import com.ensas.ecommerce.models.CategorieModel;
import com.ensas.ecommerce.views.categorie.DeleteCategorie;
import com.ensas.ecommerce.views.categorie.UpdateCategorie;
import com.sun.enterprise.module.bootstrap.Main;
import com.sun.xml.ws.commons.MaintenanceTaskExecutor;

public class ButtonEditor extends DefaultCellEditor{
	
	private Index index;
	private int action;
	public ButtonEditor(JTextField textField,Index aa,int a) {
		super(textField);
		index=aa;
		action=a;
	    btn=new JButton();
	    btn.setOpaque(true);
	
	
	btn.addActionListener(new ActionListener() {
	
		

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
		
			fireEditingStopped();
		}
	});
		
		
	}
	
	public Index getIndex() {
		return index;
	}
	public void setIndex(Index index) {
		this.index = index;
	}
	

	
	@Override
	public Component getTableCellEditorComponent(JTable table, Object value,
			boolean isSelected, int row, int column) {
		// TODO Auto-generated method stub
		
		
		lbl=((value==null) ? "":value.toString());
		btn.setText(lbl);
		clicked=true;
		return btn;
	}
	/**
	 * 
	 */
	 @Override
	public Object getCellEditorValue() {
		
		 if(clicked){
			 CategorieModel m=new CategorieModel();
			 Categorie cat= m.getCategorie(Long.parseLong(lbl));
			 
			 if(action==1)
			 {
				new DeleteCategorie(cat,index); 
			 }
			 else if(action==0)
			 {
				 new UpdateCategorie(cat, index);
			 }
			 else
			 {
			 index.getBody().removeAll();
			 			 
			 index.getBody().add(new com.ensas.ecommerce.views.categorie.Categorie(cat));
			 index.getFooter().removeAll();
			 index.validate();
			 index.getBody().repaint();
			 index.validate();
			 }
		 }
		 clicked=false;
		return new String(lbl);
	}
	
	 @Override
	public boolean stopCellEditing() {
	
		 clicked=false;
		 
		return super.stopCellEditing();
	}
	 
	 @Override
	protected void fireEditingStopped() {
		// TODO Auto-generated method stub
		super.fireEditingStopped();
	}
	
	protected JButton btn;
	private String  lbl;
	private Boolean clicked;
	
	
}