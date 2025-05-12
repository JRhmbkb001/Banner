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
		
public class ScrgmodController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public ScrgmodController(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER SCRGMOD.PRE-QUERY
		    :GMOD_CTRL.SCRGMOD_TERM_CODE_FROM :=
      :SCBCRSE.SCBCRSE_EFF_TERM ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT MIN(SCRGMOD_EFF_TERM)
         FROM   SCRGMOD
         WHERE  SCRGMOD_SUBJ_CODE = :KEY_BLOCK.SCACRSE_SUBJ_CODE
           AND  SCRGMOD_CRSE_NUMB = :KEY_BLOCK.SCACRSE_CRSE_NUMB
           AND  SCRGMOD_EFF_TERM > :KEY_BLOCK.STVTERM_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :GMOD_CTRL.SCRGMOD_TERM_CODE_TO ;
   END ;
--
   IF :GMOD_CTRL.SCRGMOD_TERM_CODE_TO IN (
      :GMOD_CTRL.SCRGMOD_TERM_CODE_FROM) OR
      :GMOD_CTRL.SCRGMOD_TERM_CODE_TO IS NULL  OR (
      :GMOD_CTRL.SCRGMOD_TERM_CODE_TO IS NULL AND
      :GMOD_CTRL.SCRGMOD_TERM_CODE_FROM IS NULL ) THEN
      GOTO GET_SCBCRKY ;
   ELSE
      RETURN ;
   END IF ;
--
   << GET_SCBCRKY >>
   IF SELECT_SCBCRKY_1 (:KEY_BLOCK.SCACRSE_SUBJ_CODE,
      :KEY_BLOCK.SCACRSE_CRSE_NUMB,
      :GMOD_CTRL.SCRGMOD_TERM_CODE_TO) THEN
      GOTO PTI_STEP_001;
   END IF ;
--
   << PTI_STEP_001 >>
   IF :GMOD_CTRL.SCRGMOD_TERM_CODE_TO IS NULL  THEN
      :GMOD_CTRL.SCRGMOD_TERM_CODE_TO := :TERM_CODE_END ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRGMOD.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void scrgmod_BeforeQuery(QueryEvent args)
		{
			
				ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);
				Ref<NString> termCode = new Ref<NString>(scbcrseElement.getScbcrkyTermCodeEnd());
				

				int rowCount = 0;

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_STVTERM_CODE", this.getFormModel().getKeyBlock().getStvtermCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", this.getFormModel().getKeyBlock().getScacrseSubjCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", this.getFormModel().getKeyBlock().getScacrseCrseNumb()));             


//				scbcrseElement.getScbcrseEffTerm()
				getFormModel().getGmodCtrl().setScrgmodTermCodeFrom(scbcrseElement.getScbcrseEffTerm());
				{
					String sqlptiCursor = "SELECT MIN(SCRGMOD_EFF_TERM) " +
	" FROM SCRGMOD " +
	" WHERE SCRGMOD_SUBJ_CODE = :KEY_BLOCK_SCACRSE_SUBJ_CODE AND SCRGMOD_CRSE_NUMB = :KEY_BLOCK_SCACRSE_CRSE_NUMB AND SCRGMOD_EFF_TERM > :KEY_BLOCK_STVTERM_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", getFormModel().getKeyBlock().getScacrseSubjCode());
						ptiCursor.addParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", getFormModel().getKeyBlock().getScacrseCrseNumb());
						ptiCursor.addParameter("KEY_BLOCK_STVTERM_CODE", getFormModel().getKeyBlock().getStvtermCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getGmodCtrl().setScrgmodTermCodeTo(ptiCursorResults.getStr(0));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if ( !(in(getFormModel().getGmodCtrl().getScrgmodTermCodeTo(), getFormModel().getGmodCtrl().getScrgmodTermCodeFrom()).getValue() || getFormModel().getGmodCtrl().getScrgmodTermCodeTo().isNull() || (getFormModel().getGmodCtrl().getScrgmodTermCodeTo().isNull() && getFormModel().getGmodCtrl().getScrgmodTermCodeFrom().isNull()) ))
						return;
				
				
				if ( this.getTask().getServices().selectScbcrky1(getFormModel().getKeyBlock().getScacrseSubjCode(), getFormModel().getKeyBlock().getScacrseCrseNumb(), termCode).getValue() )
				{
					scbcrseElement.setScbcrkyTermCodeEnd(termCode.val);
				}
					scbcrseElement.setScbcrkyTermCodeEnd(termCode.val);
					
				if ( getFormModel().getGmodCtrl().getScrgmodTermCodeTo().isNull() )
				{
					getFormModel().getGmodCtrl().setScrgmodTermCodeTo(getFormModel().getFormHeader().getTermCodeEnd());
				}
			
			
			}

		
		/* Original PL/SQL code code for TRIGGER SCRGMOD.POST-QUERY
		    :GMOD_CTRL.SCRGMOD_TERM_CODE_FROM :=
      :SCRGMOD.SCRGMOD_EFF_TERM ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRGMOD.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void scrgmod_AfterQuery(RowAdapterEvent args)
		{
			
				ScrgmodAdapter scrgmodElement = (ScrgmodAdapter)args.getRow();


				getFormModel().getGmodCtrl().setScrgmodTermCodeFrom(scrgmodElement.getScrgmodEffTerm());
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRGMOD_GMOD_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SCRGMOD_GMOD_CODE")
		public void scrgmodGmodCode_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRGMOD_GMOD_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SCRGMOD_GMOD_CODE", function=KeyFunction.ITEM_CHANGE)
		public void scrgmodGmodCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRGMOD_GMOD_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SCRGMOD_GMOD_CODE")
		public void scrgmodGmodCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRGMOD_GMOD_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SCRGMOD_GMOD_CODE")
		public void scrgmodGmodCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRGMOD_GMOD_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SCRGMOD_GMOD_CODE", function=KeyFunction.NEXT_ITEM)
		public void scrgmodGmodCode_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRGMOD_GMOD_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SCRGMOD_GMOD_CODE", function=KeyFunction.ITEM_OUT)
		public void scrgmodGmodCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER SCRGMOD_GMOD_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVGMOD_DESC
         FROM   STVGMOD
         WHERE  STVGMOD_CODE = :SCRGMOD_GMOD_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :STVGMOD_DESCRIPTION ;
   END ;
--
   :GLOBAL.QUERY_MODE := '0' ;
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ;
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRGMOD_GMOD_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="SCRGMOD_GMOD_CODE")
		public void scrgmodGmodCode_PostChange()
		{
			

				
				ScrgmodAdapter scrgmodElement = (ScrgmodAdapter)this.getFormModel().getScrgmod().getRowAdapter(true);


				int rowCount = 0;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					{
						String sqlptiCursor = "SELECT STVGMOD_DESC " +
	" FROM STVGMOD " +
	" WHERE STVGMOD_CODE = :SCRGMOD_GMOD_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("SCRGMOD_GMOD_CODE", scrgmodElement.getScrgmodGmodCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								scrgmodElement.setStvgmodDescription(ptiCursorResults.getStr(0));
							}
						}
						finally{
							ptiCursor.close();
						}
					}
					// 
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVGMOD_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVGMOD_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void stvgmodDescription_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
	
	
}
