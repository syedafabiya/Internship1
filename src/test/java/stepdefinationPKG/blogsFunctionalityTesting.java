package stepdefinationPKG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainPKG.baseClass;
import pagefactoryPKG.QAjobinterviewPage;
import pagefactoryPKG.blogpage;
import pagefactoryPKG.homepage;
import pagefactoryPKG.howToBoostQAskillpage;
import pagefactoryPKG.tenImportantQAskillspage;
import pagefactoryPKG.topbugtrackpage;


public class blogsFunctionalityTesting extends baseClass{
      
	homepage hp=new homepage();
	blogpage bg=new blogpage();
	QAjobinterviewPage qp=new QAjobinterviewPage();
	topbugtrackpage tb=new topbugtrackpage();
	tenImportantQAskillspage ten=new tenImportantQAskillspage();
	howToBoostQAskillpage hb=new howToBoostQAskillpage();
	
	@Given("user is in homepage")
	public void user_is_in_homepage() {
		Assert.assertEquals(hp.currenturl(),prop.getProperty("testurl"));
	}

	@When("user clicks on the blogs link")
	public void user_clicks_on_the_blogs_link() {
	   hp.clickbloglink();
	}

	@Then("all the information related to that topic should be displayed")
	public void all_the_information_related_to_that_topic_should_be_displayed() {
	   Assert.assertEquals(hp.currenturl(),prop.getProperty("blogurl"));
	}
	
	
	@When("user clicks on the top bug tracking system link")
	public void user_clicks_on_the_top_bug_tracking_system_link() {
	   bg.clicktopbugtracklink();
	}
	@And("user scrolls downqajob")
	public void user_scrolls_downqajob() {
	   bg.scrolldownqajob();
	} 
	
	@And("user scrolls downtopbug")
	public void user_scrolls_downtopbug() {
	   bg.scrolldowntopbug();
	} 
	
	
	@Then("all the information related to that topic should display.")
	public void all_the_information_related_to_that_topic_should_display() {
		Assert.assertEquals(bg.ccurrenturl(),prop.getProperty("topbugurl"));
	}
	
	
	@When("user does not click on the linktext")
	public void user_does_not_click_on_the_linktext() {
		 Assert.assertEquals(hp.currenturl(),prop.getProperty("blogurl"));
	}

	@Then("all the information related to that topic should not  display and user should still be on the same page.")
	public void all_the_information_related_to_that_topic_should_not_display_and_user_should_still_be_on_the_same_page() {
		 Assert.assertEquals(hp.currenturl(),prop.getProperty("blogurl"));
	}
	
	@When("user clicks on the what to expect in qa job interview linktext")
	public void user_clicks_on_the_what_to_expect_in_qa_job_interview_linktext() {
	    bg.clickqajobinterviewlink();
	}

	@Then("all the information related to qa job interview topic should display.")
	public void all_the_information_related_to_qa_job_interview_topic_should_display() {
	  Assert.assertEquals(bg.ccurrenturl(), prop.getProperty("qajobinterview"));
	}
	
	@When("user scrolls downsmallqalinktext")
	public void user_scrolls_downsmallqalinktext() {
	    qp.scrollsmallqalink();
	}

	@When("user clicks on the QA job interviews small limktext")
	public void user_clicks_on_the_qa_job_interviews_small_limktext() {
	    qp.smallqajonlinkclick();
	}

	@Then("all the information related to qa job interview small link text topic should display")
	public void all_the_information_related_to_qa_job_interview_small_link_text_topic_should_display() {
		Assert.assertEquals(bg.ccurrenturl(),prop.getProperty("qajobsmalllinktxt"));
	}
	@When("user does not click on the small linktext")
	public void user_does_not_click_on_the_small_linktext() {
		Assert.assertEquals(driver.getCurrentUrl(),prop.getProperty("qajoblinktext"));
	}
 
	@Then("all the information related to small link topic should not  display and user should still be on the same page.")
	public void all_the_information_related_to_small_link_topic_should_not_display_and_user_should_still_be_on_the_same_page() {
		Assert.assertEquals(bg.ccurrenturl(),prop.getProperty("qajoblinktext"));
	}
	
	@When("user clicks on small bug track linktext")
	public void user_clicks_on_small_bug_track_linktext() {
	    tb.bugtrackclick();
	}

	@Then("all the information related to small bug track link topic should display.")
	public void all_the_information_related_to_small_bug_track_link_topic_should_display() {
		Assert.assertEquals(bg.ccurrenturl(),prop.getProperty("bugtracksmallLink"));
	}
	
	@When("user does not click on small bug track linktext")
	public void user_does_not_click_on_small_bug_track_linktext() {
		Assert.assertEquals(bg.ccurrenturl(),prop.getProperty("topbugurl"));
	}

	@Then("all the information related to small bug track link topic should not display and user should still be on the same page")
	public void all_the_information_related_to_small_bug_track_link_topic_should_not_display_and_user_should_still_be_on_the_same_page() {
		Assert.assertEquals(bg.ccurrenturl(),prop.getProperty("topbugurl"));
	}
	
	@When("user clicks on small top bug track linktext")
	public void user_clicks_on_small_top_bug_track_linktext() {
	    tb.topbugtrackclick();
	}

