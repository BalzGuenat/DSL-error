/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.mydsl.myDsl.DomainModel
import org.xtext.example.mydsl.tests.MyDslInjectorProvider
import sharedclasses.BaseTable

@RunWith(XtextRunner)
@InjectWith(MyDslInjectorProvider)
class CheckerWithTable {

	@Inject extension ParseHelper<DomainModel>
	@Inject extension ValidationTestHelper
	
	def void foo(BaseTable table) {
		System.out.println(table.class.toString)
	}

	@Test
	def void checkerWithTable() {
		'''
			package mypackage
			
			checker SimpleCheckerWithCatalog {
			   
			   table simple_table
			   
			   check SimplePointCheck {
			   	foo(simple_table)
			   }
			}
		'''.parse.assertNoIssues
	}
}
