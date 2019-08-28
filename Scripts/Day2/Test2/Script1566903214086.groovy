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

CustomKeywords.'demo.hello'()

CustomKeywords.'demo.sayHello'('Raghav')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://analytics.katalon.com/login?redirect=%2Ffrom-ks%3FteamId%3D4106%26projectId%3D31703%26type%3DTEST_SUITE%26path%3DTest+Suites%252FDay2%252FTestSuite1%26token%3D973dae20-d9d9-4f5a-a258-ca19032a2b28')

WebUI.setText(findTestObject('Object Repository/Page_Katalon Analytics (Beta)/input_Sign up_username'), 'automadsftion.devops@gmailcom')

WebUI.closeBrowser()

CustomKeywords.'demo.hello'()

CustomKeywords.'demo.sayHello'('Raghav')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://analytics.katalon.com/login?redirect=%2Ffrom-ks%3FteamId%3D4106%26projectId%3D31703%26type%3DTEST_SUITE%26path%3DTest+Suites%252FDay2%252FTestSuite1%26token%3D973dae20-d9d9-4f5a-a258-ca19032a2b28')

WebUI.setText(findTestObject('Object Repository/Page_Katalon Analytics (Beta)/input_Sign up_username'), 'automadsftion.devops@gmailcom')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://analytics.katalon.com/login?redirect=%2Ffrom-ks%3FteamId%3D4106%26projectId%3D31703%26type%3DTEST_SUITE%26path%3DTest+Suites%252FDay2%252FTestSuite1%26token%3D973dae20-d9d9-4f5a-a258-ca19032a2b28')

WebUI.setText(findTestObject('Object Repository/Page_Katalon Analytics (Beta)/input_Sign up_username'), 'automadsftion.devopsasdf@gmailcom')

WebUI.closeBrowser()

