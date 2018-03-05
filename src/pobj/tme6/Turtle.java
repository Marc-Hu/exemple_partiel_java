package pobj.tme6;

public class Turtle implements ITurtle {
	private int x;
	private int y;
	private int directionCourante;
	private boolean crayonLeve;

	public Turtle() {
		x = 0;
		y = 0;
		directionCourante = 0;
		crayonLeve = false;
	}

	@Override
	public void move(int length) {
		int x1=x, y1=y;
		x = x + (int) (length * Math.sin(directionCourante * Math.PI / 180.));
		y = y + (int) (length * Math.cos(directionCourante * Math.PI / 180.));
		if(!crayonLeve)
			this.draw(x1, y1, x, y);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getDirectionCourante() {
		return directionCourante;
	}

	public boolean isCrayonLeve() {
		return crayonLeve;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setDirectionCourante(int directionCourante) {
		this.directionCourante = directionCourante;
	}

	public void setCrayonLeve(boolean crayonLeve) {
		this.crayonLeve = crayonLeve;
	}

	@Override
	public void turn(int angle) {
		directionCourante = angle;
	}

	@Override
	public void up() {
		crayonLeve = true;
	}

	@Override
	public void down() {
		crayonLeve = false;
	}

	public void draw(int x1, int y1, int x2, int y2) {
		System.out.println(x1+" "+y1+" "+x2+" "+y2);
	}
}
