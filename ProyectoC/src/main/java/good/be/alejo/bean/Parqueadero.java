package good.be.alejo.bean;

import java.util.ArrayList;

public class Parqueadero {
	private int id;
	private String direccion;
	private String telefono;
	public final int MAX_CAPACIDAD_CARROS=20;
	public final int MAX_CAPACIDAD_MOTOS=10;
	private int puestosDisponiblesCarros;
	private int puestosDisponiblesMotos;
	private ArrayList<String> zonaParqueoMotos;
	private ArrayList<String> zonaParqueCarros;
	public final double PRECIO_HORA_MOTO=500;
	public final double PRECIO_HORA_CARRO=1000;
	public final double PRECIO_DIA_MOTO=600;
	public final double PRECIO_DIA_CARRO=8000;
	public final double incrementoCilindrajeMayor=2000;
	
	
		public Parqueadero() {
		super();
		this.puestosDisponiblesCarros = MAX_CAPACIDAD_CARROS;
		this.puestosDisponiblesMotos = MAX_CAPACIDAD_MOTOS;
	}

	public int getPuestosDisponiblesCarros() {
		return puestosDisponiblesCarros;
	}

	public void setPuestosDisponiblesCarros(int puestosDisponiblesCarros) {
		this.puestosDisponiblesCarros = puestosDisponiblesCarros;
	}

	public int getPuestosDisponiblesMotos() {
		return puestosDisponiblesMotos;
	}

	public void setPuestosDisponiblesMotos(int puestosDisponiblesMotos) {
		this.puestosDisponiblesMotos = puestosDisponiblesMotos;
	}

	public ArrayList<String> getZonaParqueoMotos() {
		return zonaParqueoMotos;
	}
	
	public void setZonaParqueoMotos(ArrayList<String> zonaParqueoMotos) {
		this.zonaParqueoMotos = zonaParqueoMotos;
	}
	public ArrayList<String> getZonaParqueCarros() {
		return zonaParqueCarros;
	}
	public void setZonaParqueCarros(ArrayList<String> zonaParqueCarros) {
		this.zonaParqueCarros = zonaParqueCarros;
	}
	
	
	
	
}