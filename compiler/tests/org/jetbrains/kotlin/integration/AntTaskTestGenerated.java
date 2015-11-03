/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.integration;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/integration/ant/jvm")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class AntTaskTestGenerated extends AbstractAntTaskTest {
    @TestMetadata("additionalArguments")
    public void testAdditionalArguments() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/integration/ant/jvm/additionalArguments/");
        doTest(fileName);
    }

    public void testAllFilesPresentInJvm() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/integration/ant/jvm"), Pattern.compile("^([^\\.]+)$"), false);
    }

    @TestMetadata("doNotFailOnError")
    public void testDoNotFailOnError() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/integration/ant/jvm/doNotFailOnError/");
        doTest(fileName);
    }

    @TestMetadata("failOnErrorByDefault")
    public void testFailOnErrorByDefault() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/integration/ant/jvm/failOnErrorByDefault/");
        doTest(fileName);
    }

    @TestMetadata("helloWorld")
    public void testHelloWorld() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/integration/ant/jvm/helloWorld/");
        doTest(fileName);
    }

    @TestMetadata("internalMembers")
    public void testInternalMembers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/integration/ant/jvm/internalMembers/");
        doTest(fileName);
    }

    @TestMetadata("jvmClasspath")
    public void testJvmClasspath() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/integration/ant/jvm/jvmClasspath/");
        doTest(fileName);
    }

    @TestMetadata("mainInFiles")
    public void testMainInFiles() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/integration/ant/jvm/mainInFiles/");
        doTest(fileName);
    }

    @TestMetadata("moduleName")
    public void testModuleName() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/integration/ant/jvm/moduleName/");
        doTest(fileName);
    }

    @TestMetadata("moduleNameDefault")
    public void testModuleNameDefault() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/integration/ant/jvm/moduleNameDefault/");
        doTest(fileName);
    }

    @TestMetadata("moduleNameWithKotlin")
    public void testModuleNameWithKotlin() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/integration/ant/jvm/moduleNameWithKotlin/");
        doTest(fileName);
    }

    @TestMetadata("noStdlibForJavac")
    public void testNoStdlibForJavac() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/integration/ant/jvm/noStdlibForJavac/");
        doTest(fileName);
    }

    @TestMetadata("stdlibForJavacWithNoKotlin")
    public void testStdlibForJavacWithNoKotlin() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/integration/ant/jvm/stdlibForJavacWithNoKotlin/");
        doTest(fileName);
    }

    @TestMetadata("suppressWarnings")
    public void testSuppressWarnings() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/integration/ant/jvm/suppressWarnings/");
        doTest(fileName);
    }

    @TestMetadata("verbose")
    public void testVerbose() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/integration/ant/jvm/verbose/");
        doTest(fileName);
    }

    @TestMetadata("version")
    public void testVersion() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/integration/ant/jvm/version/");
        doTest(fileName);
    }

    @TestMetadata("withKotlinNoJavaSources")
    public void testWithKotlinNoJavaSources() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/integration/ant/jvm/withKotlinNoJavaSources/");
        doTest(fileName);
    }
}
