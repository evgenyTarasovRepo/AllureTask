package com.tarasov.confige;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public abstract class AbstractTestBase {
    protected final static String URL = "https://github.com/";
    protected final String ALLURE_REPO = "eroshenkoam/allure-example";
    protected final SelenideElement mainPageSearch = $x(".//input[@name='q']");
    protected final SelenideElement issuesTab = $("#issues-tab");

    protected final String ISSUE_NAME = "issue_to_test_allure_report";

    @BeforeEach
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1980x1080";
        Configuration.headless = true;
    }
}