	@Then("all the information related to small top bug track link topic should display.")
	public void all_the_information_related_to_small_top_bug_track_link_topic_should_display() {
		Assert.assertEquals(bg.ccurrenturl(),prop.getProperty("topbugtracksmallLink"));
	}
	
	@When("user clicks on the ten important skills needed as QA engineer link text")
	public void user_clicks_on_the_ten_important_skills_needed_as_qa_engineer_link_text() {
	    ten.tenimpskillclick();
	}

	@Then("all the information related to ten important skills needed as QA engineer link text topic should display")
	public void all_the_information_related_to_ten_important_skills_needed_as_qa_engineer_link_text_topic_should_display() {
	    Assert.assertEquals(bg.ccurrenturl(),prop.getProperty("tenimpskill"));
	}
	
	@When("user clicks on qa engineer small link text")
	public void user_clicks_on_qa_engineer_small_link_text() {
	   ten.qaengineersmallLinklclick();
	}

	@Then("all the information related to qa engineer small link text should display")
	public void all_the_information_related_to_qa_engineer_small_link_text_should_display() {
		 Assert.assertEquals(bg.ccurrenturl(),prop.getProperty("tenimpSkillqaengineerSmallLink"));
	}
	
	@When("user does not click on qa engineer small link text")
	public void user_does_not_click_on_qa_engineer_small_link_text() {
		Assert.assertEquals(bg.ccurrenturl(),prop.getProperty("tenimpskill"));
	}

	@Then("all the information related to qa engineer small link text should not  display")
	public void all_the_information_related_to_qa_engineer_small_link_text_should_not_display() {
		Assert.assertEquals(bg.ccurrenturl(),prop.getProperty("tenimpskill"));
	}
	
	@When("user clicks on qa engineer course small link text")
	public void user_clicks_on_qa_engineer_course_small_link_text() {
	    ten.qaengineercoursemallLinklclick();
	}

	@Then("all the information related to qa engineer course small link text should display")
	public void all_the_information_related_to_qa_engineer_course_small_link_text_should_display() {
		Assert.assertEquals(bg.ccurrenturl(),prop.getProperty("tenimpqaengineercoursesmallLink"));
	}
	
	@When("user clicks on the boost qa skill link text")
	public void user_clicks_on_the_boost_qa_skill_link_text() {
	    hb.howtoboostQaSkillclick();
	}

	@Then("all the information related to boost qa skill link text topic display")
	public void all_the_information_related_to_boost_qa_skill_link_text_topic_display() {
		Assert.assertEquals(bg.ccurrenturl(),prop.getProperty("howtoBoostqaSkill"));
	}
	@When("user does not click on the boost skill link text")
	public void user_does_not_click_on_the_boost_skill_link_text() {
		Assert.assertEquals(hp.currenturl(),prop.getProperty("blogurl"));
	}
	
	@When("user click on QA Skills Efficiency link text")
	public void user_click_on_qa_skills_efficiency_link_text() {
	    hb.qaengineersmallLinkclick();
	}

	@Then("all the information related to QA Skills Efficiency  link text should display")
	public void all_the_information_related_to_qa_skills_efficiency_link_text_should_display() {
		Assert.assertEquals(hp.currenturl(),prop.getProperty("qaskillefficiencySmallLink"));
	}
	
	@When("user does not click on QA Skills Efficiency link text")
	public void user_does_not_click_on_qa_skills_efficiency_link_text() {
		Assert.assertEquals(bg.ccurrenturl(),prop.getProperty("howtoBoostqaSkill"));
	}

	@Then("all the information related to QA Skills Efficiency  link text should not  display")
	public void all_the_information_related_to_qa_skills_efficiency_link_text_should_not_display() {
		Assert.assertEquals(bg.ccurrenturl(),prop.getProperty("howtoBoostqaSkill"));
	}
	
	@When("user types on the comment box")
	public void user_types_on_the_comment_box() {
	    hb.commentboxtype();
	}

	@When("user types his name")
	public void user_types_his_name() {
	   hb.nametype();
	}

	@When("user types his email")
	public void user_types_his_email() {
	   hb.emailtype();
	}
	
	@When("user types website name")
	public void user_types_website_name() {
	    hb.websitetype();
	}

	@When("user click on post button")
	public void user_click_on_post_button() throws InterruptedException {
	    hb.postbuttonclick();
	    Thread.sleep(5);
	}

	@Then("page should get refreshed and that comment should be visible on the top")
	public void page_should_get_refreshed_and_that_comment_should_be_visible_on_the_top() throws InterruptedException {
	    Assert.assertTrue(hb.howToBoostQAskillpage().isDisplayed());
	    Thread.sleep(5);
	}
	
	@When("user scrolls up")
	public void user_scrolls_up() {
	    hb.scrollup();
	}

	@Then("error message should be displayed")
	public void error_message_should_be_displayed() {
	    Assert.assertTrue(tb.topbugtrackpage().isDisplayed());
	}
	@When("does not user click on the blogs link")
	public void does_not_user_click_on_the_blogs_link() {
		Assert.assertEquals(bg.ccurrenturl(),prop.getProperty("testurl"));
	}

	@Then("all the information related to that topic should not be displayed")
	public void all_the_information_related_to_that_topic_should_not_be_displayed() {
		Assert.assertEquals(bg.ccurrenturl(),prop.getProperty("testurl"));
	}

}
	
	