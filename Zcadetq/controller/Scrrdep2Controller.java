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
    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
		
public class Scrrdep2Controller extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	

	
	public Scrrdep2Controller(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER SCRRDEP_2.PRE-QUERY
		    :SCRRDEP_TERM_CODE_FROM := :SCBCRSE.SCBCRSE_EFF_TERM ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT MIN(SCRRDEP_EFF_TERM)
         FROM   SCRRDEP
         WHERE  SCRRDEP_EFF_TERM   > :KEY_BLOCK.STVTERM_CODE 
           AND  SCRRDEP_CRSE_NUMB  = :KEY_BLOCK.SCACRSE_CRSE_NUMB
           AND  SCRRDEP_SUBJ_CODE  = :KEY_BLOCK.SCACRSE_SUBJ_CODE;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :SCRRDEP_TERM_CODE_TO ;
      CLOSE PTI_CURSOR;
   END ;
--
   IF :SCRRDEP_1.SCRRDEP_TERM_CODE_TO IN (
      :SCRRDEP_1.SCRRDEP_TERM_CODE_FROM) OR
      :SCRRDEP_1.SCRRDEP_TERM_CODE_TO IS NULL  OR (
      :SCRRDEP_1.SCRRDEP_TERM_CODE_TO IS NULL AND
      :SCRRDEP_1.SCRRDEP_TERM_CODE_FROM IS NULL ) THEN
      GOTO GET_SCBCRKY ;
   ELSE
      RETURN ;
   END IF ;
--
   << GET_SCBCRKY >>
   IF SELECT_SCBCRKY_1 (:KEY_BLOCK.SCACRSE_SUBJ_CODE,
      :KEY_BLOCK.SCACRSE_CRSE_NUMB,
      :SCRRDEP_1.SCRRDEP_TERM_CODE_TO) THEN
      GOTO PTI_STEP_001;
   END IF ;
--
	 << PTI_STEP_001 >>
   IF :SCRRDEP_1.SCRRDEP_TERM_CODE_TO IS NULL  THEN
      :SCRRDEP_1.SCRRDEP_TERM_CODE_TO := :TERM_CODE_END ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRDEP_2.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void scrrdep2_BeforeQuery(QueryEvent args)
		{
			
				ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);
				Scrrdep1Adapter scrrdep1Element = (Scrrdep1Adapter)this.getFormModel().getScrrdep1().getRowAdapter(true);
				
				Ref<NString> termCode = new Ref<NString>(scrrdep1Element.getScrrdepTermCodeTo());

				int rowCount = 0;

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", this.getFormModel().getKeyBlock().getScacrseSubjCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", this.getFormModel().getKeyBlock().getScacrseCrseNumb()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_STVTERM_CODE", this.getFormModel().getKeyBlock().getStvtermCode()));             


           
				scrrdep1Element.setScrrdepTermCodeFrom(scbcrseElement.getScbcrseEffTerm());
				{
					String sqlptiCursor = "SELECT MIN(SCRRDEP_EFF_TERM) " +
	" FROM SCRRDEP " +
	" WHERE SCRRDEP_EFF_TERM > :KEY_BLOCK_STVTERM_CODE AND SCRRDEP_CRSE_NUMB = :KEY_BLOCK_SCACRSE_CRSE_NUMB AND SCRRDEP_SUBJ_CODE = :KEY_BLOCK_SCACRSE_SUBJ_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KEY_BLOCK_STVTERM_CODE", getFormModel().getKeyBlock().getStvtermCode());
						ptiCursor.addParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", getFormModel().getKeyBlock().getScacrseCrseNumb());
						ptiCursor.addParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", getFormModel().getKeyBlock().getScacrseSubjCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							scrrdep1Element.setScrrdepTermCodeTo(ptiCursorResults.getStr(0));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if (! in(scrrdep1Element.getScrrdepTermCodeTo(), scrrdep1Element.getScrrdepTermCodeFrom()).getValue() || scrrdep1Element.getScrrdepTermCodeTo().isNull() || (scrrdep1Element.getScrrdepTermCodeTo().isNull() && scrrdep1Element.getScrrdepTermCodeFrom().isNull()) ){
					
				}
				else{
					return;
				}
				
				if ( this.getTask().getServices().selectScbcrky1(getFormModel().getKeyBlock().getScacrseSubjCode(), getFormModel().getKeyBlock().getScacrseCrseNumb(), termCode).getValue() )
				{
					scrrdep1Element.setScrrdepTermCodeTo(termCode.val);
				}
				if ( scrrdep1Element.getScrrdepTermCodeTo().isNull() )
				{
					scrrdep1Element.setScrrdepTermCodeTo(getFormModel().getFormHeader().getTermCodeEnd());
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SCRRDEP_2.POST-QUERY
		    :SCRRDEP_1.SCRRDEP_TERM_CODE_FROM := :SCRRDEP_2.SCRRDEP_EFF_TERM;
   :STVDEPT_DESC := GB_STVDEPT.F_GET_DESCRIPTION(:SCRRDEP_2.SCRRDEP_DEPT_CODE);   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRDEP_2.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void scrrdep2_AfterQuery(RowAdapterEvent args)
		{
			
				Scrrdep1Adapter scrrdep1Element = (Scrrdep1Adapter)this.getFormModel().getScrrdep1().getRowAdapter(true);
				Scrrdep2Adapter scrrdep2Element = (Scrrdep2Adapter)args.getRow();


				scrrdep1Element.setScrrdepTermCodeFrom(scrrdep2Element.getScrrdepEffTerm());
				scrrdep2Element.setStvdeptDesc(GbStvdept.fGetDescription(scrrdep2Element.getScrrdepDeptCode()));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRDEP_DEPT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SCRRDEP_DEPT_CODE")
		public void scrrdepDeptCode_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRDEP_DEPT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SCRRDEP_DEPT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void scrrdepDeptCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRDEP_DEPT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SCRRDEP_DEPT_CODE")
		public void scrrdepDeptCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRDEP_DEPT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SCRRDEP_DEPT_CODE")
		public void scrrdepDeptCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRDEP_DEPT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SCRRDEP_DEPT_CODE", function=KeyFunction.NEXT_ITEM)
		public void scrrdepDeptCode_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRDEP_DEPT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SCRRDEP_DEPT_CODE", function=KeyFunction.ITEM_OUT)
		public void scrrdepDeptCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER STVDEPT_DESC.WHEN-NEW-ITEM-INSTANCE
		 PREVIOUS_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEPT_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVDEPT_DESC", function=KeyFunction.ITEM_CHANGE)
		public void stvdeptDesc_itemChange()
		{
			
				previousItem();
			}

		
	
	
}
