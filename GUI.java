import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {

	private static int count = 0;
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	private static JLabel name;
	private static JLabel countLabel;
	
	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField();
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		name = new JLabel("Welcome, ");
		name.setBounds(90, 150, 340, 65);
		panel.add(name);
		
		countLabel = new JLabel("");
		countLabel.setBounds(10, 90, 90, 90);
		panel.add(countLabel);
		
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 String user = userText.getText();
		 String password = passwordText.getText();
		 String num = countLabel.getText();
		 
		 if (user.equals("Kush") && password.equals("Kush12")) {
			 success.setText("Login sucessful");
			 name.setText("Welcome, " + user);
		 }
		 else {
			 success.setText("Login Failed");
			 userText.setText("");
			 passwordText.setText("");
		 }
		 count++;
		 countLabel.setText("Clicks: " + count);
	}
}
