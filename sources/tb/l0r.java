package tb;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.android.netutil.UtilTool;
import org.android.spdy.SpdyAgent;
import org.android.spdy.spduLog;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class l0r {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DEFAULT_AGENT_FREE_ENABLE = false;
    public static final long DEFAULT_BODY_READ_TIMEOUT_MS = 3000;
    public static final boolean DEFAULT_HTTP_ZSTD_ENCODE_ENABLE = true;
    public static final long DEFAULT_LAUNCH_PASS_TIME = 15000;
    public static final boolean DEFAULT_MPQUIC_ENABLE = true;
    public static final String DEFAULT_MULTI_SESSION_HOST_WHITE_LIST = "[\"heic.alicdn.com\",\"gw.alicdn.com\"]";
    public static final String DEFAULT_QUIC_0RTT_FAST_TIMEOUT_HOST_WHITE_LIST = "[\"pages-fast.m.taobao.com\"]";
    public static final long DEFAULT_QUIC_CONNECT_TIMEOUT_MS = 5000;
    public static final String DEFAULT_REQUEST_LIMIT_SPEED_WHITE_LIST = "[\"mtlexternal.alibabausercontent.com\"]";
    public static final boolean DEFAULT_REQUEST_READ_IDLE_TIMEOUT_ENABLE = true;
    public static final long DEFAULT_REQUEST_READ_TIMEOUT_MS = 1500;
    public static final String DEFAULT_REQUEST_TIMEOUT_BLOCK_LIST = "{\"guide-acs.m.taobao.com\":[\"/gw/mtop.relationrecommend.mtoprecommend.recommendstream/1.0\"]}\n";
    public static final String DEFAULT_SEND_AND_RECV_BODY_OPT_CONFIG = "{\"direct_enable\": \"true\", \"resize_host\": [\"img.alicdn.com\", \"heic.alicdn.com\",\"gw.alicdn.com\",\"guide-acs.m.taobao.com\",\"trade-acs.m.taobao.com\",\"guangguang.cloudvideocdn.taobao.com\",\"mtlexternal.alibabausercontent.com\"]}\n";
    public static final boolean DEFAULT_TLOG_ENABLE = true;
    public static final long DEFAULT_TLOG_XQUIC_LEVEL = 2;
    public static final boolean DEFAULT_TUNNEL_PROXY_ENABLE = true;
    public static final String REQUEST_READ_TIMEOUT_TYPE_FAST = "fast";
    public static final String REQUEST_READ_TIMEOUT_TYPE_NORMAL = "normal";

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f23042a = new ArrayList();
    public static volatile boolean b = true;
    public static volatile boolean c = true;
    public static CopyOnWriteArrayList<String> d = null;
    public static CopyOnWriteArrayList<String> e = null;
    public static CopyOnWriteArrayList<String> f = null;
    public static CopyOnWriteArrayList<String> g = null;
    public static volatile long h = 5000;
    public static final long DEFAULT_TCP_CONNECT_TIMEOUT_MS = 6000;
    public static volatile long i = DEFAULT_TCP_CONNECT_TIMEOUT_MS;
    public static volatile boolean j = true;
    public static volatile boolean k = true;
    public static volatile long l = 2500;
    public static volatile long m = 3000;
    public static volatile ConcurrentHashMap<String, List<String>> n = null;
    public static volatile long o = 1500;
    public static volatile long p = 3000;
    public static volatile ConcurrentHashMap<String, List<String>> q = null;
    public static volatile ConcurrentHashMap<String, List<String>> r = null;
    public static CopyOnWriteArrayList<String> s = null;
    public static volatile boolean u = false;
    public static volatile boolean v = true;
    public static volatile boolean w = true;
    public static volatile boolean x = true;
    public static volatile boolean y = true;
    public static CopyOnWriteArrayList<String> z = null;
    public static CopyOnWriteArrayList<String> A = null;
    public static volatile String B = null;
    public static CopyOnWriteArrayList<String> C = null;
    public static CopyOnWriteArrayList<String> D = null;
    public static volatile boolean E = false;
    public static CopyOnWriteArrayList<String> F = null;
    public static volatile boolean G = false;
    public static CopyOnWriteArrayList<String> H = null;
    public static CopyOnWriteArrayList<String> I = null;
    public static CopyOnWriteArrayList<String> J = null;
    public static volatile long K = 15000;
    public static volatile boolean L = false;
    public static volatile boolean M = true;
    public static volatile boolean N = true;
    public static volatile boolean O = false;
    public static volatile boolean P = true;
    public static volatile boolean Q = true;
    public static volatile boolean R = false;
    public static volatile boolean S = false;
    public static volatile boolean T = false;
    public static volatile boolean U = false;
    public static volatile boolean V = false;
    public static volatile boolean W = false;
    public static volatile boolean X = false;
    public static volatile boolean Y = false;
    public static volatile boolean Z = false;

    public static boolean A(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2f4da85", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (copyOnWriteArrayList = J) == null) {
            return false;
        }
        return copyOnWriteArrayList.contains(str);
    }

    public static boolean B(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74561b9e", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (copyOnWriteArrayList = F) == null) {
            return false;
        }
        return copyOnWriteArrayList.contains(str);
    }

    public static void B0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3e7bad3", new Object[]{new Boolean(z2)});
        } else {
            c = z2;
        }
    }

    public static boolean C(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94871f36", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (copyOnWriteArrayList = I) == null) {
            return false;
        }
        return copyOnWriteArrayList.contains(str);
    }

    public static void C0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3967a8e9", new Object[]{str});
        } else {
            e = b0(str, "setMultiNetworkHarmonyWhiteList");
        }
    }

    public static boolean D(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c11880b", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (copyOnWriteArrayList = C) == null) {
            return false;
        }
        return copyOnWriteArrayList.contains(str);
    }

    public static void D0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bc6bfd1", new Object[]{str});
        } else {
            D = b0(str, "[MultiSessionHosts]");
        }
    }

    public static boolean E(URL url, String str) {
        ConcurrentHashMap<String, List<String>> concurrentHashMap;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5261cddf", new Object[]{url, str})).booleanValue();
        }
        if (!(url == null || str == null || TextUtils.isEmpty(str))) {
            try {
                if ("fast".equalsIgnoreCase(str)) {
                    concurrentHashMap = q;
                } else if ("normal".equalsIgnoreCase(str)) {
                    concurrentHashMap = n;
                } else {
                    concurrentHashMap = null;
                }
                if (concurrentHashMap == null || (list = concurrentHashMap.get(url.getHost())) == null) {
                    return false;
                }
                if (list == f23042a) {
                    return true;
                }
                for (String str2 : list) {
                    if (url.getPath().startsWith(str2)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void E0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd01818", new Object[]{new Boolean(z2)});
            return;
        }
        E = z2;
        spduLog.Tloge("tnetsdk.SwitchConfig", null, "setMultiThreadOptEnable=" + z2, new Object[0]);
    }

    public static boolean F(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b91da048", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (copyOnWriteArrayList = z) == null) {
            return false;
        }
        return copyOnWriteArrayList.contains(str);
    }

    public static void F0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4980d9a", new Object[]{new Boolean(z2)});
        } else {
            v = z2;
        }
    }

    public static boolean G(URL url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a483d6e7", new Object[]{url})).booleanValue();
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = r;
        if (!(url == null || concurrentHashMap == null)) {
            try {
                List<String> list = concurrentHashMap.get(url.getHost());
                if (list == null) {
                    return false;
                }
                for (String str : list) {
                    if (url.getPath().startsWith(str)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void G0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50e440f", new Object[]{new Boolean(z2)});
        } else {
            O = z2;
        }
    }

    public static boolean H(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80585186", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (copyOnWriteArrayList = d) == null) {
            return false;
        }
        if (copyOnWriteArrayList.contains("*")) {
            return true;
        }
        return d.contains(str);
    }

    public static void H0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4606c7be", new Object[]{new Boolean(z2)});
        } else {
            Z = z2;
        }
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64d762d0", new Object[0])).booleanValue();
        }
        return L;
    }

    public static void I0(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8abea604", new Object[]{jSONArray});
        } else {
            J = a0(jSONArray, "setQpackResizeHostWhiteList");
        }
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2eb44051", new Object[0])).booleanValue();
        }
        return V;
    }

    public static void J0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c102afcd", new Object[]{str});
        } else {
            F = b0(str, "[Quic0RTTFastTimeoutHosts]");
        }
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b54a86ed", new Object[0])).booleanValue();
        }
        return c;
    }

    public static void K0(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e70ac25", new Object[]{new Long(j2)});
        }
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f975b08", new Object[0])).booleanValue();
        }
        return E;
    }

    public static void L0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d3bcd59", new Object[]{new Boolean(z2)});
        } else {
            P = z2;
        }
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df38cab6", new Object[0])).booleanValue();
        }
        return v;
    }

    public static void M0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e4a6f2a", new Object[]{new Boolean(z2)});
        } else {
            X = z2;
        }
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("200b55e", new Object[0])).booleanValue();
        }
        if (!S() || "com.taobao.taobao:channel".equals(UtilTool.getProcessName())) {
            return false;
        }
        return true;
    }

    public static void N0(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c629e60", new Object[]{new Long(j2)});
            return;
        }
        if (j2 > 20000) {
            j2 = 20000;
        }
        if (j2 > 0) {
            h = j2;
        }
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bbd4231", new Object[0])).booleanValue();
        }
        return O;
    }

    public static void O0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d27bcf16", new Object[]{new Boolean(z2)});
        } else {
            SpdyAgent.configSwitchValueByKey(44L, z2 ? 1 : 0, vu3.b.GEO_NOT_SUPPORT, null);
        }
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed04c2a2", new Object[0])).booleanValue();
        }
        return Z;
    }

    public static void P0(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a4dc868", new Object[]{new Long(j2)});
            return;
        }
        spduLog.Tloge("tnetsdk.SwitchConfig", null, "setQuicInitAndMinCwnd, cwnd=" + j2, new Object[0]);
        SpdyAgent.configSwitchValueByKey(29L, (int) j2, vu3.b.GEO_NOT_SUPPORT, null);
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcf27d17", new Object[0])).booleanValue();
        }
        return P;
    }

    public static void Q0(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79db3f5", new Object[]{jSONArray});
        } else {
            I = a0(jSONArray, "setQuicPtoHostWhiteList");
        }
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2835edb6", new Object[0])).booleanValue();
        }
        return X;
    }

    public static void R0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b00c835", new Object[]{new Boolean(z2)});
        } else {
            w = z2;
        }
    }

    public static boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acf6a14b", new Object[0])).booleanValue();
        }
        return w;
    }

    public static void S0(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("299c2d04", new Object[]{jSONArray});
        } else {
            C = a0(jSONArray, "[RecvBufferResizeHosts]");
        }
    }

    public static boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b387bb41", new Object[0])).booleanValue();
        }
        return T;
    }

    public static void T0(String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e7d0024", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
            n = null;
            q = null;
        } else {
            try {
                JSONArray jSONArray3 = new JSONArray(str);
                int i3 = 0;
                while (i3 < jSONArray3.length()) {
                    ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
                    JSONObject jSONObject = jSONArray3.getJSONObject(i3);
                    String string = jSONObject.getString("type");
                    if (!TextUtils.isEmpty(string)) {
                        long optLong = jSONObject.optLong("request_idle_time");
                        long optLong2 = jSONObject.optLong("body_idle_time");
                        JSONObject optJSONObject = jSONObject.optJSONObject("url");
                        if (optJSONObject != null) {
                            Iterator<String> keys = optJSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                Object obj = optJSONObject.get(next);
                                if ("*".equals(obj)) {
                                    concurrentHashMap.put(next, f23042a);
                                } else if (obj instanceof JSONArray) {
                                    JSONArray jSONArray4 = (JSONArray) obj;
                                    int length = jSONArray4.length();
                                    ArrayList arrayList = new ArrayList(length);
                                    while (i2 < length) {
                                        Object obj2 = jSONArray4.get(i2);
                                        jSONArray2 = jSONArray3;
                                        try {
                                            if (obj2 instanceof String) {
                                                arrayList.add((String) obj2);
                                            }
                                            i2++;
                                            jSONArray3 = jSONArray2;
                                        } catch (Exception unused) {
                                        }
                                    }
                                    jSONArray2 = jSONArray3;
                                    if (!arrayList.isEmpty()) {
                                        concurrentHashMap.put(next, arrayList);
                                    }
                                    jSONArray3 = jSONArray2;
                                    i2 = 0;
                                }
                                jSONArray2 = jSONArray3;
                                jSONArray3 = jSONArray2;
                                i2 = 0;
                            }
                            jSONArray = jSONArray3;
                            if ("fast".equalsIgnoreCase(string)) {
                                if (optLong > 0) {
                                    o = optLong;
                                }
                                if (optLong2 > 0) {
                                    p = optLong2;
                                }
                                if (!concurrentHashMap.isEmpty()) {
                                    q = concurrentHashMap;
                                }
                            } else if ("normal".equalsIgnoreCase(string)) {
                                if (optLong > 0) {
                                    l = optLong;
                                }
                                if (optLong2 > 0) {
                                    m = optLong2;
                                }
                                if (!concurrentHashMap.isEmpty()) {
                                    n = concurrentHashMap;
                                }
                            }
                            i3++;
                            jSONArray3 = jSONArray;
                            i2 = 0;
                        }
                    }
                    jSONArray = jSONArray3;
                    i3++;
                    jSONArray3 = jSONArray;
                    i2 = 0;
                }
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setRequestFastTimeoutWhiteURL] parse jsonObject failed", e2);
            }
        }
    }

    public static boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba6dece0", new Object[0])).booleanValue();
        }
        return k;
    }

    public static void U0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6437a537", new Object[]{str});
        } else {
            z = b0(str, "[setRequestLimitSpeedHostWhiteList]");
        }
    }

    public static boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b480ad8", new Object[0])).booleanValue();
        }
        return G;
    }

    public static void V0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b2ca4ff", new Object[]{new Boolean(z2)});
        } else {
            T = z2;
        }
    }

    public static boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3b37ea8", new Object[0])).booleanValue();
        }
        return b;
    }

    public static void W0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d737940", new Object[]{new Boolean(z2)});
            return;
        }
        k = z2;
        SpdyAgent.configSwitchValueByKey(2L, z2 ? 1 : 0, vu3.b.GEO_NOT_SUPPORT, null);
    }

    public static boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ee14cd", new Object[0])).booleanValue();
        }
        return S;
    }

    public static void X0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be923a1", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
            r = null;
        } else {
            ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    try {
                        if (obj instanceof JSONArray) {
                            JSONArray jSONArray = (JSONArray) obj;
                            int length = jSONArray.length();
                            ArrayList arrayList = new ArrayList(length);
                            for (int i2 = 0; i2 < length; i2++) {
                                Object obj2 = jSONArray.get(i2);
                                if (obj2 instanceof String) {
                                    arrayList.add((String) obj2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                concurrentHashMap.put(next, arrayList);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setRequestTimeoutURLBlockList] fail", e2);
            }
            r = concurrentHashMap;
        }
    }

    public static boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a520710a", new Object[0])).booleanValue();
        }
        return j;
    }

    public static void Y0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9955aa48", new Object[]{new Boolean(z2)});
        } else {
            G = z2;
        }
    }

    public static boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d37cb036", new Object[0])).booleanValue();
        }
        return x;
    }

    public static void Z0(String str) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15ee1a5", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Long valueOf = Long.valueOf(jSONObject.optLong("raw_size"));
                if (valueOf.intValue() > 0 && valueOf.intValue() < 262144) {
                    SpdyAgent.configSwitchValueByKey(33L, valueOf.intValue(), vu3.b.GEO_NOT_SUPPORT, null);
                }
                Long valueOf2 = Long.valueOf(jSONObject.optLong("deflated_size"));
                if (valueOf2.intValue() > 0 && valueOf2.intValue() < 262144) {
                    SpdyAgent.configSwitchValueByKey(34L, valueOf2.intValue(), vu3.b.GEO_NOT_SUPPORT, null);
                }
                try {
                    boolean z2 = jSONObject.getBoolean("direct_enable");
                    SpdyAgent.configSwitchValueByKey(35L, z2 ? 1 : 0, vu3.b.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "direct_enable=" + z2, new Object[0]);
                } catch (Exception unused) {
                }
                try {
                    boolean z3 = jSONObject.getBoolean("recvmmsg_enable");
                    SpdyAgent.configSwitchValueByKey(31L, z3 ? 1 : 0, vu3.b.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "recvmmsg_enable=" + z3, new Object[0]);
                } catch (Exception unused2) {
                }
                try {
                    boolean z4 = jSONObject.getBoolean("sendmmsg_enable");
                    boolean isValidPathEnv = UtilTool.isValidPathEnv(SpdyAgent.getContext());
                    if (!z4 || !isValidPathEnv) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    SpdyAgent.configSwitchValueByKey(37L, i2, vu3.b.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "sendmmsgEnable=" + z4, "isValidEnv", Boolean.valueOf(isValidPathEnv));
                } catch (Exception unused3) {
                }
                try {
                    JSONArray optJSONArray = jSONObject.optJSONArray("resize_host");
                    if (optJSONArray != null) {
                        S0(optJSONArray);
                    }
                } catch (Exception unused4) {
                }
                int optInt = jSONObject.optInt("quic_cache_size");
                if (optInt >= 8192 && optInt <= 262144) {
                    SpdyAgent.configSwitchValueByKey(48L, optInt, vu3.b.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "quicCacheSize=" + optInt, new Object[0]);
                }
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "RecvBody", "rawSize", valueOf, "deflatedSize", valueOf2);
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setSendAndRecvBodyOptimizeConfig] error", e2);
            }
        }
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96983a3f", new Object[0])).longValue();
        }
        return K;
    }

    public static CopyOnWriteArrayList<String> a0(JSONArray jSONArray, String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        Exception e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("be468463", new Object[]{jSONArray, str});
        }
        if (jSONArray == null) {
            return null;
        }
        try {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    String string = jSONArray.getString(i2);
                    if (!TextUtils.isEmpty(string)) {
                        copyOnWriteArrayList.add(string);
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, str, "error", e2);
                    return copyOnWriteArrayList;
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            copyOnWriteArrayList = null;
        }
        return copyOnWriteArrayList;
    }

    public static void a1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f300278", new Object[]{new Boolean(z2)});
        } else {
            b = z2;
        }
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93f7ba3c", new Object[0])).longValue();
        }
        return p;
    }

    public static CopyOnWriteArrayList<String> b0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("6181324b", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return a0(new JSONArray(str), str2);
        } catch (Exception e2) {
            spduLog.Tloge("tnetsdk.SwitchConfig", null, str2, "error", e2);
            return null;
        }
    }

    public static void b1(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23375961", new Object[]{new Long(j2)});
            return;
        }
        if (j2 > 20000) {
            j2 = 20000;
        }
        if (j2 > 0) {
            i = j2;
        }
    }

    public static long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3961c07", new Object[0])).longValue();
        }
        return m;
    }

    public static void c0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5270ab0", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                try {
                    boolean z2 = jSONObject.getBoolean("cid_update_enable");
                    SpdyAgent.configSwitchValueByKey(25L, z2 ? 1 : 0, vu3.b.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "cidUpdateEnable=" + z2, new Object[0]);
                } catch (Exception unused) {
                }
                try {
                    boolean z3 = jSONObject.getBoolean("zstd_rso");
                    f1(z3);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "zstdRso=" + z3, new Object[0]);
                } catch (Exception unused2) {
                }
                try {
                    boolean z4 = jSONObject.getBoolean("mp_net_enable");
                    B0(z4);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "mpNetEnable=" + z4, new Object[0]);
                } catch (Exception unused3) {
                }
                try {
                    F0(jSONObject.getBoolean("mp_net_upper_enable"));
                } catch (Exception unused4) {
                }
                try {
                    boolean z5 = jSONObject.getBoolean("encode_decode_opt");
                    SpdyAgent.configSwitchValueByKey(36L, z5 ? 1 : 0, vu3.b.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "encodeDecodeOpt=" + z5, new Object[0]);
                } catch (Exception unused5) {
                }
                try {
                    boolean z6 = jSONObject.getBoolean("storage_remove");
                    SpdyAgent.configSwitchValueByKey(39L, z6 ? 1 : 0, vu3.b.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "storageRemove=" + z6, new Object[0]);
                } catch (Exception unused6) {
                }
                try {
                    boolean z7 = jSONObject.getBoolean("storage_env_fix");
                    SpdyAgent.configSwitchValueByKey(40L, z7 ? 1 : 0, vu3.b.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "storageEnvFix=" + z7, new Object[0]);
                } catch (Exception unused7) {
                }
                try {
                    boolean z8 = jSONObject.getBoolean("quic_opt");
                    SpdyAgent.configSwitchValueByKey(41L, z8 ? 1 : 0, vu3.b.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "quicOpt=" + z8, new Object[0]);
                } catch (Exception unused8) {
                }
                try {
                    boolean z9 = jSONObject.getBoolean("atoi_enable");
                    SpdyAgent.configSwitchValueByKey(32L, z9 ? 1 : 0, vu3.b.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "atoiEnable=" + z9, new Object[0]);
                } catch (Exception unused9) {
                }
                try {
                    Y0(jSONObject.getBoolean("root_ca_enable"));
                } catch (Exception unused10) {
                }
                try {
                    JSONArray optJSONArray = jSONObject.optJSONArray("fec_host");
                    if (optJSONArray != null) {
                        s0(optJSONArray);
                    }
                } catch (Exception e2) {
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "fec_host fail", e2);
                }
                try {
                    f0(jSONObject.optLong("launch_pass_Time", 15000L));
                    g0(jSONObject.getBoolean("quic_proof"));
                } catch (Exception unused11) {
                }
                try {
                    boolean z10 = jSONObject.getBoolean("sssl_pubkey_retry");
                    SpdyAgent.configSwitchValueByKey(42L, z10 ? 1 : 0, vu3.b.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "sssl_pubkey_retry=" + z10, new Object[0]);
                } catch (Exception unused12) {
                }
                try {
                    boolean z11 = jSONObject.getBoolean("sssl_pubkey_plain");
                    G0(z11);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "sssl_pubkey_plain=" + z11, new Object[0]);
                } catch (Exception unused13) {
                }
                int optInt = jSONObject.optInt("tunnel_cc_type");
                if (optInt > 0) {
                    SpdyAgent.configSwitchValueByKey(18L, optInt, vu3.b.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "tunnel_cc_type=" + optInt, new Object[0]);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("pto_host");
                if (optJSONArray2 != null) {
                    Q0(optJSONArray2);
                }
                if (jSONObject.optBoolean("jni_env_opt", false)) {
                    SpdyAgent.configSwitchValueByKey(45L, 1, vu3.b.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "jniEnvOpt=true", new Object[0]);
                }
                int optInt2 = jSONObject.optInt("qpack_size");
                if (optInt2 > 0) {
                    SpdyAgent.configSwitchValueByKey(46L, optInt2, vu3.b.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "qpack_size=" + optInt2, new Object[0]);
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray("qpack_host");
                if (optJSONArray3 != null) {
                    I0(optJSONArray3);
                } else {
                    I0(new JSONArray("[\"trade-acs.m.taobao.com\"]"));
                }
                int optInt3 = jSONObject.optInt("quic_v1_enable");
                if (optInt3 > 0) {
                    SpdyAgent.configSwitchValueByKey(47L, optInt3, vu3.b.GEO_NOT_SUPPORT, null);
                    spduLog.Tloge("tnetsdk.SwitchConfig", null, "quic v1 enable=" + optInt3, new Object[0]);
                }
            } catch (Exception e3) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[parseCommonSwitchConfigAndSet] error", e3);
            }
        }
    }

    public static void c1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15096f3", new Object[]{new Boolean(z2)});
        } else {
            S = z2;
        }
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38af66a8", new Object[0])).intValue();
        }
        return "com.taobao.taobao:channel".equals(UtilTool.getProcessName()) ? 1 : 0;
    }

    public static void d0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5cb39b3", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                StringBuilder sb = new StringBuilder(128);
                sb.append("[mp config] ");
                boolean optBoolean = jSONObject.optBoolean("mpquic_enable", true);
                if (!optBoolean) {
                    p0(optBoolean);
                }
                int optInt = jSONObject.optInt("mp_version");
                if (optInt > 0) {
                    SpdyAgent.configSwitchValueByKey(3L, optInt, vu3.b.GEO_NOT_SUPPORT, null);
                    sb.append("version=");
                    sb.append(optInt);
                }
                int optInt2 = jSONObject.optInt("reinj_hard_deadline");
                if (optInt2 > 0) {
                    SpdyAgent.configSwitchValueByKey(7L, optInt2, vu3.b.GEO_NOT_SUPPORT, null);
                    sb.append(",hardDeadline=");
                    sb.append(optInt2);
                }
                int optInt3 = jSONObject.optInt("reinj_deadline_lower_bound");
                if (optInt3 > 0) {
                    SpdyAgent.configSwitchValueByKey(8L, optInt3, vu3.b.GEO_NOT_SUPPORT, null);
                    sb.append(",deadlineLowerBound=");
                    sb.append(optInt3);
                }
                int optInt4 = jSONObject.optInt("scheduler_bw_Bps_thr");
                if (optInt4 > 0) {
                    SpdyAgent.configSwitchValueByKey(10L, optInt4, vu3.b.GEO_NOT_SUPPORT, null);
                    sb.append(",bwBpsThr=");
                    sb.append(optInt4);
                }
                double optDouble = jSONObject.optDouble("scheduler_loss_percent_thr_high");
                if (optDouble > 0.1d) {
                    SpdyAgent.configSwitchValueByKey(11L, 0, optDouble, null);
                    sb.append(",lossPercentThrHigh=");
                    sb.append(optDouble);
                }
                double optDouble2 = jSONObject.optDouble("scheduler_loss_percent_thr_low");
                if (optDouble2 > 0.1d) {
                    SpdyAgent.configSwitchValueByKey(12L, 0, optDouble2, null);
                    sb.append(",lossPercentThrLow=");
                    sb.append(optDouble2);
                }
                int optInt5 = jSONObject.optInt("scheduler_pto_cnt_thr");
                if (optInt5 > 0) {
                    SpdyAgent.configSwitchValueByKey(13L, optInt5, vu3.b.GEO_NOT_SUPPORT, null);
                    sb.append(",ptoCntThr=");
                    sb.append(optInt5);
                }
                int optInt6 = jSONObject.optInt("scheduler_rtt_us_thr_high");
                if (optInt6 > 0) {
                    SpdyAgent.configSwitchValueByKey(14L, optInt6, vu3.b.GEO_NOT_SUPPORT, null);
                    sb.append(",rttUsThrHigh=");
                    sb.append(optInt6);
                }
                int optInt7 = jSONObject.optInt("scheduler_rtt_us_thr_low");
                if (optInt7 > 0) {
                    SpdyAgent.configSwitchValueByKey(15L, optInt7, vu3.b.GEO_NOT_SUPPORT, null);
                    sb.append(",rttUsThrLow=");
                    sb.append(optInt7);
                }
                int optInt8 = jSONObject.optInt("path_keep_alive_time");
                if (optInt8 > 0) {
                    SpdyAgent.configSwitchValueByKey(4L, optInt8, vu3.b.GEO_NOT_SUPPORT, null);
                    sb.append(",pathKeepAliveTime=");
                    sb.append(optInt8);
                }
                int optInt9 = jSONObject.optInt("scheduler_type");
                if (optInt9 > 0) {
                    SpdyAgent.configSwitchValueByKey(9L, optInt9, vu3.b.GEO_NOT_SUPPORT, null);
                    sb.append(",schedulerType=");
                    sb.append(optInt9);
                }
                int optInt10 = jSONObject.optInt("reinj_type");
                if (optInt10 > 0) {
                    SpdyAgent.configSwitchValueByKey(5L, optInt10, vu3.b.GEO_NOT_SUPPORT, null);
                    sb.append(",reinjType=");
                    sb.append(optInt10);
                }
                double optDouble3 = jSONObject.optDouble("reinj_deadline_srtt_factor");
                if (optDouble3 > 0.1d) {
                    SpdyAgent.configSwitchValueByKey(6L, 0, optDouble3, null);
                    sb.append(",reinjSRTTFactor=");
                    sb.append(optDouble3);
                }
                int optInt11 = jSONObject.optInt("disable_extern_info");
                if (optInt11 > 0) {
                    SpdyAgent.configSwitchValueByKey(27L, 0, vu3.b.GEO_NOT_SUPPORT, null);
                    sb.append(",disableExternInfo=");
                    sb.append(optInt11);
                }
                i0(jSONObject.optBoolean("enable_amdc_mp", true));
                if (jSONObject.optBoolean("enable_ipv6", false)) {
                    x0(true);
                    sb.append(",enableIpv6=true");
                }
                int optInt12 = jSONObject.optInt("bind_net_opt");
                if (optInt12 > 0) {
                    SpdyAgent.configSwitchValueByKey(43L, optInt12, vu3.b.GEO_NOT_SUPPORT, null);
                    sb.append(",bindNetOpt=");
                    sb.append(optInt12);
                }
                spduLog.Tloge("tnetsdk.SwitchConfig", null, sb.toString(), new Object[0]);
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[parseMpquicParameterConfigAndSet] error", e2);
            }
        }
    }

    public static void d1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacc57c6", new Object[]{new Boolean(z2)});
        } else {
            j = z2;
        }
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("206c4e4", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str) && (!TextUtils.isEmpty(B) || A != null)) {
            try {
                if (R() && A.contains(str)) {
                    return B;
                }
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[getConnectOptionConfig] error", e2);
            }
        }
        return null;
    }

    public static void e0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d977f3b", new Object[]{new Boolean(z2)});
        } else {
            u = z2;
        }
    }

    public static void e1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("236f652f", new Object[]{str});
        } else {
            d = b0(str, "setWeakNetworkForceCellularHostWhiteList");
        }
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7ca48d3", new Object[0])).intValue();
        }
        if (L()) {
            return 2;
        }
        return 1;
    }

    public static void f0(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec3c4ee5", new Object[]{new Long(j2)});
        } else {
            K = j2;
        }
    }

    public static void f1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("353c96aa", new Object[]{new Boolean(z2)});
        } else {
            x = z2;
        }
    }

    public static void g(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49af9d0", new Object[]{new Integer(i2)});
        }
    }

    public static void g0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6c7f5a", new Object[]{new Boolean(z2)});
        } else {
            M = z2;
        }
    }

    public static long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d95fabcc", new Object[0])).longValue();
        }
        return h;
    }

    public static void h0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da4af3b", new Object[]{new Boolean(z2)});
        } else {
            W = z2;
        }
    }

    public static long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbcc91b", new Object[0])).longValue();
        }
        return o;
    }

    public static void i0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b5daf03", new Object[]{new Boolean(z2)});
        } else {
            y = z2;
        }
    }

    public static long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5252ef26", new Object[0])).longValue();
        }
        return l;
    }

    public static void j0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("273f0e3a", new Object[]{str});
        } else {
            f = b0(str, "setBackgroundMultiNetworkBrandBlockList");
        }
    }

    public static long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f13f043", new Object[0])).longValue();
        }
        return i;
    }

    public static void k0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a498b9d6", new Object[]{new Boolean(z2)});
        } else {
            U = z2;
        }
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a669b4f5", new Object[0])).booleanValue();
        }
        return u;
    }

    public static void l0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec7ee66", new Object[]{new Boolean(z2)});
            return;
        }
        N = z2;
        spduLog.Tloge("tnetsdk.SwitchConfig", null, "CDNPublicKeyToPlain=" + z2, new Object[0]);
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1165f86", new Object[0])).booleanValue();
        }
        return M;
    }

    public static void m0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15331ac", new Object[]{new Boolean(z2)});
        } else {
            R = z2;
        }
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b66a8f5", new Object[0])).booleanValue();
        }
        return W;
    }

    public static void n0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54a593", new Object[]{str});
        } else {
            g = b0(str, "setConnectFastTimeoutHostWhiteList");
        }
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d62a902d", new Object[0])).booleanValue();
        }
        return y;
    }

    public static void o0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1538ffb0", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
            A = null;
        } else {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    String string = jSONObject.getString("type");
                    String optString = jSONObject.optString("connect_option");
                    JSONArray optJSONArray = jSONObject.optJSONArray("host");
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(optString) && optJSONArray != null) {
                        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                            String string2 = optJSONArray.getString(i3);
                            if (!TextUtils.isEmpty(string2)) {
                                copyOnWriteArrayList.add(string2);
                            }
                        }
                        if (!copyOnWriteArrayList.isEmpty()) {
                            spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setConnectOptionConfig] ", "type", string, "option", optString, "hostsList", copyOnWriteArrayList);
                            if ("picture".equalsIgnoreCase(string)) {
                                B = optString;
                                A = copyOnWriteArrayList;
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                spduLog.Tloge("tnetsdk.SwitchConfig", null, "[setConnectOptionConfig] parse failed", e2);
            }
        }
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a93a6fa", new Object[0])).booleanValue();
        }
        return U;
    }

    public static void p0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4011227", new Object[]{new Boolean(z2)});
        }
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5c3ce6a", new Object[0])).booleanValue();
        }
        return N;
    }

    public static void q0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b81df74", new Object[]{new Boolean(z2)});
        } else {
            Q = z2;
        }
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("516508f4", new Object[0])).booleanValue();
        }
        return R;
    }

    public static void r0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec4cc27", new Object[]{new Boolean(z2)});
        } else {
            Y = z2;
        }
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ff02c", new Object[0])).booleanValue();
        }
        return Q;
    }

    public static void s0(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c860179e", new Object[]{jSONArray});
        } else {
            H = a0(jSONArray, "[setFecHostWhiteList]");
        }
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9406f689", new Object[0])).booleanValue();
        }
        return Y;
    }

    public static void t0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf3d8a0", new Object[]{new Boolean(z2)});
            return;
        }
        SpdyAgent.configSwitchValueByKey(17L, z2 ? 1 : 0, vu3.b.GEO_NOT_SUPPORT, null);
        spduLog.Tloge("tnetsdk.SwitchConfig", null, "http3_opt_enable=" + z2, new Object[0]);
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59b8701", new Object[0])).booleanValue();
        }
        try {
            CopyOnWriteArrayList<String> copyOnWriteArrayList = f;
            if (copyOnWriteArrayList == null) {
                return false;
            }
            if (copyOnWriteArrayList.contains("*")) {
                return true;
            }
            return f.contains(Build.BRAND.toLowerCase());
        } catch (Exception unused) {
            return false;
        }
    }

    public static void u0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87750141", new Object[]{new Boolean(z2)});
        } else {
            SpdyAgent.configSwitchValueByKey(24L, z2 ? 1 : 0, vu3.b.GEO_NOT_SUPPORT, null);
        }
    }

    public static boolean v(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("532e0c2a", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (copyOnWriteArrayList = g) == null) {
            return false;
        }
        if (copyOnWriteArrayList.contains("*")) {
            return true;
        }
        return g.contains(str);
    }

    public static void v0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("554b38d7", new Object[]{new Boolean(z2)});
        } else {
            SpdyAgent.configSwitchValueByKey(1L, z2 ? 1 : 0, vu3.b.GEO_NOT_SUPPORT, null);
        }
    }

    public static boolean w(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e542079f", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (copyOnWriteArrayList = H) == null) {
            return false;
        }
        return copyOnWriteArrayList.contains(str);
    }

    public static void w0(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f1483c", new Object[]{new Long(j2)});
        } else {
            SpdyAgent.configSwitchValueByKey(16L, (int) j2, vu3.b.GEO_NOT_SUPPORT, null);
        }
    }

    public static boolean x(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14b36ec3", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (copyOnWriteArrayList = s) == null) {
            return false;
        }
        if (copyOnWriteArrayList.contains("*")) {
            return true;
        }
        return s.contains(str);
    }

    public static void x0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cdf8cc0", new Object[]{new Boolean(z2)});
        } else {
            L = z2;
        }
    }

    public static boolean y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55bb033a", new Object[]{str})).booleanValue();
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = e;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return false;
        }
        if (e.contains(str) || e.contains("*")) {
            return true;
        }
        return false;
    }

    public static void y0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("828ab7ef", new Object[]{new Boolean(z2)});
        } else {
            V = z2;
        }
    }

    public static boolean z(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("820950a8", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (copyOnWriteArrayList = D) == null) {
            return false;
        }
        if (copyOnWriteArrayList.contains("*")) {
            return true;
        }
        return D.contains(str);
    }

    public static void z0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53c4b172", new Object[]{str});
        } else {
            s = b0(str, "setMpquicConnectCompensateHostWhiteList");
        }
    }
}
