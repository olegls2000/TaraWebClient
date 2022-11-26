package com.wms.tarawebclient.response;

public class AlbumRest {
  private String userId;
  private String albumId;
  private String albumTitle;
  private String albumDescription;
  private String albumIrl;


  public AlbumRest() {
  }

  public AlbumRest(String userId, String albumId, String albumTitle,
                   String albumDescription, String albumIrl) {
    this.userId = userId;
    this.albumId = albumId;
    this.albumTitle = albumTitle;
    this.albumDescription = albumDescription;
    this.albumIrl = albumIrl;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getAlbumId() {
    return albumId;
  }

  public void setAlbumId(String albumId) {
    this.albumId = albumId;
  }

  public String getAlbumTitle() {
    return albumTitle;
  }

  public void setAlbumTitle(String albumTitle) {
    this.albumTitle = albumTitle;
  }

  public String getAlbumDescription() {
    return albumDescription;
  }

  public void setAlbumDescription(String albumDescription) {
    this.albumDescription = albumDescription;
  }

  public String getAlbumIrl() {
    return albumIrl;
  }

  public void setAlbumIrl(String albumIrl) {
    this.albumIrl = albumIrl;
  }
}
