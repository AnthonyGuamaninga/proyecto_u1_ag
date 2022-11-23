package com.example.demo.spring.boot;

import java.time.LocalDateTime; // Cntrl + shif + o: para eliminar imports que no se usa

import org.springframework.stereotype.Service;

@Service // Estereotipo
public class CitaMedicaSB {	
	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private MedicoSB medico;
	private PacienteSB paciente;
	
	public void agendar (String numero, LocalDateTime fechaCita, PacienteSB ph, MedicoSB mh){
		
		this.numero=numero;
		this.fechaCita=fechaCita;
		this.fechaAgenda= LocalDateTime.now();
		
		Integer valorDescuento = ph.calcularDescuento();
		System.out.println("Valor:" + valorDescuento);
		
		this.medico = mh;
		this.paciente= ph;
		
		this.guardarCita(this);
	}
	
	private void guardarCita (CitaMedicaSB cita) {
		//insert en la base de datos , guardar cita
		System.out.println(cita);   	
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public LocalDateTime getFechaAgenda() {
		return fechaAgenda;
	}

	public void setFechaAgenda(LocalDateTime fechaAgenda) {
		this.fechaAgenda = fechaAgenda;
	}

	public MedicoSB getMedico() {
		return medico;
	}

	public void setMedico(MedicoSB medico) {
		this.medico = medico;
	}

	public PacienteSB getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteSB paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "CitaMedicaH [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
				+ ", medico=" + medico + ", paciente=" + paciente + "]";
	}
	
	
	
	
	
	
	

}
