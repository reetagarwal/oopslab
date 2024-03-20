package lab5;

public class BOXXX {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 30);
        System.out.println("Volume of box1: " + box1.volume());
        Box box2 = new Box(5);
        System.out.println("Volume of box2: " + box2.volume());
        BoxWeight boxWeight1 = new BoxWeight(10, 20, 30, 10);
        System.out.println("Weight of boxWeight1: " + boxWeight1.weight);
        Shipment shipment1 = new Shipment(10, 20, 30, 10, 20);
        System.out.println("Cost of shipment1: " + shipment1.cost);
    }
}

class Box{
    double width,height,depth;

    Box() {
        this.width=0;
        this.height=0;
        this.depth=0;
    }

   Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

   Box(double length){
        width=height=depth=length;
    }

    Box(Box a){
        this.height=a.height;
        this.width=a.width;
        this.depth=a.depth;
    }

    double volume(){
        return height*width*depth;
    }
}

class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        super();
        this.weight=0;
    }

    BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    BoxWeight(double length,double weight){
        super(length);
        this.weight=weight;
    }

    public BoxWeight(Box a, double weight){
        super(a);
        this.weight=weight;
    }

    BoxWeight(BoxWeight a){
        super(a);
        this.weight=a.weight;
    }
}

class Shipment extends BoxWeight{
    double cost;

    Shipment(double cost){
        super();
        this.cost=0;
    }

    public Shipment(double width, double height, double depth, double weight, double cost) {
        super(width, height, depth, weight);
        this.cost = cost;
    }

    public Shipment(double length, double weight, double cost) {
        super(length, weight);
        this.cost = cost;
    }
}
