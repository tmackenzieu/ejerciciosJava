package test.concepts;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.UnknownHostException;

import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.impl.SlackSessionFactory;

public class getIP {

	public static void main(String[] args) {
		try {
			SlackSession sessionSlack = SlackSessionFactory.createWebSocketSlackSession(
					"xoxp-326130670948-326085768755-327465941989-b3b1492762876d2f8de117b4fd8a3e0f");
			sessionSlack.connect();
			if (!sessionSlack.isConnected()) {
				System.out.println("Error de Conexion con Slack");
			} else {
				SlackChannel channel = sessionSlack.findChannelByName("general");
				sessionSlack.sendMessage(channel, "IP FTP" + Inet4Address.getLocalHost().getHostAddress());
			}
			sessionSlack.disconnect();
			System.out.println("Sesion slack terminada");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
