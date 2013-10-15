package au.gov.nswhealth.assessment.user.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import au.gov.nswhealth.assessment.dao.IntlMedicalGradsDAO;
import au.gov.nswhealth.assessment.model.IntlMedicalGrads;

/**
 * 
 * IntlMedicalGrad Service
 * 
 *
 */
@Transactional(readOnly = true)
public class IntlMedicalGradsServiceImpl implements IIntlMedicalGradsService {

	// IntlMedicalGradDAO is injected...
	IntlMedicalGradsDAO intlMedicalGradDAO;
	
	/**
	 * Add IntlMedicalGrad
	 * 
	 * @param  IntlMedicalGrads user
	 */
	@Transactional(readOnly = false)
	@Override
	public void addIntlMedicalGrad(IntlMedicalGrads user) {
		getIntlMedicalGradDAO().addIntlMedicalGrad(user);
	}

	/**
	 * Delete IntlMedicalGrad
	 * 
	 * @param  IntlMedicalGrads user
	 */
	@Transactional(readOnly = false)
	@Override
	public void deleteIntlMedicalGrad(IntlMedicalGrads user) {
		getIntlMedicalGradDAO().deleteIntlMedicalGrad(user);
	}
	
	/**
	 * Update IntlMedicalGrad
	 * 
	 * @param  IntlMedicalGrads user
	 */
	@Transactional(readOnly = false)
	@Override
	public void updateIntlMedicalGrad(IntlMedicalGrads user) {
		getIntlMedicalGradDAO().updateIntlMedicalGrad(user);
	}
	
	/**
	 * Get IntlMedicalGrad
	 * 
	 * @param  int IntlMedicalGrad Id
	 */
	@Override
	public IntlMedicalGrads getIntlMedicalGradsById(int id) {
		return getIntlMedicalGradDAO().getIntlMedicalGradsById(id);
	}

	/**
	 * Get IntlMedicalGrad List
	 * 
	 */
	@Override
	public List<IntlMedicalGrads> getIntlMedicalGrads() {	
		return getIntlMedicalGradDAO().getIntlMedicalGrads();
	}

	/**
	 * Get IntlMedicalGrad DAO
	 * 
	 * @return IIntlMedicalGradDAO - IntlMedicalGrad DAO
	 */
	public IntlMedicalGradsDAO getIntlMedicalGradDAO() {
		return intlMedicalGradDAO;
	}

	/**
	 * Set IntlMedicalGrad DAO
	 * 
	 * @param IntlMedicalGradsDAO - IntlMedicalGrad DAO
	 */
	public void setIntlMedicalGradDAO(IntlMedicalGradsDAO intlMedicalGradDAO) {
		this.intlMedicalGradDAO = intlMedicalGradDAO;
	}

}
