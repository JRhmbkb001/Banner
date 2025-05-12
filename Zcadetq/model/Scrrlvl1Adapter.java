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



public class Scrrlvl1Adapter extends BaseRowAdapter{
	

	public Scrrlvl1Adapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScrrlvlEffTerm(NString value){
		this.setValue("SCRRLVL_EFF_TERM", value.getValue());
	}


	public NString getScrrlvlEffTerm(){
		NString v = new NString((String)this.getValue("SCRRLVL_EFF_TERM"));
		return v;
	}


	
	
	public void setScrrlvlSubjCode(NString value){
		this.setValue("SCRRLVL_SUBJ_CODE", value.getValue());
	}


	public NString getScrrlvlSubjCode(){
		NString v = new NString((String)this.getValue("SCRRLVL_SUBJ_CODE"));
		return v;
	}


	
	
	public void setScrrlvlCrseNumb(NString value){
		this.setValue("SCRRLVL_CRSE_NUMB", value.getValue());
	}


	public NString getScrrlvlCrseNumb(){
		NString v = new NString((String)this.getValue("SCRRLVL_CRSE_NUMB"));
		return v;
	}


	
	
	public void setScrrlvlLevlInd(NString value){
		this.setValue("SCRRLVL_LEVL_IND", value.getValue());
	}


	public NString getScrrlvlLevlInd(){
		NString v = new NString((String)this.getValue("SCRRLVL_LEVL_IND"));
		return v;
	}


	
	
	public void setScrrlvlTermCodeFrom(NString value){
		this.setValue("SCRRLVL_TERM_CODE_FROM", value.getValue());
	}


	public NString getScrrlvlTermCodeFrom(){
		NString v = new NString((String)this.getValue("SCRRLVL_TERM_CODE_FROM"));
		return v;
	}


	
	
	public void setScrrlvlTermCodeTo(NString value){
		this.setValue("SCRRLVL_TERM_CODE_TO", value.getValue());
	}


	public NString getScrrlvlTermCodeTo(){
		NString v = new NString((String)this.getValue("SCRRLVL_TERM_CODE_TO"));
		return v;
	}


	
	
}
