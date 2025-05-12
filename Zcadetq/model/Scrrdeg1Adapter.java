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



public class Scrrdeg1Adapter extends BaseRowAdapter{
	

	public Scrrdeg1Adapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScrrdegTermCodeEffective(NString value){
		this.setValue("SCRRDEG_TERM_CODE_EFFECTIVE", value.getValue());
	}


	public NString getScrrdegTermCodeEffective(){
		NString v = new NString((String)this.getValue("SCRRDEG_TERM_CODE_EFFECTIVE"));
		return v;
	}


	
	
	public void setScrrdegSubjCode(NString value){
		this.setValue("SCRRDEG_SUBJ_CODE", value.getValue());
	}


	public NString getScrrdegSubjCode(){
		NString v = new NString((String)this.getValue("SCRRDEG_SUBJ_CODE"));
		return v;
	}


	
	
	public void setScrrdegCrseNumb(NString value){
		this.setValue("SCRRDEG_CRSE_NUMB", value.getValue());
	}


	public NString getScrrdegCrseNumb(){
		NString v = new NString((String)this.getValue("SCRRDEG_CRSE_NUMB"));
		return v;
	}


	
	
	public void setScrrdegDegcInd(NString value){
		this.setValue("SCRRDEG_DEGC_IND", value.getValue());
	}


	public NString getScrrdegDegcInd(){
		NString v = new NString((String)this.getValue("SCRRDEG_DEGC_IND"));
		return v;
	}


	
	
	public void setScrrdegTermCodeFrom(NString value){
		this.setValue("SCRRDEG_TERM_CODE_FROM", value.getValue());
	}


	public NString getScrrdegTermCodeFrom(){
		NString v = new NString((String)this.getValue("SCRRDEG_TERM_CODE_FROM"));
		return v;
	}


	
	
	public void setScrrdegTermCodeTo(NString value){
		this.setValue("SCRRDEG_TERM_CODE_TO", value.getValue());
	}


	public NString getScrrdegTermCodeTo(){
		NString v = new NString((String)this.getValue("SCRRDEG_TERM_CODE_TO"));
		return v;
	}


	
	
}
