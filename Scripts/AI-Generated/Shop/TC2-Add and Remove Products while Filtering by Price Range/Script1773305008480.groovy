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

"Step 2: Click on item product"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_home/item_product'))

"Step 3: Click on button addToCart"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_home/button_addToCart'))

"Step 4: Click on button buy"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_home/button_buy'))

"Step 5: Click on label colorOption (pink)"

// Bind values to the variables in the locators of "AI-Generated/Shop/Dynamic Objects/Page_home/label_colorOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Dynamic Objects/Page_home/label_colorOption', ['label_colorOption_LabelInternalText_1': label_colorOption_LabelInternalText_1, 'label_colorOption_css_value_1': label_colorOption_css_value_1]))

"Step 6: Click on button buy2"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_home/button_buy2'))

"Step 7: Click on link placeOrder -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_home/link_placeOrder'))

"Step 8: Click on button remove"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_cart/button_remove'))

"Step 9: Click on link apple -> Navigate to page '/category/accessories-apple'"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_cart/link_apple'))

"Step 10: Click on input priceMin"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_category_accessories_apple/input_priceMin'))

"Step 11: Enter input value in input priceMin"

WebUI.setText(findTestObject('AI-Generated/Shop/Page_category_accessories_apple/input_priceMin'), input_priceMin)

"Step 12: Click on input priceMax"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_category_accessories_apple/input_priceMax'))

"Step 13: Enter input value in input priceMax"

WebUI.setText(findTestObject('AI-Generated/Shop/Page_category_accessories_apple/input_priceMax'), input_priceMax)

"Step 14: Click on button show"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_category_accessories_apple/button_show'))

"Step 15: Click on input priceMin"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_category_accessories_apple/input_priceMin'))

"Step 16: Enter input value in input priceMin"

WebUI.setText(findTestObject('AI-Generated/Shop/Page_category_accessories_apple/input_priceMin'), input_priceMin_1)

"Step 17: Click on div clearCalculating"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_category_accessories_apple/div_clearCalculating'))

"Step 18: Click on button clear"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_category_accessories_apple/button_clear'))

"Step 19: Click on input inStock"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_category_accessories_apple/input_inStock'))

"Step 20: Click on link kCellphoneShop -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_category_accessories_apple/link_kCellphoneShop'))

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Add and Remove Products while Filtering by Price Range_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}