/**
* vendo como fazer sem threads, pra depois implementar
* com elas e ver a execução concorrente.
**/
public class BasicThreadSemThread {
	    static int i = 0;
	    public static void main(String[] args) {
	        t1();
	        t2();
	        t3();
	    }

	    private static void countMe(String name){
	        i++;
	        System.out.println("Contador Corrente é: " + i + ", atualizado por: " + name);
	    }

	    private static void t1() {
	        for(int i=0; i<5; i++)
	                    countMe("t1");
	    }

	    private static void t2() {
	        for(int i=0; i<5; i++)
	                    countMe("t2");
	    }
	    private static void t3() {
	        for(int i=0; i<5; i++)
	                    countMe("t3");
	    }
	}
