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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement as Keys

WebUI.openBrowser("")

WebUI.maximizeWindow()

WebUI.navigateToUrl("https://phptravels.com/")

WebUI.switchToFrame(findTestObject('Object Repository/Page_PHP Travels/iframe_Hubspot_Conversations'), 5000)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_PHP Travels/button_ChatSupport'), 2000)
WebUI.click(findTestObject('Object Repository/Page_PHP Travels/button_ChatSupport'))

WebUI.setText(findTestObject('Object Repository/Page_PHP Travels/input_MessageBox'), "message 1")
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_PHP Travels/button_SendMessage'), 2000)
WebUI.click(findTestObject('Object Repository/Page_PHP Travels/button_SendMessage'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_PHP Travels/div_TextMessage'), "message 1")

WebUI.closeBrowser()