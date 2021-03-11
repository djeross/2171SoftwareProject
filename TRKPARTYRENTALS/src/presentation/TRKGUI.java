package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ButtonGroup;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JTextArea;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import business.*;


import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.Color;

import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


import javax.swing.JOptionPane;
public class TRKGUI {

	private JFrame frmResourceSchedulingApp;
	private final ButtonGroup options_buttonGroup = new ButtonGroup();
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField equipmentIdInputTextField;
	private JTextField textField_id_2;
	private JTextField textField_id_3;
	private TrkAPP app;
	private JTextField wrapusername;
	private JTextField wrappassword;
	private JTable ScheduleEquipmentTable;
	private JTextField txtpnInvalidCredentialsEntered;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TRKGUI window = new TRKGUI(new TrkAPP());
					window.frmResourceSchedulingApp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TRKGUI(TrkAPP app) {
		this.app=app;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmResourceSchedulingApp = new JFrame();
		frmResourceSchedulingApp.setTitle("Resource Scheduling App");
		frmResourceSchedulingApp.setBounds(300, 100, 800, 600);
		frmResourceSchedulingApp.setResizable(false);
		frmResourceSchedulingApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmResourceSchedulingApp.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new CardLayout(0, 0));
		
		/**
		 * The contents of the login card/page
		 */
		JPanel login_panel = new JPanel();
		panel.add(login_panel, "login");
		login_panel.setLayout(null);
		
		JPanel l4 = new JPanel();
		l4.setBounds(187, 54, 405, 434);
		login_panel.add(l4);
		
		JLabel Username_Label = new JLabel("Username:");
		Username_Label.setBounds(49, 125, 116, 31);
		Username_Label.setFont(new Font("Modern No. 20", Font.BOLD, 25));
		
		JLabel Password_Label = new JLabel("Password:");
		Password_Label.setBounds(58, 190, 107, 27);
		Password_Label.setFont(new Font("Modern No. 20", Font.BOLD, 25));
		
