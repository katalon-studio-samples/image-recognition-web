import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow();

WebUI.navigateToUrl('http://cms.demo.katalon.com/')

WebUI.click(findTestObject('Object Repository/Page_Katalon Shop  Katalon Ecommerce/img_Sale_attachment-woocommerce_thumbnail s_432ea2'))

WebUI.click(findTestObject('Object Repository/Page_Flying Ninja  Katalon Shop/div_Flying Ninja quantity_quantity-button q_3aae56'))

WebUI.click(findTestObject('Object Repository/Page_Flying Ninja  Katalon Shop/button_Add to cart'))

if(!WebUI.verifyTextPresent("2 × “Flying Ninja” have been added to your cart.", false)) {
	KeywordUtil.markFailedAndStop("Text not present !");
}

WebUI.click(findTestObject('Object Repository/Page_Flying Ninja  Katalon Shop/a_Write a Review'))

if(!WebUI.verifyElementInViewport(findTestObject('Object Repository/Page_Flying Ninja  Katalon Shop/span_Be the first to review Flying Ninja Ca_c9a087'), 
    0)) {
	KeywordUtil.markFailedAndStop("Element not in the viewport !");
}

WebUI.setText(findTestObject('Object Repository/Page_Flying Ninja  Katalon Shop/textarea__comment'), 'Katalon is awesome')

WebUI.setText(findTestObject('Object Repository/Page_Flying Ninja  Katalon Shop/input__author'), 'katalon')

WebUI.setText(findTestObject('Object Repository/Page_Flying Ninja  Katalon Shop/input__email'), 'katalon')

WebUI.click(findTestObject('Object Repository/Page_Flying Ninja  Katalon Shop/a_1'))

WebUI.click(findTestObject('Object Repository/Page_Flying Ninja  Katalon Shop/input_Save my name email and website in thi_8b2654'))

WebUI.closeBrowser()

