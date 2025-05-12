package net.hedtech.ucdavis.ps.banner.student.Zcacrse.controller;
 
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
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.ucdavis.ps.banner.student.Zcacrse.model.*;
import net.hedtech.ucdavis.ps.banner.student.Zcacrse.*;
import net.hedtech.ucdavis.ps.banner.student.Zcacrse.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GOptBlock;
		
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
	public ZcacrseTask getTask() {
		return (ZcacrseTask)super.getTask();
	}

	public ZcacrseModel getFormModel() {
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

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.FIND_COURSE_TITLE
		 if :KB_subj_code is null then 
	 :crse_title := '' ;
	  goto all_done ;
end if ;

if :KB_crse_numb is null then
	  :crse_title := '' ;
	  goto all_done ;
end if ;

if :KB_term_code_eff is null then
	  :crse_title := '' ;
	  goto all_done ;
end if ;

begin
	declare cursor title_cursor is
		select scbcrse_title
		from scbcrse
		where scbcrse_subj_code = :KB_subj_code
		and   scbcrse_crse_numb = :KB_crse_numb
		and   scbcrse_eff_term =
		   (select max(a.scbcrse_eff_term)
		    from  scbcrse a
		    where a.scbcrse_subj_code = :KB_subj_code
		    and   a.scbcrse_crse_numb  = :KB_crse_numb
		    and   a.scbcrse_eff_term <= :KB_term_code_eff);
	begin
		open title_cursor ;
		fetch title_cursor into :crse_title ;
		if  title_cursor%notfound then
			  :crse_title := '' ;
		end if ;
		close title_cursor ;
	end ;
 end ;
<< all_done >> 
   null ;
	  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.FIND_COURSE_TITLE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="FIND_COURSE_TITLE")
		public void keyBlock_FindCourseTitle()
		{
			
				int rowCount = 0;
				if ( getFormModel().getKeyBlock().getKbSubjCode().isNull() )
				{
					getFormModel().getKeyBlock().setCrseTitle(toStr(""));
					return;
				}
				if ( getFormModel().getKeyBlock().getKbCrseNumb().isNull() )
				{
					getFormModel().getKeyBlock().setCrseTitle(toStr(""));
					return;
				}
				if ( getFormModel().getKeyBlock().getKbTermCodeEff().isNull() )
				{
					getFormModel().getKeyBlock().setCrseTitle(toStr(""));
					return;
				}
				{
					String sqltitleCursor = "SELECT scbcrse_title " +
	" FROM scbcrse " +
	" WHERE scbcrse_subj_code = :KB_SUBJ_CODE AND scbcrse_crse_numb = :KB_CRSE_NUMB AND scbcrse_eff_term = (SELECT max(a.scbcrse_eff_term) " +
		" FROM scbcrse a " +
		" WHERE a.scbcrse_subj_code = :KB_SUBJ_CODE AND a.scbcrse_crse_numb = :KB_CRSE_NUMB AND a.scbcrse_eff_term <= :KB_TERM_CODE_EFF ) ";
					DataCursor titleCursor = new DataCursor(sqltitleCursor);
					try {
						//Setting query parameters
						titleCursor.addParameter("KB_SUBJ_CODE", getFormModel().getKeyBlock().getKbSubjCode());
						titleCursor.addParameter("KB_CRSE_NUMB", getFormModel().getKeyBlock().getKbCrseNumb());
						titleCursor.addParameter("KB_TERM_CODE_EFF", getFormModel().getKeyBlock().getKbTermCodeEff());
						//F2J_WARNING_DONE : Make sure that the method "Close" is being called over the variable titleCursor.
						titleCursor.open();
						ResultSet titleCursorResults = titleCursor.fetchInto();
						if ( titleCursorResults != null ) {
							getFormModel().getKeyBlock().setCrseTitle(titleCursorResults.getStr(0));
						}
						if ( titleCursor.notFound() )
						{
							getFormModel().getKeyBlock().setCrseTitle(toStr(""));
						}
						titleCursor.close();
					}
					finally{
						titleCursor.close();
					}
				}
				 ALL_DONE:;
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-CQUERY
		  :GLOBAL.SCBCRKY_SUBJ_CODE := '' ;
 :GLOBAL.SCBCRKY_CRSE_NUMB := '' ;
 :SUBJ_CODE := '' ;
   IF :SYSTEM.CURRENT_FIELD = 'KB_SUBJ_CODE'
    THEN GOTO NXTSTEP;
   END IF;
   IF :KB_SUBJ_CODE IS NULL
     THEN GOTO NXTSTEP ;
   END IF;
   DISPLAY_LOV2('KB_CRSE_NUMB','SCQSUBJC_LOV') ;
   GOTO TESTSUBJ;
--
   << NXTSTEP >>
   DISPLAY_LOV2('','SCQSUBJ_LOV') ;
--
   << TESTSUBJ >>
   IF (:GLOBAL.SCBCRKY_SUBJ_CODE IS NULL) THEN
      RETURN ;
   ELSE
      GOTO CONT ;
   END IF ;
--
   << CONT >>
   :KB_SUBJ_CODE := :GLOBAL.SCBCRKY_SUBJ_CODE ;
--
   :KB_CRSE_NUMB := :GLOBAL.SCBCRKY_CRSE_NUMB ;
   
   :KB_term_code_eff := :global.key_term ;
--
   GO_FIELD( 'KB_SUBJ_CODE' ) ;
   GO_FIELD( 'KB_CRSE_NUMB' ) ;
   GO_FIELD( 'KB_TERM_CODE_EFF' ) ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void keyBlock_TotalResults()
		{
			
				setGlobal("SCBCRKY_SUBJ_CODE", toStr(""));
				setGlobal("SCBCRKY_CRSE_NUMB", toStr(""));
				getFormModel().getKeyBlock().setSubjCode(toStr(""));
				if ( !(getCurrentField().equals("KB_SUBJ_CODE")) && !(getFormModel().getKeyBlock().getKbSubjCode().isNull()) )
				{
					this.getTask().getServices().displayLov2(toStr("KB_CRSE_NUMB"), toStr("SCQSUBJC_LOV"));
				}else{
					this.getTask().getServices().displayLov2(toStr(""), toStr("SCQSUBJ_LOV"));
				}
				
				if ((getGlobal("SCBCRKY_SUBJ_CODE").isNull()))
				{
					return ;
				}
				
				getFormModel().getKeyBlock().setKbSubjCode(getGlobal("SCBCRKY_SUBJ_CODE"));
				// 
				getFormModel().getKeyBlock().setKbCrseNumb(getGlobal("SCBCRKY_CRSE_NUMB"));
				getFormModel().getKeyBlock().setKbTermCodeEff(getGlobal("KEY_TERM"));
				// 
				goField(toStr("KB_SUBJ_CODE"));
				goField(toStr("KB_CRSE_NUMB"));
				goField(toStr("KB_TERM_CODE_EFF"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_SUBJ_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="KB_SUBJ_CODE")
		public void kbSubjCode_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_SUBJ_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="KB_SUBJ_CODE", function=KeyFunction.ITEM_CHANGE)
		public void kbSubjCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_SUBJ_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="KB_SUBJ_CODE")
		public void kbSubjCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/* Original PL/SQL code code for TRIGGER KB_SUBJ_CODE.G$_SEARCH_OPTIONS
		 SET_WINDOW_PROPERTY('G$_OPT_WINDOW',POSITION,25*6,3*17);
G$_KEY_OPT_MENU('KEY_BLOCK.KB_SUBJ_CODE', 
                 G$_NLS.Get('ZCACRSE-0074', 'FORM','Valid Subject Codes') , 'LIST_VALUES',
                 G$_NLS.Get('ZCACRSE-0076', 'FORM','View Existing Courses') , 'COUNT_QUERY',
                 '','','','');
G$_CHECK_FAILURE;
:CHECK_KEYS := 'N';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_SUBJ_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="KB_SUBJ_CODE")
		public void kbSubjCode_GSearchOptions()
		{
			
				// F2J_NOT_SUPPORTED : The property "WINDOW's POSITION" is not supported. See documentation for details.
				//				SupportClasses.FORMS4W.SetWindowProperty("G$_OPT_WINDOW", SupportClasses.Property.POSITION, 25.multiply(6), 3.multiply(17));
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's POSITION' is not supported. See documentation for details.");
				
				getTask().getGoqrpls().gKeyOptMenu(toStr("KEY_BLOCK.KB_SUBJ_CODE"), GNls.Fget(toStr("ZCACRSE-0074"), toStr("FORM"), toStr("Valid Subject Codes")), toStr("LIST_VALUES"), GNls.Fget(toStr("ZCACRSE-0076"), toStr("FORM"), toStr("View Existing Courses")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
				getTask().getGoqrpls().gCheckFailure();
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_SUBJ_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="KB_SUBJ_CODE", function=KeyFunction.NEXT_ITEM)
		public void kbSubjCode_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_SUBJ_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="KB_SUBJ_CODE", function=KeyFunction.ITEM_OUT)
		public void kbSubjCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER KB_SUBJ_CODE.POST-CHANGE
		    DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVSUBJ_DESC
         FROM   STVSUBJ
         WHERE  STVSUBJ_CODE = :KB_SUBJ_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :SUBJ_DESCRIPTION ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
 G$_NLS.Get('ZCACRSE-0072', 'FORM','*ERROR* Invalid code, press LIST for valid codes.') , TRUE);
   END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_SUBJ_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="KB_SUBJ_CODE")
		public void kbSubjCode_PostChange()
		{
			
				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT STVSUBJ_DESC " +
	" FROM STVSUBJ " +
	" WHERE STVSUBJ_CODE = :KB_SUBJ_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KB_SUBJ_CODE", getFormModel().getKeyBlock().getKbSubjCode());
						//F2J_WARNING_DONE : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getKeyBlock().setSubjDescription(ptiCursorResults.getStr(0));
						}
						getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(), GNls.Fget(toStr("ZCACRSE-0072"), toStr("FORM"), toStr("*ERROR* Invalid code, press LIST for valid codes.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER KB_SUBJ_CODE.WHEN-VALIDATE-ITEM
		 execute_trigger('FIND_COURSE_TITLE');
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_SUBJ_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="KB_SUBJ_CODE")
		public void kbSubjCode_validate()
		{
			
				executeAction("FIND_COURSE_TITLE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SUBJ_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SUBJ_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void subjDescription_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CRSE_TITLE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="CRSE_TITLE", function=KeyFunction.ITEM_CHANGE)
		public void crseTitle_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
		/* Original PL/SQL code code for TRIGGER KB_CRSE_NUMB.KEY-LISTVAL
		 GO_ITEM('KB_CRSE_NUMB');
DO_KEY ('COUNT_QUERY');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_CRSE_NUMB.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="KB_CRSE_NUMB", function=KeyFunction.LIST_VALUES)
		public void kbCrseNumb_ListValues()
		{
			
				goItem(toStr("KB_CRSE_NUMB"));
				executeAction(KeyFunction.COUNT_QUERY);
			}

		
		/* Original PL/SQL code code for TRIGGER KB_CRSE_NUMB.WHEN-VALIDATE-ITEM
		 execute_trigger('FIND_COURSE_TITLE');
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_CRSE_NUMB.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="KB_CRSE_NUMB")
		public void kbCrseNumb_validate()
		{
			
				executeAction("FIND_COURSE_TITLE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_TERM_CODE_EFF.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="KB_TERM_CODE_EFF")
		public void kbTermCodeEff_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_TERM_CODE_EFF.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="KB_TERM_CODE_EFF", function=KeyFunction.ITEM_CHANGE)
		public void kbTermCodeEff_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/* Original PL/SQL code code for TRIGGER KB_TERM_CODE_EFF.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('stvterm_code','stvterm_desc','');

 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_TERM_CODE_EFF.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="KB_TERM_CODE_EFF")
		public void kbTermCodeEff_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("stvterm_code"), toStr("stvterm_desc"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER KB_TERM_CODE_EFF.G$_SEARCH_OPTIONS
		 SET_WINDOW_PROPERTY('G$_OPT_WINDOW',POSITION,25*6,3*17);
G$_KEY_OPT_MENU('KEY_BLOCK.KB_TERM_CODE_EFF', 
                 G$_NLS.Get('ZCACRSE-0079', 'FORM','Valid Terms for Course') , 'LIST_VALUES',
                 G$_NLS.Get('ZCACRSE-0081', 'FORM','View Existing Courses') , 'COUNT_QUERY',
                 '','','','');
G$_CHECK_FAILURE;
:CHECK_KEYS := 'N';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_TERM_CODE_EFF.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="KB_TERM_CODE_EFF")
		public void kbTermCodeEff_GSearchOptions()
		{
			
				// F2J_NOT_SUPPORTED : The property "WINDOW's POSITION" is not supported. See documentation for details.
				//				SupportClasses.FORMS4W.SetWindowProperty("G$_OPT_WINDOW", SupportClasses.Property.POSITION, 25.multiply(6), 3.multiply(17));
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's POSITION' is not supported. See documentation for details.");
				
				getTask().getGoqrpls().gKeyOptMenu(toStr("KEY_BLOCK.KB_TERM_CODE_EFF"), GNls.Fget(toStr("ZCACRSE-0079"), toStr("FORM"), toStr("Valid Terms for Course")), toStr("LIST_VALUES"), GNls.Fget(toStr("ZCACRSE-0081"), toStr("FORM"), toStr("View Existing Courses")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
				getTask().getGoqrpls().gCheckFailure();
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_TERM_CODE_EFF.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="KB_TERM_CODE_EFF", function=KeyFunction.NEXT_ITEM)
		public void kbTermCodeEff_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_TERM_CODE_EFF.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="KB_TERM_CODE_EFF", function=KeyFunction.ITEM_OUT)
		public void kbTermCodeEff_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER KB_TERM_CODE_EFF.WHEN-VALIDATE-ITEM
		 execute_trigger('FIND_COURSE_TITLE');
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_TERM_CODE_EFF.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="KB_TERM_CODE_EFF")
		public void kbTermCodeEff_validate()
		{
			
				executeAction("FIND_COURSE_TITLE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER KB_TERM_CODE_EFF.POST-CHANGE
		    DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   STVTERM
         WHERE  STVTERM_CODE = :KB_TERM_CODE_EFF ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
 G$_NLS.Get('ZCACRSE-0083', 'FORM','*ERROR* Invalid code, press LIST for valid codes.') , TRUE);
   END ;
--
   IF SELECT_SCBCRKY_4 THEN
      RETURN ;
   END IF ;
--
   << NXTSTEP >>
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   SCBCRKY
         WHERE  SCBCRKY_SUBJ_CODE = :KB_SUBJ_CODE
           AND  SCBCRKY_CRSE_NUMB = :KB_CRSE_NUMB
           AND  SCBCRKY_TERM_CODE_START <=
              :KB_TERM_CODE_EFF
           AND  SCBCRKY_TERM_CODE_END >=
              :KB_TERM_CODE_EFF ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,  G$_NLS.Get('ZCACRSE-0084', 'FORM','*ERROR* Invalid term for course, press LIST for valid codes.')  
          
         , TRUE);
   END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_TERM_CODE_EFF.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="KB_TERM_CODE_EFF")
		public void kbTermCodeEff_PostChange()
		{
			
				int rowCount = 0;
				{
					NString ptiIntoTemp = NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM STVTERM " +
	" WHERE STVTERM_CODE = :KB_TERM_CODE_EFF ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KB_TERM_CODE_EFF", getFormModel().getKeyBlock().getKbTermCodeEff());
						//F2J_WARNING_DONE : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(), GNls.Fget(toStr("ZCACRSE-0083"), toStr("FORM"), toStr("*ERROR* Invalid code, press LIST for valid codes.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if ( this.getTask().getServices().selectScbcrky4().getValue() )
				{
					return ;
				}
				 NXTSTEP:;
				{
					NString ptiIntoTemp = NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM SCBCRKY " +
	" WHERE SCBCRKY_SUBJ_CODE = :KB_SUBJ_CODE AND SCBCRKY_CRSE_NUMB = :KB_CRSE_NUMB AND SCBCRKY_TERM_CODE_START <= :KB_TERM_CODE_EFF AND SCBCRKY_TERM_CODE_END >= :KB_TERM_CODE_EFF ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KB_SUBJ_CODE", getFormModel().getKeyBlock().getKbSubjCode());
						ptiCursor.addParameter("KB_CRSE_NUMB", getFormModel().getKeyBlock().getKbCrseNumb());
						ptiCursor.addParameter("KB_TERM_CODE_EFF", getFormModel().getKeyBlock().getKbTermCodeEff());
						//F2J_WARNING_DONE : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(), GNls.Fget(toStr("ZCACRSE-0084"), toStr("FORM"), toStr("*ERROR* Invalid term for course, press LIST for valid codes.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER KB_TERM_CODE_EFF.KEY-LISTVAL
		    IF SELECT_SCBCRKY_4 THEN
      GOTO NOEXIST ;
   END IF ;
--
   << L_EXISTS >>
   :GLOBAL.SUBJ_CODE := :KB_SUBJ_CODE ;
--
   :GLOBAL.CRSE_NUMB := :KB_CRSE_NUMB ;
--

G$_COPY_FLD_ATTR;
G$_DISPLAY_LOV('KB_TERM_CODE_EFF','STQTERM_LOV');
G$_RESET_GLOBAL;

   RETURN ;
--
   << NOEXIST >>
G$_COPY_FLD_ATTR;
G$_DISPLAY_LOV('KB_TERM_CODE_EFF', 'STVTERM_LOV');
G$_RESET_GLOBAL;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KB_TERM_CODE_EFF.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="KB_TERM_CODE_EFF", function=KeyFunction.LIST_VALUES)
		public void kbTermCodeEff_ListValues()
		{
			
				if ( this.getTask().getServices().selectScbcrky4().getValue() )
				{
					getTask().getGoqrpls().gCopyFldAttr();
					getTask().getGoqrpls().gDisplayLov(toStr("KB_TERM_CODE_EFF"), toStr("STVTERM_LOV"));
					getTask().getGoqrpls().gResetGlobal();
					return;
				}
				setGlobal("SUBJ_CODE", getFormModel().getKeyBlock().getKbSubjCode());
				// 
				setGlobal("CRSE_NUMB", getFormModel().getKeyBlock().getKbCrseNumb());
				// 
				getTask().getGoqrpls().gCopyFldAttr();
				getTask().getGoqrpls().gDisplayLov(toStr("KB_TERM_CODE_EFF"), toStr("STQTERM_LOV"));
				getTask().getGoqrpls().gResetGlobal();
				return ;			
			}

		
	
	
}
