# Programming Language II
The language used here will be Java.

## Projects
1. Drink Vending Machine
2. Telephone Directory
3. Grades Manager
4. Products Manager

## Drink Vending Machine
When the user starts the application/Program with the default code. This will appear:
```
Hello :) your options are:
[1] Water - $0.99
[2] Cola - $7.99
[3] Guarana Soda - $6.99
[4] Lemon Juice - $6.99
[5] Orange Juice - $6.99
[6] Strawberry Juice - $9.99
[7] Hot Coffee - $2.99
[8] Iced Coffee - $2.99
[9] Hot Macchiato - $19.99
[10] Iced Macchiato - $19.99
[11] Hot Cappuccino - $13.99
[12] Iced Cappuccino - $13.99
[13] Hot Green Tea - $4.49
[14] Hot Black Tea - $5.99
[15] Iced Black Tea - $5.99
[16] Hot Mint Tea - $5.99
[17] Iced Mint Tea - $5.99

Which drink would you like to drink?
```

Let's pretend the following situation:<br>
The user chose the eighth drink.
```
Which drink would you like to drink? 8
Money to put in the machine: 
```

The user put $1 in the machine.
```
Which drink would you like to drink? 8
Money to put in the machine: 1
The money isn't enough to buy that drink. Would you like to put more money in the machine? (y/n):
```

$1 is not enough to buy that drink. So, the user chose to put more money in the machine.
```
Which drink would you like to drink? 8
Money to put in the machine: 1
The money isn't enough to buy that drink. Would you like to put more money in the machine? (y/n): y
Money to put in the machine: 2
```

$3 is enough to buy that drink. So, this will happen:
```
################################################
Iced Coffee - $2.99
Thanks for the preference. See you next soon. ;)
Change: $0.01
################################################
```
---
Developed by Renzo Zukeram