package au.gov.nswhealth.assessment.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="medical_grduates_grades")
public class MedicalGraduateGrades {

	private Integer assessmentId;
	private Integer candidateNumber;
	private String medInterviewGrades;
	private String physicalExamsGrades;
	private String profHumanQualGrades;
	private String councellingGrades;
	private String clinicalJudgeGrades;
	private String orgEfficiencyGrades;
	private String ovelCompetenceGrades;
	private Date assessmentDate;
	private IntlMedicalGrads intMedicalGrads;

	@Id
	@Column(name="ASSESSMENT_ID", unique=true, nullable=false)
	@GeneratedValue(generator="gen")
	@GenericGenerator(name="gen", strategy="foreign", parameters=@Parameter(name="property", value="intMedicalGrads"))
	public Integer getAssessmentId() {
		return assessmentId;
	}
	public void setAssessmentId(Integer assessmentId) {
		this.assessmentId = assessmentId;
	}

	@Column(name="CANDIDATE_NO", unique = false, nullable = true)
	public Integer getCandidateNumber() {
		return candidateNumber;
	}

	public void setCandidateNumber(Integer candidateNumber) {
		this.candidateNumber = candidateNumber;
	}

	@Column(name="MEDICAL_INTERVIEWING_SKILLS", unique = false, nullable = true)
	public String getMedInterviewGrades() {
		return medInterviewGrades;
	}
	public void setMedInterviewGrades(String medInterviewGrades) {
		this.medInterviewGrades = medInterviewGrades;
	}

	@Column(name="PHYSICAL_EXAMINATION_SKILLS", unique = false, nullable = true)
	public String getPhysicalExamsGrades() {
		return physicalExamsGrades;
	}
	public void setPhysicalExamsGrades(String physicalExamsGrades) {
		this.physicalExamsGrades = physicalExamsGrades;
	}

	@Column(name="PROF_HUMAN_QUALITIES", unique = false, nullable = true)
	public String getProfHumanQualGrades() {
		return profHumanQualGrades;
	}
	public void setProfHumanQualGrades(String profHumanQualGrades) {
		this.profHumanQualGrades = profHumanQualGrades;
	}

	@Column(name="COUNCELLING_SKILLS", unique = false, nullable = true)
	public String getCouncellingGrades() {
		return councellingGrades;
	}
	public void setCouncellingGrades(String councellingGrades) {
		this.councellingGrades = councellingGrades;
	}

	@Column(name="CLINICAL_JUDGEMENT", unique = false, nullable = true)
	public String getClinicalJudgeGrades() {
		return clinicalJudgeGrades;
	}
	public void setClinicalJudgeGrades(String clinicalJudgeGrades) {
		this.clinicalJudgeGrades = clinicalJudgeGrades;
	}

	@Column(name="ORGANISATION_EFFICIENCY", unique = false, nullable = true)
	public String getOrgEfficiencyGrades() {
		return orgEfficiencyGrades;
	}
	public void setOrgEfficiencyGrades(String orgEfficiencyGrades) {
		this.orgEfficiencyGrades = orgEfficiencyGrades;
	}

	@Column(name="OVERALL_CLINICAL_COMP", unique = false, nullable = true)
	public String getOvelCompetenceGrades() {
		return ovelCompetenceGrades;
	}
	public void setOvelCompetenceGrades(String ovelCompetenceGrades) {
		this.ovelCompetenceGrades = ovelCompetenceGrades;
	}

	@Column(name="DATE_ASSESSED", unique = false, nullable = true)
	public Date getAssessmentDate() {
		return assessmentDate;
	}
	public void setAssessmentDate(Date assessmentDate) {
		this.assessmentDate = assessmentDate;
	}
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public IntlMedicalGrads getIntMedicalGrads() {
		return intMedicalGrads;
	}
	public void setIntMedicalGrads(IntlMedicalGrads intMedicalGrads) {
		this.intMedicalGrads = intMedicalGrads;
	} 

}
