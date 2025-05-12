package net.hedtech.ucdavis.ps.banner.student.Zcadetq;


import java.util.Hashtable;
import net.hedtech.general.common.forms.BaseTask;
import morphis.foundations.core.appsupportlib.runtime.Task;

	
/// <summary>
/// 
/// </summary>
public class ZcadetqTask extends BaseTask
{
	public ZcadetqTask (String taskName) {
		super(taskName);
	}

	public ZcadetqTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}

	@Override
	public net.hedtech.ucdavis.ps.banner.student.Zcadetq.model.ZcadetqModel getModel() {
		return (net.hedtech.ucdavis.ps.banner.student.Zcadetq.model.ZcadetqModel)super.getModel();
	}

	public net.hedtech.ucdavis.ps.banner.student.Zcadetq.services.ZcadetqServices getServices() {
		return (net.hedtech.ucdavis.ps.banner.student.Zcadetq.services.ZcadetqServices)getSupportCodeManager().getServices();
	}
	
	
	// Package Acessors
		
	
		// Attached Libraries
    public net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices getGoqwflw()
    {
		return (net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices)getSupportCodeManager().getLibrary("GOQWFLW");
    }
    public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls()
    {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
    }
    public net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices getEoqrpls()
    {
		return (net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices)getSupportCodeManager().getLibrary("EOQRPLS");
    }


}
