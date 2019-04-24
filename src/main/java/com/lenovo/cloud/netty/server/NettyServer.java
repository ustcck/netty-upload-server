package com.lenovo.cloud.netty.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NettyServer {

    private final Logger log = LoggerFactory.getLogger(NettyServer.class);

    private static EventLoopGroup boss = new NioEventLoopGroup(); // 通过nio方式来接收连接和处理连接
    private static EventLoopGroup work = new NioEventLoopGroup(); // 通过nio方式来接收连接和处理连接
    private static ServerBootstrap b = new ServerBootstrap();

    public void run(int port, String uploadPath) {
        try {
            b.group(boss, work);
            b.channel(NioServerSocketChannel.class);
            b.childHandler(new NettyServerFilter(uploadPath)); // 设置过滤器
            // 服务器绑定端口监听(设置服务端端口)
            ChannelFuture f = b.bind(port).sync();
            log.info("server started successfully, port:" + port);
            // 监听服务器关闭监听
            f.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            log.error("nettyServer run error: ", e);
        } finally {
            // 关闭EventLoopGroup，释放掉所有资源包括创建的线程
            work.shutdownGracefully();
            boss.shutdownGracefully();
        }
    }

}
