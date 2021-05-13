package ro.ase.cts.facade.classes;

public class FacadeInternarePacient {
	public static String verificaPacient(Pacient pacient) {
        StringBuilder stringBuilder = new StringBuilder();
        Medic medic = new Medic("Ion", "Cardiolog");

        if (pacient.isEsteInStareGrava()) {
            stringBuilder.append("Pacientul ").append(pacient.getNumePacient()).append(" este in stare grava, trimite catre medic");
        }else
        {
            stringBuilder.append("Pacientul ").append(pacient.getNumePacient()).append(" nu necesita internare");
        }
        if (medic.esteNecesaraInternarea(pacient)) {
            stringBuilder.append("Medicul a decis ca este necesara internarea");
            Salon salon = new Salon(20);
            if (salon.arePaturiLibere()) {
                stringBuilder.append(pacient.getNumePacient()).append(" poate fi internat in salon");
            } else {
                stringBuilder.append(pacient.getNumePacient()).append(" nu are locuri disponibile, va fi trimis la alt spital");
            }
        }
        return stringBuilder.toString();
    }
}
