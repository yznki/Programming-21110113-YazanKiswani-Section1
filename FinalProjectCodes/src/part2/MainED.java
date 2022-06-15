package part2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainED {

	static int burgerCount = 0, hotdogCount = 0, friesCount = 0, pepsiCount = 0, sevenUpCount = 0;
	static double price = 0;
	
	public static void main(String[] args) {
		
		//System.out.println(new java.io.File("burger.png").exists());
		//System.out.println(new java.io.File("hot-dog.png").exists());
		//System.out.println(new java.io.File("burger.png").exists());
		
		// Frame
		
		JFrame menuFrame = new JFrame();
		
		// Icons
		
		ImageIcon burgerIcon = new ImageIcon("burger.png");
		ImageIcon hotdogIcon = new ImageIcon("hot-dog.png");
		ImageIcon friesIcon = new ImageIcon("fried-potatoes.png");
		ImageIcon pepsiIcon = new ImageIcon("pepsi.png");
		ImageIcon sevenupIcon = new ImageIcon("7up.png");
		
		// Labels
		
		JLabel title = new JLabel("Yazan's Burger & Hotdog Shop");
		JLabel chooseOrder = new JLabel("What would you like to have today?");
		JLabel burger = new JLabel("Burger - 3 JDs");
		JLabel hotdog = new JLabel("Hotdog - 2 JDs");
		JLabel fries = new JLabel("Fries - 0.5 JDs");
		JLabel pepsi = new JLabel("Pepsi - 0.3 JDs");
		JLabel sevenup = new JLabel("7up - 0.3 JDs");
		
		JLabel numBurgers = new JLabel(String.valueOf(burgerCount));
		JLabel numHotdogs = new JLabel(String.valueOf(hotdogCount));
		JLabel numFries = new JLabel(String.valueOf(friesCount));
		JLabel numPepsi = new JLabel(String.valueOf(pepsiCount));
		JLabel num7up = new JLabel(String.valueOf(sevenUpCount));
		
		JLabel confirmText = new JLabel("Do you want to confirm your order?");
		JLabel totalOrder = new JLabel("Your total order is : ");
		
		// Frame Options
		
		menuFrame.setSize(500, 550);
		menuFrame.setVisible(true);
		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuFrame.setLayout(null);
		menuFrame.setResizable(false);
		
		// Buttons
		
			// We made a class for the plus and minus buttons to make it easier and cleaner to declare them.
		
		PlusButton burgerPlus = new PlusButton(320,95);
		PlusButton hotdogPlus = new PlusButton(320,145);
		PlusButton friesPlus = new PlusButton(320,195);
		PlusButton pepsiPlus = new PlusButton(320,245);
		PlusButton sevenUpPlus = new PlusButton(320,295);
		MinusButton burgerMinus = new MinusButton(420,95);
		MinusButton hotdogMinus = new MinusButton(420,145);
		MinusButton friesMinus = new MinusButton(420,195);
		MinusButton pepsiMinus = new MinusButton(420,245);
		MinusButton sevenUpMinus = new MinusButton(420,295);
		
		JButton doneButton = new JButton("All Done!");
		
		// Adding to frame
		
		menuFrame.add(title);
		menuFrame.add(chooseOrder);
		menuFrame.add(burger);
		menuFrame.add(hotdog);
		menuFrame.add(fries);
		menuFrame.add(pepsi);
		menuFrame.add(sevenup);
		menuFrame.add(burgerPlus.getButton());
		menuFrame.add(burgerMinus.getButton());
		menuFrame.add(hotdogPlus.getButton());
		menuFrame.add(hotdogMinus.getButton());
		menuFrame.add(friesPlus.getButton());
		menuFrame.add(friesMinus.getButton());
		menuFrame.add(pepsiPlus.getButton());
		menuFrame.add(pepsiMinus.getButton());
		menuFrame.add(sevenUpPlus.getButton());
		menuFrame.add(sevenUpMinus.getButton());
		menuFrame.add(numBurgers);
		menuFrame.add(numHotdogs);
		menuFrame.add(numFries);
		menuFrame.add(numPepsi);
		menuFrame.add(num7up);
		menuFrame.add(confirmText);
		menuFrame.add(doneButton);
		
		
		// Labels Format
		
		title.setBounds(0,10,500,50);
		title.setFont(new Font("Poppins", Font.BOLD, 26));
		title.setForeground(Color.black);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setVerticalAlignment(JLabel.TOP);
		
		chooseOrder.setBounds(0,55,500,50);
		chooseOrder.setFont(new Font("Poppins", Font.ITALIC, 14));
		chooseOrder.setForeground(Color.black);
		chooseOrder.setHorizontalAlignment(JLabel.CENTER);
		chooseOrder.setVerticalAlignment(JLabel.TOP);
		
		confirmText.setBounds(0,400,500,50);
		confirmText.setFont(new Font("Poppins", Font.ITALIC, 22));
		confirmText.setForeground(Color.black);
		confirmText.setHorizontalAlignment(JLabel.CENTER);
		confirmText.setVerticalAlignment(JLabel.TOP);
		
		doneButton.setBounds(150,450,200,50);
		doneButton.setFocusable(false);
		
		totalOrder.setBounds(10,70,500,50);
		totalOrder.setFont(new Font("Poppins", Font.ITALIC, 20));
		totalOrder.setForeground(Color.black);
		totalOrder.setHorizontalAlignment(JLabel.LEFT);
		totalOrder.setVerticalAlignment(JLabel.TOP);

		burger.setBounds(20,100,500,50);
		burger.setFont(new Font("Poppins", Font.PLAIN, 22));
		burger.setForeground(Color.black);
		burger.setIcon(burgerIcon);
		burger.setHorizontalAlignment(JLabel.LEFT);
		burger.setVerticalAlignment(JLabel.TOP);
		burger.setIconTextGap(10);
		
		hotdog.setBounds(20,150,500,50);
		hotdog.setFont(new Font("Poppins", Font.PLAIN, 22));
		hotdog.setForeground(Color.black);
		hotdog.setIcon(hotdogIcon);
		hotdog.setHorizontalAlignment(JLabel.LEFT);
		hotdog.setVerticalAlignment(JLabel.TOP);
		hotdog.setIconTextGap(10);
		
		fries.setBounds(20,200,500,50);
		fries.setFont(new Font("Poppins", Font.PLAIN, 22));
		fries.setForeground(Color.black);
		fries.setIcon(friesIcon);
		fries.setHorizontalAlignment(JLabel.LEFT);
		fries.setVerticalAlignment(JLabel.TOP);
		fries.setIconTextGap(10);
		
		pepsi.setBounds(20,250,500,50);
		pepsi.setFont(new Font("Poppins", Font.PLAIN, 22));
		pepsi.setForeground(Color.black);
		pepsi.setIcon(pepsiIcon);
		pepsi.setHorizontalAlignment(JLabel.LEFT);
		pepsi.setVerticalAlignment(JLabel.TOP);
		pepsi.setIconTextGap(10);
		
		sevenup.setBounds(20,300,500,50);
		sevenup.setFont(new Font("Poppins", Font.PLAIN, 22));
		sevenup.setForeground(Color.black);
		sevenup.setIcon(sevenupIcon);
		sevenup.setHorizontalAlignment(JLabel.LEFT);
		sevenup.setVerticalAlignment(JLabel.TOP);
		sevenup.setIconTextGap(10);
		
		numBurgers.setBounds(385,92,500,50);
		numBurgers.setFont(new Font("Poppins", Font.PLAIN, 18));
		numHotdogs.setBounds(385,142,500,50);
		numHotdogs.setFont(new Font("Poppins", Font.PLAIN, 18));
		numFries.setBounds(385,192,500,50);
		numFries.setFont(new Font("Poppins", Font.PLAIN, 18));
		numPepsi.setBounds(385,242,500,50);
		numPepsi.setFont(new Font("Poppins", Font.PLAIN, 18));
		num7up.setBounds(385,292,500,50);
		num7up.setFont(new Font("Poppins", Font.PLAIN, 18));
		
		// Buttons Action Listeners
		
			// Plus and Minus buttons for food options.
		
		burgerPlus.getButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				burgerCount += 1;
				price += 3;
				numBurgers.setText(String.valueOf(burgerCount));
				burgerMinus.getButton().setEnabled(true);
				
				if (burgerCount == 5) {
					
					burgerPlus.getButton().setEnabled(false);
					
				}
				
			}
			
		});
		burgerMinus.getButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				burgerCount -= 1;
				price -= 3;
				numBurgers.setText(String.valueOf(burgerCount));
				
				if (burgerCount == 0) {
					
					burgerMinus.getButton().setEnabled(false);
					
				}
				if (burgerCount < 5) {
					
					burgerPlus.getButton().setEnabled(true);
					
				}
				
			}
			
		});
		hotdogPlus.getButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				hotdogCount += 1;
				price += 2;
				numHotdogs.setText(String.valueOf(hotdogCount));
				hotdogMinus.getButton().setEnabled(true);
				
				if (hotdogCount == 5) {
					
					hotdogPlus.getButton().setEnabled(false);
					
				}
				
			}
			
		});
		hotdogMinus.getButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				hotdogCount -= 1;
				price -= 2;
				numHotdogs.setText(String.valueOf(hotdogCount));
				
				if (hotdogCount == 0) {
					
					hotdogMinus.getButton().setEnabled(false);
					
				}
				if (hotdogCount < 5) {
					
					hotdogPlus.getButton().setEnabled(true);
					
				}
				
			}
			
		});
		friesPlus.getButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				friesCount += 1;
				price += 0.5;
				numFries.setText(String.valueOf(friesCount));
				friesMinus.getButton().setEnabled(true);
				
				if (friesCount == 5) {
					
					friesPlus.getButton().setEnabled(false);
					
				}
				
			}
			
		});
		friesMinus.getButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				friesCount -= 1;
				price -= 0.5;
				numFries.setText(String.valueOf(friesCount));
				
				if (friesCount == 0) {
					
					friesMinus.getButton().setEnabled(false);
					
				}
				if (friesCount < 5) {
					
					friesPlus.getButton().setEnabled(true);
					
				}
				
			}
			
		});
		pepsiPlus.getButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				pepsiCount += 1;
				price += 0.3;
				numPepsi.setText(String.valueOf(pepsiCount));
				pepsiMinus.getButton().setEnabled(true);
				
				if (pepsiCount == 5) {
					
					pepsiPlus.getButton().setEnabled(false);
					
				}
				
			}
			
		});
		pepsiMinus.getButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				pepsiCount -= 1;
				price -= 0.3;
				numPepsi.setText(String.valueOf(pepsiCount));
				
				if (pepsiCount == 0) {
					
					pepsiMinus.getButton().setEnabled(false);
					
				}
				if (pepsiCount < 5) {
					
					pepsiPlus.getButton().setEnabled(true);
					
				}
				
			}
			
		});
		sevenUpPlus.getButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				sevenUpCount += 1;
				price += 0.3;
				num7up.setText(String.valueOf(sevenUpCount));
				sevenUpMinus.getButton().setEnabled(true);
				
				if (sevenUpCount == 5) {
					
					sevenUpPlus.getButton().setEnabled(false);
					
				}
				
			}
			
		});
		sevenUpMinus.getButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				sevenUpCount -= 1;
				price -= 0.3;
				num7up.setText(String.valueOf(sevenUpCount));
				
				if (sevenUpCount == 0) {
					
					sevenUpMinus.getButton().setEnabled(false);
					
				}
				if (sevenUpCount < 5) {
					
					sevenUpPlus.getButton().setEnabled(true);
					
				}
				
			}
			
		});

			// All done button, to finish up the order and give the total. 
		
		doneButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				menuFrame.getContentPane().removeAll();
				menuFrame.repaint();
				menuFrame.add(title);
				menuFrame.add(totalOrder);
				
				if (burgerCount > 0) {
					
					JLabel burgerTotal = new JLabel(burgerCount + " Burger/s                        " + burgerCount*3 + " JDs");
					
					burgerTotal.setBounds(0,150,500,50);
					burgerTotal.setFont(new Font("Poppins", Font.PLAIN, 22));
					burgerTotal.setForeground(Color.black);
					burgerTotal.setHorizontalAlignment(JLabel.CENTER);
					burgerTotal.setVerticalAlignment(JLabel.TOP);
					
					menuFrame.add(burgerTotal);
					
				}
				
				if (hotdogCount > 0) {
					
					JLabel hotdogTotal = new JLabel(hotdogCount + " Hotdog/s                        " + hotdogCount*2 + " JDs");
					
					hotdogTotal.setBounds(0,180,500,50);
					hotdogTotal.setFont(new Font("Poppins", Font.PLAIN, 22));
					hotdogTotal.setForeground(Color.black);
					hotdogTotal.setHorizontalAlignment(JLabel.CENTER);
					hotdogTotal.setVerticalAlignment(JLabel.TOP);
					
					menuFrame.add(hotdogTotal);
					
				}
				
				if (friesCount > 0) {
					
					JLabel friesTotal = new JLabel(friesCount + " Fries                              " + round(friesCount*0.5,1) + " JDs");
					
					friesTotal.setBounds(0,210,500,50);
					friesTotal.setFont(new Font("Poppins", Font.PLAIN, 22));
					friesTotal.setForeground(Color.black);
					friesTotal.setHorizontalAlignment(JLabel.CENTER);
					friesTotal.setVerticalAlignment(JLabel.TOP);
					
					menuFrame.add(friesTotal);
					
				}
				
				if (pepsiCount > 0) {
					
					JLabel pepsiTotal = new JLabel(pepsiCount + " Pepsi/s                        " + round(pepsiCount*0.3,1) + " JDs");
					
					pepsiTotal.setBounds(0,240,500,50);
					pepsiTotal.setFont(new Font("Poppins", Font.PLAIN, 22));
					pepsiTotal.setForeground(Color.black);
					pepsiTotal.setHorizontalAlignment(JLabel.CENTER);
					pepsiTotal.setVerticalAlignment(JLabel.TOP);
					
					menuFrame.add(pepsiTotal);
					
				}
				
				if (sevenUpCount > 0) {
					
					JLabel sevenUpTotal = new JLabel(sevenUpCount + " 7Up/s                        " + round(sevenUpCount*0.3, 1) + " JDs");
					
					sevenUpTotal.setBounds(0,270,500,50);
					sevenUpTotal.setFont(new Font("Poppins", Font.PLAIN, 22));
					sevenUpTotal.setForeground(Color.black);
					sevenUpTotal.setHorizontalAlignment(JLabel.CENTER);
					sevenUpTotal.setVerticalAlignment(JLabel.TOP);
					
					menuFrame.add(sevenUpTotal);
					
				}
				
				
				
				JLabel totalPrice = new JLabel("Total Price: " + round(price,1) + " JDs");
				
				totalPrice.setBounds(0,350,500,50);
				totalPrice.setFont(new Font("Poppins", Font.PLAIN, 24));
				totalPrice.setForeground(Color.black);
				totalPrice.setHorizontalAlignment(JLabel.CENTER);
				totalPrice.setVerticalAlignment(JLabel.TOP);
				
				menuFrame.add(totalPrice);
				
				JButton thankYou = new JButton("Thank you!");
				
				thankYou.setFocusable(false);
				thankYou.setBounds(150, 420, 200, 50);
				menuFrame.add(thankYou);
				
				thankYou.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
					
						menuFrame.dispatchEvent(new WindowEvent(menuFrame, WindowEvent.WINDOW_CLOSING));
						
					}
					
				});
				
			}

		});
		
	}

	// Round function, rounding to the nearest decimal.
	
	private static double round(double value, int precision) {
	    int scale = (int) Math.pow(10, precision);
	    return (double) Math.round(value * scale) / scale;
	}

}