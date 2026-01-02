import java.util.Scanner;
public class CoffeeMachine{
public static void main (String args[]){
double espresso = 1.50; 
double latte = 2.50;
double cappuccino = 3.00;
double penny = 0.01;
double dime= 0.10;
double nickel = 0.05;
double quater = 0.25;
int water = 300;
int milk = 200;
int coffee = 100;
double money = 0;
int dimesc  ;
int pennyc  ;
int nickelc  ;
int quaterc ;
double total;
String nextorder;

String input;
do{
System.out.println("\n\n\t\tWelcome to Coffee Wagera\n ");
System.out.println("What would you like to have ? select from 1 - 3 ");
System.out.println("1. espresso\t\t1.50$\n2. latte\t\t2.50$\n3. cappuccino\t\t3.00$");

Scanner answer = new Scanner (System.in);
 input = answer.nextLine();


if(input.equals ("1") || input.equalsIgnoreCase ("espresso")){
if (water >= 50 && coffee >=18){
System.out.println("\nPlease pay the coins on counter --> ");
System.out.println("how much Penny you have ? ");
pennyc = answer.nextInt();
System.out.println("how much Dimes you have ? ");
dimesc = answer.nextInt();
System.out.println("how much Quater you have ? ");
quaterc = answer.nextInt();
System.out.println("how much Nickel you have ? ");
nickelc = answer.nextInt();

double cpenny = penny*pennyc; 
double cdime = dime*dimesc; 
double cnickel = nickel*nickelc; 
double cquater = quater*quaterc; 
total = cpenny+cdime+cnickel+cquater;
System.out.println("\nYou paid :" +(float)total+"$");

if(espresso <= total){
water = water - 50;
coffee = coffee - 18;

double change = total - espresso;
money += espresso;
System.out.println("Here is your change --> "+(float) change+"$"+"\n\nEnjoy your espresso!");}
else{
System.out.println("\nSorry, you have less amount to fullfil your order. \nHere is your money back :"+(float)total+"$");}}

else {System.out.println("\nSorry, the ingredients are out of stock");}}

else if(input.equals ("2")|| input.equalsIgnoreCase ("latte")){
if (water >= 200 && coffee >=24 && milk >= 150){
System.out.println("\nPlease pay the coins on counter --> ");
System.out.println("how much Penny you have ? ");
 pennyc = answer.nextInt();
System.out.println("how much Dimes you have ? ");
 dimesc = answer.nextInt();
System.out.println("how much Quater you have ? ");
 quaterc = answer.nextInt();
System.out.println("how much Nickel you have ? ");
 nickelc = answer.nextInt();


double cpenny = penny*pennyc; 
double cdime = dime*dimesc; 
double cnickel = nickel*nickelc; 
double cquater = quater*quaterc; 
total = cpenny+cdime+cnickel+cquater;
System.out.println("\nYou paid :" +(float)total+"$");
if(latte <= total){
water = water - 200;
coffee = coffee - 24;
milk = milk - 150;
double change = total - latte;
money += latte;
System.out.println("Here is your change --> "+(float) change+"$"+"\n\nEnjoy your latte!");}
else{
System.out.println("\nSorry, you have less amount to fullfil your order. \nHere is your money back :"+(float)total+"$");}}
else {System.out.println("\nSorry, the ingredients are out of stock");}}

else if(input.equals ("3")|| input.equalsIgnoreCase ("cappuccino")){
if (water >= 250 && coffee >=24 && milk >= 100){
System.out.println("\nPlease pay the coins on counter --> ");
System.out.println("how much Penny you have ? ");
 pennyc = answer.nextInt();
System.out.println("how much Dimes you have ? ");
 dimesc = answer.nextInt();
System.out.println("how much Quater you have ? ");
 quaterc = answer.nextInt();
System.out.println("how much Nickel you have ? ");
 nickelc = answer.nextInt();

double cpenny = penny*pennyc; 
double cdime = dime*dimesc; 
double cnickel = nickel*nickelc; 
double cquater = quater*quaterc; 
total = cpenny+cdime+cnickel+cquater;
System.out.println("\nYou paid :" +(float)total+"$");
if(cappuccino <= total){
water = water - 250;
coffee = coffee - 24;
milk = milk - 100;
double change = total - cappuccino;
money += cappuccino;
System.out.println("Here is your change --> "+(float) change+"$"+"\n\nEnjoy your cappuccino!");}
else
System.out.println("\nSorry, you have less amount to fullfil your order. \nHere is your money back :"+(float)total+"$");}
else 
System.out.println("\nSorry, the ingredients are out of stock");}




else if (input.equalsIgnoreCase ("Report"))
{System.out.println("\nWater : " +water+" ml" +"\nMilk : "+milk+" ml"+"\nCoffee : "+coffee+" g"+"\nToday's Sales : "+(float)money+"$\n");}


else if (input.equalsIgnoreCase ("Deposit")){
System.out.println("\n\n\t\tJack's Store deals!\n\n  Deal 1\t1.79$\n \n-Milk 100ml\n-Coffee 50g\n-Water 120ml\n  \nDeal 2\t\t2.59$\n \n-Milk 180ml\n-Coffee 75g\n-Water 220ml ");

System.out.println("\nSelect the deal 1 or 2");
Scanner deal = new Scanner (System.in);
int deals = deal.nextInt();

if(deals == 1){
if(money >= 1.79){
water = water + 120;
milk = milk + 100;
coffee = coffee + 50;
money = money - 1.79;
System.out.println("\n\t\tThanks for Shopping!\n");}
else {System.out.println("You dont have enough money to buy the deal");}}
else if(deals == 2){
if(money >= 2.59){
water = water + 220;
milk = milk + 180;
coffee = coffee + 75;
money = money - 2.59;
System.out.println("\n\t\tThanks for Shopping!\n");}
else {System.out.println("You dont have enough money to buy the deal");}}
else 
System.out.println("You entered the wrong deal");
}
else{System.out.println("You entered wrong order");}

Scanner temp = new Scanner (System.in);
System.out.println("Do you want to order again? Yes or No");
nextorder = temp.nextLine();
}
while(nextorder.equalsIgnoreCase ("Yes"));



}}







/*



if (input.equals ("Deposit") || input.equals ("deposit")){
System.out.println("\n\n\t\tOur premium deals!\n  Deal 1\t1.79$ \n-Milk 100ml\n-Coffee 50g\n-Water 120ml\n  Deal 1\t2.59$ \n-Milk 180ml\n-Coffee 75g\n-Water 220ml );}

*/