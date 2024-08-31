import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentApplication {

    private JFrame frame;
    private JPanel mainPanel;
    private CardLayout cardLayout;
    
    private JTextField studentRegnoField;
    private JComboBox<String> departmentComboBox;
    
    private JTextField studentNameField;
    private JTextField subjectNameField;
    private JTextField studentMarksField;
    private DefaultListModel<String> studentModel;
    private JList<String> studentList;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                StudentApplication window = new StudentApplication();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public StudentApplication() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Student Application");
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        
        // First Page Components
        JPanel firstPage = new JPanel();
        firstPage.setLayout(new GridLayout(3, 2, 10, 10));
        firstPage.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JLabel regnoLabel = new JLabel("Student Registration Number:");
        firstPage.add(regnoLabel);
        studentRegnoField = new JTextField();
        firstPage.add(studentRegnoField);
        studentRegnoField.setColumns(10);
        
        JLabel departmentLabel = new JLabel("Department:");
        firstPage.add(departmentLabel);
        String[] departments = {"Computer Science", "Mathematics", "Physics", "Chemistry"};
        departmentComboBox = new JComboBox<>(departments);
        firstPage.add(departmentComboBox);
        
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "secondPage");
            }
        });
        firstPage.add(new JLabel());  // Placeholder for layout alignment
        firstPage.add(btnSubmit);
        
        // Second Page Components
        JPanel secondPage = new JPanel();
        secondPage.setLayout(new BorderLayout(10, 10));
        
        JPanel inputPanel = new JPanel();
        secondPage.add(inputPanel, BorderLayout.NORTH);
        inputPanel.setLayout(new GridLayout(3, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel nameLabel = new JLabel("Student Name:");
        inputPanel.add(nameLabel);
        studentNameField = new JTextField();
        inputPanel.add(studentNameField);
        studentNameField.setColumns(10);

        JLabel subjectLabel = new JLabel("Subject Name:");
        inputPanel.add(subjectLabel);
        subjectNameField = new JTextField();
        inputPanel.add(subjectNameField);
        subjectNameField.setColumns(10);

        JLabel marksLabel = new JLabel("Student Marks:");
        inputPanel.add(marksLabel);
        studentMarksField = new JTextField();
        inputPanel.add(studentMarksField);
        studentMarksField.setColumns(10);

        studentModel = new DefaultListModel<>();
        studentList = new JList<>(studentModel);
        studentList.setBorder(BorderFactory.createTitledBorder("Student Details"));
        secondPage.add(new JScrollPane(studentList), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        secondPage.add(buttonPanel, BorderLayout.SOUTH);

        JButton btnAddStudent = new JButton("Add Student");
        btnAddStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String regno = studentRegnoField.getText();
                String department = (String) departmentComboBox.getSelectedItem();
                String name = studentNameField.getText();
                String subject = subjectNameField.getText();
                String marks = studentMarksField.getText();
                if (!regno.isEmpty() && !name.isEmpty() && !subject.isEmpty() && !marks.isEmpty()) {
                    studentModel.addElement("Reg No: " + regno + ", Dept: " + department + ", Name: " + name + ", Subject: " + subject + ", Marks: " + marks);
                    studentNameField.setText("");
                    subjectNameField.setText("");
                    studentMarksField.setText("");
                } else {
                    JOptionPane.showMessageDialog(frame, "All fields must be filled", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonPanel.add(btnAddStudent);

        JButton btnDeleteDetail = new JButton("Delete Detail");
        btnDeleteDetail.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = studentList.getSelectedIndex();
                if (selectedIndex != -1) {
                    studentModel.remove(selectedIndex);
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a detail to delete", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonPanel.add(btnDeleteDetail);
        
        mainPanel.add(firstPage, "firstPage");
        mainPanel.add(secondPage, "secondPage");
        
        frame.getContentPane().add(mainPanel);
        cardLayout.show(mainPanel, "firstPage");
    }
}
