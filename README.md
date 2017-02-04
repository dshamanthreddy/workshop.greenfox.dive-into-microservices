# Requirements

The following software is required in order to follow the projects of this workshop:

## General

* Download the [docker images (activemq.tar & mongo.tar) from Google Drive](https://drive.google.com/drive/folders/0B2mQ6hpDchcQLU5ud0pMZFhPTk0?usp=sharing)
* Use these OS specific helper tools to install software more easily:

### Windows

Install the package manager [Chocolatey](https://chocolatey.org/install) by using cmd or PowerShell.

### MacOS

Install the package manager [homebrew](http://brew.sh/) by using the Terminal.


## Java 8 (JRE or JDK)
  * Windows: `choco install jre8`
  * MacOS: `brew update && brew cask install java`
  * Linux: [Download & install](https://www.java.com/en/download/help/linux_x64_install.xml)

Verify if Java is working by running `java -version` in the terminal. It should give you an output similar to this:

```
java version "1.8.0_102"
Java(TM) SE Runtime Environment (build 1.8.0_102-b14)
Java HotSpot(TM) 64-Bit Server VM (build 25.102-b14, mixed mode)
```

## Maven
  * Windows: `choco install maven`
  * MacOS: `brew update && brew install maven`
  * Linux: `sudo apt-get install maven` (Ubuntu)

Verify if maven is working by running `mvn -version` in the terminal. It should give you an output similar to this:

```
Apache Maven 3.3.9 (bb52d8502b132ec0a5a3f4c09453c07478323dc5; 2015-11-10T17:41:47+01:00)
Maven home: /usr/local/Cellar/maven/3.3.9/libexec
Java version: 1.8.0_102, vendor: Oracle Corporation
Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "mac os x", version: "10.11.5", arch: "x86_64", family: "mac"
```

## Eclipse IDE
  ![Download Eclipse](images/eclipse_download.jpg)
  1. Choose your OS
  2. Download "Eclipse IDE for Java Developers" with the link on the right
  3. Extract the archive and you are done (you can start Eclipse by clicking the ![Eclipse executable](images/eclipse_executable.jpg) executable)

## Docker

* Windows
  * [64bit Windows 10 Pro, Enterprise and Education](https://docs.docker.com/docker-for-windows/) ★
  * [Any other Windows version](https://docs.docker.com/toolbox/toolbox_install_windows/)
* MacOS:
  * [10.11 or newer](https://docs.docker.com/docker-for-mac/) ★
  * [10.10 or older](https://docs.docker.com/toolbox/toolbox_install_mac/)
* [Linux](https://docs.docker.com/engine/installation/#/on-linux) ★

*★ Install the "stable channel"*

Verify if *docker* is working by running `docker --version` in the terminal. It should give you an output similar to this:

```
Docker version 1.13.0, build 49bf474
```
## Docker Compose

You only have to do the following steps if you have one of the following systems + version:

* Windows
  * 64bit Windows 10 Pro, Enterprice and Education
* MacOS
  * 10.11 or newer
* Linux


1. Open a terminal
2. Execute the following command

  ```
  curl -L "https://github.com/docker/compose/releases/download/1.10.0/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
  ```
  *If you have problems using this command, [try this](https://docs.docker.com/compose/install/#/alternative-install-options).*
3. Set the permissions `chmod +x /usr/local/bin/docker-compose`

Verify if *docker-compose* is working by running `docker-compose --version` in the terminal. It should give you an output similar to this:

```
docker-compose version 1.10.0, build 4bd6f1a
```

## MongoChef

GUI for MongoDB.

*Note*: When asked while installing: You use the free version for educational purposes.

* [Windows](http://3t.io/mongochef/download/core/platform/#tab-id-1)
* [MacOS](http://3t.io/mongochef/download/core/platform/#tab-id-2)
* [Linux](http://3t.io/mongochef/download/core/platform/#tab-id-3)



---


# Workshop: Dive Into Microservices


## What is a Microservice?

* Basic idea
* Monolith vs Microservices
* Amazon
* Netflix



---



## Microservices at Synoa

* At Synoa we use the following technolgies to create Microservices for mid-sized companies:


### Maven

* Build automation and dependency management


### Apache Camel

* Rule-based routing and mediation engine that provides an API to use Enterprise Integration Patterns


### Docker

* Software container, virtualization
* Hello World
* docker-compose
* Start MongoDB


### MongoDB

* Relation vs non-relational (NoSQL) databases


### ActiveMQ

* Message broker based on Java Message Service (JMS)



---



## Projects

### Microservice 1: Import customers

* Read a XML file with customer data
* Transform the data
* Save the data into MongoDB
* Send a message to ActiveMQ


### Microservice 2: Transform customers

* Read a message from ActiveMQ
* Read the imported customer from MongoDB
* Split the customer-list into single transformed customers
* Save the transformed customers into MongoDB


### Microservice 3: Customer API

* Read the transformed customers from MongoDB
* Create a REST API



---



## Resources

* https://martinfowler.com/microservices
* https://www.youtube.com/watch?v=wgdBVIX9ifA
