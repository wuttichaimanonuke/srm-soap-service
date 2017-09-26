/**
 * KoolServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package th.co.techsphere.www.integration;

public interface KoolServiceSoap extends java.rmi.Remote {
    public java.lang.String signin(java.lang.String user, java.lang.String password) throws java.rmi.RemoteException;
    public boolean signOut(java.lang.String ticket) throws java.rmi.RemoteException;
    public th.co.techsphere.www.integration.Document[] getDocuments(java.lang.String ticket, java.lang.String docTypeName, java.lang.String metaData, java.lang.String metaDataValue, int pageIndex, int pageSize) throws java.rmi.RemoteException;
    public int getDocumentCount(java.lang.String ticket, java.lang.String docTypeName, java.lang.String metaData, java.lang.String metaDataValue) throws java.rmi.RemoteException;
    public th.co.techsphere.www.integration.Document getDocument(java.lang.String ticket, java.lang.String docID, boolean withContent) throws java.rmi.RemoteException;
    public th.co.techsphere.www.integration.Document[] getDocumentInFolder(java.lang.String ticket, java.lang.String folderId, boolean includeSubFolder, boolean withContent) throws java.rmi.RemoteException;
    public boolean updateDocumentMetaData(java.lang.String ticket, java.lang.String docID, java.lang.String inputDocTypeName, java.lang.String inputMetaData, java.lang.String inputMetaDataValue) throws java.rmi.RemoteException;
    public boolean updateFolderMetaData(java.lang.String ticket, java.lang.String folderID, java.lang.String inputDocTypeName, java.lang.String inputMetaData, java.lang.String inputMetaDataValue) throws java.rmi.RemoteException;
    public java.lang.String newDocument(java.lang.String ticket, java.lang.String pathFolder, java.lang.String name, java.lang.String inputDocTypeName, java.lang.String inputMetaData, java.lang.String inputMetaDataValue, java.lang.String image, java.lang.String imageExtention, java.lang.String retentionDate) throws java.rmi.RemoteException;
    public th.co.techsphere.www.integration.Document checkOutDocument(java.lang.String ticket, java.lang.String docID) throws java.rmi.RemoteException;
    public boolean checkInDocument(java.lang.String ticket, java.lang.String docID, java.lang.String image, java.lang.String imageExtention, java.lang.String version) throws java.rmi.RemoteException;
    public boolean lockDoc(java.lang.String ticket, java.lang.String docID) throws java.rmi.RemoteException;
    public boolean unLockDoc(java.lang.String ticket, java.lang.String docID) throws java.rmi.RemoteException;
    public boolean renameDoc(java.lang.String ticket, java.lang.String docID, java.lang.String newName) throws java.rmi.RemoteException;
    public boolean moveDocToFolder(java.lang.String ticket, java.lang.String docID, java.lang.String folderId) throws java.rmi.RemoteException;
    public boolean deleteDoc(java.lang.String ticket, java.lang.String docID, boolean allVersion) throws java.rmi.RemoteException;
    public boolean changeDocOwner(java.lang.String ticket, java.lang.String docID, java.lang.String newOwner) throws java.rmi.RemoteException;
    public boolean changeDocRetentionDate(java.lang.String ticket, java.lang.String docID, java.lang.String retentionDate) throws java.rmi.RemoteException;
    public java.lang.String newFolder(java.lang.String ticket, java.lang.String folderName, java.lang.String pathFolder, java.lang.String inputDocTypeName, java.lang.String inputMetaData, java.lang.String inputMetaDataValue) throws java.rmi.RemoteException;
    public boolean renameFolder(java.lang.String ticket, java.lang.String folderID, java.lang.String newFolderName) throws java.rmi.RemoteException;
    public boolean moveFolderToFolder(java.lang.String ticket, java.lang.String folderID, java.lang.String newParentID) throws java.rmi.RemoteException;
    public boolean deleteFolder(java.lang.String ticket, java.lang.String folderID) throws java.rmi.RemoteException;
    public th.co.techsphere.www.integration.Folder getFolder(java.lang.String ticket, java.lang.String folderPath) throws java.rmi.RemoteException;
    public th.co.techsphere.www.integration.Folder getFolderById(java.lang.String ticket, java.lang.String folderId) throws java.rmi.RemoteException;
    public boolean isFolderExists(java.lang.String ticket, java.lang.String folderPath) throws java.rmi.RemoteException;
    public boolean isTicketValid(java.lang.String ticket) throws java.rmi.RemoteException;
    public java.lang.String[] roleOfUser(java.lang.String ticket, java.lang.String userName) throws java.rmi.RemoteException;
    public java.lang.String[] groupOfUser(java.lang.String ticket, java.lang.String userName) throws java.rmi.RemoteException;
    public th.co.techsphere.www.integration.Document[] getExpiredDocuments(java.lang.String ticket, java.lang.String inputDocTypeName, java.lang.String folderID, boolean withContent) throws java.rmi.RemoteException;
    public boolean addDocumentAccessControl(java.lang.String ticket, java.lang.String docId, java.lang.String identityType, java.lang.String name, java.lang.String accessRight) throws java.rmi.RemoteException;
    public boolean removeDocumentAccessControl(java.lang.String ticket, java.lang.String docId, java.lang.String identityType, java.lang.String name) throws java.rmi.RemoteException;
    public boolean addFolderAccessControl(java.lang.String ticket, java.lang.String folderId, java.lang.String identityType, java.lang.String name, java.lang.String accessRight) throws java.rmi.RemoteException;
    public boolean addFolderAccessControlByPath(java.lang.String ticket, java.lang.String folderPath, java.lang.String identityType, java.lang.String name, java.lang.String accessRight, boolean applyToSubFolder, boolean applyToDocument) throws java.rmi.RemoteException;
    public boolean removeFolderAccessControl(java.lang.String ticket, java.lang.String folderId, java.lang.String identityType, java.lang.String name) throws java.rmi.RemoteException;
    public boolean removeFolderAccessControlByPath(java.lang.String ticket, java.lang.String folderPath, java.lang.String identityType, java.lang.String name, boolean applyToSubFolder, boolean applyToDocument) throws java.rmi.RemoteException;
    public int reAssignUser(java.lang.String ticket, java.lang.String fromUser, java.lang.String toUser) throws java.rmi.RemoteException;
    public th.co.techsphere.www.integration.Document[] getVersionHistory(java.lang.String ticket, java.lang.String docID) throws java.rmi.RemoteException;
    public th.co.techsphere.www.integration.DocumentType getDocumentTypeByName(java.lang.String ticket, java.lang.String name) throws java.rmi.RemoteException;
    public th.co.techsphere.www.integration.DocumentType[] getDocumentTypes(java.lang.String ticket) throws java.rmi.RemoteException;
    public th.co.techsphere.www.integration.Document getCurrentVersion(java.lang.String ticket, java.lang.String docID, boolean withContent) throws java.rmi.RemoteException;
    public boolean isUserExists(java.lang.String ticket, java.lang.String userName) throws java.rmi.RemoteException;
    public boolean changePassword(java.lang.String userName, java.lang.String oldPassword, java.lang.String newPassword) throws java.rmi.RemoteException;
    public boolean createUser(java.lang.String ticket, java.lang.String userName, java.lang.String password, java.lang.String fullName, java.lang.String eMail) throws java.rmi.RemoteException;
    public boolean deleteUser(java.lang.String ticket, java.lang.String userName, java.lang.String domain) throws java.rmi.RemoteException;
    public boolean addGroupMember(java.lang.String ticket, java.lang.String groupName, java.lang.String identityType, java.lang.String identityName) throws java.rmi.RemoteException;
    public boolean addRoleMember(java.lang.String ticket, java.lang.String roleName, java.lang.String identityType, java.lang.String identityName) throws java.rmi.RemoteException;
    public boolean removeGroupMember(java.lang.String ticket, java.lang.String groupName, java.lang.String identityType, java.lang.String identityName) throws java.rmi.RemoteException;
    public boolean removeRoleMember(java.lang.String ticket, java.lang.String roleName, java.lang.String identityType, java.lang.String identityName) throws java.rmi.RemoteException;
    public java.lang.String[] listCabinets(java.lang.String ticket) throws java.rmi.RemoteException;
    public th.co.techsphere.www.integration.Folder[] listFolderInCabinet(java.lang.String ticket, java.lang.String cabinet) throws java.rmi.RemoteException;
    public th.co.techsphere.www.integration.Folder[] getSubFolders(java.lang.String ticket, java.lang.String folderId) throws java.rmi.RemoteException;
    public th.co.techsphere.www.integration.SearchResult[] fullTextSearch(java.lang.String ticket, java.lang.String query, int maxItems, int skipCount) throws java.rmi.RemoteException;
    public th.co.techsphere.www.integration.Stream getDocumentContent(java.lang.String ticket, java.lang.String docID) throws java.rmi.RemoteException;
    public th.co.techsphere.www.integration.Document[] getDocumentsByMetaData(java.lang.String ticket, java.lang.String rootFolderPath, java.lang.String docTypeName, java.lang.String metaData, java.lang.String metaDataValue, int pageIndex, int pageSize) throws java.rmi.RemoteException;
    public th.co.techsphere.www.integration.Document[] getDocumentsByMetaDataAndKeyword(java.lang.String ticket, java.lang.String rootFolderPath, java.lang.String docTypeName, java.lang.String metaData, java.lang.String metaDataValue, java.lang.String keywords) throws java.rmi.RemoteException;
    public boolean hasDocumentPermission(java.lang.String ticket, java.lang.String docId, java.lang.String accessRights) throws java.rmi.RemoteException;
    public boolean hasFolderPermission(java.lang.String ticket, java.lang.String folderId, java.lang.String accessRights) throws java.rmi.RemoteException;
    public boolean createGroup(java.lang.String ticket, java.lang.String groupName, java.lang.String description) throws java.rmi.RemoteException;
    public boolean deleteGroup(java.lang.String ticket, java.lang.String groupName) throws java.rmi.RemoteException;
    public java.lang.String[] listGroups(java.lang.String ticket) throws java.rmi.RemoteException;
    public boolean isGroupExists(java.lang.String ticket, java.lang.String groupName) throws java.rmi.RemoteException;
    public th.co.techsphere.www.integration.GroupDescription getGroup(java.lang.String ticket, java.lang.String groupName) throws java.rmi.RemoteException;
    public java.lang.String addRelation(java.lang.String ticket, java.lang.String sourceId, java.lang.String targetId, java.lang.String description, java.lang.String relationType) throws java.rmi.RemoteException;
    public boolean removeRelation(java.lang.String ticket, java.lang.String relationId, java.lang.String sourceId, boolean ignorePermission) throws java.rmi.RemoteException;
    public th.co.techsphere.www.integration.Relation[] getObjectRelation(java.lang.String ticket, java.lang.String objectId, java.lang.String direction) throws java.rmi.RemoteException;
    public th.co.techsphere.www.integration.Relation getRelation(java.lang.String ticket, java.lang.String relationId) throws java.rmi.RemoteException;
}
