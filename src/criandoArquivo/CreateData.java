package criandoArquivo;

import java.io.File;
import java.io.IOException;

public class CreateData {
    
	public static void main(String[] args) {
		
		try {
			File file = new File("/home/alienmj/arquivos/Arqivnew.txt");
			boolean dataArquivo = file.createNewFile();
			if(dataArquivo) {
				System.out.println("Arquivo criado com sucesso");
			}else {
				System.out.println("Falha ao criar arquivo");
			}
		}catch (IOException e) {
			e.printStackTrace();
 		}
 	}
}
