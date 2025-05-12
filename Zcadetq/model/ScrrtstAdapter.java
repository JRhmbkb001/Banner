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



public class ScrrtstAdapter extends BaseRowAdapter{
	

	public ScrrtstAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScrrtstConnector(NString value){
		this.setValue("SCRRTST_CONNECTOR", value.getValue());
	}


	public NString getScrrtstConnector(){
		NString v = new NString((String)this.getValue("SCRRTST_CONNECTOR"));
		return v;
	}


	
	
	public void setScrrtstEndcopy(NString value){
		this.setValue("SCRRTST_ENDCOPY", value.getValue());
	}


	public NString getScrrtstEndcopy(){
		NString v = new NString((String)this.getValue("SCRRTST_ENDCOPY"));
		return v;
	}


	
	
	public void setScrrtstLparen(NString value){
		this.setValue("SCRRTST_LPAREN", value.getValue());
	}


	public NString getScrrtstLparen(){
		NString v = new NString((String)this.getValue("SCRRTST_LPAREN"));
		return v;
	}


	
	
	public void setScrrtstTescCode(NString value){
		this.setValue("SCRRTST_TESC_CODE", value.getValue());
	}


	public NString getScrrtstTescCode(){
		NString v = new NString((String)this.getValue("SCRRTST_TESC_CODE"));
		return v;
	}


	
	
	public void setScrrtstTestScore(NString value){
		this.setValue("SCRRTST_TEST_SCORE", value.getValue());
	}


	public NString getScrrtstTestScore(){
		NString v = new NString((String)this.getValue("SCRRTST_TEST_SCORE"));
		return v;
	}


	
	
	public void setScrrtstSubjCodePreq(NString value){
		this.setValue("SCRRTST_SUBJ_CODE_PREQ", value.getValue());
	}


	public NString getScrrtstSubjCodePreq(){
		NString v = new NString((String)this.getValue("SCRRTST_SUBJ_CODE_PREQ"));
		return v;
	}


	
	
	public void setScrrtstCrseNumbPreq(NString value){
		this.setValue("SCRRTST_CRSE_NUMB_PREQ", value.getValue());
	}


	public NString getScrrtstCrseNumbPreq(){
		NString v = new NString((String)this.getValue("SCRRTST_CRSE_NUMB_PREQ"));
		return v;
	}


	
	
	public void setScrrtstLevlCode(NString value){
		this.setValue("SCRRTST_LEVL_CODE", value.getValue());
	}


	public NString getScrrtstLevlCode(){
		NString v = new NString((String)this.getValue("SCRRTST_LEVL_CODE"));
		return v;
	}


	
	
	public void setScrrtstMinGrde(NString value){
		this.setValue("SCRRTST_MIN_GRDE", value.getValue());
	}


	public NString getScrrtstMinGrde(){
		NString v = new NString((String)this.getValue("SCRRTST_MIN_GRDE"));
		return v;
	}


	
	
	public void setScrrtstConcurrencyInd(NString value){
		this.setValue("SCRRTST_CONCURRENCY_IND", value.getValue());
	}


	public NString getScrrtstConcurrencyInd(){
		NString v = new NString((String)this.getValue("SCRRTST_CONCURRENCY_IND"));
		return v;
	}


	
	
	public void setScrrtstRparen(NString value){
		this.setValue("SCRRTST_RPAREN", value.getValue());
	}


	public NString getScrrtstRparen(){
		NString v = new NString((String)this.getValue("SCRRTST_RPAREN"));
		return v;
	}


	
	
	public void setScrrtstSubjCode(NString value){
		this.setValue("SCRRTST_SUBJ_CODE", value.getValue());
	}


	public NString getScrrtstSubjCode(){
		NString v = new NString((String)this.getValue("SCRRTST_SUBJ_CODE"));
		return v;
	}


	
	
	public void setScrrtstCrseNumb(NString value){
		this.setValue("SCRRTST_CRSE_NUMB", value.getValue());
	}


	public NString getScrrtstCrseNumb(){
		NString v = new NString((String)this.getValue("SCRRTST_CRSE_NUMB"));
		return v;
	}


	
	
	public void setScrrtstTermCodeEff(NString value){
		this.setValue("SCRRTST_TERM_CODE_EFF", value.getValue());
	}


	public NString getScrrtstTermCodeEff(){
		NString v = new NString((String)this.getValue("SCRRTST_TERM_CODE_EFF"));
		return v;
	}


	
	
	public void setScrrtstSeqno(NNumber value){
		this.setValue("SCRRTST_SEQNO", value.getValue());
	}


	public NNumber getScrrtstSeqno(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SCRRTST_SEQNO"));
		return v;
	}


	
	
	public void setScrrtstActivityDate(NDate value){
		this.setValue("SCRRTST_ACTIVITY_DATE", value.getValue());
	}


	public NDate getScrrtstActivityDate(){
		NDate v = new NDate((Date)this.getValue("SCRRTST_ACTIVITY_DATE"));
		return v;
	}


	
	
}
