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

WebUI.callTestCase(findTestCase('com.android.pages/com.create.account.pages/Enter_Password_confirm_password'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.create.account.pages/Enter_Phone_Number'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.create.account.pages/Enter_zipcode'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.create.account.pages/Click_on_I_agree_checkbox'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.create.account.pages/Click_on_Submit_Button'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Android/User_profile_object_repository/android.widget.TextView - Email cannot be empty'), 
    'Email cannot be empty.')

Mobile.clearText(findTestObject('Object Repository/Android/User_profile_object_repository/android.widget.EditText - yogitajmaildrop.cc'), 
    0, FailureHandling.STOP_ON_FAILURE)

space = CustomKeywords.'kw_random.EmailUtils.generateEmailByCondition'('space in email')

Mobile.setText(findTestObject('Object Repository/Android/User_profile_object_repository/android.widget.EditText - yogitajmaildrop.cc'), 
    space, 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android/User_profile_object_repository/android.widget.TextView - Please enter a valid email'), 
    'Please enter a valid email')

missing_tld = CustomKeywords.'kw_random.EmailUtils.generateEmailByCondition'('missing tld')

Mobile.setText(findTestObject('Object Repository/Android/User_profile_object_repository/android.widget.EditText - yogitajmaildrop.cc'), 
    missing_tld, 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android/User_profile_object_repository/android.widget.TextView - Please enter a valid email'), 
    'Please enter a valid email')

missing = CustomKeywords.'kw_random.EmailUtils.generateEmailByCondition'('missing @')

Mobile.setText(findTestObject('Object Repository/Android/User_profile_object_repository/android.widget.EditText - yogitajmaildrop.cc'), 
    missing, 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android/User_profile_object_repository/android.widget.TextView - Please enter a valid email'), 
    'Please enter a valid email')

double_splch = CustomKeywords.'kw_random.EmailUtils.generateEmailByCondition'('double @')

Mobile.setText(findTestObject('Object Repository/Android/User_profile_object_repository/android.widget.EditText - yogitajmaildrop.cc'), 
    double_splch, 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android/User_profile_object_repository/android.widget.TextView - Please enter a valid email'), 
    'Please enter a valid email')

Mobile.hideKeyboard()

WebUI.callTestCase(findTestCase('com.android.pages/com.create.account.pages/Enter_Email'), [:], FailureHandling.STOP_ON_FAILURE)

