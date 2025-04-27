// 具体工厂：创建Linux日志记录器
public class LinuxLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new LinuxLogger();
    }
}