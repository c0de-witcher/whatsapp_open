WhatsApp Opener
WhatsApp Opener is an Android application that allows users to open WhatsApp directly with a specified phone number received from other applications through ACTION_PROCESS_TEXT.

Features
Opens WhatsApp with a specified phone number.
Handles phone numbers with or without spaces.
Checks if WhatsApp is installed on the device before opening.


Requirements
Android device running API level 31 or higher.
WhatsApp installed on the device (required to open WhatsApp).
Setup Instructions
Clone the repository:

bash
Copy code
git clone (https://github.com/c0de-witcher/whatsapp_open)
Open in Android Studio:


![Screenshot_2024-07-20-21-53-14-73_54063fc6848ac98a54ce5f2a63661433 1](https://github.com/user-attachments/assets/d8bf61a2-c39a-4ead-8c65-503f7c4f08f1)


https://github.com/user-attachments/assets/4f85aa15-3db8-429f-845e-de983afc2670


Launch Android Studio.
Select "Open an existing Android Studio project."
Navigate to the directory where you cloned the project and select the whatsapp-opener directory.
Run the application:

Connect your Android device or start an emulator.
Click on the "Run" button in Android Studio.
Usage
Launch the application:

The app will launch and wait for input.
Share a phone number to the app:

From another application (like Contacts or Messaging), select a phone number.
Choose "Share" and select "WhatsApp Opener" from the list of apps.
Enter a phone number manually:

Alternatively, you can manually enter a phone number in the provided text field.
Click on the "Search" button:

Clicking the "Search" button will attempt to open WhatsApp with the entered phone number.
Handling results:

If WhatsApp is installed and the phone number is valid, WhatsApp will open with the chat window for that number.
If WhatsApp is not installed or the phone number is invalid, an appropriate message will be displayed.
Contributing
Contributions are welcome! If you find any bugs or have suggestions for improvements, please submit an issue or a pull request.

License
This project is licensed under the MIT License - see the LICENSE file for details.

