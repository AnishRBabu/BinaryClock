package binary.clock;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;
public class window implements ActionListener {
    JPanel mainPanel = new JPanel(new GridLayout(2,1));
    JButton increaseButton = new JButton("Press to increase time");
    JFrame window = new JFrame("Binary clock");
    JPanel south = new JPanel(new GridLayout(1,6));
    //JPanel right = new JPanel(new GridLayout(4,2));
    JPanel rightRight = new JPanel (new GridLayout(4,1));
    JPanel rightLeft = new JPanel (new GridLayout(3,1));
    //JPanel center = new JPanel(new GridLayout(4,2));
    JPanel centerRight = new JPanel(new GridLayout(4,1));
    JPanel centerLeft = new JPanel (new GridLayout (3,1));
    //JPanel left = new JPanel (new GridLayout(4,2));
    JPanel leftRight = new JPanel (new GridLayout(4,1));
    JPanel leftLeft = new JPanel (new GridLayout(3,1));
    
    JLabel sec1Label = new JLabel();
   
    int secr1 = 0;
    int secr2 = 0;
    int secr3 = 0;
    int secr4 = 0;
    int secl1 = 0;
    int secl2 = 0;
    int secl3 = 0;
    
    JPanel sec1 = new JPanel();
    JPanel sec2 = new JPanel();
    JPanel sec3 = new JPanel();
    JPanel sec4 = new JPanel();
    
    JPanel sec5 = new JPanel();
    JPanel sec6 = new JPanel();
    JPanel sec7 = new JPanel();
    
    int minr1 = 0;
    int minr2 = 0;
    int minr3 =0;
    int minr4 = 0;
    int minl1 = 0;
    int minl2 = 0;
    int minl3 = 0;
    JPanel min1 = new JPanel();
	JPanel min2 = new JPanel();
	JPanel min3 = new JPanel();
	JPanel min4 = new JPanel();

	JPanel min5 = new JPanel();
	JPanel min6 = new JPanel();
	JPanel min7 = new JPanel();
    
    int hourr1 = 0;
    int hourr2 = 0;
    int hourr3 = 0;
    int hourr4 = 0;
    int hourl1 = 0;
    int hourl2 = 0;
    int hourl3 = 0;
    JPanel hour1 = new JPanel();
	JPanel hour2 = new JPanel();
	JPanel hour3 = new JPanel();
	JPanel hour4 = new JPanel();

	JPanel hour5 = new JPanel();
	JPanel hour6 = new JPanel();
	JPanel hour7 = new JPanel();
    
    Timer timer = new Timer(1000, this);
    int seconds = 50, minutes = 27, hours = 2;
    
