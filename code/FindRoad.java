package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindRoad {

	public static void main(String[] args) throws IOException {

        String fileName = "vehicle.txt";
		Scanner inputStream = null;
		File out = new File("road.txt");
		FileOutputStream fos = new FileOutputStream(out);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        try {
        	inputStream = new Scanner(new File(fileName));
        }
        catch(FileNotFoundException e) {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        while(inputStream.hasNextLine()){
        	String line = inputStream.nextLine();
        	//split road name into an array by space
        	String[] road = line.split(" ");
        	for(int i = 0; i < road.length; i ++){
        		if(road[i].matches("btwn") || road[i].matches("BTWN")){
        			if(road[i - 1].matches("road") || road[i - 1].matches("ROAD")){
        				bw.write(line);
        				bw.newLine();
        			}

        		}
        	}
        }
    	System.out.println("File created in the workspace.");
	}
}