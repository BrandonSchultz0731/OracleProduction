# OracleProduction
Java Project- Step 1
Welcome to the Oracle Production Java Application! This program demonstates the use of abstract classes, interfaces, enums,
implementation, and how they all interact with each other. This application is a console-based program that allows the user
to create produtcs specified by the user. A user can create either an AudioPlayer or a MoviePlayer product. A user will be asked to select whether they want to add a product to a list, display total amount of products produced, or display the collection of products produced.

#Using the Program
Once the program is running on the console, the user will be prompted with 3 options to choose from:
1) "Enter 1 to: Add a product"
2) "Enter 2 to: Display total items produced"
3) "Enter 3 to: Display collection of all items"
4) "Enter any other number to quit"

If "1" is entered:
-The user will be asked to enter a name they would like to give to the product.
-The user will be asked whether they want to create a MoviePlayer ("1") or AudioPlayer ("2").
-If MoviePlayer is selected, the user will have to enter 4 pieces of data: Screen resolution ("720x1080"), Refresh Rate (In Hz. ex. "44"), Response Time ("33"), Monitor Type (Either "LED" or "LCD").
-If AudioPlayer is selected, the user will have to enter only 1 piece of data: Audio Spec ("MP3","WAV",etc.)
-Once completed, the procuct will be added to the collection.

If "2" is entered:
-The console will print out the total number of products the user created.

If "3" is entered:
-The console will print out all the products to the screen and info about each product, including date/time created, name, etc.

If any other number is selected:
-The program will end

If a string is entered:
-The program will catch the invalid input and ask the user to try again, repeating the program.


#Definitions
Interface Item:
This type of class is called an Interface. An interface is similar to that of an abstract class, as in you can not create an instance
of the class, however, unlike abstract classes, you can not create method bodies in an interface. Instead, an interface is used to
define methods to be used in other classes, like abstract classes.

Abstract Class com.company.Product:
This class is an abstract class, which means that this class can not be instantiated, so no object can be created from this
class. The methods used in this class are from the ones defined in our Item interface, so now we implement them in this class.

Enum ItemType:
Enums are nothing more than the ability to represent a list of constants that can be implemented in other classes, like interfaces.
By creating a list, we can use these values in another class as constants, which we will soon implement in later steps.

CollectionDriver Class
This class shows that we can create objects of type AudioPlayer and MoviePlayer and add each of those objects into an ArrayList. From that ArrayList, we are able to sort the items in the list using the Collections.sort() method in which we put the ArrayList in. To sort this ArrayList, we implement the Comparable<> class in Product and override thr compareTo() method, which then returns an int based on the sorting of whats in the ArrayList by name;
