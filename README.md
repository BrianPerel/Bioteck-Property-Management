# Bioteck-Property-Management

Blue Team - HW4 model and HW5 API's


Property Management App 

The Problem:
-We need a program that will keep track of finances, properties, candidates, and current tenants of 2 Apartment Complexes 
-1 apartment complex is in Los Angeles and 1 is in Boston 
-We will create a web site that can take down candidate information for apartments and store that data along with current renter and finance information in a database 
-Different User's will have different views of database; if candidate comes to page he will see regular candidate form page, apartment complex and apartment informational page.
If Owner comes to page he will click on the finances page, login, and see finance, tenant, and candidate information  

Our Vision: 
-Ideally we want to have different windows (views) for different people:
	-Candidates, The Property Owner, The Book Keeper / finance person 
	
Our Approach:
-Break up the different portions of the site 
-Have an application form page for the candidates to fill out 
-Have a page for room information and offerings 
-Have a page for viewing finances (book keeper and Property Owner)


Idea / Goal:
-Create a full functioning website that takes information from a website, puts it into a database when user clicks various buttons, and have the structure of the database be controlled by an Object Oriented Java Model in the back-end 


-Start with a Java OOP model with a set of classes 
	-have input validation
-Create a database in mySQL 
-Use Hibernate ORM framework for object relational mapping to map our object oriented domain model to a relational db
-Create web pages using HTML, CSS, JavaScript
-Use AngularJS to make the pages dynamic, allowing the data to be placed into the database 

-Project goes from backend to middleware to frontend 
