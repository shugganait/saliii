public class Const implements EntityInterface {
    private String nameOfPidaras;
    private String commandForPidaras;

    public String getNameOfPidaras() {
        return nameOfPidaras;
    }

    public String getCommandForPidaras() {
        return commandForPidaras;
    }

    public Const(String nameOfPidaras, String commandForPidaras) {
        this.nameOfPidaras = "\u001B[35m" + nameOfPidaras + "\u001B[37m";
        this.commandForPidaras = "\u001B[36m" + commandForPidaras + "\u001B[37m";
    }

    @Override
    public String message() {
        return getNameOfPidaras() + " " + getCommandForPidaras();
    }
}
