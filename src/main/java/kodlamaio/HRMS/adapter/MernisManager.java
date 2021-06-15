package kodlamaio.HRMS.adapter;

import java.rmi.RemoteException;

import kodlamaio.HRMS.entities.concretes.Candidate;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManager implements MernisService {

	@Override
	public boolean ifRealCandidate(Candidate candidate) {
		KPSPublicSoapProxy realPerson = new KPSPublicSoapProxy();
		boolean result;
		try {
			result = realPerson.TCKimlikNoDogrula(Long.parseLong(candidate.getNationalityId()),
					candidate.getFirstName().toUpperCase(), candidate.getLastName().toUpperCase(),
					candidate.getDateOfYear());
		} catch (NumberFormatException | RemoteException e) {
			result = false;
			e.printStackTrace();
		}
		return result;
	}

}
