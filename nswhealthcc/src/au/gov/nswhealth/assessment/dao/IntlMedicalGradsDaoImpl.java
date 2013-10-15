package au.gov.nswhealth.assessment.dao;

import java.util.List;

import au.gov.nswhealth.assessment.model.IntlMedicalGrads;

import org.hibernate.SessionFactory;

/**
 * 
 * IntlMedicalGrads DAO
 * 
 *
 */

public class IntlMedicalGradsDaoImpl implements IntlMedicalGradsDAO {
	
	private SessionFactory sessionFactory;

	/**
	 * Get Hibernate Session Factory
	 * 
	 * @return SessionFactory - Hibernate Session Factory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * Set Hibernate Session Factory
	 * 
	 * @param SessionFactory - Hibernate Session Factory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	/**
	 * Add IntlMedicalGrads
	 * 
	 * @param  IntlMedicalGrads user
	 */
	@Override
	public void addIntlMedicalGrad(IntlMedicalGrads user) {
		getSessionFactory().getCurrentSession().save(user);
	}

	/**
	 * Delete IntlMedicalGrads
	 * 
	 * @param  IntlMedicalGrads user
	 */
	@Override
	public void deleteIntlMedicalGrad(IntlMedicalGrads user) {
		getSessionFactory().getCurrentSession().delete(user);
	}

	/**
	 * Update IntlMedicalGrads
	 * 
	 * @param  IntlMedicalGrads user
	 */
	@Override
	public void updateIntlMedicalGrad(IntlMedicalGrads user) {
		getSessionFactory().getCurrentSession().update(user);
	}

	/**
	 * Get IntlMedicalGrads
	 * 
	 * @param  int IntlMedicalGrads Id
	 * @return IntlMedicalGrads 
	 */
	@Override
	public IntlMedicalGrads getIntlMedicalGradsById(int id) {
		List list = getSessionFactory().getCurrentSession()
											.createQuery("from intl_medical_grads_data where candidateNumber=?")
									        .setParameter(0, id).list();
		return (IntlMedicalGrads)list.get(0);
	}

	/**
	 * Get IntlMedicalGrads List
	 * 
	 * @return List - IntlMedicalGrads list
	 */
	@Override
	public List<IntlMedicalGrads> getIntlMedicalGrads() {
		List list = getSessionFactory().getCurrentSession().createQuery("from User").list();
		return list;
	}

}
