package org.android.spdy;

import anet.channel.util.HttpConstant;
import com.alipay.mobile.common.rpc.ProtocolVersions;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import tb.l0r;
import tb.wh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SpdyRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GET_METHOD = "GET";
    public static final String POST_METHOD = "POST";
    private static final String TAG = "tnetsdk.SpdyRequest";
    private int bodyRdTimeoutMs;
    private int connectionTimeoutMs;
    private String domain;
    private Map<String, String> extHead;
    private String host;
    private String method;
    private int port;
    private RequestPriority priority;
    private String proxyIp;
    private int proxyPort;
    private int requestFecDownSize;
    private int requestFecUpSize;
    private int requestRdTimeoutMs;
    private int requestRecvRateBps;
    private int requestTimeoutMs;
    private int retryTimes;
    private URL url;

    public SpdyRequest(URL url, String str, String str2, int i, String str3, int i2, String str4, RequestPriority requestPriority, int i3, int i4, int i5) {
        this.domain = "";
        this.proxyIp = "0.0.0.0";
        this.proxyPort = 0;
        this.extHead = new HashMap(5);
        this.priority = RequestPriority.DEFAULT_PRIORITY;
        this.requestTimeoutMs = 20000;
        this.requestRdTimeoutMs = 0;
        this.bodyRdTimeoutMs = 0;
        this.connectionTimeoutMs = 0;
        this.retryTimes = 0;
        this.requestRecvRateBps = 0;
        this.requestFecDownSize = 0;
        this.requestFecUpSize = 0;
        this.url = url;
        if (str != null) {
            this.domain = str;
        }
        this.host = str2;
        this.port = i;
        if (!(str3 == null || i2 == 0)) {
            this.proxyIp = str3;
            this.proxyPort = i2;
        }
        this.method = str4;
        if (requestPriority != null) {
            this.priority = requestPriority;
        }
        this.requestTimeoutMs = i3;
        this.connectionTimeoutMs = i4;
        this.retryTimes = i5;
    }

    private String getPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f56e13e", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.url.getPath());
        if (this.url.getQuery() != null) {
            sb.append("?");
            sb.append(this.url.getQuery());
        }
        if (this.url.getRef() != null) {
            sb.append("#");
            sb.append(this.url.getRef());
        }
        if (sb.length() == 0) {
            sb.append(wh6.DIR);
        }
        return sb.toString();
    }

    public void addHeader(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f9a6a9", new Object[]{this, str, str2});
        } else {
            this.extHead.put(str, str2);
        }
    }

    public void addHeaders(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933edc59", new Object[]{this, map});
        } else {
            this.extHead.putAll(map);
        }
    }

    public String getAuthority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3dac808c", new Object[]{this});
        }
        return this.host + ":" + Integer.toString(this.port) + "/" + this.proxyIp + ":" + this.proxyPort;
    }

    public int getBodyRdTimeoutMs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8ce2197", new Object[]{this})).intValue();
        }
        return this.bodyRdTimeoutMs;
    }

    public int getConnectionTimeoutMs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b39ed6d", new Object[]{this})).intValue();
        }
        return this.connectionTimeoutMs;
    }

    public String getDomain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fba2f7f", new Object[]{this});
        }
        return this.domain;
    }

    public Map<String, String> getHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        HashMap hashMap = new HashMap(5);
        hashMap.put(":path", getPath());
        hashMap.put(":method", this.method);
        hashMap.put(":version", ProtocolVersions.HTTP_1_1);
        hashMap.put(":host", this.url.getAuthority());
        hashMap.put(":scheme", this.url.getProtocol());
        Map<String, String> map = this.extHead;
        if (map != null && map.size() > 0) {
            hashMap.putAll(this.extHead);
        }
        return hashMap;
    }

    public String getHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9fd6f9b", new Object[]{this});
        }
        return this.host;
    }

    public String getMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this});
        }
        return this.method;
    }

    public int getPort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a73231f1", new Object[]{this})).intValue();
        }
        int i = this.port;
        if (i < 0) {
            return 80;
        }
        return i;
    }

    public int getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return this.priority.getPriorityInt();
    }

    public String getProxyIp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7f4c85a", new Object[]{this});
        }
        return this.proxyIp;
    }

    public int getProxyPort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8ef9153", new Object[]{this})).intValue();
        }
        return this.proxyPort;
    }

    public int getRequestFecSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("741adf86", new Object[]{this})).intValue();
        }
        return this.requestFecDownSize;
    }

    public int getRequestFecUpSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54abd081", new Object[]{this})).intValue();
        }
        return this.requestFecUpSize;
    }

    public int getRequestRdTimeoutMs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf6b36", new Object[]{this})).intValue();
        }
        return this.requestRdTimeoutMs;
    }

    public int getRequestRecvRateBps() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("920c580", new Object[]{this})).intValue();
        }
        return this.requestRecvRateBps;
    }

    public int getRequestTimeoutMs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5a61608", new Object[]{this})).intValue();
        }
        return this.requestTimeoutMs;
    }

    public int getRetryTimes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58b4bfee", new Object[]{this})).intValue();
        }
        return this.retryTimes;
    }

    public URL getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("9e2010d5", new Object[]{this});
        }
        return this.url;
    }

    public String getUrlPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70f36fbb", new Object[]{this});
        }
        return this.url.getProtocol() + HttpConstant.SCHEME_SPLIT + this.url.getAuthority() + getPath();
    }

    public void optimizeRequestTimeout() {
        int j;
        long c;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ccb0116", new Object[]{this});
            return;
        }
        try {
            if (l0r.U() && l0r.T() && !l0r.G(this.url)) {
                if (l0r.E(this.url, "fast")) {
                    j = (int) l0r.i();
                    c = l0r.b();
                } else if (l0r.E(this.url, "normal")) {
                    j = (int) l0r.j();
                    c = l0r.c();
                } else {
                    return;
                }
                int i2 = (int) c;
                if (j > 0 && ((i = this.requestRdTimeoutMs) <= 0 || i > j)) {
                    this.requestRdTimeoutMs = j;
                }
                if (l0r.p()) {
                    this.bodyRdTimeoutMs = i2;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void setDomain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2735add7", new Object[]{this, str});
        } else {
            this.domain = str;
        }
    }

    public void setRequestFecSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d864544", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            this.requestFecDownSize = i;
        }
    }

    public void setRequestFecUpSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e166a9", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            this.requestFecUpSize = i;
        }
    }

    public void setRequestPriority(RequestPriority requestPriority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a937426", new Object[]{this, requestPriority});
        } else if (requestPriority != null) {
            this.priority = requestPriority;
        }
    }

    public void setRequestRdTimeoutMs(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4e5594", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
            this.requestRdTimeoutMs = i;
        }
    }

    public void setRequestRecvRateBps(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3128448a", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            this.requestRecvRateBps = i;
        }
    }

    public void setRequestTimeoutMs(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2fd202", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
            this.requestTimeoutMs = i;
        }
    }

    public SpdyRequest(URL url, String str, int i, String str2, int i2, String str3, RequestPriority requestPriority, int i3, int i4, int i5) {
        this(url, null, str, i, str2, i2, str3, requestPriority, i3, i4, i5);
    }

    public SpdyRequest(URL url, String str, String str2, int i, String str3, RequestPriority requestPriority) {
        this(url, str, str2, i, null, 0, str3, requestPriority, 0, 0, 0);
    }

    public SpdyRequest(URL url, String str, int i, String str2, RequestPriority requestPriority) {
        this(url, str, i, null, 0, str2, requestPriority, 0, 0, 0);
    }

    public SpdyRequest(URL url, String str, String str2, RequestPriority requestPriority, int i, int i2) {
        this.domain = "";
        this.proxyIp = "0.0.0.0";
        this.proxyPort = 0;
        this.extHead = new HashMap(5);
        this.priority = RequestPriority.DEFAULT_PRIORITY;
        this.requestTimeoutMs = 20000;
        this.requestRdTimeoutMs = 0;
        this.bodyRdTimeoutMs = 0;
        this.connectionTimeoutMs = 0;
        this.retryTimes = 0;
        this.requestRecvRateBps = 0;
        this.requestFecDownSize = 0;
        this.requestFecUpSize = 0;
        this.url = url;
        if (str != null) {
            this.domain = str;
        }
        this.host = url.getHost();
        int port = url.getPort();
        this.port = port;
        if (port < 0) {
            this.port = url.getDefaultPort();
        }
        this.method = str2;
        if (requestPriority != null) {
            this.priority = requestPriority;
        }
        this.requestTimeoutMs = i;
        this.connectionTimeoutMs = i2;
    }

    public SpdyRequest(URL url, String str, RequestPriority requestPriority, int i, int i2) {
        this(url, (String) null, str, requestPriority, i, i2);
    }

    public SpdyRequest(URL url, String str, String str2, RequestPriority requestPriority) {
        this(url, str, str2, requestPriority, 0, 0);
    }

    public SpdyRequest(URL url, String str, RequestPriority requestPriority) {
        this(url, str, requestPriority, 0, 0);
    }

    public SpdyRequest(URL url, String str, String str2) {
        this(url, str, str2, (RequestPriority) null, 0, 0);
    }

    public SpdyRequest(URL url, String str) {
        this(url, str, (RequestPriority) null, 0, 0);
    }
}
