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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://testing.adeptforms.com/module/cdg/customer/main/product')

WebUI.setText(findTestObject('Home and login page/Input_Email'), Email)

WebUI.setText(findTestObject('Home and login page/Input_Password'), Password)

WebUI.click(findTestObject('Home and login page/button_Login'))

WebUI.callTestCase(findTestCase('Main Test Cases/Verify Successful Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Home and login page/Addproduct_Text'))

WebUI.verifyElementVisible(findTestObject('Home and login page/Session_addproduct'))

WebUI.setText(findTestObject('Home and login page/Input_Sku'), '12131313jke2')

WebUI.setText(findTestObject('Home and login page/input_ProductName'), 'SAMSUNG')

WebUI.setText(findTestObject('Home and login page/Input_WarrantyCode'), '212kndk3j323')

WebUI.setText(findTestObject('Home and login page/Detail_Product'), 'SAMSUNG kskjdkwd dojwdw')

CustomKeywords.'add_product.Add_Product.uploadFile'(findTestObject('Home and login page/Upload File'), 'H:\\automata\\OPPO_R17_L_1.jpg')

//'Open browser and navigate to given URL'
//WebUI.openBrowser('C:\\\\Users\\\\kris\\\\Downloads\\\\Strategi-Pengiriman-Barang-Bagi-Anda-Penjual-di-Marketplace-Etsy.jpg')
//
//'Maximize the window\r\n'
//WebUI.maximizeWindow()
//
//'Uploading the File using Send Keys method by passing the File path'
//WebUI.sendKeys(findTestObject('Upload File'), 'C:\\\\Users\\\\Public\\\\Pictures\\\\Sample Pictures\\\\Desert.jpg')
//
//'Capturing the file name after upload and storing it in a variable'
//FilePath = WebUI.getAttribute(findTestObject('Upload File'), 'value')
//
//'Verifying the Actual path and Expected path of file'
//WebUI.verifyMatch(FilePath, 'C:\\fakepath\\Desert.jpg', false)
//WebUI.uploadFile(findTestObject('Home and login page/Input_Photo'), 'C:\\\\Users\\\\kris\\\\Downloads\\\\Strategi-Pengiriman-Barang-Bagi-Anda-Penjual-di-Marketplace-Etsy.jpg')
//upload.UploadFoto.class
//WebUI.doubleClick(findTestObject('Home and login page/Input_Photo'))
//dd()
//
//def dd(){
//	Runtime runTime = Runtime.getRuntime()
//	Process process = runTime.exec('C:\\\\Users\\\\kris\\\\Downloads\\\\Strategi-Pengiriman-Barang-Bagi-Anda-Penjual-di-Marketplace-Etsy.jpg')
//}
//WebUI.callTestCase(findTestCase('Main Test Cases/Upload File'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Home and login page/Add_Product_Save'))

WebUI.closeBrowser()

