My first Selenium UI test. <br>
I got the following task in the application process and 
solved it on my own without any previous knowledge with 
Selenium: <br>
<br>
Task 1 “Add to cart” <br>
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
