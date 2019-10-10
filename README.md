## Value

* Basic implementation: 5 points
* Basic unit tests: 5 points
* Extra credit: None

## Basic task

In this task, you will implement and test a method that constructs and returns an array containing values that follow a very specific sequence: 0, -1, 4, -9, 16, &hellip;. As you can see, the magnitude of each value is the next perfect square in the sequence, but the signs alternate between positive and negative.

### Implementation

In the `edu.cnm.deepdive.Generator` class, the `oscillatingSquares` method is declared with the following signature, return type, and modifiers:

```java
public static int[] oscillatingSquares(int length)
```

For more method declaration details, see the [Javadoc documentation](docs/api/edu/cnm/deepdive/Generator.html#oscillatingSquares(int)).

For the basic task, complete the implementation of this method, according to the following specifications:

* The returned array must contain exactly `length` elements.

* The value of the element at index position `n` must be equal to (-1)<sup>n</sup>n<sup>2</sup>.

For example, 

```java
Generator.oscillatingSquares(5);
```

would return

```
{0, -1, 4, -9, 16}
```

### Unit tests

For unit testing credit, use JUnit5 to verify your code with the following inputs and expected outputs:

| `length` | Expected return value |
|:---:|:--------------------:|
| `0` | `{}` |
| `1` | `{0}` |
| `5` | `{0, -1, 4, -9, 16}` |
| `7` | `{0, -1, 4, -9, 16, -25, 36}` |
| `10` | `{0, -1, 4, -9, 16, -25, 36, -49, 64, -81}` |

In evaluating your implementation, we reserve the right to include additional test cases; code that satisfies the requirements stated above should pass all such additional tests.
 
### Hints 

* The `Generator.oscillatingSquares` method to be completed is `static`; there is no need to create instances of `Generator` (and arguably no benefit in doing so). 

* You may find it useful to create one or more additional `static` methods as “helpers”; the problem can be solved without doing so, however.

* Don't hesitate to declare any constants (`static final` fields) that you feel might simplify or clarify your code.

* The method to be completed includes a `TODO` comment to that effect.    

* In unit testing, when comparing an array returned from a method to an array of expected values, one of the `assertArrayEquals` methods (in the `org.junit.jupiter.api.Assertions` class) is better suited to the task than any of the `assertEquals` methods.    
