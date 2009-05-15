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
package commonline.query.model;

import flapjack.layout.RecordLayout;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;


public class CommonLineRecord {
    private Map<String, byte[]> fields = new LinkedHashMap<String, byte[]>();
    private RecordLayout recordLayout;

    public CommonLineRecord() {
    }

    public CommonLineRecord(Map<String, byte[]> fields, RecordLayout recordLayout) {
        this.fields = fields;
        this.recordLayout = recordLayout;
    }

    public Map<String, byte[]> getFields() {
        return Collections.unmodifiableMap(fields);
    }

    public RecordLayout getRecordLayout() {
        return recordLayout;
    }

    public void setFields(Map<String, byte[]> fields) {
        this.fields = fields;
    }

    public void setRecordLayout(RecordLayout recordLayout) {
        this.recordLayout = recordLayout;
    }
}