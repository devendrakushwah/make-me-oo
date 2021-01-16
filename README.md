So Shivam had just learned about OOP. He had written a program before that did two things,

- Find distance between two points
- Find direction (angle) between two points in Radians.

He has this code in the `org.procedural.DistanceAndDirectionCalculator` It looks like this for the reference -

```java
public class DistanceAndDirectionCalculator {
    public static double distance(double x1, double y1, double x2, double y2) {
        double xDistance = x1 - x2;
        double yDistance = y1 - y2;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public static double direction(double x1, double y1, double x2, double y2) {
        double xDistance = x2 - x1;
        double yDistance = y2 - y1;
        return Math.atan2(yDistance, xDistance);
    }
}
```

He thought it'll be a good idea to convert this to Object-Oriented Programming. So he wrote a new implementation in
package `org.oop`, he got 2 classes -

- `org.oop.DistanceAndDirectionCalculator`
- `org.oop.Point`

However, his trainer told him that what he did is not Object-Oriented programming and asked Shivam to try again.

- Try to articulate problems with Shivam's OOP solution. (Write it somewhere and share it with your trainer)
- Fork the project and fix the design related problem with Shivam's OOP solution. Share that with your trainer too.

****

**Articulation :**

- The class `DistanceAndDirectionCalculator` doesn't have any fields (states). It has only two static methods. So it is
  just a procedural code wrapped up inside a class.
- The class `Point` doesn't have any behavior. It only has states. It acts as data holder.
- There are unnecessary setters in the `Point` class. And setters shouldn't be used in this case, anyone could directly
  change value of X and Y.
- The fields `X` and `Y` of point class are not declared final.
- There's no need of the `DistanceAndDirectionCalculator` class because it acts like a helper class. Instead, we can add
  these methods to the `Point` class itself.

**Changes I made :**

- Removed the class `DistanceAndDirectionCalculator`
- Encapsulated fields and behaviors in the class `Point`
- Introduced methods `distanceFrom` and `directionFrom` in the point class
- Renamed methods for better readability
- Removed the setters
- Renamed `DistanceAndDirectionCalculatorTest.java` to `PointTest.java`
- Made relevant changes in the test file.

