import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class service extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25;
	   
	JButton b1,b2,b3,b4,b5;

    JPanel P1,P2,P3;



    public service()
    {
        super("service");
        this.setSize(750,520);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    // panels
       
        P1 = new JPanel();
        P1.setBounds(0,0,750,50);
        P1.setBackground(new Color(118,113,113));
        P1.setBorder(BorderFactory.createLineBorder(Color.black));
        P1.setLayout(null);

        P2 = new JPanel();
        P2.setBounds(0,40,750,50);
        P2.setBackground(new Color(219,219,219));
        P2.setBorder(BorderFactory.createLineBorder(Color.black));
        P2.setLayout(null);

        P3 = new JPanel();
        P3.setBounds(0,100,750,400);
        P3.setBackground(new Color(216,228,250));
        P3.setLayout(null);



    //panel 1 component

       l1 = new JLabel("Ticketbuzz");
       l1.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,36));
       l1.setForeground(Color.ORANGE);
       l1.setBounds(20,8,180,35);
       P1.add(l1);

       l2 = new JLabel(". . . Enjoy your journey");
       l2.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,12));
       l2.setForeground(Color.orange);
       l2.setBounds(190,27,150,15);
       P1.add(l2);


       b1 = new JButton(new ImageIcon(getClass().getResource("/Image/logo.png")));
	   b1.setBounds(685,9,36,36);
      
       b1.setBorder(null);
	   b1.addActionListener(this);
       b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P1.add(b1);   

   
     

    //panel 2 component

       b2 = new JButton("Home");
	   b2.setFont(new Font("Serif",Font.PLAIN,18));
	   b2.setForeground(Color.black);
	   b2.setBackground(new Color(219,219,219));
	   b2.setBorder(null);
	   b2.setBounds(65,18,60,25);
	   b2.addActionListener(this);
	   b2.setFocusable(false);
       b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(b2);



       b3 = new JButton("Service");
	   b3.setFont(new Font("Serif",Font.BOLD,18));
	   b3.setForeground(Color.red);
	   b3.setBackground(new Color(209,209,209));
	   b3.setBorder(null);
	   b3.setBounds(220,10,150,38);
	   b3.addActionListener(this);
	   b3.setFocusable(false);
       b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(b3);
    


       b4 = new JButton("Ticket Price");
	   b4.setFont(new Font("Serif",Font.PLAIN,18));
	   b4.setForeground(Color.black);
	   b4.setBackground(new Color(219,219,219));
	   b4.setBorder(null);
	   b4.setBounds(405,22,100,15);
	   b4.addActionListener(this);
	   b4.setFocusable(false);
       b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(b4);



       b5 = new JButton("Location");
	   b5.setFont(new Font("Serif",Font.PLAIN,18));
	   b5.setForeground(Color.black);
	   b5.setBackground(new Color(219,219,219));
	   b5.setBorder(null);
	   b5.setBounds(600,22,80,15);
	   b5.addActionListener(this);
	   b5.setFocusable(false);
       b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(b5);






    //panel 3 component - image
       
        
       l2 = new JLabel(new ImageIcon(getClass().getResource("/Image/bus.png")));
	   l2.setBounds(20,100,130,170);
	   P3.add(l2);

       l3 = new JLabel(new ImageIcon(getClass().getResource("/Image/sea travel.png")));
	   l3.setBounds(20,295,130,170);
	   P3.add(l3);

       l4 = new JLabel(new ImageIcon(getClass().getResource("/Image/plean seat.jpeg")));
	   l4.setBounds(385,100,130,170);
	   P3.add(l4);

       l5 = new JLabel(new ImageIcon(getClass().getResource("/Image/train.png")));
	   l5.setBounds(385,295,130,170);
	   P3.add(l5);






    //panel 3 component service name

       l6 = new JLabel("Minions: The Rise of Gru");
       l6.setFont(new Font("Serif",Font.ITALIC|Font.BOLD,17));
       l6.setForeground(Color.black);
       l6.setBackground(Color.GREEN);
       l6.setBounds(170,110,200,20);
       P3.add(l6); 

       l7 = new JLabel("Avatar: The Way of Water");
       l7.setFont(new Font("Serif",Font.ITALIC|Font.BOLD,17));
       l7.setForeground(Color.black);
       l7.setBounds(170,300,200,20);
       P3.add(l7); 

       l8 = new JLabel("Thor: Love and Thunder");
       l8.setFont(new Font("Serif",Font.ITALIC|Font.BOLD,17));
       l8.setForeground(Color.black);
       l8.setBounds(540,110,200,20);
       P3.add(l8); 

       l9 = new JLabel("Jurassic World Dominion");
       l9.setFont(new Font("Serif",Font.ITALIC|Font.BOLD,17));
       l9.setForeground(Color.black);
       l9.setBounds(540,300,200,20);
       P3.add(l9); 





  
    // show time for minion

       l10 = new JLabel(" 11.00 am");
       l10.setFont(new Font("Serif",Font.BOLD,15));
       l10.setForeground(Color.black);
       l10.setOpaque(true);
       l10.setBackground(new Color(152,236,156));
       l10.setBounds(180,160,66,28);
       P3.add(l10); 


       l11 = new JLabel(" 01.00 pm");
       l11.setFont(new Font("Serif",Font.BOLD,15));
       l11.setForeground(Color.black);
       l11.setOpaque(true);
       l11.setBackground(new Color(152,236,156));
       l11.setBounds(260,160,66,28);
       P3.add(l11); 


       l12 = new JLabel(" 03.00 pm");
       l12.setFont(new Font("Serif",Font.BOLD,15));
       l12.setForeground(Color.black);
       l12.setOpaque(true);
       l12.setBackground(new Color(152,236,156));
       l12.setBounds(180,200,66,28);
       P3.add(l12); 


       l13 = new JLabel(" 06.00 pm");
       l13.setFont(new Font("Serif",Font.BOLD,15));
       l13.setForeground(Color.black);
       l13.setOpaque(true);
       l13.setBackground(new Color(152,236,156));
       l13.setBounds(260,200,66,28);
       P3.add(l13); 






    // show time for avatar

       l14 = new JLabel(" 11.00 am");
       l14.setFont(new Font("Serif",Font.BOLD,15));
       l14.setForeground(Color.black);
       l14.setOpaque(true);
       l14.setBackground(new Color(152,236,156));
       l14.setBounds(180,350,66,28);
       P3.add(l14); 


       l15 = new JLabel(" 01.00 pm");
       l15.setFont(new Font("Serif",Font.BOLD,15));
       l15.setForeground(Color.black);
       l15.setOpaque(true);
       l15.setBackground(new Color(152,236,156));
       l15.setBounds(260,350,66,28);
       P3.add(l15); 


       l16 = new JLabel(" 03.00 pm");
       l16.setFont(new Font("Serif",Font.BOLD,15));
       l16.setForeground(Color.black);
       l16.setOpaque(true);
       l16.setBackground(new Color(152,236,156));
       l16.setBounds(180,390,66,28);
       P3.add(l16); 


       l17 = new JLabel(" 06.00 pm");
       l17.setFont(new Font("Serif",Font.BOLD,15));
       l17.setForeground(Color.black);
       l17.setOpaque(true);
       l17.setBackground(new Color(152,236,156));
       l17.setBounds(260,390,66,28);
       P3.add(l17);



    



    // show time for thor

       l18 = new JLabel(" 11.00 am");
       l18.setFont(new Font("Serif",Font.BOLD,15));
       l18.setForeground(Color.black);
       l18.setOpaque(true);
       l18.setBackground(new Color(152,236,156));
       l18.setBounds(540,160,66,28);
       P3.add(l18); 


       l19 = new JLabel(" 01.00 pm");
       l19.setFont(new Font("Serif",Font.BOLD,15));
       l19.setForeground(Color.black);
       l19.setOpaque(true);
       l19.setBackground(new Color(152,236,156));
       l19.setBounds(620,160,66,28);
       P3.add(l19); 


       l20 = new JLabel(" 03.00 pm");
       l20.setFont(new Font("Serif",Font.BOLD,15));
       l20.setForeground(Color.black);
       l20.setOpaque(true);
       l20.setBackground(new Color(152,236,156));
       l20.setBounds(540,200,66,28);
       P3.add(l20); 


       l21 = new JLabel(" 06.00 pm");
       l21.setFont(new Font("Serif",Font.BOLD,15));
       l21.setForeground(Color.black);
       l21.setOpaque(true);
       l21.setBackground(new Color(152,236,156));
       l21.setBounds(620,200,66,28);
       P3.add(l21);




       

    // show time for jurasic world

       l18 = new JLabel(" 11.00 am");
       l18.setFont(new Font("Serif",Font.BOLD,15));
       l18.setForeground(Color.black);
       l18.setOpaque(true);
       l18.setBackground(new Color(152,236,156));
       l18.setBounds(540,350,66,28);
       P3.add(l18); 


       l19 = new JLabel(" 01.00 pm");
       l19.setFont(new Font("Serif",Font.BOLD,15));
       l19.setForeground(Color.black);
       l19.setOpaque(true);
       l19.setBackground(new Color(152,236,156));
       l19.setBounds(620,350,66,28);
       P3.add(l19); 


       l20 = new JLabel(" 03.00 pm");
       l20.setFont(new Font("Serif",Font.BOLD,15));
       l20.setForeground(Color.black);
       l20.setOpaque(true);
       l20.setBackground(new Color(152,236,156));
       l20.setBounds(540,390,66,28);
       P3.add(l20); 


       l21 = new JLabel(" 06.00 pm");
       l21.setFont(new Font("Serif",Font.BOLD,15));
       l21.setForeground(Color.black);
       l21.setOpaque(true);
       l21.setBackground(new Color(152,236,156));
       l21.setBounds(620,390,66,28);
       P3.add(l21);













        
        this.add(P1);
        this.add(P2);
        this.add(P3);
        setVisible(true);

    }


    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1)
		{
			userinfo u = new userinfo();
			this.setVisible(false);
		    u.setVisible(true);
		}

		else if(ae.getSource()==b2)
		{
			ticket s = new ticket();
			this.setVisible(false);
		    s.setVisible(true);
		}

        else if(ae.getSource()==b4)
		{
			ticketPrice t = new ticketPrice();
			this.setVisible(false);
		    t.setVisible(true);
		}

        else if(ae.getSource()==b5)
		{
			location l = new location();
			this.setVisible(false);
		    l.setVisible(true);
		}

    }

    public static void main(String [] args)
	{
		showtime s = new showtime();
		
	}

}
