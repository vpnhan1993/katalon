import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as Keys
import org.testng.Assert

WebUI.openBrowser('https://phptravels.com/')

WebUI.maximizeWindow()

WebUI.switchToFrame(findTestObject('Object Repository/Page_PHP Travels/iframe_Hubspot_Conversations'), 5000)

WebUI.click(findTestObject('Object Repository/Page_PHP Travels/button_ChatSupport'))

WebUI.setText(findTestObject('Object Repository/Page_PHP Travels/input_MessageBox'), 'bla bla')

WebUI.click(findTestObject('Object Repository/Page_PHP Travels/button_SendMessage'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_PHP Travels/button_AttachFile'), 2000)
WebUI.click(findTestObject('Object Repository/Page_PHP Travels/button_AttachFile'))

CustomKeywords.'customkeywords.uploadFileKeyword.uploadFile'('C:\\Users\\jv\\Desktop\\test.txt')

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_PHP Travels/button_SendMessage'), 2000)
WebUI.click(findTestObject('Object Repository/Page_PHP Travels/button_SendMessage'))

String fileName = WebUI.getText(findTestObject('Page_PHP Travels/b_FileAttachment'))

Assert.assertTrue(fileName.contains('test'))

WebUI.closeBrowser()