		//image
		Image unlock =new ImageIcon(TRKGUI.class.getResource("/media/unlock.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		JLabel unlockiconlabel = new JLabel("");
		unlockiconlabel.setIcon(new ImageIcon(unlock));
		unlockiconlabel.setBounds(265, 189, 28, 24);
				
		JButton login_button = new JButton("Login");
		login_button.setBackground(Color.BLACK);
		login_button.setForeground(Color.WHITE);
		login_button.setBounds(145, 255, 143, 37);
		login_button.add(unlockiconlabel);
		login_button.setFont(new Font("Tahoma", Font.BOLD, 14));
		l4.setLayout(null);
		
		//image
		Image keyicon =new ImageIcon(TRKGUI.class.getResource("/media/key.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		
		
		JTextField Username_Field = new JTextField();
		Username_Field.setBorder(null);
		Username_Field.setBounds(177, 124, 145, 31);
		Username_Field.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Username_Field.setColumns(15);
		l4.add(Username_Field);
		
		
		JPasswordField password_Field = new JPasswordField();
		password_Field.setBorder(null);
		password_Field.setBounds(177, 187, 147, 31);
		password_Field.setFont(new Font("Tahoma", Font.PLAIN, 14));
		password_Field.setColumns(15);
		l4.add(password_Field);
		JLabel keyiconlabel = new JLabel("");
		keyiconlabel.setIcon(new ImageIcon(keyicon));
		keyiconlabel.setBounds(332, 192, 28, 24);
		l4.add(keyiconlabel);
		l4.add(Username_Label);
		l4.add(Password_Label);
		l4.add(login_button);
		//image
		JLabel usericonlabel = new JLabel("");
		Image useicon =new ImageIcon(TRKGUI.class.getResource("/media/user.png")).getImage().getScaledInstance(28, 28, Image.SCALE_SMOOTH);
		usericonlabel.setIcon(new ImageIcon(useicon));
		usericonlabel.setBounds(333, 129, 28, 24);
		l4.add(usericonlabel);
		
		wrapusername = new JTextField();
		wrapusername.setSelectionColor(Color.BLACK);
		wrapusername.setBackground(Color.WHITE);
		wrapusername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		wrapusername.setEditable(false);
		wrapusername.setBounds(175, 122, 186, 35);
		l4.add(wrapusername);
		wrapusername.setColumns(10);
		
		wrappassword = new JTextField();
		wrappassword.setSelectionColor(Color.BLACK);
		wrappassword.setBackground(Color.WHITE);
		wrappassword.setEditable(false);
		wrappassword.setColumns(10);
		wrappassword.setBounds(175, 185, 186, 35);
		l4.add(wrappassword);
		
		
		JPanel l5 = new JPanel();
		l5.setBounds(0, 424, 794, 147);
		login_panel.add(l5);
		l5.setBackground(new Color(0, 0, 0));
		l5.setLayout(null);
		
		JTextPane txtpnCopyrightGroup = new JTextPane();
		txtpnCopyrightGroup.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnCopyrightGroup.setBounds(0, 105, 152, 20);
		l5.add(txtpnCopyrightGroup);
		txtpnCopyrightGroup.setForeground(Color.WHITE);
		txtpnCopyrightGroup.setBackground(Color.BLACK);
		txtpnCopyrightGroup.setText("Copyright \u00A9 Group 6 Inc.");
		
		JPanel l1 = new JPanel();
		l1.setBackground(Color.BLACK);
		l1.setBounds(0, 0, 804, 118);
		FlowLayout fl_l1 = (FlowLayout) l1.getLayout();
		fl_l1.setVgap(70);
		login_panel.add(l1);
		
		JPanel l2 = new JPanel();
		l2.setBackground(new Color(184, 134, 11));
		l2.setBounds(0, 83, 189, 488);
		login_panel.add(l2);
		l2.setLayout(null);
		
		JPanel l3 = new JPanel();
		l3.setBackground(new Color(184, 134, 11));
		l3.setBounds(592, 83, 212, 488);
		FlowLayout fl_l3 = (FlowLayout) l3.getLayout();
		fl_l3.setHgap(100);
		login_panel.add(l3);
		
		JPanel options_panel2 = new JPanel();
		panel.add(options_panel2, "name_255827648248700");
		options_panel2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_1.getLayout();
		flowLayout_2.setHgap(100);
		flowLayout_2.setVgap(100);
		options_panel2.add(panel_1, BorderLayout.WEST);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_2.getLayout();
		flowLayout_3.setHgap(100);
		options_panel2.add(panel_2, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setVgap(50);
		flowLayout.setHgap(50);
		options_panel2.add(panel_3, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_4.getLayout();
		flowLayout_1.setVgap(50);
		options_panel2.add(panel_4, BorderLayout.SOUTH);
		
		JPanel panel_5 = new JPanel();
		options_panel2.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		JPanel options_1 = new JPanel();
		panel_5.add(options_1);
		options_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton schedule_button_1 = new JButton("Schedule Equipment");
		schedule_button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		options_1.add(schedule_button_1);
		
		JButton search_button_1 = new JButton("Search");
		search_button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		options_1.add(search_button_1);
		
		JButton viewSch_button_1 = new JButton("View Schedule");
		viewSch_button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		options_1.add(viewSch_button_1);

		JPanel options_panel1 = new JPanel();
		panel.add(options_panel1, "options");
		options_panel1.setLayout(null);
		
		JPanel options = new JPanel();
		options.setBounds(181, 100, 431, 371);
		JButton addEqu_button = new JButton("Add Equipment");
		addEqu_button.setBounds(0, 0, 210, 53);
		addEqu_button.setFont(new Font("Tahoma", Font.BOLD, 16));
		options_buttonGroup.add(addEqu_button);
		
		JButton modEqu_button = new JButton("Modify Equippment");
		modEqu_button.setBounds(220, 0, 210, 53);
		modEqu_button.setFont(new Font("Tahoma", Font.BOLD, 16));
		options_buttonGroup.add(modEqu_button);
		
		JButton delEqu_button = new JButton("Delete Equipment");
		delEqu_button.setBounds(0, 64, 210, 53);
		delEqu_button.setFont(new Font("Tahoma", Font.BOLD, 16));
		options_buttonGroup.add(delEqu_button);
		
		JButton schedule_button = new JButton("Schedule Equipment");
		schedule_button.setBounds(0, 128, 210, 53);
		schedule_button.setFont(new Font("Tahoma", Font.BOLD, 16));
		options_buttonGroup.add(schedule_button);
		
		JButton modSch_button = new JButton("Modify Schedule");
		modSch_button.setBounds(220, 128, 210, 53);
		modSch_button.setFont(new Font("Tahoma", Font.BOLD, 16));
		options_buttonGroup.add(modSch_button);
		
		JButton search_button = new JButton("Search");
		search_button.setBounds(220, 64, 210, 53);
		search_button.setFont(new Font("Tahoma", Font.BOLD, 16));
		options_buttonGroup.add(search_button);
		
		JButton viewSch_button = new JButton("View Schedule");
		viewSch_button.setBounds(0, 192, 210, 53);
		viewSch_button.setFont(new Font("Tahoma", Font.BOLD, 16));
		options_buttonGroup.add(viewSch_button);
		
		options_panel1.add(options);
		options.setLayout(null);
		options.add(addEqu_button);
		options.add(modEqu_button);
		options.add(delEqu_button);
		options.add(search_button);
		options.add(schedule_button);
		options.add(modSch_button);
		options.add(viewSch_button);
		
		/**
		 * Options Panel
		 */
		JPanel o1 = new JPanel();
		o1.setBounds(0, 100, 182, 371);
		FlowLayout fl_o1 = (FlowLayout) o1.getLayout();
		fl_o1.setHgap(100);
		fl_o1.setVgap(100);
		options_panel1.add(o1);
		
		JPanel o2 = new JPanel();
		o2.setBounds(0, 0, 794, 100);
		options_panel1.add(o2);
		o2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setBounds(311, 32, 160, 44);
		lblNewLabel.setFont(new Font("Modern No. 20", Font.BOLD, 52));
		o2.add(lblNewLabel);
		
		JPanel o3 = new JPanel();
		o3.setBounds(0, 471, 794, 100);
		FlowLayout fl_o3 = (FlowLayout) o3.getLayout();
		fl_o3.setVgap(50);
		fl_o3.setHgap(50);
		options_panel1.add(o3);
		
		JPanel o4 = new JPanel();
		o4.setBounds(612, 100, 182, 371);
		FlowLayout fl_o4 = (FlowLayout) o4.getLayout();
		fl_o4.setVgap(100);
		fl_o4.setHgap(100);
		options_panel1.add(o4);
		
		/**
		 * Add Equipment Panel
		 */
		JPanel addEqu_panel = new JPanel();
		panel.add(addEqu_panel);
		addEqu_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel a1 = new JPanel();
		FlowLayout fl_a1 = (FlowLayout) a1.getLayout();
		fl_a1.setHgap(20);
		fl_a1.setVgap(20);
		addEqu_panel.add(a1, BorderLayout.NORTH);
		
		JLabel a_Label = new JLabel("Add Equipment");
		a_Label.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		a1.add(a_Label);
		
		JPanel a2 = new JPanel();
		FlowLayout fl_a2 = (FlowLayout) a2.getLayout();
		fl_a2.setHgap(50);
		addEqu_panel.add(a2, BorderLayout.EAST);
		
		JPanel a3 = new JPanel();
		FlowLayout fl_a3 = (FlowLayout) a3.getLayout();
		fl_a3.setHgap(50);
		addEqu_panel.add(a3, BorderLayout.WEST);
		
		JPanel a4 = new JPanel();
		addEqu_panel.add(a4, BorderLayout.CENTER);
		
		JPanel a4_1 = new JPanel();
		
		JLabel aLabel_1 = new JLabel("Name:");
		aLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JTextField atextField_1 = new JTextField();
		atextField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		atextField_1.setColumns(15);
		
		JLabel aLabel_2 = new JLabel("Quantity:");
		aLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JTextField atextField_2 = new JTextField();
		atextField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		atextField_2.setColumns(5);
		
		JLabel aLabel_3 = new JLabel("ID:");
		aLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JTextArea atextArea = new JTextArea();
		atextArea.setFont(new Font("Tahoma", Font.PLAIN, 13));
		atextArea.setEditable(false);
		atextArea.setColumns(10);
		
		JButton aSave = new JButton("Save");
		aSave.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JButton aBack = new JButton("Back");
		aBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		a4_1.setLayout(new BoxLayout(a4_1, BoxLayout.Y_AXIS));
		a4_1.add(aLabel_1);
		a4_1.add(atextField_1);
		a4_1.add(aLabel_2);
		a4_1.add(atextField_2);
		a4_1.add(aLabel_3);
		a4_1.add(atextArea);
		GroupLayout gl_a4 = new GroupLayout(a4);
		gl_a4.setHorizontalGroup(
			gl_a4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_a4.createSequentialGroup()
					.addGap(173)
					.addGroup(gl_a4.createParallelGroup(Alignment.LEADING)
						.addComponent(a4_1, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_a4.createSequentialGroup()
							.addComponent(aSave)
							.addGap(33)
							.addComponent(aBack)))
					.addContainerGap(164, Short.MAX_VALUE))
		);
		gl_a4.setVerticalGroup(
			gl_a4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_a4.createSequentialGroup()
					.addGap(18)
					.addComponent(a4_1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_a4.createParallelGroup(Alignment.BASELINE)
						.addComponent(aBack)
						.addComponent(aSave))
					.addGap(92))
		);
		a4.setLayout(gl_a4);
		
		/**
		 * Modify Equipment Panel
		 */
		JPanel modEqu_panel = new JPanel();
		panel.add(modEqu_panel);
		modEqu_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel mE1 = new JPanel();
		FlowLayout fl_mE1 = (FlowLayout) mE1.getLayout();
		fl_mE1.setVgap(15);
		modEqu_panel.add(mE1, BorderLayout.NORTH);
		
		JLabel mE_Label_1 = new JLabel("Modify Equipment Information");
		mE_Label_1.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		mE1.add(mE_Label_1);
		
		JPanel mE2 = new JPanel();
		FlowLayout fl_mE2 = (FlowLayout) mE2.getLayout();
		fl_mE2.setHgap(50);
		modEqu_panel.add(mE2, BorderLayout.WEST);
		
		JPanel mE3 = new JPanel();
		FlowLayout fl_mE3 = (FlowLayout) mE3.getLayout();
		fl_mE3.setHgap(50);
		modEqu_panel.add(mE3, BorderLayout.EAST);
		
		JPanel mE4 = new JPanel();
		modEqu_panel.add(mE4, BorderLayout.CENTER);
		
		JPanel mE4_1 = new JPanel();
		
		JButton mESave = new JButton("Save");
		mESave.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
		JButton mEBack = new JButton("Back");
		mEBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		GroupLayout gl_mE4 = new GroupLayout(mE4);
		gl_mE4.setHorizontalGroup(
			gl_mE4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mE4.createSequentialGroup()
					.addContainerGap(198, Short.MAX_VALUE)
					.addComponent(mESave)
					.addGap(10)
					.addComponent(mEBack)
					.addGap(180))
				.addGroup(gl_mE4.createSequentialGroup()
					.addGap(133)
					.addComponent(mE4_1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(163, Short.MAX_VALUE))
		);
		gl_mE4.setVerticalGroup(
			gl_mE4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mE4.createSequentialGroup()
					.addContainerGap()
					.addComponent(mE4_1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addGroup(gl_mE4.createParallelGroup(Alignment.LEADING)
						.addComponent(mESave)
						.addComponent(mEBack)))
		);
		
		JTextField mEtextField_1 = new JTextField();
		mEtextField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mEtextField_1.setColumns(10);
		
		JTextField mEtextField_2 = new JTextField();
		mEtextField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mEtextField_2.setColumns(10);
		mE4_1.setLayout(new BoxLayout(mE4_1, BoxLayout.Y_AXIS));
		
		JLabel mE_Label_2 = new JLabel("Equipment ID:");
		mE_Label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mE4_1.add(mE_Label_2);
		mE4_1.add(mEtextField_1);
		
		JLabel mE_Label_3 = new JLabel("Quantity:");
		mE_Label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mE4_1.add(mE_Label_3);
		mE4_1.add(mEtextField_2);
		mE4.setLayout(gl_mE4);
		
		/**
		 * Delete Equipment Panel
		 */
		JPanel delEqu_panel = new JPanel();
		panel.add(delEqu_panel);
		delEqu_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel d1 = new JPanel();
		delEqu_panel.add(d1, BorderLayout.NORTH);
		
		JLabel d_Label_1 = new JLabel("Delete Equipment Information");
		d_Label_1.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		d1.add(d_Label_1);
		
		JPanel d2 = new JPanel();
		delEqu_panel.add(d2, BorderLayout.WEST);
		d2.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));
		
		JPanel d3 = new JPanel();
		FlowLayout fl_d3 = (FlowLayout) d3.getLayout();
		fl_d3.setHgap(50);
		delEqu_panel.add(d3, BorderLayout.EAST);
		
		JPanel d4 = new JPanel();
		delEqu_panel.add(d4, BorderLayout.CENTER);
		
		JPanel d4_1 = new JPanel();
		d4_1.setLayout(new MigLayout("", "[grow]", "[][grow]"));
		
		JButton dDelete = new JButton("Delete");
		dDelete.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton dBack = new JButton("Back");
		dBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		GroupLayout gl_d4 = new GroupLayout(d4);
		gl_d4.setHorizontalGroup(
			gl_d4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_d4.createSequentialGroup()
					.addGroup(gl_d4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_d4.createSequentialGroup()
							.addGap(158)
							.addComponent(dDelete)
							.addGap(48)
							.addComponent(dBack))
						.addGroup(gl_d4.createSequentialGroup()
							.addGap(72)
							.addComponent(d4_1, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(71, Short.MAX_VALUE))
		);
		gl_d4.setVerticalGroup(
			gl_d4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_d4.createSequentialGroup()
					.addGap(18)
					.addComponent(d4_1, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_d4.createParallelGroup(Alignment.BASELINE)
						.addComponent(dBack)
						.addComponent(dDelete))
					.addContainerGap(38, Short.MAX_VALUE))
		);
		
		JLabel d_Label_2 = new JLabel("Equipment ID:");
		d_Label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		d4_1.add(d_Label_2, "flowx,cell 0 0");
		
		JTextField dtextField = new JTextField();
		dtextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		d4_1.add(dtextField, "cell 0 0");
		dtextField.setColumns(10);
		
		JScrollPane dscrollPane = new JScrollPane();
		d4_1.add(dscrollPane, "cell 0 1,grow");
		
		JTextArea dtextArea = new JTextArea();
		dtextArea.setEditable(false);
		dscrollPane.setViewportView(dtextArea);
		d4.setLayout(gl_d4);
		
		/**
		 * Schedule Equipment Panel
		 */
		JPanel schedule_panel = new JPanel();
		panel.add(schedule_panel);
		schedule_panel.setLayout(null);
		
		JPanel s1 = new JPanel();
		s1.setBounds(0, 0, 794, 58);
		schedule_panel.add(s1);
		
		JLabel s_Label_1 = new JLabel("Schedule Equipment ");
		s_Label_1.setFont(new Font("Modern No. 20", Font.BOLD, 52));
		s1.add(s_Label_1);
		
		JPanel s4 = new JPanel();
		s4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		s4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Schdedule quipment for events", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		s4.setBounds(22, 74, 745, 469);
		schedule_panel.add(s4);
		
		JButton sSchedule = new JButton("Schedule");
		sSchedule.setToolTipText("Schedule equipment in with with scheduling details entered");
		sSchedule.setBounds(50, 409, 97, 31);
		sSchedule.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		JButton sBack = new JButton("Back");
		sBack.setToolTipText("Return to main menu.");
		sBack.setBounds(615, 410, 88, 31);
		sBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(772, 0, 22, 551);
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		s4.setLayout(null);
		s4.add(sSchedule);
		
		JPanel panel_20 = new JPanel();
		panel_20.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_20.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Add equipment to list", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_20.setBounds(40, 164, 674, 234);
		s4.add(panel_20);
		panel_20.setLayout(null);
		
		JLabel s_Label_id = new JLabel("Equipment ID ");
		s_Label_id.setBounds(10, 63, 116, 17);
		panel_20.add(s_Label_id);
		s_Label_id.setHorizontalAlignment(SwingConstants.RIGHT);
		s_Label_id.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		equipmentIdInputTextField = new JTextField();
		equipmentIdInputTextField.setBounds(136, 56, 112, 31);
		panel_20.add(equipmentIdInputTextField);
		equipmentIdInputTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		equipmentIdInputTextField.setColumns(10);
		
		JTextField quantityInputTextField = new JTextField();
		quantityInputTextField.setBounds(136, 107, 112, 31);
		panel_20.add(quantityInputTextField);
		quantityInputTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		quantityInputTextField.setColumns(10);
		
		JLabel s_Label_7 = new JLabel("Quantity");
		s_Label_7.setBounds(26, 114, 89, 17);
		panel_20.add(s_Label_7);
		s_Label_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		s_Label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane_4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_4.setBounds(280, 19, 368, 204);
		panel_20.add(scrollPane_4);
		
		
		//######################################Schedule Resource Table E###################################################//
		ScheduleEquipmentTable = new JTable();
		ScheduleEquipmentTable.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ScheduleEquipmentTable.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 13));
		scrollPane_4.setViewportView(ScheduleEquipmentTable);
		ScheduleEquipmentTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Equipment ID", "Quantity"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		//######################################Schedule Resource Table End#####################################################//
		
