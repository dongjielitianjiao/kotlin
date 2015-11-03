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

package org.jetbrains.kotlin.lang.resolve.android.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class AndroidBytecodeShapeTestGenerated extends AbstractAndroidBytecodeShapeTest {
    public void testAllFilesPresentInBytecodeShape() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-compiler-plugin/testData/codegen/bytecodeShape"), Pattern.compile("^([^\\.]+)$"), false);
    }

    @TestMetadata("baseClass")
    public void testBaseClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/baseClass/");
        doTest(fileName);
    }

    @TestMetadata("baseClassFragment")
    public void testBaseClassFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/baseClassFragment/");
        doTest(fileName);
    }

    @TestMetadata("clearCache")
    public void testClearCache() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/clearCache/");
        doTest(fileName);
    }

    @TestMetadata("clearCacheBaseClass")
    public void testClearCacheBaseClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/clearCacheBaseClass/");
        doTest(fileName);
    }

    @TestMetadata("extensionFunctions")
    public void testExtensionFunctions() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/extensionFunctions/");
        doTest(fileName);
    }

    @TestMetadata("extensionFunctionsFragment")
    public void testExtensionFunctionsFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/extensionFunctionsFragment/");
        doTest(fileName);
    }

    @TestMetadata("extensionFunctionsView")
    public void testExtensionFunctionsView() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/extensionFunctionsView/");
        doTest(fileName);
    }

    @TestMetadata("fqNameInAttr")
    public void testFqNameInAttr() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/fqNameInAttr/");
        doTest(fileName);
    }

    @TestMetadata("fqNameInAttrFragment")
    public void testFqNameInAttrFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/fqNameInAttrFragment/");
        doTest(fileName);
    }

    @TestMetadata("fqNameInTag")
    public void testFqNameInTag() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/fqNameInTag/");
        doTest(fileName);
    }

    @TestMetadata("fqNameInTagFragment")
    public void testFqNameInTagFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/fqNameInTagFragment/");
        doTest(fileName);
    }

    @TestMetadata("multiFile")
    public void testMultiFile() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/multiFile/");
        doTest(fileName);
    }

    @TestMetadata("multiFileFragment")
    public void testMultiFileFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/multiFileFragment/");
        doTest(fileName);
    }

    @TestMetadata("onDestroyFragment")
    public void testOnDestroyFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/onDestroyFragment/");
        doTest(fileName);
    }

    @TestMetadata("simple")
    public void testSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/simple/");
        doTest(fileName);
    }

    @TestMetadata("simpleFragment")
    public void testSimpleFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/simpleFragment/");
        doTest(fileName);
    }

    @TestMetadata("simpleFragmentProperty")
    public void testSimpleFragmentProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/simpleFragmentProperty/");
        doTest(fileName);
    }

    @TestMetadata("simpleView")
    public void testSimpleView() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/simpleView/");
        doTest(fileName);
    }

    @TestMetadata("supportExtensionFunctionsFragment")
    public void testSupportExtensionFunctionsFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/supportExtensionFunctionsFragment/");
        doTest(fileName);
    }

    @TestMetadata("supportSimpleFragment")
    public void testSupportSimpleFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/supportSimpleFragment/");
        doTest(fileName);
    }

    @TestMetadata("supportSimpleFragmentProperty")
    public void testSupportSimpleFragmentProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-compiler-plugin/testData/codegen/bytecodeShape/supportSimpleFragmentProperty/");
        doTest(fileName);
    }
}
