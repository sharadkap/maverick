package au.gov.nswhealth.assessment.dao;

import java.util.List;

import au.gov.nswhealth.assessment.model.IntlMedicalGrads;

/**
 * 
 * IntlMedicalGrads DAO Interface
 * 
 *
 */
public interface IntlMedicalGradsDAO {

	/**
	 * Add IntlMedicalGrads
	 * 
	 * @param  IntlMedicalGrads user
	 */
	public void addIntlMedicalGrad(IntlMedicalGrads user);
	
	/**
	 * Update IntlMedicalGrads
	 * 
	 * @param  IntlMedicalGrads user
	 */
	public void updateIntlMedicalGrad(IntlMedicalGrads user);
	
	/**
	 * Delete IntlMedicalGrads
	 * 
	 * @param  IntlMedicalGrads user
	 */
	public void deleteIntlMedicalGrad(IntlMedicalGrads user);
	
	/**
	 * Get IntlMedicalGrads
	 * 
	 * @param  int IntlMedicalGrads Id
	 */
	public IntlMedicalGrads getIntlMedicalGradsById(int id);
	
	/**
	 * Get IntlMedicalGrads List
	 * 
	 */
	public List<IntlMedicalGrads> getIntlMedicalGrads();
}
