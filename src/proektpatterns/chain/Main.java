package proektpatterns.chain;

public class Main {
    public static void main(String[] args) {
        MessageHandler messageHandler = new MessageToUpperCaseHandler(new MessageAddExclamationMarkHandler(
                new MessageVerifyHandler(new MessagePrintHandler(null))));
        messageHandler.handle("Hello World");
    }
}

abstract class MessageHandler{
    MessageHandler messageHandler;

    public MessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }
    abstract void handle(String str);
}
class MessagePrintHandler extends MessageHandler{
    public MessagePrintHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String str) {
        System.out.println(str);
    }
}
class MessageVerifyHandler extends MessageHandler{
    public MessageVerifyHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String str) {
        if(!str.matches(".*\\d.*"))
        messageHandler.handle(str);
    }
}
class MessageAddExclamationMarkHandler extends MessageHandler{
    public MessageAddExclamationMarkHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String str) {
            messageHandler.handle(str + "!");
    }
}
class MessageToUpperCaseHandler extends MessageHandler{
    public MessageToUpperCaseHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String str) {
        messageHandler.handle(str.toUpperCase());
    }
}