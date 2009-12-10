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
package org.projecthdata.hdata.hrf.util;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author bobd
 */
public class MarshallUtil {

    public static OutputStream marshall(Object obj, Class klass) throws JAXBException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        JAXBContext ctx = JAXBContext.newInstance(klass);
        Marshaller m = ctx.createMarshaller();

        m.marshal(obj, bos);

        return bos;
    }

}