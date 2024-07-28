package ProdConsProblem;

public class SharedData {

    int data;

    boolean isWritten=false;

    public synchronized void produce(int data){ // It will produce the data
        if (isWritten==true){ // if data already produced, please wait
            try {
                wait();
            }
            catch (Exception ex){

            }
        }
        System.out.println("Produced Data: "+data);
        this.data = data;
        isWritten = true;
        notify();
    }

    public synchronized void consume(){ //  It will consume tha data
        if (isWritten==false){
            try {   // If data not produced, don't consume
                wait();
            }
            catch (Exception ex){

            }
        }
        isWritten = false;
        System.out.println("Consumed Data: "+this.data);
        notify();
    }
}
