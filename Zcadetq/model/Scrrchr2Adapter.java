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



public class Scrrchr2Adapter extends BaseRowAdapter{
	

	public Scrrchr2Adapter(DataRow row, IDBBusinessObject businessObject) {
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


	
	
	public void setScrrchrChrtCode(NString value){
		this.setValue("SCRRCHR_CHRT_CODE", value.getValue());
	}


	public NString getScrrchrChrtCode(){
		NString v = new NString((String)this.getValue("SCRRCHR_CHRT_CODE"));
		return v;
	}


	
	
	public void setStvchrtDesc(NString value){
		this.setValue("STVCHRT_DESC", value.getValue());
	}


	public NString getStvchrtDesc(){
		NString v = new NString((String)this.getValue("STVCHRT_DESC"));
		return v;
	}


	
	
}
