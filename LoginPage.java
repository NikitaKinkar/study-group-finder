import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame {

    JTextField emailField;
    JPasswordField passwordField;

    public LoginPage() {

        setTitle("Study Group Finder - Login");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("Login");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setBounds(160, 20, 100, 30);
        panel.add(title);

        JLabel emailLabel = new JLabel("Email / Username:");
        emailLabel.setBounds(50, 80, 150, 25);
        panel.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(200, 80, 150, 25);
        panel.add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 120, 150, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(200, 120, 150, 25);
        panel.add(passwordField);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(140, 170, 100, 30);
        panel.add(loginBtn);

        JLabel registerLink = new JLabel("New user? Register here");
        registerLink.setBounds(120, 210, 200, 25);
        registerLink.setForeground(Color.BLUE);
        panel.add(registerLink);

        // Login Button Action
        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String email = emailField.getText();
                String password = new String(passwordField.getPassword());

                if (email.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all fields!");
                } else {
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                    new Dashboard();
                    dispose();
                }
            }
        });

        // Register Link Click
        registerLink.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                new RegisterPage();
                dispose();
            }
        });

        add(panel);
        setVisible(true);
    }

public class RegisterPage extends JFrame {

    JTextField nameField, emailField;
    JPasswordField passwordField;

    public RegisterPage() {

        setTitle("Study Group Finder - Register");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("Register");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setBounds(150, 20, 100, 30);
        panel.add(title);

        JLabel nameLabel = new JLabel("Full Name:");
        nameLabel.setBounds(50, 80, 150, 25);
        panel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(200, 80, 150, 25);
        panel.add(nameField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 120, 150, 25);
        panel.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(200, 120, 150, 25);
        panel.add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 160, 150, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(200, 160, 150, 25);
        panel.add(passwordField);

        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(140, 210, 100, 30);
        panel.add(registerBtn);

        registerBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());

                if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "All fields are required!");
                } else {
                    JOptionPane.showMessageDialog(null, "Registration Successful!");
                    new LoginPage();
                    dispose();
                }
            }
        });

        add(panel);
        setVisible(true);
    }
}

public class Dashboard extends JFrame {

    public Dashboard() {

        setTitle("Study Group Finder - Dashboard");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel welcome = new JLabel("Welcome to Study Group Finder Dashboard");
        welcome.setFont(new Font("Arial", Font.BOLD, 16));
        welcome.setHorizontalAlignment(SwingConstants.CENTER);

        add(welcome);
        setVisible(true);
    }
}

 public static void main(String[] args) {
        new LoginPage();
    }
}
