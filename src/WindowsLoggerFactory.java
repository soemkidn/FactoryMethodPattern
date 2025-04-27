// 具体工厂：创建Windows日志记录器
public class WindowsLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new WindowsLogger();
    }
}