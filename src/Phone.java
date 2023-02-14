public class Phone {
    String number;
    String model;
    double weight;


    public Phone(String number,String model, double weight){
        this(number, model);
        this.weight = weight;
    }
    public Phone(String number,String model){
        this.number = number;
        this.model = model;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Phone(){
    this.number = "+79107838915";
    this.model = "apple";
    this.weight = 3.4;
    }
    public void receiveCall(String name){
        System.out.println("Звонит: " + name);
    }
    public void receiveCall(String name, String number){
        System.out.println("Звонит: " + name + number);
    }
    public void sendMessage(long num1, long num3) {
        System.out.println(num1 + "\n" + num3);
    }
    String getNumber(){
        return number;
    }
}
