## simpleapi
Sandbox for playing with java restful services

Using:
* Java
* Maven
* Jersey
* Jackson
* Vagrant
* Ansible

### requirements
These need to be installed to fully use this sandbox:
1. [jdk](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
2. [maven](http://maven.apache.org/download.cgi)
3. [virtualbox](https://www.virtualbox.org/wiki/Downloads)
4. [vagrant](http://www.vagrantup.com/downloads.html)

### setup
This section outlines how to build and run this project

First build the .war with maven (assuming you're at the project root)
```
mvn package
```

Then start the web and db servers using vagrant
```
cd vagrant
vagrant up
```

This can take a little while. If it exits without error, your boxes are up and running!

Try hitting "http://192.168.33.191:8080/simpleapi/api/v1/hello" to verify functionality