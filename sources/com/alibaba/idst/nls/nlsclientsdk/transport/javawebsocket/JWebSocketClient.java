package com.alibaba.idst.nls.nlsclientsdk.transport.javawebsocket;

import android.util.Log;
import com.alibaba.idst.nls.nlsclientsdk.transport.Connection;
import com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener;
import com.alibaba.idst.nls.nlsclientsdk.util.TimeStampLogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.ConnectException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.java_websocket.WebSocket;
import org.java_websocket.drafts.a;
import org.java_websocket.exceptions.InvalidDataException;
import tb.mu3;
import tb.n0x;
import tb.rcp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class JWebSocketClient extends n0x implements Connection {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CONNECTION_TIMEOUT = 2000;
    private static String TAG = "AliSpeechSDK.Websocket";
    private static CountDownLatch connectLatch;
    private static JWebSocketClient instance;
    private long afterConnect;
    private long beforeConnect;
    private ConnectionListener connectionListener;
    private long handSharkTime;
    private WebsocketStatus status;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum WebsocketStatus {
        STATUS_INIT,
        STATUS_CONNECTED,
        STATUS_STOP,
        STATUS_FAILED,
        STATUS_CLOSED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(WebsocketStatus websocketStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/idst/nls/nlsclientsdk/transport/javawebsocket/JWebSocketClient$WebsocketStatus");
        }

        public static WebsocketStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WebsocketStatus) ipChange.ipc$dispatch("481b0e36", new Object[]{str});
            }
            return (WebsocketStatus) Enum.valueOf(WebsocketStatus.class, str);
        }
    }

    static {
        t2o.a(199229477);
        t2o.a(199229475);
    }

    private JWebSocketClient(URI uri, Map<String, String> map) {
        super(uri, new a(), map, 2000);
        super.setTcpNoDelay(true);
        super.setConnectionLostTimeout(2000);
    }

    public static JWebSocketClient getInstance(URI uri, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JWebSocketClient) ipChange.ipc$dispatch("a26aef13", new Object[]{uri, map});
        }
        if (instance == null) {
            instance = new JWebSocketClient(uri, map);
        }
        return instance;
    }

    public static /* synthetic */ Object ipc$super(JWebSocketClient jWebSocketClient, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -645202666:
                super.send((byte[]) objArr[0]);
                return null;
            case -483678593:
                super.close();
                return null;
            case 378876953:
                super.send((String) objArr[0]);
                return null;
            case 964359391:
                super.setConnectionLostTimeout(((Number) objArr[0]).intValue());
                return null;
            case 2111414762:
                super.setTcpNoDelay(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/idst/nls/nlsclientsdk/transport/javawebsocket/JWebSocketClient");
        }
    }

    @Override // tb.n0x, com.alibaba.idst.nls.nlsclientsdk.transport.Connection
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            super.close();
        }
    }

    public Connection connect(ConnectionListener connectionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Connection) ipChange.ipc$dispatch("1eef5299", new Object[]{this, connectionListener});
        }
        try {
            connectLatch = new CountDownLatch(1);
            this.beforeConnect = System.currentTimeMillis();
            new StringBuilder("before connection time ").append(this.beforeConnect);
            this.status = WebsocketStatus.STATUS_INIT;
            this.connectionListener = connectionListener;
            super.setConnectionLostTimeout(2000);
            connectBlocking();
            return this;
        } catch (InterruptedException e) {
            e.printStackTrace();
            close();
            connectionListener.onError(e);
            return null;
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.Connection
    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return null;
    }

    public WebsocketStatus getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebsocketStatus) ipChange.ipc$dispatch("42cf48c0", new Object[]{this});
        }
        return this.status;
    }

    @Override // tb.n0x
    public void onClose(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff565c7", new Object[]{this, new Integer(i), str, new Boolean(z)});
            return;
        }
        WebsocketStatus websocketStatus = this.status;
        WebsocketStatus websocketStatus2 = WebsocketStatus.STATUS_CLOSED;
        if (websocketStatus != websocketStatus2) {
            this.status = websocketStatus2;
            StringBuilder sb = new StringBuilder("Jwebsocket close with ");
            sb.append(i);
            sb.append(" reason: ");
            sb.append(str);
            this.connectionListener.onClose(i, str);
            setStatus(websocketStatus2);
            instance = null;
        }
    }

    @Override // tb.n0x
    public void onError(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b14ba516", new Object[]{this, exc});
            return;
        }
        if (this.status != WebsocketStatus.STATUS_CLOSED) {
            this.connectionListener.onError(exc);
        }
        this.status = WebsocketStatus.STATUS_FAILED;
        instance = null;
    }

    @Override // tb.n0x
    public void onMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6056db9", new Object[]{this, str});
            return;
        }
        new StringBuilder("reponse message length ").append(str.length());
        this.connectionListener.onMessage(str);
    }

    @Override // tb.n0x
    public void onOpen(rcp rcpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18ccdb5d", new Object[]{this, rcpVar});
            return;
        }
        new StringBuilder("onOpen time ").append(System.currentTimeMillis());
        this.status = WebsocketStatus.STATUS_CONNECTED;
        this.connectionListener.onOpen();
        TimeStampLogUtil.getInstance();
        TimeStampLogUtil.printLog("time_stamp_network_connected", null, null);
    }

    @Override // tb.j0x, tb.y0x
    public void onWebsocketHandshakeReceivedAsClient(WebSocket webSocket, mu3 mu3Var, rcp rcpVar) throws InvalidDataException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5728e378", new Object[]{this, webSocket, mu3Var, rcpVar});
            return;
        }
        this.status = WebsocketStatus.STATUS_CONNECTED;
        connectLatch.countDown();
        StringBuilder sb = new StringBuilder("response headers[sec-websocket-extensions]:{");
        sb.append(rcpVar.getFieldValue("sec-websocket-extensions"));
        sb.append("}");
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.Connection
    public void sendBinary(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79e5277", new Object[]{this, bArr});
        } else if (this.status != WebsocketStatus.STATUS_CONNECTED) {
            Log.e(TAG, new ConnectException("SendBinary, Network status error, current status is " + this.status).getMessage());
        } else {
            try {
                super.send(bArr);
            } catch (Exception e) {
                this.connectionListener.onError(e);
                String str = TAG;
                Log.e(str, "could not send binary frame" + e);
            }
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.Connection
    public void sendText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfff41a6", new Object[]{this, str});
            return;
        }
        if (connectLatch.getCount() > 0) {
            Boolean bool = Boolean.FALSE;
            try {
                bool = Boolean.valueOf(connectLatch.await(2000L, TimeUnit.MILLISECONDS));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!bool.booleanValue()) {
                return;
            }
        }
        if (this.status != WebsocketStatus.STATUS_CONNECTED) {
            Log.e(TAG, new ConnectException("Network status error, current status is " + this.status).getMessage());
            return;
        }
        StringBuilder sb = new StringBuilder("thread:{");
        sb.append(Thread.currentThread().getId());
        sb.append("},send:{");
        sb.append(str);
        sb.append("}");
        try {
            super.send(str);
        } catch (Exception e2) {
            this.connectionListener.onError(e2);
            new StringBuilder("could not send text frame: ").append(e2);
        }
    }

    public void setStatus(WebsocketStatus websocketStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5faa1b4", new Object[]{this, websocketStatus});
        } else {
            this.status = websocketStatus;
        }
    }

    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
        } else {
            close();
        }
    }

    @Override // tb.n0x
    public void onMessage(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e36702", new Object[]{this, byteBuffer});
        } else {
            this.connectionListener.onMessage(byteBuffer);
        }
    }
}
