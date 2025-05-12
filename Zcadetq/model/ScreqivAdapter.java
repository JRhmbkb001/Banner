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



public class ScreqivAdapter extends BaseRowAdapter{
	

	public ScreqivAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScreqivSubjCode(NString value){
		this.setValue("SCREQIV_SUBJ_CODE", value.getValue());
	}


	public NString getScreqivSubjCode(){
		NString v = new NString((String)this.getValue("SCREQIV_SUBJ_CODE"));
		return v;
	}


	
	
	public void setScreqivCrseNumb(NString value){
		this.setValue("SCREQIV_CRSE_NUMB", value.getValue());
	}


	public NString getScreqivCrseNumb(){
		NString v = new NString((String)this.getValue("SCREQIV_CRSE_NUMB"));
		return v;
	}


	
	
	public void setScreqivEffTerm(NString value){
		this.setValue("SCREQIV_EFF_TERM", value.getValue());
	}


	public NString getScreqivEffTerm(){
		NString v = new NString((String)this.getValue("SCREQIV_EFF_TERM"));
		return v;
	}


	
	
	public void setScreqivActivityDate(NDate value){
		this.setValue("SCREQIV_ACTIVITY_DATE", value.getValue());
	}


	public NDate getScreqivActivityDate(){
		NDate v = new NDate((Date)this.getValue("SCREQIV_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setEqivInsert(NString value){
		this.setValue("EQIV_INSERT", value.getValue());
	}


	public NString getEqivInsert(){
		NString v = new NString((String)this.getValue("EQIV_INSERT"));
		return v;
	}


	
	
	public void setEndEqiv(NString value){
		this.setValue("END_EQIV", value.getValue());
	}


	public NString getEndEqiv(){
		NString v = new NString((String)this.getValue("END_EQIV"));
		return v;
	}


	
	
	public void setScreqivSubjCodeEqiv(NString value){
		this.setValue("SCREQIV_SUBJ_CODE_EQIV", value.getValue());
	}


	public NString getScreqivSubjCodeEqiv(){
		NString v = new NString((String)this.getValue("SCREQIV_SUBJ_CODE_EQIV"));
		return v;
	}


	
	
	public void setScreqivSubjCodeEqivDesc(NString value){
		this.setValue("SCREQIV_SUBJ_CODE_EQIV_DESC", value.getValue());
	}


	public NString getScreqivSubjCodeEqivDesc(){
		NString v = new NString((String)this.getValue("SCREQIV_SUBJ_CODE_EQIV_DESC"));
		return v;
	}


	
	
	public void setScreqivCrseNumbEqiv(NString value){
		this.setValue("SCREQIV_CRSE_NUMB_EQIV", value.getValue());
	}


	public NString getScreqivCrseNumbEqiv(){
		NString v = new NString((String)this.getValue("SCREQIV_CRSE_NUMB_EQIV"));
		return v;
	}


	
	
	public void setScreqivStartTerm(NString value){
		this.setValue("SCREQIV_START_TERM", value.getValue());
	}


	public NString getScreqivStartTerm(){
		NString v = new NString((String)this.getValue("SCREQIV_START_TERM"));
		return v;
	}


	
	
	public void setScreqivEndTerm(NString value){
		this.setValue("SCREQIV_END_TERM", value.getValue());
	}


	public NString getScreqivEndTerm(){
		NString v = new NString((String)this.getValue("SCREQIV_END_TERM"));
		return v;
	}


	
	
}
