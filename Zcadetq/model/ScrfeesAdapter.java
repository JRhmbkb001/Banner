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



public class ScrfeesAdapter extends BaseRowAdapter{
	

	public ScrfeesAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScrfeesActivityDate(NDate value){
		this.setValue("SCRFEES_ACTIVITY_DATE", value.getValue());
	}


	public NDate getScrfeesActivityDate(){
		NDate v = new NDate((Date)this.getValue("SCRFEES_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setScrfeesEffTerm(NString value){
		this.setValue("SCRFEES_EFF_TERM", value.getValue());
	}


	public NString getScrfeesEffTerm(){
		NString v = new NString((String)this.getValue("SCRFEES_EFF_TERM"));
		return v;
	}


	
	
	public void setScrfeesSubjCode(NString value){
		this.setValue("SCRFEES_SUBJ_CODE", value.getValue());
	}


	public NString getScrfeesSubjCode(){
		NString v = new NString((String)this.getValue("SCRFEES_SUBJ_CODE"));
		return v;
	}


	
	
	public void setScrfeesCrseNumb(NString value){
		this.setValue("SCRFEES_CRSE_NUMB", value.getValue());
	}


	public NString getScrfeesCrseNumb(){
		NString v = new NString((String)this.getValue("SCRFEES_CRSE_NUMB"));
		return v;
	}


	
	
	public void setFeesInsert(NString value){
		this.setValue("FEES_INSERT", value.getValue());
	}


	public NString getFeesInsert(){
		NString v = new NString((String)this.getValue("FEES_INSERT"));
		return v;
	}


	
	
	public void setEndFees(NString value){
		this.setValue("END_FEES", value.getValue());
	}


	public NString getEndFees(){
		NString v = new NString((String)this.getValue("END_FEES"));
		return v;
	}


	
	
	public void setScrfeesFeeIndInd(NNumber value){
		this.setValue("SCRFEES_FEE_IND_IND", value.getValue());
	}


	public NNumber getScrfeesFeeIndInd(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SCRFEES_FEE_IND_IND"));
		return v;
	}


	
	
	public void setScrfeesDetlCode(NString value){
		this.setValue("SCRFEES_DETL_CODE", value.getValue());
	}


	public NString getScrfeesDetlCode(){
		NString v = new NString((String)this.getValue("SCRFEES_DETL_CODE"));
		return v;
	}


	
	
	public void setTbbdetcDesc(NString value){
		this.setValue("TBBDETC_DESC", value.getValue());
	}


	public NString getTbbdetcDesc(){
		NString v = new NString((String)this.getValue("TBBDETC_DESC"));
		return v;
	}


	
	
	public void setScrfeesFeeAmount(NNumber value){
		this.setValue("SCRFEES_FEE_AMOUNT", value.getValue());
	}


	public NNumber getScrfeesFeeAmount(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SCRFEES_FEE_AMOUNT"));
		return v;
	}


	
	
	public void setScrfeesFeeInd(NString value){
		this.setValue("SCRFEES_FEE_IND", value.getValue());
	}


	public NString getScrfeesFeeInd(){
		NString v = new NString((String)this.getValue("SCRFEES_FEE_IND"));
		return v;
	}


	
	
}
