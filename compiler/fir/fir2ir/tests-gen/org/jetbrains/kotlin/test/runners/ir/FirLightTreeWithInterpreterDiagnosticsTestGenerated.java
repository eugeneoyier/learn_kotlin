/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.test.runners.ir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.test.generators.GenerateCompilerTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/diagnostics/irInterpreter")
@TestDataPath("$PROJECT_ROOT")
public class FirLightTreeWithInterpreterDiagnosticsTestGenerated extends AbstractFirLightTreeWithInterpreterDiagnosticsTest {
  @Test
  public void testAllFilesPresentInIrInterpreter() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/irInterpreter"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
  }

  @Test
  @TestMetadata("exceptionFromInterpreter.kt")
  public void testExceptionFromInterpreter() {
    runTest("compiler/testData/diagnostics/irInterpreter/exceptionFromInterpreter.kt");
  }

  @Test
  @TestMetadata("recursionAccess.kt")
  public void testRecursionAccess() {
    runTest("compiler/testData/diagnostics/irInterpreter/recursionAccess.kt");
  }
}
