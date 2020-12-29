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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

/*
 * Uruchomienie przeglądrki z adresem aplikacji DemoSauce
 */
WebUI.openBrowser(rawUrl = GlobalVariable.url)

WebUI.maximizeWindow()

/*
 * Wprowadznie loginu użytkownika
 */
WebUI.setText(findTestObject('Object Repository/login_page/inp_login'), login)

/*
 * Wprowadzenie hasła użytkownika
 */
WebUI.setText(findTestObject('Object Repository/login_page/inp_password'), password)

/*
 * Uruchomienie opcji Zaloguj do aplikacji
 */
WebUI.click(findTestObject('Object Repository/login_page/btn_login'))

/*
 * Otwarcie menu
 */
WebUI.click(findTestObject('Object Repository/menu_page/btn_menu'))

/*
 * Kliknięcie przycisku Logout
 */
WebUI.click(findTestObject('Object Repository/menu_page/inp_logout'))

/*
 * Zamykanie przeglądarki
 */
WebUI.closeBrowser()

