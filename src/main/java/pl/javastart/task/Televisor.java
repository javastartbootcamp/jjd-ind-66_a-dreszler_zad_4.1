package pl.javastart.task;

class Televisor {
    private boolean enabled;

    void turnOn() {
        enabled = true;
    }

    void turnOff() {
        enabled = false;
    }

    void showStatus() {
        System.out.println("Is the TV enabled: " + enabled);
    }
}
