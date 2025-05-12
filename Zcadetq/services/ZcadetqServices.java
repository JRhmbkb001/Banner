package net.hedtech.ucdavis.ps.banner.student.Zcadetq.services;

import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;

import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import static net.hedtech.general.common.forms.services.BaseTaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.executeQuery;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getBlockStatus;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;

import morphis.foundations.flavors.forms.appsupportlib.runtime.*;

import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;


import net.hedtech.ucdavis.ps.banner.student.Zcadetq.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.ucdavis.ps.banner.student.Zcadetq.model.*;



public class ZcadetqServices extends AbstractSupportCodeObject{
	
	
	public ZcadetqServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public ZcadetqTask  getTask() {
		return (ZcadetqTask )super.getContainer();
	}

	
	public net.hedtech.ucdavis.ps.banner.student.Zcadetq.model.ZcadetqModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit SELECT_SCBCRSE_3
	
	   FUNCTION SELECT_SCBCRSE_3
   RETURN BOOLEAN IS
      PTI_INTO_TEMP        VARCHAR2(255);
      RTN_VAL              BOOLEAN;
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   SCBCRSE
         WHERE  SCBCRSE_SUBJ_CODE = :KEY_BLOCK.SCACRSE_SUBJ_CODE
           AND  SCBCRSE_CRSE_NUMB = :KEY_BLOCK.SCACRSE_CRSE_NUMB
           AND  SCBCRSE_EFF_TERM =  (
               SELECT MAX(SCBCRSE_EFF_TERM)
               FROM   SCBCRSE
               WHERE  SCBCRSE_SUBJ_CODE =
                  :KEY_BLOCK.SCACRSE_SUBJ_CODE
                 AND  SCBCRSE_CRSE_NUMB =
                    :KEY_BLOCK.SCACRSE_CRSE_NUMB
                 AND  SCBCRSE_EFF_TERM <= :KEY_BLOCK.STVTERM_CODE )
                      ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RTN_VAL := PTI_CURSOR%NOTFOUND;         
      CLOSE PTI_CURSOR ;                     
      RETURN  (RTN_VAL) ;
   END ;
	*/
	//ID:2475
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details.
/* </p>
		*/
		public NBool selectScbcrse3()
		{
			int rowCount = 0;
			NString ptiIntoTemp = NString.getNull();
			NBool rtnVal = NBool.getNull();
			String sqlptiCursor = "SELECT 'X' " +
	" FROM SCBCRSE " +
	" WHERE SCBCRSE_SUBJ_CODE = :KEY_BLOCK_SCACRSE_SUBJ_CODE AND SCBCRSE_CRSE_NUMB = :KEY_BLOCK_SCACRSE_CRSE_NUMB AND SCBCRSE_EFF_TERM = (SELECT MAX(SCBCRSE_EFF_TERM) " +
		" FROM SCBCRSE " +
		" WHERE SCBCRSE_SUBJ_CODE = :KEY_BLOCK_SCACRSE_SUBJ_CODE AND SCBCRSE_CRSE_NUMB = :KEY_BLOCK_SCACRSE_CRSE_NUMB AND SCBCRSE_EFF_TERM <= :KEY_BLOCK_STVTERM_CODE ) ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("KEY_BLOCK_SCACRSE_SUBJ_CODE", getFormModel().getKeyBlock().getScacrseSubjCode());
				ptiCursor.addParameter("KEY_BLOCK_SCACRSE_CRSE_NUMB", getFormModel().getKeyBlock().getScacrseCrseNumb());
				ptiCursor.addParameter("KEY_BLOCK_STVTERM_CODE", getFormModel().getKeyBlock().getStvtermCode());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				rtnVal = toBool(ptiCursor.notFound());
				return  toBool(((rtnVal)));
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_SCBCRKY_2
	
	   FUNCTION SELECT_SCBCRKY_2
   RETURN BOOLEAN IS
      PTI_INTO_TEMP        VARCHAR2(255);
      RTN_VAL              BOOLEAN;
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   SCBCRKY
         WHERE  SCBCRKY_SUBJ_CODE = :SCACRSE_SUBJ_CODE
           AND  SCBCRKY_CRSE_NUMB = :SCACRSE_CRSE_NUMB ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RTN_VAL := PTI_CURSOR%NOTFOUND;         
      CLOSE PTI_CURSOR ;                     
      RETURN  (RTN_VAL) ;
   END ;
	*/
	//ID:2476
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details.
/* </p>
		*/
		public NBool selectScbcrky2()
		{
			int rowCount = 0;
			NString ptiIntoTemp = NString.getNull();
			NBool rtnVal = NBool.getNull();
			String sqlptiCursor = "SELECT 'X' " +
	" FROM SCBCRKY " +
	" WHERE SCBCRKY_SUBJ_CODE = :SCACRSE_SUBJ_CODE AND SCBCRKY_CRSE_NUMB = :SCACRSE_CRSE_NUMB ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("SCACRSE_SUBJ_CODE", getFormModel().getKeyBlock().getScacrseSubjCode());
				ptiCursor.addParameter("SCACRSE_CRSE_NUMB", getFormModel().getKeyBlock().getScacrseCrseNumb());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				rtnVal = toBool(ptiCursor.notFound());
				return  toBool(((rtnVal)));
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_SCBCRKY_1
	
	   FUNCTION SELECT_SCBCRKY_1 (IVAR_1 VARCHAR2, IVAR_2 VARCHAR2, OVAR_1 IN
      OUT VARCHAR2)
   RETURN BOOLEAN IS
      RTN_VAL              BOOLEAN;
      CURSOR PTI_CURSOR IS
         SELECT SCBCRKY_TERM_CODE_END
         FROM   SCBCRKY
         WHERE  SCBCRKY_SUBJ_CODE = IVAR_1
           AND  SCBCRKY_CRSE_NUMB = IVAR_2 ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO OVAR_1 ;
      RTN_VAL := PTI_CURSOR%NOTFOUND;         
      CLOSE PTI_CURSOR ;                     
      RETURN  (RTN_VAL) ;
   END ;
	*/
	//ID:2477
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details.
/* </p>
		* @param ivar1
		* @param ivar2
		* @param ovar1
		*/
		public NBool selectScbcrky1(NString ivar1, NString ivar2, Ref<NString> ovar1)
		{
			int rowCount = 0;
			NBool rtnVal = NBool.getNull();
			String sqlptiCursor = "SELECT SCBCRKY_TERM_CODE_END " +
	" FROM SCBCRKY " +
	" WHERE SCBCRKY_SUBJ_CODE = :P_IVAR_1 AND SCBCRKY_CRSE_NUMB = :P_IVAR_2 ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("P_IVAR_1", ivar1);
				ptiCursor.addParameter("P_IVAR_2", ivar2);
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ovar1.val = ptiCursorResults.getStr(0);
				}
				rtnVal = toBool(ptiCursor.notFound());
				return  toBool(((rtnVal)));
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit SETITEM
	
	PROCEDURE SETITEM(ITEMNAME VARCHAR2, SETVALUE NUMBER) IS
<multilinecomment> (FORMS40) To disable or enable an item when passed a valid item name.
   When SETVALUE is passed 0 the item is disabled otherwise the item is 
   enabled. </multilinecomment>
ITM_ID ITEM;
BEGIN
   ITM_ID := FIND_ITEM(ITEMNAME);
   IF SETVALUE = 0 THEN
      SET_ITEM_PROPERTY(ITM_ID,ENABLED,PROPERTY_OFF);
   ELSE
      SET_ITEM_PROPERTY(ITM_ID,ENABLED,PROPERTY_ON);
   END IF;
END;
	*/
	//ID:2478
	/* <p>
/* </p>
		* @param itemname
		* @param setvalue
		*/
		public void setitem(NString itemname, NNumber setvalue)
		{
			//  (FORMS40) To disable or enable an item when passed a valid item name.
			// When SETVALUE is passed 0 the item is disabled otherwise the item is
			// enabled. 
			ItemDescriptor itmId = null;
			itmId = findItem(itemname);
			if ( setvalue.equals(0) )
			{
				setItemEnabled(itmId, false);
			}
			else {
				setItemEnabled(itmId, true);
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_UCD
	
	PROCEDURE AUDIT_TRAIL_UCD IS
<multilinecomment>
AUDIT TRAIL: 1.1                                            INIT      DATE
UCD_MODS:1.10
SRF #507
1. Create new form for Course Detail Query form          sUNIL K   02/08/94
UCD_MODS: 2.0
   Modified for Pop-Up window using SCT script.
SRF#929 BUG FIX                                           10/19/94 kgk
  1) Add KEY-LISTVAL trigger to call STVMAJR instead of ZTVMAJR

UCD_MODS: 2.3
SRF #1181c                                AKW (DEC) 7/29/96
1.  Added ZCRGECO_GE_VERSION column to ZCRGECO block.
 
Category 3, forms 4.5 conversion by Prakash
UCD_MODS: 2.1.5 kp 09/03/96 - Security Implementation
UCD_MODS : 2.1.5 kp 09/03/96 - Library Conversion

UCD_MODS: 2.1.5 my 05/16/97
  Phase A update: Apply UCD MODS from RCS v2.3.

UCD_MODS:      MY    06/17/97
  Applied corrections to Phase 3.
  Create program unit: AUDIT_TRAIL and moved comments.

UCD_MODS:      MY    10/11/97
  Replace calls to CALL_FORM with calls to G$_SECURED_FORM_CALL.

AUDIT TRAIL: 3.0                                        INIT   DATE
1. Enhancements for Banner2000 upgrade.  These include   SQ  01/01/97
   adding an object group which contains the objects for
   the toolbar, adding an object group which highlights
   the active record within a block, a mouse-doubleclick
   and when-timer-expired trigger at the form level and
   this audit trail.

AUDIT TRAIL: 4.0
1. SRF 1758						UJJ  05/03/2001
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.

1. SRF 2628    AN 02/15/2006
   Banner 7 Category 3 Forms Conversion

SRF 3205             ALIU 4/15/2008
1. Added new data block, ZCBCRSE.
2. Moved SCBCRSE_SUBJ_CODE_XLIST and SCBCRSE_CRSE_NUMB_XLIST from SCBCRSE block
   to ZCBCRSE block.
3. Added DESC field for ZCBCRSE_SUBJ_CODE_XLIST, SCREQIV_SUBJ_CODE_EQIV,
   SCRCORQ_SUBJ_CODE_CORQ, and ZCRGECO_SUBJ_CODE_COCRSE.   
4. Re-arrange fields to fit in Banner INB window size of 757x444.
   
SRF 3205            aliu 4/22/2008
1. Added ZCBCRSE_DUPL_OVER_IND.
2. Change form to tab format.

SRF 3205            aliu 5/21/2008
1. Form is Query Only.  Change all data blocks to allow query only.
   Set Insert Allowed, Update Allowed and Delete Allowed to No for
   all data blocks driven by tables.
2. Added new canvas RESTRICTION_CANVAS to display course restrictions.
3. Removed LEVEL_CEU_IND and SCRGMOD_DEFAULT_IND.
4. Removed CORQ_CTRL AND SCRCORQ blocks.
5. Added new blocks: RTST_CTRL, SCRRTST, SCRRDEG_1, SCRRDEG_2, SCRRPRG_1, 
   SCRRPRG_2, SCRRCAM_1, and SCRRCAM_2.
6. Change SCRSCHD, SCREQIV, SCRRCOL_2, SCRRMAJ_2, SCRRCLS_2, and 
   SCRRLVL_2 to display multiple records   
7. Re-arrange fields on the form.

SRF 3205          aliu 6/11/2008
1. Removed FORM.KEY-OTHERS trigger.  Trigger is causing other keys
   such as SHIFT-TAB not working.
2. Widen some of the fields to ensure the field values are displayed fully.
3. Ensure Visual Attributess of Description field are inherited from
   property class.
4. Ensure the background of text label is transparent.   

SRF 3205          aliu 9/24/2008
1. Added DISABLE_TABS and ENABLE_TABS form trigger.
2. Disable tab pages when first open form to require users to 
   enter key_block information before going to detail blocks.  

SRF 3205         aliu 11/12/2008
1. Changed Case Restriction property of SCBCRSE_TITLE to MIXED.
2. Changed ORDER BY property of SCRSCHD data block to 
   scrschd_seq asc nulls first, scrschd_schd_code asc.

SRF 3314                                              ALIU 11/24/2008
1. Check in changes from Banner Revitalization project (SRF 3205).      

SRF 3314                                              ALIU 12/3/2008
1. Added data blocks for duplication of credits: ZCRDUPC, ZCRDUPR, 
   and ZCRDUPS.   
   
SRF 3504 - Banner 8 Upgrade                          aliu  3/18/2010
1. Added SCRRDEP_1, SCRRDEP_2, SCRRATT_1, SCRRATT_2, SCRRCHR_1 and
   SCRRCHR_2 blocks.
2. Added A new page to RESTRICTION_TAB.
3. Replace SCRRMAJ_1 and SCRRMAJ_2 data blocks with RMAJ_CTRL_BLOCK
   and SCRRMAJ.
4. Changed restrictions blocks: SCRRCOL_2, SCRRCLS_2, SCRRLVL_2, 
   SCRRDEG_2 and SCRRPRG_2, to display 3 records.
5. Fixed issues where Description columns are not populated
   when the corresponding Code column is not null.
6. Change Query Allowed property of SCRRCOL_1, SCRRCLS_1,
   SCRRLVL_1, SCRRDEG_1 and SCRRPRG_1 to No.
7. SCRTEXT_TEXT is not displaying the full text. 
   Moved SCRTEXT_TERM_CODE_FROM and SCRTEXT_TERM_CODE_TO.
   Widen SCRTEXT_TEXT field to display the full text.
8. Added TERM_CODE_END and replace '999999' with :TERM_CODE_END.

SRF 3504 - Banner 8 Upgrade                          aliu 3/30/2010
1. Modified Label for RESTRICTION2_TAB page.
2. Modified RMAJ_CTRL_BLOCK.PRE-QUERY, RMAJ_CTRL_BLOCK.POST-QUERY,
   and RMAJ_CTRL_BLOCK.ON-POPULATE-DETAILS.

 
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:2479
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details.
/* </p>
		*/
		public void auditTrailUcd()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0_FORMSCNV
	
	PROCEDURE AUDIT_TRAIL_7_0_FORMSCNV IS 
<multilinecomment> 
AUDIT TRAIL: 7.0 FORMSCNV 
1. VJ  10/07/2005
   Auto conversion of UI enhancements. Refer to the General UI documentation for more details. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:2480
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details.
/* </p>
		*/
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit DISPLAY_LOV2
	
	PROCEDURE DISPLAY_LOV2 (ITEM_NAME_IN IN VARCHAR2,LIST_NAME_IN IN VARCHAR2) IS

<multilinecomment> If the item name parameter is null, the cursor field will be used. If the list_name parameter is null, the lov associated with the item will be used. </multilinecomment>


ITEM_Y NUMBER := 0;
ITEM_X NUMBER := 0;
WIN_Y NUMBER := 0;
WIN_X NUMBER := 0;
LOV_X NUMBER := 0;
LOV_Y NUMBER := 0;
VIEW_X NUMBER := 0;
VIEW_Y NUMBER := 0;
ITEM_NAME VARCHAR2(80);
LIST_NAME VARCHAR2(80);
DUMMY BOOLEAN;
--
LOV_ID    LOV;
RG_NAME   VARCHAR2(80);
RG_ID     RECORDGROUP;
RG_STATUS NUMBER;


BEGIN 
   :GLOBAL.VALUE := '';
   WIN_Y:=GET_WINDOW_PROPERTY('MAIN_WINDOW',Y_POS);
   WIN_X :=GET_WINDOW_PROPERTY('MAIN_WINDOW',X_POS);
   ITEM_NAME :=NVL(ITEM_NAME_IN,NAME_IN('SYSTEM.CURSOR_ITEM'));
   ITEM_Y := GET_ITEM_PROPERTY(ITEM_NAME,Y_POS);           
   ITEM_X := GET_ITEM_PROPERTY(ITEM_NAME,X_POS);     
   VIEW_X := get_window_property(GET_VIEW_PROPERTY(GET_ITEM_PROPERTY(ITEM_NAME,ITEM_CANVAS),
                window_name),x_pos);
   VIEW_Y := get_window_property(GET_VIEW_PROPERTY(GET_ITEM_PROPERTY(ITEM_NAME,ITEM_CANVAS),
               window_name),y_pos);
   LIST_NAME := NVL(LIST_NAME_IN,GET_ITEM_PROPERTY(ITEM_NAME,LOV_NAME));
   IF LIST_NAME IS  NULL THEN
      MESSAGE( G$_NLS.Get('ZCADETQ-0193', 'FORM','*ERROR* LOV does not exist for this item') );
      RETURN;
   ELSE
      IF ITEM_X + view_x < 234 THEN 
         LOV_X := WIN_X + 228;
      else
         LOV_X := WIN_X;
      END IF;
      IF ITEM_Y + VIEW_Y < 153 THEN 
         LOV_Y := WIN_Y + 170;
      ELSE
         LOV_y := WIN_Y + 51;
      END IF;
--
-- Obtain the id for the LOV and use that to get the
-- record group.
--
      LOV_ID := FIND_LOV(LIST_NAME);
      RG_NAME := GET_LOV_PROPERTY(LOV_ID, GROUP_NAME);
      RG_ID := FIND_GROUP(RG_NAME);
--
-- Populate the record group and use the returned status
-- to determine whether or not any records exist.  If no
-- records exist, issue warning and return.
--
      RG_STATUS := POPULATE_GROUP(RG_ID);
      IF RG_STATUS <> 0 THEN
         MESSAGE( G$_NLS.Get('ZCADETQ-0194', 'FORM','*WARNING* No records exist to query LOV.') );
         RETURN;
      END IF;
--
-- Display LOV.
--
break;
      SET_LOV_PROPERTY (LIST_NAME,LOV_SIZE,234,170);
      :GLOBAL.VALUE_SELECTED := 'N';
      IF SHOW_LOV (LIST_NAME,LOV_X,LOV_Y) THEN
        :GLOBAL.VALUE_SELECTED := 'Y';
        IF GET_ITEM_PROPERTY(ITEM_NAME,UPDATEABLE) = 'TRUE' OR
           (GET_ITEM_PROPERTY(ITEM_NAME,UPDATE_NULL) = 'TRUE'
            AND :SYSTEM.CURSOR_VALUE IS NULL) OR  
            :SYSTEM.MODE <> 'NORMAL' OR
            :SYSTEM.RECORD_STATUS = 'NEW' OR
            :SYSTEM.RECORD_STATUS = 'INSERT' THEN 
--  This lines were commented out because the lov for existing courses had special
--  code to handle a different global and a different copy routine.
--            EXECUTE_TRIGGER('LIST_VALUES_COPY'); 
--            :GLOBAL.VALUE := '';
--            DO_KEY('NEXT_ITEM');
             NULL;
        ELSE
             MESSAGE( G$_NLS.Get('ZCADETQ-0200', 'FORM','*ERROR* Item is protected against update.') );              
         END IF;  
      END IF;
   END IF;
END;
	*/
	//ID:2481
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details.
/* </p>
		* @param itemNameIn
		* @param listNameIn
		*/
		public void displayLov2(NString itemNameIn, NString listNameIn)
		{
			//  If the item name parameter is null, the cursor field will be used. If the list_name parameter is null, the lov associated with the item will be used. 
			NNumber itemY = toNumber(0);
			NNumber itemX = toNumber(0);
			NNumber winY = toNumber(0);
			NNumber winX = toNumber(0);
			NNumber lovX = toNumber(0);
			NNumber lovY = toNumber(0);
			NNumber viewX = toNumber(0);
			NNumber viewY = toNumber(0);
			NString itemName = NString.getNull();
			NString listName = NString.getNull();
			NBool dummy = NBool.getNull();
			// 
			LovDescriptor lovId = null;
			NString rgName = NString.getNull();
			ValueSet rgId = null;
			NNumber rgStatus = NNumber.getNull();
			setGlobal("VALUE", toStr(""));
			itemName = isNull(itemNameIn, getCursorItem());
			itemY = toNumber(getItemYPos(itemName));
			itemX = toNumber(getItemXPos(itemName));
			listName = isNull(listNameIn, getItemLovName(itemName));
			if ( listName.isNull() )
			{
				errorMessage(GNls.Fget(toStr("ZCADETQ-0193"), toStr("FORM"), toStr("*ERROR* LOV does not exist for this item")));
				return ;
			}
			else {
				if ( itemX.add(viewX).lesser(234) )
				{
					lovX = winX.add(228);
				}
				else {
					lovX = winX;
				}
				if ( itemY.add(viewY).lesser(153) )
				{
					lovY = winY.add(170);
				}
				else {
					lovY = winY.add(51);
				}
				// 
				//  Obtain the id for the LOV and use that to get the
				//  record group.
				// 
				lovId = findLov(listName);
				rgName = toStr(getLovGroupName(lovId));
				rgId = findGroup(rgName);
				// 
				//  Populate the record group and use the returned status
				//  to determine whether or not any records exist.  If no
				//  records exist, issue warning and return.
				// 
				rgStatus = populateGroup(rgId);
				if ( rgStatus.notEquals(0) )
				{
					warningMessage(GNls.Fget(toStr("ZCADETQ-0194"), toStr("FORM"), toStr("*WARNING* No records exist to query LOV.")));
					return ;
				}
				// 
				//  Display LOV.
				// 
				
				setGlobal("VALUE_SELECTED", toStr("N"));
				if ( showLov(listName).getValue() )
				{
					setGlobal("VALUE_SELECTED", toStr("Y"));
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( getItemUpdateAllowed(itemName).equals("TRUE") || (getItemUpdateNull(itemName).equals("TRUE") && getCursorValue()== null) || !getMode().equals("NORMAL") || getRecordStatus().equals("NEW") || getRecordStatus().equals("INSERT") )
					{
						//   This lines were commented out because the lov for existing courses had special
						//   code to handle a different global and a different copy routine.
						//             EXECUTE_TRIGGER('LIST_VALUES_COPY'); 
						//             :GLOBAL.VALUE := '';
						//             DO_KEY('NEXT_ITEM');
					}
					else {
						errorMessage(GNls.Fget(toStr("ZCADETQ-0200"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}
		}

	
	/* Original PL/SQL code for Prog Unit CHECK_PACKAGE_FAILURE
	
	Procedure Check_Package_Failure IS
BEGIN
  IF NOT ( Form_Success ) THEN
    RAISE Form_Trigger_Failure;
  END IF;
END;
	*/
	//ID:2482
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details.
/* </p>
		*/
		public void checkPackageFailure()
		{
			if ( (getFormSuccess()).not() )
			{
				throw new ApplicationException();
			}
		}

	
	/* Original PL/SQL code for Prog Unit QUERY_MASTER_DETAILS
	
	PROCEDURE Query_Master_Details(rel_id Relation,detail VARCHAR2) IS
  oldmsg VARCHAR2(2);  -- Old Message Level Setting
  reldef VARCHAR2(5);  -- Relation Deferred Setting
BEGIN
  --
  -- Initialize Local Variable(s)
  --
  reldef := Get_Relation_Property(rel_id, DEFERRED_COORDINATION);
  oldmsg := :System.Message_Level;
  --
  -- If NOT Deferred, Goto detail and execute the query.
  --
  IF reldef = 'FALSE' THEN
    Go_Block(detail);
    Check_Package_Failure;
    :System.Message_Level := '10';
    Execute_Query;
    :System.Message_Level := oldmsg;
  ELSE
    --
    -- Relation is deferred, mark the detail block as un-coordinated
    --
    Set_Block_Property(detail, COORDINATION_STATUS, NON_COORDINATED);
  END IF;

EXCEPTION
    WHEN Form_Trigger_Failure THEN
      :System.Message_Level := oldmsg;
      RAISE;
END Query_Master_Details;

	*/
	//ID:2483
	/* <p>
//		* F2J_MASTER_DETAIL_LOGIC : This Program Unit was commented out because it contains Master-Detail logic. See documentation for details.
//		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details.
///* </p>
//		* @param relId
//		* @param detail
//		*/
//		public void queryMasterDetails(org.jdesktop.databuffer.DataRelation relId, NString detail)
//		{
//			NString oldmsg = NString.getNull();
//			//  Old Message Level Setting
//			NString reldef = NString.getNull();
//			try
//			{
//				// 
//				//  Initialize Local Variable(s)
//				// 
//				// F2J_NOT_SUPPORTED : The property "RELATION's DEFERRED_COORDINATION" is not supported. See documentation for details.
//				//				reldef = SupportClasses.FORMS40.GetRelationProperty(relId, SupportClasses.Property.DEFERRED_COORDINATION);
//				////
//				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'RELATION's DEFERRED_COORDINATION' is not supported. See documentation for details.");
//				
//				oldmsg = toStr(MessageServices.getMessageLevel());
//				// 
//				//  If NOT Deferred, Goto detail and execute the query.
//				// 
//				if ( reldef.equals("FALSE") )
//				{
//					goBlock(detail);
//					checkPackageFailure();
//					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("10"));
//					executeQuery();
//					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel(oldmsg));
//				}
//				else {
//					// 
//					//  Relation is deferred, mark the detail block as un-coordinated
//					// 
//					// F2J_NOT_SUPPORTED : The property "BLOCK's COORDINATION_STATUS" is not supported. See documentation for details.
//					//					SupportClasses.FORMS40.SetBlockProperty(detail, SupportClasses.Property.COORDINATION_STATUS, SupportClasses.Constants.NON_COORDINATED);
//					////
//					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'BLOCK's COORDINATION_STATUS' is not supported. See documentation for details.");
//					
//				}
//			}
//			catch(ApplicationException e)
//			{
//				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel(oldmsg));
//				throw  e;
//			}
//		}
//
	
	/* Original PL/SQL code for Prog Unit CLEAR_ALL_MASTER_DETAILS
	
	PROCEDURE Clear_All_Master_Details IS
  mastblk  VARCHAR2(30);  -- Initial Master Block Causing Coord
  coordop  VARCHAR2(30);  -- Operation Causing the Coord
  trigblk  VARCHAR2(30);  -- Cur Block On-Clear-Details Fires On
  startitm VARCHAR2(61);  -- Item in which cursor started
  frmstat  VARCHAR2(15);  -- Form Status
  curblk   VARCHAR2(30);  -- Current Block
  currel   VARCHAR2(30);  -- Current Relation
  curdtl   VARCHAR2(30);  -- Current Detail Block

  FUNCTION First_Changed_Block_Below(Master VARCHAR2)
  RETURN VARCHAR2 IS
    curblk VARCHAR2(30);  -- Current Block
    currel VARCHAR2(30);  -- Current Relation
    retblk VARCHAR2(30);  -- Return Block
  BEGIN
    --
    -- Initialize Local Vars
    --
    curblk := Master;
    currel := Get_Block_Property(curblk,  FIRST_MASTER_RELATION);
    --
    -- While there exists another relation for this block
    --
    WHILE currel IS NOT NULL LOOP
      --
      -- Get the name of the detail block
      --
      curblk := Get_Relation_Property(currel, DETAIL_NAME);
      --
      -- If this block has changes, return its name
      --
      IF ( Get_Block_Property(curblk, STATUS) = 'CHANGED' ) THEN
        RETURN curblk;
      ELSE
        --
        -- No changes, recursively look for changed blocks below
        --
        retblk := First_Changed_Block_Below(curblk);
        --
        -- If some block below is changed, return its name
        --
        IF retblk IS NOT NULL THEN
          RETURN retblk;
        ELSE
          --
          -- Consider the next relation
          --
          currel := Get_Relation_Property(currel, NEXT_MASTER_RELATION);
        END IF;
      END IF;
    END LOOP;

    --
    -- No changed blocks were found
    --
    RETURN NULL;
  END First_Changed_Block_Below;

BEGIN
  --
  -- Init Local Vars
  --
  mastblk  := :System.Master_Block;
  coordop  := :System.Coordination_Operation;
  trigblk  := :System.Trigger_Block;
  startitm := :System.Cursor_Item;
  frmstat  := :System.Form_Status;

  --
  -- If the coordination operation is anything but CLEAR_RECORD or
  -- SYNCHRONIZE_BLOCKS, then continue checking.
  --
  IF coordop NOT IN ('CLEAR_RECORD', 'SYNCHRONIZE_BLOCKS') THEN
    --
    -- If we're processing the driving master block...
    --
    IF mastblk = trigblk THEN
      --
      -- If something in the form is changed, find the
      -- first changed block below the master
      --
      IF frmstat = 'CHANGED' THEN
        curblk := First_Changed_Block_Below(mastblk);
        --
        -- If we find a changed block below, go there
        -- and Ask to commit the changes.
        --
        IF curblk IS NOT NULL THEN
          Go_Block(curblk);
          Check_Package_Failure;
          Clear_Block(ASK_COMMIT);
          --
          -- If user cancels commit dialog, raise error
          --
          IF NOT ( :System.Form_Status = 'QUERY'
                   OR :System.Block_Status = 'NEW' ) THEN
            RAISE Form_Trigger_Failure;
          END IF;
        END IF;
      END IF;
    END IF;
  END IF;

  --
  -- Clear all the detail blocks for this master without
  -- any further asking to commit.
  --
  currel := Get_Block_Property(trigblk, FIRST_MASTER_RELATION);
  WHILE currel IS NOT NULL LOOP
    curdtl := Get_Relation_Property(currel, DETAIL_NAME);
    IF Get_Block_Property(curdtl, STATUS) <> 'NEW'  THEN
      Go_Block(curdtl);
      Check_Package_Failure;
      Clear_Block(NO_VALIDATE);
      IF :System.Block_Status <> 'NEW' THEN
        RAISE Form_Trigger_Failure;
      END IF;
    END IF;
    currel := Get_Relation_Property(currel, NEXT_MASTER_RELATION);
  END LOOP;

  --
  -- Put cursor back where it started
  --
  IF :System.Cursor_Item <> startitm THEN
    Go_Item(startitm);
    Check_Package_Failure;
  END IF;

EXCEPTION
  WHEN Form_Trigger_Failure THEN
    IF :System.Cursor_Item <> startitm THEN
      Go_Item(startitm);
    END IF;
    RAISE;

END Clear_All_Master_Details;

	*/
	//ID:2484
	/* <p>
//		* F2J_MASTER_DETAIL_LOGIC : This Program Unit was commented out because it contains Master-Detail logic. See documentation for details.
///* </p>
//		*/
//		public void clearAllMasterDetails()
//		{
//			NString mastblk = NString.getNull();
//			//  Initial Master Block Causing Coord
//			NString coordop = NString.getNull();
//			//  Operation Causing the Coord
//			NString trigblk = NString.getNull();
//			//  Cur Block On-Clear-Details Fires On
//			NString startitm = NString.getNull();
//			//  Item in which cursor started
//			NString frmstat = NString.getNull();
//			//  Form Status
//			NString curblk = NString.getNull();
//			//  Current Block
//			NString currel = NString.getNull();
//			//  Current Relation
//			NString curdtl = NString.getNull();
//			try
//			{
//				// 
//				//  Init Local Vars
//				// 
//				mastblk = toStr(SupportClasses.AppContext.MasterBlock);
//				coordop = toStr(SupportClasses.AppContext.CoordinationOperation);
//				trigblk = toStr(getTriggerBlock());
//				startitm = toStr(getCursorItem());
//				frmstat = toStr(getTaskStatus());
//				// 
//				//  If the coordination operation is anything but CLEAR_RECORD or
//				//  SYNCHRONIZE_BLOCKS, then continue checking.
//				// 
//				if ( notIn(coordop, "CLEAR_RECORD", "SYNCHRONIZE_BLOCKS").getValue() )
//				{
//					// 
//					//  If we're processing the driving master block...
//					// 
//					if ( mastblk.equals(trigblk) )
//					{
//						// 
//						//  If something in the form is changed, find the
//						//  first changed block below the master
//						// 
//						if ( frmstat.equals("CHANGED") )
//						{
//							curblk = ClearAllMasterDetails_firstChangedBlockBelow_Local(mastblk);
//							// 
//							//  If we find a changed block below, go there
//							//  and Ask to commit the changes.
//							// 
//							if ( curblk.isNotNull() )
//							{
//								goBlock(curblk);
//								checkPackageFailure();
//								clearBlock(TaskServices.ASK_COMMIT);
//								// 
//								//  If user cancels commit dialog, raise error
//								// 
//								if ( !(getTaskStatus().equals("QUERY") || getBlockStatus().equals("NEW")) )
//								{
//									throw new ApplicationException();
//								}
//							}
//						}
//					}
//				}
//				// 
//				//  Clear all the detail blocks for this master without
//				//  any further asking to commit.
//				// 
//				// F2J_NOT_SUPPORTED : The property "BLOCK's FIRST_MASTER_RELATION" is not supported. See documentation for details.
//				//				currel = SupportClasses.FORMS40.GetBlockProperty(trigblk, SupportClasses.Property.FIRST_MASTER_RELATION);
//				////
//				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'BLOCK's FIRST_MASTER_RELATION' is not supported. See documentation for details.");
//				
//				while ( currel.isNotNull() ) {
//					// F2J_NOT_SUPPORTED : The property "RELATION's DETAIL_NAME" is not supported. See documentation for details.
//					//					curdtl = SupportClasses.FORMS40.GetRelationProperty(currel, SupportClasses.Property.DETAIL_NAME);
//					////
//					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'RELATION's DETAIL_NAME' is not supported. See documentation for details.");
//					
//					if ( getBlockStatus(curdtl).notEquals("NEW") )
//					{
//						goBlock(curdtl);
//						checkPackageFailure();
//						clearBlock(TaskServices.NO_VALIDATE);
//						if ( !getBlockStatus().equals("NEW") )
//						{
//							throw new ApplicationException();
//						}
//					}
//					// F2J_NOT_SUPPORTED : The property "RELATION's NEXT_MASTER_RELATION" is not supported. See documentation for details.
//					//					currel = SupportClasses.FORMS40.GetRelationProperty(currel, SupportClasses.Property.NEXT_MASTER_RELATION);
//					////
//					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'RELATION's NEXT_MASTER_RELATION' is not supported. See documentation for details.");
//					
//				}
//				// 
//				//  Put cursor back where it started
//				// 
//				if ( getCursorItem().notEquals(startitm) )
//				{
//					goItem(startitm);
//					checkPackageFailure();
//				}
//			}
//			catch(ApplicationException e)
//			{
//				if ( getCursorItem().notEquals(startitm) )
//				{
//					goItem(startitm);
//				}
//				throw  e;
//			}
//		}
///* <p>
//		*  Current Detail Block
//		* F2J_MASTER_DETAIL_LOGIC : This Program Unit was commented out because it contains Master-Detail logic. See documentation for details.
//		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details.
///* </p>
//		* @param master
//		*/
//		public NString ClearAllMasterDetails_firstChangedBlockBelow_Local(NString master)
//		{
//			// F2J_WARNING : Variable name was changed from curblk to curblk2. Please review if variable usage is correct.
//			NString curblk2 = NString.getNull();
//			//  Current Block
//			// F2J_WARNING : Variable name was changed from currel to currel2. Please review if variable usage is correct.
//			NString currel2 = NString.getNull();
//			//  Current Relation
//			NString retblk = NString.getNull();
//			// 
//			//  Initialize Local Vars
//			// 
//			curblk2 = master;
//			// F2J_NOT_SUPPORTED : The property "BLOCK's FIRST_MASTER_RELATION" is not supported. See documentation for details.
//			//			currel2 = SupportClasses.FORMS40.GetBlockProperty(curblk2, SupportClasses.Property.FIRST_MASTER_RELATION);
//			////
//			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'BLOCK's FIRST_MASTER_RELATION' is not supported. See documentation for details.");
//			
//			// 
//			//  While there exists another relation for this block
//			// 
//			while ( currel2.isNotNull() ) {
//				// 
//				//  Get the name of the detail block
//				// 
//				// F2J_NOT_SUPPORTED : The property "RELATION's DETAIL_NAME" is not supported. See documentation for details.
//				//				curblk2 = SupportClasses.FORMS40.GetRelationProperty(currel2, SupportClasses.Property.DETAIL_NAME);
//				////
//				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'RELATION's DETAIL_NAME' is not supported. See documentation for details.");
//				
//				// 
//				//  If this block has changes, return its name
//				// 
//				if ((getBlockStatus(curblk2).equals("CHANGED")))
//				{
//					return  toStr(curblk3);
//				}
//				else {
//					// 
//					//  No changes, recursively look for changed blocks below
//					// 
//					retblk = ClearAllMasterDetails_firstChangedBlockBelow_Local(curblk3);
//					// 
//					//  If some block below is changed, return its name
//					// 
//					if ( retblk.isNotNull() )
//					{
//						return  toStr(retblk);
//					}
//					else {
//						// 
//						//  Consider the next relation
//						// 
//						// F2J_NOT_SUPPORTED : The property "RELATION's NEXT_MASTER_RELATION" is not supported. See documentation for details.
//						//						currel4 = SupportClasses.FORMS40.GetRelationProperty(currel4, SupportClasses.Property.NEXT_MASTER_RELATION);
//						////
//						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'RELATION's NEXT_MASTER_RELATION' is not supported. See documentation for details.");
//						
//					}
//				}
//			}
//			// 
//			//  No changed blocks were found
//			// 
//			return  toStr(NString.getNull());
//		}
//
	
		public boolean shouldBeValidNavigationalItem(ItemDescriptor item)
        {
            if (item.getInternalType().equalsIgnoreCase(ItemDescriptor.DISPLAYITEM))
                return false;
            
            if (item.getCanvas() == null)
                return false;
            
            if (!item.getNavigable())
                return false;
            
            if (!item.getVisible())
                return false;
            
            if (!(item.getEnabled()))
                return false;
            
            return true;
        }
        
        public void loadBlock(NString blockName)
        {
            
            boolean isTabPageEnabled;
            ItemDescriptor firstNavigationItem = null;
            TabPageDescriptor page;
            
            for (ItemDescriptor item : findBlock(blockName).getItems())
            {            
                if (shouldBeValidNavigationalItem(item))
                {
                    firstNavigationItem = item;
                }
            }
            
            if(firstNavigationItem != null && firstNavigationItem.getPage() != null)
            {
                page = firstNavigationItem.getPage();
                isTabPageEnabled = getTabPageEnabled(page);
                
                try
                {
                    setTabPageEnabled(page, true);
                    goBlock(blockName);
					if ((getBlockStatus().equals("NEW"))) {
						executeQuery();
					}
                }
                finally
                {
                    setTabPageEnabled(page, isTabPageEnabled);
                }
            }
            else
            {
                goBlock(blockName);
				if ((getBlockStatus().equals("NEW"))) {
					executeQuery();
				}
            }
        }

}
