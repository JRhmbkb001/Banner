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



public class RmajCtrlBlockAdapter extends BaseRowAdapter{
	

	public RmajCtrlBlockAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setScrrmajEffTerm(NString value){
		this.setValue("SCRRMAJ_EFF_TERM", value.getValue());
	}


	public NString getScrrmajEffTerm(){
		NString v = new NString((String)this.getValue("SCRRMAJ_EFF_TERM"));
		return v;
	}


	
	
	public void setScrrmajTermCodeTo(NString value){
		this.setValue("SCRRMAJ_TERM_CODE_TO", value.getValue());
	}


	public NString getScrrmajTermCodeTo(){
		NString v = new NString((String)this.getValue("SCRRMAJ_TERM_CODE_TO"));
		return v;
	}


	
	
	public void setScrrmajMajorInd(NString value){
		this.setValue("SCRRMAJ_MAJOR_IND", value.getValue());
	}


	public NString getScrrmajMajorInd(){
		NString v = new NString((String)this.getValue("SCRRMAJ_MAJOR_IND"));
		return v;
	}


	
	
	public void setFosAll(NString value){
		this.setValue("FOS_ALL", value.getValue());
	}


	public NString getFosAll(){
		NString v = new NString((String)this.getValue("FOS_ALL"));
		return v;
	}


	
	
	public void setScrrmajLfstCode(NString value){
		this.setValue("SCRRMAJ_LFST_CODE", value.getValue());
	}


	public NString getScrrmajLfstCode(){
		NString v = new NString((String)this.getValue("SCRRMAJ_LFST_CODE"));
		return v;
	}


	
	
	public void setRecType(NString value){
		this.setValue("REC_TYPE", value.getValue());
	}


	public NString getRecType(){
		NString v = new NString((String)this.getValue("REC_TYPE"));
		return v;
	}


	
	
	
	
	public void setScrrmajSubjCode(NString value){
		this.setValue("SCRRMAJ_SUBJ_CODE", value.getValue());
	}


	public NString getScrrmajSubjCode(){
		NString v = new NString((String)this.getValue("SCRRMAJ_SUBJ_CODE"));
		return v;
	}


	
	
	public void setScrrmajCrseNumb(NString value){
		this.setValue("SCRRMAJ_CRSE_NUMB", value.getValue());
	}


	public NString getScrrmajCrseNumb(){
		NString v = new NString((String)this.getValue("SCRRMAJ_CRSE_NUMB"));
		return v;
	}


	
	
	public void setScrrmajEffTerm1(NString value){
		this.setValue("SCRRMAJ_EFF_TERM_1", value.getValue());
	}


	public NString getScrrmajEffTerm1(){
		NString v = new NString((String)this.getValue("SCRRMAJ_EFF_TERM_1"));
		return v;
	}


	
	
	public void setScrrmajMajorInd1(NString value){
		this.setValue("SCRRMAJ_MAJOR_IND_1", value.getValue());
	}


	public NString getScrrmajMajorInd1(){
		NString v = new NString((String)this.getValue("SCRRMAJ_MAJOR_IND_1"));
		return v;
	}


	
	
}
