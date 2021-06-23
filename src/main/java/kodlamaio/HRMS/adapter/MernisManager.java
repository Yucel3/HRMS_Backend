package kodlamaio.HRMS.adapter;

import java.rmi.RemoteException;

import org.springframework.stereotype.Service;

import kodlamaio.HRMS.entities.dtos.CandidateAddDto;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class MernisManager implements MernisService {

	@Override
	public boolean ifRealCandidate(CandidateAddDto candidate) {
		KPSPublicSoapProxy realPerson = new KPSPublicSoapProxy();
		boolean result;
		try {
			result = realPerson.TCKimlikNoDogrula(Long.parseLong(candidate.getNationalityId()),
					candidate.getFirstName().toUpperCase(), candidate.getLastName().toUpperCase(),
					candidate.getBirthYear());
		} catch (NumberFormatException | RemoteException e) {
			result = false;
			e.printStackTrace();
		}
		return result;
	}

}
