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



public class Scrrprg1Adapter extends BaseRowAdapter{
	

	public Scrrprg1Adapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScrrprgTermCodeEffective(NString value){
		this.setValue("SCRRPRG_TERM_CODE_EFFECTIVE", value.getValue());
	}


	public NString getScrrprgTermCodeEffective(){
		NString v = new NString((String)this.getValue("SCRRPRG_TERM_CODE_EFFECTIVE"));
		return v;
	}


	
	
	public void setScrrprgCrseNumb(NString value){
		this.setValue("SCRRPRG_CRSE_NUMB", value.getValue());
	}


	public NString getScrrprgCrseNumb(){
		NString v = new NString((String)this.getValue("SCRRPRG_CRSE_NUMB"));
		return v;
	}


	
	
	public void setScrrprgProgramInd(NString value){
		this.setValue("SCRRPRG_PROGRAM_IND", value.getValue());
	}


	public NString getScrrprgProgramInd(){
		NString v = new NString((String)this.getValue("SCRRPRG_PROGRAM_IND"));
		return v;
	}


	
	
	public void setScrrprgTermCodeTo(NString value){
		this.setValue("SCRRPRG_TERM_CODE_TO", value.getValue());
	}


	public NString getScrrprgTermCodeTo(){
		NString v = new NString((String)this.getValue("SCRRPRG_TERM_CODE_TO"));
		return v;
	}


	
	
	public void setScrrprgTermCodeFrom(NString value){
		this.setValue("SCRRPRG_TERM_CODE_FROM", value.getValue());
	}


	public NString getScrrprgTermCodeFrom(){
		NString v = new NString((String)this.getValue("SCRRPRG_TERM_CODE_FROM"));
		return v;
	}


	
	
}
