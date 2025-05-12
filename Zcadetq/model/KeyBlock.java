package net.hedtech.ucdavis.ps.banner.student.Zcadetq.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class KeyBlock extends SimpleBusinessObject
{
	public KeyBlock() {
		super();
	}

	public KeyBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getScacrseSubjCode() {
		return toStr(super.getValue("SCACRSE_SUBJ_CODE"));
	}
	
	public void setScacrseSubjCode(NString value) {
		super.setValue("SCACRSE_SUBJ_CODE", value);
	}
	


	public NString getSubjDesc() {
		return toStr(super.getValue("SUBJ_DESC"));
	}
	
	public void setSubjDesc(NString value) {
		super.setValue("SUBJ_DESC", value);
	}
	


	public NString getSubjCode() {
		return toStr(super.getValue("SUBJ_CODE"));
	}
	
	public void setSubjCode(NString value) {
		super.setValue("SUBJ_CODE", value);
	}
	


	public NString getCourseAdd() {
		return toStr(super.getValue("COURSE_ADD"));
	}
	
	public void setCourseAdd(NString value) {
		super.setValue("COURSE_ADD", value);
	}
	


	public NInteger getLevlAdd() {
		return toInt(super.getValue("LEVL_ADD"));
	}
	
	public void setLevlAdd(NInteger value) {
		super.setValue("LEVL_ADD", value);
	}
	


	public NInteger getGmodAdd() {
		return toInt(super.getValue("GMOD_ADD"));
	}
	
	public void setGmodAdd(NInteger value) {
		super.setValue("GMOD_ADD", value);
	}
	


	public NInteger getSchdAdd() {
		return toInt(super.getValue("SCHD_ADD"));
	}
	
	public void setSchdAdd(NInteger value) {
		super.setValue("SCHD_ADD", value);
	}
	


	public NString getScacrseCrseNumb() {
		return toStr(super.getValue("SCACRSE_CRSE_NUMB"));
	}
	
	public void setScacrseCrseNumb(NString value) {
		super.setValue("SCACRSE_CRSE_NUMB", value);
	}
	


	public NString getStvtermCode() {
		return toStr(super.getValue("STVTERM_CODE"));
	}
	
	public void setStvtermCode(NString value) {
		super.setValue("STVTERM_CODE", value);
	}
	



}




