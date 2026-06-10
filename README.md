# IMAD5112-Practicum-2026-Semester1

1.	Purpose of the App
A smartphone app called Campsite Commander was created to assist campers in planning and managing their food and camping gear prior to a trip.

Users of the app can add camping equipment, classify items, keep track of quantities, and add comments or notes for each item. It helps users keep track of everything they need for their outdoor journey by offering a comprehensive packing checklist.

The application allows users to:
•	Add camping gear
•	Store data using parallel arrays
•	View all packed items
•	Calculate total items packed
•	Navigate between screens

2. The app’s objectives
Before embarking on a camping vacation, Campsite Commander's primary goal is to assist users in managing and organizing camping supplies and equipment.

Particular goals consist of:
•	Permit users to add goods and equipment for camping.
•	 Use parallel arrays to store item information.
•	 Sort camping supplies into categories including food, shelter, cooking, and safety.
•	 Show a thorough packing checklist.
•	 Use loops to determine and show the total number of packed items.

3. Design Considerations
During development, a number of design factors were taken into account:

•	Simplicity:
Users can easily add and examine camping goods thanks to the application's straightforward interface.

•	Readability:
To increase readability, large writing, legible labels, and well-organised layouts were employed.

•	Regularity:
Throughout the application, a uniform colour palette and button design with a camping theme were employed.

•	Performance:
To effectively store and retrieve item information, parallel arrays were employed.

•	Availability:
To aid users in understanding their purpose, input areas and buttons are designated properly.

•	Navigating:
Buttons with clear labels made switching between screens simple.

3.1 Design of User Interfaces
The subject of the user interface is outdoor adventure and camping.

The Splash Screen: 
•	Shows the logo of Campsite Commander.
•	Displays the title of the program.
•	 Shows a loading indicator.
•	 After three seconds, it automatically switches to the main screen.

The main screen:
•	Shows how many things are packed in total.
•	Has input fields for:
•	Name of the item
•	Category
•	Amount
•	 Remarks
•	 Has a button to add gear.
•	Has a button to view the packing list.
•	
Screen for Detailed View:
•	Shows every camping item that has been stored.
•	Displays the item's name, quantity, category, and remarks.
•	Has a Back to Base button for going back to the Main Screen.

3.2 User Experience (UX)
The program was created to offer a satisfying and easy-to-use experience.
•	Simple Navigation
Buttons with clear labels make it simple for users to switch between screens.
•	Fast Data Input
Users can easily add new camping equipment by using input fields.

4. Handling Errors
Error management is incorporated into the program to enhance usability and avoid crashes.

Fields That Are Empty

The system verifies that every field has been filled out.

For instance:
A message is displayed if a user leaves any field empty:

"Please fill out every field."

Incorrect Quantity Input

Only numerical numbers are accepted in the quantity field.

5. Testing

Throughout the development process, testing was done to make sure every feature operated as intended.

Testing Splash Screens

Anticipated outcome:
* The splash screen appears as intended.
* After three seconds, the application navigates to the main screen.

Outcome:
passed.

6. Technologies used

•	Kotlin
•	Android Studio
•	GitHub (Version Control)
•	GitHub Actions (Automated Build)
