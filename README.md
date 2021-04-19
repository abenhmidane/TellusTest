# Description
This is a the repos  for  **Tellus test** .


# I UI Test Appium automated test.

**Explanation** : I had trouble sideloading android Giphy app on the emulator because the application uses a native library and you have to know exactly witch is the architecture that was build on to be able to select the right image. So i decided to do the same login on a similar app witch is **Pinterest** that i have succeeded to load on the emulator to be able to do the test.

**Repos Link:** https://github.com/abenhmidane/TellusTest/tree/main/AppiumTest
Is a java maven project that run a login test on pinterest app and validate that it passed. It run also a wrong login test and test that the error message is present.

**Videos proof**
<blockquote class="imgur-embed-pub" lang="en" data-id="a/MtMpcM0"  ><a href="//imgur.com/a/MtMpcM0">Intereview Question</a></blockquote><script async src="//s.imgur.com/min/embed.js" charset="utf-8"></script>

*Prerequesites*
- Having Appium Server installed.
- Having Avd Emulator witch connected device running.

*How to run it*
- Through maven = mvn clean test.
- Through IDE, i do recommand intellij ( importing the project and running the tests from the src/java/test folder).



# II API test 
**Repos Link:**https://github.com/abenhmidane/TellusTest/tree/main/tellusApiTest
You can switch from one to another by clicking a file in the tree.


*Prerequesites*
- Having ruby, and rails installled.
- Running bundle install from the folder root.

*How to run it*
from root folder
maven = rspec /spec/## **giphy_search_test.rb**

**The only code that was implemented  is here : https://github.com/abenhmidane/TellusTest/blob/main/tellusApiTest/spec/giphy_search_test.rb**

**Explanation** : There is an issue with the API Key to get a prod ready functionnal Key you have to do a request and show them that you have at least a working app or else your key will be rejected witch is the case ( i have 403 forbidden). So i was not able to do further request and test the search.

## III. SQL
**Answer:
SELECT  
*  
FROM  
products  
WHERE  
products.product_type = "laptops"  
AND price < 2000**

## IV.Test Scenarios

 - 1-As a giphy user i'am able to search for only sticker.
 - 2-As a giphy user i'am able to search for only gifs.
 - 3-As a giphy user i'am able to search for both gifs and sticker at the same time.
 - 4-As a giphy user i'am able to specify the theme of the search before searching for a gif or sticker.
 - 5-As a giphy user i'am able to filter search by adult content or not.
 - 6-As a giphy user i'am able to filter search by lang.
 - 7-As a giphy user i'am able to search content by userTag.

