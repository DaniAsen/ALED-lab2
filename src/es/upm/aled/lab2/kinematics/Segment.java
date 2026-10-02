package es.upm.aled.lab2.kinematics;

import java.util.ArrayList;
import java.util.List;

// TODO: Implemente la clase
public class Segment {
	private double length;

	private double angle;

	private List<Segment> children;

	

	public Segment(double length, double angle) {

		this.length=length;

		this.angle=angle;

		this.children=new ArrayList<>();

		

	}

	

	public double getLength() { //Recibes la longitud que tiene el segmento

		return this.length;

	}

	

	public double getAngle() { //Recibes el ángulo que tiene el segmento

		return this.angle;

	}

	

	public void setAngle(double angle) { //Generas y/o cambias el ángulo de los segmentos

		this.angle = angle;

	}

	

	public List<Segment> getChildren() { //Obtienes la lista de Segmentos

		return this.children;

	}

	

	public void addChild(Segment child) { //Añade los segmentos a la lista. Si ya está, no se añade.

		if (!children.contains(child)) {

			children.add(child);

	}

	}
}

