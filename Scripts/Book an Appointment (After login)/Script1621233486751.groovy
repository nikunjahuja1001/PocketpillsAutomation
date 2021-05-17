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

WebUI.navigateToUrl('https://pp:pocketpills@c11.app.pocketpills.com/')

WebUI.setText(findTestObject('Object Repository/Book appointment after login/Page_Online Pharmacy Canada Prescription De_e7c16e/input__home-input full-width ng-untouched n_e712d6'), 
    '8800766066')

WebUI.click(findTestObject('Object Repository/Book appointment after login/Page_Online Pharmacy Canada Prescription De_e7c16e/span_PROCEED SECURELY'))

WebUI.setEncryptedText(findTestObject('Object Repository/Book appointment after login/Page_Online Pharmacy Canada Prescription De_e7c16e/input_Password_password'), 
    'GYDmRgS5yd5PL6pQTxDpCg==')

WebUI.click(findTestObject('Object Repository/Book appointment after login/Page_Online Pharmacy Canada Prescription De_e7c16e/span_Login securely'))

WebUI.click(findTestObject('Object Repository/Book appointment after login/Page_Online Pharmacy Canada Prescription De_e7c16e/div_See a doctor for freeGet a prescription online'))

WebUI.click(findTestObject('Object Repository/Book appointment after login/Page_Online Pharmacy Canada Prescription De_e7c16e/h2_Thu, May 20'))

WebUI.click(findTestObject('Object Repository/Book appointment after login/Page_Online Pharmacy Canada Prescription De_e7c16e/div_CONFIRM'))

WebUI.setText(findTestObject('Object Repository/Book appointment after login/Page_Online Pharmacy Canada Prescription De_e7c16e/input_chat_medicalConditionsSearch'), 
    'Hai')

WebUI.click(findTestObject('Object Repository/Book appointment after login/Page_Online Pharmacy Canada Prescription De_e7c16e/h3_Hair loss'))

WebUI.setText(findTestObject('Object Repository/Book appointment after login/Page_Online Pharmacy Canada Prescription De_e7c16e/textarea_Share a note with your doctor (Opt_4ff2cb'), 
    'Hair fall')

WebUI.click(findTestObject('Object Repository/Book appointment after login/Page_Online Pharmacy Canada Prescription De_e7c16e/button_Continue'))

WebUI.click(findTestObject('Object Repository/Book appointment after login/Page_Online Pharmacy Canada Prescription De_e7c16e/div_Ok, got it'))

