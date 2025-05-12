package net.hedtech.ucdavis.ps.banner.student.Zcadetq.controller;
 
import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import morphis.foundations.core.appsupportlib.runtime.action.*;
import morphis.foundations.flavors.forms.appsupportlib.runtime.action.*;
import static net.hedtech.general.common.forms.services.BaseTaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;

import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;
import morphis.core.utils.behavior.annotations.*;
import morphis.foundations.flavors.forms.appsupportlib.runtime.*;

import net.hedtech.general.common.forms.controller.DefaultBlockController;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.ucdavis.ps.banner.student.Zcadetq.model.*;
import net.hedtech.ucdavis.ps.banner.student.Zcadetq.*;
import net.hedtech.ucdavis.ps.banner.student.Zcadetq.services.*;

    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
		
public class Scrrcol1Controller extends DefaultBlockController {


	
	public Scrrcol1Controller(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public ZcadetqTask getTask() {
		return (ZcadetqTask)super.getTask();
	}

	public ZcadetqModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
	
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRCOL_1.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void scrrcol1_BeforeQuery(QueryEvent args)
		{
			//	ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);
				//Scrrcol1Adapter scbcrseElement1 = (Scrrcol1Adapter)this.getFormModel().getScrrcol1().getRowAdapter(true);
				//Ref<NString> termCode = new Ref<NString>(scbcrseElement.getScbcrkyTermCodeEnd());

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", this.getFormModel().getKeyBlock().getScacrseSubjCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", this.getFormModel().getKeyBlock().getScacrseCrseNumb()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_STVTERM_CODE", this.getFormModel().getKeyBlock().getStvtermCode()));
				
				//scbcrseElement1.setScrrcolTermCodeTo(termCode.getValue());
				
//
//			ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);
//			Scrrcol1Adapter scrrcol1Element = (Scrrcol1Adapter)this.getFormModel().getScrrcol1().getRowAdapter(true);
//			Ref<NString> termCode = new Ref<NString>(scbcrseElement.getScbcrkyTermCodeEnd());
//
//			int rowCount = 0;
//
//			((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", this.getFormModel().getKeyBlock().getScacrseSubjCode()));             
//
//
//			((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", this.getFormModel().getKeyBlock().getScacrseCrseNumb()));             
//
//
//			((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_STVTERM_CODE", this.getFormModel().getKeyBlock().getStvtermCode()));             
//
//				
//			scrrcol1Element.setScrrcolTermCodeFrom(this.getFormModel().getKeyBlock().getStvtermCode());
////			getFormModel().getLevlCtrl().setScrlevlTermCodeFrom(this.getFormModel().getKeyBlock().getStvtermCode());
//			{
//				String sqlptiCursor = "SELECT MIN(SCRLEVL_EFF_TERM) " +
//" FROM SCRLEVL " +
//" WHERE SCRLEVL_SUBJ_CODE = :KEY_BLOCK_SCACRSE_SUBJ_CODE AND SCRLEVL_CRSE_NUMB = :KEY_BLOCK_SCACRSE_CRSE_NUMB AND SCRLEVL_EFF_TERM > :KEY_BLOCK_STVTERM_CODE ";
//				DataCursor ptiCursor = new DataCursor(sqlptiCursor);
//				try {
//					//Setting query parameters
//					ptiCursor.addParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", getFormModel().getKeyBlock().getScacrseSubjCode());
//					ptiCursor.addParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", getFormModel().getKeyBlock().getScacrseCrseNumb());
//					ptiCursor.addParameter("KEY_BLOCK_STVTERM_CODE", getFormModel().getKeyBlock().getStvtermCode());
//					ptiCursor.open();
//					ResultSet ptiCursorResults = ptiCursor.fetchInto();
//					if ( ptiCursorResults != null ) {
////						getFormModel().getLevlCtrl().setScrlevlTermCodeTo(ptiCursorResults.getStr(0));
//						scrrcol1Element.setScrrcolTermCodeTo(termCode.getValue());
//					}
//				}
//				finally{
//					ptiCursor.close();
//				}
//			}
//			// 
//			if ( !(in(scrrcol1Element.getScrrcolTermCodeTo(), scrrcol1Element.getScrrcolTermCodeFrom()).getValue() || scrrcol1Element.getScrrcolTermCodeTo().isNull() || ( scrrcol1Element.getScrrcolTermCodeTo().isNull() && scrrcol1Element.getScrrcolTermCodeFrom().isNull()) ))
//					return ;
//			 
//			
//			if ( this.getTask().getServices().selectScbcrky1(getFormModel().getKeyBlock().getScacrseSubjCode(), getFormModel().getKeyBlock().getScacrseCrseNumb(), termCode).getValue() )
//			{
//			}
//				scbcrseElement.setScbcrkyTermCodeEnd(termCode.val);
//				
//			
//			if ( scrrcol1Element.getScrrcolTermCodeTo().isNull() )
//			{
//				scrrcol1Element.setScrrcolTermCodeTo(getFormModel().getFormHeader().getTermCodeEnd());
//			}
//			
           
               }

		
	
	
}
