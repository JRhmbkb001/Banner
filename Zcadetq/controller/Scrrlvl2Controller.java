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
		
public class Scrrlvl2Controller extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public Scrrlvl2Controller(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER SCRRLVL_2.PRE-QUERY
		    :SCRRLVL_1.SCRRLVL_TERM_CODE_FROM :=
      :SCBCRSE.SCBCRSE_EFF_TERM ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT MIN(SCRRLVL_EFF_TERM)
         FROM   SCRRLVL
         WHERE  SCRRLVL_SUBJ_CODE = :KEY_BLOCK.SCACRSE_SUBJ_CODE
           AND  SCRRLVL_CRSE_NUMB = :KEY_BLOCK.SCACRSE_CRSE_NUMB
           AND  SCRRLVL_EFF_TERM > :KEY_BLOCK.STVTERM_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :SCRRLVL_1.SCRRLVL_TERM_CODE_TO ;
   END ;
--
   IF :SCRRLVL_1.SCRRLVL_TERM_CODE_TO IN (
      :SCRRLVL_1.SCRRLVL_TERM_CODE_FROM) OR
      :SCRRLVL_1.SCRRLVL_TERM_CODE_TO IS NULL  OR (
      :SCRRLVL_1.SCRRLVL_TERM_CODE_TO IS NULL AND
      :SCRRLVL_1.SCRRLVL_TERM_CODE_FROM IS NULL ) THEN
      GOTO GET_SCBCRKY ;
   ELSE
      RETURN ;
   END IF ;
--
   << GET_SCBCRKY >>
   IF SELECT_SCBCRKY_1 (:KEY_BLOCK.SCACRSE_SUBJ_CODE,
      :KEY_BLOCK.SCACRSE_CRSE_NUMB,
      :SCRRLVL_1.SCRRLVL_TERM_CODE_TO) THEN
      GOTO PTI_STEP_001;
   END IF ;
--
	 << PTI_STEP_001 >>
   IF :SCRRLVL_1.SCRRLVL_TERM_CODE_TO IS NULL  THEN
      :SCRRLVL_1.SCRRLVL_TERM_CODE_TO := :TERM_CODE_END ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRLVL_2.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void scrrlvl2_BeforeQuery(QueryEvent args)
		{
			
				Scrrlvl1Adapter scrrlvl1Element = (Scrrlvl1Adapter)this.getFormModel().getScrrlvl1().getRowAdapter(true);
				ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);
				
				Ref<NString> termCode = new Ref<NString>(scrrlvl1Element.getScrrlvlTermCodeTo());

				int rowCount = 0;

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", this.getFormModel().getKeyBlock().getScacrseSubjCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", this.getFormModel().getKeyBlock().getScacrseCrseNumb()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_STVTERM_CODE", this.getFormModel().getKeyBlock().getStvtermCode()));             


           
				scrrlvl1Element.setScrrlvlTermCodeFrom(scbcrseElement.getScbcrseEffTerm());
				{
					String sqlptiCursor = "SELECT MIN(SCRRLVL_EFF_TERM) " +
	" FROM SCRRLVL " +
	" WHERE SCRRLVL_SUBJ_CODE = :KEY_BLOCK_SCACRSE_SUBJ_CODE AND SCRRLVL_CRSE_NUMB = :KEY_BLOCK_SCACRSE_CRSE_NUMB AND SCRRLVL_EFF_TERM > :KEY_BLOCK_STVTERM_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", getFormModel().getKeyBlock().getScacrseSubjCode());
						ptiCursor.addParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", getFormModel().getKeyBlock().getScacrseCrseNumb());
						ptiCursor.addParameter("KEY_BLOCK_STVTERM_CODE", getFormModel().getKeyBlock().getStvtermCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null  ) {
							scrrlvl1Element.setScrrlvlTermCodeTo(ptiCursorResults.getStr(0));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if ( in(scrrlvl1Element.getScrrlvlTermCodeTo(), scrrlvl1Element.getScrrlvlTermCodeFrom()).getValue() || scrrlvl1Element.getScrrlvlTermCodeTo().isNull() || (scrrlvl1Element.getScrrlvlTermCodeTo().isNull() && scrrlvl1Element.getScrrlvlTermCodeFrom().isNull()) ){
				}
				else{
					return;
				}
					
				
				if ( this.getTask().getServices().selectScbcrky1(getFormModel().getKeyBlock().getScacrseSubjCode(), getFormModel().getKeyBlock().getScacrseCrseNumb(), termCode).getValue() )
				{
					scrrlvl1Element.setScrrlvlTermCodeTo(termCode.val);
				}
//					scrrlvl1Element.setScrrlvlTermCodeTo(termCode.val);
				if ( scrrlvl1Element.getScrrlvlTermCodeTo().isNull() )
				{
					scrrlvl1Element.setScrrlvlTermCodeTo(getFormModel().getFormHeader().getTermCodeEnd());
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SCRRLVL_2.POST-QUERY
		    :SCRRLVL_1.SCRRLVL_TERM_CODE_FROM :=
      :SCRRLVL_2.SCRRLVL_EFF_TERM ;
--
-- SRF 3504
   :SCRRLVL_2.STVLEVL_DESC := GB_STVLEVL.F_GET_DESCRIPTION(
                                   :SCRRLVL_2.SCRRLVL_LEVL_CODE);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRLVL_2.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void scrrlvl2_AfterQuery(RowAdapterEvent args)
		{
			
				Scrrlvl1Adapter scrrlvl1Element = (Scrrlvl1Adapter)this.getFormModel().getScrrlvl1().getRowAdapter(true);
				Scrrlvl2Adapter scrrlvl2Element = (Scrrlvl2Adapter)args.getRow();


				scrrlvl1Element.setScrrlvlTermCodeFrom(scrrlvl2Element.getScrrlvlEffTerm());
				// 
				//  SRF 3504
				scrrlvl2Element.setStvlevlDesc(GbStvlevl.fGetDescription(scrrlvl2Element.getScrrlvlLevlCode()));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRLVL_LEVL_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SCRRLVL_LEVL_CODE")
		public void scrrlvlLevlCode_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRLVL_LEVL_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SCRRLVL_LEVL_CODE", function=KeyFunction.ITEM_CHANGE)
		public void scrrlvlLevlCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRLVL_LEVL_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SCRRLVL_LEVL_CODE")
		public void scrrlvlLevlCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRLVL_LEVL_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SCRRLVL_LEVL_CODE")
		public void scrrlvlLevlCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRLVL_LEVL_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SCRRLVL_LEVL_CODE", function=KeyFunction.NEXT_ITEM)
		public void scrrlvlLevlCode_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRLVL_LEVL_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SCRRLVL_LEVL_CODE", function=KeyFunction.ITEM_OUT)
		public void scrrlvlLevlCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVLEVL_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVLEVL_DESC", function=KeyFunction.ITEM_CHANGE)
		public void stvlevlDesc_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
	
	
}
