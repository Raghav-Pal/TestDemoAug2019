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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.booking.com/')

WebUI.click(findTestObject('Object Repository/Page_Bookingcom 28943987 hotel and property listings worldwide 192 million hotel reviews/div_Get a more personalized'))

WebUI.click(findTestObject('Object Repository/Page_Bookingcom 28943987 hotel and property listings worldwide 192 million hotel reviews/span_Tours  Activities'))

WebUI.click(findTestObject('Object Repository/Page_Tons of tours activities and things to do  Bookingcom/img_Top destinations_css-14g05zg'))

WebUI.click(findTestObject('Object Repository/Page_The 72 Best Things to Do in Paris  Bookingcom/div_View all must-sees'))

WebUI.closeBrowser()

