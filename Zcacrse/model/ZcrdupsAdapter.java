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



public class ZcrdupsAdapter extends BaseRowAdapter{
	

	public ZcrdupsAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setZcrdupsDescription(NString value){
		this.setValue("ZCRDUPS_DESCRIPTION", value.getValue());
	}


	public NString getZcrdupsDescription(){
		NString v = new NString((String)this.getValue("ZCRDUPS_DESCRIPTION"));
		return v;
	}


	
	
	public void setZcrdupsTermCodeStart(NString value){
		this.setValue("ZCRDUPS_TERM_CODE_START", value.getValue());
	}


	public NString getZcrdupsTermCodeStart(){
		NString v = new NString((String)this.getValue("ZCRDUPS_TERM_CODE_START"));
		return v;
	}


	
	
	public void setZcrdupsTermCodeEnd(NString value){
		this.setValue("ZCRDUPS_TERM_CODE_END", value.getValue());
	}


	public NString getZcrdupsTermCodeEnd(){
		NString v = new NString((String)this.getValue("ZCRDUPS_TERM_CODE_END"));
		return v;
	}


	
	
	public void setZcrdupsFromTable(NString value){
		this.setValue("ZCRDUPS_FROM_TABLE", value.getValue());
	}


	public NString getZcrdupsFromTable(){
		NString v = new NString((String)this.getValue("ZCRDUPS_FROM_TABLE"));
		return v;
	}


	
	
	public void setZcrdupsWherePidm(NString value){
		this.setValue("ZCRDUPS_WHERE_PIDM", value.getValue());
	}


	public NString getZcrdupsWherePidm(){
		NString v = new NString((String)this.getValue("ZCRDUPS_WHERE_PIDM"));
		return v;
	}


	
	
	public void setZcrdupsWhereLevl(NString value){
		this.setValue("ZCRDUPS_WHERE_LEVL", value.getValue());
	}


	public NString getZcrdupsWhereLevl(){
		NString v = new NString((String)this.getValue("ZCRDUPS_WHERE_LEVL"));
		return v;
	}


	
	
	public void setZcrdupsWhereTerm(NString value){
		this.setValue("ZCRDUPS_WHERE_TERM", value.getValue());
	}


	public NString getZcrdupsWhereTerm(){
		NString v = new NString((String)this.getValue("ZCRDUPS_WHERE_TERM"));
		return v;
	}


	
	
	public void setZcrdupsWhereStmt(NString value){
		this.setValue("ZCRDUPS_WHERE_STMT", value.getValue());
	}


	public NString getZcrdupsWhereStmt(){
		NString v = new NString((String)this.getValue("ZCRDUPS_WHERE_STMT"));
		return v;
	}


	
	
	public void setZcrdupsDupcRule(NNumber value){
		this.setValue("ZCRDUPS_DUPC_RULE", value.getValue());
	}


	public NNumber getZcrdupsDupcRule(){
		NNumber v = new NNumber((BigDecimal)this.getValue("ZCRDUPS_DUPC_RULE"));
		return v;
	}


	
	
}
