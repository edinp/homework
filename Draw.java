package Weekend3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Draw {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****
		
		g.setColor(Color.BLACK);
		g.drawRect(500, 100, 400, 300);
		g.drawLine(499, 100, 499, 400);
		g.drawString("Java", 510, 120);
		g.drawRect(550, 120, 100, 260);
		g.drawRect(670, 120, 100, 260);
		g.drawRect(790, 120, 70, 260);
		g.drawLine(861, 120, 861, 380);
		g.setColor(Color.GREEN);
		g.drawString("Math", 560, 140);
		g.setColor(Color.RED);
		g.drawString("setColor()", 680, 260);
				
		// *******************
		w.setImage(img);
	}
}
