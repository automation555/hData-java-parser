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
package org.projecthdata.hdata.hrf.serialization;

import org.projecthdata.hdata.hrf.HRF;

/**
 *
 * @author GBEUCHELT
 */
public interface HRFSerializer {

    public abstract HRF deserialize(Object o) throws Exception;

    public abstract void serialize(Object o, HRF hrf) throws Exception;
    
    @SuppressWarnings("unchecked")
	public void registerExtension(String uri, Class clazz);

    @SuppressWarnings("unchecked")
	public Class resolveExtension(String uri);

}
