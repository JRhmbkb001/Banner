package net.hedtech.ucdavis.ps.banner.student.Zcacrse;


import java.util.Hashtable;
import net.hedtech.general.common.forms.BaseTask;
import morphis.foundations.core.appsupportlib.runtime.Task;

	
/// <summary>
/// 
/// </summary>
public class ZcacrseTask extends BaseTask
{
	public ZcacrseTask (String taskName) {
		super(taskName);
	}

	public ZcacrseTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}

	@Override
	public net.hedtech.ucdavis.ps.banner.student.Zcacrse.model.ZcacrseModel getModel() {
		return (net.hedtech.ucdavis.ps.banner.student.Zcacrse.model.ZcacrseModel)super.getModel();
	}

	public net.hedtech.ucdavis.ps.banner.student.Zcacrse.services.ZcacrseServices getServices() {
		return (net.hedtech.ucdavis.ps.banner.student.Zcacrse.services.ZcacrseServices)getSupportCodeManager().getServices();
	}
	
	
	// Package Acessors
		
	
		// Attached Libraries
    public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls()
    {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
    }
    public net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices getGoqwflw()
    {
		return (net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices)getSupportCodeManager().getLibrary("GOQWFLW");
    }
    public net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices getEoqrpls()
    {
		return (net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices)getSupportCodeManager().getLibrary("EOQRPLS");
    }


}
