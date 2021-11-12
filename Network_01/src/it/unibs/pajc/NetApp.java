package it.unibs.pajc;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;


public class NetApp {

	public static void main(String[] args) throws Exception {
		//bisogna rispettare un pattern, in questo caso si aggiunge un throws
		URL url = new URL("https://redolfi-unibs.github.io//docs/pajc/");
		
		/*in questo modo di può visualizzare il protocollo che si sta utilizzando
		 */
		System.out.println("protocollo = " + url.getProtocol() );
		//in questo modo viene restituito il nome del server, che viene anche chiamato "host dell'applicazione"
		System.out.println("server = " + url.getHost() );
		System.out.println("porta = " + url.getPort() );
		
		/*
		 * A questo punto, dal punto di vista dello sviluppo dello strato applicativo -> siamo connessi a una risorsa remota, ma questo
		 * fatto non cambia l'approccio da tenere con questo BufferedReader
		 */
		BufferedReader in = new BufferedReader(
				new InputStreamReader(url.openStream()));
		
		String line;
		while((line = in.readLine()) != null)
			System.out.println(line);
		
		in.close();

	}

}
