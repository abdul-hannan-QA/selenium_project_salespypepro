package model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import base.Base;

public class Locators {

	public static String homePageUrl="https://salespype.pypepro.com/";
	public static String pageTitledashboard= "Dashboard | Pypepro";
	public static String pageTitlelogin= "Login |";
	public static String emailmodalopen="Email Send";
	public static String videomodalopen="Video Email";
	public static String TestContact ="Test Contact";
	public static String newtext ="new";
	public static String intertestedtext ="interested";


	//login


	public static By enterEmail = By.xpath("//input[@id='email']");
	public static By enterPassword = By.xpath("//input[contains(@placeholder,'Enter password')]");

	public static By logInButtonClick = By.xpath("//button[.='Log In']");

	public static By inboxButtonClick = By.xpath("//a[contains(@href,'/inbox')]");

	public static By searchPeople = By.xpath("//input[@placeholder='Search People in Inbox']");
	public static By alertclose = By.xpath("//a[contains(.,'Close')]");
	

	//inbox
	public static By sendmessage= By.xpath("//a[contains(.,'Send a message')]");
	
	public static By textareaText= By.xpath("//textarea[contains(@class,'inbox__tiny__text__area')]");
	public static By personalized= By.xpath("//div[contains(@aria-labelledby,'personalize-select-label personalize-select')]");
	public static By selectfirstname= By.xpath("//li[contains(@data-value,'[[first_name]]')]");
	//public static By sendmessage= By.xpath("//a[contains(.,'near_me')]");
	public static By sendButton= By.xpath("//a[contains(.,'Send')]");
	
	public static By emailButton= By.xpath("//a[.='Email']");
	
	public static By emailmodalopeninbox= By.xpath("//h2[starts-with(text(),'Email Send')]");
	
	//TEMPORARY ALERT
	//public static By alert= By.className("close_btn");
    public static By emailsubject= By.xpath("//input[@placeholder='Enter mail subject']");
    //email personalized from inbox
    public static By personalizedemail= By.xpath("//div[@class='g-email-send-options']//div[@class='g-personalized-button'][normalize-space()='Personalized']");
    public static By sendemailinbox= By.xpath("//a[contains(@class,'send_massage cursor-pointer')]");
    
    //video 
    public static By videoEmail=By.xpath("//a[contains(.,'Video Email')]");
    public static By quickreply=By.xpath("//p[.='Quick Reply']");
    public static By videomodalopeninbox=By.xpath("//h2[contains(text(),'Video Email')]");
   
    //select quick reply video
    public static By selectvideo=By.xpath("//div[@class='globalModalWrapper cardBordcastTab saved_reply_modal_wrapper global-modal-has-no-footer']//div[3]//div[3]//div[1]");
    public static By sendvideomail=By.xpath("//p[contains(.,'Send Email')]");
    
    
    public static By videomailsubject=By.xpath("//input[contains(@id,'email-setting-subject-input-field')]");
    public static By videolibrary=By.xpath("//p[contains(.,'Library')]");
    public static By videoselectlibrary=By.xpath("//body/div[contains(@role,'presentation')]/div[contains(@class,'globalModalWrapper cardBordcastTab global-large-modal video_library_modal_wrapper__alt global-modal-has-no-footer')]/div[@id='globalModal']/div[@id='modal___body___container___id']/div[contains(@class,'video_library_wrapper__alt')]/div[contains(@class,'video_thumbnails__alt')]/div[contains(@class,'mb-0')]/div[7]/div[1]");
    //direct mail
    public static By directmailopen=By.xpath("//a[contains(.,'Direct Mail')]");
    public static By postcardopen=By.xpath("//a[contains(.,'POST CARD')]");
    public static By saveandcontinue=By.xpath("//a[contains(.,'Save & Continue')]");
    public static By selectpostcard=By.xpath("//div[contains(text(),'Roofing Postcards')]");
    public static By selectpostcardfeedback=By.xpath("//li[contains(.,'Give Feedback')]");
    public static By feedbackselect=By.xpath("//img[contains(@src,'https://s3.us-east-1.amazonaws.com/pypepro/cards/agency_1/1iG4b1613976821.png')]");
    public static By saveandcontinue2=By.xpath("//a[contains(.,'Save & Continue')]");
    public static By saveandcontinue3=By.xpath("//a[contains(.,'Save & Continue')]");
    public static By textareapostcardirame=By.xpath("//iframe[@id='tiny-react_86688270931643628250578_ifr']");
    public static By textareapostcard=By.xpath("//iframe[@id='tiny-react_86688270931643628250578_ifr']");
    
