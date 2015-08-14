package com.spartanlaboratories.tetis.main;

import javax.swing.JFrame;

public class Tetris {
	public static void main(String[] args){
		new Tetris().init();
	}
	private static final byte rate = 60;
	private JFrame window = new JFrame("Tetis");
	private void init(){
		window.setLocation(0,0);
		window.setSize(1920,1080);
		window.setUndecorated(true);
		window.setVisible(true);
		run();
	}
	private void run(){
		long time = System.nanoTime();
		while(true)if(System.nanoTime()< time + 1000000000 / rate){
			tick();
			render();
		}
	}
	private void tick(){
		
	}
	private void render(){
		
	}
}

