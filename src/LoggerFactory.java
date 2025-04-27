// 抽象工厂：定义创建日志记录器的接口
public abstract class LoggerFactory {
    public abstract Logger createLogger();

    // 可选：公共业务逻辑
    public void writeLog(String message) {
        Logger logger = createLogger();
        logger.log(message);
    }
}