    public window() {
        mainPanel.add(increaseButton);
        //increaseButton.addActionListener(this);
        mainPanel.add(south);
        south.add(leftLeft);
        south.add(leftRight);
        south.add(centerLeft);
        south.add(centerRight);
        south.add(rightLeft);
        south.add(rightRight);

        //right.setBackground(Color.BLUE);
        //center.setBackground(Color.GREEN);
        //left.setBackground(Color.RED);
        //right.add(rightRight, BorderLayout.EAST);
        //right.add(rightLeft, BorderLayout.WEST);
        //left.add(leftRight, BorderLayout.WEST);
        //left.add(leftLeft, BorderLayout.EAST);
        //center.add(centerRight, BorderLayout.WEST);
        //center.add(centerLeft, BorderLayout.EAST);
        
        rightRight.add(sec1);
        rightRight.add(sec2);
        rightRight.add(sec3);
        rightRight.add(sec4);
        rightLeft.add(sec5);
        rightLeft.add(sec6);
        rightLeft.add(sec7);
        centerRight.add(min1);
        centerRight.add(min2);
        centerRight.add(min3);
        centerRight.add(min4);
        centerLeft.add(min5);
        centerLeft.add(min6);
        centerLeft.add(min7);
        leftRight.add(hour1);
        leftRight.add(hour2);
        leftRight.add(hour3);
        leftRight.add(hour4);
        leftLeft.add(hour5);
        leftLeft.add(hour6);
        leftLeft.add(hour7);
        window.add(mainPanel);
        window.setSize(500,500); 
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        timer.start();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	
    		/*sec4.setText("" + secr4);
    		sec3.setText("" + secr3);
    		sec2.setText("" + secr2);
    		sec1.setText("" + secr1);
    		sec7.setText("" + secl1);
    		sec6.setText("" + secl2);
    		sec5.setText("" + secl3);*/
    		/*min1.setText("" + minr1);
    		min4.setText("" + minr4);
    		min3.setText("" + minr3);
    		min2.setText("" + minr2);
    		min7.setText("" + minl1);
    		min6.setText("" + minl2);
    		min5.setText("" + minl3);*/
    		/*hour4.setText("" + hourr4);
    		hour3.setText("" + hourr3);
    		hour2.setText("" + hourr2);
    		hour1.setText("" + hourr1);
    		hour7.setText("" + hourl1);
    		hour6.setText("" + hourl2);
    		hour5.setText("" + hourl3);*/
    		secr4++;
    		
    	    if (secr4 == 2) {
    	    	secr4 =0;
    	    	secr3++;
    	    	sec3.setBackground(Color.YELLOW);
    	    	sec4.setBackground(Color.WHITE);
    	    	}
    	    	
    	    if (secr3 == 2) {
    	    	secr3 = 0;
    	    	secr2++;
    	    	sec2.setBackground(Color.YELLOW);
    	    	sec3.setBackground(Color.WHITE);
    	    }
    	    
    	    if (secr2 == 2) {
    	    	secr2 = 0;
    	    	secr1++;
    	    	sec1.setBackground(Color.YELLOW);
    	    	sec2.setBackground(Color.WHITE);
    	    }
    	    
    	    if(secr1 == 2) {
    	    	secr1 = 0;
    	    	sec1.setBackground(Color.WHITE);
    	    }
    	    
    	    if (secr3 == 1 && secr1 == 1) {
    	    	secr4 =0;
    	    	sec4.setBackground(Color.WHITE);
    	    	secr3=0;
				sec3.setBackground(Color.WHITE);
    	    	secr2=0;
				sec2.setBackground(Color.WHITE);
    	    	secr1=0;
				sec1.setBackground(Color.WHITE);
    	    	secl1++;
    	    	sec7.setBackground(Color.YELLOW);
    	    }
    	    
    	    if (secl1 == 2) {
    	    	secl1 = 0;
				sec7.setBackground(Color.WHITE);
    	    	secl2++;
				sec6.setBackground(Color.YELLOW);
    	    }
    	    
    	    if (secl2 == 2) {
    	    	secl2 =0;
    	    	sec6.setBackground(Color.WHITE);
    	    	secl3++;
				sec5.setBackground(Color.YELLOW);
    	    }
    	    
    	    if(secl2 == 1 && secl3 == 1) {
    	    	secl1 = 0;
				sec7.setBackground(Color.WHITE);
    	    	secl3 = 0;
				sec6.setBackground(Color.WHITE);
    	    	secl2 = 0;
				sec5.setBackground(Color.WHITE);
    	    	minr4++;
    	    	min4.setBackground(Color.YELLOW);
    	    }
    	    
    	    if(minr4 == 2) {
    	    	minr4 = 0;
				min4.setBackground(Color.WHITE);
    	    	minr3++;
				min3.setBackground(Color.YELLOW);
    	    }
    	    
    	    if(minr3 == 2) {
    	    	minr3 =0;
				min3.setBackground(Color.WHITE);
    	    	minr2++;
				min2.setBackground(Color.YELLOW);
    	    }
    	    
    	    if(minr2 == 2) {
    	    	minr2 =0;
				min2.setBackground(Color.WHITE);
    	    	minr1++;
				min1.setBackground(Color.YELLOW);
    	    }
    	    
    	    if(minr1 == 2) {
    	    	minr1=0;
				min1.setBackground(Color.WHITE);
    	    }
    	    
    	    if(minr3 == 1 && minr1 == 1) {
    	    	minr4 = 0;
				min4.setBackground(Color.WHITE);
    	    	minr3 = 0;
				min3.setBackground(Color.WHITE);
    	    	minr2 = 0;
				min2.setBackground(Color.WHITE);
    	    	minr1 = 0;
				min1.setBackground(Color.WHITE);
    	    	minl1++;
				min7.setBackground(Color.YELLOW);
    	    }
    	    
    	    if (minl1 == 2) {
    	    	minl1 = 0;
				min7.setBackground(Color.WHITE);
    	    	minl2++;
				min6.setBackground(Color.YELLOW);
    	    }
    	    
    	    if (minl2 == 2) {
    	    	minl2 =0;
				min6.setBackground(Color.WHITE);
    	    	minl3++;
				min5.setBackground(Color.YELLOW);
    	    }
    	    
    	    if(minl2 == 1 && minl3 == 1) {
    	    	minl1 = 0;
				min7.setBackground(Color.WHITE);
    	    	minl3 = 0;
				min6.setBackground(Color.WHITE);
    	    	minl2 = 0;
				min5.setBackground(Color.WHITE);
    	    	hourr4++;
    	    	hour4.setBackground(Color.YELLOW);
    	    }
    	    
    	    if(hourr4 == 2) {
    	    	hourr4 = 0;
				hour4.setBackground(Color.WHITE);
    	    	hourr3++;
				hour3.setBackground(Color.YELLOW);
    	    }
    	    
    	    if(hourr3 == 2) {
    	    	hourr3 =0;
				hour4.setBackground(Color.WHITE);
    	    	hourr2++;
				hour2.setBackground(Color.YELLOW);
    	    }
    	    
    	    if(hourr2 == 2) {
    	    	hourr2 =0;
				hour4.setBackground(Color.WHITE);
    	    	hourr1++;
				hour1.setBackground(Color.YELLOW);
    	    }
    	    
    	    if(hourr1 == 2) {
    	    	hourr1=0;
				hour1.setBackground(Color.WHITE);
    	    }
    	    
    	    if(hourr3 == 1 && hourr1 == 1) {
    	    	hourr4 = 0;
				hour4.setBackground(Color.WHITE);
    	    	hourr3 = 0;
				hour3.setBackground(Color.WHITE);
    	    	hourr2 = 0;
				hour2.setBackground(Color.WHITE);
    	    	hourr1 = 0;
				hour1.setBackground(Color.WHITE);
    	    	hourl1++;
				hour7.setBackground(Color.YELLOW);
    	    }
    	    
    	    if (hourl1 == 2) {
    	    	hourl1 = 0;
				hour7.setBackground(Color.WHITE);
    	    	hourl2++;
				hour6.setBackground(Color.YELLOW);
    	    }
    	    
    	    if (hourl2 == 2) {
    	    	hourl2 =0;
				hour6.setBackground(Color.WHITE);
    	    	hourl3++;
				hour5.setBackground(Color.YELLOW);
    	    }
    	    
    	    if(hourr2 == 1 && hourl2 == 1) {
    	    	hourl1 = 0;
				hour7.setBackground(Color.WHITE);
    	    	hourl3 = 0;
				hour5.setBackground(Color.WHITE);
    	    	hourl2 = 0;
				hour6.setBackground(Color.WHITE);
    	    	hourr4 = 0;
				hour4.setBackground(Color.WHITE);
    	    	hourr3 = 0;
				hour3.setBackground(Color.WHITE);
    	    	hourr2 = 0;
				hour2.setBackground(Color.WHITE);
    	    	hourr1 = 0;
				hour1.setBackground(Color.WHITE);
    	    	minr4 = 0;
				min4.setBackground(Color.WHITE);
    	    	minr3 = 0;
				min3.setBackground(Color.WHITE);
    	    	minr2 = 0;
				min2.setBackground(Color.WHITE);
    	    	minr1 = 0;
				min1.setBackground(Color.WHITE);
    	    	minl1 = 0;
				min7.setBackground(Color.WHITE);
    	    	minl2 = 0;
				min6.setBackground(Color.WHITE);
    	    	minl3 = 0;
				min5.setBackground(Color.WHITE);
    	    	secr4 = 0;
    	    	sec4.setBackground(Color.WHITE);
    	    	secr3 = 0;
				sec3.setBackground(Color.WHITE);
    	    	secr2 = 0;
				sec2.setBackground(Color.WHITE);
    	    	secr1 = 0;
				sec1.setBackground(Color.WHITE);
    	    	secl1 = 0;
				sec7.setBackground(Color.WHITE);
    	    	secl2 = 0;
				sec6.setBackground(Color.WHITE);
    	    	secl3 = 0;
				sec5.setBackground(Color.WHITE);
    	    }
    	
    	

    	    
    	    
    	      
    	
    
    
    
}
}
