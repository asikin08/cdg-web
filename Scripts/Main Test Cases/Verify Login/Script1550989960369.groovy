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

WebUI.verifyAllLinksOnCurrentPageAccessible(true, [])

WebUI.waitForElementVisible(findTestObject('Home and login page/img'), 6)

WebUI.waitForElementVisible(findTestObject('Home and login page/Ver_Loginpage'), 6)

WebUI.waitForElementVisible(findTestObject('Home and login page/Input_Email'), 6)

WebUI.waitForElementVisible(findTestObject('Home and login page/Input_Password'), 6)

WebUI.waitForElementVisible(findTestObject('Home and login page/Signin_Text_Verify'), 6)

WebUI.waitForElementVisible(findTestObject('Home and login page/Register_Text'), 6)

WebUI.waitForElementVisible(findTestObject('Home and login page/Forgot_Password_Text'), 6)

WebUI.waitForElementVisible(findTestObject('Home and login page/button_Login'), 6)