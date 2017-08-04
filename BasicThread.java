/**
* BasicThread é um programa básico para aplicar conceitos básicos
* de Threads, em que 2 threads são rodadas, implementando
* a interface Runnable
**/
public class BasicThread {
	    static int i = 0;
	    public static void main(String[] args) {
	        new Thread(t1).start();
	        new Thread(t2).start();
	        new Thread(t3).start();
	    }

	    private static void countMe(String name){
	        i++;
	        System.out.println("Contador Corrente é: " + i + ", atualizado por: " + name);
	    }

	    private static Runnable t1 = new Runnable() {
	        public void run() {
	            try{
	                for(int i=0; i<5; i++){
	                    countMe("t1");
	                }
	            } catch (Exception e){}

	        }
	    };

	    private static Runnable t2 = new Runnable() {
	        public void run() {
	            try{
	                for(int i=0; i<5; i++){
	                    countMe("t2");
	                }
	            } catch (Exception e){}
	       }
	    };

	    private static Runnable t3 = new Runnable(){
	    	public void run(){
	    		try{
	    			for(int i=0;i<5;i++)
	    				countMe("t3");
	    		} catch (Exception e){}
	    	}
	    };
	}