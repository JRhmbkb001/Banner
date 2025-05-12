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



public class ScrlevlAdapter extends BaseRowAdapter{
	

	public ScrlevlAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScrlevlSubjCode(NString value){
		this.setValue("SCRLEVL_SUBJ_CODE", value.getValue());
	}


	public NString getScrlevlSubjCode(){
		NString v = new NString((String)this.getValue("SCRLEVL_SUBJ_CODE"));
		return v;
	}


	
	
	public void setScrlevlCrseNumb(NString value){
		this.setValue("SCRLEVL_CRSE_NUMB", value.getValue());
	}


	public NString getScrlevlCrseNumb(){
		NString v = new NString((String)this.getValue("SCRLEVL_CRSE_NUMB"));
		return v;
	}


	
	
	public void setScrlevlEffTerm(NString value){
		this.setValue("SCRLEVL_EFF_TERM", value.getValue());
	}


	public NString getScrlevlEffTerm(){
		NString v = new NString((String)this.getValue("SCRLEVL_EFF_TERM"));
		return v;
	}


	
	
	public void setScrlevlLevlCode(NString value){
		this.setValue("SCRLEVL_LEVL_CODE", value.getValue());
	}


	public NString getScrlevlLevlCode(){
		NString v = new NString((String)this.getValue("SCRLEVL_LEVL_CODE"));
		return v;
	}


	
	
	public void setStvlevlDesc(NString value){
		this.setValue("STVLEVL_DESC", value.getValue());
	}


	public NString getStvlevlDesc(){
		NString v = new NString((String)this.getValue("STVLEVL_DESC"));
		return v;
	}


	
	
}
