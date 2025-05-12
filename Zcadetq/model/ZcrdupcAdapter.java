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



public class ZcrdupcAdapter extends BaseRowAdapter{
	

	public ZcrdupcAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setZcrdupcEndcopy(NString value){
		this.setValue("ZCRDUPC_ENDCOPY", value.getValue());
	}


	public NString getZcrdupcEndcopy(){
		NString v = new NString((String)this.getValue("ZCRDUPC_ENDCOPY"));
		return v;
	}


	
	
	public void setZcrdupcSubjCode(NString value){
		this.setValue("ZCRDUPC_SUBJ_CODE", value.getValue());
	}


	public NString getZcrdupcSubjCode(){
		NString v = new NString((String)this.getValue("ZCRDUPC_SUBJ_CODE"));
		return v;
	}


	
	
	public void setZcrdupcCrseNumb(NString value){
		this.setValue("ZCRDUPC_CRSE_NUMB", value.getValue());
	}


	public NString getZcrdupcCrseNumb(){
		NString v = new NString((String)this.getValue("ZCRDUPC_CRSE_NUMB"));
		return v;
	}


	
	
	public void setZcrdupcTermCodeEff(NString value){
		this.setValue("ZCRDUPC_TERM_CODE_EFF", value.getValue());
	}


	public NString getZcrdupcTermCodeEff(){
		NString v = new NString((String)this.getValue("ZCRDUPC_TERM_CODE_EFF"));
		return v;
	}


	
	
	public void setZcrdupcRule(NNumber value){
		this.setValue("ZCRDUPC_RULE", value.getValue());
	}


	public NNumber getZcrdupcRule(){
		NNumber v = new NNumber((BigDecimal)this.getValue("ZCRDUPC_RULE"));
		return v;
	}


	
	
	public void setZcrdupcType(NString value){
		this.setValue("ZCRDUPC_TYPE", value.getValue());
	}


	public NString getZcrdupcType(){
		NString v = new NString((String)this.getValue("ZCRDUPC_TYPE"));
		return v;
	}


	
	
	public void setZcrdupcUnits(NNumber value){
		this.setValue("ZCRDUPC_UNITS", value.getValue());
	}


	public NNumber getZcrdupcUnits(){
		NNumber v = new NNumber((BigDecimal)this.getValue("ZCRDUPC_UNITS"));
		return v;
	}


	
	
	public void setZcrdupcActivityDate(NDate value){
		this.setValue("ZCRDUPC_ACTIVITY_DATE", value.getValue());
	}


	public NDate getZcrdupcActivityDate(){
		NDate v = new NDate((Date)this.getValue("ZCRDUPC_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setRuleInsert(NString value){
		this.setValue("RULE_INSERT", value.getValue());
	}


	public NString getRuleInsert(){
		NString v = new NString((String)this.getValue("RULE_INSERT"));
		return v;
	}


	
	
	public void setEndRule(NString value){
		this.setValue("END_RULE", value.getValue());
	}


	public NString getEndRule(){
		NString v = new NString((String)this.getValue("END_RULE"));
		return v;
	}


	
	
}
