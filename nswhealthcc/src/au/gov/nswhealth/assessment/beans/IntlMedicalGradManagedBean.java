package au.gov.nswhealth.assessment.beans;

import java.io.Serializable;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.springframework.dao.DataAccessException;

import au.gov.nswhealth.assessment.model.IntlMedicalGrads;
import au.gov.nswhealth.assessment.model.MedicalGraduateGrades;
import au.gov.nswhealth.assessment.user.service.IIntlMedicalGradsService;

/**
 * 
 * User Managed Bean
 * 
 * 
 *
 */
@ManagedBean(name="intlMedicalGrad")
@RequestScoped
public class IntlMedicalGradManagedBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static final String SUCCESS = "success";
	private static final String ERROR   = "error";
	
	//Spring User Service is injected...
	@ManagedProperty(value="#{intlMedicalGradService}")
	IIntlMedicalGradsService userService;
	
	List<IntlMedicalGrads> userList;
	
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
	private String medInterviewGrades;
	private String physicalExamsGrades;
	private String profHumanQualGrades;
	private String councellingGrades;
	private String clinicalJudgeGrades;
	private String orgEfficiencyGrades;
	private String ovelCompetenceGrades;
	private String miniCexTime;
	private String feedbackTime;
	private String docPerformanceComments;
	private String levelOfPerformance;
	private String currentAppointmentLevel;
	private Blob assessorSignImg;
	private Blob candidatesSignImg;
	
	/**
	 * Add User
	 * 
	 * @return String - Response Message
	 */
	public String addMedicalGraduateRecord() {
		try {
			IntlMedicalGrads graduate = new IntlMedicalGrads();
			MedicalGraduateGrades medicalGrades = new MedicalGraduateGrades();
			graduate.setCandidateNumber(getCandidateNumber());
			graduate.setCandidateName(getCandidateName());
			graduate.setAccessorName(accessorName);
			graduate.setAssessmentDate(assessmentDate);
			graduate.setAssessorPosition(assessorPosition);
			graduate.setClinicalSettings(clinicalSettings);
			graduate.setClinicalProblems(clinicalProblems);
			graduate.setFocusImgEncounter(focusImgEncounter);
			graduate.setImgCareComplexity(imgCareComplexity);
			graduate.setMrn(mrn);
			medicalGrades.setMedInterviewGrades(medInterviewGrades);
			medicalGrades.setAssessmentDate(assessmentDate);
			medicalGrades.setCandidateNumber(candidateNumber);
			medicalGrades.setClinicalJudgeGrades(clinicalJudgeGrades);
			medicalGrades.setCouncellingGrades(councellingGrades);
			medicalGrades.setOrgEfficiencyGrades(orgEfficiencyGrades);
			medicalGrades.setOvelCompetenceGrades(ovelCompetenceGrades);
			medicalGrades.setPhysicalExamsGrades(physicalExamsGrades);
			medicalGrades.setProfHumanQualGrades(profHumanQualGrades);
			graduate.setMedicalGrades(medicalGrades);
			graduate.setMiniCexTime(miniCexTime);
			graduate.setFeedbackTime(feedbackTime);
			graduate.setDocPerformanceComments(docPerformanceComments);
			graduate.setLevelOfPerformance(levelOfPerformance);
			graduate.setCurrentAppointmentLevel(currentAppointmentLevel);
			graduate.setAssessorSignImg(assessorSignImg);
			graduate.setCandidatesSignImg(candidatesSignImg);
			getUserService().addIntlMedicalGrad(graduate);
			//System.out.println("Date is "+getDate());
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		} 	
		
		return ERROR;
	}
	
	/**
	 * Reset Fields
	 * 
	 */
	public void reset() {
		
	}
	
	/**
	 * Get User List
	 * 
	 * @return List - User List
	 */
	public List<IntlMedicalGrads> getUserList() {
		userList = new ArrayList<IntlMedicalGrads>();
		userList.addAll(getUserService().getIntlMedicalGrads());
		return userList;
	}
	
	/**
	 * Get User Service
	 * 
	 * @return IUserService - User Service
	 */
	public IIntlMedicalGradsService getUserService() {
		return userService;
	}

	/**
	 * Set User Service
	 * 
	 * @param IUserService - User Service
	 */
	public void setUserService(IIntlMedicalGradsService userService) {
		this.userService = userService;
	}
	
	/**
	 * Set User List
	 * 
	 * @param List - User List
	 */
	public void setUserList(List<IntlMedicalGrads> userList) {
		this.userList = userList;
	}

	public Integer getCandidateNumber() {
		return candidateNumber;
	}

	public void setCandidateNumber(Integer candidateNumber) {
		this.candidateNumber = candidateNumber;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getAccessorName() {
		return accessorName;
	}

	public void setAccessorName(String accessorName) {
		this.accessorName = accessorName;
	}

	public Date getAssessmentDate() {
		return assessmentDate;
	}

	public void setAssessmentDate(Date assessmentDate) {
		this.assessmentDate = assessmentDate;
	}

	public String getAssessorPosition() {
		return assessorPosition;
	}

	public void setAssessorPosition(String assessorPosition) {
		this.assessorPosition = assessorPosition;
	}

	public String getClinicalSettings() {
		return clinicalSettings;
	}

	public void setClinicalSettings(String clinicalSettings) {
		this.clinicalSettings = clinicalSettings;
	}

	public String getClinicalProblems() {
		return clinicalProblems;
	}

	public void setClinicalProblems(String clinicalProblems) {
		this.clinicalProblems = clinicalProblems;
	}

	public String getFocusImgEncounter() {
		return focusImgEncounter;
	}

	public void setFocusImgEncounter(String focusImgEncounter) {
		this.focusImgEncounter = focusImgEncounter;
	}

	public String getMiniCexTime() {
		return miniCexTime;
	}

	public void setMiniCexTime(String miniCexTime) {
		this.miniCexTime = miniCexTime;
	}

	public String getFeedbackTime() {
		return feedbackTime;
	}

	public void setFeedbackTime(String feedbackTime) {
		this.feedbackTime = feedbackTime;
	}

	public String getDocPerformanceComments() {
		return docPerformanceComments;
	}

	public void setDocPerformanceComments(String docPerformanceComments) {
		this.docPerformanceComments = docPerformanceComments;
	}

	public String getLevelOfPerformance() {
		return levelOfPerformance;
	}

	public void setLevelOfPerformance(String levelOfPerformance) {
		this.levelOfPerformance = levelOfPerformance;
	}

	public String getCurrentAppointmentLevel() {
		return currentAppointmentLevel;
	}

	public void setCurrentAppointmentLevel(String currentAppointmentLevel) {
		this.currentAppointmentLevel = currentAppointmentLevel;
	}

	public Blob getAssessorSignImg() {
		return assessorSignImg;
	}

	public void setAssessorSignImg(Blob assessorSignImg) {
		this.assessorSignImg = assessorSignImg;
	}

	public Blob getCandidatesSignImg() {
		return candidatesSignImg;
	}

	public void setCandidatesSignImg(Blob candidatesSignImg) {
		this.candidatesSignImg = candidatesSignImg;
	}

	public String getImgCareComplexity() {
		return imgCareComplexity;
	}

	public void setImgCareComplexity(String imgCareComplexity) {
		this.imgCareComplexity = imgCareComplexity;
	}

	public Integer getMrn() {
		return mrn;
	}

	public void setMrn(Integer mrn) {
		this.mrn = mrn;
	}

	public String getMedInterviewGrades() {
		return medInterviewGrades;
	}

	public void setMedInterviewGrades(String medInterviewGrades) {
		this.medInterviewGrades = medInterviewGrades;
	}

	public String getPhysicalExamsGrades() {
		return physicalExamsGrades;
	}

	public void setPhysicalExamsGrades(String physicalExamsGrades) {
		this.physicalExamsGrades = physicalExamsGrades;
	}

	public String getProfHumanQualGrades() {
		return profHumanQualGrades;
	}

	public void setProfHumanQualGrades(String profHumanQualGrades) {
		this.profHumanQualGrades = profHumanQualGrades;
	}

	public String getCouncellingGrades() {
		return councellingGrades;
	}

	public void setCouncellingGrades(String councellingGrades) {
		this.councellingGrades = councellingGrades;
	}

	public String getClinicalJudgeGrades() {
		return clinicalJudgeGrades;
	}

	public void setClinicalJudgeGrades(String clinicalJudgeGrades) {
		this.clinicalJudgeGrades = clinicalJudgeGrades;
	}

	public String getOrgEfficiencyGrades() {
		return orgEfficiencyGrades;
	}

	public void setOrgEfficiencyGrades(String orgEfficiencyGrades) {
		this.orgEfficiencyGrades = orgEfficiencyGrades;
	}

	public String getOvelCompetenceGrades() {
		return ovelCompetenceGrades;
	}

	public void setOvelCompetenceGrades(String ovelCompetenceGrades) {
		this.ovelCompetenceGrades = ovelCompetenceGrades;
	}

	
	
}