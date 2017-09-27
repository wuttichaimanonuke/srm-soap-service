/**
 * 
 */
package th.co.techsphere.www.integration;

import javax.xml.rpc.ServiceException;

import org.apache.log4j.Logger;

/**
 * @author Wuttichai
 *
 */
public class KksSignIn {
	
	private static final Logger logger = Logger.getLogger(KksSignIn.class);
	
	public static String signIn(String userName, String passWord) {
		String ticket = null;
		KoolServiceLocator kslObj = new KoolServiceLocator();
		KoolServiceSoap koolserviceSoap;
		try {
			koolserviceSoap = kslObj.getKoolServiceSoap();
			try {
				ticket =  koolserviceSoap.signin(userName, passWord);
				logger.info("koolserviceSoap signin success.");
			} catch (Exception e) {
				logger.error("Method signin error : "+e);
			}
		} catch (ServiceException e) {
			logger.error("Method getKoolServiceSoap() is error : "+e);
		}
		return ticket;
	}
}
