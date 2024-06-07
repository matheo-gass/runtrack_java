class MyThread extends Thread{
    public void run(){
        System.out.println("Mon thread est en cours");
        return;
    };
    public void main(String[] args){
        run();
        return;
    };
};  