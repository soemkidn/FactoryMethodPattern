// 具体产品：Windows平台的日志记录器
public class WindowsLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Windows日志记录：" + message);
    }
}