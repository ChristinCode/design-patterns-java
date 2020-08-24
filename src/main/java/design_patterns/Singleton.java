package design_patterns;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    //Things that you would want this class to do

    //What might happen if you used this in a multi thread application?


    //What would be the downside of using `synchornized`?
    //Important when we are creating the instance, but is it needed afterwards?

    //How can we improve?
    //1. Do nothing, IF the performance of `getInstance()` isn't critical to your application.
    //2. Eagerly vs. Lazily
    //   "Eager" - `private static Singleton uniqueInstance = new Singleton();
    //   a. You can use eagerly created instances if they can be created without much overhead and don't use
    //      a bunch of resources to maintain during runtime.
    //   b. If either of startup speed of an application or resources are at a premium, you might want to stick to a
    //      `lazy` initialization.
    //3. Use 'double-checked locking' to reduce the use of synchronization.
    //   a. Mark the instance as `volatile`.  This insures that multiple threads handle the instance correctly when it
    //      is being initialized.
    //   b. Still check for `null` in the `getInstance()` method, and if it is `null` enter a 'synchronized block'.
    //      ```synchronized (Singleton.class) {
    //             if (uniqueInstance == null) {
    //                 uniqueInstance = new Singleton();
    //             }
    //         }```
}
