# Organisation Flapdoodle OSS

We are now a github organisation. You are invited to participate.

## de.flapdoodle.pattern

some java regex pattern stuff

### Maven

Stable (Maven Central Repository, Released: 23.06.2013 - wait 24hrs for [maven central](http://repo1.maven.org/maven2/de/flapdoodle/pattern/de.flapdoodle.pattern/maven-metadata.xml))

	<dependency>
		<groupId>de.flapdoodle.pattern</groupId>
		<artifactId>de.flapdoodle.pattern</artifactId>
		<version>1.0.0</version>
	</dependency>

Snapshots (Repository http://oss.sonatype.org/content/repositories/snapshots)

	<dependency>
		<groupId>de.flapdoodle.pattern</groupId>
		<artifactId>de.flapdoodle.pattern</artifactId>
		<version>1.0.1-SNAPSHOT</version>
	</dependency>

### Usage
```java
Pattern pattern = Pattern.compile("(?<start>[a-zA-Z]+):(?<end>[a-zA-Z]+(?<number>[0-9]+))");
Matcher matcher = pattern.matcher("stuff:has42");

Optional<Map<String, String>> match = Patterns.match(matcher);

assertTrue(match.isPresent());
assertEquals("start", "stuff", match.get().get("start"));
assertEquals("end", "has42", match.get().get("end"));
assertEquals("number", "42", match.get().get("number"));	
```

