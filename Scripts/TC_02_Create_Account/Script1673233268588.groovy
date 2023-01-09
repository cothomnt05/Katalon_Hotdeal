import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.hotdeal.vn/')

WebUI.selectOptionByValue(findTestObject('Object Repository/HomePage/ddl_Location'), '440', true)

WebUI.click(findTestObject('Object Repository/HomePage/btn_Location'))

WebUI.click(findTestObject('Object Repository/HomePage/a_SignIn'))

WebUI.click(findTestObject('Object Repository/HomePage/a_SignUp'))

WebUI.setText(findTestObject('Object Repository/SignUpPage/txt_Email'), 'cothomnt234567@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUpPage/txt_Password'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUpPage/txt_ConfirmPassword'), 'aeHFOx8jV/A=')

WebUI.setText(findTestObject('Object Repository/SignUpPage/txt_Phone'), '0987654321')

String js = "document.getElementById('birthday').setAttribute('value','21/05/1995')"

WebUI.executeJavaScript(js, null)

WebUI.click(findTestObject('SignUpPage/btn_Submit'))

WebUI.waitForElementVisible(findTestObject('Object Repository/HomePage/msg_Success'), 15)

WebUI.verifyElementText(findTestObject('Object Repository/HomePage/msg_Success'), 'Thành công !\nĐăng ký tài khoản thành công.')

WebUI.closeBrowser()

