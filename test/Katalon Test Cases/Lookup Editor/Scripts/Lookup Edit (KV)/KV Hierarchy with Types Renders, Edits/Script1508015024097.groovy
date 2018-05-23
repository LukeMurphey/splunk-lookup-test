import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Authenticate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://127.0.0.1:8000/en-US/app/lookup_editor/lookup_edit?owner=nobody&namespace=lookup_test&lookup=test_kv_store_hierarchy&type=kv')

WebUI.click(findTestObject('Editor/First Address.zip Cell'))

WebUI.doubleClick(findTestObject('Editor/First Address.zip Cell'))

WebUI.setText(findTestObject('Editor/Handsontable Cell Edit Input'), 'Test')

WebUI.click(findTestObject('Editor/Lookup Name Header'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Editor/Warning Message'), 0)

WebUI.verifyElementVisible(findTestObject('Editor/Warning Message'))

WebUI.verifyElementText(findTestObject('Editor/Warning Message'), 'Entry could not be saved to the KV store lookup; make sure the value matches the expected type')

WebUI.click(findTestObject('Editor/First Address.zip Cell'))

WebUI.doubleClick(findTestObject('Editor/First Address.zip Cell'))

WebUI.setText(findTestObject('Editor/Handsontable Cell Edit Input'), '60083')

WebUI.click(findTestObject('Editor/Lookup Name Header'))

WebUI.waitForElementVisible(findTestObject('Editor/Success Message'), 0)

WebUI.verifyElementNotVisible(findTestObject('Editor/Warning Message'))

WebUI.verifyTextPresent('Modified:', false)

WebUI.closeBrowser()

