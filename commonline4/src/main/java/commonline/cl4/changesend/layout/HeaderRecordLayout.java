package commonline.cl4.changesend.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;

/**
 * NCHELP CommonLine® Network for FFELP and Alternative Loans
 * <p/>
 * Change Send File
 * <p/>
 * Header
 */
public class HeaderRecordLayout extends AbstractCommonLineRecordLayout {

    protected void defineFields() {
        text("Software Product Code", 4);
        text("Software Version", 4);
        text("Batch ID", 12);
        fixedNumber("File Creation Date (CCYYMMDD)", 8);
        fixedNumber("File Creation Time (HHMMSS)", 6);
        fixedNumber("File Transmission Date (CCYYMMDD)", 8);
        fixedNumber("File Transmission Time (HHMMSS)", 6);
        text("File Identifier Name", 19);
        fixedText("File Identifier Code", 5);
        text("Source Name", 32);
        text("Source ID", 8);
        filler(2);
        text("Source Non-ED Branch ID", 4);
        fixedText("Source Type Code", 1);
        text("Recipient Name", 32);
        text("Recipient ID", 8);
        filler(2);
        text("Recipient Non-ED Branch ID", 4);
        fixedText("Media Type Code", 1);
        fixedText("DUNS Source ID", 9);
        fixedText("DUNS Recipient ID", 9);
        filler(293);
    }

    public String getCode() {
        return "@H";
    }

}
