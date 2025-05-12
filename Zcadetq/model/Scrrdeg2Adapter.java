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



public class Scrrdeg2Adapter extends BaseRowAdapter{
	

	public Scrrdeg2Adapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScrrdegDegcCode(NString value){
		this.setValue("SCRRDEG_DEGC_CODE", value.getValue());
	}


	public NString getScrrdegDegcCode(){
		NString v = new NString((String)this.getValue("SCRRDEG_DEGC_CODE"));
		return v;
	}


	
	
	public void setDegcDescription(NString value){
		this.setValue("DEGC_DESCRIPTION", value.getValue());
	}


	public NString getDegcDescription(){
		NString v = new NString((String)this.getValue("DEGC_DESCRIPTION"));
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


	
	
	public void setScrrdegTermCodeEffective(NString value){
		this.setValue("SCRRDEG_TERM_CODE_EFFECTIVE", value.getValue());
	}


	public NString getScrrdegTermCodeEffective(){
		NString v = new NString((String)this.getValue("SCRRDEG_TERM_CODE_EFFECTIVE"));
		return v;
	}


	
	
}
