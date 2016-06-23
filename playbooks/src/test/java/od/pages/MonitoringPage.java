package od.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MonitoringPage extends PageObject {

    //region WEB ELEMENTS: Fields

    //endregion

    //region WEB ELEMENTS: Buttons

    //endregion

    //region WEB ELEMENTS: Checkboxes

    //endregion

    //region WEB ELEMENTS: Links

    //endregion

    //region WEB ELEMENTS: Tables

    //endregion

    //region WEB ELEMENTS: Pickers

    //endregion

    //region WEB ELEMENTS: Selectors

    @FindBy(xpath = "*//select[@ng-model=\"monitoringCtrl.selectedEnvironment\"]")
    public WebElementFacade selectorSelectEnvironment;

    @FindBy(xpath = "*//div[@ng-show=\"monitoringCtrl.currentType == 'peer'\"]")
    public WebElementFacade selectorHosts;

    @FindBy(xpath = "*//option[contains(text(),\"management\")]")
    public WebElementFacade selectorHostsItemManagementHost;

    @FindBy(xpath = "*//option[contains(text(),\"intra\")]")
    public WebElementFacade selectorHostsItemRecourceHost;

    //endregion

    //region WEB ELEMENTS: Images

    //endregion

    //region WEB ELEMENTS: Icons

    public String sikuliMenuIconRH = "src/test/resources/imgs/icons/iconRHMenuIcon.png";
    public String sikuliTitleEnvironment = "src/test/resources/imgs/titles/titleEnvironment.png";
    public String sikuliTitleManagement = "src/test/resources/imgs/titles/titleManagement.png";

    //endregion

    //region WEB ELEMENTS: Headers

    @FindBy(xpath = "*//h1[contains(text(),\"Monitoring\")]")
    public WebElementFacade headerMonitoring;

    //endregion
}