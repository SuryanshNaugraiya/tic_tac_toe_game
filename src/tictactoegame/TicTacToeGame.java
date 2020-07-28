package tictactoegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGame implements ActionListener {      //implement kraya ActionListener interface ko

    JFrame jf;  //declare frame
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;    //declare buttons
    int count=0;    //it will count the no. of click
    String s;   //it will store "x" or "o"
    boolean win = false;    // if win condition will match it will store true
    Color color;    //color variable declare

    TicTacToeGame(){        //constructor created

        jf=new JFrame("TIC TAC TOE GAME");      //frame craeted
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);      //so that on clicking cross button code stops to run
        jf.setSize(500,500);    //to set the size
        jf.setLocationRelativeTo(null);     //to open the frame in center of screen
        jf.setLayout(new GridLayout(3,3));      //so that automatically grid layout bn jae

        jb1 = new JButton();    //button created
        jf.add(jb1);    //button ko add kiya frame pr
        jb1.addActionListener(this);    //action listener lagaya so that on clicking the button wo sun le

        jb2 = new JButton();
        jf.add(jb2);
        jb2.addActionListener(this);    //this keyword is used to pass as an argument to the current class

        jb3 = new JButton();
        jf.add(jb3);
        jb3.addActionListener(this);

        jb4 = new JButton();
        jf.add(jb4);
        jb4.addActionListener(this);

        jb5 = new JButton();
        jf.add(jb5);
        jb5.addActionListener(this);

        jb6 = new JButton();
        jf.add(jb6);
        jb6.addActionListener(this);

        jb7 = new JButton();
        jf.add(jb7);
        jb7.addActionListener(this);

        jb8 = new JButton();
        jf.add(jb8);
        jb8.addActionListener(this);

        jb9 = new JButton();
        jf.add(jb9);
        jb9.addActionListener(this);

        jf.setVisible(true);    //to see the frame
    }

    public static void main(String[] args) {
        new TicTacToeGame();    //object created
    }

    @Override
    public void actionPerformed(ActionEvent e) {            //isko override krna padega , compulsory hai

            Font font = new Font("arial",1,100);    //"x" , "o" ka size bda krne ke liye font lagaya

            count++;        //click ko count karega
            if (count % 2 == 0) {       //to check whether the click is odd or even
                s = "X";                //jb click even hoga to "x" print hoga
                color = Color.black ;   //button pr black color aayega
            } else {
                s = "O";
                color = Color.blue ;
            }

            if (e.getSource() == jb1) {     //jb jb1 pr click hoga to ye chalega
                jb1.setText(s);             //on even click it sets "x" and on odd cick it sets "o"
                jb1.setBackground(color);   //button pr color set krne ke liye
                jb1.setFont(font);          //to set font of "x" and "o"
                jb1.setEnabled(false);      //ek baar click krne ke baad dobara us button pr click nhi hoga
            }
            if (e.getSource() == jb2) {
                jb2.setText(s);
                jb2.setBackground(color);
                jb2.setFont(font);
                jb2.setEnabled(false);
            }
            if (e.getSource() == jb3) {
                jb3.setText(s);
                jb3.setBackground(color);
                jb3.setFont(font);
                jb3.setEnabled(false);
            }
            if (e.getSource() == jb4) {
                jb4.setText(s);
                jb4.setBackground(color);
                jb4.setFont(font);
                jb4.setEnabled(false);
            }
            if (e.getSource() == jb5) {
                jb5.setText(s);
                jb5.setBackground(color);
                jb5.setFont(font);
                jb5.setEnabled(false);
            }
            if (e.getSource() == jb6) {
                jb6.setText(s);
                jb6.setBackground(color);
                jb6.setFont(font);
                jb6.setEnabled(false);
            }
            if (e.getSource() == jb7) {
                jb7.setText(s);
                jb7.setBackground(color);
                jb7.setFont(font);
                jb7.setEnabled(false);
            }
            if (e.getSource() == jb8) {
                jb8.setText(s);
                jb8.setBackground(color);
                jb8.setFont(font);
                jb8.setEnabled(false);
            }
            if (e.getSource() == jb9) {
                jb9.setText(s);
                jb9.setBackground(color);
                jb9.setFont(font);
                jb9.setEnabled(false);
            }

            winPossibilities();//NOTE: u have to use object to call method once but after that u can call other methods through 1st method without using objects.
    }

    void winPossibilities(){        //this method is made to check the winning possibility

        //rows possibilities
        if(jb1.getText()==jb2.getText() && jb2.getText()==jb3.getText() && jb1.getText() !=""){
            win=true;

        }
        else if(jb4.getText()==jb5.getText() && jb5.getText()==jb6.getText() && jb4.getText() !=""){
            win=true;

        }
        else if(jb7.getText()==jb8.getText() && jb8.getText()==jb9.getText() && jb7.getText() !=""){
            win=true;

        }

        //column possibilities
        else if(jb1.getText()==jb4.getText() && jb4.getText()==jb7.getText() && jb1.getText() !=""){
            win=true;

        }
        else if(jb2.getText()==jb5.getText() && jb5.getText()==jb8.getText() && jb2.getText() !=""){
            win=true;

        }
        else if(jb3.getText()==jb6.getText() && jb6.getText()==jb9.getText() && jb3.getText() !=""){
            win=true;

        }

        //diagonal possibilities
        else if(jb1.getText()==jb5.getText() && jb5.getText()==jb9.getText() && jb1.getText() !=""){
            win=true;

        }
        else if(jb3.getText()==jb5.getText() && jb5.getText()==jb7.getText() && jb3.getText() !=""){
            win=true;

        }

        //
        else{
            win=false;
        }

        whoWins();
    }

    void whoWins(){     //this method is made to find who won the game

        if(win == true){
            JOptionPane.showMessageDialog(jf,s+" WINS");//dialog box fire karega
            restartGame();
        }
        else if (win == false && count==9){
            JOptionPane.showMessageDialog(jf,"MATCH DRAW");
            restartGame();
        }
    }

    void restartGame() {        //this method is made to restart the game

        int i =JOptionPane.showConfirmDialog(jf,"DO you want to play game again");  //confirmDialogBox mehod returns int value

        if(i==0){       //0 for yes
            count=0;    //bcos count ki value 9 thi so to restart the game, set its value to 0
            s="";       //string ko bhi empty krna padega bcos usme initially "x"ya "o" hoga
            win = false;    //win ki value bhi false krni padegi
            color=null;     //put color=null otherwise on restarting the game color of the button hatega nhi

            jb1.setText("");    //saare buttons ko empty krna padega
            jb1.setBackground(color);   //unke background color ko white krna padega
            jb1.setEnabled(true);       //aur unpr dobara click kr paaye , so for that setEnable ko true krna padega

            jb2.setText("");
            jb2.setBackground(color);
            jb2.setEnabled(true);

            jb3.setText("");
            jb3.setBackground(color);
            jb3.setEnabled(true);

            jb4.setText("");
            jb4.setBackground(color);
            jb4.setEnabled(true);

            jb5.setText("");
            jb5.setBackground(color);
            jb5.setEnabled(true);

            jb6.setText("");
            jb6.setBackground(color);
            jb6.setEnabled(true);

            jb7.setText("");
            jb7.setBackground(color);
            jb7.setEnabled(true);

            jb8.setText("");
            jb8.setBackground(color);
            jb8.setEnabled(true);

            jb9.setText("");
            jb9.setBackground(color);
            jb9.setEnabled(true);
        }
        else if(i==1){      //1 for no
            System.exit(0);     //close kr dega ye function
        }
        else {      //2 for cancel

            jb1.setEnabled(false);      //if we want that on clicking cancel button, hm koi dusre button pr na click kr ske
            jb2.setEnabled(false);
            jb3.setEnabled(false);
            jb4.setEnabled(false);
            jb5.setEnabled(false);
            jb6.setEnabled(false);
            jb7.setEnabled(false);
            jb8.setEnabled(false);
            jb9.setEnabled(false);

        }
    }
}
