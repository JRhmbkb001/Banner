package  net.hedtech.ucdavis.ps.banner.student.Zcadetq.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class ScbcrseAdapter extends BaseRowAdapter{
	

	public ScbcrseAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScbcrseCrseNumb(NString value){
		this.setValue("SCBCRSE_CRSE_NUMB", value.getValue());
	}


	public NString getScbcrseCrseNumb(){
		NString v = new NString((String)this.getValue("SCBCRSE_CRSE_NUMB"));
		return v;
	}


	
	
	public void setScbcrseSubjCode(NString value){
		this.setValue("SCBCRSE_SUBJ_CODE", value.getValue());
	}


	public NString getScbcrseSubjCode(){
		NString v = new NString((String)this.getValue("SCBCRSE_SUBJ_CODE"));
		return v;
	}


	
	
	public void setScbcrseEffTerm(NString value){
		this.setValue("SCBCRSE_EFF_TERM", value.getValue());
	}


	public NString getScbcrseEffTerm(){
		NString v = new NString((String)this.getValue("SCBCRSE_EFF_TERM"));
		return v;
	}


	
	
	public void setScbcrseTitle(NString value){
		this.setValue("SCBCRSE_TITLE", value.getValue());
	}


	public NString getScbcrseTitle(){
		NString v = new NString((String)this.getValue("SCBCRSE_TITLE"));
		return v;
	}


	
	
	public void setScbcrkyTermCodeEnd(NString value){
		this.setValue("SCBCRKY_TERM_CODE_END", value.getValue());
	}


	public NString getScbcrkyTermCodeEnd(){
		NString v = new NString((String)this.getValue("SCBCRKY_TERM_CODE_END"));
		return v;
	}


	
	
	public void setScbcrseCollCode(NString value){
		this.setValue("SCBCRSE_COLL_CODE", value.getValue());
	}


	public NString getScbcrseCollCode(){
		NString v = new NString((String)this.getValue("SCBCRSE_COLL_CODE"));
		return v;
	}


	
	
	public void setCollegeDescription(NString value){
		this.setValue("COLLEGE_DESCRIPTION", value.getValue());
	}


	public NString getCollegeDescription(){
		NString v = new NString((String)this.getValue("COLLEGE_DESCRIPTION"));
		return v;
	}


	
	
	public void setScbcrseDeptCode(NString value){
		this.setValue("SCBCRSE_DEPT_CODE", value.getValue());
	}


	public NString getScbcrseDeptCode(){
		NString v = new NString((String)this.getValue("SCBCRSE_DEPT_CODE"));
		return v;
	}


	
	
	public void setDepartmentDescription(NString value){
		this.setValue("DEPARTMENT_DESCRIPTION", value.getValue());
	}


	public NString getDepartmentDescription(){
		NString v = new NString((String)this.getValue("DEPARTMENT_DESCRIPTION"));
		return v;
	}


	
	
	public void setScbcrseCstaCode(NString value){
		this.setValue("SCBCRSE_CSTA_CODE", value.getValue());
	}


	public NString getScbcrseCstaCode(){
		NString v = new NString((String)this.getValue("SCBCRSE_CSTA_CODE"));
		return v;
	}


	
	
	public void setStatusDescription(NString value){
		this.setValue("STATUS_DESCRIPTION", value.getValue());
	}


	public NString getStatusDescription(){
		NString v = new NString((String)this.getValue("STATUS_DESCRIPTION"));
		return v;
	}


	
	
	public void setScbcrseCreditHrLow(NNumber value){
		this.setValue("SCBCRSE_CREDIT_HR_LOW", value.getValue());
	}


	public NNumber getScbcrseCreditHrLow(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SCBCRSE_CREDIT_HR_LOW"));
		return v;
	}


	
	
	public void setScbcrseCreditHrInd(NString value){
		this.setValue("SCBCRSE_CREDIT_HR_IND", value.getValue());
	}


	public NString getScbcrseCreditHrInd(){
		NString v = new NString((String)this.getValue("SCBCRSE_CREDIT_HR_IND"));
		return v;
	}


	
	
	public void setScbcrseCreditHrHigh(NNumber value){
		this.setValue("SCBCRSE_CREDIT_HR_HIGH", value.getValue());
	}


	public NNumber getScbcrseCreditHrHigh(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SCBCRSE_CREDIT_HR_HIGH"));
		return v;
	}


	
	
	public void setScbcrseBillHrLow(NNumber value){
		this.setValue("SCBCRSE_BILL_HR_LOW", value.getValue());
	}


	public NNumber getScbcrseBillHrLow(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SCBCRSE_BILL_HR_LOW"));
		return v;
	}


	
	
	public void setScbcrseBillHrInd(NString value){
		this.setValue("SCBCRSE_BILL_HR_IND", value.getValue());
	}


	public NString getScbcrseBillHrInd(){
		NString v = new NString((String)this.getValue("SCBCRSE_BILL_HR_IND"));
		return v;
	}


	
	
	public void setScbcrseBillHrHigh(NNumber value){
		this.setValue("SCBCRSE_BILL_HR_HIGH", value.getValue());
	}


	public NNumber getScbcrseBillHrHigh(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SCBCRSE_BILL_HR_HIGH"));
		return v;
	}


	
	
	public void setScbcrseRepeatLimit(NNumber value){
		this.setValue("SCBCRSE_REPEAT_LIMIT", value.getValue());
	}


	public NNumber getScbcrseRepeatLimit(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SCBCRSE_REPEAT_LIMIT"));
		return v;
	}


	
	
	public void setScbcrseMaxRptUnits(NNumber value){
		this.setValue("SCBCRSE_MAX_RPT_UNITS", value.getValue());
	}


	public NNumber getScbcrseMaxRptUnits(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SCBCRSE_MAX_RPT_UNITS"));
		return v;
	}


	
	
	public void setScbcrseRepsCode(NString value){
		this.setValue("SCBCRSE_REPS_CODE", value.getValue());
	}


	public NString getScbcrseRepsCode(){
		NString v = new NString((String)this.getValue("SCBCRSE_REPS_CODE"));
		return v;
	}


	
	
}
