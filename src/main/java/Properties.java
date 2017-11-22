// Help class to get passed parameters from environment for further usage in the automation project


public abstract class Properties {
    public static final String DEFAULT_BASE_ADMIN_URL = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
    public static final String ADMIN_LOGIN = "webinar.test@gmail.com";
    public static final String ADMIN_PASSWORD = "Xcg7299bnSmMuRLp9ITw";
    public static final String NEW_CATEGORY="пальто";

    public static String locatorCatalog="Каталог";
    public static String locatorCategories="subtab-AdminCategories";
    public static String locatorAddButtun="a>i.process-icon-new";
    public static String locatorNewCategoryName="name_1";
    public static String locatorSaveButton="process-icon-save";
    public static String locatorMessage="#content > div:nth-child(4) > div";
    public static String locatorFilter="categoryFilter_name";
    public static String locatorSearchButton="submitFilterButtoncategory";
    public static String locatorCheck="#tr_2_14_1 > td:nth-child(3)";


}