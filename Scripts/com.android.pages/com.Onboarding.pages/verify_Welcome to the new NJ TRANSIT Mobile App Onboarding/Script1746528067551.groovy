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
import test.data.MessageValidator as MessageValidator

String actualMessage = Mobile.getText(findTestObject('Android/Onboarding_object_repository/android.widget.TextView - Welcome to the new NJ TRANSIT Mobile App Onboarding'), 
    0)

println('actualMessage: ' + actualMessage)

String expectedMessage = CustomKeywords.'test.data.MessageValidator.validateMessage'(1)//MessageValidator.validateMessage(1)

if (expectedMessage.equals(actualMessage)) {
    WebUI.comment('Message matched: ' + actualMessage)

    println('Message matched: ' + actualMessage)
} else {
    WebUI.comment((('Message did not match. Expected: ' + expectedMessage) + ', but found: ') + actualMessage)

    Mobile.verifyEqual(actualMessage, expectedMessage)

    
}

