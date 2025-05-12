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



public class ScrschdAdapter extends BaseRowAdapter{
	

	public ScrschdAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScrschdSubjCode(NString value){
		this.setValue("SCRSCHD_SUBJ_CODE", value.getValue());
	}


	public NString getScrschdSubjCode(){
		NString v = new NString((String)this.getValue("SCRSCHD_SUBJ_CODE"));
		return v;
	}


	
	
	public void setScrschdCrseNumb(NString value){
		this.setValue("SCRSCHD_CRSE_NUMB", value.getValue());
	}


	public NString getScrschdCrseNumb(){
		NString v = new NString((String)this.getValue("SCRSCHD_CRSE_NUMB"));
		return v;
	}


	
	
	public void setScrschdEffTerm(NString value){
		this.setValue("SCRSCHD_EFF_TERM", value.getValue());
	}


	public NString getScrschdEffTerm(){
		NString v = new NString((String)this.getValue("SCRSCHD_EFF_TERM"));
		return v;
	}


	
	
	public void setScrschdActivityDate(NDate value){
		this.setValue("SCRSCHD_ACTIVITY_DATE", value.getValue());
	}


	public NDate getScrschdActivityDate(){
		NDate v = new NDate((Date)this.getValue("SCRSCHD_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setSchdInsert(NString value){
		this.setValue("SCHD_INSERT", value.getValue());
	}


	public NString getSchdInsert(){
		NString v = new NString((String)this.getValue("SCHD_INSERT"));
		return v;
	}


	
	
	public void setScrschdSchdCode(NString value){
		this.setValue("SCRSCHD_SCHD_CODE", value.getValue());
	}


	public NString getScrschdSchdCode(){
		NString v = new NString((String)this.getValue("SCRSCHD_SCHD_CODE"));
		return v;
	}


	
	
	public void setScrschdSeq(NString value){
		this.setValue("SCRSCHD_SEQ", value.getValue());
	}


	public NString getScrschdSeq(){
		NString v = new NString((String)this.getValue("SCRSCHD_SEQ"));
		return v;
	}


	
	
	public void setSchdDescription(NString value){
		this.setValue("SCHD_DESCRIPTION", value.getValue());
	}


	public NString getSchdDescription(){
		NString v = new NString((String)this.getValue("SCHD_DESCRIPTION"));
		return v;
	}


	
	
}
