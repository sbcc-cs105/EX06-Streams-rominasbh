## Exercise: Streams (25 Points of Extra Credit)

The project name of this exercise is **Streams**.

The purpose of this assignment is to apply what you have learned about streams and reading
data from files using `Scanner`. Additionally, you will use command line arguments to get
data into a program.

### Problem Description

Write code in the main function that takes one argument from the command line and uses
that argument as the name of a file to open and read data into three variables. The first
variable `intData` is an `int`, the second, `stringData` is a `String` and the third, 
`doubleData` is a `double`. Use the `Scanner` class to read the data from the file passed
into the first argument of `args`. You should be able to handle the situation where the file
does not contain one more of the pieces of data. It should also be able to handle the situation
where no file is given. By handle, it is meant that the program exits without throwing an
exception.

### Getting Started

The first thing you will need to do is accept the invitation to this 
assignment from GitHub Classroom. You can click 
[here](https://classroom.github.com/a/G1gpFPbb) to accept the 
invitation, and get started.

Be sure that you accept the invitation first and use the URL to your new project when you clone it in CLion. After copying
the URL into the clipboard, in CLion click **VCS -> Checkout from Version Control -> Git**. Paste the URL into the **URL** box of the _Clone Repository_ dialog box and press **Clone**.

The code initially looks like:

```java
package edu.sbcc.cs105;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This code is a solution for the Streams assignment.
 *
 */
public class Streams {
	public static int intData = 0;
	public static String stringData = "";
	public static double doubleData = 0.0;

	public static void main(String args[]) {
		// You can put your code here to do read data from the files

		// This code prints out what was read from the files
		System.out.println("intData: " + intData);
		System.out.println("stringData: " + stringData);
		System.out.println("doubleData: " + doubleData);

	}
}
```


Once you've written your code run the code by single clicking on **Streams.java** in the package explorer and selecting **Run->Run** from the menu or using the keyboard shortcut. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

### Running the code for this project

Running this code should be straightforward. In the drop-down 
menu in the upper right-hand corner you should see a *Run
Configuration* called `EX06-Streams [run]`. Make sure this 
configuration is selected and press the play button next to it.
In the **Run** view below the code you should see the output 
of running the program. It should look something like this:

Using the test input, your output should look like:

```
intData: 12
stringData: Happy
doubleData: 2.3

Process finished with exit code 0
```

Success! Now you can move on to testing your code.

### Testing the code for this project

Testing the code for this project is similar to running your code
as outlined above. In the drop-down menu in the upper right-hand
corner select the target `EX06-Streams [test]` and press the 
play button next to it. In the **Run** view below the code you should
see the output of running these tests. It should look something
like this:

```bash
Testing started at 12:20 PM ...
12:20:37 PM: Executing task 'test'...

> Task :wrapper
BUILD SUCCESSFUL in 0s
1 actionable task: 1 executed
> Task :compileJava UP-TO-DATE
> Task :processResources NO-SOURCE
> Task :classes UP-TO-DATE
> Task :compileTestJava UP-TO-DATE
> Task :processTestResources NO-SOURCE
> Task :testClasses UP-TO-DATE
> Task :test
intData: 0
stringData: Happy
doubleData: 2.3
Unable to find command line arguments
Unable to find input file
intData: 0
stringData: 
doubleData: 0.0
intData: 0
stringData: 
doubleData: 0.0
intData: 12
stringData: Happy
doubleData: 2.3
intData: 234
stringData: Sad
doubleData: 0.0
Your unit test score is 24 out of 20.

The assignment is worth a total of 25 where the remainder of 5 points
comes from grading related to documentation, algorithms, and other
criteria.
BUILD SUCCESSFUL in 1s
3 actionable tasks: 1 executed, 2 up-to-date
12:20:39 PM: Task execution finished 'test'.
```

### Pushing your code to GitHub

Now you need to turn in your code by sending, or pushing, your code to GitHub. You created a 
GitHub repository when you started the assignment. Now you need to take your local code changes
and send them to GitHub so that you can turn it in and have it graded in the next step in the
work flow.

The first step is to commit your code locally. This tell git what files you want to turn in. In 
this case you only need to turn in the contents of `Streams.java`. In the Project view, right-
click **EX06-Streams** and then select **Git -> Commit Directory...**. In the dialog box that
pops up, be sure only `Streams.java` is selected and that there is some text in the _Commit 
Message_ box. A good commit message would be something like `Committing code to get a good grade`.

Once the commit is finished, which is a purely local action, you need to send that commit to 
GitHub. This is called the push phase of the process. Again right-click on **EX06-Streams**.
Then select **Git -> Repository -> Push**. In the dialog box that pops up, push the **Push** button
and that should be it. You should see a message that says the push was successful. In the next
step you'll confirm that your code is working and then submit it for a grade.

### Turning in and Grading your code

Go back to LazyGrader and login again, if needed. Press the _Build_ button next to 
**EX06-Streams** for this course. This will send a command to Jenkins to download your code
from GitHub and test it. If all goes well and all the tests pass, the ball next to the _Build_
will turn blue. If some of the tests don't pass the ball will be yellow. If the ball is grey,
that means you have not run the tests before and your project is not ready for grading.

Once the Jenkins status is blue or yellow, press the _Grade_ button for **EX06-Streams**.
This will read the results from Jenkins and send your grade to Canvas. Once the notification in 
LazyGrader says the grade has been posted, you should see your grade on Canvas.

That's it, once you've submitted your grade, you are done. I will add points later, after I
inspect your code. For example, most projects will be out of a total of 25 points, but after 
pressing the _Grade_ button, Canvas will show 20 points. I will add up to 5 points after I have
looked at your code and am conviced it is original.
