My first Selenium UI test. <br>
I got the following task in the application process and 
solved it on my own without any previous knowledge with 
Selenium: <br>
<br>
### Task 1 “Add to cart”
* Visit flaschenpost.de, we assume you have already chosen your ZIP code <br>
* Go to category Wasser, choose Medium and type Dreiser in the textbox named
Markenauswahl. Check the checkbox named Dreiser below. (if you do not find the
brand Dreiser feel free to choose a different one). Add one article to the cart.
* Next, go to category Bier, choose “Radler” and find “Glucks Radler Naturtrüb”. Add 2 articles
in the cart.
* Click “Jetzt bestellen”. In the cart on the right-hand-side reduce the number of “Glucks
Radler Naturtrüb” to one.
  <br><br>
Above steps should mean only a user’s click path. We only want to see you can automate UI
tests. At the end of the UI test you can check if in the cart has got all expected products.
  <br><br>
  ### Task 2 “JSON check”
  When you call this url
  https://flapotest.blob.core.windows.net/test/ProductData.json
  you will see a json file containing some of our products. <br><br>
  Question: How would you proof in an automated way that the format of this json and
  relations between entities have not been surprisingly changed? <br><br>
  You can give us some answers or you can also just show how to do it.<br><br>
  For both tasks you can choose any framework you like. We must be able to run it on a typical OS
  Win10 machine.
  Whenever you have to code something, we ask you to use C# primarily or any quite similar
  programming language. <br><br>
  If you need to buy any services from a company on the internet to make this work, we will reimburse
  you for the cost of up to 50 Euros. Please make sure that the invoice is issued for Flaschenpost SE.