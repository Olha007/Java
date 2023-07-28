package lesson4;

public class Computer {
    private String producer;
    private int serialNumber;
    private float price;
    public int quantityCPU;
    public int frequencyCPU;

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProduce(String producer) {
        this.producer = producer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }


    public Computer(String producer, int serialNumber, float price, int quantityCPU, int frequencyCPU) {
        this.producer = producer;
        this.serialNumber = serialNumber;
        this.price = price;
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;

    }

    public void view() {
        System.out.println("Produce: " + producer + "  " + "SerialNumber: " + serialNumber + "  " + "Price: "
                + price + "  " + "QuantityCPU: " + quantityCPU + "  " + "FrequencyCPU: " + frequencyCPU);
    }
}
