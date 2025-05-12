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



public class ScrrmajAdapter extends BaseRowAdapter{
	

	public ScrrmajAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScrrmajMajrCode(NString value){
		this.setValue("SCRRMAJ_MAJR_CODE", value.getValue());
	}


	public NString getScrrmajMajrCode(){
		NString v = new NString((String)this.getValue("SCRRMAJ_MAJR_CODE"));
		return v;
	}


	
	
	public void setMajorDescription(NString value){
		this.setValue("MAJOR_DESCRIPTION", value.getValue());
	}


	public NString getMajorDescription(){
		NString v = new NString((String)this.getValue("MAJOR_DESCRIPTION"));
		return v;
	}


	
	
	public void setScrrmajActivityDate(NDate value){
		this.setValue("SCRRMAJ_ACTIVITY_DATE", value.getValue());
	}


	public NDate getScrrmajActivityDate(){
		NDate v = new NDate((Date)this.getValue("SCRRMAJ_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setScrrmajEffTerm(NString value){
		this.setValue("SCRRMAJ_EFF_TERM", value.getValue());
	}


	public NString getScrrmajEffTerm(){
		NString v = new NString((String)this.getValue("SCRRMAJ_EFF_TERM"));
		return v;
	}


	
	
	public void setScrrmajCrseNumb(NString value){
		this.setValue("SCRRMAJ_CRSE_NUMB", value.getValue());
	}


	public NString getScrrmajCrseNumb(){
		NString v = new NString((String)this.getValue("SCRRMAJ_CRSE_NUMB"));
		return v;
	}


	
	
	public void setScrrmajSubjCode(NString value){
		this.setValue("SCRRMAJ_SUBJ_CODE", value.getValue());
	}


	public NString getScrrmajSubjCode(){
		NString v = new NString((String)this.getValue("SCRRMAJ_SUBJ_CODE"));
		return v;
	}


	
	
	public void setScrrmajRecType(NString value){
		this.setValue("SCRRMAJ_REC_TYPE", value.getValue());
	}


	public NString getScrrmajRecType(){
		NString v = new NString((String)this.getValue("SCRRMAJ_REC_TYPE"));
		return v;
	}


	
	
	public void setScrrmajLfstCode1(NString value){
		this.setValue("scrrmaj_lfst_code", value.getValue());
	}


	public NString getScrrmajLfstCode1(){
		NString v = new NString((String)this.getValue("scrrmaj_lfst_code"));
		return v;
	}


	
	
}
