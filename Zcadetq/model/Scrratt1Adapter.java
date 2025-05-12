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



public class Scrratt1Adapter extends BaseRowAdapter{
	

	public Scrratt1Adapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScrrattEffTerm(NString value){
		this.setValue("SCRRATT_EFF_TERM", value.getValue());
	}


	public NString getScrrattEffTerm(){
		NString v = new NString((String)this.getValue("SCRRATT_EFF_TERM"));
		return v;
	}


	
	
	public void setScrrattSubjCode(NString value){
		this.setValue("SCRRATT_SUBJ_CODE", value.getValue());
	}


	public NString getScrrattSubjCode(){
		NString v = new NString((String)this.getValue("SCRRATT_SUBJ_CODE"));
		return v;
	}


	
	
	public void setScrrattCrseNumb(NString value){
		this.setValue("SCRRATT_CRSE_NUMB", value.getValue());
	}


	public NString getScrrattCrseNumb(){
		NString v = new NString((String)this.getValue("SCRRATT_CRSE_NUMB"));
		return v;
	}


	
	
	public void setScrrattAttsIeCde(NString value){
		this.setValue("SCRRATT_ATTS_IE_CDE", value.getValue());
	}


	public NString getScrrattAttsIeCde(){
		NString v = new NString((String)this.getValue("SCRRATT_ATTS_IE_CDE"));
		return v;
	}


	
	
	public void setScrrattTermCodeFrom(NString value){
		this.setValue("SCRRATT_TERM_CODE_FROM", value.getValue());
	}


	public NString getScrrattTermCodeFrom(){
		NString v = new NString((String)this.getValue("SCRRATT_TERM_CODE_FROM"));
		return v;
	}


	
	
	public void setScrrattTermCodeTo(NString value){
		this.setValue("SCRRATT_TERM_CODE_TO", value.getValue());
	}


	public NString getScrrattTermCodeTo(){
		NString v = new NString((String)this.getValue("SCRRATT_TERM_CODE_TO"));
		return v;
	}


	
	
}
