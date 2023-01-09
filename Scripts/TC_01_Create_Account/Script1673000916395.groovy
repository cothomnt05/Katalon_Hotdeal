import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.hotdeal.vn/')

WebUI.selectOptionByValue(findTestObject('Object Repository/HomePage/ddl_Location'), 
    '440', true)

WebUI.click(findTestObject('Object Repository/HomePage/btn_Location'))

WebUI.click(findTestObject('Object Repository/HomePage/a_SignIn'))

WebUI.click(findTestObject('Object Repository/HomePage/a_SignUp'))

WebUI.setText(findTestObject('Object Repository/SignUpPage/txt_Email'), 'cothomnt23456@gmail.com')

String js = "document.getElementById('birthday').setAttribute('value','21/05/1995')"

WebUI.executeJavaScript(js,null)

WebUI.verifyElementClickable(findTestObject('SignUpPage/btn_Submit'))

WebUI.closeBrowser()

