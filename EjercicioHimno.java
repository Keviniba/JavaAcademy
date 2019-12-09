
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioHimno implements HimnoAnalisis {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Kevin\\Downloads\\himno.txt");
		EjercicioHimno ej = new EjercicioHimno();
		
		/*caracteres*/
		Integer numeroCh = ej.countCharacters(file);
		System.out.println("1.- Número de caracteres = "+numeroCh);
		
		/*letras*/
		Integer letras = ej.countWords(file);
		System.out.println("2.- Número de letras = "+letras);
		
		Integer lineCount = ej.countLines(file);
		
		System.out.println(("3. Numero de Lineas=" +lineCount));

		
	}

	@Override
	public Integer countCharacters(File file) throws IOException  {
		
		Integer characterCount = 0;
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader inputStreamReader  = new InputStreamReader(fileStream);
		BufferedReader  reader = new BufferedReader(inputStreamReader);

	    
	    try {
	    	
			String line = null;
			
			while((line = reader.readLine()) != null) {
				
				characterCount += line.length();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return characterCount;
	}

	@Override
	public Integer countWords(File file) {
		int wordcount = 0;
		 
		try {
		FileInputStream filestream = new FileInputStream(file);
		InputStreamReader inputstreamreader = new InputStreamReader(filestream);
		BufferedReader reader = new BufferedReader(inputstreamreader);
		 
		String line = null;
		int i;  
		 
		try {
			while((line = reader.readLine()) != null) {
			 
			                for(i=0; i < line.length(); i++)
			                {
			                    if(i==0)
			                    {
			                        if(line.charAt(i)!=' ')
			                        wordcount++;
			                    }
			                    else
			                    {
			                        if(line.charAt(i-1)==' ')
			                            if(line.charAt(i)!=' ')
			                            wordcount++;
			                    }
			                }
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		} catch (FileNotFoundException e) {
		e.getStackTrace();
		}
		 
		return wordcount;
	}

	@Override
	public Integer countLines(File file) {
		int lineCount = 0;
		 
		try {
		FileInputStream filestream = new FileInputStream(file);
		InputStreamReader inputstreamreader = new InputStreamReader(filestream);
		BufferedReader reader = new BufferedReader(inputstreamreader);
		 
		String line = null;
		int i;  
		 
		try {
			while ((line = reader.readLine())!=null) {
			lineCount++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       
		 
		} catch (FileNotFoundException e) {
		e.getStackTrace();
		}
		 
		return lineCount;
		
	}
	public Integer countParagraphs(File file) {
		int paracount = 0;
		 
		try {
		FileInputStream filestream = new FileInputStream(file);
		InputStreamReader inputstreamreader = new InputStreamReader(filestream);
		BufferedReader reader = new BufferedReader(inputstreamreader);
		 
		String line = null;
		 
		try {
			while ((line= reader.readLine())!=null) {

			                if(line.equalsIgnoreCase("I") || line.equalsIgnoreCase("II") || line.equalsIgnoreCase("III") || line.equalsIgnoreCase("IV")){
			                    paracount++;
			                }
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
		e.getStackTrace();
		}
		 
		return paracount+1;
		
		
	}
	}


