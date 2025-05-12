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
		
public class ScrrtstController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	

	
	public ScrrtstController(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER SCRRTST.PRE-QUERY
		 :SCRRTST_TERM_CODE_FROM := :SCBCRSE.SCBCRSE_EFF_TERM ;
<multilinecomment> changed select for defect 51767 </multilinecomment>  
BEGIN
SELECT MIN(SCRRTST_TERM_CODE_EFF)
 INTO :SCRRTST_TERM_CODE_TO
 FROM   SCRRTST
 WHERE  SCRRTST_TERM_CODE_EFF     > :SCRRTST_TERM_CODE_FROM
           AND  SCRRTST_CRSE_NUMB = :KEY_BLOCK.SCACRSE_CRSE_NUMB
           AND  SCRRTST_SUBJ_CODE = :KEY_BLOCK.SCACRSE_SUBJ_CODE ;
 IF :SCRRTST_TERM_CODE_TO IS NULL THEN
   RAISE NO_DATA_FOUND;
 END IF;
EXCEPTION
  WHEN NO_DATA_FOUND THEN  
  SELECT  SCBCRKY_TERM_CODE_END
   INTO :SCRRTST_TERM_CODE_TO
   FROM  SCBCRKY
   WHERE SCBCRKY_CRSE_NUMB = :KEY_BLOCK.SCACRSE_CRSE_NUMB
    AND  SCBCRKY_SUBJ_CODE = :KEY_BLOCK.SCACRSE_SUBJ_CODE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void scrrtst_BeforeQuery(QueryEvent args)
		{
			
				ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);


				int rowCount = 0;

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", this.getFormModel().getKeyBlock().getScacrseSubjCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", this.getFormModel().getKeyBlock().getScacrseCrseNumb()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_STVTERM_CODE", this.getFormModel().getKeyBlock().getStvtermCode()));             


           
				getFormModel().getRtstCtrl().setScrrtstTermCodeFrom(scbcrseElement.getScbcrseEffTerm());
				try
				{
					String sql1 = "SELECT MIN(SCRRTST_TERM_CODE_EFF) " +
	" FROM SCRRTST " +
	" WHERE SCRRTST_TERM_CODE_EFF > :SCRRTST_TERM_CODE_FROM AND SCRRTST_CRSE_NUMB = :KEY_BLOCK_SCACRSE_CRSE_NUMB AND SCRRTST_SUBJ_CODE = :KEY_BLOCK_SCACRSE_SUBJ_CODE ";
					DataCommand command1 = new DataCommand(sql1);
					//Setting query parameters
					command1.addParameter("SCRRTST_TERM_CODE_FROM", getFormModel().getRtstCtrl().getScrrtstTermCodeFrom());
					command1.addParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", getFormModel().getKeyBlock().getScacrseCrseNumb());
					command1.addParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", getFormModel().getKeyBlock().getScacrseSubjCode());
					ResultSet results1 = command1.executeQuery();
					rowCount = command1.getRowCount();
					if ( results1.hasData() ) {
						getFormModel().getRtstCtrl().setScrrtstTermCodeTo(results1.getStr(0));
					}
					if ( getFormModel().getRtstCtrl().getScrrtstTermCodeTo().isNull() )
					{
						throw new NoDataFoundException();
					}
				}
				catch(NoDataFoundException e)
				{
					String sql2 = "SELECT SCBCRKY_TERM_CODE_END " +
	" FROM SCBCRKY " +
	" WHERE SCBCRKY_CRSE_NUMB = :KEY_BLOCK_SCACRSE_CRSE_NUMB AND SCBCRKY_SUBJ_CODE = :KEY_BLOCK_SCACRSE_SUBJ_CODE ";
					DataCommand command2 = new DataCommand(sql2);
					//Setting query parameters
					command2.addParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", getFormModel().getKeyBlock().getScacrseCrseNumb());
					command2.addParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", getFormModel().getKeyBlock().getScacrseSubjCode());
					ResultSet results2 = command2.executeQuery();
					rowCount = command2.getRowCount();
					if ( results2.hasData() ) {
						getFormModel().getRtstCtrl().setScrrtstTermCodeTo(results2.getStr(0));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SCRRTST.POST-QUERY
		 :SCRRTST_TERM_CODE_FROM := :SCRRTST_TERM_CODE_EFF;

   
   
         

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void scrrtst_AfterQuery(RowAdapterEvent args)
		{
			
				ScrrtstAdapter scrrtstElement = (ScrrtstAdapter)args.getRow();


				getFormModel().getRtstCtrl().setScrrtstTermCodeFrom(scrrtstElement.getScrrtstTermCodeEff());
			}

		
		/* Original PL/SQL code code for TRIGGER SCRRTST_CONNECTOR.POST-CHANGE
		 
   IF G$_NCHK(:SCRRTST_CONNECTOR NOT IN ('A', 'O')) THEN
      MESSAGE (  G$_NLS.Get('SCAPREQ-0136', 'FORM','*ERROR* AND/OR Connector must be A or O')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_CONNECTOR.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="SCRRTST_CONNECTOR")
		public void scrrtstConnector_PostChange()
		{
			

				
				ScrrtstAdapter scrrtstElement = (ScrrtstAdapter)this.getFormModel().getScrrtst().getRowAdapter(true);


				if ( getTask().getGoqrpls().gNchk(notIn(scrrtstElement.getScrrtstConnector(), "A", "O").getValue()).getValue() )
				{
					errorMessage(GNls.Fget(toStr("SCAPREQ-0136"), toStr("FORM"), toStr("*ERROR* AND/OR Connector must be A or O")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SCRRTST_CONNECTOR.KEY-PREV-ITEM
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_CONNECTOR.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="SCRRTST_CONNECTOR", function=KeyFunction.PREVIOUS_ITEM, fireInSearch=false)
		public void scrrtstConnector_PreviousItem()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_TESC_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SCRRTST_TESC_CODE")
		public void scrrtstTescCode_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_TESC_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SCRRTST_TESC_CODE", function=KeyFunction.ITEM_CHANGE)
		public void scrrtstTescCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_TESC_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SCRRTST_TESC_CODE")
		public void scrrtstTescCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_TESC_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SCRRTST_TESC_CODE")
		public void scrrtstTescCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_TESC_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SCRRTST_TESC_CODE", function=KeyFunction.NEXT_ITEM)
		public void scrrtstTescCode_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_TESC_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SCRRTST_TESC_CODE", function=KeyFunction.ITEM_OUT)
		public void scrrtstTescCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_SUBJ_CODE_PREQ.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SCRRTST_SUBJ_CODE_PREQ")
		public void scrrtstSubjCodePreq_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_SUBJ_CODE_PREQ.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SCRRTST_SUBJ_CODE_PREQ", function=KeyFunction.ITEM_CHANGE)
		public void scrrtstSubjCodePreq_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_SUBJ_CODE_PREQ.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SCRRTST_SUBJ_CODE_PREQ")
		public void scrrtstSubjCodePreq_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_SUBJ_CODE_PREQ.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SCRRTST_SUBJ_CODE_PREQ")
		public void scrrtstSubjCodePreq_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_SUBJ_CODE_PREQ.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SCRRTST_SUBJ_CODE_PREQ", function=KeyFunction.NEXT_ITEM)
		public void scrrtstSubjCodePreq_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_SUBJ_CODE_PREQ.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SCRRTST_SUBJ_CODE_PREQ", function=KeyFunction.ITEM_OUT)
		public void scrrtstSubjCodePreq_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER SCRRTST_SUBJ_CODE_PREQ.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   STVSUBJ
         WHERE  STVSUBJ_CODE = :SCRRTST_SUBJ_CODE_PREQ ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
 G$_NLS.Get('ZCADETQ-0143', 'FORM','*ERROR* Invalid code; Press LIST for valid codes') , TRUE);
   END ;
--
   << PTI_END_TRIGGER >>
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
		 * SCRRTST_SUBJ_CODE_PREQ.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="SCRRTST_SUBJ_CODE_PREQ")
		public void scrrtstSubjCodePreq_PostChange()
		{
			

				
				ScrrtstAdapter scrrtstElement = (ScrrtstAdapter)this.getFormModel().getScrrtst().getRowAdapter(true);


				int rowCount = 0;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if (!(getGlobal("QUERY_MODE").equals("1")))
					{
						NString ptiIntoTemp = NString.getNull();
						String sqlptiCursor = "SELECT 'X' " +
	" FROM STVSUBJ " +
	" WHERE STVSUBJ_CODE = :SCRRTST_SUBJ_CODE_PREQ ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("SCRRTST_SUBJ_CODE_PREQ", scrrtstElement.getScrrtstSubjCodePreq());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								ptiIntoTemp = ptiCursorResults.getStr(0);
							}
							getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(), GNls.Fget(toStr("ZCADETQ-0143"), toStr("FORM"), toStr("*ERROR* Invalid code; Press LIST for valid codes")), toBool(NBool.True));
						}
						finally{
							ptiCursor.close();
						}
					}
					 PTI_END_TRIGGER:;
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SCRRTST_LEVL_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   SHRGRDE
         WHERE  SHRGRDE_LEVL_CODE = :SCRRTST_LEVL_CODE
           AND  SHRGRDE_TERM_CODE_EFFECTIVE =  (
               SELECT MAX(SHRGRDE_TERM_CODE_EFFECTIVE)
               FROM   SHRGRDE
               WHERE  SHRGRDE_LEVL_CODE = :SCRRTST_LEVL_CODE
                 AND  SHRGRDE_TERM_CODE_EFFECTIVE <=
                    :SCBCRSE_EFF_TERM )  ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,  G$_NLS.Get('SCAPREQ-0151', 'FORM','*ERROR* Invalid Level code for the term, Press LIST for codes.')  
          
         , TRUE);
   END ;
--
   << PTI_END_TRIGGER >>
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
		 * SCRRTST_LEVL_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="SCRRTST_LEVL_CODE")
		public void scrrtstLevlCode_PostChange()
		{
			

				
				ScrrtstAdapter scrrtstElement = (ScrrtstAdapter)this.getFormModel().getScrrtst().getRowAdapter(true);
				ScbcrseAdapter scbcrseElement = (ScbcrseAdapter)this.getFormModel().getScbcrse().getRowAdapter(true);


				int rowCount = 0;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if (!(getGlobal("QUERY_MODE").equals("1")))
					{
						NString ptiIntoTemp = NString.getNull();
						String sqlptiCursor = "SELECT 'X' " +
	" FROM SHRGRDE " +
	" WHERE SHRGRDE_LEVL_CODE = :SCRRTST_LEVL_CODE AND SHRGRDE_TERM_CODE_EFFECTIVE = (SELECT MAX(SHRGRDE_TERM_CODE_EFFECTIVE) " +
		" FROM SHRGRDE " +
		" WHERE SHRGRDE_LEVL_CODE = :SCRRTST_LEVL_CODE AND SHRGRDE_TERM_CODE_EFFECTIVE <= :SCBCRSE_EFF_TERM ) ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("SCRRTST_LEVL_CODE", scrrtstElement.getScrrtstLevlCode());
							ptiCursor.addParameter("SCBCRSE_EFF_TERM", scbcrseElement.getScbcrseEffTerm());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								ptiIntoTemp = ptiCursorResults.getStr(0);
							}
							getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(), GNls.Fget(toStr("SCAPREQ-0151"), toStr("FORM"), toStr("*ERROR* Invalid Level code for the term, Press LIST for codes.")), toBool(NBool.True));
						}
						finally{
							ptiCursor.close();
						}
					}
					
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SCRRTST_LEVL_CODE.KEY-LISTVAL
		    EXECUTE_TRIGGER( 'CALL_SHQGRDE' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_LEVL_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SCRRTST_LEVL_CODE", function=KeyFunction.LIST_VALUES, fireInSearch=false)
		public void scrrtstLevlCode_ListValues()
		{
			
				executeAction("CALL_SHQGRDE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SCRRTST_CONCURRENCY_IND.KEY-LISTVAL
		 	EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
  G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCRRTST_CONCURRENCY_IND.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SCRRTST_CONCURRENCY_IND", function=KeyFunction.LIST_VALUES)
		public void scrrtstConcurrencyInd_ListValues()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SCRRTST_CONCURRENCY_IND.WHEN-LIST-CHANGED
		 
BEGIN
--
   IF (:scrrtst_concurrency_ind is null) then
      GOTO pti_end_trigger;
   END IF;
--
   G$_CHECK_VALUE ((:SCRRTST_SUBJ_CODE_PREQ IS NULL),
      G$_NLS.Get('SCAPREQ-0153', 'FORM','*ERROR* Prerequisite subject and course should be entered first.') ,
     TRUE,TRUE);
--
   G$_CHECK_VALUE ((:SCRRTST_CONCURRENCY_IND NOT IN ('Y','N')),
  G$_NLS.Get('SCAPREQ-0154', 'FORM','*ERROR* Concurrent indicator must be ''Y'' or ''N''.') ,
    TRUE,TRUE);
--
   << PTI_END_TRIGGER >>
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
		 * SCRRTST_CONCURRENCY_IND.WHEN-LIST-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-LIST-CHANGED", item="SCRRTST_CONCURRENCY_IND", fireInSearch=false)
		public void scrrtstConcurrencyInd_listChange()
		{
			

				
				ScrrtstAdapter scrrtstElement = (ScrrtstAdapter)this.getFormModel().getScrrtst().getRowAdapter(true);


				try
				{
					 
					if (!(scrrtstElement.getScrrtstConcurrencyInd().isNull()))
					{
						getTask().getGoqrpls().gCheckValue(((scrrtstElement.getScrrtstSubjCodePreq().isNull())), GNls.Fget(toStr("SCAPREQ-0153"), toStr("FORM"), toStr("*ERROR* Prerequisite subject and course should be entered first.")), toBool(NBool.True), toBool(NBool.True));
						 
						getTask().getGoqrpls().gCheckValue(((notIn(scrrtstElement.getScrrtstConcurrencyInd(), "Y", "N").getValue())), GNls.Fget(toStr("SCAPREQ-0154"), toStr("FORM"), toStr("*ERROR* Concurrent indicator must be 'Y' or 'N'.")), toBool(NBool.True), toBool(NBool.True));
						 
					}
					
					
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
	
	
}
