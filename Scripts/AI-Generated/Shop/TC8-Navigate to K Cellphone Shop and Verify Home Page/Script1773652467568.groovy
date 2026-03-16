import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Shop.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1800, 895)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link prevButton"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_home/link_prevButton'))

"Step 3: Click on div kCellphoneShopContainer"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_home/div_kCellphoneShopContainer'))

"Step 4: Click on div kCellphoneShopContainer"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_home/div_kCellphoneShopContainer'))

"Step 5: Click on link kCellphoneShop -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Shop/Page_home/link_kCellphoneShop'))

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Navigate to K Cellphone Shop and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}