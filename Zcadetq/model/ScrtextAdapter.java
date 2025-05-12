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



public class ScrtextAdapter extends BaseRowAdapter{
	

	public ScrtextAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScrtextActivityDate(NDate value){
		this.setValue("SCRTEXT_ACTIVITY_DATE", value.getValue());
	}


	public NDate getScrtextActivityDate(){
		NDate v = new NDate((Date)this.getValue("SCRTEXT_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setScrtextTextCode(NString value){
		this.setValue("SCRTEXT_TEXT_CODE", value.getValue());
	}


	public NString getScrtextTextCode(){
		NString v = new NString((String)this.getValue("SCRTEXT_TEXT_CODE"));
		return v;
	}


	
	
	public void setScrtextEffTerm(NString value){
		this.setValue("SCRTEXT_EFF_TERM", value.getValue());
	}


	public NString getScrtextEffTerm(){
		NString v = new NString((String)this.getValue("SCRTEXT_EFF_TERM"));
		return v;
	}


	
	
	public void setScrtextCrseNumb(NString value){
		this.setValue("SCRTEXT_CRSE_NUMB", value.getValue());
	}


	public NString getScrtextCrseNumb(){
		NString v = new NString((String)this.getValue("SCRTEXT_CRSE_NUMB"));
		return v;
	}


	
	
	public void setScrtextSubjCode(NString value){
		this.setValue("SCRTEXT_SUBJ_CODE", value.getValue());
	}


	public NString getScrtextSubjCode(){
		NString v = new NString((String)this.getValue("SCRTEXT_SUBJ_CODE"));
		return v;
	}


	
	
	public void setTextInsert(NString value){
		this.setValue("TEXT_INSERT", value.getValue());
	}


	public NString getTextInsert(){
		NString v = new NString((String)this.getValue("TEXT_INSERT"));
		return v;
	}


	
	
	public void setEndText(NString value){
		this.setValue("END_TEXT", value.getValue());
	}


	public NString getEndText(){
		NString v = new NString((String)this.getValue("END_TEXT"));
		return v;
	}


	
	
	public void setScrtextSeqno(NNumber value){
		this.setValue("SCRTEXT_SEQNO", value.getValue());
	}


	public NNumber getScrtextSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SCRTEXT_SEQNO"));
		return v;
	}


	
	
	public void setScrtextText(NString value){
		this.setValue("SCRTEXT_TEXT", value.getValue());
	}


	public NString getScrtextText(){
		NString v = new NString((String)this.getValue("SCRTEXT_TEXT"));
		return v;
	}


	
	
}
