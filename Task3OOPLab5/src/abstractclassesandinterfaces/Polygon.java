package abstractclassesandinterfaces;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Polygon extends Shape {

	Random random;
	public Polygon(int n) {

		super(n);
	}

	public Polygon(int[] x, int[] y, int n) {

		super(x, y, n);
	}

	public void draw(Graphics g) {
//change colour (copy and paste from somewhere )
		random = new Random();
		Color color = new Color(random.nextInt(255), random.nextInt(255),
				random.nextInt(255));
		
		g.setColor(color);

		for (int i = 0; i < nVertices - 1; i++) {

			g.drawLine(x[i], y[i], x[i + 1], y[i + 1]);
		}

		g.drawLine(x[nVertices - 1], y[nVertices - 1], x[0], y[0]);
	}
	
	public void fill(Graphics g){
		
		g.setColor(color);
		g.fillPolygon(x, y, nVertices);
	}
}
