package com.example.springcore.app6;

import java.util.List;
import java.util.Map;

public class Person {

    List<String> friendsList;
    Map<String,String> friendsRelationInfo;

    public Map<String, String> getFriendsRelationInfo() {
        return friendsRelationInfo;
    }

    public void setFriendsRelationInfo(Map<String, String> friendsRelationInfo) {
        this.friendsRelationInfo = friendsRelationInfo;
    }

    public List<String> getFriendsList() {
        return friendsList;
    }

    public void setFriendsList(List<String> friendsList) {
        this.friendsList = friendsList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friendsList=" + friendsList +
                ", friendsRelationInfo=" + friendsRelationInfo +
                '}';
    }
}
