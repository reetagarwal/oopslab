package lab4;

//Implement a class cpu having private data members manufacturer and price and two inner class processor and ram.
// Processor class has private data members , number of cores and manufacturer and private members get cache and set
// cache. Ram class has private data members memory and manufacturer and private methods get clock speed and set
// clock speed. Finally , implement driver class main to create a cpu object and display all the details of the
// object in the user console.
public class CPU {
    public static void main(String[] args) {
        CPU1 cpu = new CPU1();
        CPU1.Processor processor = cpu.new Processor();
        int cacheValue = processor.get();
        System.out.println("Cache Value: " + cacheValue);
        processor.set();
        CPU1.Ram ram = cpu.new Ram();
        int clockSpeed = ram.getClock();
        System.out.println("Clock Speed: " + clockSpeed);
        ram.setClock();
    }
}

class CPU1 {
    private char manufacturer;
    private double price;

    class Processor {
        private int no_of_cores;
        private String manufacturer;

        private int getCache() {
            return 123;
        }

        int get() {
            return getCache();
        }

        private void setCache() {
            System.out.println("Set the cache value");
        }

        void set() {
            setCache();
        }

    }

    public class Ram{
        private long memory;
        private String manufacturer;

        private int getClockspeed(){
            return 123;
        }

        public int getClock(){
            return getClockspeed();
        }
        private void setClockspeed(){
            System.out.println("Set the clock speed");
        }
        public void setClock(){
            setClockspeed();
        }
    }

}
