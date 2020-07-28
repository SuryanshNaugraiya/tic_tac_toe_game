package tictactoegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyTicTacToeGame implements ActionListener {

    JButton jb,jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
    JFrame jf;
    JLabel jl1,jl2;
    JTextField jt1 ,jt2;
    int count=0;    //it will count the no. of click
    String s;   //it will store "x" or "o"
    String player_who_wins;
    boolean win = false;    // if win condition will match it will store true
    Color color;    //color variable declare
    Font font1 , font2; // we need font2 for JButtons , font1 for JLable
    int b = 0;

    MyTicTacToeGame(){

        font1 = new Font("arial",1,20);

        jf = new JFrame("Tic Tac Toe Game");//frame created
        jf.setSize(615,825);//size set
        jf.setLocationRelativeTo(null);//so that window ke center mai khule frame
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);//so that on clicking on close button of frame code stops to run
        jf.setLayout(null);//so that hm apne according buttons, labels , text feilds ko set kr ske
        jf.setResizable(false);//to disable maximize button

        jl1 = new JLabel();
        jl1.setBounds(50,6,100,70);
        jl1.setText("Player_1 :");
        jl1.setFont(font1);
        jf.add(jl1);

        jl2 = new JLabel();
        jl2.setBounds(50,66,100,70);
        jl2.setText("Player_2 :");
        jl2.setFont(font1);
        jf.add(jl2);
        
        jt1 = new JTextField();
        jt1.setBounds(180,20,350,40);
        jf.add(jt1);
        
        jt2 = new JTextField();
        jt2.setBounds(180,80,350,40);
        jf.add(jt2);

        jb = new JButton();
        jb.setBounds(250,140,100,40);
        jb.setText("START");
        jb.setFont(font1);
        jb.addActionListener(this);
        jf.add(jb);


        jb1 = new JButton();    //button created
        jb1.setBounds(0,200,200,200);//bound set kiya
        jf.add(jb1);    //button ko add kiya frame pr
        jb1.addActionListener(this);    //action listener lagaya so that on clicking the button wo sun le

        jb2 = new JButton();
        jb2.setBounds(200,200,200,200);
        jf.add(jb2);
        jb2.addActionListener(this);    //this keyword is used to pass as an argument to the current class

        jb3 = new JButton();
        jb3.setBounds(400,200,200,200);
        jf.add(jb3);
        jb3.addActionListener(this);

        jb4 = new JButton();
        jb4.setBounds(0,400,200,200);
        jf.add(jb4);
        jb4.addActionListener(this);

        jb5 = new JButton();
        jb5.setBounds(200,400,200,200);
        jf.add(jb5);
        jb5.addActionListener(this);

        jb6 = new JButton();
        jb6.setBounds(400,400,200,200);
        jf.add(jb6);
        jb6.addActionListener(this);

        jb7 = new JButton();
        jb7.setBounds(0,600,200,200);
        jf.add(jb7);
        jb7.addActionListener(this);

        jb8 = new JButton();
        jb8.setBounds(200,600,200,200);
        jf.add(jb8);
        jb8.addActionListener(this);

        jb9 = new JButton();
        jb9.setBounds(400,600,200,200);
        jf.add(jb9);
        jb9.addActionListener(this);

        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new MyTicTacToeGame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        font2 = new Font("arial",1,100);    //"x" , "o" ka size bda krne ke liye font lagaya

        count++;        //click ko count karega
        if (count % 2 == 0) {       //to check whether the click is odd or even
            s = "X";                //jb click even hoga to "x" print hoga
            color = Color.black ;   //button pr black color aayega
            player_who_wins = jt2.getText(); //so that jiska click ka chance hoga uska naaam store ho jae
        } else {
            s = "O";
            color = Color.blue ;
            player_who_wins = jt1.getText();
        }


        if(e.getSource()==jb) {
            if (jt1.getText().equals("") && jt2.getText().equals("")) {
                JOptionPane.showMessageDialog(jf, "Please enter players name");
            }
            else if (jt1.getText().equals("") || jt2.getText().equals("")) {
                JOptionPane.showMessageDialog(jf, "Please enter another player's name");
            }
            else if (jt1.getText().equals(jt2.getText())) {
                JOptionPane.showMessageDialog(jf, "Please enter different player's name");
            }
            else {
                jb.setEnabled(false);       //so that agar sb shi hua to start button pr click nhi hoga
                jt1.setEnabled(false);      //so that agar sb shi hua to text feild pr click nhi hoga
                jt2.setEnabled(false);
                count=0;    //bcos ab click counts hona shuru hogi iske baad
                b = 1;      //it requires to check the condition
            }
        }
        else if (e.getSource() == jb1 && b==1 ) {     //jb jb1 pr click hoga to ye chalega
            jb1.setText(s);             //on even click it sets "x" and on odd cick it sets "o"
            jb1.setBackground(color);   //button pr color set krne ke liye
            jb1.setFont(font2);          //to set font of "x" and "o"
            jb1.setEnabled(false);      //ek baar click krne ke baad dobara us button pr click nhi hoga
        }
        else if (e.getSource() == jb2 && b==1) {
            jb2.setText(s);
            jb2.setBackground(color);
            jb2.setFont(font2);
            jb2.setEnabled(false);
        }
        else if (e.getSource() == jb3 && b==1) {
            jb3.setText(s);
            jb3.setBackground(color);
            jb3.setFont(font2);
            jb3.setEnabled(false);
        }
        else if (e.getSource() == jb4 && b==1) {
            jb4.setText(s);
            jb4.setBackground(color);
            jb4.setFont(font2);
            jb4.setEnabled(false);
        }
        else if (e.getSource() == jb5 && b==1) {
            jb5.setText(s);
            jb5.setBackground(color);
            jb5.setFont(font2);
            jb5.setEnabled(false);
        }
        else if (e.getSource() == jb6 && b==1) {
            jb6.setText(s);
            jb6.setBackground(color);
            jb6.setFont(font2);
            jb6.setEnabled(false);
        }
        else if (e.getSource() == jb7 && b==1) {
            jb7.setText(s);
            jb7.setBackground(color);
            jb7.setFont(font2);
            jb7.setEnabled(false);
        }
        else if (e.getSource() == jb8 && b==1) {
            jb8.setText(s);
            jb8.setBackground(color);
            jb8.setFont(font2);
            jb8.setEnabled(false);
        }
        else if (e.getSource() == jb9 && b==1) {
            jb9.setText(s);
            jb9.setBackground(color);
            jb9.setFont(font2);
            jb9.setEnabled(false);
        }
        else {
            JOptionPane.showMessageDialog(jf,"Click on start");
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
            JOptionPane.showMessageDialog(jf,player_who_wins+" WINS");//dialog box fire karega
            restartGame();
        }
        else if (win == false && count==9){
            JOptionPane.showMessageDialog(jf,"MATCH DRAW");
            restartGame();
        }
    }

    void restartGame(){

        int i =JOptionPane.showConfirmDialog(jf,"DO you want to play game again");  //confirmDialogBox mehod returns int value

        if(i==0){       //0 for yes
            count=0;    //bcos count ki value 9 thi so to restart the game, set its value to 0
            s="";       //string ko bhi empty krna padega bcos usme initially "x"ya "o" hoga
            win = false;    //win ki value bhi false krni padegi
            color=null;     //put color=null otherwise on restarting the game color of the button hatega nhi
            b=0;        //
            player_who_wins = "";       //so that nya player jo jeete uska naam aaye

            jt1.setEnabled(true);       //so that we can click on that again
            jt1.setText("");        //so that we can enter some text

            jt2.setEnabled(true);
            jt2.setText("");

            jb.setEnabled(true);

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

            jt1.setEnabled(false);
            jt2.setEnabled(false);
            jb.setEnabled(false);
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
