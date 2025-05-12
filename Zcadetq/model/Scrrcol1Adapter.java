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



public class Scrrcol1Adapter extends BaseRowAdapter{
	

	public Scrrcol1Adapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScrrcolEffTerm(NString value){
		this.setValue("SCRRCOL_EFF_TERM", value.getValue());
	}


	public NString getScrrcolEffTerm(){
		NString v = new NString((String)this.getValue("SCRRCOL_EFF_TERM"));
		return v;
	}


	
	
	public void setScrrcolSubjCode(NString value){
		this.setValue("SCRRCOL_SUBJ_CODE", value.getValue());
	}


	public NString getScrrcolSubjCode(){
		NString v = new NString((String)this.getValue("SCRRCOL_SUBJ_CODE"));
		return v;
	}


	
	
	public void setScrrcolCrseNumb(NString value){
		this.setValue("SCRRCOL_CRSE_NUMB", value.getValue());
	}


	public NString getScrrcolCrseNumb(){
		NString v = new NString((String)this.getValue("SCRRCOL_CRSE_NUMB"));
		return v;
	}


	
	
	public void setScrrcolCollInd(NString value){
		this.setValue("SCRRCOL_COLL_IND", value.getValue());
	}


	public NString getScrrcolCollInd(){
		NString v = new NString((String)this.getValue("SCRRCOL_COLL_IND"));
		return v;
	}


	
	
	public void setScrrcolTermCodeFrom(NString value){
		this.setValue("SCRRCOL_TERM_CODE_FROM", value.getValue());
	}


	public NString getScrrcolTermCodeFrom(){
		NString v = new NString((String)this.getValue("SCRRCOL_TERM_CODE_FROM"));
		return v;
	}


	
	
	public void setScrrcolTermCodeTo(NString value){
		this.setValue("SCRRCOL_TERM_CODE_TO", value.getValue());
	}


	public NString getScrrcolTermCodeTo(){
		NString v = new NString((String)this.getValue("SCRRCOL_TERM_CODE_TO"));
		return v;
	}


	
	
}
