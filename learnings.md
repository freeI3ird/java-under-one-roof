## Java

### Basics
1. JAVA_HOME
   - Environment variables used by third party softwares such as tomcat, maven to locate the java.
   - Not used by java itself.
   - Value: Path to Java-installation-dirc/jdk-dirc.




### Build Process
1. Defination:
   - Taking relevant source code files, compiling them, running automatic tests on them, producing the build artifacts(binaries, executables, distribution packages).
   - Converting human-readable source artifacts to machine readable artifacts.

2. Many build tools are present to automate this whole process.
3. We can perform all the operations in build process manually but it could be error prone and tricky job for big-projects.
### Intellij


### Maven
1. Used to build projects.
   - Handles dependencies and versions automatically via pom.xml
   - Reduces manual effort.
2. Official: https://maven.apache.org/index.html

### Pom


### Dropwizard Service


### Apache-Superset
1. To start a development web server on port 8088, use -p to bind to another port
  - `superset run -p 8088 --with-threads --reload --debugger`