    public static By generatepdfpostcard=By.xpath("//a[normalize-space()='Generate PDF']");
    public static By sendpostcard=By.xpath("//a[contains(.,'Send')]");
    
    //grettingcard
    public static By grettingcardopen=By.xpath("//a[contains(.,'GREETING CARD')]");
    public static By saveandcontinuegretting=By.xpath("//a[contains(.,'Save & Continue')]");
    public static By selectgrettingcard=By.xpath("//div[contains(text(),'Thank You Cards')]");
    public static By selectgreetingbirthday=By.xpath("//li[contains(.,'Birthday Cards')]");
    public static By selectbirthdaypic=By.xpath("//img[@src='https://s3.us-east-1.amazonaws.com/pypepro/cards/agency_1/m1Lgn1613990749.png']");
    public static By generategreetingcardpdf=By.xpath("//a[contains(.,'Generate PDF')]");
    public static By sendgreetingcard=By.xpath("//a[contains(.,'Send')]");
    
    //lettter
    public static By lettercardopen=By.xpath("//a[contains(.,'LETTER')]");
    public static By selectlettertemplate=By.xpath("//img[contains(@src,'https://s3.us-east-1.amazonaws.com/pypepro/cards/agency_1/3jo441621678427.png')]");
    
    //Gift
    public static By giftcardopen=By.xpath("//a[contains(.,'GIFT')]");
    public static By selectgift=By.xpath("//div[contains(@class,'select-photo-size-single is_select')]//img[contains(@alt,'gift')]");
    public static By selectgifttemplate= By.xpath("//div[contains(@class,'MuiFormControl-root second__step__area__select alt second__step__area__select__100 assign__stage_select_wrapper contact-list-dropdowns')]//div[contains(@class,'MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-formControl MuiInput-formControl')]");
    public static By selectgetwell=By.xpath("//li[contains(.,'Get Well Soon')]");
    public static By selectgetwellpic=By.xpath("//img[contains(@src,'https://s3.us-east-1.amazonaws.com/pypepro/cards/agency_1/5U99q1613989504.jpg')]");
    
    //Note
    public static By noteopeninbox=By.xpath("//a[contains(normalize-space(),'Note')]");
    public static By noteareatext=By.xpath("//textarea[contains(@name,'noteText')]");
    public static By addnoteinbox=By.xpath("//a[contains(.,'near_me')]");
    
    //chat
    public static By chatopeninbox=By.xpath("//a[starts-with(text(),'Chat')]");
    public static By chattextarea=By.xpath("//textarea[contains(@name,'chatText')]");
    public static By chatpersonalized=By.xpath("//div[contains(@aria-labelledby,'personalize-select-label personalize-select')]");
    public static By chatselectmyvirtualnumber=By.xpath("//li[contains(.,'My virtual number')]");
    public static By chatsend=By.xpath("//a[contains(normalize-space(),'Send')]");
    public static By chatquickreply=By.xpath("//span[contains(normalize-space(),'Use Quick Reply')]");
    public static By chattemplateselect=By.xpath("//div[contains(@class,'global-modal-has-no-footer')]//div[3]//div[3]//div[1]");
    
    public static By markimportant=By.xpath("//a[contains(@title,'Mark as important')]");
    public static By markunimportant=By.xpath("//a[contains(@title,'Remove from important')]");
    public static By important=By.xpath("//a[contains(normalize-space(),'Important')]");
    public static By importanttext=By.xpath("//span[.='Test Contact']");
    
