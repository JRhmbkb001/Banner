package net.hedtech.ucdavis.ps.banner.student.Zcacrse.model;

import java.util.Hashtable;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;


import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;

import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;














import net.hedtech.general.common.libraries.Goqolib.model.GOptBlock;





public class ZcacrseModel extends FormModel {
	
	
	public ZcacrseModel(ITask task, Hashtable parameters){
		super(task, parameters);
    }
    
		

	public GSdkey getGSdkey() 
	{
		return (GSdkey) getBusinessObject("G$_SDKEY");
	}

	public IDBBusinessObject getGSdisp() 
	{
		return (IDBBusinessObject) getBusinessObject("G$_SDISP");
	}

	public GVpdiBlock getGVpdiBlock() 
	{
		return (GVpdiBlock) getBusinessObject("G$_VPDI_BLOCK");
	}

	public GNavBlock getGNavBlock() 
	{
		return (GNavBlock) getBusinessObject("G$_NAV_BLOCK");
	}

	public FormHeader getFormHeader() 
	{
		return (FormHeader) getBusinessObject("FORM_HEADER");
	}

	public KeyBlock getKeyBlock() 
	{
		return (KeyBlock) getBusinessObject("KEY_BLOCK");
	}

	public ZcbcrseCtrlBlock getZcbcrseCtrlBlock() 
	{
		return (ZcbcrseCtrlBlock) getBusinessObject("ZCBCRSE_CTRL_BLOCK");
	}

	public IDBBusinessObject getZcbcrse() 
	{
		return (IDBBusinessObject) getBusinessObject("ZCBCRSE");
	}

	public SchdCtrlBlock getSchdCtrlBlock() 
	{
		return (SchdCtrlBlock) getBusinessObject("SCHD_CTRL_BLOCK");
	}

	public IDBBusinessObject getScrschd() 
	{
		return (IDBBusinessObject) getBusinessObject("SCRSCHD");
	}

	public GecoCtrlBlock getGecoCtrlBlock() 
	{
		return (GecoCtrlBlock) getBusinessObject("GECO_CTRL_BLOCK");
	}

	public IDBBusinessObject getZcrgeco() 
	{
		return (IDBBusinessObject) getBusinessObject("ZCRGECO");
	}

	public DupcCtrlBlock getDupcCtrlBlock() 
	{
		return (DupcCtrlBlock) getBusinessObject("DUPC_CTRL_BLOCK");
	}

	public IDBBusinessObject getZcrdupc() 
	{
		return (IDBBusinessObject) getBusinessObject("ZCRDUPC");
	}

	public IDBBusinessObject getZcrdupr() 
	{
		return (IDBBusinessObject) getBusinessObject("ZCRDUPR");
	}

	public IDBBusinessObject getZcrdups() 
	{
		return (IDBBusinessObject) getBusinessObject("ZCRDUPS");
	}

	public ButtonControlBlock getButtonControlBlock() 
	{
		return (ButtonControlBlock) getBusinessObject("BUTTON_CONTROL_BLOCK");
	}

	public GOptBlock getGOptBlock() 
	{
		return (GOptBlock) getBusinessObject("G$_OPT_BLOCK");
	}


}

		

