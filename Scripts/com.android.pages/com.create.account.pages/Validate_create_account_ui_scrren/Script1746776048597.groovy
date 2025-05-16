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

WebUI.callTestCase(findTestCase('com.android.pages/com.create.account.pages/Validate_Account_Info_popup'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.create.account.pages/User_is_navigated_to_create_an_account_UI'), 
    [:], FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/create_account_object_repository/android.widget.EditText - Email'),0)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/create_account_object_repository/android.widget.EditText - password'),0)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/create_account_object_repository/android.widget.EditText - confirm password'),0)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/create_account_object_repository/android.widget.EditText - phone number'),0)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/create_account_object_repository/android.widget.EditText - zopcode'),0)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/create_account_object_repository/android.widget.CheckBox'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/create_account_object_repository/android.widget.TextView - Submit'),0)

