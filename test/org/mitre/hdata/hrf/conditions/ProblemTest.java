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
package org.mitre.hdata.hrf.conditions;

import java.io.OutputStream;
import java.net.URI;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bobd
 */
public class ProblemTest {

    public ProblemTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getDocumentName method, of class Problem.
     */
    @Test
    public void testGetDocumentName() {
        System.out.println("getDocumentName");
        Problem instance = new Problem();
        String expResult = "";
        String result = instance.getDocumentName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSectionId method, of class Problem.
     */
    @Test
    public void testGetSectionId() {
        System.out.println("getSectionId");
        Problem instance = new Problem();
        URI expResult = null;
        URI result = instance.getSectionId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of marshall method, of class Problem.
     */
    @Test
    public void testMarshall() throws Exception {
        System.out.println("marshall");
        Problem instance = new Problem();
        OutputStream expResult = null;
        OutputStream result = instance.marshall();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Problem.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object arg0 = null;
        Problem instance = new Problem();
        int expResult = 0;
        int result = instance.compareTo(arg0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}