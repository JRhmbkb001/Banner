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



public class Scrrcam2Adapter extends BaseRowAdapter{
	

	public Scrrcam2Adapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScrrcamEffTerm(NString value){
		this.setValue("SCRRCAM_EFF_TERM", value.getValue());
	}


	public NString getScrrcamEffTerm(){
		NString v = new NString((String)this.getValue("SCRRCAM_EFF_TERM"));
		return v;
	}


	
	
	public void setScrrcamSubjCode(NString value){
		this.setValue("SCRRCAM_SUBJ_CODE", value.getValue());
	}


	public NString getScrrcamSubjCode(){
		NString v = new NString((String)this.getValue("SCRRCAM_SUBJ_CODE"));
		return v;
	}


	
	
	public void setScrrcamCrseNumb(NString value){
		this.setValue("SCRRCAM_CRSE_NUMB", value.getValue());
	}


	public NString getScrrcamCrseNumb(){
		NString v = new NString((String)this.getValue("SCRRCAM_CRSE_NUMB"));
		return v;
	}


	
	
	public void setScrrcamCampCode(NString value){
		this.setValue("SCRRCAM_CAMP_CODE", value.getValue());
	}


	public NString getScrrcamCampCode(){
		NString v = new NString((String)this.getValue("SCRRCAM_CAMP_CODE"));
		return v;
	}


	
	
	public void setCampDescription(NString value){
		this.setValue("CAMP_DESCRIPTION", value.getValue());
	}


	public NString getCampDescription(){
		NString v = new NString((String)this.getValue("CAMP_DESCRIPTION"));
		return v;
	}


	
	
}
