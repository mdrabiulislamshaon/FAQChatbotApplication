/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author md rabiul islam shaon
 * @email mdrabiulislamshaonn@gmail.com
 */

package FAQPackage;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleFAQChatbotApplication extends JFrame implements KeyListener {

    // Components for the GUI
    JPanel p = new JPanel();
    JTextArea dialog = new JTextArea(20, 50);
    JTextArea input = new JTextArea(2, 50);
    JScrollPane scroll = new JScrollPane(
            dialog,
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
    );

    // Array to store chat bot responses
    String[][] chatBot = {
        {"hi", "Hi", "hI", "HI"},
        {"Hello"},
        {"HELLO", "hello", "Hello"},
        {"Hi"},
        {"Hey", "hey", "HEY"},
        {"Whats Up?"},
        {"Hey! Whats up?", "Whats up?", "Whats up", "whats up", "hey whats up?", "hey whats up"},
        {"Good"},
        {"How to sign up for Netflix", "sign up", "Sign Up", "SIGNUP", "signup", "SignUp"},
        {"Visit netflix.com/signup."},
        {"What is Netflix?", "Netflix", "netflix", "NETFLIX", "NetFlix"},
        {"Netflix is a subscription-based streaming service "},
        {"Plans and Pricing", "Pricing", "Plans", "plan", "price", "PRICING", "planes", "pricing"},
        {"Visit netflix.com/signup."},
        {"How to change your Netflix password", "password", "Netflix password", "change password", "CHANGE PASSWORD"},
        {"\n1.Visit netflix.com/loginhelp.\n2.Select Email.\n3.Enter your email address and select Email Me."},
        {"How to restart your Netflix account", "restart your Netflix account", "Netflix account", "ACCOUNT", "netflixaccount", "Account"},
        {"Add streaming plan > Restart Your Membership"},
        {"netflix address", "Netflix Address", "NETFLIX ADDRESS"},
        {"Mohammadbag, Dhaka-1362"},
        {"Netflix Contact", "contact", "CONTACT", "number", "NETFLIX CONTACT", "netflix contact", "netflix number", "email", "netflix email", "EMAIL", ""},
        {"G-mail: mdrabiulislamshaonn@gmail.com Mobile: 0130075****"},
        {"how are you", "how r you", "how r u", "how are u"},
        {"Good", "Well"},
        {"yes"},
        {"NO"},
        {"No", "no", "nO"},
        {"Yes"},
        {"ok", "OK", "Ok", "oK"},
        {"Thank You, Sir"},
        {"Please Wait for reply all are busy now", "(faqBot is unavailable, due to unwanted Erorr)"}
    };

    // Constructor
    public SimpleFAQChatbotApplication() {
        super("FAQ Bot");
        setSize(580, 410);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        dialog.setEditable(false);
        input.addKeyListener(this);

        p.add(scroll);
        p.add(input);
        p.setBackground(new Color(25, 20, 0));
        add(p);

        setVisible(true);
    }

    // Method to handle user input
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            input.setEditable(false);

            String quote = input.getText();
            input.setText("");
            addText("-->You:\t" + quote);
            quote.trim();
            while (quote.charAt(quote.length() - 1) == '!'
                    || quote.charAt(quote.length() - 1) == '.'
                    || quote.charAt(quote.length() - 1) == '?') {
                quote = quote.substring(0, quote.length() - 1);
            }
            quote.trim();
            byte response = 0;

            int j = 0;
            while (response == 0) {
                if (inArray(quote.toLowerCase(), chatBot[j * 2])) {
                    response = 2;
                    int r = (int) Math.floor(Math.random() * chatBot[(j * 2) + 1].length);
                    addText("\n-->faqBot:\t" + chatBot[(j * 2) + 1][r]);
                }
                j++;
                if (j * 2 == chatBot.length - 1 && response == 0) {
                    response = 1;
                }
            }

            //-----default--------------
            if (response == 1) {
                int r = (int) Math.floor(Math.random() * chatBot[chatBot.length - 1].length);
                addText("\n-->faqBot:\t" + chatBot[chatBot.length - 1][r]);
            }
            addText("\n");
        }
    }

    // Method to handle key release event
    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            input.setEditable(true);
        }
    }

    // Method to handle key typed event
    @Override
    public void keyTyped(KeyEvent e) {}

    // Method to add text to the dialog
    public void addText(String str) {
        dialog.setText(dialog.getText() + str);
    }

    // Method to check if a string is in an array
    public boolean inArray(String in, String[] str) {
        boolean match = false;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(in)) {
                match = true;
            }
        }
        return match;
    }

    // Main method to create an instance of the SimpleFAQChatbotApplication class
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SimpleFAQChatbotApplication();
        });
    }
}