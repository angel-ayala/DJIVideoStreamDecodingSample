package com.dji.videostreamdecodingsample.WebRTC.websocket;

public interface OnEventListener {
    /**
     * Invoked when new message received from websocket with {event, data} structure
     *
     * @param data Data string received
     */
    void onMessage(String data);
}
