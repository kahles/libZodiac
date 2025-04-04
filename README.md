# libZodiac
framework providing functionality for building a lunar calendar

This library was created while working on [Mondtag](https://github.com/kahles/mondtag), a lunar calendar for Android.

This is the plain java version - for android develpment, see the android fork [libZodiac4A](https://github.com/kahles/libZodiac4A).

### Import
#### gradle
```groovy
repositories {
    mavenCentral()
}

dependencies {
    implementation 'de.kah2.zodiac:libZodiac:1.3'
}
```

#### maven
```xml
<dependency>
  <groupId>de.kah2.zodiac</groupId>
  <artifactId>libZodiac</artifactId>
  <version>1.3</version>
</dependency>
```
### Usage
- [`CalendarExampleSimple.java`](src/test/java/de/kah2/zodiac/libZodiac/example/CalendarExampleSimple.java) shows basic usage of this framework.
- [`CalendarDataStringBuilder.java`](src/test/java/de/kah2/zodiac/libZodiac/example/CalendarDataStringBuilder.java) shows how to access data. 
- [`CalendarExampleStorage.java`](src/test/java/de/kah2/zodiac/libZodiac/example/CalendarExampleStorage.java) shows how to create, store , load and
extend a calendar.
- [`ProgressListenerExample.java`](src/test/java/de/kah2/zodiac/libZodiac/example/ProgressListenerExample.java) shows how to enable progress 
listening.


### Requirements

#### Java 17

#### gradle
A [gradle](https://gradle.org) build script is included to manage dependencies and automate testing and building. 

#### nova4jmt
Astronomical calculations are done with the help of [libnova](http://libnova.sourceforge.net/) by Liam Girdwood.
There is a "1:1" java port [novaforjava](http://novaforjava.sourceforge.net/) by Richard van Nieuwenhoven, but this can't be used for 
multi-threaded calculations.
So I made a fork containing a fix for this: [nova4jmt](https://github.com/kahles/nova4jmt).

#### JUnit
I'm trying to provide a reasonable test coverage using [JUnit](http://junit.org).

#### slf4j
For logging [slf4j](http://www.slf4j.org/) is in use.

### Versions
The plugin [gradle-android-git-version](https://github.com/gladed/gradle-android-git-version) is used to automate versioning based on git 
and also works well in a non-Android java project.

The resulting versions may look like:
#### Releases ####
Here it's only the release-tag:
```
0.9.1
```
#### Snapshots #### 
```
0.9.1-3-d3d1f17-feature-dirty
```
* `0.9.1` is the last version tag
* `4` number of commits since last tag
* `48a2119` is the last git commit revision
* `feature` is the branch this version was built of and only appears if it was a feature-branch, and not `master` or `devel`
* `-dirty` appears if this build contains uncommitted changes
* maven versions end with `-SNAPSHOT`

### Further references
- Book: [Vom richtigen Zeitpunkt](http://www.paungger-poppe.com/index.php/de/publikationen/unsere-buecher/vom-richtigen-zeitpunkt) This book
also is available in other languages, the English version is called "The Power of Timing".

### License
This project is licensed under the GNU General Public License v3. See [LICENSE](LICENSE) for details.

### Warranty
Although I implemented this software to the best of my knowledge, I am not able to guarantee the completion, correctness and accuracy of the
algorithms.

### Contact
Feel free to contact me if you have wishes, proposals, bug reports or if you want to contribute.