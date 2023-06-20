package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver = null;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSearchText(String value) {
        String Loc = "//input[@type='text']";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.sendKeys(value);
    }

    public void setSearchText1(String value) {
        String Loc = "//input[@type='password']";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.sendKeys(value);
    }

    public void clickSearchButton() {
        String Loc = "//button[@type='submit']";

        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }
    public void clickProfile() {
        String Loc = "//button[contains(@class, 'menu-handle'])";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }
    public void clickSetting() {
        String Loc = "(//a[@class='nav-link' and @data-analytics='NavBarProfileDropDownSettings' and @href='/settings'])";

        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }
    public void clickPassword() {
        String Loc = "(//a[@class='settings-sidebar__list-item--link settings-sidebar__list-item--active-link' and @id='change-password' and @data-analytics='SettingsNavList' and @data-attr1='change-password' and @data-event-category='HRC Profile' and @data-event-label='SettingsNavList-change-password' and @href='/settings/change-password'])";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }
    public void clickCurrentPassword(){
        String Loc = "(//input[@type='password' and @id='labeled-input-1' and @class='input' and @placeholder='Enter current password' and @aria-label='Enter current password' and @aria-invalid='false' and @name='currentPassword' and @alignment='column' and @aria-describedby='tooltip-labeled-input-1'])";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }
    public void clickNewPassword(){
        String Loc = "(//input[@type='password' and @id='labeled-input-2' and @class='input' and @placeholder='Enter new password' and @aria-label='Enter new password' and @aria-invalid='false' and @name='newPassword' and @alignment='column' and @aria-describedby='tooltip-labeled-input-2'])";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }
    public void clickConformNewPassword() {
        String Loc = "(//input[@type='password' and @id='labeled-input-3' and @class='input' and @placeholder='Re-enter new password' and @aria-label='Re-enter new password' and @aria-invalid='false' and @name='confirmPassword' and @alignment='column' and @aria-describedby='tooltip-labeled-input-3'])";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }
    public void clickChangePassword() {
        String Loc = "(//button[@class='ui-btn ui-btn-normal ui-btn-submit ui-btn-primary settings-submit-btn ui-btn-styled' and @disabled='' and @type='submit' and @data-event-category='HRC Profile' and @data-event-label='SettingsChangePasswordSave' and @data-analytics='SettingsChangePasswordSave'])";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }
    public void clickRemove() {
        String Loc = "(///a[@class='cursor settings_email_remove xsmall color-alt-grey']";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }



}