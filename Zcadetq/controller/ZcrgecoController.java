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
		
public class ZcrgecoController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public ZcrgecoController(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER ZCRGECO.PRE-QUERY
		    :GECO_CTRL.ZCRGECO_TERM_CODE_FROM :=
      :SCBCRSE.SCBCRSE_EFF_TERM ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT MIN(ZCRGECO_EFF_TERM)
         FROM   ZCRGECO
         WHERE  ZCRGECO_SUBJ_CODE = :KEY_BLOCK.SCACRSE_SUBJ_CODE
           AND  ZCRGECO_CRSE_NUMB = :KEY_BLOCK.SCACRSE_CRSE_NUMB
           AND  ZCRGECO_EFF_TERM > :KEY_BLOCK.STVTERM_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :GECO_CTRL.ZCRGECO_TERM_CODE_TO ;
   END ;
--
   IF :GECO_CTRL.ZCRGECO_TERM_CODE_TO IN (
      :GECO_CTRL.ZCRGECO_TERM_CODE_FROM) OR
      :GECO_CTRL.ZCRGECO_TERM_CODE_TO IS NULL  OR (
      :GECO_CTRL.ZCRGECO_TERM_CODE_TO IS NULL AND
      :GECO_CTRL.ZCRGECO_TERM_CODE_FROM IS NULL ) THEN
      GOTO GET_SCBCRKY ;
   ELSE
      RETURN ;
   END IF ;
--
   << GET_SCBCRKY >>
   IF SELECT_SCBCRKY_1 (:KEY_BLOCK.SCACRSE_SUBJ_CODE,
      :KEY_BLOCK.SCACRSE_CRSE_NUMB,
      :GECO_CTRL.ZCRGECO_TERM_CODE_TO) THEN
      GOTO PTI_STEP_001;
   END IF ;
--
	 << PTI_STEP_001 >>
   IF :GECO_CTRL.ZCRGECO_TERM_CODE_TO IS NULL  THEN
      :GECO_CTRL.ZCRGECO_TERM_CODE_TO := :TERM_CODE_END ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void zcrgeco_BeforeQuery(QueryEvent args)
		{
			
				ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);
				Ref<NString> termCode = new Ref<NString>(getFormModel().getGecoCtrl().getZcrgecoTermCodeTo());

				int rowCount = 0;
					

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", this.getFormModel().getKeyBlock().getScacrseSubjCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", this.getFormModel().getKeyBlock().getScacrseCrseNumb()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_STVTERM_CODE", this.getFormModel().getKeyBlock().getStvtermCode()));             


           
				getFormModel().getGecoCtrl().setZcrgecoTermCodeFrom(scbcrseElement.getScbcrseEffTerm());
				{
					String sqlptiCursor = "SELECT MIN(ZCRGECO_EFF_TERM) " +
	" FROM ZCRGECO " +
	" WHERE ZCRGECO_SUBJ_CODE = :KEY_BLOCK_SCACRSE_SUBJ_CODE AND ZCRGECO_CRSE_NUMB = :KEY_BLOCK_SCACRSE_CRSE_NUMB AND ZCRGECO_EFF_TERM > :KEY_BLOCK_STVTERM_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", getFormModel().getKeyBlock().getScacrseSubjCode());
						ptiCursor.addParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", getFormModel().getKeyBlock().getScacrseCrseNumb());
						ptiCursor.addParameter("KEY_BLOCK_STVTERM_CODE", getFormModel().getKeyBlock().getStvtermCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getGecoCtrl().setZcrgecoTermCodeTo(ptiCursorResults.getStr(0));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if ( !(in(getFormModel().getGecoCtrl().getZcrgecoTermCodeTo(), getFormModel().getGecoCtrl().getZcrgecoTermCodeFrom()).getValue() || getFormModel().getGecoCtrl().getZcrgecoTermCodeTo().isNull() || (getFormModel().getGecoCtrl().getZcrgecoTermCodeTo().isNull() && getFormModel().getGecoCtrl().getZcrgecoTermCodeFrom().isNull()) ))
						return;
				
				
				if ( this.getTask().getServices().selectScbcrky1(getFormModel().getKeyBlock().getScacrseSubjCode(), getFormModel().getKeyBlock().getScacrseCrseNumb(), termCode).getValue() )
				{
					getFormModel().getGecoCtrl().setZcrgecoTermCodeTo(termCode.val);
				}
					getFormModel().getGecoCtrl().setZcrgecoTermCodeTo(termCode.val);
					
				if ( getFormModel().getGecoCtrl().getZcrgecoTermCodeTo().isNull() )
				{
					getFormModel().getGecoCtrl().setZcrgecoTermCodeTo(getFormModel().getFormHeader().getTermCodeEnd());
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO.POST-QUERY
		    :GECO_CTRL.ZCRGECO_TERM_CODE_FROM :=
      :ZCRGECO.ZCRGECO_EFF_TERM ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void zcrgeco_AfterQuery(RowAdapterEvent args)
		{
			
				ZcrgecoAdapter zcrgecoElement = (ZcrgecoAdapter)args.getRow();


				getFormModel().getGecoCtrl().setZcrgecoTermCodeFrom(zcrgecoElement.getZcrgecoEffTerm());
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_SUBJ_CODE_COCRSE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="ZCRGECO_SUBJ_CODE_COCRSE")
		public void zcrgecoSubjCodeCocrse_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_SUBJ_CODE_COCRSE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ZCRGECO_SUBJ_CODE_COCRSE", function=KeyFunction.ITEM_CHANGE)
		public void zcrgecoSubjCodeCocrse_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_SUBJ_CODE_COCRSE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="ZCRGECO_SUBJ_CODE_COCRSE")
		public void zcrgecoSubjCodeCocrse_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_SUBJ_CODE_COCRSE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="ZCRGECO_SUBJ_CODE_COCRSE")
		public void zcrgecoSubjCodeCocrse_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_SUBJ_CODE_COCRSE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ZCRGECO_SUBJ_CODE_COCRSE", function=KeyFunction.NEXT_ITEM)
		public void zcrgecoSubjCodeCocrse_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_SUBJ_CODE_COCRSE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="ZCRGECO_SUBJ_CODE_COCRSE", function=KeyFunction.ITEM_OUT)
		public void zcrgecoSubjCodeCocrse_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_SUBJ_CODE_COCRSE.POST-CHANGE
		    DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVSUBJ_DESC
         FROM   STVSUBJ
         WHERE  STVSUBJ_CODE = :ZCRGECO_SUBJ_CODE_COCRSE;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :ZCRGECO_SUBJ_CODE_COCRSE_DESC;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
         '*ERROR* Invalid code, press LIST for valid codes.', TRUE);
      CLOSE PTI_CURSOR;
   END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_SUBJ_CODE_COCRSE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="ZCRGECO_SUBJ_CODE_COCRSE")
		public void zcrgecoSubjCodeCocrse_PostChange()
		{
			

				
				ZcrgecoAdapter zcrgecoElement = (ZcrgecoAdapter)this.getFormModel().getZcrgeco().getRowAdapter(true);


				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT STVSUBJ_DESC " +
	" FROM STVSUBJ " +
	" WHERE STVSUBJ_CODE = :ZCRGECO_SUBJ_CODE_COCRSE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("ZCRGECO_SUBJ_CODE_COCRSE", zcrgecoElement.getZcrgecoSubjCodeCocrse());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							zcrgecoElement.setZcrgecoSubjCodeCocrseDesc(ptiCursorResults.getStr(0));
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
		 * ZCRGECO_SUBJ_CODE_COCRSE_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ZCRGECO_SUBJ_CODE_COCRSE_DESC", function=KeyFunction.ITEM_CHANGE)
		public void zcrgecoSubjCodeCocrseDesc_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
		/* Original PL/SQL code code for TRIGGER ZCRGECO_CRSE_NUMB_COCRSE.KEY-CQUERY
		 :GLOBAL.SUBJ_CODE := :ZCRGECO.ZCRGECO_SUBJ_CODE_COCRSE;
--CALL_FORM('SCQSUBJ',NO_HIDE,DO_REPLACE,QUERY_ONLY);
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'SCQSUBJ','QUERY_NOHIDE');
G$_CHECK_FAILURE;
NEXT_FIELD;
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ZCRGECO_CRSE_NUMB_COCRSE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="ZCRGECO_CRSE_NUMB_COCRSE", function=KeyFunction.COUNT_QUERY, fireInSearch=false)
		public void zcrgecoCrseNumbCocrse_TotalResults()
		{
			

				
				ZcrgecoAdapter zcrgecoElement = (ZcrgecoAdapter)this.getFormModel().getZcrgeco().getRowAdapter(true);


				setGlobal("SUBJ_CODE", zcrgecoElement.getZcrgecoSubjCodeCocrse());
				// CALL_FORM('SCQSUBJ',NO_HIDE,DO_REPLACE,QUERY_ONLY);
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("SCQSUBJ"), toStr("QUERY_NOHIDE"));
				getTask().getGoqrpls().gCheckFailure();
				nextItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
	
	
}
