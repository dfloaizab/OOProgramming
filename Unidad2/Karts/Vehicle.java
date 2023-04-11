
public abstract class Vehicle 
{
	//atributos o campos:
	private int cc_engine;
	private float max_vel;
	private int num_wheels;
	private String color;
		
	//métodos:		
	public Vehicle() {
		super();
	}


	public Vehicle(int cc_engine, float max_vel, int num_wheels, String color) {
		super();
		this.cc_engine = cc_engine;
		this.max_vel = max_vel;
		this.num_wheels = num_wheels;
		this.color = color;
	}

	public int getCc_engine() {
		return cc_engine;
	}


	public void setCc_engine(int cc_engine) {
		this.cc_engine = cc_engine;
	}


	public float getMax_vel() {
		return max_vel;
	}


	public void setMax_vel(float max_vel) {
		this.max_vel = max_vel;
	}


	public int getNum_wheels() {
		return num_wheels;
	}


	public void setNum_wheels(int num_wheels) {
		this.num_wheels = num_wheels;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	

}
