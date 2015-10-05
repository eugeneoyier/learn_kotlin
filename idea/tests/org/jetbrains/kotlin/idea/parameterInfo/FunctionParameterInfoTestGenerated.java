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

package org.jetbrains.kotlin.idea.parameterInfo;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.JetTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/parameterInfo/functionParameterInfo")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FunctionParameterInfoTestGenerated extends AbstractFunctionParameterInfoTest {
    public void testAllFilesPresentInFunctionParameterInfo() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/parameterInfo/functionParameterInfo"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("Deprecated.kt")
    public void testDeprecated() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/Deprecated.kt");
        doTest(fileName);
    }

    @TestMetadata("ExtensionOnClassObject.kt")
    public void testExtensionOnClassObject() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/ExtensionOnClassObject.kt");
        doTest(fileName);
    }

    @TestMetadata("FunctionalValue1.kt")
    public void testFunctionalValue1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/FunctionalValue1.kt");
        doTest(fileName);
    }

    @TestMetadata("FunctionalValue2.kt")
    public void testFunctionalValue2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/FunctionalValue2.kt");
        doTest(fileName);
    }

    @TestMetadata("InheritedFunctions.kt")
    public void testInheritedFunctions() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/InheritedFunctions.kt");
        doTest(fileName);
    }

    @TestMetadata("InheritedWithCurrentFunctions.kt")
    public void testInheritedWithCurrentFunctions() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/InheritedWithCurrentFunctions.kt");
        doTest(fileName);
    }

    @TestMetadata("Invoke.kt")
    public void testInvoke() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/Invoke.kt");
        doTest(fileName);
    }

    @TestMetadata("NamedAndDefaultParameter.kt")
    public void testNamedAndDefaultParameter() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/NamedAndDefaultParameter.kt");
        doTest(fileName);
    }

    @TestMetadata("NamedParameter.kt")
    public void testNamedParameter() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/NamedParameter.kt");
        doTest(fileName);
    }

    @TestMetadata("NamedParameter2.kt")
    public void testNamedParameter2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/NamedParameter2.kt");
        doTest(fileName);
    }

    @TestMetadata("NoAnnotations.kt")
    public void testNoAnnotations() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/NoAnnotations.kt");
        doTest(fileName);
    }

    @TestMetadata("NotAccessible.kt")
    public void testNotAccessible() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/NotAccessible.kt");
        doTest(fileName);
    }

    @TestMetadata("NotGreen.kt")
    public void testNotGreen() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/NotGreen.kt");
        doTest(fileName);
    }

    @TestMetadata("NullableTypeCall.kt")
    public void testNullableTypeCall() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/NullableTypeCall.kt");
        doTest(fileName);
    }

    @TestMetadata("Println.kt")
    public void testPrintln() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/Println.kt");
        doTest(fileName);
    }

    @TestMetadata("Simple.kt")
    public void testSimple() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/Simple.kt");
        doTest(fileName);
    }

    @TestMetadata("SimpleConstructor.kt")
    public void testSimpleConstructor() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/SimpleConstructor.kt");
        doTest(fileName);
    }

    @TestMetadata("SubstituteExpectedType.kt")
    public void testSubstituteExpectedType() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/SubstituteExpectedType.kt");
        doTest(fileName);
    }

    @TestMetadata("SubstituteExplicitTypeArgs.kt")
    public void testSubstituteExplicitTypeArgs() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/SubstituteExplicitTypeArgs.kt");
        doTest(fileName);
    }

    @TestMetadata("SubstituteFromParameters1.kt")
    public void testSubstituteFromParameters1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/SubstituteFromParameters1.kt");
        doTest(fileName);
    }

    @TestMetadata("SubstituteFromParameters2.kt")
    public void testSubstituteFromParameters2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/SubstituteFromParameters2.kt");
        doTest(fileName);
    }

    @TestMetadata("SubstituteFromParameters3.kt")
    public void testSubstituteFromParameters3() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/SubstituteFromParameters3.kt");
        doTest(fileName);
    }

    @TestMetadata("SubstituteFromParameters4.kt")
    public void testSubstituteFromParameters4() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/SubstituteFromParameters4.kt");
        doTest(fileName);
    }

    @TestMetadata("SuperConstructorCall.kt")
    public void testSuperConstructorCall() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/SuperConstructorCall.kt");
        doTest(fileName);
    }

    @TestMetadata("TwoFunctions.kt")
    public void testTwoFunctions() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/TwoFunctions.kt");
        doTest(fileName);
    }

    @TestMetadata("TwoFunctionsGrey.kt")
    public void testTwoFunctionsGrey() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/parameterInfo/functionParameterInfo/TwoFunctionsGrey.kt");
        doTest(fileName);
    }
}
