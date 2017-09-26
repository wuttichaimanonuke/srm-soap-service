package th.co.techsphere.www.integration;

public class KoolServiceSoapProxy implements th.co.techsphere.www.integration.KoolServiceSoap {
  private String _endpoint = null;
  private th.co.techsphere.www.integration.KoolServiceSoap koolServiceSoap = null;
  
  public KoolServiceSoapProxy() {
    _initKoolServiceSoapProxy();
  }
  
  public KoolServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initKoolServiceSoapProxy();
  }
  
  private void _initKoolServiceSoapProxy() {
    try {
      koolServiceSoap = (new th.co.techsphere.www.integration.KoolServiceLocator()).getKoolServiceSoap();
      if (koolServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)koolServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)koolServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (koolServiceSoap != null)
      ((javax.xml.rpc.Stub)koolServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public th.co.techsphere.www.integration.KoolServiceSoap getKoolServiceSoap() {
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap;
  }
  
  public java.lang.String signin(java.lang.String user, java.lang.String password) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.signin(user, password);
  }
  
  public boolean signOut(java.lang.String ticket) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.signOut(ticket);
  }
  
  public th.co.techsphere.www.integration.Document[] getDocuments(java.lang.String ticket, java.lang.String docTypeName, java.lang.String metaData, java.lang.String metaDataValue, int pageIndex, int pageSize) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.getDocuments(ticket, docTypeName, metaData, metaDataValue, pageIndex, pageSize);
  }
  
  public int getDocumentCount(java.lang.String ticket, java.lang.String docTypeName, java.lang.String metaData, java.lang.String metaDataValue) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.getDocumentCount(ticket, docTypeName, metaData, metaDataValue);
  }
  
  public th.co.techsphere.www.integration.Document getDocument(java.lang.String ticket, java.lang.String docID, boolean withContent) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.getDocument(ticket, docID, withContent);
  }
  
  public th.co.techsphere.www.integration.Document[] getDocumentInFolder(java.lang.String ticket, java.lang.String folderId, boolean includeSubFolder, boolean withContent) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.getDocumentInFolder(ticket, folderId, includeSubFolder, withContent);
  }
  
  public boolean updateDocumentMetaData(java.lang.String ticket, java.lang.String docID, java.lang.String inputDocTypeName, java.lang.String inputMetaData, java.lang.String inputMetaDataValue) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.updateDocumentMetaData(ticket, docID, inputDocTypeName, inputMetaData, inputMetaDataValue);
  }
  
  public boolean updateFolderMetaData(java.lang.String ticket, java.lang.String folderID, java.lang.String inputDocTypeName, java.lang.String inputMetaData, java.lang.String inputMetaDataValue) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.updateFolderMetaData(ticket, folderID, inputDocTypeName, inputMetaData, inputMetaDataValue);
  }
  
  public java.lang.String newDocument(java.lang.String ticket, java.lang.String pathFolder, java.lang.String name, java.lang.String inputDocTypeName, java.lang.String inputMetaData, java.lang.String inputMetaDataValue, java.lang.String image, java.lang.String imageExtention, java.lang.String retentionDate) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.newDocument(ticket, pathFolder, name, inputDocTypeName, inputMetaData, inputMetaDataValue, image, imageExtention, retentionDate);
  }
  
  public th.co.techsphere.www.integration.Document checkOutDocument(java.lang.String ticket, java.lang.String docID) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.checkOutDocument(ticket, docID);
  }
  
  public boolean checkInDocument(java.lang.String ticket, java.lang.String docID, java.lang.String image, java.lang.String imageExtention, java.lang.String version) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.checkInDocument(ticket, docID, image, imageExtention, version);
  }
  
  public boolean lockDoc(java.lang.String ticket, java.lang.String docID) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.lockDoc(ticket, docID);
  }
  
  public boolean unLockDoc(java.lang.String ticket, java.lang.String docID) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.unLockDoc(ticket, docID);
  }
  
  public boolean renameDoc(java.lang.String ticket, java.lang.String docID, java.lang.String newName) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.renameDoc(ticket, docID, newName);
  }
  
  public boolean moveDocToFolder(java.lang.String ticket, java.lang.String docID, java.lang.String folderId) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.moveDocToFolder(ticket, docID, folderId);
  }
  
  public boolean deleteDoc(java.lang.String ticket, java.lang.String docID, boolean allVersion) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.deleteDoc(ticket, docID, allVersion);
  }
  
  public boolean changeDocOwner(java.lang.String ticket, java.lang.String docID, java.lang.String newOwner) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.changeDocOwner(ticket, docID, newOwner);
  }
  
  public boolean changeDocRetentionDate(java.lang.String ticket, java.lang.String docID, java.lang.String retentionDate) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.changeDocRetentionDate(ticket, docID, retentionDate);
  }
  
  public java.lang.String newFolder(java.lang.String ticket, java.lang.String folderName, java.lang.String pathFolder, java.lang.String inputDocTypeName, java.lang.String inputMetaData, java.lang.String inputMetaDataValue) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.newFolder(ticket, folderName, pathFolder, inputDocTypeName, inputMetaData, inputMetaDataValue);
  }
  
  public boolean renameFolder(java.lang.String ticket, java.lang.String folderID, java.lang.String newFolderName) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.renameFolder(ticket, folderID, newFolderName);
  }
  
  public boolean moveFolderToFolder(java.lang.String ticket, java.lang.String folderID, java.lang.String newParentID) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.moveFolderToFolder(ticket, folderID, newParentID);
  }
  
  public boolean deleteFolder(java.lang.String ticket, java.lang.String folderID) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.deleteFolder(ticket, folderID);
  }
  
  public th.co.techsphere.www.integration.Folder getFolder(java.lang.String ticket, java.lang.String folderPath) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.getFolder(ticket, folderPath);
  }
  
  public th.co.techsphere.www.integration.Folder getFolderById(java.lang.String ticket, java.lang.String folderId) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.getFolderById(ticket, folderId);
  }
  
  public boolean isFolderExists(java.lang.String ticket, java.lang.String folderPath) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.isFolderExists(ticket, folderPath);
  }
  
  public boolean isTicketValid(java.lang.String ticket) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.isTicketValid(ticket);
  }
  
  public java.lang.String[] roleOfUser(java.lang.String ticket, java.lang.String userName) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.roleOfUser(ticket, userName);
  }
  
  public java.lang.String[] groupOfUser(java.lang.String ticket, java.lang.String userName) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.groupOfUser(ticket, userName);
  }
  
  public th.co.techsphere.www.integration.Document[] getExpiredDocuments(java.lang.String ticket, java.lang.String inputDocTypeName, java.lang.String folderID, boolean withContent) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.getExpiredDocuments(ticket, inputDocTypeName, folderID, withContent);
  }
  
  public boolean addDocumentAccessControl(java.lang.String ticket, java.lang.String docId, java.lang.String identityType, java.lang.String name, java.lang.String accessRight) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.addDocumentAccessControl(ticket, docId, identityType, name, accessRight);
  }
  
  public boolean removeDocumentAccessControl(java.lang.String ticket, java.lang.String docId, java.lang.String identityType, java.lang.String name) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.removeDocumentAccessControl(ticket, docId, identityType, name);
  }
  
  public boolean addFolderAccessControl(java.lang.String ticket, java.lang.String folderId, java.lang.String identityType, java.lang.String name, java.lang.String accessRight) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.addFolderAccessControl(ticket, folderId, identityType, name, accessRight);
  }
  
  public boolean addFolderAccessControlByPath(java.lang.String ticket, java.lang.String folderPath, java.lang.String identityType, java.lang.String name, java.lang.String accessRight, boolean applyToSubFolder, boolean applyToDocument) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.addFolderAccessControlByPath(ticket, folderPath, identityType, name, accessRight, applyToSubFolder, applyToDocument);
  }
  
  public boolean removeFolderAccessControl(java.lang.String ticket, java.lang.String folderId, java.lang.String identityType, java.lang.String name) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.removeFolderAccessControl(ticket, folderId, identityType, name);
  }
  
  public boolean removeFolderAccessControlByPath(java.lang.String ticket, java.lang.String folderPath, java.lang.String identityType, java.lang.String name, boolean applyToSubFolder, boolean applyToDocument) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.removeFolderAccessControlByPath(ticket, folderPath, identityType, name, applyToSubFolder, applyToDocument);
  }
  
  public int reAssignUser(java.lang.String ticket, java.lang.String fromUser, java.lang.String toUser) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.reAssignUser(ticket, fromUser, toUser);
  }
  
  public th.co.techsphere.www.integration.Document[] getVersionHistory(java.lang.String ticket, java.lang.String docID) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.getVersionHistory(ticket, docID);
  }
  
  public th.co.techsphere.www.integration.DocumentType getDocumentTypeByName(java.lang.String ticket, java.lang.String name) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.getDocumentTypeByName(ticket, name);
  }
  
  public th.co.techsphere.www.integration.DocumentType[] getDocumentTypes(java.lang.String ticket) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.getDocumentTypes(ticket);
  }
  
  public th.co.techsphere.www.integration.Document getCurrentVersion(java.lang.String ticket, java.lang.String docID, boolean withContent) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.getCurrentVersion(ticket, docID, withContent);
  }
  
  public boolean isUserExists(java.lang.String ticket, java.lang.String userName) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.isUserExists(ticket, userName);
  }
  
  public boolean changePassword(java.lang.String userName, java.lang.String oldPassword, java.lang.String newPassword) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.changePassword(userName, oldPassword, newPassword);
  }
  
  public boolean createUser(java.lang.String ticket, java.lang.String userName, java.lang.String password, java.lang.String fullName, java.lang.String eMail) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.createUser(ticket, userName, password, fullName, eMail);
  }
  
  public boolean deleteUser(java.lang.String ticket, java.lang.String userName, java.lang.String domain) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.deleteUser(ticket, userName, domain);
  }
  
  public boolean addGroupMember(java.lang.String ticket, java.lang.String groupName, java.lang.String identityType, java.lang.String identityName) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.addGroupMember(ticket, groupName, identityType, identityName);
  }
  
  public boolean addRoleMember(java.lang.String ticket, java.lang.String roleName, java.lang.String identityType, java.lang.String identityName) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.addRoleMember(ticket, roleName, identityType, identityName);
  }
  
  public boolean removeGroupMember(java.lang.String ticket, java.lang.String groupName, java.lang.String identityType, java.lang.String identityName) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.removeGroupMember(ticket, groupName, identityType, identityName);
  }
  
  public boolean removeRoleMember(java.lang.String ticket, java.lang.String roleName, java.lang.String identityType, java.lang.String identityName) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.removeRoleMember(ticket, roleName, identityType, identityName);
  }
  
  public java.lang.String[] listCabinets(java.lang.String ticket) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.listCabinets(ticket);
  }
  
  public th.co.techsphere.www.integration.Folder[] listFolderInCabinet(java.lang.String ticket, java.lang.String cabinet) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.listFolderInCabinet(ticket, cabinet);
  }
  
  public th.co.techsphere.www.integration.Folder[] getSubFolders(java.lang.String ticket, java.lang.String folderId) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.getSubFolders(ticket, folderId);
  }
  
  public th.co.techsphere.www.integration.SearchResult[] fullTextSearch(java.lang.String ticket, java.lang.String query, int maxItems, int skipCount) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.fullTextSearch(ticket, query, maxItems, skipCount);
  }
  
  public th.co.techsphere.www.integration.Stream getDocumentContent(java.lang.String ticket, java.lang.String docID) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.getDocumentContent(ticket, docID);
  }
  
  public th.co.techsphere.www.integration.Document[] getDocumentsByMetaData(java.lang.String ticket, java.lang.String rootFolderPath, java.lang.String docTypeName, java.lang.String metaData, java.lang.String metaDataValue, int pageIndex, int pageSize) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.getDocumentsByMetaData(ticket, rootFolderPath, docTypeName, metaData, metaDataValue, pageIndex, pageSize);
  }
  
  public th.co.techsphere.www.integration.Document[] getDocumentsByMetaDataAndKeyword(java.lang.String ticket, java.lang.String rootFolderPath, java.lang.String docTypeName, java.lang.String metaData, java.lang.String metaDataValue, java.lang.String keywords) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.getDocumentsByMetaDataAndKeyword(ticket, rootFolderPath, docTypeName, metaData, metaDataValue, keywords);
  }
  
  public boolean hasDocumentPermission(java.lang.String ticket, java.lang.String docId, java.lang.String accessRights) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.hasDocumentPermission(ticket, docId, accessRights);
  }
  
  public boolean hasFolderPermission(java.lang.String ticket, java.lang.String folderId, java.lang.String accessRights) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.hasFolderPermission(ticket, folderId, accessRights);
  }
  
  public boolean createGroup(java.lang.String ticket, java.lang.String groupName, java.lang.String description) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.createGroup(ticket, groupName, description);
  }
  
  public boolean deleteGroup(java.lang.String ticket, java.lang.String groupName) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.deleteGroup(ticket, groupName);
  }
  
  public java.lang.String[] listGroups(java.lang.String ticket) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.listGroups(ticket);
  }
  
  public boolean isGroupExists(java.lang.String ticket, java.lang.String groupName) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.isGroupExists(ticket, groupName);
  }
  
  public th.co.techsphere.www.integration.GroupDescription getGroup(java.lang.String ticket, java.lang.String groupName) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.getGroup(ticket, groupName);
  }
  
  public java.lang.String addRelation(java.lang.String ticket, java.lang.String sourceId, java.lang.String targetId, java.lang.String description, java.lang.String relationType) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.addRelation(ticket, sourceId, targetId, description, relationType);
  }
  
  public boolean removeRelation(java.lang.String ticket, java.lang.String relationId, java.lang.String sourceId, boolean ignorePermission) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.removeRelation(ticket, relationId, sourceId, ignorePermission);
  }
  
  public th.co.techsphere.www.integration.Relation[] getObjectRelation(java.lang.String ticket, java.lang.String objectId, java.lang.String direction) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.getObjectRelation(ticket, objectId, direction);
  }
  
  public th.co.techsphere.www.integration.Relation getRelation(java.lang.String ticket, java.lang.String relationId) throws java.rmi.RemoteException{
    if (koolServiceSoap == null)
      _initKoolServiceSoapProxy();
    return koolServiceSoap.getRelation(ticket, relationId);
  }
  
  
}