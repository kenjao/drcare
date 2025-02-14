package ie.ait.bteam.drcare.rest.translator.impl;

import ie.ait.bteam.drcare.data.model.User;
import ie.ait.bteam.drcare.rest.model.PatientDTO;
import ie.ait.bteam.drcare.rest.translator.Translator;

public class UserToPatientTranslator implements Translator<User, PatientDTO> {

	@Override
	public PatientDTO translateFrom(User original) {
		Translator userTranslator = new UserToUserDTOTranslator();
		PatientDTO dto = (PatientDTO) userTranslator.translateFrom(original);
		dto.setEmergencyId(original.getPatientEmergencyId());
		return dto;
	}

	@Override
	public User translateTo(PatientDTO copy) {
		return null;
	}

}
