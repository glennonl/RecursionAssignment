import java.io.*;
/**

Contains methods that traverses a file structure recursively to find files

@author Glennon Langan

*/

public class FileTraverser{

	/**
	recursively finds and prints the path and file name of all files with the given file name rooted at the given directory.

	@param filePath  the path of the root directory.
	@param fileName  the name of the file to be found and printed

	This solution is correct because it looks for the target file and if it doesn't find it recurses on
	only file paths it is able to, directories
	*/
	public static void find(String filePath, String fileName){
		// creates new file object from given path
		File file = new File(filePath);
		// creates a list of all the objects in the given file path
		String[] fileList = file.list();

		for(int i = 0; i < fileList.length; i++){
			// prints if the target file is in the given directory
			if(fileList[i].equals(fileName)){
				System.out.println(new File(filePath, fileName).getPath());
			}// base case
			// creates a new file object using a element of fileList
			File tempFile = new File(filePath, fileList[i]);
			// checks if this new file is a directory, if it is, it recurses
			if(tempFile.isDirectory())
				find(tempFile.getPath(),fileName);
		}// for loop

	}//find

}//end of class