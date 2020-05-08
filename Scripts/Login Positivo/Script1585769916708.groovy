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

Mobile.startApplication('/Users/lucasvacis/Documents/Devices/APKs/app-prod-debug (2).apk', true)

Mobile.tap(findTestObject('android.widget.ImageView0 (5)'), 0)

Mobile.tap(findTestObject('android.widget.TextView0 - With phone number (3)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView0 (6)'), 0)

Mobile.scrollToText('Argentina')

Mobile.tap(findTestObject('android.widget.TextView0 - Argentina'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Enter your number (1)'), findTestData('Test Positivo Data').getValue("Phone", 1), 0)

Mobile.tap(findTestObject('android.widget.TextView0 - Get an SMS code (1)'), 0)

Mobile.closeApplication()

