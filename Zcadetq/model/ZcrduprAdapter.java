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



public class ZcrduprAdapter extends BaseRowAdapter{
	

	public ZcrduprAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setZcrduprSubjCode(NString value){
		this.setValue("ZCRDUPR_SUBJ_CODE", value.getValue());
	}


	public NString getZcrduprSubjCode(){
		NString v = new NString((String)this.getValue("ZCRDUPR_SUBJ_CODE"));
		return v;
	}


	
	
	public void setZcrduprSubjCodeDesc(NString value){
		this.setValue("ZCRDUPR_SUBJ_CODE_DESC", value.getValue());
	}


	public NString getZcrduprSubjCodeDesc(){
		NString v = new NString((String)this.getValue("ZCRDUPR_SUBJ_CODE_DESC"));
		return v;
	}


	
	
	public void setZcrduprCrseNumb(NString value){
		this.setValue("ZCRDUPR_CRSE_NUMB", value.getValue());
	}


	public NString getZcrduprCrseNumb(){
		NString v = new NString((String)this.getValue("ZCRDUPR_CRSE_NUMB"));
		return v;
	}


	
	
	public void setZcrduprTermCodeStart(NString value){
		this.setValue("ZCRDUPR_TERM_CODE_START", value.getValue());
	}


	public NString getZcrduprTermCodeStart(){
		NString v = new NString((String)this.getValue("ZCRDUPR_TERM_CODE_START"));
		return v;
	}


	
	
	public void setZcrduprTermCodeEnd(NString value){
		this.setValue("ZCRDUPR_TERM_CODE_END", value.getValue());
	}


	public NString getZcrduprTermCodeEnd(){
		NString v = new NString((String)this.getValue("ZCRDUPR_TERM_CODE_END"));
		return v;
	}


	
	
	public void setZcrduprGrdeCodeMin(NString value){
		this.setValue("ZCRDUPR_GRDE_CODE_MIN", value.getValue());
	}


	public NString getZcrduprGrdeCodeMin(){
		NString v = new NString((String)this.getValue("ZCRDUPR_GRDE_CODE_MIN"));
		return v;
	}


	
	
	public void setZcrduprDupcRule(NNumber value){
		this.setValue("ZCRDUPR_DUPC_RULE", value.getValue());
	}


	public NNumber getZcrduprDupcRule(){
		NNumber v = new NNumber((BigDecimal)this.getValue("ZCRDUPR_DUPC_RULE"));
		return v;
	}


	
	
	public void setZcrduprActivityDate(NDate value){
		this.setValue("ZCRDUPR_ACTIVITY_DATE", value.getValue());
	}


	public NDate getZcrduprActivityDate(){
		NDate v = new NDate((Date)this.getValue("ZCRDUPR_ACTIVITY_DATE"));
		return v;
	}


	
	
}
