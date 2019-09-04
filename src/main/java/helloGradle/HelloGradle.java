package helloGradle;

import org.joda.time.LocalTime;

/*
    This is the "Building Java Projects with Gradle" starter from spring.io
    https://spring.io/guides/gs/gradle/
 */
public class HelloGradle {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
