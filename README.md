# sek-usage

Gradle project example of Sek library usage in Java for Kotlin `Sequence`.

```
git clone https://github.com/tinyield/sek-usage.git
cd sek-usage
gradlew run
```

Output:
```
505 by Arctic Monkeys
Mural by Lupe Fiasco
```

This demo runs the following code snippet:

```java
Sek<Song> songs = Sek.of(
            new Song("505", "Alternative"),
            new Song("Amsterdam", "Alternative"),
            new Song("Mural", "Hip-Hop"));

Sek<Artist> artists = Sek.of(
            new Artist("Arctic Monkeys", "band"),
            new Artist("Nothing But Thieves", "band"),
            new Artist("Lupe Fiasco", "solo-artist"));

songs
    .filterNot(song -> song.getName().startsWith("A"))
    .map(Song::getName)
    .zip(artists.distinctBy(Artist::getKind).map(Artist::getName))
    .map(pair -> String.format("%s by %s", pair.getFirst(), pair.getSecond()))
    .forEach(System.out::println);
```