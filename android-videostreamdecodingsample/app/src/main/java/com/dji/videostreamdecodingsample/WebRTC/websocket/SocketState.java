package com.dji.videostreamdecodingsample.WebRTC.websocket;
/**
 * Main socket connection states
 */
public enum SocketState {
    CLOSED, CLOSING, CONNECT_ERROR, RECONNECT_ATTEMPT, RECONNECTING, OPENING, OPEN
}
