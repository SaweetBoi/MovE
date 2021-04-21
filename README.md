# MovE
A Movie database hub

![App logo](logo/Mov-e.png)

Mov-E is a Kotlin based application built on Android Studio.

### Tables of Content
- [Description](#description)
- [how to configue](#configuration)
- [how to install](#installation)
- [Instructions](#instructions)
- [list of files](#files)
- [Copyright](#copyright)
- [Bugs](#bugs)
- [Troubleshooting](#troubleshooting)
- [Credits and Acknowledgement](#credits)

# Description
Mov-E is a kotlin based application built on Android Studio. The app uses themoviedb.org API to retrieve the popular/new movies and provide the user with the movie details. The app uses MVVM(Model-View-ViewModel) architecture. This helps remove the glue code in the application and provides for better testing and usability. The User can view endless list of Popular/top-rated/new-release movies with all the details sucha s the relaese date, budget, revenue, and an overall information about various movies. To check a list of popular movies, the user selects popular from the nav bar and can scroll through a number of popular movies. By clicking on any movie from the list the user can see the different details about the movie selected.
Here are some screenshots

<p float="left">
  <img src="screenshots/Screenshot%20from%202021-04-20%2021-47-17.png"/>
  <img src="screenshots/Screenshot%20from%202021-04-20%2021-47-33.png"/> 
  <img src="screenshots/Screenshot%20from%202021-04-20%2021-47-48.png"/>
</p>

Libraries Used:
- [Retrofit](#library) : REST Client for android applications
- [RxJava](#library) : for asynchronous events
- [pagination](#library) : For endless scrolling

### The application was built using:
- [Kotlin](#kotlin)
- [RxJava](#RxJava)
- [Retrofit](#retrofit)
- [MVVM architecture](#MVVM)
- [themoviedb.org REST API](#api)

# how to configue
Configuring the app is easy as it follows a unidirectional flow system. This is possible because of the MVVM architecture. You can use this app in vertical as well as horizontal layout. The home page displays the popular movies and to view the details of a movie, simply click on one. The app then displays the movie details for desired selection by the user. 
Here are a couple of screenshots to better visualize before use.
<p float="left">
  <img src="screenshots/Screenshot%20from%202021-04-20%2021-46-57.png"/>
  <img src="screenshots/Screenshot%20from%202021-04-20%2021-41-41.png"/> 
  
</p>

# Requirements

  Before installing this project, you need
- [Android Studio](#AndroidStudio)
- [RxJava library](#RxJava)
- [Retrofit library](#Retrofit)
- [android avd emulator](#AVD)

# how to install

  You can import this project on android studio by choosing,
  File -> new -> Project from version control -> Github and then enter your username and passowrd. Finally clone this repository. 
  
# Instructions

If you don't have an android device, you will need an emulator to check this application. This app was tested using AVD(Android Virtual Device) manager. 
To install avd manager on your device, follow the guidelines [here](https://developer.android.com/studio/run/emulator).
You will need to follow the instructions [here](https://www.themoviedb.org/documentation/api). It provides with instructions on how to use the REST API provided by themoviedb.org on your terms. 

# list of files
- [MovieDetails.kt](#movied) : array of details used to display using the api
- [TheMovieDBClient.kt](#movie) : request the list of popular movies
- [TheMovieDBInterface.kt](#movie) : user interaction triggers the app to display the movie details for the selected choice
- [MovieDetailsNetworkDataSource.kt](#movie) : check and process the request for a list of popular/latest/high rated movies
- [NetworkState.kt](#movie) : display whether any errors occured due to network problems
- [MovieDetailsRepository.kt](#movie) : class file to trigger back and forth process in the app
- [SingleMovie.kt](#movie) : class file for retriving movie details
- [SingleMovieViewModel.kt](#movie) : MVVM architecture implementation for horizontal/vertical view
- [MainActivity.kt](#movie) : Main activity file

# License

Copyright 2021

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

# Bugs
1) There are a few imporvements to be done in the application. The network state class sometimes doesn't append to a proper string and shows a network error unnecessarily. 


![bug1](screenshots/Screenshot%20from%202021-04-20%2021-45-52.png)

2) Rotating the device in movie details page, triggers a crash sometimes. 

# TroubleShooting

Restart the emulator if the app is stuck on a page. If using an apk on an android device, re-install the apk while any crash occurs.
If any other bugs occur, please provide the details by initiating an issue.

# Credits and Acknowledgement

All credits to themoviedb.org for providing with the API-Key to use their data.
