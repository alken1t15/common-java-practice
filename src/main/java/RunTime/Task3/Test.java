package RunTime.Task3;

public class Test {
    public static void main(String[] args) {
        MonitoringSystem GeneralIndicatorsMonitoringModule = () -> System.out.println("Мониторинг общих показателей запущен");
        MonitoringSystem ErrorMonitoringModule = () -> System.out.println("Мониторинг отслеживания ошибок запущен");
        MonitoringSystem SecurityModule = () -> System.out.println("Мониторинг безопасности запущен");

        GeneralIndicatorsMonitoringModule.startMonitoring();
        ErrorMonitoringModule.startMonitoring();
        SecurityModule.startMonitoring();
    }
}
