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
		
public class ScrrmajController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public ScrrmajController(IFormController parentController, String name) 
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
		 * SCRRMAJ.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void scrrmaj_BeforeQuery(QueryEvent args)
		{
			

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", this.getFormModel().getKeyBlock().getScacrseSubjCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", this.getFormModel().getKeyBlock().getScacrseCrseNumb()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_STVTERM_CODE", this.getFormModel().getKeyBlock().getStvtermCode()));             


                RmajCtrlBlockAdapter rmajCtrlBlockElement = (RmajCtrlBlockAdapter) this.getFormModel().getRmajCtrlBlock().getRowAdapter(true);                       
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("RMAJ_CTRL_BLOCK_SCRRMAJ_LFST_CODE", rmajCtrlBlockElement.getScrrmajLfstCode()));             


           
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRMAJ_MAJR_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SCRRMAJ_MAJR_CODE")
		public void scrrmajMajrCode_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRMAJ_MAJR_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SCRRMAJ_MAJR_CODE", function=KeyFunction.ITEM_CHANGE)
		public void scrrmajMajrCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRMAJ_MAJR_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SCRRMAJ_MAJR_CODE")
		public void scrrmajMajrCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRMAJ_MAJR_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SCRRMAJ_MAJR_CODE")
		public void scrrmajMajrCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRMAJ_MAJR_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SCRRMAJ_MAJR_CODE", function=KeyFunction.NEXT_ITEM)
		public void scrrmajMajrCode_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/* Original PL/SQL code code for TRIGGER SCRRMAJ_MAJR_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;

IF :scrrmaj_majr_code IS NULL THEN
  :major_description:=null;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRMAJ_MAJR_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SCRRMAJ_MAJR_CODE", function=KeyFunction.ITEM_OUT)
		public void scrrmajMajrCode_itemOut()
		{
			

				
				ScrrmajAdapter scrrmajElement = (ScrrmajAdapter)this.getFormModel().getScrrmaj().getRowAdapter(true);


				getTask().getGoqrpls().getGSearch().postTextCode();
				getTask().getGoqrpls().gCheckFailure();
				if ( scrrmajElement.getScrrmajMajrCode().isNull() )
				{
					scrrmajElement.setMajorDescription(toStr(null));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SCRRMAJ_MAJR_CODE.POST-CHANGE
		    DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVMAJR_DESC
         FROM   STVMAJR
         WHERE  STVMAJR_CODE = :SCRRMAJ_MAJR_CODE ;
        
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :MAJOR_DESCRIPTION;
      IF PTI_CURSOR%NOTFOUND THEN
          MESSAGE ( G$_NLS.Get('SCARRES-0048', 'FORM','*ERROR* Invalid code, press LIST for valid codes') , NO_ACKNOWLEDGE);
          RAISE FORM_TRIGGER_FAILURE ;
      END IF;
      CLOSE PTI_CURSOR;
   END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRMAJ_MAJR_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="SCRRMAJ_MAJR_CODE")
		public void scrrmajMajrCode_PostChange()
		{
			

				
				ScrrmajAdapter scrrmajElement = (ScrrmajAdapter)this.getFormModel().getScrrmaj().getRowAdapter(true);


				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT STVMAJR_DESC " +
	" FROM STVMAJR " +
	" WHERE STVMAJR_CODE = :SCRRMAJ_MAJR_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("SCRRMAJ_MAJR_CODE", scrrmajElement.getScrrmajMajrCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							scrrmajElement.setMajorDescription(ptiCursorResults.getStr(0));
						}
						if ( ptiCursor.notFound() )
						{
							errorMessage(GNls.Fget(toStr("SCARRES-0048"), toStr("FORM"), toStr("*ERROR* Invalid code, press LIST for valid codes")));
							throw new ApplicationException();
						}
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
		 * MAJOR_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="MAJOR_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void majorDescription_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRMAJ.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void scrrmaj_AfterQuery(RowAdapterEvent args)
		{
			
				// F2J_INFO : Empty AfterQuery automatically generated for POST-CHANGE support. Do not remove.
		}

		
	
	
}
