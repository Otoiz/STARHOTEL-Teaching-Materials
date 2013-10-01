package practicework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReserveInputPage {
    private WebDriver driver;
    private By reserveYear = By.id("reserve_year");
    private By reserveMonth = By.id("reserve_month");
    private By reserveDay = By.id("reserve_day");
    private By reserveTerm = By.id("reserve_term");
    private By headCount = By.id("headcount");
    private By breakfastOn = By.id("breakfast_on");
    private By breakfastOff = By.id("breakfast_off");
    private By planA = By.id("plan_a");
    private By planB = By.id("plan_b");
    private By reservePersonName = By.id("reserve_person_name");
    private By goToNext = By.id("goto_next");

    public ReserveInputPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setReserveYear(String value) {
        WebElement element = driver.findElement(reserveYear);
        element.clear();
        element.sendKeys(value);
    }
    
    public String getReserveYear() {
        return driver.findElement(reserveYear).getText();
    }

    public void setReserveMonth(String value) {
        WebElement element = driver.findElement(reserveMonth);
        element.clear();
        element.sendKeys(value);
    }
    
    public String getReserveMonth() {
        return driver.findElement(reserveMonth).getText();
    }
    
    public void setReserveDay(String value) {
        WebElement element = driver.findElement(reserveDay);
        element.clear();
        element.sendKeys(value);
    }
    
    public String getReserveDay() {
        return driver.findElement(reserveDay).getText();
    }

    public void setReserveDate(String year, String month, String day) {
        setReserveYear(year);
        setReserveMonth(month);
        setReserveDay(day);
    }

    public void setReserveTerm(String value) {
        WebElement element = driver.findElement(reserveTerm);
        element.clear();
        element.sendKeys(value);
    }
    
    public String getReserveTerm() {
        return driver.findElement(reserveTerm).getText();
    }
    
    public void setHeadCount(String value) {
        WebElement element = driver.findElement(headCount);
        element.clear();
        element.sendKeys(value);
    }
    
    public String getHeadCount() {
        return driver.findElement(headCount).getText();
    }
    
    public void setBreakfast(boolean on) {
        if (on) {
            driver.findElement(breakfastOn).click();
        } else {
            driver.findElement(breakfastOff).click();            
        }
    }
    
    public boolean getBreakfast() {
        String checked = driver.findElement(breakfastOn).getAttribute("checked");
        return "true".equals(checked);
    }
    
    public void setPlanA(boolean checked) {
        WebElement element = driver.findElement(planA);
        if (element.isSelected() != checked) {
            element.click();
        }
    }
    
    public boolean getPlanA() {
        return driver.findElement(planA).isSelected();
    }

    public void setPlanB(boolean checked) {
        WebElement element = driver.findElement(planB);
        if (element.isSelected() != checked) {
            element.click();
        }
    }

    public boolean getPlanB() {
        return driver.findElement(planB).isSelected();
    }

    public void setReservePersonName(String value) {
        WebElement element = driver.findElement(reservePersonName);
        element.clear();
        element.sendKeys(value);
    }
    
    public String getReservePersonName() {
        return driver.findElement(reservePersonName).getText();
    }
    package practicework.pages;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;

    public class ReserveInputPage {
        private WebDriver driver;
        private By reserveYear = By.id("reserve_year");
        private By reserveMonth = By.id("reserve_month");
        private By reserveDay = By.id("reserve_day");
        private By reserveTerm = By.id("reserve_term");
        private By headCount = By.id("headcount");
        private By breakfastOn = By.id("breakfast_on");
        private By breakfastOff = By.id("breakfast_off");
        private By planA = By.id("plan_a");
        private By planB = By.id("plan_b");
        private By guestName = By.id("guestname");
        private By goToNext = By.id("goto_next");

        public ReserveInputPage(WebDriver driver) {
            this.driver = driver;
        }

        public void setReserveYear(String value) {
            WebElement element = driver.findElement(reserveYear);
            element.clear();
            element.sendKeys(value);
        }
        
        public String getReserveYear() {
            return driver.findElement(reserveYear).getAttribute("value");
        }

        public void setReserveMonth(String value) {
            WebElement element = driver.findElement(reserveMonth);
            element.clear();
            element.sendKeys(value);
        }
        
        public String getReserveMonth() {
            return driver.findElement(reserveMonth).getAttribute("value");
        }
        
        public void setReserveDay(String value) {
            WebElement element = driver.findElement(reserveDay);
            element.clear();
            element.sendKeys(value);
        }
        
        public String getReserveDay() {
            return driver.findElement(reserveDay).getAttribute("value");
        }

        public void setReserveDate(String year, String month, String day) {
            setReserveYear(year);
            setReserveMonth(month);
            setReserveDay(day);
        }

        public void setReserveTerm(String value) {
            WebElement element = driver.findElement(reserveTerm);
            element.clear();
            element.sendKeys(value);
        }
        
        public String getReserveTerm() {
            return driver.findElement(reserveTerm).getAttribute("value");
        }
        
        public void setHeadCount(String value) {
            WebElement element = driver.findElement(headCount);
            element.clear();
            element.sendKeys(value);
        }
        
        public String getHeadCount() {
            return driver.findElement(headCount).getAttribute("value");
        }
        
        public void setBreakfast(boolean on) {
            if (on) {
                driver.findElement(breakfastOn).click();
            } else {
                driver.findElement(breakfastOff).click();            
            }
        }
        
        public boolean getBreakfast() {
            String checked = driver.findElement(breakfastOn).getAttribute("checked");
            return "true".equals(checked);
        }
        
        public void setPlanA(boolean checked) {
            WebElement element = driver.findElement(planA);
            if (element.isSelected() != checked) {
                element.click();
            }
        }
        
        public boolean getPlanA() {
            return driver.findElement(planA).isSelected();
        }

        public void setPlanB(boolean checked) {
            WebElement element = driver.findElement(planB);
            if (element.isSelected() != checked) {
                element.click();
            }
        }

        public boolean getPlanB() {
            return driver.findElement(planB).isSelected();
        }
        
        public void setGuestName(String value) {
            WebElement element = driver.findElement(guestName);
            element.clear();
            element.sendKeys(value);
        }
        
        public String getGuestName() {
            return driver.findElement(guestName).getAttribute("value");
        }
        
        public ReserveConfirmPage goToNext() {
            driver.findElement(goToNext).click();
            return new ReserveConfirmPage(driver);
        }
    }

    public ReserveConfirmPage goToNext() {
        driver.findElement(goToNext).click();
        return new ReserveConfirmPage(driver);
    }
}
