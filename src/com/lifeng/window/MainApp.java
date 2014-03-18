/*
 * MainApp.java
 *
 * Created on __DATE__, __TIME__
 */

package com.lifeng.window;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.Vector;

import com.lifeng.db.AccessDb;
import com.lifeng.db.Custom;

/**
 * 
 * @author lifeng
 */
public class MainApp extends javax.swing.JFrame {

	/** Creates new form MainApp */
	public MainApp() {
		initComponents();
	}

//GEN-BEGIN:initComponents
// <editor-fold defaultstate="collapsed" desc="Generated Code">
private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jPanel2 = new javax.swing.JPanel();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jPopupMenu = new javax.swing.JPopupMenu();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u5ba2\u6237\u7ba1\u7406");
		setSize(950,850);
		setLocationRelativeTo(getOwner());

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
		jPanel1.setToolTipText("\u67e5\u8be2");
		jPanel1.setAlignmentX(0.6F);
		jPanel1.setMaximumSize(new java.awt.Dimension(32767, 70));
		jPanel1.setName("search");
		jPanel1.setPreferredSize(new java.awt.Dimension(100, 50));

		jLabel1.setText("\u5ba2\u6237\u540d\u79f0\uff1a");

		jLabel2.setText("\u56fd\u5bb6\uff1a");

		jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jTextField1KeyPressed(evt);
			}
		});

		jButton1.setText("\u66f4\u65b0");

		jButton5.setText("\u65b0\u589e");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												70,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jTextField1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												141,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(70, 70, 70)
										.addComponent(
												jLabel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jTextField2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												141,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												15, Short.MAX_VALUE)
										.addComponent(jButton1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton5).addGap(5, 5, 5)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel2)
																		.addComponent(
																				jTextField2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButton1)
																		.addComponent(
																				jButton5))
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel1)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
		jPanel1.getAccessibleContext().setAccessibleName("\"search\"");

		jTable1.setAutoCreateRowSorter(true);
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "序号", "客户名称", "国家", "电子邮箱", "电话", "公司网站",
						"创建日期","备注" }) {
			Class[] types = new Class[] { java.lang.Integer.class,
					java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.String.class , java.lang.String.class};
			boolean[] canEdit = new boolean[] { false, false, false, false, false,
					false, false };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}

			public int getRowCount() {

				return AccessDb.size;
			}//取得表格行数 

			public Object getValueAt(int row, int column) {

				if (!AccessDb.vector.isEmpty())

					return ((Custom) AccessDb.vector.elementAt(row))
							.elementAt(column);

				else

					return null;
			}//取得单元格中的属性值 
		});
		jTable1.setToolTipText("\u5ba2\u6237\u5217\u8868");
		jTable1.setCellSelectionEnabled(true);
		jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jTable1MousePressed(evt);
			}
		});
		javax.swing.JMenuItem modify = new javax.swing.JMenuItem("修改");
		modify.addActionListener(new java.awt.event.ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				modifyActionPerformed(evt);
			}
			
		});
		javax.swing.JMenuItem delete = new javax.swing.JMenuItem("删除");
		delete.addActionListener(new java.awt.event.ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				deleteActionPerformed(evt);
			}
			
		});
		javax.swing.JMenuItem shuaxin = new javax.swing.JMenuItem("刷新");
		shuaxin.addActionListener(new java.awt.event.ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				shuaxinActionPerformed(evt);
			}
			
		});
		jPopupMenu.add(modify); //添加菜单项Open  
		jPopupMenu.add(delete);
		jPopupMenu.add(shuaxin);
		jTable1.add(jPopupMenu);
		jScrollPane1.setViewportView(jTable1);

		getContentPane().add(jScrollPane1, java.awt.BorderLayout.SOUTH);

		jButton2.setIcon(new javax.swing.ImageIcon(
				"F:\\shopping\\resource\\后台框架\\images\\top.gif")); // NOI18N
		jButton2.setText("\u5ba2\u6237\u5217\u8868");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("\u6dfb\u52a0\u5ba2\u6237");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setText("\u5ba2\u6237\u6c9f\u901a\u8bb0\u5f55");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(jButton2,
								javax.swing.GroupLayout.PREFERRED_SIZE, 123,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(29, 29, 29)
						.addComponent(jButton3,
								javax.swing.GroupLayout.PREFERRED_SIZE, 132,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(34, 34, 34)
						.addComponent(jButton4,
								javax.swing.GroupLayout.PREFERRED_SIZE, 131,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(169, Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jButton2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																72,
																Short.MAX_VALUE)
														.addComponent(
																jButton3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																72,
																Short.MAX_VALUE)
														.addComponent(
																jButton4,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																72,
																Short.MAX_VALUE))
										.addContainerGap()));

		getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jTable1MousePressed(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		int row = jTable1.rowAtPoint(evt.getPoint());
	    id = (Integer)jTable1.getModel().getValueAt(row, 0);
	
		jPopupMenu.show(evt.getComponent(),evt.getX(), evt.getY());  
		
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.setEnabled(false);
		final javax.swing.JFrame custom = new CustomWin(this);
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				custom.setVisible(true);
			}
		});

	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

	}

	private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {
		// TODO add your handling code here:
	}

	private void modifyActionPerformed(java.awt.event.ActionEvent evt){
		this.setEnabled(false);
		Custom custom = AccessDb.getCustom(id);
		final javax.swing.JFrame customWin = new CustomWin(this,custom);
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				customWin.setVisible(true);
			}
		});
	}
	private void deleteActionPerformed(java.awt.event.ActionEvent evt){
	
		AccessDb.deleteCustom(id);
		
		Vector vector = AccessDb.getMdbList();
		AccessDb.size = vector.size();
		AccessDb.vector = vector;
		this.jTable1.repaint();
	}
	private void shuaxinActionPerformed(java.awt.event.ActionEvent evt){
		
		Vector vector = AccessDb.getMdbList();
		AccessDb.size = vector.size();
		AccessDb.vector = vector;
		this.jTable1.repaint();
	}
	public static void main(String args[]) {

		Vector vector = AccessDb.getMdbList();
		AccessDb.size = vector.size();
		AccessDb.vector = vector;
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainApp().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	protected javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables
	private javax.swing.JPopupMenu jPopupMenu;
	private int id;

}