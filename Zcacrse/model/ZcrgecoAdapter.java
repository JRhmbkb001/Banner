package  net.hedtech.ucdavis.ps.banner.student.Zcacrse.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class ZcrgecoAdapter extends BaseRowAdapter{
	

	public ZcrgecoAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setGecoInsert(NString value){
		this.setValue("GECO_INSERT", value.getValue());
	}


	public NString getGecoInsert(){
		NString v = new NString((String)this.getValue("GECO_INSERT"));
		return v;
	}


	
	
	public void setZcrgecoEndcopy(NString value){
		this.setValue("ZCRGECO_ENDCOPY", value.getValue());
	}


	public NString getZcrgecoEndcopy(){
		NString v = new NString((String)this.getValue("ZCRGECO_ENDCOPY"));
		return v;
	}


	
	
	public void setEndGeco(NString value){
		this.setValue("END_GECO", value.getValue());
	}


	public NString getEndGeco(){
		NString v = new NString((String)this.getValue("END_GECO"));
		return v;
	}


	
	
	public void setZcrgecoEffTerm(NString value){
		this.setValue("ZCRGECO_EFF_TERM", value.getValue());
	}


	public NString getZcrgecoEffTerm(){
		NString v = new NString((String)this.getValue("ZCRGECO_EFF_TERM"));
		return v;
	}


	
	
	public void setZcrgecoSubjCode(NString value){
		this.setValue("ZCRGECO_SUBJ_CODE", value.getValue());
	}


	public NString getZcrgecoSubjCode(){
		NString v = new NString((String)this.getValue("ZCRGECO_SUBJ_CODE"));
		return v;
	}


	
	
	public void setZcrgecoCrseNumb(NString value){
		this.setValue("ZCRGECO_CRSE_NUMB", value.getValue());
	}


	public NString getZcrgecoCrseNumb(){
		NString v = new NString((String)this.getValue("ZCRGECO_CRSE_NUMB"));
		return v;
	}


	
	
	public void setZcrgecoType(NString value){
		this.setValue("ZCRGECO_TYPE", value.getValue());
	}


	public NString getZcrgecoType(){
		NString v = new NString((String)this.getValue("ZCRGECO_TYPE"));
		return v;
	}


	
	
	public void setZcrgecoActivityDate(NDate value){
		this.setValue("ZCRGECO_ACTIVITY_DATE", value.getValue());
	}


	public NDate getZcrgecoActivityDate(){
		NDate v = new NDate((Date)this.getValue("ZCRGECO_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setZcrgecoSubjCodeCocrse(NString value){
		this.setValue("ZCRGECO_SUBJ_CODE_COCRSE", value.getValue());
	}


	public NString getZcrgecoSubjCodeCocrse(){
		NString v = new NString((String)this.getValue("ZCRGECO_SUBJ_CODE_COCRSE"));
		return v;
	}


	
	
	public void setZcrgecoSubjCodeCocrseDesc(NString value){
		this.setValue("ZCRGECO_SUBJ_CODE_COCRSE_DESC", value.getValue());
	}


	public NString getZcrgecoSubjCodeCocrseDesc(){
		NString v = new NString((String)this.getValue("ZCRGECO_SUBJ_CODE_COCRSE_DESC"));
		return v;
	}


	
	
	public void setZcrgecoCrseNumbCocrse(NString value){
		this.setValue("ZCRGECO_CRSE_NUMB_COCRSE", value.getValue());
	}


	public NString getZcrgecoCrseNumbCocrse(){
		NString v = new NString((String)this.getValue("ZCRGECO_CRSE_NUMB_COCRSE"));
		return v;
	}


	
	
	public void setZcrgecoGeVersion(NString value){
		this.setValue("ZCRGECO_GE_VERSION", value.getValue());
	}


	public NString getZcrgecoGeVersion(){
		NString v = new NString((String)this.getValue("ZCRGECO_GE_VERSION"));
		return v;
	}


	
	
}
