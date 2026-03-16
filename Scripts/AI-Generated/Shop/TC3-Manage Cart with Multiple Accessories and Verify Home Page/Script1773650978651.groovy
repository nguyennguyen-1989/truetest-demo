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

TrueTestScripts.navigate("/")

"Step 2: Click on button addToCart2"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_home/button_addToCart2'))

"Step 3: Click on label colorOption (black)"

// Bind values to the variables in the locators of "AI-Generated/Shop/Dynamic Objects/Page_home/label_colorOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Dynamic Objects/Page_home/label_colorOption', ['label_colorOption_LabelInternalText_1': label_colorOption_LabelInternalText_1, 'label_colorOption_css_value_1': label_colorOption_css_value_1]))

"Step 4: Click on button buy"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_home/button_buy'))

"Step 5: Click on link placeOrder -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_home/link_placeOrder'))

"Step 6: Click on link samsung25WpowerAdapter -> Navigate to page '/product/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_cart/link_samsung25WpowerAdapter'))

"Step 7: Click on link samsung -> Navigate to page '/category/accessories-samsung'"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_product/link_samsung'))

"Step 8: Click on link samsungGalaxyS23Ultra -> Navigate to page '/product/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_category_accessories_samsung/link_samsungGalaxyS23Ultra'))

"Step 9: Click on span shoppingCart -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_product/span_shoppingCart'))

"Step 10: Click on button remove"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_cart/button_remove'))

"Step 11: Click on link kCellphoneShop -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_cart/link_kCellphoneShop'))

"Step 12: Click on item about"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_home/item_about'))

"Step 13: Click on link about -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_home/link_about'))

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Manage Cart with Multiple Accessories and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}