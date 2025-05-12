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

import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
		
public class Scrrcol2Controller extends DefaultBlockController {

	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	
	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	

	
	public Scrrcol2Controller(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER SCRRCOL_2.PRE-QUERY
		    :SCRRCOL_1.SCRRCOL_TERM_CODE_FROM :=
      :SCBCRSE.SCBCRSE_EFF_TERM ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT MIN(SCRRCOL_EFF_TERM)
         FROM   SCRRCOL
         WHERE  SCRRCOL_SUBJ_CODE = :KEY_BLOCK.SCACRSE_SUBJ_CODE
           AND  SCRRCOL_CRSE_NUMB = :KEY_BLOCK.SCACRSE_CRSE_NUMB
           AND  SCRRCOL_EFF_TERM > :KEY_BLOCK.STVTERM_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :SCRRCOL_1.SCRRCOL_TERM_CODE_TO ;
   END ;
--
   IF :SCRRCOL_1.SCRRCOL_TERM_CODE_TO IN (
      :SCRRCOL_1.SCRRCOL_TERM_CODE_FROM) OR
      :SCRRCOL_1.SCRRCOL_TERM_CODE_TO IS NULL  OR (
      :SCRRCOL_1.SCRRCOL_TERM_CODE_TO IS NULL AND
      :SCRRCOL_1.SCRRCOL_TERM_CODE_FROM IS NULL ) THEN
      GOTO GET_SCBCRKY ;
   ELSE
      RETURN ;
   END IF ;
--
   << GET_SCBCRKY >>
   IF SELECT_SCBCRKY_1 (:KEY_BLOCK.SCACRSE_SUBJ_CODE,
      :KEY_BLOCK.SCACRSE_CRSE_NUMB,
      :SCRRCOL_1.SCRRCOL_TERM_CODE_TO) THEN
      GOTO PTI_STEP_001;
   END IF ;
--
	 << PTI_STEP_001 >>
   IF :SCRRCOL_1.SCRRCOL_TERM_CODE_TO IS NULL  THEN
      :SCRRCOL_1.SCRRCOL_TERM_CODE_TO := :TERM_CODE_END ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRCOL_2.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void scrrcol2_BeforeQuery(QueryEvent args)
		{
			
				Scrrcol1Adapter scrrcol1Element = (Scrrcol1Adapter)this.getFormModel().getScrrcol1().getRowAdapter(true);
				ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);
					
				Ref<NString> termCode = new Ref<NString>(scbcrseElement.getScbcrkyTermCodeEnd());

				int rowCount = 0;

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", this.getFormModel().getKeyBlock().getScacrseSubjCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", this.getFormModel().getKeyBlock().getScacrseCrseNumb()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_STVTERM_CODE", this.getFormModel().getKeyBlock().getStvtermCode()));             


           
				scrrcol1Element.setScrrcolTermCodeFrom(scbcrseElement.getScbcrseEffTerm());
				{
					String sqlptiCursor = "SELECT MIN(SCRRCOL_EFF_TERM) " +
	" FROM SCRRCOL " +
	" WHERE SCRRCOL_SUBJ_CODE = :KEY_BLOCK_SCACRSE_SUBJ_CODE AND SCRRCOL_CRSE_NUMB = :KEY_BLOCK_SCACRSE_CRSE_NUMB AND SCRRCOL_EFF_TERM > :KEY_BLOCK_STVTERM_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", getFormModel().getKeyBlock().getScacrseSubjCode());
						ptiCursor.addParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", toStr(toNumber(getFormModel().getKeyBlock().getScacrseCrseNumb())));
						ptiCursor.addParameter("KEY_BLOCK_STVTERM_CODE", getFormModel().getKeyBlock().getStvtermCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							scrrcol1Element.setScrrcolTermCodeTo(ptiCursorResults.getStr(0));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if ( !(in(scrrcol1Element.getScrrcolTermCodeTo(), scrrcol1Element.getScrrcolTermCodeFrom()).getValue() || scrrcol1Element.getScrrcolTermCodeTo().isNull() || (scrrcol1Element.getScrrcolTermCodeTo().isNull() && scrrcol1Element.getScrrcolTermCodeFrom().isNull())) )
					return;
				
				if ( this.getTask().getServices().selectScbcrky1(getFormModel().getKeyBlock().getScacrseSubjCode(), getFormModel().getKeyBlock().getScacrseCrseNumb(), termCode).getValue() )
				{
					scrrcol1Element.setScrrcolTermCodeTo(termCode.val);
				}
					scrrcol1Element.setScrrcolTermCodeTo(termCode.val);
				if ( scrrcol1Element.getScrrcolTermCodeTo().isNull() )
				{
					scrrcol1Element.setScrrcolTermCodeTo(getFormModel().getFormHeader().getTermCodeEnd());
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SCRRCOL_2.POST-QUERY
		    :SCRRCOL_1.SCRRCOL_TERM_CODE_FROM :=
      :SCRRCOL_2.SCRRCOL_EFF_TERM ;
--
-- SRF 3508
   :SCRRCOL_2.STVCOLL_DESC := GB_STVCOLL.F_GET_DESCRIPTION(
                                      :SCRRCOL_2.SCRRCOL_COLL_CODE);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRCOL_2.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void scrrcol2_AfterQuery(RowAdapterEvent args)
		{
			
				Scrrcol1Adapter scrrcol1Element = (Scrrcol1Adapter)this.getFormModel().getScrrcol1().getRowAdapter(true);
				Scrrcol2Adapter scrrcol2Element = (Scrrcol2Adapter)args.getRow();


				scrrcol1Element.setScrrcolTermCodeFrom(scrrcol2Element.getScrrcolEffTerm());
				// 
				//  SRF 3508
				scrrcol2Element.setStvcollDesc(GbStvcoll.fGetDescription(scrrcol2Element.getScrrcolCollCode()));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVCOLL_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVCOLL_DESC", function=KeyFunction.ITEM_CHANGE)
		public void stvcollDesc_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRCOL_COLL_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SCRRCOL_COLL_CODE")
		public void scrrcolCollCode_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRCOL_COLL_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SCRRCOL_COLL_CODE", function=KeyFunction.ITEM_CHANGE)
		public void scrrcolCollCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRCOL_COLL_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SCRRCOL_COLL_CODE")
		public void scrrcolCollCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRCOL_COLL_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SCRRCOL_COLL_CODE")
		public void scrrcolCollCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRCOL_COLL_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SCRRCOL_COLL_CODE", function=KeyFunction.NEXT_ITEM)
		public void scrrcolCollCode_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRCOL_COLL_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SCRRCOL_COLL_CODE", function=KeyFunction.ITEM_OUT)
		public void scrrcolCollCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
	
	
}
