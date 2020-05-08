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

// Ejecutar la aplicacion
Mobile.comment('Ejecutando Rappi')

Mobile.startApplication('/Users/lucasvacis/Documents/Devices/APKs/app-prod-debug (2).apk', true)

WebUI.comment('La app se ejecuto correctamente')

// Abrir menu lateral
Mobile.comment('Tap icono perfil')

Mobile.tap(findTestObject('android.widget.ImageView0 (4)'), 0)

// Abrir menu datos personales
Mobile.comment('Tap datos de perfil')

Mobile.tap(findTestObject('android.view.ViewGroup0'), 0)

// Agregar nombre de usuario con caracteres especiales
Mobile.comment('Introducir nombre de usuario con caracteres especiales')

Mobile.setText(findTestObject('android.widget.EditText0 - Net'), 'Usuario!"·$', 0)

// Tap boton Guardar
Mobile.comment('Tap "Guardar"')

Mobile.tap(findTestObject('android.view.ViewGroup0 (1)'), 0)

// Volver a menu lateral
Mobile.pressBack()

WebUI.comment('Verificacion nombre de usuario modificado en Menu lateral')

// Validaciones
// Validar cambio de nombre en Menu lateral
def actualUserName = Mobile.getText(findTestObject('android.widget.TextView0 - Usuario'), 0)

Mobile.verifyEqual(actualUserName, 'Usuario!"·$')

// Volver a inicio
Mobile.pressBack()

WebUI.comment('Verificacion nombre de usuario modificado en Inicio')

def actualUserNameHome = Mobile.getText(findTestObject('android.widget.TextView0 - Usuario'), 0)

// Validar cambio de nombre en Inicio
Mobile.verifyEqual(actualUserNameHome, 'Usuario!"·$')

// Cerrar aplicacion
Mobile.closeApplication()

