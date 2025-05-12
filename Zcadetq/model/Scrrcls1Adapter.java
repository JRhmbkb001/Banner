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



public class Scrrcls1Adapter extends BaseRowAdapter{
	

	public Scrrcls1Adapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScrrclsEffTerm(NString value){
		this.setValue("SCRRCLS_EFF_TERM", value.getValue());
	}


	public NString getScrrclsEffTerm(){
		NString v = new NString((String)this.getValue("SCRRCLS_EFF_TERM"));
		return v;
	}


	
	
	public void setScrrclsSubjCode(NString value){
		this.setValue("SCRRCLS_SUBJ_CODE", value.getValue());
	}


	public NString getScrrclsSubjCode(){
		NString v = new NString((String)this.getValue("SCRRCLS_SUBJ_CODE"));
		return v;
	}


	
	
	public void setScrrclsCrseNumb(NString value){
		this.setValue("SCRRCLS_CRSE_NUMB", value.getValue());
	}


	public NString getScrrclsCrseNumb(){
		NString v = new NString((String)this.getValue("SCRRCLS_CRSE_NUMB"));
		return v;
	}


	
	
	public void setScrrclsClassInd(NString value){
		this.setValue("SCRRCLS_CLASS_IND", value.getValue());
	}


	public NString getScrrclsClassInd(){
		NString v = new NString((String)this.getValue("SCRRCLS_CLASS_IND"));
		return v;
	}


	
	
	public void setScrrclsTermCodeFrom(NString value){
		this.setValue("SCRRCLS_TERM_CODE_FROM", value.getValue());
	}


	public NString getScrrclsTermCodeFrom(){
		NString v = new NString((String)this.getValue("SCRRCLS_TERM_CODE_FROM"));
		return v;
	}


	
	
	public void setScrrclsTermCodeTo(NString value){
		this.setValue("SCRRCLS_TERM_CODE_TO", value.getValue());
	}


	public NString getScrrclsTermCodeTo(){
		NString v = new NString((String)this.getValue("SCRRCLS_TERM_CODE_TO"));
		return v;
	}


	
	
}
