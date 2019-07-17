Coding Problem: Sales Taxes

Please include all source files, unit tests, readme, batch files, etc. with your solution and e-mail to the person conducting your
technical interview and cc: your recruiter.

Basic sales tax is applicable at a rate of 10% on all goods, except books, food, and medical products that are exempt. Import duty is
an additional sales tax applicable on all imported goods at a rate of 5%, with no exemptions.

When I purchase items, I receive a receipt which lists the name of all the items and their price (including tax), finishing with the total
cost of the items, and the total amounts of sales taxes paid. The rounding rules for sales tax are that for a tax rate of n%, a shelf price
of p contains (np/100 rounded up to the nearest 0.05) amount of sales tax.

Write an application that prints out the receipt details for these shopping baskets:


INPUT (Shopping Baskets)

Input 1:  "itemsbeforetax1.txt" **Done
1 book at 12.49
1 music CD at 14.99
1 chocolate bar at 0.85

Input 2:  "itemsbeforetax2.txt" **Done
1 imported box of chocolates at 10.00
1 imported bottle of perfume at 47.50

Input 3:   "itemsbeforetax3.txt" **Done
1 imported bottle of perfume at 27.99
1 bottle of perfume at 18.99
1 packet of headache pills at 9.75
1 imported box of chocolates at 11.25

Tasks:

**take apart information in line items purchased file "itemsbeforetax1.txt..2...and 3.txt" 

**Convert the string into an integer to be able to calculate tax

**Take apart data via regex

Create classes: InputItems purchased, Output of the items purchased with sales tax total and total(items +tax), to calculate, item, purchased, and main.

10% tax on all goods with additional tax 5% on import goods unless exempt which is 0% tax

Receipt (output) to include cost of items+appropriate tax listed in order with quantity,item,total cost(price+tax with float(will use Double class)
with the total amount of sales tax charged on items listed separate from the receipt total which will display the total itemsbeforetax(purchased/in shopping basket)with applicable tax.


OUTPUT

Output 1:
1 book: 12.49
1 music CD: 16.49
1 chocolate bar: 0.85
Sales Taxes: 1.50
Total: 29.83

Output 2:
1 imported box of chocolates: 10.50
1 imported bottle of perfume: 54.65
Sales Taxes: 7.65
Total: 65.15

Output 3:
1 imported bottle of perfume: 32.19
1 bottle of perfume: 20.89
1 packet of headache pills: 9.75
1 imported box of chocolates: 11.85
Sales Taxes: 6.70
Total: 74.68

I am in progress of writing unittests for this challenge. My primary language is Javascript and Python. 

<iframe height="400px" width="100%" src="https://repl.it/@elizabethbland/LiferayChallenge?lite=true" scrolling="no" frameborder="no" allowtransparency="true" allowfullscreen="true" sandbox="allow-forms allow-pointer-lock allow-popups allow-same-origin allow-scripts allow-modals"></iframe>