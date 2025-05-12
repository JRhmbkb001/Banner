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



public class Scrrdep2Adapter extends BaseRowAdapter{
	

	public Scrrdep2Adapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScrrdepDeptCode(NString value){
		this.setValue("SCRRDEP_DEPT_CODE", value.getValue());
	}


	public NString getScrrdepDeptCode(){
		NString v = new NString((String)this.getValue("SCRRDEP_DEPT_CODE"));
		return v;
	}


	
	
	public void setStvdeptDesc(NString value){
		this.setValue("STVDEPT_DESC", value.getValue());
	}


	public NString getStvdeptDesc(){
		NString v = new NString((String)this.getValue("STVDEPT_DESC"));
		return v;
	}


	
	
	public void setScrrdepSubjCode(NString value){
		this.setValue("SCRRDEP_SUBJ_CODE", value.getValue());
	}


	public NString getScrrdepSubjCode(){
		NString v = new NString((String)this.getValue("SCRRDEP_SUBJ_CODE"));
		return v;
	}


	
	
	public void setScrrdepCrseNumb(NString value){
		this.setValue("SCRRDEP_CRSE_NUMB", value.getValue());
	}


	public NString getScrrdepCrseNumb(){
		NString v = new NString((String)this.getValue("SCRRDEP_CRSE_NUMB"));
		return v;
	}


	
	
	public void setScrrdepEffTerm(NString value){
		this.setValue("SCRRDEP_EFF_TERM", value.getValue());
	}


	public NString getScrrdepEffTerm(){
		NString v = new NString((String)this.getValue("SCRRDEP_EFF_TERM"));
		return v;
	}


	
	
}
