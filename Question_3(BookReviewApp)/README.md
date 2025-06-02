# Book Review App (MVP)

This is a simple Book Review App designed for Android devices. The goal of this app is to let users easily explore a list of books, read their details,  
and save their favorite books for offline access. The project is built using Java, following a clean and organized MVVM architecture.

## What This App Can Do

**Browse Books**      : The app displays a list of books fetched from a sample API. Each book shows the title, author, and a simple placeholder image.  
**Read Book Details** : When you tap on a book, you can see more information, including its description, rating,  
                       and a larger image (simulated using a placeholder).  
**Save Favorites**    : If you like a book, you can save it to your favorites. This means the book’s information will be  
                       stored on your device, so you can still see it even when you’re offline.  
**Offline Access**    : Saved books can be accessed without an internet connection.

## How the App is Organized

The app is built with a clear separation of layers:  
**User Interface (UI)** : The screens and layouts that users interact with.  
**ViewModel**          : Manages the data for the UI and handles logic like fetching books and saving favorites.  
**Repository**         : Connects the UI to the data sources.  
**Data Layer**         : Includes an API for fetching books and a local database for storing favorites.

## Technologies Used

Technologies used in this app:  
**Java**              : The programming language used for the app.  
**MVVM Architecture** : A design pattern that separates concerns for better code organization.  
**Retrofit**          : A tool to simulate getting book data from an API.  
**Room Database**     : Stores users' favorite books locally.  
**LiveData**          : Keeps the app’s UI in sync with data changes.

## What You’ll Find in the Project

The project contains:  
- Screens to display the book list, book details, and saved favorites.  
- A simulated API using local data for testing.  
- The ability to save and view books offline.

