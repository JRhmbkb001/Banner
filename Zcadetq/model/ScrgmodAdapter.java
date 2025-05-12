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



public class ScrgmodAdapter extends BaseRowAdapter{
	

	public ScrgmodAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScrgmodSubjCode(NString value){
		this.setValue("SCRGMOD_SUBJ_CODE", value.getValue());
	}


	public NString getScrgmodSubjCode(){
		NString v = new NString((String)this.getValue("SCRGMOD_SUBJ_CODE"));
		return v;
	}


	
	
	public void setScrgmodCrseNumb(NString value){
		this.setValue("SCRGMOD_CRSE_NUMB", value.getValue());
	}


	public NString getScrgmodCrseNumb(){
		NString v = new NString((String)this.getValue("SCRGMOD_CRSE_NUMB"));
		return v;
	}


	
	
	public void setScrgmodEffTerm(NString value){
		this.setValue("SCRGMOD_EFF_TERM", value.getValue());
	}


	public NString getScrgmodEffTerm(){
		NString v = new NString((String)this.getValue("SCRGMOD_EFF_TERM"));
		return v;
	}


	
	
	public void setScrgmodActivityDate(NDate value){
		this.setValue("SCRGMOD_ACTIVITY_DATE", value.getValue());
	}


	public NDate getScrgmodActivityDate(){
		NDate v = new NDate((Date)this.getValue("SCRGMOD_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setGmodInsert(NString value){
		this.setValue("GMOD_INSERT", value.getValue());
	}


	public NString getGmodInsert(){
		NString v = new NString((String)this.getValue("GMOD_INSERT"));
		return v;
	}


	
	
	public void setTempDef(NString value){
		this.setValue("TEMP_DEF", value.getValue());
	}


	public NString getTempDef(){
		NString v = new NString((String)this.getValue("TEMP_DEF"));
		return v;
	}


	
	
	public void setScrgmodGmodCode(NString value){
		this.setValue("SCRGMOD_GMOD_CODE", value.getValue());
	}


	public NString getScrgmodGmodCode(){
		NString v = new NString((String)this.getValue("SCRGMOD_GMOD_CODE"));
		return v;
	}


	
	
	public void setStvgmodDescription(NString value){
		this.setValue("STVGMOD_DESCRIPTION", value.getValue());
	}


	public NString getStvgmodDescription(){
		NString v = new NString((String)this.getValue("STVGMOD_DESCRIPTION"));
		return v;
	}


	
	
}
