package br.com.docvet.docvet.domain.error;

public class NotFoundException extends RuntimeException{

    private String msg;

    public NotFoundException(String msg){
        super(msg);
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }

}
