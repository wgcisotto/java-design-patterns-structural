package com.wgcisotto.structural.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwitterExampleTest {

    @Test
    public void run(){

        TwitterService service = (TwitterService) SecurityProxy.newIntance(new TwitterServiceStub());

        assertEquals("My neato timeline", service.getTimeLine("aaaa"));

        assertThrows(RuntimeException.class, ()-> service.postToTimeLine("post", "This message should'nt go through.") );

    }


}