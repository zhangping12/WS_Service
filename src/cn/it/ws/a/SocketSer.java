package cn.it.ws.a;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Socket通信的服务端，实现大小写转换
 */
public class SocketSer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        //接收客户端的请求
        System.out.println("监听客户端的数据：");
        Socket sc = ss.accept();
        InputStream is = sc.getInputStream();//输入流
        //在内存中开辟块缓冲区
        byte [] buffer = new byte[1024];

    }
}
