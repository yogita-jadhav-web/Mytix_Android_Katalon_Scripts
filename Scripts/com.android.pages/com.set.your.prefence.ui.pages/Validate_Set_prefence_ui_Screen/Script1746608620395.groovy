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

Mobile.verifyElementExist(findTestObject('Object Repository/Android/set_preferance_ui_object_repository/android.view.View'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Android/set_preferance_ui_object_repository/android.widget.TextView - Set Your Preference'), 
    'Set Your Preference')

Mobile.verifyElementText(findTestObject('Object Repository/Android/set_preferance_ui_object_repository/android.widget.TextView - Select the transit modes that you want to view information about'), 
    'Select the transit modes that you want to view information about, the others we will hide. You can always change your mind and update later.')

Mobile.verifyElementExist(findTestObject('Object Repository/Android/set_preferance_ui_object_repository/android.widget.ImageView - Tran Icon'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Android/set_preferance_ui_object_repository/android.widget.TextView - Train'), 
    'Train')

Mobile.verifyElementExist(findTestObject('Object Repository/Android/set_preferance_ui_object_repository/android.widget.CheckBox - Train'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/set_preferance_ui_object_repository/android.widget.ImageView - Bus Icon'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Android/set_preferance_ui_object_repository/android.widget.TextView - Bus'), 
    'Bus')

Mobile.verifyElementExist(findTestObject('Object Repository/Android/set_preferance_ui_object_repository/android.widget.CheckBox - Bus'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/set_preferance_ui_object_repository/android.widget.ImageView Lightrail Icon'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Android/set_preferance_ui_object_repository/android.widget.TextView - Lightrail'), 
    'Lightrail')

Mobile.verifyElementExist(findTestObject('Object Repository/Android/set_preferance_ui_object_repository/android.widget.CheckBox - Lightrail'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/set_preferance_ui_object_repository/android.widget.TextView - Submit'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/set_preferance_ui_object_repository/android.widget.TextView - No, Thanks'), 
    0)

