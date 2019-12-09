import java.io.File;
import java.io.IOException;

public interface HimnoAnalisis {
		
		public Integer countCharacters(File file) throws IOException;
		public Integer countWords(File file);
		public Integer countLines(File file);
		public Integer countParagraphs(File file);

	}


