package kw_random

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testdata.TestDataFactory
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys

public class PasswordHelper  {

	@Keyword
	static  def getPasswordPair(int rowNum) {
		def testData = TestDataFactory.findTestData('Data Files/Excel_Files/PasswordsData')  // Adjust path if needed

		String password = testData.getValue('Password', rowNum)
		String confirmPassword = testData.getValue('Confirm Password', rowNum)

		GlobalVariable.Password = password
		GlobalVariable.confirmPassword = confirmPassword
		println('password :'+password)
		println('confirmPassword :'+confirmPassword)

		Mobile.setText(findTestObject('Object Repository/Android/create_account_object_repository/android.widget.EditText - password'),
				password, 0)

		Mobile.setText(findTestObject('Object Repository/Android/create_account_object_repository/android.widget.EditText - confirm password'),
				confirmPassword, 0)
		Mobile.hideKeyboard()
	}

	@Keyword
	static  def get_New_Confirm_PasswordPair(int rowNum) {
		def testData = TestDataFactory.findTestData('Data Files/Excel_Files/PasswordsData')  // Adjust path if needed

		String password = testData.getValue('Password', rowNum)
		String confirmPassword = testData.getValue('Confirm Password', rowNum)

		GlobalVariable.Password = password
		GlobalVariable.confirmPassword = confirmPassword
		println('password :'+password)
		println('confirmPassword :'+confirmPassword)

		Mobile.tap(findTestObject('Object Repository/Android/change_password_object_repository/android.widget.EditText - New password'), 0)

		Mobile.setText(findTestObject('Object Repository/Android/change_password_object_repository/android.widget.EditText - New password'),
				password, 0)

		Mobile.hideKeyboard()

		Mobile.tap(findTestObject('Object Repository/Android/change_password_object_repository/android.widget.EditText - confirm password'), 0)
		Mobile.setText(findTestObject('Object Repository/Android/change_password_object_repository/android.widget.EditText - confirm password'),
				confirmPassword, 0)
		Mobile.hideKeyboard()
	}
	@Keyword
	static def enterPasswordOnly(int rowNum) {
		def testData = TestDataFactory.findTestData('Data Files/Excel_Files/PasswordsData')  // Adjust path if needed

		String password = testData.getValue('Password', rowNum)
		GlobalVariable.Password = password

		println('password :' + password)

		//		Mobile.setText(findTestObject('Object Repository/Android/create_account_object_repository/android.widget.EditText - password'),
		//				password, 0)

		Mobile.setText(findTestObject('Object Repository/Android/Sign_In_object_repository/android.widget.EditText - Password'),
				password, 0)

		Mobile.hideKeyboard()
	}
	@Keyword
	static def CreateAcc_enterPasswordOnly(int rowNum) {
		def testData = TestDataFactory.findTestData('Data Files/Excel_Files/PasswordsData')  // Adjust path if needed

		String password = testData.getValue('Password', rowNum)
		GlobalVariable.Password = password

		println('password :' + password)

		Mobile.setText(findTestObject('Object Repository/Android/create_account_object_repository/android.widget.EditText - password'),
				password, 0)

	
		Mobile.hideKeyboard()
	}
}
