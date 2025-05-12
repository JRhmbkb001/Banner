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

import net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
		
public class KeyBlockController extends DefaultBlockController {

	private GKeyBlockClass getGKeyBlockClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_KEY_BLOCK_CLASS");
	}	
	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public KeyBlockController(IFormController parentController, String name) 
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
		 * KEY_BLOCK.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void keyBlock_blockOut()
		{
			
			getGKeyBlockClass().blockOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE, fireInSearch=false)
		public void keyBlock_Save()
		{
			
			getGKeyBlockClass().save();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-UP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UP", function=KeyFunction.UP)
		public void keyBlock_MoveUp()
		{
			
			getGKeyBlockClass().moveUp();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.DOWN)
		public void keyBlock_MoveDown()
		{
			
			getGKeyBlockClass().moveDown();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD, fireInSearch=false)
		public void keyBlock_CreateRecord()
		{
			
			getGKeyBlockClass().createRecord();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD, fireInSearch=false)
		public void keyBlock_DeleteRecord()
		{
			
			getGKeyBlockClass().deleteRecord();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH, fireInSearch=false)
		public void keyBlock_Search()
		{
			
			getGKeyBlockClass().search();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY, fireInSearch=false)
		public void keyBlock_ExecuteQuery()
		{
			
			getGKeyBlockClass().executeQuery();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD, fireInSearch=false)
		public void keyBlock_NextRecord()
		{
			
			getGKeyBlockClass().nextRecord();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET", fireInSearch=false)
		public void keyBlock_KeyNxtset()
		{
			
			getGKeyBlockClass().keyNxtset();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK, fireInSearch=false)
		public void keyBlock_NextBlock()
		{
			
			getGKeyBlockClass().nextBlock();
		}

		
		/*
		 *<p>
		 *This trigger checks if a valid PIDM exists.  If it does, perform previous
		 *block and execute query.  If not, display error message.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK, fireInSearch=false)
		public void keyBlock_PreviousBlock()
		{
			
			getGKeyBlockClass().previousBlock();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD, fireInSearch=false)
		public void keyBlock_PreviousRecord()
		{
			
			getGKeyBlockClass().previousRecord();
		}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.CHECK_KEYS
		 IF SELECT_SCBCRSE_3 THEN
   MESSAGE('*ERROR* VALID SUBJECT, COURSE AND TERM MUST BE ENTERED.' ) ;
   RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.CHECK_KEYS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_KEYS", fireInSearch=false)
		public void keyBlock_CheckKeys()
		{
			
				if ( this.getTask().getServices().selectScbcrse3().getValue() )
				{
					errorMessage("*ERROR* VALID SUBJECT, COURSE AND TERM MUST BE ENTERED.");
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCACRSE_SUBJ_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SCACRSE_SUBJ_CODE")
		public void scacrseSubjCode_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCACRSE_SUBJ_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SCACRSE_SUBJ_CODE", function=KeyFunction.ITEM_CHANGE)
		public void scacrseSubjCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCACRSE_SUBJ_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SCACRSE_SUBJ_CODE")
		public void scacrseSubjCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCACRSE_SUBJ_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SCACRSE_SUBJ_CODE")
		public void scacrseSubjCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCACRSE_SUBJ_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SCACRSE_SUBJ_CODE", function=KeyFunction.NEXT_ITEM)
		public void scacrseSubjCode_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCACRSE_SUBJ_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SCACRSE_SUBJ_CODE", function=KeyFunction.ITEM_OUT)
		public void scacrseSubjCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER SCACRSE_SUBJ_CODE.POST-CHANGE
		    DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      RTN_VAL              BOOLEAN;
      CURSOR PTI_CURSOR IS
         SELECT STVSUBJ_DESC
         FROM   STVSUBJ
         WHERE  STVSUBJ_CODE = :SCACRSE_SUBJ_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :SUBJ_DESC ;
      RTN_VAL := PTI_CURSOR%NOTFOUND;         
      CLOSE PTI_CURSOR ;                     
      G$_CHECK_VALUE (RTN_VAL ,
'*ERROR* INVALID CODE, PRESS LIST FOR VALID CODES.', TRUE);
   END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCACRSE_SUBJ_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="SCACRSE_SUBJ_CODE")
		public void scacrseSubjCode_PostChange()
		{
			
				int rowCount = 0;
				{
					NString ptiIntoTemp = NString.getNull();
					NBool rtnVal = NBool.getNull();
					String sqlptiCursor = "SELECT STVSUBJ_DESC " +
	" FROM STVSUBJ " +
	" WHERE STVSUBJ_CODE = :SCACRSE_SUBJ_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("SCACRSE_SUBJ_CODE", getFormModel().getKeyBlock().getScacrseSubjCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getKeyBlock().setSubjDesc(ptiCursorResults.getStr(0));
						}
						rtnVal = toBool(ptiCursor.notFound());
						getTask().getGoqrpls().gCheckValue(rtnVal, toStr("*ERROR* INVALID CODE, PRESS LIST FOR VALID CODES."), toBool(NBool.True));
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
		 * SUBJ_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SUBJ_DESC", function=KeyFunction.ITEM_CHANGE)
		public void subjDesc_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCACRSE_CRSE_NUMB.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SCACRSE_CRSE_NUMB")
		public void scacrseCrseNumb_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCACRSE_CRSE_NUMB.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SCACRSE_CRSE_NUMB", function=KeyFunction.ITEM_CHANGE)
		public void scacrseCrseNumb_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/* Original PL/SQL code code for TRIGGER SCACRSE_CRSE_NUMB.G$_SEARCH_PARAMETERS
		 BEGIN
  G$_SEARCH.PARAMETERS('scbcrky_crse_numb',
  										 'scbcrky_subj_code',
  										 'where scbcrky_subj_code = :scacrse_subj_code');
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCACRSE_CRSE_NUMB.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SCACRSE_CRSE_NUMB")
		public void scacrseCrseNumb_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("scbcrky_crse_numb"), toStr("scbcrky_subj_code"), toStr("where scbcrky_subj_code = :scacrse_subj_code"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCACRSE_CRSE_NUMB.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SCACRSE_CRSE_NUMB")
		public void scacrseCrseNumb_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCACRSE_CRSE_NUMB.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SCACRSE_CRSE_NUMB", function=KeyFunction.NEXT_ITEM)
		public void scacrseCrseNumb_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCACRSE_CRSE_NUMB.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SCACRSE_CRSE_NUMB", function=KeyFunction.ITEM_OUT)
		public void scacrseCrseNumb_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER SCACRSE_CRSE_NUMB.KEY-CQUERY
		 
EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');

<multilinecomment> 08/19/97 TP - commented this out. use SCQSUBJ_LOV.
:GLOBAL.SUBJ_CODE := :SCACRSE_SUBJ_CODE ;
CALL_FORM('SOISUBJ',NO_HIDE,DO_REPLACE,QUERY_ONLY);
IF :GLOBAL.SCBCRKY_CRSE_NUMB IS NULL THEN
   RETURN;
END IF;

:SCACRSE_CRSE_NUMB := :GLOBAL.SCBCRKY_CRSE_NUMB;
:SCACRSE_SUBJ_CODE := :GLOBAL.SCBCRKY_SUBJ_CODE;
NEXT_FIELD;
G$_CHECK_FAILURE;
</multilinecomment>
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SCACRSE_CRSE_NUMB.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="SCACRSE_CRSE_NUMB", function=KeyFunction.COUNT_QUERY, fireInSearch=false)
		public void scacrseCrseNumb_TotalResults()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="STVTERM_CODE")
		public void stvtermCode_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVTERM_CODE", function=KeyFunction.ITEM_CHANGE)
		public void stvtermCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/* Original PL/SQL code code for TRIGGER STVTERM_CODE.G$_SEARCH_PARAMETERS
		 BEGIN
  G$_SEARCH.PARAMETERS('STVTERM_CODE','STVTERM_DESC','');
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="STVTERM_CODE")
		public void stvtermCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("STVTERM_CODE"), toStr("STVTERM_DESC"), toStr(""));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="STVTERM_CODE")
		public void stvtermCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="STVTERM_CODE", function=KeyFunction.NEXT_ITEM)
		public void stvtermCode_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="STVTERM_CODE", function=KeyFunction.ITEM_OUT)
		public void stvtermCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER STVTERM_CODE.POST-CHANGE
		    DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      RTN_VAL              BOOLEAN;           
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   STVTERM
         WHERE  STVTERM_CODE = :KEY_BLOCK.STVTERM_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RTN_VAL := PTI_CURSOR%NOTFOUND;         
      CLOSE PTI_CURSOR ;                     
      G$_CHECK_VALUE (RTN_VAL ,
'*ERROR* INVALID CODE, PRESS LIST FOR VALID CODES.', TRUE);
   END ;
--
   IF SELECT_SCBCRKY_2 THEN
      RETURN ;
   END IF ;
--
   << NXTSTEP >>
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      RTN_VAL              BOOLEAN;
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   SCBCRKY
         WHERE  SCBCRKY_SUBJ_CODE = :SCACRSE_SUBJ_CODE
           AND  SCBCRKY_CRSE_NUMB = :SCACRSE_CRSE_NUMB
           AND  SCBCRKY_TERM_CODE_START <=
              :KEY_BLOCK.STVTERM_CODE
           AND  SCBCRKY_TERM_CODE_END >=
              :KEY_BLOCK.STVTERM_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RTN_VAL := PTI_CURSOR%NOTFOUND;         
      CLOSE PTI_CURSOR ;                     
      G$_CHECK_VALUE (RTN_VAL , '*ERROR* INVALID TERM' ||
         ' FOR COURSE, PRESS LIST FOR VALID' ||
         ' CODES.', TRUE);
   END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="STVTERM_CODE")
		public void stvtermCode_PostChange()
		{
			
				int rowCount = 0;
				{
					NString ptiIntoTemp = NString.getNull();
					NBool rtnVal = NBool.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM STVTERM " +
	" WHERE STVTERM_CODE = :KEY_BLOCK_STVTERM_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KEY_BLOCK_STVTERM_CODE", getFormModel().getKeyBlock().getStvtermCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						rtnVal = toBool(ptiCursor.notFound());
						getTask().getGoqrpls().gCheckValue(rtnVal, toStr("*ERROR* INVALID CODE, PRESS LIST FOR VALID CODES."), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if ( this.getTask().getServices().selectScbcrky2().getValue() )
				{
					return ;
				}
				 NXTSTEP:;
				{
					NString ptiIntoTemp = NString.getNull();
					NBool rtnVal = NBool.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM SCBCRKY " +
	" WHERE SCBCRKY_SUBJ_CODE = :SCACRSE_SUBJ_CODE AND SCBCRKY_CRSE_NUMB = :SCACRSE_CRSE_NUMB AND SCBCRKY_TERM_CODE_START <= :KEY_BLOCK_STVTERM_CODE AND SCBCRKY_TERM_CODE_END >= :KEY_BLOCK_STVTERM_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("SCACRSE_SUBJ_CODE", getFormModel().getKeyBlock().getScacrseSubjCode());
						ptiCursor.addParameter("SCACRSE_CRSE_NUMB", getFormModel().getKeyBlock().getScacrseCrseNumb());
						ptiCursor.addParameter("KEY_BLOCK_STVTERM_CODE", getFormModel().getKeyBlock().getStvtermCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						rtnVal = toBool(ptiCursor.notFound());
						getTask().getGoqrpls().gCheckValue(rtnVal, toStr("*ERROR* INVALID TERM").append(" FOR COURSE, PRESS LIST FOR VALID").append(" CODES."), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER STVTERM_CODE.WHEN-VALIDATE-ITEM
		    DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      RTN_VAL              BOOLEAN;           
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   STVTERM
         WHERE  STVTERM_CODE = :KEY_BLOCK.STVTERM_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RTN_VAL := PTI_CURSOR%NOTFOUND;         
      CLOSE PTI_CURSOR ;                     
      G$_CHECK_VALUE (RTN_VAL ,
'*ERROR* INVALID CODE, PRESS LIST FOR VALID CODES.', TRUE);
   END ;
--
   IF SELECT_SCBCRKY_2 THEN
      RETURN ;
   END IF ;
--
   << NXTSTEP >>
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      RTN_VAL              BOOLEAN;
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   SCBCRKY
         WHERE  SCBCRKY_SUBJ_CODE = :SCACRSE_SUBJ_CODE
           AND  SCBCRKY_CRSE_NUMB = :SCACRSE_CRSE_NUMB
           AND  SCBCRKY_TERM_CODE_START <=
              :KEY_BLOCK.STVTERM_CODE
           AND  SCBCRKY_TERM_CODE_END >=
              :KEY_BLOCK.STVTERM_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RTN_VAL := PTI_CURSOR%NOTFOUND;         
      CLOSE PTI_CURSOR ;                     
      G$_CHECK_VALUE (RTN_VAL , '*ERROR* INVALID TERM' ||
         ' FOR COURSE, PRESS LIST FOR VALID' ||
         ' CODES.', TRUE);
   END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVTERM_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="STVTERM_CODE")
		public void stvtermCode_validate()
		{
			
				int rowCount = 0;
				{
					NString ptiIntoTemp = NString.getNull();
					NBool rtnVal = NBool.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM STVTERM " +
	" WHERE STVTERM_CODE = :KEY_BLOCK_STVTERM_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KEY_BLOCK_STVTERM_CODE", getFormModel().getKeyBlock().getStvtermCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						rtnVal = toBool(ptiCursor.notFound());
						getTask().getGoqrpls().gCheckValue(rtnVal, toStr("*ERROR* INVALID CODE, PRESS LIST FOR VALID CODES."), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if ( this.getTask().getServices().selectScbcrky2().getValue() )
				{
					return ;
				}
				 NXTSTEP:;
				{
					NString ptiIntoTemp = NString.getNull();
					NBool rtnVal = NBool.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM SCBCRKY " +
	" WHERE SCBCRKY_SUBJ_CODE = :SCACRSE_SUBJ_CODE AND SCBCRKY_CRSE_NUMB = :SCACRSE_CRSE_NUMB AND SCBCRKY_TERM_CODE_START <= :KEY_BLOCK_STVTERM_CODE AND SCBCRKY_TERM_CODE_END >= :KEY_BLOCK_STVTERM_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("SCACRSE_SUBJ_CODE", getFormModel().getKeyBlock().getScacrseSubjCode());
						ptiCursor.addParameter("SCACRSE_CRSE_NUMB", getFormModel().getKeyBlock().getScacrseCrseNumb());
						ptiCursor.addParameter("KEY_BLOCK_STVTERM_CODE", getFormModel().getKeyBlock().getStvtermCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						rtnVal = toBool(ptiCursor.notFound());
						getTask().getGoqrpls().gCheckValue(rtnVal, toStr("*ERROR* INVALID TERM").append(" FOR COURSE, PRESS LIST FOR VALID").append(" CODES."), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
	
	
}
