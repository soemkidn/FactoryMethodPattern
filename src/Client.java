public class Client {
    public static void main(String[] args) {
        // 根据配置或环境选择具体工厂
        LoggerFactory factory = new WindowsLoggerFactory();
        factory.writeLog("用户注册");

        Logger logger = factory.createLogger();
        logger.log("系统启动成功"); // 输出：Windows日志记录：系统启动成功

        // 切换为Linux工厂
        factory = new LinuxLoggerFactory();
        factory.writeLog("用户登录"); // 输出：Linux日志记录：用户登录
    }
}
