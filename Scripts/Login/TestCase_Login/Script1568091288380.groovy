import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.comment('Customer Login with valid account')

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://testing.adeptforms.com/module/cdg/customer/session/login')

WebUI.callTestCase(findTestCase('Main Test Cases/Verify Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Onsmart App/Input Email Or Phone Number'), Input_Email)

WebUI.setText(findTestObject('Home and login page/Input_Password'), Input_Password)

WebUI.click(findTestObject('Home and login page/button_Login'))

WebUI.delay(8)

if (WebUI.verifyTextPresent('My Devices', false, FailureHandling.OPTIONAL)) {
	
    WebUI.callTestCase(findTestCase('Main Test Cases/Verify Successful Login'), [:], FailureHandling.STOP_ON_FAILURE)

} else {

    WebUI.callTestCase(findTestCase('Main Test Cases/Verify Failed Login'), [:], FailureHandling.STOP_ON_FAILURE)

}

WebUI.closeBrowser()

