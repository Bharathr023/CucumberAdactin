package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	public static WebDriver driver = RunnerClass.driver;
	
	@Given("^user Launch The Web Application$")
	public void user_Launch_The_Web_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
		
	}
	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("Bharath23");
	}

	@And("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		driver.findElement(By.id("password")).sendKeys("12345678");
	}
	@Then("^user Click The Login Button And It Navigate To Search Hotel$")
	public void user_Click_The_Login_Button_And_It_Navigate_To_Search_Hotel() throws Throwable {
		driver.findElement(By.id("login")).click();
	}
	@When("^user Select The Location In Select Location DropDown$")
	public void user_Select_The_Location_In_Select_Location_DropDown() throws Throwable {
		WebElement location = driver.findElement(By.xpath("//td[@align='right']//following::select[@id='location']"));
		Select s = new Select(location);
		s.selectByIndex(2);
	}

	@When("^user Select The Hotel In Select Hotel DropDown$")
	public void user_Select_The_Hotel_In_Select_Hotel_DropDown() throws Throwable {
		WebElement hotel = driver.findElement(By.xpath("//td[@align= 'right']//following::select[@id='hotels']"));
	    Select s =new Select(hotel);
	    s.selectByIndex(1);
		
	}

	@When("^user Select The Room Type In Select Room Type Dropdown$")
	public void user_Select_The_Room_Type_In_Select_Room_Type_Dropdown() throws Throwable {
		WebElement roomType = driver.findElement(By.xpath("//td[@align= 'right']//following::select[@id='room_type']"));
		Select s = new Select(roomType);
		s.selectByIndex(2);
	}

	@Then("^user Click The Search Button And It Will Navigate To Select Hotel$")
	public void user_Click_The_Search_Button_And_It_Will_Navigate_To_Select_Hotel() throws Throwable {
		driver.findElement(By.id("Submit")).click();
	}

	@When("^user Click The Hotel To Be Selected$")
	public void user_Click_The_Hotel_To_Be_Selected() throws Throwable {
		driver.findElement(By.id("radiobutton_0")).click();
		
	}

	@Then("^user Click The Continue Button And It Will Navigate To Book Hotel$")
	public void user_Click_The_Continue_Button_And_It_Will_Navigate_To_Book_Hotel() throws Throwable {
		driver.findElement(By.xpath("//input[@id='cancel']//preceding-sibling::input")).click();
	}

	@When("^user Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
		driver.findElement(By.id("first_name")).sendKeys("Bharath");
	}

	@When("^user Enter The Last Name In Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
		driver.findElement(By.id("last_name")).sendKeys("R");
	}

	@When("^user Enter The Billing Address In Billing Address field$")
	public void user_Enter_The_Billing_Address_In_Billing_Address_field() throws Throwable {
		driver.findElement(By.id("address")).sendKeys("No.150,mariamman Kovil street, America");
	}

	@When("^user Enter The Credit Card Number In Credit Card Field$")
	public void user_Enter_The_Credit_Card_Number_In_Credit_Card_Field() throws Throwable {
		driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
	}

	@When("^user Select The Credit Card Type$")
	public void user_Select_The_Credit_Card_Type() throws Throwable {
		WebElement creditCardType = driver.findElement(By.id("cc_type"));
		Select s = new Select(creditCardType);
		s.selectByIndex(1);
	}
	@When("^user Select The Expire Month$")
	public void user_Select_The_Expire_Month() throws Throwable {
		WebElement expireMonth = driver.findElement(By.id("cc_exp_month"));
		Select s = new Select(expireMonth);
		s.selectByIndex(3);
	}

	@When("^user Select The Expire Year$")
	public void user_Select_The_Expire_Year() throws Throwable {
		WebElement expireYear = driver.findElement(By.id("cc_exp_year"));
		Select s = new Select(expireYear);
		s.selectByIndex(3);
	}

	@When("^user Enter The Cvv Number In Cvv Field$")
	public void user_Enter_The_Cvv_Number_In_Cvv_Field() throws Throwable {
		driver.findElement(By.id("cc_cvv")).sendKeys("543");
	}

	@Then("^user Click The Book Now Button$")
	public void user_Click_The_Book_Now_Button() throws Throwable {
		driver.findElement(By.id("book_now")).click();
	}

	@Then("^user Logout The Conformation Page$")
	public void user_Logout_The_Conformation_Page() throws Throwable {
	//	driver.findElement(By.id("logout")).click();
	}





}
