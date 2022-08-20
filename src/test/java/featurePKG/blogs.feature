#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Blogs Functionality
  As a customer by clicking on the blogs link I should be able to see all the information related to that topic.

  #Scenario:Positive Blogs functionality test by clicking on the link  
  #Given user is in homepage
  #When user clicks on the blogs link
  #Then all the information related to that topic should be displayed
  #
  #Scenario:Negative Blogs functionality test by not clicking on the link  
  #Given user is in homepage
  #When does not user click on the blogs link
  #Then all the information related to that topic should not be displayed
    #
  #Scenario: Positive top bug tracking system flow by clicking on the link text
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downtopbug
  #And user clicks on the top bug tracking system link
  #Then all the information related to that topic should display.
  #
  #Scenario: Negative top bug tracking system flow by not clicking on the link text
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downtopbug
  #And user does not click on the linktext
  #Then all the information related to that topic should not  display and user should still be on the same page.
  #
  #Scenario: Positive bug tracking system flow by clicking on the small link text
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downtopbug
  #And user clicks on the top bug tracking system link
  #And user scrolls downsmallqalinktext
  #And user clicks on small bug track linktext
  #Then all the information related to small bug track link topic should display.
  #
  #Scenario: Negative bug tracking system flow by not clicking on the small link text
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downtopbug
  #And user clicks on the top bug tracking system link
  #And user scrolls downsmallqalinktext
  #And user does not click on small bug track linktext
  #Then all the information related to small bug track link topic should not display and user should still be on the same page
  #
  #Scenario: Positive Top bug tracking system flow by clicking on the small link text
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downtopbug
  #And user clicks on the top bug tracking system link
  #And user scrolls downsmallqalinktext
  #And user clicks on small top bug track linktext
  #Then all the information related to small top bug track link topic should display.
  #
 #
  #Scenario: What to expect in qa job interview positive linktext
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downqajob
  #And user clicks on the what to expect in qa job interview linktext
  #Then all the information related to qa job interview topic should display.
  #
  #Scenario: What to expect in qa job interview negative linktext
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downqajob
  #And user does not click on the linktext
  #Then all the information related to that topic should not  display and user should still be on the same page.
  #
  #
  #Scenario: QA job interviews small linktext positive test
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downqajob
  #And user clicks on the what to expect in qa job interview linktext
  #And user scrolls downsmallqalinktext
  #And user clicks on the QA job interviews small limktext
  #Then all the information related to qa job interview small link text topic should display
  #
  #Scenario: QA job interviews small linktext negative test 
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downqajob
  #And user clicks on the what to expect in qa job interview linktext
  #And user scrolls downsmallqalinktext
  #And user does not click on the small linktext
  #Then all the information related to small link topic should not  display and user should still be on the same page.
  #
  #Scenario:Ten QA skills positive fuctionality test by clicking on the link  
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downqajob
  #And user clicks on the ten important skills needed as QA engineer link text
  #Then all the information related to ten important skills needed as QA engineer link text topic should display
  #
  #Scenario:Ten QA skills negative fuctionality test by not clicking on the link  
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downqajob
  #And user does not click on the linktext
 #Then all the information related to that topic should not  display and user should still be on the same page.
  #
  #prb
  #Scenario:Ten Positive fuctionality test by clicking on qa engineer small link text 
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downqajob
  #And user clicks on the ten important skills needed as QA engineer link text
  #And user scrolls downsmallqalinktext
  #And user clicks on qa engineer small link text
  #Then all the information related to qa engineer small link text should display
  #
  #Scenario:Ten Positive fuctionality test by clicking on qa engineer course small link text 
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downqajob
  #And user clicks on the ten important skills needed as QA engineer link text
  #And user scrolls downsmallqalinktext
  #And user clicks on qa engineer course small link text
  #Then all the information related to qa engineer course small link text should display
  #
  #Scenario:Negative fuctionality test by not clicking on qa engineer small link text 
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downqajob
  #And user clicks on the ten important skills needed as QA engineer link text
  #And user scrolls downsmallqalinktext
  #And user does not click on qa engineer small link text
  #Then all the information related to qa engineer small link text should not  display
  #
  #Scenario: How to boost qa skill link positive test by clicking on it
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downtopbug
  #And user clicks on the boost qa skill link text
  #Then all the information related to boost qa skill link text topic display
  #
  #Scenario: How to boost qa skill link negative test by not clicking it 
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downtopbug
  #And user does not click on the boost skill link text
  #Then all the information related to that topic should not  display and user should still be on the same page.
  #
  #Scenario: Positive QA Skills Efficiency small link test
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downtopbug
  #And user clicks on the boost qa skill link text
  #And user click on QA Skills Efficiency link text
  #Then all the information related to QA Skills Efficiency  link text should display
  #
  #Scenario: Negative QA Skills Efficiency small link test
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downtopbug
  #And user clicks on the boost qa skill link text
  #And user scrolls downsmallqalinktext
  #And user does not click on QA Skills Efficiency link text
  #Then all the information related to QA Skills Efficiency  link text should not  display
  #
  #
  #Scenario: How to boost qa skill efficiency comment section positive test
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downtopbug
  #And user clicks on the boost qa skill link text
  #And user scrolls downsmallqalinktext
  #When user types on the comment box
  #And user types his name
  #And user types his email
  #And user types website name
  #And user click on post button 
  #Then page should get refreshed and that comment should be visible on the top
  #
  #prb
  #Scenario: Top bug tracking system comment section positive test
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downtopbug
  #And user clicks on the top bug tracking system link
  #And user scrolls downsmallqalinktext
  #When user types on the comment box
  #And user types his name
  #And user types his email
  #And user types website name
  #And user click on post button
  #And user scrolls up 
  #Then page should get refreshed and that comment should be visible on the top
  #
  #bug
  #Scenario: Top bug tracking system comment section negative test without typing email
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downtopbug
  #And user clicks on the boost qa skill link text
  #And user scrolls downsmallqalinktext
  #When user types on the comment box
  #And user types his name
  #And user types website name
  #And user click on post button 
  #Then error message should be displayed
  #
  #bug
  #Scenario: Top bug tracking system comment section negative test without typing name
  #Given user is in homepage
  #When user clicks on the blogs link
  #And user scrolls downtopbug
  #And user clicks on the top bug tracking system link
  #And user scrolls downsmallqalinktext
  #When user types on the comment box
  #And user types his email
  #And user types website name
  #And user click on post button
  #And user scrolls up 
  #Then error message should be displayed
  #
  #bug
  Scenario: Top bug tracking system comment section negative test without typing both name and email
  Given user is in homepage
  When user clicks on the blogs link
  And user scrolls downtopbug
  And user clicks on the top bug tracking system link
  And user scrolls downsmallqalinktext
  When user types on the comment box
  And user types website name
  And user click on post button
  And user scrolls up 
  Then error message should be displayed
  #
  
  
  