# jcaTemplate (Java Console Application Template)

**jcaTemplate** is a small and simple project that allows you to start coding a
console application without caring about most of the typical configurations. It
uses **[Gradle](https://gradle.org)** *8.4* as a build tool, where the required
plugins and useful dependencies have been included.

## Plugins

- **Checkstyle**, with a slightly modified *Sun Code Conventions* configuration
  file
- **Lombok**, with its corresponding annotation processor dependencies

## Dependencies

- **Guava** *(32.1.3-jre)*
- **Log4j** *(2.21.1)*, including **SLF4J** implementation support
- **JUnit Jupiter** *(5.10.1)*
- **mockito** *(5.7.0)*
- **AssertJ** *(3.24.2)*

## Usage

To start coding a new console application with this template, clone the
repository.

``` bash
git clone https://github.com/devourerOfBits80/jcaTemplate.git
```

Then open the project folder in your favorite IDE and enjoy further activities.
If you want to change the name of the package (the default is
*org.devourerofbits80.jcatemplate*), you can do it, but keep in mind that you
also need to update the *build.gradle* file accordingly (lines 24 and 51).
