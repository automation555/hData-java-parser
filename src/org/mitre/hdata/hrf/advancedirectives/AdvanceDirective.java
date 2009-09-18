/*
 *
 *
 *    Copyright 2009 The MITRE Corporation
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mitre.hdata.hrf.advancedirectives;

import java.io.OutputStream;
import javax.xml.bind.JAXBException;
import org.mitre.hdata.hrf.util.MarshallUtil;

/**
 *
 * @author bobd
 */
public class AdvanceDirective extends org.projecthdata.hdata.schemas._2009._06.advance_directive.AdvanceDirective implements org.mitre.hdata.hrf.SectionDocument {

    private String documentid;

    private static String TYPEID = "http://projecthdata.org/hdata/schemas/advancedirective/2009/06";

    public AdvanceDirective() {
    }

    public AdvanceDirective(org.projecthdata.hdata.schemas._2009._06.advance_directive.AdvanceDirective ad) {
        //TODO copy constructor

    }

    @Override
    public String getDocumentId() {
        return documentid;
    }

    @Override
    public void setDocumentId(String documentid) {
        this.documentid = documentid;
    }




    @Override
    public OutputStream marshall() throws JAXBException {
        return MarshallUtil.marshall(this, super.getClass());
    }

}
