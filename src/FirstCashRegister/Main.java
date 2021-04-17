package FirstCashRegister;
/***
 * THIS IS MY FIRST CASH REGISTER
 * 1ST YEAR 2ND TERM
 * SIR MAKEE MALIMBAN
 *
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextField;
import java.util.Date;


public class Main extends JFrame implements ActionListener {
    Date date = new Date();
    JPanel myPanel = new JPanel();

    JTextArea Receipt = new JTextArea();

    // Pizza Items
    JButton GardenParty = new JButton("GP");
    JButton OldFashionedMeatBrawl = new JButton("OFMB");
    JButton Cock_A_Doodle_Bacon = new JButton("CADB");
    JButton HotTwisted = new JButton("H&T");
    JButton PretzelPiggy = new JButton("PP");
    JButton SevenAlarmFire = new JButton("7-AF");

    //Milk tea Items
    JButton CreamyCheesyAvocado = new JButton("CCA");
    JButton CreamyCheesyOreo = new JButton("CCO");
    JButton CreamyOkinawa = new JButton("CO");
    JButton StrawberryCheeseCake = new JButton("SCC");

    //Bonus Feature
    JButton DineIn = new JButton("Dine-in");
    JButton Delivery = new JButton("Delivery");
    JButton Takeout = new JButton("Takeout");

    JTextField AmountInput = new JTextField("Amount Input");

    //Discounts
    JButton Disc_Students = new JButton("Student");
    JButton Disc_SeniorCitizen = new JButton("Senior Citizen");
    JButton Disc_PWD = new JButton("PWD");

    JButton Enter = new JButton("ENTER");
    JButton NewTransaction = new JButton("New");

    JTextField Time_Date = new JTextField(String.valueOf(date));
    JTextField Transacted_by = new JTextField("Transacted by: ");
    JTextField total_display = new JTextField("TOTAL");


    int quantity_GardenParty = 0;
    int quantity_FashionedMeatBall = 0;
    int quantity_Cock_A_Doodle_Bacon = 0;
    int quantity_Hot_Twisted = 0;
    int quantity_Pretzel_Piggy = 0;
    int quantity_Seven_Alarm_Fire = 0;

    int quantity_Creamy_Cheesy_Avocado = 0;
    int quantity_Creamy_Cheesy_Oreo = 0;
    int quantity_Creamy_Okinawa = 0;
    int quantity_Strawberry_CheeseCake = 0;

    int pesos_GardenParty = 700;
    int pesos_OldFashionedMeatBrawl = 800;
    int pesos_Cock_A_Doodle_Bacon = 900;
    int pesos_Hot_Twisted = 1000;
    int pesos_Pretzel_Piggy = 900;
    int pesos_Seven_Alarm_Fire = 1500;

    int pesos_CreamyCheesyAvocado = 150;
    int pesos_CreamyCheesyOreo = 160;
    int pesos_CreamyOkinawa = 170;
    int pesos_Strawberry_Cheesecake = 200;

    double total_cost = 0;


    String stock_1 = "";
    String stock_2 = "";
    String stock_3 = "";
    String stock_4 = "";
    String stock_5 = "";
    String stock_6 = "";
    String stock_7 = "";
    String stock_8 = "";
    String stock_9 = "";
    String stock_10 = "";

    String stock_dinein = "";
    String stock_delivery = "";
    String stock_takeout = "";

    String stock_disc_student = "";
    String stock_disc_PWD = "";
    String stock_disc_Senior = "";

    String transction;
    String time_date1;

    double stock_discount_student;
    double stock_discount_Senior;
    double stock_discount_PWD;

    double stock_amount_input;

    int total_stock_a;
    int total_stock_b;
    int total_stock_c;

    double stock_TOTAL;


//    JFormattedTextField format = new JFormattedTextField(java.util.Calendar.getInstance().getTime());


    public Main() {
        Receipt.setBounds(20, 5, 255, 355);
        GardenParty.setBounds(280, 5, 100, 100);
        OldFashionedMeatBrawl.setBounds(390, 5, 100, 100);
        Cock_A_Doodle_Bacon.setBounds(500, 5, 100, 100);
        HotTwisted.setBounds(280, 115, 100, 100);
        PretzelPiggy.setBounds(390, 115, 100, 100);
        SevenAlarmFire.setBounds(500, 115, 100, 100);

        CreamyCheesyAvocado.setBounds(280, 220, 150, 80);
        CreamyCheesyOreo.setBounds(450, 220, 150, 80);
        CreamyOkinawa.setBounds(280, 305, 150, 80);
        StrawberryCheeseCake.setBounds(450, 305, 150, 80);

        DineIn.setBounds(20, 387, 190, 20);
        Delivery.setBounds(215, 387, 190, 20);
        Takeout.setBounds(410, 387, 190, 20);

        AmountInput.setBounds(20, 410, 190, 50);
        Disc_Students.setBounds(215, 410, 95, 50);
        Disc_SeniorCitizen.setBounds(312, 410, 95, 50);
        Disc_PWD.setBounds(409, 410, 95, 50);


        Enter.setBounds(505, 410, 95, 130);
        NewTransaction.setBounds(505, 545, 95, 40);

        Time_Date.setBounds(20, 463, 484, 77);
        Transacted_by.setBounds(20, 545, 484, 40);
        total_display.setBounds(20, 605, 580, 40);


        myPanel.add(Receipt);
        Receipt.setLineWrap(true);
        Receipt.setWrapStyleWord(true);
        Receipt.setBorder(BorderFactory.createEmptyBorder());
        Receipt.setForeground(new Color(55, 55, 55));
        Receipt.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        Receipt.setEditable(false);

        total_display.setEditable(false);
        total_display.setFont(new Font("Times New Roman", Font.PLAIN, 20));


        myPanel.add(GardenParty);
        myPanel.add(OldFashionedMeatBrawl);
        myPanel.add(Cock_A_Doodle_Bacon);
        myPanel.add(HotTwisted);
        myPanel.add(PretzelPiggy);
        myPanel.add(SevenAlarmFire);

        myPanel.add(CreamyCheesyAvocado);
        myPanel.add(CreamyCheesyOreo);
        myPanel.add(CreamyOkinawa);
        myPanel.add(StrawberryCheeseCake);

        myPanel.add(DineIn);
        myPanel.add(Delivery);
        myPanel.add(Takeout);

        myPanel.add(AmountInput);
        myPanel.add(Disc_Students);
        myPanel.add(Disc_SeniorCitizen);
        myPanel.add(Disc_PWD);

        myPanel.add(Enter);
        myPanel.add(NewTransaction);

        myPanel.add(Time_Date);
        myPanel.add(Transacted_by);
        myPanel.add(total_display);
//        myPanel.add(format);

        GardenParty.addActionListener(this);
        OldFashionedMeatBrawl.addActionListener(this);
        Cock_A_Doodle_Bacon.addActionListener(this);
        HotTwisted.addActionListener(this);
        PretzelPiggy.addActionListener(this);
        SevenAlarmFire.addActionListener(this);
        CreamyCheesyAvocado.addActionListener(this);
        CreamyCheesyOreo.addActionListener(this);
        CreamyOkinawa.addActionListener(this);
        StrawberryCheeseCake.addActionListener(this);

        DineIn.addActionListener(this);
        Delivery.addActionListener(this);
        Takeout.addActionListener(this);

        Disc_Students.addActionListener(this);
        Disc_SeniorCitizen.addActionListener(this);
        Disc_PWD.addActionListener(this);

        Enter.addActionListener(this);
        NewTransaction.addActionListener(this);

        this.setTitle("Intermediate Project");
        this.setSize(640, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        myPanel.setBackground(Color.WHITE);
        myPanel.setLayout(null);
        this.add(myPanel);
        myPanel.updateUI();
        this.validate();
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(GardenParty)) {
            quantity_GardenParty++;
            double fix_price_a = 700;
            double pesos_stock_a = pesos_GardenParty * quantity_GardenParty;
            //System.out.println(quantity_GardenParty + " Order(s) of: Garden Party");
            //System.out.println(pesos_stock_a + "Price");
            stock_1 = quantity_GardenParty + "           Garden Party " + "       "
                    + fix_price_a + "            " + pesos_stock_a + "\n";
            total_cost += fix_price_a;
            total_display.setText(String.valueOf(total_cost));
        } else if (e.getSource().equals(OldFashionedMeatBrawl)) {
            quantity_FashionedMeatBall++;
            double fix_price_b = 800;
            double pesos_stock_b = pesos_OldFashionedMeatBrawl * quantity_FashionedMeatBall;

            //System.out.println(quantity_FashionedMeatBall + " Order(s) of: Old Fashioned Meat Brawl");
            // System.out.println(pesos_stock_b);
            stock_2 = quantity_FashionedMeatBall + "           OFMBrawl " + "           "
                    + fix_price_b + "            " + pesos_stock_b + "\n";
            total_cost += fix_price_b;
            total_display.setText(String.valueOf(total_cost));
        } else if (e.getSource().equals(Cock_A_Doodle_Bacon)) {
            quantity_Cock_A_Doodle_Bacon++;
            double fix_price_c = 900;
            double pesos_stock_c = pesos_Cock_A_Doodle_Bacon * quantity_Cock_A_Doodle_Bacon;
            // System.out.println(quantity_Cock_A_Doodle_Bacon+ " Order(s) of: Cock-A-Doodle- Bacon");
            //System.out.println(pesos_stock_c);
            stock_3 = quantity_Cock_A_Doodle_Bacon + "           CADBacon " + "          "
                    + fix_price_c + "            " + pesos_stock_c + "\n";
            total_cost += fix_price_c;
            total_display.setText(String.valueOf(total_cost));
        } else if (e.getSource().equals(HotTwisted)) {
            quantity_Hot_Twisted++;
            double fix_price_d = 1000;
            double pesos_stock_d = pesos_Hot_Twisted * quantity_Hot_Twisted;
            //System.out.println(quantity_Hot_Twisted + " Order(s) of: Hot & Twisted");
            //System.out.println(pesos_stock_d);
            stock_4 = quantity_Hot_Twisted + "           HotTwstd " + "            "
                    + fix_price_d + "          " + pesos_stock_d + "\n";
            total_cost += fix_price_d;
            total_display.setText(String.valueOf(total_cost));
        } else if (e.getSource().equals(PretzelPiggy)) {
            quantity_Pretzel_Piggy++;
            double fix_price_e = 900;
            double pesos_stock_e = pesos_Pretzel_Piggy * quantity_Pretzel_Piggy;
//            System.out.println(quantity_Pretzel_Piggy + " Order(s) of: Pretzel Piggy");
//            System.out.println(pesos_stock_e);
            stock_5 = quantity_Pretzel_Piggy + "           PrtzlPgy " + "                "
                    + fix_price_e + "            " + pesos_stock_e + "\n";
            total_cost += fix_price_e;
            total_display.setText(String.valueOf(total_cost));
        } else if (e.getSource().equals(SevenAlarmFire)) {
            quantity_Seven_Alarm_Fire++;
            double fix_price_f = 1500;
            double pesos_stock_f = pesos_Seven_Alarm_Fire * quantity_Seven_Alarm_Fire;
//            System.out.println(quantity_Seven_Alarm_Fire + " Order(s) of: 7-Alarm Fire");
//            System.out.println(pesos_stock_f);
            stock_6 = quantity_Seven_Alarm_Fire + "           7AlrmFre " + "              "
                    + fix_price_f + "          " + pesos_stock_f + "\n";
            total_cost += fix_price_f;
            total_display.setText(String.valueOf(total_cost));
        } else if (e.getSource().equals(CreamyCheesyAvocado)) {
            quantity_Creamy_Cheesy_Avocado++;
            double fix_price_g = 150;
            double pesos_stock_g = pesos_CreamyCheesyAvocado * quantity_Creamy_Cheesy_Avocado;
//            System.out.println(quantity_Creamy_Cheesy_Avocado + " Order(s) of: Creamy Cheesy Avocado");
//            System.out.println(pesos_stock_g);
            stock_7 = quantity_Creamy_Cheesy_Avocado + "           CrmyChAcd " + "        "
                    + fix_price_g + "             " + pesos_stock_g + "\n";
            total_cost += fix_price_g;
            total_display.setText(String.valueOf(total_cost));
        } else if (e.getSource().equals(CreamyCheesyOreo)) {
            quantity_Creamy_Cheesy_Oreo++;
            double fix_price_h = 160;
            double pesos_stock_h = pesos_CreamyCheesyOreo * quantity_Creamy_Cheesy_Oreo;
//            System.out.println(quantity_Creamy_Cheesy_Oreo + " Order(s) of: Creamy Cheesy Oreo");
//            System.out.println(pesos_stock_h);
            stock_8 = quantity_Creamy_Cheesy_Oreo + "           CrmyChOreo " + "       "
                    + fix_price_h + "             " + pesos_stock_h + "\n";
            total_cost += fix_price_h;
            total_display.setText(String.valueOf(total_cost));
        } else if (e.getSource().equals(CreamyOkinawa)) {
            quantity_Creamy_Okinawa++;
            double fix_price_i = 170;
            double pesos_stock_i = pesos_CreamyOkinawa * quantity_Creamy_Okinawa;
//            System.out.println(quantity_Creamy_Okinawa + " Order(s) of: Creamy Okinawa");
//            System.out.println(pesos_stock_i);
            stock_9 = quantity_Creamy_Okinawa + "           CrmyOkinwa " + "       "
                    + fix_price_i + "             " + pesos_stock_i + "\n";
            total_cost += fix_price_i;
            total_display.setText(String.valueOf(total_cost));
        } else if (e.getSource().equals(StrawberryCheeseCake)) {
            quantity_Strawberry_CheeseCake++;
            double fix_price_j = 200;
            double pesos_stock_j = pesos_Strawberry_Cheesecake * quantity_Strawberry_CheeseCake;
//            System.out.println(quantity_Strawberry_CheeseCake + " Order(s) of: Strawberry Cheesecake");
//            System.out.println(pesos_stock_j);
            stock_10 = quantity_Strawberry_CheeseCake + "           StrwbrryChCake " + ""
                    + fix_price_j + "             " + pesos_stock_j + "\n";
            total_cost += fix_price_j;
            total_display.setText(String.valueOf(total_cost));
        } else if (e.getSource().equals(DineIn)) {
            stock_dinein = "For Dine-in";
//            System.out.println("Dine-in");
            stock_delivery = "";
            stock_takeout = "";
        } else if (e.getSource().equals(Delivery)) {
            stock_delivery = "For Delivery";
//            System.out.println("Delivery");
            stock_dinein = "";
            stock_takeout = "";
        } else if (e.getSource().equals(Takeout)) {
            stock_takeout = "For Take-out";
//            System.out.println("Takeout");
            stock_dinein = "";
            stock_delivery = "";
        } else if (e.getSource().equals(Disc_Students)) {
            stock_discount_student = (int) (total_cost * (5 / 100.0f));
            stock_discount_Senior = 0;
            stock_discount_PWD = 0;
            stock_disc_student = String.valueOf(stock_discount_student) + "(Student)";
//            System.out.println(String.valueOf(stock_discount_student) + "(Student)");
            stock_disc_Senior = "";
            stock_disc_PWD = "";
            total_stock_a = (int) (total_cost * (5 / 100.0f));
        } else if (e.getSource().equals(Disc_SeniorCitizen)) {
            stock_discount_Senior = (int) (total_cost * (12 / 100.0f));
            stock_discount_student = 0;
            stock_discount_PWD = 0;
            stock_disc_Senior = String.valueOf(stock_discount_Senior) + "(Senior)";
//            System.out.println(String.valueOf(stock_discount_Senior) + "Senior");
            stock_disc_student = "";
            stock_disc_PWD = "";
            total_stock_b = (int) (total_cost * (12 / 100.0f));
        } else if (e.getSource().equals(Disc_PWD)) {
            stock_discount_PWD = (int) (total_cost * (12 / 100.0f));
            stock_discount_Senior = 0;
            stock_discount_student = 0;
            stock_disc_PWD = String.valueOf(stock_discount_PWD) + "(PWD)";
//            System.out.println(String.valueOf(stock_discount_PWD) + "(PWD)");
            stock_disc_student = "";
            stock_disc_Senior = "";
            total_stock_c = (int) (total_cost * (12 / 100.0f));
        } else if (e.getSource().equals(AmountInput)) {
            stock_amount_input = Double.parseDouble(AmountInput.getText());
            stock_amount_input = stock_TOTAL - stock_amount_input;
        } else if (e.getSource().equals(NewTransaction)) {
            Receipt.setText("");
            quantity_GardenParty = 0;
            quantity_FashionedMeatBall = 0;
            quantity_Cock_A_Doodle_Bacon = 0;
            quantity_Hot_Twisted = 0;
            quantity_Pretzel_Piggy = 0;
            quantity_Seven_Alarm_Fire = 0;
            quantity_Creamy_Cheesy_Avocado = 0;
            quantity_Creamy_Cheesy_Oreo = 0;
            quantity_Creamy_Okinawa = 0;
            quantity_Strawberry_CheeseCake = 0;
            total_cost = 0;
            stock_1 = "";
            stock_2 = "";
            stock_3 = "";
            stock_4 = "";
            stock_5 = "";
            stock_6 = "";
            stock_7 = "";
            stock_8 = "";
            stock_9 = "";
            stock_10 = "";
            stock_TOTAL = 0;
            stock_amount_input = 0;
            total_display.setText("TOTAL");
            AmountInput.setText("Amount Input");
            Time_Date.setText("Time & Date");
            Transacted_by.setText("Transacted by:");

        } else if (e.getSource().equals(Enter)) {
            stock_amount_input = Double.parseDouble(AmountInput.getText());
            stock_amount_input = stock_amount_input - stock_TOTAL;

            stock_TOTAL = total_cost + (int) (total_cost * (10 / 100.0f)) - total_stock_a - total_stock_b - total_stock_c;
            Receipt.setText("                              Mang Grup5 \n"
                    + "                             Group 5 Street \n"
                    + "QTY     ITEM                    PRICE          AMOUNT\n"
                    + stock_1 + stock_2 + stock_3 + stock_4 + stock_5 + stock_6 + stock_7 + stock_8 + stock_9 + stock_10
                    + "Subtotal:                         " + total_cost + "\n"
                    + "VAT:                                 " + (int) (total_cost * (10 / 100.0f)) + "\n"
                    + "Discounts:                        " + stock_disc_student + stock_disc_Senior + stock_disc_PWD + "\n"
                    + stock_dinein + stock_delivery + stock_takeout + "\n"
                    + "Total:                                 " + stock_TOTAL + "\n"
                    + "Amount Received:          " + AmountInput.getText() + "\n"
                    + "CHANGE:                         " + stock_amount_input + "\n"
                    + "Time and Date:                " + Time_Date.getText() + "\n"
                    + "Transacted by:                " + Transacted_by.getText());
        }
    }

    public static void main(String[] args) {
        Main group5 = new Main();
        ;

    }
}
