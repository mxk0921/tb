package tb;

import org.java_websocket.WebSocket;
import org.java_websocket.drafts.Draft;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.framing.Framedata;
import org.java_websocket.framing.g;
import org.java_websocket.framing.h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class j0x implements y0x {
    @Override // tb.y0x
    public scp onWebsocketHandshakeReceivedAsServer(WebSocket webSocket, Draft draft, mu3 mu3Var) throws InvalidDataException {
        return new dta();
    }

    @Override // tb.y0x
    public void onWebsocketPing(WebSocket webSocket, Framedata framedata) {
        webSocket.sendFrame(new h((g) framedata));
    }

    @Override // tb.y0x
    public void onWebsocketHandshakeSentAsClient(WebSocket webSocket, mu3 mu3Var) throws InvalidDataException {
    }

    @Deprecated
    public void onWebsocketMessageFragment(WebSocket webSocket, Framedata framedata) {
    }

    @Override // tb.y0x
    public void onWebsocketPong(WebSocket webSocket, Framedata framedata) {
    }

    @Override // tb.y0x
    public void onWebsocketHandshakeReceivedAsClient(WebSocket webSocket, mu3 mu3Var, rcp rcpVar) throws InvalidDataException {
    }
}
