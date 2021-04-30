package photoalbum;

import javax.swing.*;


import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.net.URL;
import java.awt.*;
import java.awt.event.*;
public class Album extends JFrame{
    CircularList cl;
    Node currentNode;
    JFrame frame;
    JPanel panelImage;
    JLabel picLabel;
    public void paintImage() throws Exception{
	BufferedImage img;
	img = ImageIO.read(new URL(currentNode.data));
	picLabel = new JLabel(new ImageIcon(img));
	frame.getContentPane().add(BorderLayout.CENTER,picLabel);
    }
    public void repaintImage() throws Exception{
	
	
	BufferedImage img;
	img = ImageIO.read(new URL(currentNode.data));
	picLabel.setIcon(new ImageIcon(img));
	picLabel.repaint();
	frame.getContentPane().add(picLabel);

    }
    public Album()  throws Exception{
	frame = new JFrame("Photo album");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame .setSize(500,500);
	
	JButton btnPrev = new JButton("<");
	JButton btnNext = new JButton(">");

	cl = new CircularList();

	cl.addNode("https://picsum.photos/id/1/200/300");
	cl.addNode("https://picsum.photos/id/2/200/300");
	cl.addNode("https://picsum.photos/id/3/200/300");
	cl.addNode("https://picsum.photos/id/4/200/300");
	cl.addNode("https://picsum.photos/id/5/200/300");
	cl.addNode("https://picsum.photos/id/6/200/300");
	cl.addNode("https://picsum.photos/id/7/200/300");
	cl.addNode("https://picsum.photos/id/8/200/300");
	cl.addNode("https://picsum.photos/id/9/200/300");
	
	currentNode = cl.head;
	paintImage();
	frame.getContentPane().add(BorderLayout.WEST,btnPrev);
	frame.getContentPane().add(BorderLayout.EAST,btnNext);

	frame.setVisible(true);

	
	btnPrev.addActionListener(new ActionListener(){
	    @Override
	    public void actionPerformed(ActionEvent arg0){
		System.out.println("pressed prev");
		currentNode = currentNode.prev;
		System.out.println(currentNode.data);
		try{
		    repaintImage();
		}catch(Exception e){
		    System.out.println(e);
		}

	    }
	});
	btnNext.addActionListener(new ActionListener(){
	    @Override
	    public void actionPerformed(ActionEvent arg0){
		System.out.println("Pressed next");
		currentNode = currentNode.next;
		System.out.println(currentNode.data);
		try{
		    repaintImage();
		}catch(Exception e){
		    System.out.println(e);
		}
		
	    }
	});

    }

}
