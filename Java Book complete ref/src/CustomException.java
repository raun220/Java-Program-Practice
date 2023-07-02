public class CustomException extends Exception {
    private int details;
    CustomException(int details){
        this.details = details;
    }
    public String toString(){
        return "CustomException:"+details;
    }
}

class CallCustomException{
    static void compute(int details) throws CustomException{
        System.out.println("called compute:"+details);
        if(details > 10){
            throw new CustomException(details);
        }
        System.out.println("Normal Exit");
    }

    public static void main(String[] args) {
        try{
            compute(2);
            compute(19);
        }catch (CustomException e){
            System.out.println("Caught "+e);
        }
    }
}

