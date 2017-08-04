/**
* ContadorThread implementa uma thread básica e a inicia
* Queremos que os dois for sejam executados de forma concorrente
* nesta primeira versão há um bug...
**/
public class ContadorThread {
	    static int i = 0;
	    public static void main(String[] args) {
	        new Thread(){
	        	@Override
				public void run() {
					for(int i=1;i<1000000;i++)
						System.out.println(i);
				}
	        }.start();
	        for(int i=-1000000;i<0;i++)
	        	System.out.println(i);
	    }

	    
	}
	