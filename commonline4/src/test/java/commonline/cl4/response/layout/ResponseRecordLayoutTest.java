package commonline.cl4.response.layout;

import commonline.test.layout.CommonLineRecordLayoutTestCase;


public class ResponseRecordLayoutTest extends CommonLineRecordLayoutTestCase {

    public void test() {
        ResponseRecordLayout layout = new ResponseRecordLayout();

        assertEquals("@1", layout.getCode());

        assertRecordCodeField(layout.getFieldDefinitions());

        int i = 1;
        assertFixedTextField("Record Status Code", 3, 1, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Date Record Status Last Updated (CCYYMMDD)", 4, 8, layout.getFieldDefinitions().get(i++));
        assertTextField("Borrower Last Name", 12, 35, layout.getFieldDefinitions().get(i++));
        assertTextField("Borrower First Name", 47, 12, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Borrower Middle Initial", 59, 1, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Borrower SSN", 60, 9, layout.getFieldDefinitions().get(i++));
        assertTextField("Permanent Borrower Address (line 1)", 69, 30, layout.getFieldDefinitions().get(i++));
        assertTextField("Permanent Borrower Address (line 2)", 99, 30, layout.getFieldDefinitions().get(i++));
        assertTextField("Permanent Borrower City", 129, 24, layout.getFieldDefinitions().get(i++));
        assertFillerField(153, 6, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Permanent Borrower State", 159, 2, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Permanent Borrower Zip Code", 161, 5, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Permanent Borrower Zip Code Suffix", 166, 4, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Borrower Telephone Number", 170, 10, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Borrower Date of Birth (CCYYMMDD)", 180, 8, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Loan Type Code", 188, 2, layout.getFieldDefinitions().get(i++));
        assertNumberField("Requested Loan Amount", 190, 6, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Deferment Request Code", 196, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Borrower Interest Indicator", 197, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("EFT Authorization Code", 198, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Borrower Signature Code", 199, 1, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Borrower Signature Date (CCYYMMDD)", 200, 8, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("CommonLine Unique Identifier", 208, 17, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("CommonLine Loan Sequence Number", 225, 2, layout.getFieldDefinitions().get(i++));
        assertFillerField(227, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("PLUS/Alternative Borrower U.S. Citizenship Status Code", 228, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("PLUS Borrower State of Legal Residence", 229, 2, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("PLUS Borrower State Resident Since Date (CCYYMM)", 231, 6, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("PLUS/Alternative Borrower Default/Refund Code", 237, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("PLUS Borrower Outstanding Loans Code", 238, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Alternative Student/Borrower Indicator Code", 239, 1, layout.getFieldDefinitions().get(i++));
        assertFillerField(240, 19, layout.getFieldDefinitions().get(i++));
        assertTextField("PLUS/Alternative Student Last Name", 259, 35, layout.getFieldDefinitions().get(i++));
        assertTextField("PLUS/Alternative Student First Name", 294, 12, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("PLUS/Alternative Student Middle Initial", 306, 1, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("PLUS/Alternative Student SSN", 307, 9, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("PLUS/Alternative Student Date of Birth (CCYYMMDD)", 316, 8, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("PLUS/Alternative Student U.S. Citizenship Status Code", 324, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("PLUS/Alternative Student Default/Refund Code", 325, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("PLUS/Alternative Student Signature Code", 326, 1, layout.getFieldDefinitions().get(i++));
        assertFillerField(327, 20, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("School ID", 347, 8, layout.getFieldDefinitions().get(i++));
        assertFillerField(355, 2, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Loan Period Begin Date (CCYYMMDD)", 357, 8, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Loan Period End Date (CCYYMMDD)", 365, 8, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Grade Level Code", 373, 1, layout.getFieldDefinitions().get(i++));
        assertFillerField(374, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Enrollment Status Code", 375, 1, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Anticipated Completion Date (CCYYMMDD)", 376, 8, layout.getFieldDefinitions().get(i++));
        assertNumberField("Cost of Attendance", 384, 5, layout.getFieldDefinitions().get(i++));
        assertNumberField("Expected Family Contribution Amount", 389, 5, layout.getFieldDefinitions().get(i++));
        assertNumberField("Estimated Financial Aid Amount", 394, 5, layout.getFieldDefinitions().get(i++));
        assertNumberField("Subsidized Federal Stafford Certified Amount", 399, 5, layout.getFieldDefinitions().get(i++));
        assertNumberField("Unsubsidized Federal Stafford Certified Amount", 404, 5, layout.getFieldDefinitions().get(i++));
        assertNumberField("Federal PLUS Certified Amount", 409, 5, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("School Certification Date (CCYYMMDD)", 414, 8, layout.getFieldDefinitions().get(i++));
        assertFillerField(422, 8, layout.getFieldDefinitions().get(i++));
        assertFillerField(430, 8, layout.getFieldDefinitions().get(i++));
        assertNumberField("Alternative Loan Certified Amount", 438, 5, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Alternative Loan Application Version Code", 443, 4, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("School Designated Branch/Division Code", 447, 2, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("DUNS School ID", 449, 9, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Lender ID", 458, 6, layout.getFieldDefinitions().get(i++));
        assertNumberField("Subsidized Federal Stafford Approved Amount", 464, 5, layout.getFieldDefinitions().get(i++));
        assertNumberField("Unsubsidized Federal Stafford Approved Amount", 469, 5, layout.getFieldDefinitions().get(i++));
        assertNumberField("Federal PLUS Approved Amount", 474, 5, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Lender Approved/Denied Date (CCYYMMDD)", 479, 8, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Lender Approved/Denied Code", 487, 1, layout.getFieldDefinitions().get(i++));
        assertNumberField("Alternative Loan Approved Amount", 488, 5, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("DUNS Lender ID", 493, 9, layout.getFieldDefinitions().get(i++));
        assertFillerField(502, 5, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Guarantor ID", 507, 3, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Federal Application Form Code", 510, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("DUNS Guarantor ID", 511, 9, layout.getFieldDefinitions().get(i++));
        assertFillerField(520, 11, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Guarantee Adjustment Indicator Code", 531, 1, layout.getFieldDefinitions().get(i++));
        assertFillerField(532, 4, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Disbursement Date 1 (CCYYMMDD)", 536, 8, layout.getFieldDefinitions().get(i++));
        assertNumberField("Disbursement Amount 1", 544, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Origination Fee 1", 551, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Guarantee Fee 1", 558, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Net Disbursement Amount 1", 565, 7, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Disbursement Date 2 (CCYYMMDD)", 572, 8, layout.getFieldDefinitions().get(i++));
        assertNumberField("Disbursement Amount 2", 580, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Origination Fee 2", 587, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Guarantee Fee 2", 594, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Net Disbursement Amount 2", 601, 7, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Disbursement Date 3 (CCYYMMDD)", 608, 8, layout.getFieldDefinitions().get(i++));
        assertNumberField("Disbursement Amount 3", 616, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Origination Fee 3", 623, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Guarantee Fee 3", 630, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Net Disbursement Amount 3", 637, 7, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Disbursement Date 4 (CCYYMMDD)", 644, 8, layout.getFieldDefinitions().get(i++));
        assertNumberField("Disbursement Amount 4", 652, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Origination Fee 4", 659, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Guarantee Fee 4", 666, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Net Disbursement Amount 4", 673, 7, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Guarantee Date (CCYYMMDD)", 680, 8, layout.getFieldDefinitions().get(i++));
        assertNumberField("Guarantee Amount", 688, 5, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Serial Loan Code", 693, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("MPN Confirmation Code", 694, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Borrower Confirmation Indicator", 695, 1, layout.getFieldDefinitions().get(i++));
        assertFillerField(696, 19, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Borrower Driver's License State", 715, 2, layout.getFieldDefinitions().get(i++));
        assertTextField("Borrower Driver's License Number", 717, 20, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Borrower References Code", 737, 1, layout.getFieldDefinitions().get(i++));
        assertTextField("School Use Only", 738, 23, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Disbursement 1 Hold/Release Indicator Code", 761, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Disbursement 2 Hold/Release Indicator Code", 762, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Disbursement 3 Hold/Release Indicator Code", 763, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Disbursement 4 Hold/Release Indicator Code", 764, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Promissory Note Delivery Code", 765, 1, layout.getFieldDefinitions().get(i++));
        assertTextField("Foreign Postal Code", 766, 14, layout.getFieldDefinitions().get(i++));
        assertFillerField(780, 1, layout.getFieldDefinitions().get(i++));
        assertTextField("Lender Non-ED Branch ID", 781, 4, layout.getFieldDefinitions().get(i++));
        assertTextField("Lender Use Only", 785, 20, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Lender of Last Resort Code", 805, 1, layout.getFieldDefinitions().get(i++));
        assertFillerField(806, 20, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Disbursement Status Code 1", 826, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Disbursement Status Code 2", 827, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Disbursement Status Code 3", 828, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Disbursement Status Code 4", 829, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Response to Originator Code", 830, 1, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Application Send Error Message Code 1", 831, 3, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Application Send Error Message Code 2", 834, 3, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Application Send Error Message Code 3", 837, 3, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Application Send Error Message Code 4", 840, 3, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Application Send Error Message Code 5", 843, 3, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Guarantee Amount Reduction Code", 846, 2, layout.getFieldDefinitions().get(i++));
        assertNumberField("Total Outstanding Federal Stafford/SLS Loan Amount", 848, 8, layout.getFieldDefinitions().get(i++));
        assertNumberField("Total Outstanding Federal PLUS Loan Amount", 856, 8, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Application/Loan Phase Code", 864, 4, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Date Application/Loan Phase Code Last Updated (CCYYMMDD)", 868, 8, layout.getFieldDefinitions().get(i++));
        assertTextField("Guarantor Use Only", 876, 23, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Date Permanent Address Last Updated (CCYYMMDD)", 899, 8, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Alternative Loan Program Type Code", 907, 3, layout.getFieldDefinitions().get(i++));
        assertNumberField("Alternative Borrower Total Student Loan Debt", 910, 7, layout.getFieldDefinitions().get(i++));
        assertFillerField(917, 12, layout.getFieldDefinitions().get(i++));
        assertNumberField("Fee Paid 1", 929, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Fee Paid 2", 936, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Fee Paid 3", 943, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Fee Paid 4", 950, 7, layout.getFieldDefinitions().get(i++));
        assertNumberField("Actual Interest Rate", 957, 5, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Processing Type Code", 962, 2, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Service Type Code", 964, 2, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Revised Notice of Guarantee Indicator Cod", 966, 1, layout.getFieldDefinitions().get(i++));
        assertNumberField("School Refund Amount", 967, 7, layout.getFieldDefinitions().get(i++));
        assertFixedNumberField("Date of Refund to Lender (CCYYMMDD)", 974, 8, layout.getFieldDefinitions().get(i++));
        assertTextField("Unique Layout Vendor Code", 982, 4, layout.getFieldDefinitions().get(i++));
        assertFixedTextField("Unique Layout Identifier Code", 986, 2, layout.getFieldDefinitions().get(i++));
        assertFillerField(988, 52, layout.getFieldDefinitions().get(i++));
        assertRecordTerminatorField(1040, layout.getFieldDefinitions());

        assertEquals(1040, layout.getLength());
        assertEquals(153, layout.getFieldDefinitions().size());
    }
}