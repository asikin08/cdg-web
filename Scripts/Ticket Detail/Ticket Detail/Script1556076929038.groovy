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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://testing.adeptforms.com/module/cdg/customer/main/product')

WebUI.setText(findTestObject('Home and login page/Input_Email'), Email)

WebUI.setText(findTestObject('Home and login page/Input_Password'), Password)

WebUI.click(findTestObject('Home and login page/button_Login'))

WebUI.delay(8)

WebUI.callTestCase(findTestCase('Main Test Cases/Verify Successful Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Home and login page/Copyright'), 8)

WebUI.click(findTestObject('Ticket/Ticket_Menu'))

WebDriver driver = DriverFactory.getWebDriver()

String Row = '.row.row-flex'

String Thumbnail = '.form-group.text-center'

WebElement Table = driver.findElement(By.cssSelector(Row))

List<WebElement> Rows = Table.findElements(By.cssSelector(Thumbnail))

println('No. of rows: ' + Rows.size())

for (int j = 0; j <= Rows.size(); j++) {
    if (Rows.size == 0) {
        WebUI.verifyTextPresent('No data available', true)

        println('No Data Availble')
    } else {
        WebUI.callTestCase(findTestCase('Main Test Cases/Verify Ticket Page'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.click(Thumbnail)
    }
}

WebUI.closeBrowser()

