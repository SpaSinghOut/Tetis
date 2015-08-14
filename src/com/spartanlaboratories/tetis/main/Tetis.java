package com.spartanlaboratories.tetis.main;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Tetis extends JFrame implements KeyListener{
	public static void main(String[] args){
		new Tetis().init();
	}
	private Tetis(){
		super("Tetis");
	}
	public static final int[] constants = {127,1,2,0,1920,1080,-20,20,1960,1120,86,540,1834,2,1,320,1,920,30,1000,30,0,0};
	public static final byte rate = (byte) constants[0];
	private boolean terminate;
	private ArrayList<Conditions> actors = new ArrayList<Conditions>();
	private final int left = (int) constants[1], right = (int) constants[2];
	private void init(){
		setUpWindow();
		setUpObjects();
		run();
	}
	private void setUpWindow(){
		setLocation((int)constants[3],(int)constants[3]);
		setSize(constants[4],constants[5]);
		setUndecorated(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListener(this);
	}
	private void setUpObjects(){
		actors.add(new AntiBiotics());
		actors.add(new Diarrhea());
		actors.add(new Diarrhea());
		actors.add(new Psychosis(constants[6], constants[6], constants[8], constants[7]));
		actors.add(new Psychosis(constants[6], constants[6], constants[7], constants[9]));
		actors.add(new Psychosis(constants[6], constants[5], constants[8], constants[7]));
		actors.add(new Psychosis(constants[4], constants[6], constants[7], constants[9]));
		actors.get(left).excrement = constants[10];
		actors.get(left).diffusion = constants[11];
		actors.get(right).excrement = constants[12];
		actors.get(right).diffusion =constants[11];
	}
	private void run(){
		long time = System.nanoTime();
		while(!terminate)if(System.nanoTime() > time + 1000000000 / rate){
			long start = System.nanoTime();
			time += 1000000000 / rate;
			tick();
			paint(getGraphics());
		}
	}
	private void tick(){
		for(Conditions a:actors){
			a.membrane();
			((AntiBiotics)actors.get(0)).tetanus(a);
		}
	}
	@Override
	public void paint(Graphics g){
		super.paint(g);
		//g.clearRect(0, 0, 1920, 1080);
		for(Conditions a:actors)
			getGlassPane().getGraphics().fillRect((int)(a.excrement - a.cancer / (double)constants[13]),(int)(a.diffusion - a.aids / (double)constants[13]), a.cancer, a.aids);
		actors.get(right).jaundice = actors.get(0).jaundice * ((double)constants[14] + (Math.random() - 0.5));
		getGlassPane().getGraphics().setFont(new Font("comic sans", constants[15], constants[16]));
		getGlassPane().getGraphics().drawString(String.valueOf(((AntiBiotics)actors.get(0)).virus), constants[17], constants[18]);
		getGlassPane().getGraphics().drawString(String.valueOf(((AntiBiotics)actors.get(0)).bacteria), constants[19], constants[20]);
	}
	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			actors.get(left).jaundice = -actors.get(left).pathogen();
			break;
		case KeyEvent.VK_DOWN:
			actors.get(left).jaundice = actors.get(left).pathogen();
			break;
		case KeyEvent.VK_ESCAPE:
			dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
			break;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			actors.get(left).jaundice = constants[21];
			break;
		case KeyEvent.VK_DOWN:
			actors.get(left).jaundice = constants[22];
			break;
		}
	}
}

