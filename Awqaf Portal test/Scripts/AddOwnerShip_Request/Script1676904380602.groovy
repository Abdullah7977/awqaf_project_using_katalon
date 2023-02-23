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

WebUI.click(findTestObject('Object Repository/Page_Home Page -/span_'))

WebUI.click(findTestObject('Object Repository/Page_Home Page -/login'))

WebUI.setText(findTestObject('Object Repository/Page_Home Page -/input__Email'), 'abdo.ahmed@user.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Home Page -/input__Password'), '4tSorGxj56FjvgIBd2Cb1w==')

WebUI.click(findTestObject('Object Repository/Page_Home Page -/input__button button-block_1'))

WebUI.click(findTestObject('Object Repository/Page_Home Page -/electronic service'))

WebUI.click(findTestObject('Object Repository/Page_Home Page -/a_'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_-/select_'), 'القليوبية', true)

WebUI.setText(findTestObject('Object Repository/Page_-/input__AdvNo'), advNo)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_-/select__1'), 'الإسماعيلية', true)

WebUI.setText(findTestObject('Object Repository/Page_-/input__Markaz'), markaz)

WebUI.setText(findTestObject('Object Repository/Page_-/input__Address'), address)

WebUI.setText(findTestObject('Object Repository/Page_-/input__job'), job)

WebUI.setText(findTestObject('Object Repository/Page_-/input__NationalIdSource'), nationalidSource)

WebUI.setText(findTestObject('Object Repository/Page_-/input__RakamMahal'), rakamMahal)

WebUI.setText(findTestObject('Object Repository/Page_-/input__MahalBuildingNo'), buildNo)

WebUI.setText(findTestObject('Object Repository/Page_-/input__MahalStreet'), mahalstreet)

WebUI.setText(findTestObject('Object Repository/Page_-/input__MahalMarkaz'), mahalMarkaz)

WebUI.setText(findTestObject('Object Repository/Page_-/input__StatusOfPayment'), statusOfPayment)

WebUI.setText(findTestObject('Object Repository/Page_-/textarea__Notes'), textArea)

