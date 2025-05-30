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

not_run: Mobile.verifyElementText(findTestObject('null'), 'Password must contain:\n8 to 20 characters\nOne UPPERCASE Letter\nOne lowercase letter\nOne number or numeric value\nOne symbol such as ~"!@#$%^&*()_+=|:<,>.?/{}-')

Mobile.verifyElementText(findTestObject('Object Repository/Android/change_password_object_repository/android.widget.TextView - Password must contain8 to 20 charactersOne UPPERCASE LetterOne lowercase letterOne number or numeric valueOne symbol such as ()_,.-'), 
    'Password must contain:\n8 to 20 characters\nOne UPPERCASE Letter\nOne lowercase letter\nOne number or numeric value\nOne symbol such as ~"!@#$%^&*()_+=|:<,>.?/{}-')

