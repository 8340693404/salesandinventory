package com.sales_and_inventory_objectutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;

	public Homepage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Sales and Inventory System")
	private WebElement homelink;
	@FindBy(linkText="Keyboard")
	private WebElement keyboardlink;
	@FindBy(linkText="Mouse")
	private WebElement mouselink;

	@FindBy(linkText="Headset")
	private WebElement headsetlink;

	@FindBy(linkText="CPU")
	private WebElement cpulink;

	@FindBy(linkText="Monitor")
	private WebElement monitorlink;

	@FindBy(linkText="Motherboard")
	private WebElement motherboardlink;

	@FindBy(linkText="Processor")
	private WebElement processorlink;
	@FindBy(linkText="Power Supply")
	private WebElement powersupplylink;
	@FindBy(linkText="Others")
	private WebElement otherslink;
	@FindBy(xpath ="(//button[@type='button'])[1]")
	private WebElement submitbtn;
	@FindBy(xpath = "//img[@class='img-profile rounded-circle']")
	private WebElement adminimg;
	@FindBy(xpath ="(//a[@class='btn btn-primary'])[1]")
	private WebElement readylogoutbtn;
	@FindBy(xpath="(//td)[1]")
	private WebElement getproductname;


	public WebElement getGetproductname() {
		return getproductname;
	}
	public WebElement getReadylogoutbtn() {
		return readylogoutbtn;
	}
	public WebElement getAdminimg() {
		return adminimg;
	}
	@FindBy(partialLinkText = "Logout")
	private WebElement logout;
	@FindBy(xpath="//h6[text()='Lenovo']/../input[@name='addpos']")
	private WebElement addkeyboard;
	
	public WebElement getAddkeyboard() {
		return addkeyboard;
	}
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	public WebElement getKeyboardlink() {
		return keyboardlink;
	}
    public WebElement getMouselink() {
		return mouselink;
	}
    public WebElement getHeadsetlink() {
		return headsetlink;
	}

    public WebElement getCpulink() {
		return cpulink;
	}
	public WebElement getMonitorlink() {
		return monitorlink;
	}
	public WebElement getMotherboardlink() {
		return motherboardlink;
	}
	public WebElement getProcessorlink() {
		return processorlink;
	}
	public WebElement getPowersupplylink() {
		return powersupplylink;
	}
	public WebElement getOtherslink() {
		return otherslink;
	}
	public String getHomelink() {
		return homelink.getText();
	}


}
