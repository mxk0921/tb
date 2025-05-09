package com.alipay.android.phone.mobilesdk.socketcraft.api;

import com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_17;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.DataflowMonitorModel;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorHelper;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatUtil;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskUtil;
import com.alipay.android.phone.mobilesdk.socketcraft.util.Charsetfunctions;
import com.alipay.android.phone.mobilesdk.socketcraft.util.WsMessageConstants;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DefaultWebSocketClient extends WebSocketClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_CONNECTION_TIMEOUT = 60000;
    public static final int MIN_CONNECTION_TIMEOUT = 4000;
    private static final String v = "WebSocketClient";
    private WebSocketCallback n;
    private Framedata o;
    private String p;
    private long q;
    private ScheduledFuture<?> r;
    private WebSocketContext s;
    private MonitorHelper t;
    private boolean u;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class SCConnectionTimerRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String b = "SCConnectionTimerRunnable";

        /* renamed from: a  reason: collision with root package name */
        private DefaultWebSocketClient f3752a;
        public WebSocketCallback webSocketCallback;

        public SCConnectionTimerRunnable(DefaultWebSocketClient defaultWebSocketClient, WebSocketCallback webSocketCallback) {
            this.f3752a = defaultWebSocketClient;
            this.webSocketCallback = webSocketCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SCLogCatUtil.error(b, "connect response time out");
            try {
                DefaultWebSocketClient.this.onError(WsMessageConstants.MSG_CONNECTION_TIME_OUT);
            } catch (Throwable th) {
                SCLogCatUtil.error(b, "onSocketError error", th);
            }
            try {
                this.f3752a.close();
            } catch (Throwable th2) {
                SCLogCatUtil.error(b, "close socket error", th2);
            }
        }
    }

    public DefaultWebSocketClient(URI uri, Draft draft, Map<String, String> map, int i, WebSocketCallback webSocketCallback, WebSocketContext webSocketContext) {
        super(uri, draft, map, i);
        this.u = false;
        this.n = webSocketCallback;
        this.p = uri.toString();
        this.s = webSocketContext;
        if (i > 4000) {
            this.q = i;
        } else {
            this.q = Constants.STARTUP_TIME_LEVEL_1;
        }
        this.t = new MonitorHelper(this);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1718f5", new Object[]{this});
            return;
        }
        SCLogCatUtil.info(v, "enter afterConnect");
        this.t.recordConnectedTime();
        this.t.printConnMonitorLog();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b28b72", new Object[]{this});
            return;
        }
        SCLogCatUtil.info(v, "enter beforeConnect");
        this.t.recordStartConnAllTime();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c6e38a8", new Object[]{this});
            return;
        }
        try {
            SCLogCatUtil.info(v, "cancelTimeoutScheduleFuture. try to stop connectTimer");
            ScheduledFuture<?> scheduledFuture = this.r;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.r = null;
            }
        } catch (Throwable th) {
            SCLogCatUtil.error(v, "cancelTimeoutScheduleFuture. Cancel old timeoutScheduleFuture error", th);
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa4704c", new Object[]{this});
            return;
        }
        f();
        this.r = SCNetworkAsyncTaskUtil.schedule(new SCConnectionTimerRunnable(this, this.n), this.q, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ Object ipc$super(DefaultWebSocketClient defaultWebSocketClient, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1897007826:
                super.close(((Number) objArr[0]).intValue(), (String) objArr[1]);
                return null;
            case -645202666:
                super.send((byte[]) objArr[0]);
                return null;
            case -483678593:
                super.close();
                return null;
            case 378876953:
                super.send((String) objArr[0]);
                return null;
            case 656247882:
                return new Boolean(super.connectBlocking());
            case 1696695458:
                super.send((ByteBuffer) objArr[0]);
                return null;
            case 1722775665:
                super.connect();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/phone/mobilesdk/socketcraft/api/DefaultWebSocketClient");
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient, com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        try {
            SCLogCatUtil.info(v, "close. try to close socket");
            this.u = true;
            super.close();
        } catch (Throwable th) {
            SCLogCatUtil.error(v, "send err. ", th);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void connect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66af7871", new Object[]{this});
            return;
        }
        e();
        super.connect();
        g();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public boolean connectBlocking() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("271d8c4a", new Object[]{this})).booleanValue();
        }
        e();
        return super.connectBlocking();
    }

    public void connectBlockingWithSSL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f013302e", new Object[]{this});
            return;
        }
        setSslSocketFactory((SSLSocketFactory) SSLSocketFactory.getDefault());
        connectBlocking();
    }

    public void connectWithSSL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43924da3", new Object[]{this});
            return;
        }
        setSslSocketFactory((SSLSocketFactory) SSLSocketFactory.getDefault());
        connect();
    }

    public String getBizUniqId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bafc5e0", new Object[]{this});
        }
        Object attribute = getWebSocketContext().getAttribute(WSContextConstant.BIZ_UNIQUE_ID);
        if (attribute == null || !(attribute instanceof String)) {
            return "unkown";
        }
        return String.valueOf(attribute);
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.p;
    }

    public WebSocketCallback getWebSocketCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebSocketCallback) ipChange.ipc$dispatch("8ba7afc2", new Object[]{this});
        }
        return this.n;
    }

    public WebSocketContext getWebSocketContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebSocketContext) ipChange.ipc$dispatch("34474a68", new Object[]{this});
        }
        WebSocketContext webSocketContext = this.s;
        if (webSocketContext != null) {
            return webSocketContext;
        }
        synchronized (this) {
            try {
                WebSocketContext webSocketContext2 = this.s;
                if (webSocketContext2 != null) {
                    return webSocketContext2;
                }
                BasicWebSocketContext basicWebSocketContext = new BasicWebSocketContext();
                this.s = basicWebSocketContext;
                return basicWebSocketContext;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void onDns(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f324c49", new Object[]{this, str, new Long(j)});
            return;
        }
        this.t.recordDnsTime(j);
        this.t.recordTargetHost(str);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void onError(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b14ba516", new Object[]{this, exc});
            return;
        }
        String str = this.p;
        String obj = exc.toString();
        SCLogCatUtil.error(v, "onError. url is " + str + " ,error is " + obj, exc);
        StringBuilder sb = new StringBuilder("exception: ");
        sb.append(exc.getMessage());
        onSocketError(sb.toString());
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void onFragment(Framedata framedata) {
        Framedata framedata2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef752684", new Object[]{this, framedata});
            return;
        }
        Framedata.Opcode opcode = framedata.getOpcode();
        Framedata.Opcode opcode2 = Framedata.Opcode.CONTINUOUS;
        if (opcode != opcode2 && !framedata.isFin()) {
            this.o = framedata;
        } else if (framedata.getOpcode() == opcode2 && (framedata2 = this.o) != null) {
            if (framedata2.getPayloadData().position() > 10485760) {
                SCLogCatUtil.warn(v, "onFragment. Pending frame exploded");
                onError(new RuntimeException(WsMessageConstants.MSG_PENDING_FRAME_EXPLODED));
                close();
                this.o = null;
                return;
            }
            try {
                this.o.append(framedata);
            } catch (Throwable th) {
                SCLogCatUtil.warn(v, "onFragment. append frame err. ", th);
            }
            if (framedata.isFin()) {
                if (this.o.getOpcode() == Framedata.Opcode.BINARY) {
                    onMessage(this.o.getPayloadData());
                } else if (this.o.getOpcode() == Framedata.Opcode.TEXT) {
                    try {
                        String stringUtf8 = Charsetfunctions.stringUtf8(this.o.getPayloadData());
                        if (stringUtf8 == null) {
                            stringUtf8 = "";
                        }
                        onMessage(stringUtf8);
                    } catch (Throwable th2) {
                        SCLogCatUtil.warn(v, "onFragment. ByteBuffer to String err ", th2);
                    }
                }
                this.o = null;
            }
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void onMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6056db9", new Object[]{this, str});
            return;
        }
        SCLogCatUtil.info(v, String.format("onMessage. url is %s ,socket onmessage length :%d", this.p, Integer.valueOf(str != null ? str.length() : -1)));
        if (str != null && str.length() > 0) {
            this.n.onSocketMessage(str);
            this.t.recordMonitorOfRecvMsg(str.length());
            this.t.noteTraficConsume(new DataflowMonitorModel(this.p, getBizUniqId(), "receive", 0, str.length()));
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void onOpen(ServerHandshake serverHandshake) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db2ef614", new Object[]{this, serverHandshake});
            return;
        }
        d();
        f();
        String str = this.p;
        SCLogCatUtil.info(v, "onOpen. url is " + str + " , state: opened");
        this.n.onSocketOpen();
        this.t.noteTraficConsume(new DataflowMonitorModel(this.p, getBizUniqId(), "connect", this.p.length() + WSContextConstant.HANDSHAKE_SEND_SIZE, WSContextConstant.HANDSHAKE_RECEIVE_SIZE));
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void onSSLHandshake(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("180eb693", new Object[]{this, new Long(j)});
        } else {
            this.t.recordSSLTime(j);
        }
    }

    public void onSocketError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7adf907", new Object[]{this, str});
            return;
        }
        this.n.onSocketError(str);
        this.t.printErrorMonitorLog("1", str);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void onTcpConnect(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3713a44b", new Object[]{this, str, new Long(j)});
            return;
        }
        this.t.recordTcpTime(j);
        this.t.recordTargetHost(str);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void onWsHandshake(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("685f4781", new Object[]{this, new Long(j)});
            return;
        }
        SCLogCatUtil.info(v, "onWsHandshake cost: " + j);
        this.t.recordWsHsTime(j);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient, com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void send(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16953419", new Object[]{this, str});
        } else if (str == null) {
            SCLogCatUtil.warn(v, "[send] text is null");
        } else {
            if (str.length() <= 0) {
                SCLogCatUtil.warn(v, "[send] text is empty, but continue send.");
            }
            super.send(str);
            this.t.recordMonitorOfSndMsg(str.length());
            this.t.noteTraficConsume(new DataflowMonitorModel(this.p, getBizUniqId(), "send", str.length(), 0));
        }
    }

    public void setWebSocketContext(WebSocketContext webSocketContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2998482", new Object[]{this, webSocketContext});
        } else {
            this.s = webSocketContext;
        }
    }

    public void onError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
            return;
        }
        String str2 = this.p;
        SCLogCatUtil.error(v, "onError. url is " + str2 + " ,error is " + str);
        onSocketError(str);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient, com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void close(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eedf52e", new Object[]{this, new Integer(i), str});
            return;
        }
        try {
            SCLogCatUtil.info(v, "close. try to close socket");
            this.u = true;
            super.close(i, str);
        } catch (Throwable th) {
            SCLogCatUtil.error(v, "send err. ", th);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void onClose(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff565c7", new Object[]{this, new Integer(i), str, new Boolean(z)});
            return;
        }
        f();
        SCLogCatUtil.info(v, String.format("onClose. url is %s ,state: closed ,reason: %s, errCode = %d, remote = %s", this.p, str, Integer.valueOf(i), Boolean.toString(z)));
        if (this.u || !(i == -1 || i == -2 || i == -3)) {
            this.n.onSocketClose();
        } else {
            onError(str);
        }
        this.t.printDisconnMonitorLog();
        this.t.noteTraficConsume(new DataflowMonitorModel(this.p, getBizUniqId(), "close", 0, 0));
    }

    public DefaultWebSocketClient(URI uri, Draft draft, Map<String, String> map, int i, WebSocketCallback webSocketCallback) {
        this(uri, draft, map, i, webSocketCallback, new BasicWebSocketContext());
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void onMessage(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e36702", new Object[]{this, byteBuffer});
            return;
        }
        SCLogCatUtil.info(v, String.format("onMessage. url is %s , socket onMessage buffer length : %d", this.p, Integer.valueOf(byteBuffer != null ? byteBuffer.position() : -1)));
        if (byteBuffer != null) {
            this.n.onSocketMessage(byteBuffer);
            this.t.recordMonitorOfRecvMsg(byteBuffer.position());
            this.t.noteTraficConsume(new DataflowMonitorModel(this.p, getBizUniqId(), "receive", 0, byteBuffer.array().length));
        }
    }

    public DefaultWebSocketClient(URI uri, Map<String, String> map, WebSocketCallback webSocketCallback) {
        this(uri, new Draft_17(), map, 60000, webSocketCallback);
    }

    public DefaultWebSocketClient(URI uri, Map<String, String> map, WebSocketCallback webSocketCallback, WebSocketContext webSocketContext) {
        this(uri, new Draft_17(), map, 60000, webSocketCallback, webSocketContext);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient, com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void send(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d98afd16", new Object[]{this, bArr});
        } else if (bArr == null || bArr.length <= 0) {
            SCLogCatUtil.warn(v, "[send] byte[] is null or length <= 0.");
        } else {
            super.send(bArr);
            this.t.recordMonitorOfSndMsg(bArr.length);
            this.t.noteTraficConsume(new DataflowMonitorModel(this.p, getBizUniqId(), "send", bArr.length, 0));
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient, com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void send(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652184a2", new Object[]{this, byteBuffer});
        } else if (byteBuffer == null || byteBuffer.array().length <= 0) {
            SCLogCatUtil.warn(v, "[send] ByteBuffer is null or length <= 0.");
        } else {
            super.send(byteBuffer);
            this.t.recordMonitorOfSndMsg(byteBuffer.array().length);
            this.t.noteTraficConsume(new DataflowMonitorModel(this.p, getBizUniqId(), "send", byteBuffer.array().length, 0));
        }
    }
}
