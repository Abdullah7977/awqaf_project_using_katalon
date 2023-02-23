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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://awkafegypt.gov.eg/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Home Page -/span_'))

WebUI.setText(findTestObject('Object Repository/Page_Home Page -/input__FirstName'), FirstName)

WebUI.setText(findTestObject('Object Repository/Page_Home Page -/input__LastName'), LastName)

WebUI.setText(findTestObject('Object Repository/Page_Home Page -/input__Email'), email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Home Page -/input__Password'), '4tSorGxj56HHATTBaLf8Qw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Home Page -/input__ConfirmPassword'), '4tSorGxj56HHATTBaLf8Qw==')

String captch=WebUI.getText(findTestObject('Object Repository/Page_-/Page_Home Page -/img_Captcha_CaptchaImage'))

System.out.println(captch)

WebUI.setText(findTestObject('Object Repository/Page_Home Page -/input__CaptchaInputText'), captch)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Page_Home Page -/a_'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_-/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_-/select_'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_-/select_'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_-/select_'), '1', true)

WebUI.click(findTestObject('Object Repository/Page_-/div_HR Manager                             _9a5bb1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_-/select__1'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_-/select_HR Manager                          _e5377d'), 
    '7', true)

WebUI.click(findTestObject('Object Repository/Page_-/div_HR Manager                             _9a5bb1_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_-/select_National Number ID                  _ca6831'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_-/input__PersonsIDNo'), '97040404144987')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_-/select_Degla Street                        _ab7975'), 
    '5', true)

WebUI.setText(findTestObject('Object Repository/Page_-/input__PersonsBuildingNo'), '100')

WebUI.setText(findTestObject('Object Repository/Page_-/input__PersonsFloorNo'), '3')

WebUI.setText(findTestObject('Object Repository/Page_-/input__PersonsApartNo'), '10')

WebUI.click(findTestObject('Object Repository/Page_-/input__Save'))

WebUI.click(findTestObject('Object Repository/Page_-/a_'))

WebUI.closeBrowser()

