package good.be.alejo.bean;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Registro {

	//private String identificador;
	private Date fechaEntrada;
	private Date fechaSalida;
	private String placa;
	private TipoVehiculo tipoVehiculo;
	
	
	public Registro(String placa, TipoVehiculo tipoVehiculo) {
		super();
		this.fechaEntrada = new Date();
		this.placa = placa;
		this.tipoVehiculo= tipoVehiculo;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public String getPlaca() {
		return placa;
	}
	
	public void setFechaSalida(Date fecha) {
		this.fechaSalida = fecha;
	}
	
	public String toString() {
		return "El vehiculo con placas "+this.placa+" ingreso en la fecha " + this.fechaEntrada.toString();
		}
	
	
}