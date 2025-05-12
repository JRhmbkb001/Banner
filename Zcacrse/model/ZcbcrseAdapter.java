package  net.hedtech.ucdavis.ps.banner.student.Zcacrse.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class ZcbcrseAdapter extends BaseRowAdapter{
	

	public ZcbcrseAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setCrseInsert(NString value){
		this.setValue("CRSE_INSERT", value.getValue());
	}


	public NString getCrseInsert(){
		NString v = new NString((String)this.getValue("CRSE_INSERT"));
		return v;
	}


	
	
	public void setZcbcrseEndcopy(NString value){
		this.setValue("ZCBCRSE_ENDCOPY", value.getValue());
	}


	public NString getZcbcrseEndcopy(){
		NString v = new NString((String)this.getValue("ZCBCRSE_ENDCOPY"));
		return v;
	}


	
	
	public void setEndCrse(NString value){
		this.setValue("END_CRSE", value.getValue());
	}


	public NString getEndCrse(){
		NString v = new NString((String)this.getValue("END_CRSE"));
		return v;
	}


	
	
	public void setZcbcrseSubjCode(NString value){
		this.setValue("ZCBCRSE_SUBJ_CODE", value.getValue());
	}


	public NString getZcbcrseSubjCode(){
		NString v = new NString((String)this.getValue("ZCBCRSE_SUBJ_CODE"));
		return v;
	}


	
	
	public void setZcbcrseCrseNumb(NString value){
		this.setValue("ZCBCRSE_CRSE_NUMB", value.getValue());
	}


	public NString getZcbcrseCrseNumb(){
		NString v = new NString((String)this.getValue("ZCBCRSE_CRSE_NUMB"));
		return v;
	}


	
	
	public void setZcbcrseEffTerm(NString value){
		this.setValue("ZCBCRSE_EFF_TERM", value.getValue());
	}


	public NString getZcbcrseEffTerm(){
		NString v = new NString((String)this.getValue("ZCBCRSE_EFF_TERM"));
		return v;
	}


	
	
	public void setZcbcrseSubjCodeXlist(NString value){
		this.setValue("ZCBCRSE_SUBJ_CODE_XLIST", value.getValue());
	}


	public NString getZcbcrseSubjCodeXlist(){
		NString v = new NString((String)this.getValue("ZCBCRSE_SUBJ_CODE_XLIST"));
		return v;
	}


	
	
	public void setZcbcrseSubjCodeXlistDesc(NString value){
		this.setValue("ZCBCRSE_SUBJ_CODE_XLIST_DESC", value.getValue());
	}


	public NString getZcbcrseSubjCodeXlistDesc(){
		NString v = new NString((String)this.getValue("ZCBCRSE_SUBJ_CODE_XLIST_DESC"));
		return v;
	}


	
	
	public void setZcbcrseCrseNumbXlist(NString value){
		this.setValue("ZCBCRSE_CRSE_NUMB_XLIST", value.getValue());
	}


	public NString getZcbcrseCrseNumbXlist(){
		NString v = new NString((String)this.getValue("ZCBCRSE_CRSE_NUMB_XLIST"));
		return v;
	}


	
	
	public void setZcbcrseDuplOverInd(NString value){
		this.setValue("ZCBCRSE_DUPL_OVER_IND", value.getValue());
	}


	public NString getZcbcrseDuplOverInd(){
		NString v = new NString((String)this.getValue("ZCBCRSE_DUPL_OVER_IND"));
		return v;
	}


	
	
	public void setZcbcrseDataOrigin(NString value){
		this.setValue("ZCBCRSE_DATA_ORIGIN", value.getValue());
	}


	public NString getZcbcrseDataOrigin(){
		NString v = new NString((String)this.getValue("ZCBCRSE_DATA_ORIGIN"));
		return v;
	}


	
	
	public void setZcbcrseUserId(NString value){
		this.setValue("ZCBCRSE_USER_ID", value.getValue());
	}


	public NString getZcbcrseUserId(){
		NString v = new NString((String)this.getValue("ZCBCRSE_USER_ID"));
		return v;
	}


	
	
	public void setZcbcrseActivityDate(NDate value){
		this.setValue("ZCBCRSE_ACTIVITY_DATE", value.getValue());
	}


	public NDate getZcbcrseActivityDate(){
		NDate v = new NDate((Date)this.getValue("ZCBCRSE_ACTIVITY_DATE"));
		return v;
	}


	
	
}
