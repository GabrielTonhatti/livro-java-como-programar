package cap04;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanelA extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		int width = getWidth() / 2;
		int height = getHeight() / 2;

		for (int i = 20; i < 1800; i+= 20) {
			// g.drawLine(x1, y1, x2, y2);
			g.drawLine(0, 0, width, height);
			g.drawLine(0, 0, width - i, height + i);
			g.drawLine(0, 0, width + i, height - i);
		}

	}

}
