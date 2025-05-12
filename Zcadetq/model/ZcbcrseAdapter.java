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



public class ZcbcrseAdapter extends BaseRowAdapter{
	

	public ZcbcrseAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setZcbcrseSubjCode(NString value){
		this.setValue("ZCBCRSE_SUBJ_CODE", value.getValue());
	}


	public NString getZcbcrseSubjCode(){
		NString v = new NString((String)this.getValue("ZCBCRSE_SUBJ_CODE"));
		return v;
	}


	
	
	public void setZcbcrseCrseNumb(NString value){
		this.setValue("ZCBCRSE_CRSE_NUMB", value.getValue());
	}


	public NString getZcbcrseCrseNumb(){
		NString v = new NString((String)this.getValue("ZCBCRSE_CRSE_NUMB"));
		return v;
	}


	
	
	public void setZcbcrseEffTerm(NString value){
		this.setValue("ZCBCRSE_EFF_TERM", value.getValue());
	}


	public NString getZcbcrseEffTerm(){
		NString v = new NString((String)this.getValue("ZCBCRSE_EFF_TERM"));
		return v;
	}


	
	
	public void setZcbcrseSubjCodeXlist(NString value){
		this.setValue("ZCBCRSE_SUBJ_CODE_XLIST", value.getValue());
	}


	public NString getZcbcrseSubjCodeXlist(){
		NString v = new NString((String)this.getValue("ZCBCRSE_SUBJ_CODE_XLIST"));
		return v;
	}


	
	
	public void setSubjCodeXlistDesc(NString value){
		this.setValue("SUBJ_CODE_XLIST_DESC", value.getValue());
	}


	public NString getSubjCodeXlistDesc(){
		NString v = new NString((String)this.getValue("SUBJ_CODE_XLIST_DESC"));
		return v;
	}


	
	
	public void setZcbcrseCrseNumbXlist(NString value){
		this.setValue("ZCBCRSE_CRSE_NUMB_XLIST", value.getValue());
	}


	public NString getZcbcrseCrseNumbXlist(){
		NString v = new NString((String)this.getValue("ZCBCRSE_CRSE_NUMB_XLIST"));
		return v;
	}


	
	
}
