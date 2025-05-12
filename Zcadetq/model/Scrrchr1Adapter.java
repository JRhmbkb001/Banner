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



public class Scrrchr1Adapter extends BaseRowAdapter{
	

	public Scrrchr1Adapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScrrchrEffTerm(NString value){
		this.setValue("SCRRCHR_EFF_TERM", value.getValue());
	}


	public NString getScrrchrEffTerm(){
		NString v = new NString((String)this.getValue("SCRRCHR_EFF_TERM"));
		return v;
	}


	
	
	public void setScrrchrSubjCode(NString value){
		this.setValue("SCRRCHR_SUBJ_CODE", value.getValue());
	}


	public NString getScrrchrSubjCode(){
		NString v = new NString((String)this.getValue("SCRRCHR_SUBJ_CODE"));
		return v;
	}


	
	
	public void setScrrchrCrseNumb(NString value){
		this.setValue("SCRRCHR_CRSE_NUMB", value.getValue());
	}


	public NString getScrrchrCrseNumb(){
		NString v = new NString((String)this.getValue("SCRRCHR_CRSE_NUMB"));
		return v;
	}


	
	
	public void setScrrchrChrtIeCde(NString value){
		this.setValue("SCRRCHR_CHRT_IE_CDE", value.getValue());
	}


	public NString getScrrchrChrtIeCde(){
		NString v = new NString((String)this.getValue("SCRRCHR_CHRT_IE_CDE"));
		return v;
	}


	
	
	public void setScrrchrTermCodeFrom(NString value){
		this.setValue("SCRRCHR_TERM_CODE_FROM", value.getValue());
	}


	public NString getScrrchrTermCodeFrom(){
		NString v = new NString((String)this.getValue("SCRRCHR_TERM_CODE_FROM"));
		return v;
	}


	
	
	public void setScrrchrTermCodeTo(NString value){
		this.setValue("SCRRCHR_TERM_CODE_TO", value.getValue());
	}


	public NString getScrrchrTermCodeTo(){
		NString v = new NString((String)this.getValue("SCRRCHR_TERM_CODE_TO"));
		return v;
	}


	
	
}
