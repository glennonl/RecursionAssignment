/*

Tests the FileTraverser class methods

@author Glennon Langan

*/
public class FileTraverserDriver{

	public static void main(String[] args){

		//TEST 1
		// Target in first directory of path.list()
		String path = "C:\\Users\\glenn\\Desktop\\TestingDirectory";
		String target = "TargetFile.txt";
		FileTraverser.find(path, target);

		//TEST 2
		// Target in third directory of path.list()
		String target1 = "TargetFile1.txt";
		FileTraverser.find(path, target1);

		//TEST 3
		// Target in several directories deep
		String target2 = "TargetFile2.txt";
		FileTraverser.find(path, target2);

		//TEST 4
		// Target in original path
		String target4 = "TargetFile4.txt";
		FileTraverser.find(path, target4);

		//TEST 5
		// Target not in any file
		String target5 = "TargetFile5.txt";
		FileTraverser.find(path, target5);




		/*
		Note, I won't be able to run your driver since I don't have your file structure.  So, make sure to include
		a brief description of what each test cases is testing for.
		*/

	}//main


}//class