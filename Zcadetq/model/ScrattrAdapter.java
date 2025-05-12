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



public class ScrattrAdapter extends BaseRowAdapter{
	

	public ScrattrAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScrattrActivityDate(NDate value){
		this.setValue("SCRATTR_ACTIVITY_DATE", value.getValue());
	}


	public NDate getScrattrActivityDate(){
		NDate v = new NDate((Date)this.getValue("SCRATTR_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setScrattrEffTerm(NString value){
		this.setValue("SCRATTR_EFF_TERM", value.getValue());
	}


	public NString getScrattrEffTerm(){
		NString v = new NString((String)this.getValue("SCRATTR_EFF_TERM"));
		return v;
	}


	
	
	public void setScrattrSubjCode(NString value){
		this.setValue("SCRATTR_SUBJ_CODE", value.getValue());
	}


	public NString getScrattrSubjCode(){
		NString v = new NString((String)this.getValue("SCRATTR_SUBJ_CODE"));
		return v;
	}


	
	
	public void setScrattrCrseNumb(NString value){
		this.setValue("SCRATTR_CRSE_NUMB", value.getValue());
	}


	public NString getScrattrCrseNumb(){
		NString v = new NString((String)this.getValue("SCRATTR_CRSE_NUMB"));
		return v;
	}


	
	
	public void setAttrInsert(NString value){
		this.setValue("ATTR_INSERT", value.getValue());
	}


	public NString getAttrInsert(){
		NString v = new NString((String)this.getValue("ATTR_INSERT"));
		return v;
	}


	
	
	public void setEndAttr(NString value){
		this.setValue("END_ATTR", value.getValue());
	}


	public NString getEndAttr(){
		NString v = new NString((String)this.getValue("END_ATTR"));
		return v;
	}


	
	
	public void setStvattrGeUseInd(NString value){
		this.setValue("STVATTR_GE_USE_IND", value.getValue());
	}


	public NString getStvattrGeUseInd(){
		NString v = new NString((String)this.getValue("STVATTR_GE_USE_IND"));
		return v;
	}


	
	
	public void setScrattrAttrCode(NString value){
		this.setValue("SCRATTR_ATTR_CODE", value.getValue());
	}


	public NString getScrattrAttrCode(){
		NString v = new NString((String)this.getValue("SCRATTR_ATTR_CODE"));
		return v;
	}


	
	
	public void setStvattrDesc(NString value){
		this.setValue("STVATTR_DESC", value.getValue());
	}


	public NString getStvattrDesc(){
		NString v = new NString((String)this.getValue("STVATTR_DESC"));
		return v;
	}


	
	
}
