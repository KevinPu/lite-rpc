package io.literpc.transport;


import io.literpc.core.client.Client;
import io.literpc.core.handler.MessageHandler;
import io.literpc.core.server.Server;
import io.literpc.core.url.URL;

/**
 * @author kevin Pu
 */
public interface Transporter {

    Server createServer(URL url, MessageHandler handler);

    Client createClient(URL url, MessageHandler handler);
}
