# Test with Kotlin

Kotlin is a JVM language, created by JetBrains, that is quite popular these days.
You can already find some feedback about it [here](https://medium.com/@octskyward/why-kotlin-is-my-next-programming-language-c25c001e26e3#.rcykcq7zr), [here (in French)](http://blog.zenika.com/2016/04/27/mes-impressions-sur-le-kotlin-suite-au-mix-it-2016/) or [here (also in French)](http://nphumbert.github.io/blog/2016/05/08/decouverte-de-kotlin-par-la-pratique/).
The goal of this blog post is to see how to write tests in Kotlin.

## Java interop

Since Kotlin is 100% interoperable with Java, it is always possible to use your favorite testing framework (JUnit for instance) and write your tests in Java or in Kotlin.

```kotlin
class FizzBuzzTest {

  @Test fun should_display_fizz_when_multiple_of_3() {
    Assert.assertEquals("fizz", display(3))
  }
}
```

## Kotlin Test

## Spek
