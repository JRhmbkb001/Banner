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

import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
		
public class ZcrduprController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public ZcrduprController(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER ZCRDUPR.KEY-PRVBLK
		 GO_BLOCK('ZCRDUPC');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void zcrdupr_PreviousBlock()
		{
			
				goBlock(toStr("ZCRDUPC"));
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPR.KEY-NXTBLK
		 :SYSTEM.MESSAGE_LEVEL := '5' ;
GO_BLOCK('SCBCRSE');
:SYSTEM.MESSAGE_LEVEL := '0';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void zcrdupr_NextBlock()
		{
			
				try {
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
					goBlock(toStr("SCBCRSE"));
				} finally {
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_SUBJ_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="ZCRDUPR_SUBJ_CODE")
		public void zcrduprSubjCode_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_SUBJ_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ZCRDUPR_SUBJ_CODE", function=KeyFunction.ITEM_CHANGE)
		public void zcrduprSubjCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_SUBJ_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="ZCRDUPR_SUBJ_CODE")
		public void zcrduprSubjCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_SUBJ_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="ZCRDUPR_SUBJ_CODE")
		public void zcrduprSubjCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_SUBJ_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ZCRDUPR_SUBJ_CODE", function=KeyFunction.NEXT_ITEM)
		public void zcrduprSubjCode_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_SUBJ_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="ZCRDUPR_SUBJ_CODE", function=KeyFunction.ITEM_OUT)
		public void zcrduprSubjCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPR_SUBJ_CODE.POST-CHANGE
		    DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVSUBJ_DESC
         FROM   STVSUBJ
         WHERE  STVSUBJ_CODE = :ZCRDUPR_SUBJ_CODE;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :ZCRDUPR_SUBJ_CODE_DESC;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
         '*ERROR* Invalid code, press LIST for valid codes.', TRUE);
      CLOSE PTI_CURSOR;
   END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_SUBJ_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="ZCRDUPR_SUBJ_CODE")
		public void zcrduprSubjCode_PostChange()
		{
			

				
				ZcrduprAdapter zcrduprElement = (ZcrduprAdapter)this.getFormModel().getZcrdupr().getRowAdapter(true);


				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT STVSUBJ_DESC " +
	" FROM STVSUBJ " +
	" WHERE STVSUBJ_CODE = :ZCRDUPR_SUBJ_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("ZCRDUPR_SUBJ_CODE", zcrduprElement.getZcrduprSubjCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							zcrduprElement.setZcrduprSubjCodeDesc(ptiCursorResults.getStr(0));
						}
						getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(), toStr("*ERROR* Invalid code, press LIST for valid codes."), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_SUBJ_CODE_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ZCRDUPR_SUBJ_CODE_DESC", function=KeyFunction.ITEM_CHANGE)
		public void zcrduprSubjCodeDesc_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCRDUPR_TERM_CODE_END.WHEN-VALIDATE-ITEM
		 IF :ZCRDUPR_TERM_CODE_END < :ZCRDUPR_TERM_CODE_START THEN
   MESSAGE(
'*Error*  Invalid value for Term code end');
   RAISE FORM_TRIGGER_FAILURE;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR_TERM_CODE_END.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="ZCRDUPR_TERM_CODE_END")
		public void zcrduprTermCodeEnd_validate()
		{
			

				
				ZcrduprAdapter zcrduprElement = (ZcrduprAdapter)this.getFormModel().getZcrdupr().getRowAdapter(true);


				if ( zcrduprElement.getZcrduprTermCodeEnd().lesser(zcrduprElement.getZcrduprTermCodeStart()) )
				{
					errorMessage("*Error*  Invalid value for Term code end");
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRDUPR.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void zcrdupr_AfterQuery(RowAdapterEvent args)
		{
			
				// F2J_INFO : Empty AfterQuery automatically generated for POST-CHANGE support. Do not remove.
		}

		
	
	
}
