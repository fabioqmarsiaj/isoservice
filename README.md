# Exposing a simple FM Radio service through API
**by Fabio Marsiaj**

In this project we provide access from the ISOBAR FM Radio through a simple API made with Spring.
We can get informations about Bands, Albums and its tracks!

## Summary

  - [Introduction](#introduction)
  - [Running The App](#running-the-app)
  - [Authors](#authors)

  ## Introduction

   The backend is made with Java8 and the Spring Framework.
   The architecture have three layers: controller, model and service.

   On our models we define the entities: Band, Album and Track.
   Our controller layer is the entry point from the application, but we get the informations from Isobar FM Radio by using our Service layer and RestTemplate.

   All the request are optimized using Cache, so we get informations faster after the first request :)

  ## Running the App

   I deployed the application on Heroku, it's a straight forward way to do so.

   So you can check the main URL at: https://isoservice.herokuapp.com/

   There are three endpoints you can have fun with:

   GET THE BANDS INFO:
   https://isoservice.herokuapp.com/fmservice/bands

   GET THE A SINGLE BAND INFO BY ID:
      https://isoservice.herokuapp.com/fmservice/bands/{bandId}

      **You can check using the first endpoint**

   GET THE BANDS INFO:
       https://isoservice.herokuapp.com/fmservice/albums
   ## Authors

   **Fabio Quinto Marsiaj** -  [GitHub](https://github.com/fabioqmarsiaj)

   <a href="https://github.com/fabioqmarsiaj">
        <img
        alt="Imagem do Autor Fabio Marsiaj" src="https://avatars0.githubusercontent.com/u/34289167?s=460&v=4" width="100">
  </a>

