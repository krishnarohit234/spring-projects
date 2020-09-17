package in.htc.rohit.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("con")
public class Dbconn {
	
	public Dbconn() {
		System.out.println("FROM DB CONN-DEFAULT CONST.");
	}
	

	@Value("OracleDriver")
	private String driver;
	
	@Value("jdbc:oracle")
	private String url;
	

	@Override
	public String toString() {
		return "DbConn [driver=" + driver + ", url=" + url + "]";
	}
	
}


