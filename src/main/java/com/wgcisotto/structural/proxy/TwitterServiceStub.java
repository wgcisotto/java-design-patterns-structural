package com.wgcisotto.structural.proxy;

public class TwitterServiceStub implements TwitterService{

    @Override
    public String getTimeLine(String screenName) {
        return "My neato timeline";
    }

    @Override
    public void postToTimeLine(String screenName, String message) {
        System.out.println(message);
    }
}
