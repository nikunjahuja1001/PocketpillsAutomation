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

WebUI.click(findTestObject('Object Repository/Search medicine/Page_Online Pharmacy Canada Prescription De_e7c16e/input_Transparent prices. Amazingly inexpen_de1a5f'))

WebUI.setText(findTestObject('Object Repository/Search medicine/Page_Online Pharmacy Canada Prescription De_e7c16e/input_arrow_back_modal-search__input font-s_e589d0'), 
    'asp')

WebUI.click(findTestObject('Object Repository/Search medicine/Page_Online Pharmacy Canada Prescription De_e7c16e/li_ASPIRIN EC 81MG'))

WebUI.click(findTestObject('Object Repository/Search medicine/Page_Online Pharmacy Canada Prescription De_e7c16e/i_expand_more'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Search medicine/Page_Online Pharmacy Canada Prescription De_e7c16e/select_050556065707580859095100'), 
    '90', true)

WebUI.click(findTestObject('Object Repository/Search medicine/Page_Online Pharmacy Canada Prescription De_e7c16e/label_My insurance covers dispensing fee'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Search medicine/Page_Online Pharmacy Canada Prescription De_e7c16e/select_050556065707580859095100'), 
    '100', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Search medicine/Page_Online Pharmacy Canada Prescription De_e7c16e/select_050556065707580859095100'), 
    '70', true)

WebUI.setText(findTestObject('Object Repository/Search medicine/Page_Online Pharmacy Canada Prescription De_e7c16e/input_arrow_back_modal-search__input font-s_e589d0'), 
    'in')

WebUI.click(findTestObject('Object Repository/Search medicine/Page_Online Pharmacy Canada Prescription De_e7c16e/li_ATROPINE INJ 0.4MGML'))

WebUI.setText(findTestObject('Object Repository/Search medicine/Page_Online Pharmacy Canada Prescription De_e7c16e/input_BOX(ES)_med-form-input med-quantity n_085fb1'), 
    '2')

WebUI.click(findTestObject('Object Repository/Search medicine/Page_Online Pharmacy Canada Prescription De_e7c16e/label_My insurance covers dispensing fee'))

WebUI.closeBrowser()

