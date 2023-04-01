public class Cal {
    double result,num1,num2;
    String process;
    public Cal(double n1,double n2,String p){
        this.num1 = n1;
        this.num2 = n2;
        this.process = p;
    }
    public void compute(){
        if(process =="+"){
            result = num1 + num2;
            return;
        }
        if(process =="-"){
            result = num1 - num2;
            return;
        }
        if(process =="*"){
            result = num1 * num2;
            return;
        }
        if(process =="/"){
            result = num1 / num2;
            return;
        }
        result = 0;
    }
}
