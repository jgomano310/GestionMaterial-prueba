package dto;

import dao.Alumno;
import dao.Portatil;

public class AdaoServicioIMPL implements AdaoServicio {

	@Override
	public Alumno AlumnoaDAO(AlumnoDTO alumnoDTO) {
		Alumno alumno = new Alumno();
		
		if(alumnoDTO!=null) {
			alumno.setNombre(alumnoDTO.getNombre());
			alumno.setTeléfono(alumnoDTO.getTelefono());
			alumno.setMd_date(alumnoDTO.getMd_date());
		}
		
		
		return alumno;
	}

	@Override
	public Portatil PortatilaDAO(PortatilDTO portatilDTO) {
		// TODO Auto-generated method stub
		Portatil portatil = new Portatil();
		
		if(portatilDTO!=null) {
			portatil.setMarca(portatilDTO.getMarca());
			portatil.setMd_date(portatilDTO.getMd_date());
			portatil.setModelo(portatilDTO.getMarca());
		}
		
		
		return portatil;
	}

}