    //unread
    public static By contactunread=By.xpath("//a[contains(@title,'Mark as unread')]");
    public static By contactnew=By.xpath("//span[contains(.,'new')]");
    
    //deal
    public static By clickdeals=By.xpath("//a[contains(.,'Deals')]");
    public static By dealsetting=By.xpath("//a[contains(@href,'/pipelines')]");
    
  
    public static By selectpipeline=By.xpath("//div[contains(@aria-label,'Without label')]");
    public static By hannanpipeline=By.xpath("//li[contains(.,'hannan')]");
    public static By deletepipelinebutton=By.xpath("//li[contains(@class,'ds__pipeline_action ds__pipeline_action_delete')]");
    public static By deleteconfirm=By.xpath("//button[contains(.,'Yes, delete it!')]");
    public static By deletepipelinedeal=By.xpath("//button[contains(text(),'No')]");
    
    public static By createpipeline=By.className("rounded-icons");
    public static By createpipelinetitle=By.xpath("//input[contains(@class,'mb-0 setFullWidth trigger__modal_textField dealValue')]");
    
    public static By addpipeline=By.xpath("//a[contains(.,'Add Pipeline')]");
    
    public static By selectpipelineproject11=By.xpath("//li[@role='option'][normalize-space()='project 11']");
    public static By addstage=By.xpath("//li[contains(.,'Add Stage')]");
    public static By stagetitle=By.xpath("//input[contains(@placeholder,'Enter title')]");
    public static By selectstagepipeline=By.xpath("//div[starts-with(text(),' Select a pipeline ')]");
    public static By project11=By.xpath("//li[@role='option'][normalize-space()='project 11']");
    public static By winprobality=By.xpath("//li[normalize-space()='10%']");
    public static By winpercantage=By.xpath("//li[contains(.,'50%')]");
    public static By selectyellocolor=By.xpath("//div[contains(@title,'#F8E71C')]");
    public static By addstagebutton=By.xpath("//a[contains(.,'Add Stage')]");
    
    public static By interestedstage=By.xpath("//span[contains(.,'interested')]");
    public static By interestedstagedelete=By.xpath("//div[4]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//button[1]");
    
    //contact
    public static By toggle=By.xpath("//div[contains(@class,'sidebar-toggle--btn')]");
    public static By clickcontact=By.xpath("//a[@href='/contacts']");
    public static By searchcontact=By.xpath("//input[contains(@placeholder,'Search contacts')]");
    public static By contactselect=By.xpath("//span[@aria-label='select-row-7432237']");
    public static By actincontact=By.xpath("//i[contains(.,'keyboard_arrow_down')]");
   
    public static By searchtag=By.xpath("//input[contains(@class,'ad__custom__input custom-popup-search')]");
    public static By selecttag=By.xpath("//span[contains(.,'new tag')]");
    public static By assigntag=By.xpath("//a[contains(.,'Assign Tag')]");
    
    //
    public static By tag=By.xpath("//li[contains(.,'new tag')]");
    
    
    
    public static By searchcampaign=By.xpath("//input[contains(@placeholder,'Select Or Search campaign')]");
    public static By selectcampaign=By.xpath("//ul[contains(@class,'awesome__scroll_bar')]//span[contains(text(),'issue test')]");
    public static By nextbutton=By.xpath("//a[contains(.,'Next')]");
    public static By startbutton=By.xpath("//a[contains(.,'Start')]");
    public static By campaign=By.xpath("//span[contains(.,'issue test')]");
    
   //calendar
    
