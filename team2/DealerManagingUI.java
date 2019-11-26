import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class DealerManagingUI extends JFrame{

    private JButton addButton,updateButton,deleteButton;
    private JLabel dealerID, carID, brand, category, price, type;
    private JTextField dealerIDText, carIDText, priceText;
    private JComboBox brandChoice,typeChoice, categoryChoice;

        public DealerManagingUI(){
            super("Dealer managing system");

            Container con = getContentPane();

            addToContainer(con);

            setSize(400,400);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }

        public void addToContainer(Container con){
            FlowLayout gl = new FlowLayout();
            con.setLayout(gl);

            addButton = new JButton("ADD");
            updateButton = new JButton("UPDATE");
            deleteButton = new JButton("DELETE");

            dealerID = new JLabel("Dealer ID: ");
            dealerIDText = new JTextField(5);
            carID = new JLabel("Car ID: ");
            carIDText = new JTextField(10);
            brand = new JLabel("Brand: ");
            brandChoice = new JComboBox(new String[] {"Honda","Nissan","Audi"});
            category = new JLabel("Category: ");
            categoryChoice = new JComboBox(new String[]{"New","Used"});
            typeChoice = new JComboBox(new String[]{"SEDAN", "SUV", "VAN", "PICKUP"});
            price = new JLabel("Price: ");
            priceText = new JTextField(10);

            addToPanel(con, dealerID, dealerIDText);
            addToPanel(con, carID, carIDText);
            addToPanel(con, brand, brandChoice);
            addToPanel(con, category, typeChoice);

            addToPanel(con, price,priceText);
            addToPanel(con, addButton, updateButton);
//            addToPanel(con, deleteButton, );

            addButton.setSize(5,5);
            updateButton.setSize(5,5);
            deleteButton.setSize(5,5);

            DefaultTableModel m = setTable(con);
            addButton.addActionListener((ActionEvent ae)-> parseStudent(m));

        }


        public void addToPanel(Container con, Component a, Component b){
            JPanel jp = new JPanel();
            jp.add(a);
            jp.add(b);
            con.add(jp);
        }

        public void parseStudent(DefaultTableModel m){
            String dealerIDString = dealerIDText.getText();
            String carIDString = carIDText.getText();
            String brandString = brandChoice.getSelectedItem().toString();
            String modelString = categoryChoice.getSelectedItem().toString();
            String priceString = priceText.getText();
            m.addRow(new String[]{dealerIDString, carIDString,brandString, modelString, priceString});
        }

        public DefaultTableModel setTable(Container con){
            DefaultTableModel m = new DefaultTableModel(0,5);
            JTable table = new JTable(m);
            m.addRow(new String[]{"Dealer ID", "Car ID","Brand","Category","Price"});

            JPanel t = new JPanel(new BorderLayout());

            t.add(table,BorderLayout.CENTER);

            con.add(t);
            return m;
        }
        public static void main(String[] args) {
            new DealerManagingUI();
        }
    }




