package com.company;
interface service {

    void write(String message);
}

class serviceA implements service {
    @Override
    public void write(String message) {
        System.out.println("hello world");
    }
}

class client {

    private service myservice;

    public client(service service) {
        this.myservice = service;
    }

    public void dosomething() {

        myservice.write("this is my message");
    }
    public void setservice(service service){
        this.myservice=service;

    }

}


public class Main {

    public static void main(String[] args) {
        service service = new serviceA();
        client cl = new client(service);
        cl.dosomething();
        cl.setservice(service);
    }
}
