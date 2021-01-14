## Continuous Delivery with Docker and Jenkins
This is the code repository for [Continuous Delivery with Docker and Jenkins](https://www.packtpub.com/networking-and-servers/continuous-delivery-docker-and-jenkins?utm_source=github&utm_medium=repository&utm_campaign=9781787125230), published by [Packt](https://www.packtpub.com/?utm_source=github). It contains all the supporting project files necessary to work through the book from start to finish.
## About the Book
The combination of Docker and Jenkins improves your Continuous Delivery pipeline using fewer resources. It also helps you scale up your builds, automate tasks and speed up Jenkins performance with the benefits of Docker containerization.

This book will explain the advantages of combining Jenkins and Docker to improve the continuous integration and delivery process of app development. It will start with setting up a Docker server and configuring Jenkins on it. It will then provide steps to build applications on Docker files and integrate them with Jenkins using continuous delivery processes such as continuous integration, automated acceptance testing, and configuration management.


## Instructions and Navigation
All of the code is organized into folders. Each folder starts with a number followed by the application name. For example, Chapter02.



The code will look like the following:
```
 pipeline {
      agent any
      stages {
           stage("Hello") {
                steps {
                     echo 'Hello World'
                }
           }
      }
 }
```

Docker requires the 64-bit Linux operating system. All examples in this book have been
developed using Ubuntu 16.04, but any other Linux system with the kernel version 3.10 or
above is sufficient.

## Related Products
* [Continuous Delivery and DevOps – A Quickstart Guide - Second Edition](https://www.packtpub.com/application-development/continuous-delivery-and-devops-–-quickstart-guide-second-edition?utm_source=github&utm_medium=repository&utm_campaign=9781784399313)

* [Continuous Delivery and DevOps: A Quickstart guide](https://www.packtpub.com/virtualization-and-cloud/continuous-delivery-and-devops-quickstart-guide?utm_source=github&utm_medium=repository&utm_campaign=9781849693684)

* [Learning Continuous Integration with Jenkins - Second Edition](https://www.packtpub.com/virtualization-and-cloud/learning-continuous-integration-jenkins-second-edition?utm_source=github&utm_medium=repository&utm_campaign=9781788479356)
