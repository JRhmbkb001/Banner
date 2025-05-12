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



public class Scrrprg2Adapter extends BaseRowAdapter{
	

	public Scrrprg2Adapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScrrprgProgram(NString value){
		this.setValue("SCRRPRG_PROGRAM", value.getValue());
	}


	public NString getScrrprgProgram(){
		NString v = new NString((String)this.getValue("SCRRPRG_PROGRAM"));
		return v;
	}


	
	
	public void setProgramDescription(NString value){
		this.setValue("PROGRAM_DESCRIPTION", value.getValue());
	}


	public NString getProgramDescription(){
		NString v = new NString((String)this.getValue("PROGRAM_DESCRIPTION"));
		return v;
	}


	
	
	public void setScrrprgSubjCode(NString value){
		this.setValue("SCRRPRG_SUBJ_CODE", value.getValue());
	}


	public NString getScrrprgSubjCode(){
		NString v = new NString((String)this.getValue("SCRRPRG_SUBJ_CODE"));
		return v;
	}


	
	
	public void setScrrprgCrseNumb(NString value){
		this.setValue("SCRRPRG_CRSE_NUMB", value.getValue());
	}


	public NString getScrrprgCrseNumb(){
		NString v = new NString((String)this.getValue("SCRRPRG_CRSE_NUMB"));
		return v;
	}


	
	
	public void setScrrprgTermCodeEffective(NString value){
		this.setValue("SCRRPRG_TERM_CODE_EFFECTIVE", value.getValue());
	}


	public NString getScrrprgTermCodeEffective(){
		NString v = new NString((String)this.getValue("SCRRPRG_TERM_CODE_EFFECTIVE"));
		return v;
	}


	
	
}
