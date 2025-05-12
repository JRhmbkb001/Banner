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
		
public class Scrrprg2Controller extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	

	
	public Scrrprg2Controller(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER SCRRPRG_2.PRE-QUERY
		    :SCRRPRG_TERM_CODE_FROM := :SCBCRSE.SCBCRSE_EFF_TERM ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT MIN(SCRRPRG_TERM_CODE_EFFECTIVE)
         FROM   SCRRPRG
         WHERE  SCRRPRG_TERM_CODE_EFFECTIVE   > :KEY_BLOCK.STVTERM_CODE 
           AND  SCRRPRG_CRSE_NUMB             = :KEY_BLOCK.SCACRSE_CRSE_NUMB
           AND  SCRRPRG_SUBJ_CODE             = :KEY_BLOCK.SCACRSE_SUBJ_CODE;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :SCRRPRG_TERM_CODE_TO ;
      CLOSE PTI_CURSOR;
   END ;
--
   IF :SCRRPRG_1.SCRRPRG_TERM_CODE_TO IN (
      :SCRRPRG_1.SCRRPRG_TERM_CODE_FROM) OR
      :SCRRPRG_1.SCRRPRG_TERM_CODE_TO IS NULL  OR (
      :SCRRPRG_1.SCRRPRG_TERM_CODE_TO IS NULL AND
      :SCRRPRG_1.SCRRPRG_TERM_CODE_FROM IS NULL ) THEN
      GOTO GET_SCBCRKY ;
   ELSE
      RETURN ;
   END IF ;
--
   << GET_SCBCRKY >>
   IF SELECT_SCBCRKY_1 (:KEY_BLOCK.SCACRSE_SUBJ_CODE,
      :KEY_BLOCK.SCACRSE_CRSE_NUMB,
      :SCRRPRG_1.SCRRPRG_TERM_CODE_TO) THEN
      GOTO PTI_STEP_001;
   END IF ;
--
	 << PTI_STEP_001 >>
   IF :SCRRPRG_1.SCRRPRG_TERM_CODE_TO IS NULL  THEN
      :SCRRPRG_1.SCRRPRG_TERM_CODE_TO := :TERM_CODE_END ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRPRG_2.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void scrrprg2_BeforeQuery(QueryEvent args)
		{
			
				ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);
				Scrrprg1Adapter scrrprg1Element = (Scrrprg1Adapter)this.getFormModel().getScrrprg1().getRowAdapter(true);
				
				Ref<NString> termCode = new Ref<NString>(scrrprg1Element.getScrrprgTermCodeTo());


				int rowCount = 0;

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", this.getFormModel().getKeyBlock().getScacrseSubjCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", this.getFormModel().getKeyBlock().getScacrseCrseNumb()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_STVTERM_CODE", this.getFormModel().getKeyBlock().getStvtermCode()));             


           
				scrrprg1Element.setScrrprgTermCodeFrom(scbcrseElement.getScbcrseEffTerm());
				{
					String sqlptiCursor = "SELECT MIN(SCRRPRG_TERM_CODE_EFFECTIVE) " +
	" FROM SCRRPRG " +
	" WHERE SCRRPRG_TERM_CODE_EFFECTIVE > :KEY_BLOCK_STVTERM_CODE AND SCRRPRG_CRSE_NUMB = :KEY_BLOCK_SCACRSE_CRSE_NUMB AND SCRRPRG_SUBJ_CODE = :KEY_BLOCK_SCACRSE_SUBJ_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KEY_BLOCK_STVTERM_CODE", getFormModel().getKeyBlock().getStvtermCode());
						ptiCursor.addParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", getFormModel().getKeyBlock().getScacrseCrseNumb());
						ptiCursor.addParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", getFormModel().getKeyBlock().getScacrseSubjCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							scrrprg1Element.setScrrprgTermCodeTo(ptiCursorResults.getStr(0));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if ( !in(scrrprg1Element.getScrrprgTermCodeTo(), scrrprg1Element.getScrrprgTermCodeFrom()).getValue() || scrrprg1Element.getScrrprgTermCodeTo().isNull() || (scrrprg1Element.getScrrprgTermCodeTo().isNull() && scrrprg1Element.getScrrprgTermCodeFrom().isNull()) ){
					
				}
				else{
					return;
				}
				
				
				if ( this.getTask().getServices().selectScbcrky1(getFormModel().getKeyBlock().getScacrseSubjCode(), getFormModel().getKeyBlock().getScacrseCrseNumb(), termCode).getValue() )
				{
					scrrprg1Element.setScrrprgTermCodeTo(termCode.val);
				}
				if ( scrrprg1Element.getScrrprgTermCodeTo().isNull() )
				{
					scrrprg1Element.setScrrprgTermCodeTo(getFormModel().getFormHeader().getTermCodeEnd());
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SCRRPRG_2.POST-QUERY
		    :SCRRPRG_1.SCRRPRG_TERM_CODE_FROM := :SCRRPRG_2.SCRRPRG_TERM_CODE_EFFECTIVE;
--
-- SRF 3504
   :PROGRAM_DESCRIPTION := SB_SMRPRLE.F_GET_DESCRIPTION(:SCRRPRG_2.SCRRPRG_PROGRAM); 
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRPRG_2.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void scrrprg2_AfterQuery(RowAdapterEvent args)
		{
			
				Scrrprg1Adapter scrrprg1Element = (Scrrprg1Adapter)this.getFormModel().getScrrprg1().getRowAdapter(true);
				Scrrprg2Adapter scrrprg2Element = (Scrrprg2Adapter)args.getRow();


				scrrprg1Element.setScrrprgTermCodeFrom(scrrprg2Element.getScrrprgTermCodeEffective());
				// 
				//  SRF 3504
				scrrprg2Element.setProgramDescription(SbSmrprle.fGetDescription(scrrprg2Element.getScrrprgProgram()));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRPRG_PROGRAM.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SCRRPRG_PROGRAM")
		public void scrrprgProgram_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRPRG_PROGRAM.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SCRRPRG_PROGRAM", function=KeyFunction.ITEM_CHANGE)
		public void scrrprgProgram_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRPRG_PROGRAM.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SCRRPRG_PROGRAM")
		public void scrrprgProgram_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRPRG_PROGRAM.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SCRRPRG_PROGRAM")
		public void scrrprgProgram_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRPRG_PROGRAM.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SCRRPRG_PROGRAM", function=KeyFunction.NEXT_ITEM)
		public void scrrprgProgram_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRPRG_PROGRAM.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SCRRPRG_PROGRAM", function=KeyFunction.ITEM_OUT)
		public void scrrprgProgram_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER PROGRAM_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 PREVIOUS_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PROGRAM_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PROGRAM_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void programDescription_itemChange()
		{
			
				previousItem();
			}

		
	
	
}