    public static By clickcalerdar=By.xpath("//div[@id='root']//li[4]//a[1]");
    public static By selectcalendar=By.xpath("//a[contains(@href,'/activity-calendar')]");
    public static By addnewactivity=By.xpath("//a[contains(.,'Add New Activity')]");
    public static By selectappoinment=By.xpath("//a[contains(.,'Appointment')]");
    public static By appoinmenttitle=By.xpath("//input[contains(@id,'campaign_setting_activity_title')]");
    public static By appentdescription=By.xpath("//textarea[contains(@placeholder,'Enter Description')]");
    public static By searchcontactcalendar=By.xpath("//div[@class='col s12 activity-modal-search-menu']//input[@id='global_search_text_ref_id']");
    public static By contactcalendar=By.xpath("//p[contains(@class,'search_name')]");
    public static By checknotification=By.xpath("//span[contains(.,'Send invitation to the attendee')]");
    
    public static By selectuser=By.xpath("//div[@class='row']//div[@class='col s12']//div[@aria-label='Without label']");
    public static By selectusertechnical=By.xpath("//li[starts-with(text(),'technical test')]");
    
    
    public static By addactivity=By.xpath("//a[contains(@class,'send_massage cursor-pointer')]");
    
    public static By updateactivity=By.xpath("//a[contains(@class,'send_massage cursor-pointer')]");
    
    //marketing
    public static By selectcampaigns=By.xpath("//a[@href='/campaign']");
    public static By newcampaign=By.xpath(" //a[contains(text(),'New Campaign')]");
    public static By fullfeature=By.xpath("//a[contains(normalize-space(),'Full Featured')]");
    
    public static By campaignname=By.xpath("//input[contains(@placeholder,'Write Campaign Name')]");
    public static By opencampaignnumber=By.xpath("//div[contains(text(),'Select a phone number')]");
    public static By selectcampaignnumber=By.xpath("//li[contains(.,'+12184299295')]");
    public static By campaigntimezone=By.xpath("//div[contains(text(),'Arizona Time')]");
    public static By selectEasterntimezone=By.xpath("//li[contains(.,'Eastern Time')]");
    public static By addcontactbuttoncampaign=By.xpath("//a[contains(.,'Add a Contact')]");
    public static By selectexistingcontact=By.xpath("//span[contains(.,'Select Existing Contact')]");
    public static By searchexitingcontact=By.xpath("//input[contains(@placeholder,'Search Existing Contacts Name')]");
    public static By addcontactcampaign=By.xpath("//span[contains(@aria-label,'select-row-7432237')]");
    
    public static By addnewcontactcampaign=By.xpath("  //a[contains(.,'Add New Contact')]");
    
    public static By campaigncontacttext =By.xpath("//div[.='crmhannan Md.Abdul']");
    
    public static By campaignsettingtext=By.xpath("//button[contains(.,'Text')]");
    public static By campaignsettingtextarea=By.xpath("//textarea[contains(@class,'materialize-textarea')]");
    public static By campaigntextpersonalized=By.xpath(" //div[contains(@id,'personalize-select')]");
    public static By campaigntextpersonalizedselect=By.xpath("//li[contains(.,'My virtual number')]");
    public static By campaignsetfollowupsms=By.xpath("//a[contains(.,'Set Followup SMS')]");
    
    public static By campaigsmsedit=By.xpath("//p[contains(.,'Send a sms')]");
    public static By campaigsmseditbutton=By.xpath("//div[@class='MuiCollapse-root MuiCollapse-entered']//a[@class='active mr-4'][normalize-space()='Edit']");
    public static By smsfollowupmodaltext=By.xpath("//h2[contains(.,'SMS Followup')]");
    public static By smseditmodalclose=By.xpath("//a[@class='close_btn']");
    
    public static By startcampaign=By.xpath("//a[normalize-space()='Start Campaign']");
    public static By startcampaignyes=By.xpath("//button[contains(.,'Yes')]");
    
    
    public static By runningcampaigtext=By.xpath("//div[@class='Switch Switch-0 Off d-flex align-items-center']//span[@class='On'][normalize-space()='RUNNING']");
  
  
  
  

  
  
    
  
    
    
  
    
  
    
    
 
    
    
    
    
    
    
    
    
    
    
    
    
}
