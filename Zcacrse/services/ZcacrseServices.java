package net.hedtech.ucdavis.ps.banner.student.Zcacrse.services;

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


import net.hedtech.ucdavis.ps.banner.student.Zcacrse.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.ucdavis.ps.banner.student.Zcacrse.model.*;



public class ZcacrseServices extends AbstractSupportCodeObject{
	
	
	public ZcacrseServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public ZcacrseTask  getTask() {
		return (ZcacrseTask )super.getContainer();
	}

	
	public net.hedtech.ucdavis.ps.banner.student.Zcacrse.model.ZcacrseModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_UCD
	
	PROCEDURE AUDIT_TRAIL_UCD IS 
<multilinecomment> 
UCD AUDIT TRAIL

SRF 3205                         ALIU 4/9/2008
1. Initial Version.

SRF 3205                         aliu 4/22/2008
1. Added SCRSCHD block with UCD column, SCRSCHD_SEQ.
2. Re-formatted ZCBCRSE block.
3. Fixed bugs discovered in testing.

SRF 3205                         aliu 9/24/2008
1. Removed columns from SCRSCHD block.
2. Added ZCRGECO block.

SRF 3205                         aliu 10/22/2008
1. Fixed LOV not exists for KB_SUBJ_CODE and KB_CRSE_NUMB.

SRF 3205                          aliu 10/29/2008
1. Change ORDER BY property of SCRSCHD data block.

SRF 3205                          aliu 11/12/2008
1. Changed ORDER BY property of SCRSCHD data block to: 
   scrschd_seq asc nulls first, scrschd_schd_code asc.

SRF 3314                          aliu 11/24/2008
1. Check in changes from Banner Revitalization project (SRF 3205).   
   
SRF 3314                          aliu 12/04/2008
1. Change form to tabs.
2. Added Duplication of Credit data blocks.   

SRF 3314                          aliu 12/12/2008
1. Revised duplication of credit blocks to look like as they
   were in SCADETL.
2. User was able edit ZCBCRSE block even though ZCBCRSE_EFF_TERM
   does not match KB_TERM_CODE_EFF.  Added code to disallow edit
   for this situation.
3. Modified ZCBCRSE block to work like ZCRGECO to allow user
   to end the record by inserting null values into ZCBCRSE table.
   
SRF 3314                         aliu 1/9/2009
1. Fixed typo from ZCBCRSE_1_COPY_BTN to ZCBCRSE_ENDCOPY_LBT in
   code.
2. Modified ZCRDUPR_CRSE_NUMB.KEY_CQUERY to display the correct
   LOV.      

srf 3317                                   STO 01/10/2009
   1) ZCRDUPR_grde_code_min.when_validated_item
      fix: doing validation when item is null, effectively
           making it a required item.
SRF 3317 Add routine to set rule seqno     STO 04/24/2009
         This is needed in case rules iserted with SQl
SRF 3317 Add routine to set rule seqno     STO 04/24/2009

SRF 4183                                   jae 07/17/2014
1. Fixed compilation errors after DBEU upgrade.
                   
