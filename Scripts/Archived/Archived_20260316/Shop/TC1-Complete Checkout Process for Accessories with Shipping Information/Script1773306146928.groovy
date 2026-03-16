import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Shop.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1440, 719)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("")

"Step 2: Click on link accessories -> Navigate to page '/category/accessories'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/Shop/Page_home/link_accessories'))

"Step 3: Click on button addToCart"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/Shop/Page_category_accessories/button_addToCart'))

"Step 4: Click on link placeOrder -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/Shop/Page_category_accessories/link_placeOrder'))

"Step 5: Click on button proceedToCheckout -> Navigate to page '/checkout/info'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/Shop/Page_cart/button_proceedToCheckout'))

"Step 6: Click on input email"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/Shop/Page_checkout_info/input_email'))

"Step 7: Enter input value in input email"

WebUI.setText(findTestObject('Archived/Archived_20260316/Shop/Page_checkout_info/input_email'), input_email)

"Step 8: Click on button continueToShipping -> Navigate to page '/checkout/shipping-address'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/Shop/Page_checkout_info/button_continueToShipping'))

"Step 9: Click on input firstName"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/Shop/Page_checkout_shipping_address/input_firstName'))

"Step 10: Enter input value in input firstName"

WebUI.setText(findTestObject('Archived/Archived_20260316/Shop/Page_checkout_shipping_address/input_firstName'), input_firstName)

"Step 11: Click on input lastName"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/Shop/Page_checkout_shipping_address/input_lastName'))

"Step 12: Enter input value in input lastName"

WebUI.setText(findTestObject('Archived/Archived_20260316/Shop/Page_checkout_shipping_address/input_lastName'), input_lastName)

"Step 13: Click on input address"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/Shop/Page_checkout_shipping_address/input_address'))

"Step 14: Enter input value in input address"

WebUI.setText(findTestObject('Archived/Archived_20260316/Shop/Page_checkout_shipping_address/input_address'), input_address)

"Step 15: Click on input zipCode"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/Shop/Page_checkout_shipping_address/input_zipCode'))

"Step 16: Enter input value in input zipCode"

WebUI.setText(findTestObject('Archived/Archived_20260316/Shop/Page_checkout_shipping_address/input_zipCode'), input_zipCode)

"Step 17: Click on input city"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/Shop/Page_checkout_shipping_address/input_city'))

"Step 18: Click on input city"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/Shop/Page_checkout_shipping_address/input_city'))

"Step 19: Enter input value in input city"

WebUI.setText(findTestObject('Archived/Archived_20260316/Shop/Page_checkout_shipping_address/input_city'), input_city)

"Step 20: Click on input state"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/Shop/Page_checkout_shipping_address/input_state'))

"Step 21: Enter input value in input state"

WebUI.setText(findTestObject('Archived/Archived_20260316/Shop/Page_checkout_shipping_address/input_state'), input_state)

"Step 22: Click on input phone"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/Shop/Page_checkout_shipping_address/input_phone'))

"Step 23: Enter input value in input phone"

WebUI.setText(findTestObject('Archived/Archived_20260316/Shop/Page_checkout_shipping_address/input_phone'), input_phone)

"Step 24: Click on button continueToPayment -> Navigate to page '/checkout/payment'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/Shop/Page_checkout_shipping_address/button_continueToPayment'))

"Step 25: Click on button completeOrder -> Navigate to page '/thank-you/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/Shop/Page_checkout_payment/button_completeOrder'))

"Step 26: Click on link kCellphoneShop -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/Shop/Page_thank_you/link_kCellphoneShop'))

"Step 27: Click on button addToCart"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/Shop/Page_home/button_addToCart'))

"Step 28: Click on button close -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/Shop/Page_home/button_close'))

"Step 29: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Checkout Process for Accessories with Shipping Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}