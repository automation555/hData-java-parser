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
package org.mitre.hdata.hrf;

/**
 *
 * @author GBEUCHELT
 */
public class SectionPathExistsException extends Exception {

    /**
     * Creates a new instance of <code>SectionPathExistsException</code> without detail message.
     */
    public SectionPathExistsException() {
    }


    /**
     * Constructs an instance of <code>SectionPathExistsException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public SectionPathExistsException(String msg) {
        super(msg);
    }
}