END UCD AUDIT TRAIL
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1553
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details.
/* </p>
		*/
		public void auditTrailUcd()
		{
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_SCBCRKY_4
	
	   FUNCTION SELECT_SCBCRKY_4
   RETURN BOOLEAN IS
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   SCBCRKY
         WHERE  SCBCRKY_SUBJ_CODE = :KB_SUBJ_CODE
           AND  SCBCRKY_CRSE_NUMB = :KB_CRSE_NUMB ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RETURN (PTI_CURSOR%NOTFOUND) ;
   END ;
	*/
	//ID:1554
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details.
/* </p>
		*/
		public NBool selectScbcrky4()
		{
			int rowCount = 0;
			NString ptiIntoTemp = NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
	" FROM SCBCRKY " +
	" WHERE SCBCRKY_SUBJ_CODE = :KB_SUBJ_CODE AND SCBCRKY_CRSE_NUMB = :KB_CRSE_NUMB ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("KB_SUBJ_CODE", getFormModel().getKeyBlock().getKbSubjCode());
				ptiCursor.addParameter("KB_CRSE_NUMB", getFormModel().getKeyBlock().getKbCrseNumb());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				return  toBool(((ptiCursor.notFound())));
				}finally{
					ptiCursor.close();
				}
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
      MESSAGE( G$_NLS.Get('ZCACRSE-0181', 'FORM','*ERROR* LOV does not exist for this item') );
      RETURN;
   ELSE
      IF ITEM_X + view_x < 39*6 THEN 
         LOV_X := (WIN_X + 38) * 6;
      else
         LOV_X := WIN_X * 6;
      END IF;
      IF ITEM_Y + VIEW_Y < (9 * 17)  THEN 
         LOV_Y := (WIN_Y + 10) * 17;
      ELSE
         LOV_y := (WIN_Y + 3) * 17;
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
         MESSAGE( G$_NLS.Get('ZCACRSE-0182', 'FORM','*WARNING* No records exist to query LOV.') );
         RETURN;
      END IF;
--
-- Display LOV.
--
break;
      SET_LOV_PROPERTY (LIST_NAME,LOV_SIZE,39*6,10*17);
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
             MESSAGE( G$_NLS.Get('ZCACRSE-0188', 'FORM','*ERROR* Item is protected against update.') );              
         END IF;  
      END IF;
   END IF;
END;
	*/
	//ID:1555
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
			// F2J_NOT_SUPPORTED : The property "WINDOW's Y_POS" is not supported. See documentation for details.
			//			winY = toNumber(SupportClasses.FORMS4W.GetWindowProperty("MAIN_WINDOW", SupportClasses.Property.Y_POS));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's Y_POS' is not supported. See documentation for details.");
			
			// F2J_NOT_SUPPORTED : The property "WINDOW's X_POS" is not supported. See documentation for details.
			//			winX = toNumber(SupportClasses.FORMS4W.GetWindowProperty("MAIN_WINDOW", SupportClasses.Property.X_POS));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's X_POS' is not supported. See documentation for details.");
			
			itemName = isNull(itemNameIn, getCursorItem());
			itemY = toNumber(getItemYPos(itemName));
			itemX = toNumber(getItemXPos(itemName));
			// F2J_NOT_SUPPORTED : The property "WINDOW's X_POS" is not supported. See documentation for details.
			//			viewX = toNumber(SupportClasses.FORMS4W.GetWindowProperty(getViewWindowName(getItemCanvas(itemName)), SupportClasses.Property.X_POS));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's X_POS' is not supported. See documentation for details.");
			
			// F2J_NOT_SUPPORTED : The property "WINDOW's Y_POS" is not supported. See documentation for details.
			//			viewY = toNumber(SupportClasses.FORMS4W.GetWindowProperty(getViewWindowName(getItemCanvas(itemName)), SupportClasses.Property.Y_POS));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's Y_POS' is not supported. See documentation for details.");
			
			listName = isNull(listNameIn, getItemLovName(itemName));
			if ( listName.isNull() )
			{
				errorMessage(GNls.Fget(toStr("ZCACRSE-0181"), toStr("FORM"), toStr("*ERROR* LOV does not exist for this item")));
				return ;
			}
			else {
				if ( itemX.add(viewX).lesser(39*6) )
				{
					lovX = (winX.add(38)).multiply(6);
				}
				else {
					lovX = winX.multiply(6);
				}
				if ( itemY.add(viewY).lesser((9*17)) )
				{
					lovY = (winY.add(10)).multiply(17);
				}
				else {
					lovY = (winY.add(3)).multiply(17);
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
					warningMessage(GNls.Fget(toStr("ZCACRSE-0182"), toStr("FORM"), toStr("*WARNING* No records exist to query LOV.")));
					return ;
				}
				// 
				//  Display LOV.
				// 
				// F2J_NOT_SUPPORTED : Call to built-in "BREAK" was removed because it is not supported. See documentation for details.
				//				SupportClasses.SQLFORMS.Rwbreak();
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'BREAK' was removed because it is not supported. See documentation for details.");
				
				// F2J_NOT_SUPPORTED : The property "LOV's LOV_SIZE" is not supported. See documentation for details.
				//				SupportClasses.FORMS4W.SetLovProperty(listName, SupportClasses.Constants.LOV_SIZE, 39.multiply(6), 10.multiply(17));
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'LOV's LOV_SIZE' is not supported. See documentation for details.");
				
				setGlobal("VALUE_SELECTED", toStr("N"));
				if ( showLov(listName).isTrue() )
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
						errorMessage(GNls.Fget(toStr("ZCACRSE-0188"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_SCBCRKY_3
	
	   FUNCTION SELECT_SCBCRKY_3 (OVAR_1 IN OUT VARCHAR2)
   RETURN BOOLEAN IS
      CURSOR PTI_CURSOR IS
         SELECT SCBCRKY_TERM_CODE_END
         FROM   SCBCRKY
         WHERE  SCBCRKY_SUBJ_CODE = :KB_SUBJ_CODE
           AND  SCBCRKY_CRSE_NUMB = :KB_CRSE_NUMB ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO OVAR_1 ;
      RETURN (PTI_CURSOR%NOTFOUND) ;
   END ;
	*/
	//ID:1556
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details.
/* </p>
		* @param ovar1
		*/
		public NBool selectScbcrky3(Ref<NString> ovar1)
		{
			int rowCount = 0;
			String sqlptiCursor = "SELECT SCBCRKY_TERM_CODE_END " +
	" FROM SCBCRKY " +
	" WHERE SCBCRKY_SUBJ_CODE = :KB_SUBJ_CODE AND SCBCRKY_CRSE_NUMB = :KB_CRSE_NUMB ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("KB_SUBJ_CODE", getFormModel().getKeyBlock().getKbSubjCode());
				ptiCursor.addParameter("KB_CRSE_NUMB", getFormModel().getKeyBlock().getKbCrseNumb());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ovar1.val = ptiCursorResults.getStr(0);
				}
				return  toBool(((ptiCursor.notFound())));
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_DUAL_1
	
	   FUNCTION SELECT_DUAL_1 (IVAR_1 VARCHAR2)
   RETURN BOOLEAN IS
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   DUAL
         WHERE  IVAR_1 =  (
               SELECT SCBCRKY_TERM_CODE_START
               FROM   SCBCRKY
               WHERE  SCBCRKY_SUBJ_CODE = :KB_SUBJ_CODE
                 AND  SCBCRKY_CRSE_NUMB = :KB_CRSE_NUMB )  ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RETURN (PTI_CURSOR%NOTFOUND) ;
   END ;
	*/
	//ID:1557
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details.
/* </p>
		* @param ivar1
		*/
		public NBool selectDual1(NString ivar1)
		{
			int rowCount = 0;
			NString ptiIntoTemp = NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
	" FROM DUAL " +
	" WHERE :P_IVAR_1 = (SELECT SCBCRKY_TERM_CODE_START " +
		" FROM SCBCRKY " +
		" WHERE SCBCRKY_SUBJ_CODE = :KB_SUBJ_CODE AND SCBCRKY_CRSE_NUMB = :KB_CRSE_NUMB ) ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("P_IVAR_1", ivar1);
				ptiCursor.addParameter("KB_SUBJ_CODE", getFormModel().getKeyBlock().getKbSubjCode());
				ptiCursor.addParameter("KB_CRSE_NUMB", getFormModel().getKeyBlock().getKbCrseNumb());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				return  toBool(((ptiCursor.notFound())));
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit U_VALID_SUBJ_CRSE
	
	FUNCTION U_VALID_SUBJ_CRSE (SUBJ IN VARCHAR2, CRSE IN VARCHAR2)
   RETURN BOOLEAN IS
BEGIN
  DECLARE 
    CURSOR_VALUE    VARCHAR2(1)  := 0;
  
  BEGIN
     SELECT COUNT(*) INTO CURSOR_VALUE
        FROM SCBCRKY
        WHERE SCBCRKY_SUBJ_CODE = SUBJ
          AND SCBCRKY_CRSE_NUMB = CRSE;
     
    IF CURSOR_VALUE = 0
            THEN RETURN FALSE;
     ELSE
            RETURN TRUE;
     END IF;       
    
     IF SQL%NOTFOUND
            THEN RETURN FALSE;
     ELSE
            RETURN TRUE;
     END IF;

   END;
RETURN NULL; END;
	*/
	//ID:1558
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details.
/* </p>
		* @param subj
		* @param crse
		*/
		public NBool uValidSubjCrse(NString subj, NString crse)
		{
			int rowCount = 0;
			{
				NString cursorValue = toStr(0);
				String sql1 = "SELECT COUNT(*) " +
	" FROM SCBCRKY " +
	" WHERE SCBCRKY_SUBJ_CODE = :P_SUBJ AND SCBCRKY_CRSE_NUMB = :P_CRSE ";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("P_SUBJ", subj);
				command1.addParameter("P_CRSE", crse);
				ResultSet results1 = command1.executeQuery();
				rowCount = command1.getRowCount();
				if ( results1.hasData() ) {
					cursorValue = results1.getStr(0);
				}
				results1.close();
				if ( cursorValue.equals(0) )
				{
					return  toBool( toBool(NBool.False));
				}
				else {
					return  toBool( toBool(NBool.True));
				}
//				if ( rowCount == 0 )
//				{
//					return  toBool( toBool(NBool.False));
//				}
//				else {
//					return  toBool( toBool(NBool.True));
//				}
			}
//			return  toBool(NBool.getNull());
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_SCREQIV_3
	
	   FUNCTION SELECT_SCREQIV_3 (IVAR_1 VARCHAR2, IVAR_2 VARCHAR2)
   RETURN BOOLEAN IS
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   SCREQIV
         WHERE  SCREQIV_SUBJ_CODE = :KB_SUBJ_CODE
           AND  SCREQIV_CRSE_NUMB = :KB_CRSE_NUMB
           AND  SCREQIV_EFF_TERM =  (
               SELECT MAX(SCREQIV_EFF_TERM)
               FROM   SCREQIV
               WHERE  SCREQIV_SUBJ_CODE = :KB_SUBJ_CODE
                 AND  SCREQIV_CRSE_NUMB = :KB_CRSE_NUMB
                 AND  SCREQIV_EFF_TERM <= :KB_TERM_CODE_EFF )
           AND  SCREQIV_SUBJ_CODE_EQIV = IVAR_1
           AND  SCREQIV_CRSE_NUMB_EQIV = IVAR_2 ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RETURN (PTI_CURSOR%NOTFOUND) ;
   END ;
	*/
	//ID:1559
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details.
/* </p>
		* @param ivar1
		* @param ivar2
		*/
		public NBool selectScreqiv3(NString ivar1, NString ivar2)
		{
			int rowCount = 0;
			NString ptiIntoTemp = NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
	" FROM SCREQIV " +
	" WHERE SCREQIV_SUBJ_CODE = :KB_SUBJ_CODE AND SCREQIV_CRSE_NUMB = :KB_CRSE_NUMB AND SCREQIV_EFF_TERM = (SELECT MAX(SCREQIV_EFF_TERM) " +
		" FROM SCREQIV " +
		" WHERE SCREQIV_SUBJ_CODE = :KB_SUBJ_CODE AND SCREQIV_CRSE_NUMB = :KB_CRSE_NUMB AND SCREQIV_EFF_TERM <= :KB_TERM_CODE_EFF ) AND SCREQIV_SUBJ_CODE_EQIV = :P_IVAR_1 AND SCREQIV_CRSE_NUMB_EQIV = :P_IVAR_2 ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("KB_SUBJ_CODE", getFormModel().getKeyBlock().getKbSubjCode());
				ptiCursor.addParameter("KB_CRSE_NUMB", getFormModel().getKeyBlock().getKbCrseNumb());
				ptiCursor.addParameter("KB_TERM_CODE_EFF", getFormModel().getKeyBlock().getKbTermCodeEff());
				ptiCursor.addParameter("P_IVAR_1", ivar1);
				ptiCursor.addParameter("P_IVAR_2", ivar2);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				return  toBool(((ptiCursor.notFound())));
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_SCRRTST_5
	
	   FUNCTION SELECT_SCRRTST_5 (IVAR_1 VARCHAR2, IVAR_2 VARCHAR2, IVAR_3 VARCHAR2
      , IVAR_4 VARCHAR2, IVAR_5 VARCHAR2, IVAR_6 VARCHAR2)
   RETURN BOOLEAN IS
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   SCRRTST
         WHERE  SCRRTST_SUBJ_CODE = IVAR_1
           AND  SCRRTST_CRSE_NUMB = IVAR_2
           AND  SCRRTST_TERM_CODE_EFF =  (
               SELECT MAX(SCRRTST_TERM_CODE_EFF)
               FROM   SCRRTST
               WHERE  SCRRTST_SUBJ_CODE = IVAR_3
                 AND  SCRRTST_CRSE_NUMB = IVAR_4
                 AND  SCRRTST_TERM_CODE_EFF <= :KB_TERM_CODE_EFF )
           AND  SCRRTST_SUBJ_CODE_PREQ = IVAR_5
           AND  SCRRTST_CRSE_NUMB_PREQ = IVAR_6 ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RETURN (PTI_CURSOR%NOTFOUND) ;
   END ;
	*/
	//ID:1560
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details.
/* </p>
		* @param ivar1
		* @param ivar2
		* @param ivar3
		* @param ivar4
		* @param ivar5
		* @param ivar6
		*/
		public NBool selectScrrtst5(NString ivar1, NString ivar2, NString ivar3, NString ivar4, NString ivar5, NString ivar6)
		{
			int rowCount = 0;
			NString ptiIntoTemp = NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
	" FROM SCRRTST " +
	" WHERE SCRRTST_SUBJ_CODE = :P_IVAR_1 AND SCRRTST_CRSE_NUMB = :P_IVAR_2 AND SCRRTST_TERM_CODE_EFF = (SELECT MAX(SCRRTST_TERM_CODE_EFF) " +
		" FROM SCRRTST " +
		" WHERE SCRRTST_SUBJ_CODE = :P_IVAR_3 AND SCRRTST_CRSE_NUMB = :P_IVAR_4 AND SCRRTST_TERM_CODE_EFF <= :KB_TERM_CODE_EFF ) AND SCRRTST_SUBJ_CODE_PREQ = :P_IVAR_5 AND SCRRTST_CRSE_NUMB_PREQ = :P_IVAR_6 ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("P_IVAR_1", ivar1);
				ptiCursor.addParameter("P_IVAR_2", ivar2);
				ptiCursor.addParameter("P_IVAR_3", ivar3);
				ptiCursor.addParameter("P_IVAR_4", ivar4);
				ptiCursor.addParameter("KB_TERM_CODE_EFF", getFormModel().getKeyBlock().getKbTermCodeEff());
				ptiCursor.addParameter("P_IVAR_5", ivar5);
				ptiCursor.addParameter("P_IVAR_6", ivar6);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				return  toBool(((ptiCursor.notFound())));
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit MAINTENANCE_OPTIONS
	
	PROCEDURE MAINTENANCE_OPTIONS (TEMP_ENDCOPY IN VARCHAR2,
                               DUP_ITEM_TEXT IN VARCHAR2,
                               COPY_ITEM_TEXT IN VARCHAR2) IS
BEGIN
     G$_KEY_OPT_MENU(TEMP_ENDCOPY, DUP_ITEM_TEXT, 'DUPLICATE_ITEM',
                                   COPY_ITEM_TEXT, 'DUPLICATE_RECORD',
                                   '','','','');
     G$_CHECK_FAILURE;
END;
	*/
	//ID:1561
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details.
/* </p>
		* @param tempEndcopy
		* @param dupItemText
		* @param copyItemText
		*/
		public void maintenanceOptions(NString tempEndcopy, NString dupItemText, NString copyItemText)
		{
			getTask().getGoqrpls().gKeyOptMenu(tempEndcopy, dupItemText, toStr("DUPLICATE_ITEM"), copyItemText, toStr("DUPLICATE_RECORD"), toStr(""), toStr(""), toStr(""), toStr(""));
			getTask().getGoqrpls().gCheckFailure();
		}

	
	/* Original PL/SQL code for Prog Unit CHECK_PACKAGE_FAILURE
	
	Procedure Check_Package_Failure IS
BEGIN
  IF NOT ( Form_Success ) THEN
    RAISE Form_Trigger_Failure;
  END IF;
END;
	*/
	//ID:1562
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
	//ID:1563
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
	//ID:1564
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
	
	/* Original PL/SQL code for Prog Unit U_SET_RULE_SEQNO
	
	FUNCTION U_SET_RULE_SEQNO 
   RETURN NUMBER
IS
BEGIN
DECLARE
	   MAX_ZCRDUPC_RULE     NUMBER := 0;
	   CURR_VAL             NUMBER := 0;
BEGIN
	
	--  THIS IS EXECUTED IN CASE SOMEONE HAS USED
	--  sql to insrt rows, or has otherwise created new rows.
	--
	     SELECT MAX(ZCRDUPC_RULE) 
	       INTO max_zcrdupc_rule
	         FROM ZCRDUPC;
	         
	     SELECT ZCRDUPC_RULE_SEQ.NEXTVAL 
	       INTO CURR_VAL 
	       FROM DUAL;
	         
	     WHILE CURR_VAL <= MAX_ZCRDUPC_RULE
	     LOOP
	     	   SELECT ZCRDUPC_RULE_SEQ.NEXTVAL INTO CURR_VAL FROM DUAL;
	     	   IF CURR_VAL >= MAX_ZCRDUPC_RULE
	     	   	    THEN
	     	   	         RETURN CURR_VAL;
	     	   END IF;
	     END LOOP;

	     RETURN CURR_VAL;
end;	     
END;
	*/
	//ID:1565
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details.
/* </p>
		*/
		public NNumber uSetRuleSeqno()
		{
			int rowCount = 0;
			{
				NNumber maxZcrdupcRule = toNumber(0);
				NNumber currVal = toNumber(0);
				//   THIS IS EXECUTED IN CASE SOMEONE HAS USED
				//   sql to insrt rows, or has otherwise created new rows.
				// 
				String sql1 = "SELECT MAX(ZCRDUPC_RULE) " +
	" FROM ZCRDUPC ";
				DataCommand command1 = new DataCommand(sql1);
				ResultSet results1 = command1.executeQuery();
				rowCount = command1.getRowCount();
				if ( results1.hasData() ) {
					maxZcrdupcRule = results1.getNumber(0);
				}
				results1.close();
				String sql2 = "SELECT ZCRDUPC_RULE_SEQ.NEXTVAL " +
	" FROM DUAL ";
				DataCommand command2 = new DataCommand(sql2);
				ResultSet results2 = command2.executeQuery();
				rowCount = command2.getRowCount();
				if ( results2.hasData() ) {
					currVal = results2.getNumber(0);
				}
				results2.close();
				while ( currVal.lesserOrEquals(maxZcrdupcRule) ) {
					String sql3 = "SELECT ZCRDUPC_RULE_SEQ.NEXTVAL " +
	" FROM DUAL ";
					DataCommand command3 = new DataCommand(sql3);
					ResultSet results3 = command3.executeQuery();
					rowCount = command3.getRowCount();
					if ( results3.hasData() ) {
						currVal = results3.getNumber(0);
					}
					results3.close();
					if ( currVal.greaterOrEquals(maxZcrdupcRule) )
					{
						return  toNumber(currVal);
					}
				}
				return  toNumber(currVal);
			}
		}

	
	

}
