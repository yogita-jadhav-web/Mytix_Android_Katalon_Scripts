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

WebUI.callTestCase(findTestCase('com.android.pages/com.Onboarding.pages/Start_Application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.Onboarding.pages/Click_on_Getting_started_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.Enable.Location.pages/Click_On_No_Thanks'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.Enable.Location.pages/Click_On_No_Thanks'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.set.your.prefence.ui.pages/Click_on_Train_checkbox'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.set.your.prefence.ui.pages/Click_on_Submit_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.you.are.all.set.pages/Click_on_Continue_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.Home.pages/Click_on_create_an_account_link'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.create.account.pages/Validate_Account_Info_popup'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.create.account.pages/Enter_Email'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'kw_random.PasswordHelper.getPasswordPair'(1)

WebUI.callTestCase(findTestCase('com.android.pages/com.create.account.pages/Enter_Phone_Number'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.create.account.pages/Enter_zipcode'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.create.account.pages/Click_on_I_agree_checkbox'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.create.account.pages/Click_on_Submit_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.create.account.pages/Click_on_Yes'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.create.account.pages/Verify_Create_account_Screen_popup'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('1.com.db/Enter_otp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.create.account.pages/verify_Account Created Successfully'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.you.are.all.set.pages/Click_on_Continue_Button'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('Android/create_account_object_repository/android.view.View - Close'), 0)

WebUI.callTestCase(findTestCase('com.android.pages/com.Home.pages/Click_on_Sign_In_Link'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.forgot.password.pages/Click_on_Forgot_your_password_link'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.forgot.password.pages/Enter_Email_In_Forgot_Password_Screen'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.forgot.password.pages/Click_on_continue_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.user.profile.pages/update_email'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.user.profile.pages/Click_Update_my_profile_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.user.profile.pages/Verify_User Profile Updated SuccessFully'), [:], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Android/User_profile_object_repository/android.widget.Button'), 0)

WebUI.callTestCase(findTestCase('com.android.pages/com.Home.pages/Click_On_Menu_Icon'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.sign.out.pages/Signout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.android.pages/com.Home.pages/Click_on_Sign_In_Link'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'kw_random.PasswordHelper.enterPasswordOnly'(1)

not_run: WebUI.callTestCase(findTestCase('com.android.pages/com.sign.in.pages/Click_on_Sign_In'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.closeApplication()

