// 具体产品：Linux平台的日志记录器
public class LinuxLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Linux日志记录：" + message);
    }
}