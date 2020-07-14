package cn.it.ws.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
        //在内存中开辟块缓冲区buffer
        byte [] buffer = new byte[1024];
        int len = -1;//没有读取到数据就是-1
        len = is.read(buffer);//把数据读到内存中
        String getData = new String(buffer,0,len);

        //业务处理大小写转换
        String outPutData = getData.toUpperCase();

        //向客户端写数据
        OutputStream os = sc.getOutputStream();
        os.write(outPutData.getBytes("utf-8"));

        //释放资源
        os.close();
        is.close();
        sc.close();
        ss.close();


    }
}
