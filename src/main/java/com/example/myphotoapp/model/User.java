package com.example.myphotoapp.model;

public class User {
    private int albumId;
    private String description;
    private String coverPicUrl;
    private String name;
    private String address;
    private int age;

    public User(int albumId, String description, String coverPicUrl, String name, String address, int age) {
        this.albumId = albumId;
        this.description = description;
        this.coverPicUrl = coverPicUrl;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverPicUrl() {
        return coverPicUrl;
    }

    public void setCoverPicUrl(String coverPicUrl) {
        this.coverPicUrl = coverPicUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
