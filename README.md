# blog

<img src="https://img.shields.io/badge/created by-Sophie Zhang-orange.svg">
<img src="http://progressed.io/bar/21?title=progress">

## What the blog is about?
* The intention of the creation of this blog is to practice and go through all the 
steps in the production of Java Web applications. As my understanding of spring 
framework and other web development tools keep increasing, I'll keep adding more 
features and introduce more plugins and dependencies.

## Features the blog holds right now
* Displaying preloading articles that is created using CommandLineRunner in in-memory
database H2.
* Jump to single article detail page on clicking the title of each articles.
* Displaying self-introduction of the creator.

## Dependencies of the blog

<img src="https://img.shields.io/badge/maven-v4.0.0-green.svg">  
<img src="https://img.shields.io/badge/spring%20framework-v2.1.3-brightgreen.svg">  
<img src="https://img.shields.io/badge/java-v1.8-blue.svg">  
<img src="https://img.shields.io/badge/Junit-jupiter-yellowgreen.svg">  
<img src="https://img.shields.io/badge/database-H2-yellow.svg">

## Deploy the application

* Git clone the repository
* import pom.xml file 

## Structure of files

```
├───.idea
│    
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───example
│   │   │           └───blog     // Java files
│   │   │               ├───controller
│   │   │               ├───entity
│   │   │               └───service
│   │   └───resources
│   │       └───templates        // Views
│   └───test
│       └───java
│           └───com
│               └───example
│                   └───blog     // Test files
└───target
    └───classes
        └───com
            └───example
                └───blog         // Class files
                    ├───controller
                    ├───entity
                    └───service
        

