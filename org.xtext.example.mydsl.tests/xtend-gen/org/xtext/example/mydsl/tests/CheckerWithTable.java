/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.mydsl.myDsl.DomainModel;
import org.xtext.example.mydsl.tests.MyDslInjectorProvider;
import sharedclasses.BaseTable;

@RunWith(XtextRunner.class)
@InjectWith(MyDslInjectorProvider.class)
@SuppressWarnings("all")
public class CheckerWithTable {
  @Inject
  @Extension
  private ParseHelper<DomainModel> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  public void foo(final BaseTable table) {
    System.out.println(table.getClass().toString());
  }
  
  @Test
  public void checkerWithTable() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package mypackage");
      _builder.newLine();
      _builder.newLine();
      _builder.append("checker SimpleCheckerWithCatalog {");
      _builder.newLine();
      _builder.append("   ");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("table simple_table");
      _builder.newLine();
      _builder.append("   ");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("check SimplePointCheck {");
      _builder.newLine();
      _builder.append("   \t");
      _builder.append("foo(simple_table)");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertNoIssues(this._parseHelper.parse(_builder));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
