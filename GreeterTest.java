/* 1
down vote

Hi the problem here is that the JVM confuses the class file due to the ambiguous class file name in both the directory (the JavaTest as well as the com.test.helpers directory).When you do javac -d . A.java the compiler makes a class file in the directory com.test.helpers and now it confuses it with the sourcefile there in JavaTest
Deleting the Source file A.javaWhen you delete the source file A.java from JavaTest, JVM knows now that the class file in com.test.... is to be used, ambiguity goes away.
Changing the import statement from 'import com.test.helpers.*;' to 'import com.test.helpers.A' in the file, 'App.java'.
*/
import igit.roll.jaspreet.Greeter;
import igit.roll.jaspreet.Advisor;

public class GreeterTest
{
	public static void main(String args[])
	{
		Advisor a = new Advisor();
		Greeter g;
		int n=Integer.parseInt(args[0]);
		for (int i=1;i<=n;i++)
		{		
			g=new Greeter(args[i]);
			g.sayHello();
			a.getAdvise();
		}
	}
}

