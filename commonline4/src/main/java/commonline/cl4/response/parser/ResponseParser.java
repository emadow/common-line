package commonline.cl4.response.parser;

import commonline.cl4.response.layout.*;
import commonline.cl4.response.model.ResponseRecordFactoryResolver;
import commonline.core.parser.AbstractCommonLineRecordParser;

import java.util.List;


public class ResponseParser extends AbstractCommonLineRecordParser {

    public ResponseParser() {
        setRecordFactoryResolver(new ResponseRecordFactoryResolver());
    }

    protected void initializeRecordLayouts(List recordLayouts) {
        recordLayouts.add(new HeaderRecordLayout());
        recordLayouts.add(new ResponseRecordLayout());
        recordLayouts.add(new AlternativeLoanRecordLayout());
        recordLayouts.add(new SupplementalBorrowerInformationRecordLayout());
        recordLayouts.add(new UniqueSupplementDetailRecordLayout());
        recordLayouts.add(new TrailerRecordLayout());
        recordLayouts.add(new SpecialMessagesRecordLayout());
    }

}