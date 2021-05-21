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

WebUI.setText(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/input_chevron_right_ng-untouched ng-valid ng-dirty'), 
    '1213213212')

WebUI.click(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/i_chevron_right'))

WebUI.setText(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/input_First Name_firstName'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/input_Last Name_lastName'), 
    'Name')

WebUI.setText(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/input_You should be 19 years or above to pr_860508'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/input_MM_date'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/input_DD_year'), 
    '1992')

WebUI.click(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/button_Next'))

WebUI.click(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/p_Shoppers Drug Mart'))

WebUI.click(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/p_King Street West, Toronto, ON, Canada'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/select_Select1 - 2 days3 - 4 days5 - 7 days 7 days'), 
    'ONE_TO_TWO_DAYS', true)

WebUI.click(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/input_Gender_gender'))

WebUI.setText(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/input_E-mail Address_email'), 
    'test00000@test.com')

WebUI.click(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/button_Next'))

WebUI.setText(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/input_Verification Code_otp-field'), 
    '5689')

WebUI.setEncryptedText(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/input_Choose a password_password'), 
    'GYDmRgS5yd5PL6pQTxDpCg==')

WebUI.click(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/button_Next'))

WebUI.click(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/div_Complete your profile'))

WebUI.click(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/i_home'))

WebUI.click(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/i_more_horiz'))

WebUI.click(findTestObject('Object Repository/Sign up pop-up/Page_Online Pharmacy Canada Prescription De_e7c16e/li_Logout'))

WebUI.closeBrowser()

