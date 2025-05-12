package net.hedtech.ucdavis.ps.banner.student.Zcadetq.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class TextCtrl extends SimpleBusinessObject
{
	public TextCtrl() {
		super();
	}

	public TextCtrl(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NNumber getHoldNumber1() {
		return toNumber(super.getValue("HOLD_NUMBER1"));
	}
	
	public void setHoldNumber1(NNumber value) {
		super.setValue("HOLD_NUMBER1", value);
	}
	


	public NNumber getHoldNumber2() {
		return toNumber(super.getValue("HOLD_NUMBER2"));
	}
	
	public void setHoldNumber2(NNumber value) {
		super.setValue("HOLD_NUMBER2", value);
	}
	


	public NString getResequenceInd() {
		return toStr(super.getValue("RESEQUENCE_IND"));
	}
	
	public void setResequenceInd(NString value) {
		super.setValue("RESEQUENCE_IND", value);
	}
	


	public NString getScrtextTermCodeFrom() {
		return toStr(super.getValue("SCRTEXT_TERM_CODE_FROM"));
	}
	
	public void setScrtextTermCodeFrom(NString value) {
		super.setValue("SCRTEXT_TERM_CODE_FROM", value);
	}
	


	public NString getScrtextTermCodeTo() {
		return toStr(super.getValue("SCRTEXT_TERM_CODE_TO"));
	}
	
	public void setScrtextTermCodeTo(NString value) {
		super.setValue("SCRTEXT_TERM_CODE_TO", value);
	}
	



}