		JButton addtolistBTN = new JButton("Add to List");
		addtolistBTN.setToolTipText("Add equipment to list of equipment to be scheduled.");
		addtolistBTN.setBounds(26, 159, 107, 31);
		panel_20.add(addtolistBTN);
		addtolistBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model= (DefaultTableModel)ScheduleEquipmentTable.getModel();
				if((equipmentIdInputTextField.getText().isBlank())==false){
					try {
					    int intValue = Integer.parseInt(quantityInputTextField.getText());
					    model.addRow(new Object[]{equipmentIdInputTextField.getText(),quantityInputTextField.getText()});
					    equipmentIdInputTextField.setText("");
					    quantityInputTextField.setText("");
					} catch (NumberFormatException e1) {
						JOptionPane.showMessageDialog(null,"Quantity must be a whole number.","System Warning",JOptionPane.WARNING_MESSAGE);
					}
				}
				else {
					JOptionPane.showMessageDialog(null,"Equipment Id cannot be empty.","System Warning",JOptionPane.WARNING_MESSAGE);
				}
					
			}
		});
		addtolistBTN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton deleteBTN = new JButton("Delete");
		deleteBTN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model= (DefaultTableModel)ScheduleEquipmentTable.getModel();
				model.removeRow(ScheduleEquipmentTable.getSelectedRow());
				JOptionPane.showMessageDialog(null,"Row was deleted","System Message",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		deleteBTN.setToolTipText("Select row in table and click delete to delete equipment from list.");
		deleteBTN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		deleteBTN.setBounds(158, 159, 96, 31);
		panel_20.add(deleteBTN);
		s4.add(sBack);
		s4.add(scrollPane_2);
		
		JLabel s_Label_5 = new JLabel("Start Time [24 hr] [hh:mm]");
		s_Label_5.setBounds(347, 73, 243, 17);
		s4.add(s_Label_5);
		s_Label_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		s_Label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JTextField startTimeTextField = new JTextField();
		startTimeTextField.setBounds(602, 66, 112, 31);
		s4.add(startTimeTextField);
		startTimeTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		startTimeTextField.setColumns(10);
		
		JLabel s_Label_2 = new JLabel("EventID");
		s_Label_2.setBounds(33, 39, 70, 17);
		s4.add(s_Label_2);
		s_Label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		s_Label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JTextField eventIDTextField = new JTextField();
		eventIDTextField.setBounds(108, 32, 126, 31);
		s4.add(eventIDTextField);
		eventIDTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		eventIDTextField.setColumns(10);
		
		JLabel s_Label_3 = new JLabel("Location");
		s_Label_3.setBounds(33, 88, 70, 17);
		s4.add(s_Label_3);
		s_Label_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		s_Label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(108, 79, 229, 40);
		s4.add(scrollPane_3);
		
		JTextPane locationTextField = new JTextPane();
		scrollPane_3.setViewportView(locationTextField);
		locationTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel s_Label_6 = new JLabel("End Time [24 hr] [hh:mm]");
		s_Label_6.setBounds(378, 115, 212, 17);
		s4.add(s_Label_6);
		s_Label_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		s_Label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JTextField endTimeTextField = new JTextField();
		endTimeTextField.setBounds(602, 108, 112, 31);
		s4.add(endTimeTextField);
		endTimeTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		endTimeTextField.setColumns(10);
		
		JLabel s_Label_4 = new JLabel("Date [yyyy-mm-dd] ");
		s_Label_4.setBounds(378, 32, 212, 17);
		s4.add(s_Label_4);
		s_Label_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		s_Label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JTextField stextField_4_1 = new JTextField();
		stextField_4_1.setBounds(602, 24, 112, 31);
		s4.add(stextField_4_1);
		stextField_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		stextField_4_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("View Inventory");
		btnNewButton_1.setToolTipText("Show a list of all resources;name id remaining quantity");
		btnNewButton_1.setBounds(169, 409, 131, 31);
		s4.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		/**
		 * Modify Schedule Panel -
		 */
		JPanel modify_schedule_panel = new JPanel();
		panel.add(modify_schedule_panel, "name_178420640145900");
		modify_schedule_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel mS1 = new JPanel();
		modify_schedule_panel.add(mS1, BorderLayout.NORTH);
		
		JLabel mS_Label_1 = new JLabel("Modify Equipment Schedule ");
		mS_Label_1.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		mS1.add(mS_Label_1);
		
		JPanel mS2 = new JPanel();
		FlowLayout fl_mS2 = (FlowLayout) mS2.getLayout();
		fl_mS2.setHgap(50);
		modify_schedule_panel.add(mS2, BorderLayout.WEST);
		
		JPanel mS3 = new JPanel();
		FlowLayout fl_mS3 = (FlowLayout) mS3.getLayout();
		fl_mS3.setHgap(50);
		modify_schedule_panel.add(mS3, BorderLayout.EAST);
		
		JPanel mS4 = new JPanel();
		modify_schedule_panel.add(mS4, BorderLayout.CENTER);
		
		JPanel mS4_1 = new JPanel();
		
		JButton mSsave = new JButton("Save");
		mSsave.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
		JButton mSback = new JButton("Back");
		mSback.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		GroupLayout gl_mS4 = new GroupLayout(mS4);
		gl_mS4.setHorizontalGroup(
			gl_mS4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mS4.createSequentialGroup()
					.addContainerGap(144, Short.MAX_VALUE)
					.addGroup(gl_mS4.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_mS4.createSequentialGroup()
							.addComponent(mSsave)
							.addGap(57)
							.addComponent(mSback)
							.addGap(160))
						.addGroup(Alignment.TRAILING, gl_mS4.createSequentialGroup()
							.addComponent(mS4_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(126))))
		);
		gl_mS4.setVerticalGroup(
			gl_mS4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mS4.createSequentialGroup()
					.addContainerGap()
					.addComponent(mS4_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addGroup(gl_mS4.createParallelGroup(Alignment.BASELINE)
						.addComponent(mSsave)
						.addComponent(mSback))
					.addContainerGap(150, Short.MAX_VALUE))
		);
		mS4_1.setLayout(new BoxLayout(mS4_1, BoxLayout.Y_AXIS));
		
		JLabel s_Label_id_1 = new JLabel("Equipment ID: ");
		s_Label_id_1.setHorizontalAlignment(SwingConstants.RIGHT);
		s_Label_id_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mS4_1.add(s_Label_id_1);
		
		textField_id_2 = new JTextField();
		textField_id_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_id_2.setColumns(10);
		mS4_1.add(textField_id_2);
		
		JLabel ms_Label_1 = new JLabel("EventID: ");
		ms_Label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ms_Label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		mS4_1.add(ms_Label_1);
		
		JTextField textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		mS4_1.add(textField);
		
		JLabel ms_Label_2 = new JLabel("Location:");
		ms_Label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ms_Label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		mS4_1.add(ms_Label_2);
		
		JTextField textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		mS4_1.add(textField_1);
		
		JLabel ms_Label_3 = new JLabel("Date [yyyy-mm-dd]: ");
		ms_Label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ms_Label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		mS4_1.add(ms_Label_3);
		
		JTextField textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		mS4_1.add(textField_2);
		
		JLabel ms_Label_4 = new JLabel("Start Time [24 hr] [hh:mm]:");
		ms_Label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ms_Label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		mS4_1.add(ms_Label_4);
		
		JTextField textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setColumns(10);
		mS4_1.add(textField_3);
		
		JLabel ms_Label_5 = new JLabel("End Time [24 hr] [hh:mm]:");
		ms_Label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ms_Label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		mS4_1.add(ms_Label_5);
		
		JTextField textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_4.setColumns(10);
		mS4_1.add(textField_4);
		
		JLabel ms_Label_6 = new JLabel("Quantity:");
		ms_Label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ms_Label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		mS4_1.add(ms_Label_6);
		
		JTextField textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_5.setColumns(10);
		mS4_1.add(textField_5);
				
		mS4.setLayout(gl_mS4);
		
		JPanel search_panel = new JPanel();
		panel.add(search_panel, "name_178648497614900");
		search_panel.setLayout(new BorderLayout(0, 0));
		
		/**
		 * Search Panel
		 */
		JPanel sr1 = new JPanel();
		search_panel.add(sr1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_15 = new JLabel("View Equipment");
		lblNewLabel_15.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		sr1.add(lblNewLabel_15);
		
		JPanel sr2 = new JPanel();
		search_panel.add(sr2, BorderLayout.WEST);
		GroupLayout gl_sr2 = new GroupLayout(sr2);
		gl_sr2.setHorizontalGroup(
			gl_sr2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 58, Short.MAX_VALUE)
		);
		gl_sr2.setVerticalGroup(
			gl_sr2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 312, Short.MAX_VALUE)
		);
		sr2.setLayout(gl_sr2);
		
		JPanel sr3 = new JPanel();
		search_panel.add(sr3, BorderLayout.EAST);
		GroupLayout gl_sr3 = new GroupLayout(sr3);
		gl_sr3.setHorizontalGroup(
			gl_sr3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 161, Short.MAX_VALUE)
		);
		gl_sr3.setVerticalGroup(
			gl_sr3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 312, Short.MAX_VALUE)
		);
		sr3.setLayout(gl_sr3);
		
		JPanel sr4 = new JPanel();
		search_panel.add(sr4, BorderLayout.CENTER);
		
		JPanel sr4_1 = new JPanel();
		
		JButton srSearch = new JButton("Search");
		srSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
		JButton srBack = new JButton("Back");
		srBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		GroupLayout gl_sr4 = new GroupLayout(sr4);
		gl_sr4.setHorizontalGroup(
			gl_sr4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_sr4.createSequentialGroup()
					.addGroup(gl_sr4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_sr4.createSequentialGroup()
							.addGap(159)
							.addComponent(srSearch)
							.addGap(64)
							.addComponent(srBack))
						.addGroup(gl_sr4.createSequentialGroup()
							.addGap(40)
							.addComponent(sr4_1, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(40, Short.MAX_VALUE))
		);
		gl_sr4.setVerticalGroup(
			gl_sr4.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_sr4.createSequentialGroup()
					.addContainerGap()
					.addComponent(sr4_1, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
					.addGroup(gl_sr4.createParallelGroup(Alignment.BASELINE)
						.addComponent(srSearch)
						.addComponent(srBack))
					.addGap(76))
		);
		
		JLabel lblNewLabel_16 = new JLabel("Equipment ID:");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JTextField textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_8.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		scrollPane.setViewportView(textArea_2);
		textArea_2.setColumns(50);
		textArea_2.setRows(10);
		GroupLayout gl_sr4_1 = new GroupLayout(sr4_1);
		gl_sr4_1.setHorizontalGroup(
			gl_sr4_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_sr4_1.createSequentialGroup()
					.addGap(116)
					.addComponent(lblNewLabel_16)
					.addGap(4)
					.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_sr4_1.createSequentialGroup()
					.addGap(7)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 383, GroupLayout.PREFERRED_SIZE))
		);
		gl_sr4_1.setVerticalGroup(
			gl_sr4_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_sr4_1.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_sr4_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_sr4_1.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_16))
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
		);
		sr4_1.setLayout(gl_sr4_1);
		sr4.setLayout(gl_sr4);
		
		/**
		 * View Schedule Panel
		 */
		JPanel view_schedule_panel = new JPanel();
		panel.add(view_schedule_panel, "name_191323147392800");
		view_schedule_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel vs1 = new JPanel();
		view_schedule_panel.add(vs1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_17 = new JLabel("View Equipment Schedule");
		lblNewLabel_17.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		vs1.add(lblNewLabel_17);
		
		JPanel vs2 = new JPanel();
		FlowLayout fl_vs2 = (FlowLayout) vs2.getLayout();
		fl_vs2.setHgap(50);
		view_schedule_panel.add(vs2, BorderLayout.WEST);
		
		JPanel vs3 = new JPanel();
		FlowLayout fl_vs3 = (FlowLayout) vs3.getLayout();
		fl_vs3.setHgap(50);
		view_schedule_panel.add(vs3, BorderLayout.EAST);
		
		JPanel vs4 = new JPanel();
		view_schedule_panel.add(vs4, BorderLayout.CENTER);
		
		JPanel vs4_1 = new JPanel();
		vs4_1.setLayout(new MigLayout("", "[grow]", "[][]"));
		
		JLabel vs_Label_2 = new JLabel("Equipment ID:");
		vs_Label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		vs4_1.add(vs_Label_2, "flowx,cell 0 0,alignx center");
		
		JTextField vstextField = new JTextField();
		vstextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		vs4_1.add(vstextField, "cell 0 0");
		vstextField.setColumns(10);
		
		JScrollPane vs_scrollPane = new JScrollPane();
		vs4_1.add(vs_scrollPane, "cell 0 1,grow");
		
		JTextArea vstextArea = new JTextArea();
		vstextArea.setEditable(false);
		vs_scrollPane.setViewportView(vstextArea);
		vstextArea.setRows(10);
		vstextArea.setColumns(50);
		
		JButton vsView = new JButton("View");
		vsView.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		JButton vsBack = new JButton("Back");
		vsBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		GroupLayout gl_vs4 = new GroupLayout(vs4);
		gl_vs4.setHorizontalGroup(
			gl_vs4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_vs4.createSequentialGroup()
					.addGroup(gl_vs4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_vs4.createSequentialGroup()
							.addGap(39)
							.addComponent(vs4_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_vs4.createSequentialGroup()
							.addGap(157)
							.addComponent(vsView)
							.addGap(57)
							.addComponent(vsBack)))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		gl_vs4.setVerticalGroup(
			gl_vs4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_vs4.createSequentialGroup()
					.addGap(5)
					.addComponent(vs4_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_vs4.createParallelGroup(Alignment.BASELINE)
						.addComponent(vsView)
						.addComponent(vsBack))
					.addContainerGap(129, Short.MAX_VALUE))
		);
		vs4.setLayout(gl_vs4);
		
		JPanel view_schedule_panel_1 = new JPanel();
		panel.add(view_schedule_panel_1, "name_263145308522499");
		view_schedule_panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		view_schedule_panel_1.add(panel_6, BorderLayout.NORTH);
		
		JLabel lblNewLabel_17_1 = new JLabel("View Equipment Schedule");
		lblNewLabel_17_1.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		panel_6.add(lblNewLabel_17_1);
		
		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) panel_7.getLayout();
		flowLayout_6.setHgap(50);
		view_schedule_panel_1.add(panel_7, BorderLayout.WEST);
		
		JPanel panel_8 = new JPanel();
		FlowLayout flowLayout_7 = (FlowLayout) panel_8.getLayout();
		flowLayout_7.setHgap(50);
		view_schedule_panel_1.add(panel_8, BorderLayout.EAST);
		
		JPanel panel_9 = new JPanel();
		view_schedule_panel_1.add(panel_9, BorderLayout.CENTER);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JButton vsView_1 = new JButton("View");
		vsView_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton vsBack_1 = new JButton("Back");
		vsBack_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JPanel panel_19 = new JPanel();
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(
			gl_panel_9.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_9.createSequentialGroup()
							.addGap(23)
							.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE)
							.addGap(140)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_9.createSequentialGroup()
							.addGap(127)
							.addComponent(vsView_1)
							.addGap(94)
							.addComponent(vsBack_1)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_9.setVerticalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_9.createSequentialGroup()
							.addGap(23)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_9.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)))
					.addGap(30)
					.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
						.addComponent(vsView_1)
						.addComponent(vsBack_1))
					.addContainerGap(105, Short.MAX_VALUE))
		);
		
		JLabel vs_Label_2_1 = new JLabel("Equipment ID:");
		vs_Label_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_13.setColumns(10);
		
		JTextArea vstextArea_1 = new JTextArea();
		vstextArea_1.setRows(10);
		vstextArea_1.setEditable(false);
		vstextArea_1.setColumns(50);
		GroupLayout gl_panel_19 = new GroupLayout(panel_19);
		gl_panel_19.setHorizontalGroup(
			gl_panel_19.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_19.createSequentialGroup()
					.addGroup(gl_panel_19.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_19.createSequentialGroup()
							.addGap(127)
							.addComponent(vs_Label_2_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_19.createSequentialGroup()
							.addGap(26)
							.addComponent(vstextArea_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(147, Short.MAX_VALUE))
		);
		gl_panel_19.setVerticalGroup(
			gl_panel_19.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_19.createSequentialGroup()
					.addGroup(gl_panel_19.createParallelGroup(Alignment.BASELINE)
						.addComponent(vs_Label_2_1)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(vstextArea_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(100, Short.MAX_VALUE))
		);
		panel_19.setLayout(gl_panel_19);
		panel_9.setLayout(gl_panel_9);
		
		JPanel schedule_panel_1 = new JPanel();
		panel.add(schedule_panel_1, "name_263458545026600");
		schedule_panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_10 = new JPanel();
		schedule_panel_1.add(panel_10, BorderLayout.NORTH);
		
		JLabel s_Label_1_1 = new JLabel("Schedule Equipment ");
		s_Label_1_1.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		panel_10.add(s_Label_1_1);
		
		JPanel panel_11 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_11.getLayout();
		flowLayout_4.setHgap(50);
		schedule_panel_1.add(panel_11, BorderLayout.WEST);
		
		JPanel panel_12 = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) panel_12.getLayout();
		flowLayout_5.setHgap(50);
		schedule_panel_1.add(panel_12, BorderLayout.EAST);
		
		JPanel panel_13 = new JPanel();
		schedule_panel_1.add(panel_13, BorderLayout.CENTER);
		
		JPanel panel_18 = new JPanel();
		panel_18.setLayout(new BoxLayout(panel_18, BoxLayout.Y_AXIS));
		
		JLabel s_Label_id_2 = new JLabel("Equipment ID: ");
		s_Label_id_2.setHorizontalAlignment(SwingConstants.RIGHT);
		s_Label_id_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_18.add(s_Label_id_2);
		
		textField_id_3 = new JTextField();
		textField_id_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_id_3.setColumns(10);
		panel_18.add(textField_id_3);
		
		JLabel s_Label_2_1 = new JLabel("EventID: ");
		s_Label_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s_Label_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_18.add(s_Label_2_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_6.setColumns(10);
		panel_18.add(textField_6);
		
		JLabel s_Label_3_1 = new JLabel("Location:");
		s_Label_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s_Label_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_18.add(s_Label_3_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_7.setColumns(10);
		panel_18.add(textField_7);
		
		JLabel s_Label_4_1 = new JLabel("Date [yyyy-mm-dd]: ");
		s_Label_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s_Label_4_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_18.add(s_Label_4_1);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_9.setColumns(10);
		panel_18.add(textField_9);
		
		JLabel s_Label_5_1 = new JLabel("Start Time [24 hr] [hh:mm]:");
		s_Label_5_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s_Label_5_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_18.add(s_Label_5_1);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_10.setColumns(10);
		panel_18.add(textField_10);
		
		JLabel s_Label_6_1 = new JLabel("End Time [24 hr] [hh:mm]:");
		s_Label_6_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s_Label_6_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_18.add(s_Label_6_1);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_11.setColumns(10);
		panel_18.add(textField_11);
		
		JLabel s_Label_7_1 = new JLabel("Quantity:");
		s_Label_7_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s_Label_7_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_18.add(s_Label_7_1);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_12.setColumns(10);
		panel_18.add(textField_12);
		
		JButton sSchedule_1 = new JButton("Schedule");
		sSchedule_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton sBack_1 = new JButton("Back");
		sBack_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GroupLayout gl_panel_13 = new GroupLayout(panel_13);
		gl_panel_13.setHorizontalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addGap(126)
					.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_13.createSequentialGroup()
							.addComponent(sSchedule_1)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(sBack_1))
						.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(126, Short.MAX_VALUE))
		);
		gl_panel_13.setVerticalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addGap(5)
					.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(41)
					.addGroup(gl_panel_13.createParallelGroup(Alignment.BASELINE)
						.addComponent(sSchedule_1)
						.addComponent(sBack_1))
					.addContainerGap(137, Short.MAX_VALUE))
		);
		panel_13.setLayout(gl_panel_13);
		
		JPanel search_panel_1 = new JPanel();
		panel.add(search_panel_1, "name_263510153674900");
		search_panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_14 = new JPanel();
		search_panel_1.add(panel_14, BorderLayout.NORTH);
		
		JLabel lblNewLabel_15_1 = new JLabel("View Equipment");
		lblNewLabel_15_1.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		panel_14.add(lblNewLabel_15_1);
		
		JPanel panel_15 = new JPanel();
		FlowLayout flowLayout_8 = (FlowLayout) panel_15.getLayout();
		flowLayout_8.setHgap(50);
		search_panel_1.add(panel_15, BorderLayout.WEST);
		
		JPanel panel_16 = new JPanel();
		FlowLayout flowLayout_9 = (FlowLayout) panel_16.getLayout();
		flowLayout_9.setHgap(50);
		search_panel_1.add(panel_16, BorderLayout.EAST);
		
		JPanel panel_17 = new JPanel();
		search_panel_1.add(panel_17, BorderLayout.CENTER);
		
		JPanel panel_19_1 = new JPanel();
		
		JLabel vs_Label_2_1_1 = new JLabel("Equipment ID:");
		vs_Label_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_14.setColumns(10);
		
		JTextArea srtextArea_1 = new JTextArea();
		srtextArea_1.setRows(10);
		srtextArea_1.setEditable(false);
		srtextArea_1.setColumns(50);
		GroupLayout gl_panel_19_1 = new GroupLayout(panel_19_1);
		gl_panel_19_1.setHorizontalGroup(
			gl_panel_19_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 449, Short.MAX_VALUE)
				.addGroup(gl_panel_19_1.createSequentialGroup()
					.addGroup(gl_panel_19_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_19_1.createSequentialGroup()
							.addGap(127)
							.addComponent(vs_Label_2_1_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_19_1.createSequentialGroup()
							.addGap(26)
							.addComponent(srtextArea_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_panel_19_1.setVerticalGroup(
			gl_panel_19_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 226, Short.MAX_VALUE)
				.addGroup(gl_panel_19_1.createSequentialGroup()
					.addGroup(gl_panel_19_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(vs_Label_2_1_1)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(srtextArea_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(13, Short.MAX_VALUE))
		);
		panel_19_1.setLayout(gl_panel_19_1);
		
		JButton srSearch_1 = new JButton("Search");
		srSearch_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton srBack_1 = new JButton("Back");
		srBack_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		srBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GroupLayout gl_panel_17 = new GroupLayout(panel_17);
		gl_panel_17.setHorizontalGroup(
			gl_panel_17.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_17.createSequentialGroup()
					.addGroup(gl_panel_17.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_17.createSequentialGroup()
							.addGap(23)
							.addComponent(panel_19_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_17.createSequentialGroup()
							.addGap(156)
							.addComponent(srSearch_1)
							.addGap(69)
							.addComponent(srBack_1)))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_panel_17.setVerticalGroup(
			gl_panel_17.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_17.createSequentialGroup()
					.addGap(5)
					.addComponent(panel_19_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addGroup(gl_panel_17.createParallelGroup(Alignment.BASELINE)
						.addComponent(srBack_1)
						.addComponent(srSearch_1))
					.addGap(110))
		);
		panel_17.setLayout(gl_panel_17);
		
		/**
		 * Action listener to allow user authentication for login
		 */
		login_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				/**
				 * test for password: 12345    and user name: user
				 */
				txtpnInvalidCredentialsEntered = new JTextField();
				txtpnInvalidCredentialsEntered.setEditable(false);
				txtpnInvalidCredentialsEntered.setBackground(UIManager.getColor("Panel.background"));
				txtpnInvalidCredentialsEntered.setForeground(Color.RED);
				txtpnInvalidCredentialsEntered.setText("Invalid credentials entered.");
				txtpnInvalidCredentialsEntered.setBounds(144, 322, 155, 20);
				txtpnInvalidCredentialsEntered.setBorder(null);
				l4.add(txtpnInvalidCredentialsEntered);
				
				String p ="";
				for (int i = 0; i < password_Field.getPassword().length; i++) {
					p += password_Field.getPassword()[i];
				}
				
				if (Username_Field.getText().compareTo("user") == 0) {
					if (p.compareTo("12345")==0) {
						options_panel1.show();
						login_panel.hide();	
						txtpnInvalidCredentialsEntered.hide();
					}
					else {
						txtpnInvalidCredentialsEntered.show();
						wrappassword.setBorder(new LineBorder(Color.RED));
					}
				}
				else if (Username_Field.getText().compareTo("emp") == 0) {
					if (p.compareTo("0000")==0) {
						options_panel2.show();
						login_panel.hide();	
						txtpnInvalidCredentialsEntered.hide();
					}
					else {
						txtpnInvalidCredentialsEntered.show();
					}
				}
			}
		});
					
		/**
		 * Action listener for the owner view
		 */
		addEqu_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.show();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				schedule_panel_1.hide();
			}
		});
		
		modEqu_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.show();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				schedule_panel_1.hide();
			}
		});
		
		delEqu_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.show();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				schedule_panel_1.hide();
			}
		});
		
		schedule_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.show();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				schedule_panel_1.hide();
			}
		});
		
		modSch_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.show();
				search_panel.hide();
				view_schedule_panel.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				schedule_panel_1.hide();
			}
		});
		
		search_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.show();
				view_schedule_panel.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				schedule_panel_1.hide();
			}
		});
		
		viewSch_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.show();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				schedule_panel_1.hide();
			}
		});
		
		schedule_button_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.show();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
			}
		});
		
		search_button_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.show();
			}
		});
		
		viewSch_button_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				view_schedule_panel_1.show();
				search_panel_1.hide();
				schedule_panel_1.hide();
			}
		});		
		
		
		/**
		 * Action listeners for the back buttons on each option panel
		 */		
		aBack.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.show();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				mEtextField_1.setText("");
				mEtextField_2.setText("");
			}
		});
		
		mEBack.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.show();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				mEtextField_1.setText("");
				mEtextField_2.setText("");
			}
		});
		
		dBack.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.show();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				dtextField.setText("");
				dtextArea.setText("");
			}
		});
		
		sBack.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.show();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				equipmentIdInputTextField.setText("");
				eventIDTextField.setText("");
				locationTextField.setText("");
				stextField_4_1.setText("");
				startTimeTextField.setText("");
				endTimeTextField.setText("");
				quantityInputTextField.setText("");
			}
		});
		
		mSback.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.show();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				textField_id_2.setText("");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
			}
		});
		
		srBack.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.show();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				textField_8.setText("");
				textArea_2.setText("");
			}
		});
		
		vsBack.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.show();
				options_panel2.hide();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				vstextField.setText("");
				vstextArea.setText("");
			}
		});
				
		vsBack_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.show();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				textField_13.setText("");
				vstextArea_1.setText("");
			}
		});
		
		srBack_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.show();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				textField_14.setText("");
				srtextArea_1.setText("");
			}
		});
		
		sBack_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				options_panel1.hide();
				options_panel2.show();
				login_panel.hide();	
				addEqu_panel.hide();
				modEqu_panel.hide();
				delEqu_panel.hide();
				schedule_panel.hide();
				modify_schedule_panel.hide();
				search_panel.hide();
				view_schedule_panel.hide();
				schedule_panel_1.hide();
				view_schedule_panel_1.hide();
				search_panel_1.hide();
				textField_id_3.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
			}
		});
		
		/**
		 * Action listeners for the save/schedule buttons on each option panel
		 */	
		
		/*
		//add equipment 
		aSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nme = atextField_1.getText();
				int quantity =  Integer.parseInt(atextField_2.getText());
				String genericid= nme.substring(0,3)+"#"+app.genStr();
				atextArea.setText(genericid);
				app.delay();
				app.addNewEquipment(genericid, nme, quantity);
				//atextField_1.setText("");
				//atextField_2.setText("");
				//atextArea.setText("");
				
			}
		});
		
		//modify equipment quantity
		mESave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = mEtextField_1.getText();
				int new_quantity = Integer.parseInt(mEtextField_2.getText());
				app.equipmentModifier(id, new_quantity, new_quantity);
			}
		});
		
		//delete equipment
		dDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = dtextField.getText();
				app.equipmentRemover(id);
				dtextArea.setText("Equipment with id: "+id+" deleted");
			}
		});
		
		*/
		//schedule equipment
		sSchedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<String[]> list = new ArrayList<String[]>();
				String eventid = eventIDTextField.getText();
				String location = locationTextField.getText();
				String date = stextField_4_1.getText();
				String s_time = startTimeTextField.getText();
				String e_time = endTimeTextField.getText();
				//int quantity = Integer.parseInt(quantityInputTextField.getText());
				if ((eventid.isBlank()||location.isBlank()||date.isBlank()||s_time.isBlank()||e_time.isBlank())==false) {
					DefaultTableModel model= (DefaultTableModel)ScheduleEquipmentTable.getModel();
					if(model.getRowCount()>0){
					    for (int i = 0; model.getRowCount() > i; i++){
					    	String[] pairs = {(String)model.getValueAt(i, 0), (String)model.getValueAt(i, 1)};
					    	list.add(pairs);
					    }
					    String response=app.equipmentScheduler(eventid, location, date, s_time, e_time, list);
					    if (response.equals("Success")){
					    	JOptionPane.showMessageDialog(null,"Equiment was successfully scheduled.","Success",JOptionPane.INFORMATION_MESSAGE);
					    	eventIDTextField.setText("");
					    	locationTextField.setText("");
					    	stextField_4_1.setText("");
					    	startTimeTextField.setText("");
					    	endTimeTextField.setText("");
					    	model.setRowCount(0);
					    }
					    else {
					    	JOptionPane.showMessageDialog(null,response,"Scheduling Error",JOptionPane.WARNING_MESSAGE);
					    }
					}
					else {
						JOptionPane.showMessageDialog(null,"List of Equipment cannot be empty.","System Warning",JOptionPane.WARNING_MESSAGE);
					}
				}
				else {
					JOptionPane.showMessageDialog(null,"Please ensure that scheduling details are filled in.","System Warning",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		                                           	
		
		
		/***************************************************************
		
		//modify schedule
		mSsave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = textField_id_2.getText();
				String eventid = textField.getText();
				String location = textField_1.getText();
				String date = textField_2.getText();
				String s_time = textField_3.getText();
				String e_time = textField_4.getText();
				int quantity = Integer.parseInt(textField_5.getText());
				app.scheduleModifier(eventid, location, date, s_time, e_time, id, quantity);
			}
		});
		
		//search
		srSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = textField_8.getText();
				textArea_2.setText(app.equipmentInfoViewer(id));
			}
		});
		
		//view schedule
		vsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = vstextField.getText();
				vstextArea.setText(app.schedule_Viewer(id));
			}
		});	
		
		//schedule equipment - employee view
		sSchedule_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = textField_id_3.getText();
				String eventid = textField_6.getText();
				String location = textField_7.getText();
				String date = textField_9.getText();
				String s_time = textField_10.getText();
				String e_time = textField_11.getText();
				int quantity = Integer.parseInt(textField_12.getText());
				app.equipmentScheduler(eventid, location, date, s_time, e_time, id, quantity);
			}
		});
		
		//view schedule - employee view
		vsView_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = textField_13.getText();
				vstextArea_1.setText(app.schedule_Viewer(id));
			}
		});		
		
		//search - employee view
		srSearch_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = textField_14.getText();
				srtextArea_1.setText(app.equipmentInfoViewer(id));
			}
		});
		
		
		*****************************************************8*/
			
	}
	
}
	
