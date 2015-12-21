package com.ensas.ecommerce.views.produit;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;



public class ButtonRenderer extends JButton implements TableCellRenderer{

		String label;
		public ButtonRenderer(String label) {
			// TODO Auto-generated constructor stub
			this.label=label;
			
			setOpaque(true);
		}
		
		@Override
		public Component getTableCellRendererComponent(JTable table, Object value,
				boolean isSelected, boolean hasFocus, int row, int column) {
			// TODO Auto-generated method stub
			//last change
			setText((value==null) ? "":label);
			
			return this;
		}
		
	


}
