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
package commonline.cl5.appsend.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;


public class HeaderLayout extends AbstractCommonLineRecordLayout {
    public HeaderLayout() {
        super("@H");
    }

    protected void defineFields() {
        field("2", "Software Product Code", "X(4)");
        field("3", "Software Version", "X(4)");
        field("4", "Batch ID", "X(12)");
        field("5", "File Creation Date (CCYYMMDD)", "9(8)");
        field("6", "File Creation Time (HHMMSS)", "9(6)");
        field("7", "File Transmission Date (CCYYMMDD)", "9(8)");
        field("8", "File Transmission Time (HHMMSS)", "9(6)");
        field("9", "File Identifier Name", "X(19)");
        field("10", "File Identifier Code", "X(5)");
        field("11", "Source Name", "X(32)");
        field("12", "Source ID", "X(8)");
        field("13", "Filler2", "X(2)");
        field("14", "Source Non-ED Branch ID", "X(4)");
        field("15", "Source Type Code", "X(1)");
        field("16", "Recipient Name", "X(32)");
        field("17", "Recipient ID", "X(8)");
        field("18", "Filler2", "X(2)");
        field("19", "Recipient Non-ED Branch ID", "X(4)");
        field("20", "Media Type Code", "X(1)");
        field("21", "Filler", "X(9)");
        field("22", "Filler", "X(9)");
        field("23", "Filler", "X(773)");
        recordTerminator("24");
    }
}
