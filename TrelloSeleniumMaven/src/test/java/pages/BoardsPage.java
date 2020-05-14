package pages;

import elements.Button;
import elements.Field;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BoardsPage extends Page {
    private WebDriver driver;

    public Button createBoardButton = new Button(By.cssSelector("div[class='board-tile mod-add']"));
    public Field createBoardField = new Field(By.cssSelector("input[data-test-id='create-board-title-input']"));
    public BoardsPage(WebDriver driver) {
        super(driver);
    }
}
