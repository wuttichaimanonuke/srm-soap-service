/**
 * 
 */
package th.co.techsphere.www.integration;

import org.apache.log4j.Logger;

/**
 * @author Wuttichai
 *
 */
public class KksGetDocumentsByMetaData {
	/**
	 * =======Example=======
	  	Document[] resDocument;
		String rootFolderPath = "/KKP/Kool Export";
		String docTypeName = "CollateralContract";
		String metaData = "Product";
		String metaDataValue = "300aaa";
		Integer pageIndex = 0;
		Integer pageSize = 20;
		
		KksGetDocumentsByMetaData kksGetDocumentsByMetaData = new KksGetDocumentsByMetaData();
		kksGetDocumentsByMetaData.setUserName("kk_admin");
		kksGetDocumentsByMetaData.setPassWord("password");
		kksGetDocumentsByMetaData.setRootFolderPath(rootFolderPath);
		kksGetDocumentsByMetaData.setDocTypeName(docTypeName);
		kksGetDocumentsByMetaData.setMetaData(metaData);
		kksGetDocumentsByMetaData.setMetaDataValue(metaDataValue);
		kksGetDocumentsByMetaData.setPageIndex(pageIndex);
		kksGetDocumentsByMetaData.setPageSize(pageSize);
		resDocument = kksGetDocumentsByMetaData.getDocData();
		logger.info("==>resDocument length = "+resDocument.length);
		for (Document document : resDocument) {
			System.out.println("getDocID = "+document.getDocID());
			System.out.println("getDocumentType = "+document.getDocumentType());
			System.out.println("getExtention = "+document.getExtention());
			System.out.println("getFolderID = "+document.getFolderID());
			System.out.println("getKKPath = "+document.getKKPath());
			System.out.println("getModificationDate = "+document.getModificationDate());
			System.out.println("getModifier = "+document.getModifier());
			System.out.println("getName = "+document.getName());
			System.out.println("getSize = "+document.getSize());
			System.out.println("getVersion = "+document.getVersion());
		}
	 */
	
	private static final Logger logger = Logger.getLogger(KksGetDocumentsByMetaData.class);

	private String userName;
	private String passWord;
	private String kssAddress = "http://172.20.36.106:8907/KoolService.asmx";
	private String rootFolderPath;
	private String docTypeName;
	private String metaData;
	private String metaDataValue;
	private Integer pageIndex = 0;
	private Integer pageSize = 10;
	
	private String ticket;
	
	public KksGetDocumentsByMetaData() {
		super();
	}

	public Document[] getDocData() {
		if((this.userName != null) && (!this.userName.equals("")) && (this.passWord != null) && (!this.passWord.equals(""))) {
			ticket =  KksSignIn.signIn(userName, passWord);
			if(ticket != null) {
				try {
					KoolServiceLocator kslObj = new KoolServiceLocator();
					KoolServiceSoap koolserviceSoap;
					koolserviceSoap = kslObj.getKoolServiceSoap();
					try {
						logger.info("Method getDocumentsByMetaData is success.");
						return koolserviceSoap.getDocumentsByMetaData(ticket, rootFolderPath, docTypeName, metaData, metaDataValue, pageIndex, pageSize);
					} catch (Exception e) {
						logger.error("Method getDocumentsByMetaData() is error. : "+e);
					}
				} catch (Exception e) {
					logger.error("koolserviceSoap getDocumentsByMetaData error : "+e);
				}
				KksSignOut.signOut(ticket);
			} else {
				logger.error("This sections has't ticket.");
			}
		} else {
			logger.warn("Usename adn password are invalid.");
		}
		return null;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public void setKssAddress(String kssAddress) {
		this.kssAddress = kssAddress;
	}

	public void setRootFolderPath(String rootFolderPath) {
		this.rootFolderPath = rootFolderPath;
	}

	public void setDocTypeName(String docTypeName) {
		this.docTypeName = docTypeName;
	}

	public void setMetaData(String metaData) {
		this.metaData = metaData;
	}

	public void setMetaDataValue(String metaDataValue) {
		this.metaDataValue = metaDataValue;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
