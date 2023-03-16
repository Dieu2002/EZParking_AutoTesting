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

Mobile.startApplication('C:\\Users\\admin\\Downloads\\app-release (1).apk', true)

Mobile.setText(findTestObject('Object Repository/EZParking/android.widget.EditText - Email (21)'), 'yd16032302@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/EZParking/android.widget.EditText - Password (22)'), '12345678', 0)

Mobile.tap(findTestObject('Object Repository/EZParking/android.view.ViewGroup (28)'), 0)

Mobile.tap(findTestObject('Object Repository/EZParking/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Object Repository/EZParking/android.view.ViewGroup (29)'), 0)

Mobile.tap(findTestObject('Object Repository/EZParking/android.view.ViewGroup (30)'), 0)

Mobile.closeApplication()
