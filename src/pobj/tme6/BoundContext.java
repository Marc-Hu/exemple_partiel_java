package pobj.tme6;

import java.awt.Color;

public class BoundContext implements IContext {
	
	private int minX=0;
	private int minY=0;
	private int maxX=0;
	private int maxY=0;



	public int getMinX() {
		return minX;
	}


	public int getMinY() {
		return minY;
	}


	public int getMaxX() {
		return maxX;
	}


	public int getMaxY() {
		return maxY;
	}


	@Override
	public void drawLine(int x1, int y1, int x2, int y2, Color color) {
		if(x2>maxX)
			maxX=x2;
		if(y2>maxY)
			maxY=x2;
	}

}
