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
public class KksSignOut {
	
	private static final Logger logger = Logger.getLogger(KksSignOut.class);
	
	public static boolean signOut(String ticket) {
		if(ticket != null) {
			KoolServiceLocator kslObj = new KoolServiceLocator();
			KoolServiceSoap koolserviceSoap;
			try {
				koolserviceSoap = kslObj.getKoolServiceSoap();
				try {
					if(koolserviceSoap.signOut(ticket)) {
						logger.info("koolserviceSoap signOut success.");
						return true;
					} else {
						logger.info("koolserviceSoap signOut success. But return null.");
					}
				} catch (Exception e) {
					logger.error("Method signout error : "+e);
				}
			} catch (ServiceException e) {
				logger.error("Method getKoolServiceSoap() is error : "+e);
			}
		} else {
			logger.warn("This sections has't ticket.");
		}
		return false;
	}
}
