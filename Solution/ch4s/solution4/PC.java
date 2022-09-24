public class PC {
    CPU cpu;
    HardDisk HD;

    void setCPU(CPU c) {
        cpu = c;
    }

    void setHardDisk(HardDisk h) {
        HD = h;
    }

    void show() {
        System.out.println("speed for CPU:" + cpu.getSpeed());
        System.out.println("amount for HardDisk:" + HD.getAmount());
    }
}
