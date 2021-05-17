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

WebUI.navigateToUrl('https://pp:pocketpills@c9.app.pocketpills.com/')

WebUI.setText(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/input__home-input full-width ng-untouched n_e712d6'), 
    '1999115991')

WebUI.click(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/span_PROCEED SECURELY'))

WebUI.setText(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/input_First Name_firstName'), 
    'Nikunj')

WebUI.setText(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/input_Last Name_lastName'), 
    'Ahuja')

WebUI.setText(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/input_You should be 19 years or above to pr_860508'), 
    '12')

WebUI.setText(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/input_MM_date'), '12')

WebUI.setText(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/input_DD_year'), '1992')

WebUI.click(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/input_For the best experience, please switc_31738d'), 
    'la')

WebUI.click(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/small_Select'))

WebUI.click(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/button_Transfer'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/select_Select a ProvinceAlbertaBritish Colu_1e1e5d'), 
    'BRITISH_COLUMBIA', true)

WebUI.click(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/input_Gender_gender'))

WebUI.setText(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/input_E-mail Address_email'), 
    'test20@test.com')

WebUI.click(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/input_Verification Code_otp-field'), 
    '5689')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/input_Choose a password_password'), 
    'GYDmRgS5yd5PL6pQTxDpCg==')

WebUI.click(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/div_Complete your profile'))

WebUI.uploadFile(findTestObject('Add Health card/Add Health Card(front)'), '/Users/nikunjahuja/Desktop/Screenshot.png')

WebUI.click(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/div_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/div_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/input_Name_nickname'), 
    'Home')

WebUI.setText(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/input_Street Address_street'), 
    '123')

WebUI.click(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/p_123-160 Tycos Dr'))

WebUI.click(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/button_Add Address'))

WebUI.setText(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/input_Card Number_cardnumber'), 
    '4924190000003750')

WebUI.setText(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/input_Expiry(MMYY)_exp-date'), 
    '1224')

WebUI.setText(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/input_CVC_cvc'), '011')

WebUI.click(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/button_Add a new card'))

WebUI.setText(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/input_Enter any over the counter supplement_166ee3'), 
    'Vitamin A')

WebUI.setText(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/input_Vitamin A_ng2-tag-input__text-input n_48ccb3'), 
    ' ')

WebUI.click(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/div_Finish'))

WebUI.click(findTestObject('Object Repository/Page_Online Pharmacy Canada Prescription De_e7c16e/div_Go To Home'))

WebUI.closeBrowser()

