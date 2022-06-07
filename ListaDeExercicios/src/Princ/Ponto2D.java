package Princ;

public class Ponto2D {

	private double x;
	private double y;

	public Ponto2D() {
		this(0, 0);
	}

	public Ponto2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Ponto2D(Ponto2D ponto2d) {
		this(ponto2d.x, ponto2d.y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void ponto2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void movimento(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object object) {
		
		if (object instanceof Ponto2D) {
			Ponto2D ponto = (Ponto2D) object;
			if (ponto.x == this.x && ponto.y == this.y) {
				return true;
			}
		}		
		return false;
	}

	@Override
	public String toString() {
		return "Ponto2D [x=" + x + ", y=" + y + "]";
	}

	public double distancia(Ponto2D ponto) {
		return Math.sqrt(Math.pow(ponto.x - this.x, 2) + Math.pow(ponto.y - this.y, 2));
	}

	public Ponto2D clone(Ponto2D ponto) {
		return new Ponto2D(ponto);
	}

}
