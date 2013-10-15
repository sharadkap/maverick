package au.gov.nswhealth.assessment.model;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * User Entity
 * 
 * @author 
 * @since 
 * @version 1.0.0
 *
 */
@Entity
@Table(name="intl_medical_grads_data")
public class IntlMedicalGrads {

	private Integer assessmentId;
	private Integer candidateNumber;
	private String candidateName;
	private String accessorName;
	private Date assessmentDate;
	private String assessorPosition;
	private String clinicalSettings;
	private String clinicalProblems;
	private String focusImgEncounter;
	private String imgCareComplexity;
	private Integer mrn;
	private String miniCexTime;
	private String feedbackTime;
	private String docPerformanceComments;
	private String levelOfPerformance;
	private String currentAppointmentLevel;
	private Blob assessorSignImg;
	private Blob candidatesSignImg;
	private MedicalGraduateGrades medicalGrades;
	
	
	@Id 
	@Column(name = "ASSESSMENT_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getAssessmentId() {
		return assessmentId;
	}

	public void setAssessmentId(Integer assessmentId) {
		this.assessmentId = assessmentId;
	}

	/**
	 * Get User Id
	 * 
	 * @return int - User Id
	 */
	
	@Column(name="CANDIDATE_NO", unique = false, nullable = false)
	public Integer getCandidateNumber() {
		return candidateNumber;
	}
	
	public void setCandidateNumber(Integer candidateNumber) {
		this.candidateNumber = candidateNumber;
	}
	
	/**
	 * Get User Name
	 * 
	 * @return String - User Name
	 */
	@Column(name="CANDIDATE_NAME", unique = false, nullable = false)
	public String getCandidateName() {
		return candidateName;
	}
	
	/**
	 * Set User Name
	 * 
	 * @param String - User Name
	 */
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	
	/**
	 * Get User Surname
	 * 
	 * @return String - User Surname
	 */
	@Column(name="ASSESSOR_NAME", unique = false, nullable = false)
	public String getAccessorName() {
		return accessorName;
	}
	
	/**
	 * Set User Surname
	 * 
	 * @param String - User Surname
	 */
	public void setAccessorName(String accessorName) {
		this.accessorName = accessorName;
	}	
	
	/*@Override
	public String toString() {
		StringBuffer strBuff = new StringBuffer();
		strBuff.append("id : ").append(getId());
		strBuff.append(", name : ").append(getName());
		strBuff.append(", surname : ").append(getSurname());
		return strBuff.toString();
	}
*/
	@Column(name="ASSESSMENT_DATE", unique = false, nullable = true)
	public Date getAssessmentDate() {
		return assessmentDate;
	}

	public void setAssessmentDate(Date assessmentDate) {
		this.assessmentDate = assessmentDate;
	}
	
	@Column(name="ASSESSOR_POSITION", unique = false, nullable = true)
	public String getAssessorPosition() {
		return assessorPosition;
	}
	
	public void setAssessorPosition(String assessorPosition) {
		this.assessorPosition = assessorPosition;
	}
	
	@Column(name="CLINICAL_SETTINGS", unique = false, nullable = true)
	public String getClinicalSettings() {
		return clinicalSettings;
	}

	public void setClinicalSettings(String clinicalSettings) {
		this.clinicalSettings = clinicalSettings;
	}

	@Column(name="CLINICAL_PROBLEMS", unique = false, nullable = true)
	public String getClinicalProblems() {
		return clinicalProblems;
	}

	public void setClinicalProblems(String clinicalProblems) {
		this.clinicalProblems = clinicalProblems;
	}

	@Column(name="FOCUS_IMG_ENCOUNTER", unique = false, nullable = true)
	public String getFocusImgEncounter() {
		return focusImgEncounter;
	}

	public void setFocusImgEncounter(String focusImgEncounter) {
		this.focusImgEncounter = focusImgEncounter;
	}

	
	@Column(name="MINI_CEX_TIME", unique = false, nullable = true)
	public String getMiniCexTime() {
		return miniCexTime;
	}

	public void setMiniCexTime(String miniCexTime) {
		this.miniCexTime = miniCexTime;
	}

	@Column(name="FEEDBACK_TIME", unique = false, nullable = true)
	public String getFeedbackTime() {
		return feedbackTime;
	}

	public void setFeedbackTime(String feedbackTime) {
		this.feedbackTime = feedbackTime;
	}

	@Column(name="DOC_PERFORM_COMMENTS", unique = false, nullable = true)
	public String getDocPerformanceComments() {
		return docPerformanceComments;
	}

	public void setDocPerformanceComments(String docPerformanceComments) {
		this.docPerformanceComments = docPerformanceComments;
	}

	@Column(name="LEVEL_OF_PERFORMANCE", unique = false, nullable = true)
	public String getLevelOfPerformance() {
		return levelOfPerformance;
	}

	public void setLevelOfPerformance(String levelOfPerformance) {
		this.levelOfPerformance = levelOfPerformance;
	}

	@Column(name="CURRENT_APPOINTMENT_LEVEL", unique = false, nullable = true)
	public String getCurrentAppointmentLevel() {
		return currentAppointmentLevel;
	}

	
	public void setCurrentAppointmentLevel(String currentAppointmentLevel) {
		this.currentAppointmentLevel = currentAppointmentLevel;
	}

	@Column(name="ASSESSOR_SIGN_IMAGE", unique = false, nullable = true)
	public Blob getAssessorSignImg() {
		return assessorSignImg;
	}

	public void setAssessorSignImg(Blob assessorSignImg) {
		this.assessorSignImg = assessorSignImg;
	}

	@Column(name="CANDIDATE_SIGN_IMAGE", unique = false, nullable = true)
	public Blob getCandidatesSignImg() {
		return candidatesSignImg;
	}

	public void setCandidatesSignImg(Blob candidatesSignImg) {
		this.candidatesSignImg = candidatesSignImg;
	}
	
	@Column(name="IMG_CARE_COMPLEXITY", unique = false, nullable = true)
	public String getImgCareComplexity() {
		return imgCareComplexity;
	}

	public void setImgCareComplexity(String imgCareComplexity) {
		this.imgCareComplexity = imgCareComplexity;
	}

	@Column(name="MRN", unique = false, nullable = true)
	public Integer getMrn() {
		return mrn;
	}

	public void setMrn(Integer mrn) {
		this.mrn = mrn;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "intMedicalGrads", cascade = CascadeType.ALL)
	public MedicalGraduateGrades getMedicalGrades() {
		return medicalGrades;
	}

	public void setMedicalGrades(MedicalGraduateGrades medicalGrades) {
		this.medicalGrades = medicalGrades;
	}

	
}
