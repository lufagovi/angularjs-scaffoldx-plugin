package org.jboss.forge.scaffold.angularjs.scenario.dronetests.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class HasLandedOnEditAddressView implements ExpectedCondition<Boolean> {

    @Override
    public Boolean apply(WebDriver driver) {
        return driver.getCurrentUrl().contains("/Addresss/edit") && !driver.findElement(By.id("saveAddress")).isEnabled();
    }
}