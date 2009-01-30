/**
 * Copyright 2008-2009 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package commonline.cl4.disbursement.parser;

import commonline.cl4.disbursement.layout.*;
import commonline.core.parser.CommonLineRecordLayoutResolver;
import flapjack.parser.RecordLayoutResolver;
import junit.framework.TestCase;

import java.util.Iterator;


public class DibursementParserTest extends TestCase {
    public void test_verifyRecordLayouts() {
        DisbursementParser parser = new DisbursementParser();

        RecordLayoutResolver recordLayoutResolver = parser.getRecordLayoutResolver();
        assertNotNull(recordLayoutResolver);
        assertTrue(recordLayoutResolver instanceof CommonLineRecordLayoutResolver);

        CommonLineRecordLayoutResolver resolver = (CommonLineRecordLayoutResolver) recordLayoutResolver;
        assertContainsRecordLayout(HeaderRecordLayout.class, resolver);
        assertContainsRecordLayout(DisbursementDetailRecordLayout.class, resolver);
        assertContainsRecordLayout(SpecialMessagesRecordLayout.class, resolver);
        assertContainsRecordLayout(TrailerRecordLayout.class, resolver);
        assertContainsRecordLayout(UniqueSupplementRecordLayout.class, resolver);
        assertEquals(5, resolver.getRecordLayouts().size());
    }

    private void assertContainsRecordLayout(Class clazz, CommonLineRecordLayoutResolver resolver) {
        Iterator it = resolver.getRecordLayouts().iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            if (obj.getClass().equals(clazz)) {
                assertTrue(true);
                return;
            }
        }
        assertTrue("Could not find RecordLayout " + clazz.getName(), false);
    }
}