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



public class Scrrcls2Adapter extends BaseRowAdapter{
	

	public Scrrcls2Adapter(DataRow row, IDBBusinessObject businessObject) {
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


	
	
	public void setScrrclsClasCode(NString value){
		this.setValue("SCRRCLS_CLAS_CODE", value.getValue());
	}


	public NString getScrrclsClasCode(){
		NString v = new NString((String)this.getValue("SCRRCLS_CLAS_CODE"));
		return v;
	}


	
	
	public void setStvclasDesc(NString value){
		this.setValue("STVCLAS_DESC", value.getValue());
	}


	public NString getStvclasDesc(){
		NString v = new NString((String)this.getValue("STVCLAS_DESC"));
		return v;
	}


	
	
}
