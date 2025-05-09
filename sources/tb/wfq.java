package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.HttpHeaderConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class wfq extends q30 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f30669a;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(64);
        f30669a = concurrentHashMap;
        concurrentHashMap.put(HttpHeaderConstant.X_SID, "sid");
        concurrentHashMap.put(HttpHeaderConstant.X_T, "t");
        concurrentHashMap.put(HttpHeaderConstant.X_APPKEY, "appKey");
        concurrentHashMap.put(HttpHeaderConstant.X_TTID, "ttid");
        concurrentHashMap.put(HttpHeaderConstant.X_UTDID, "utdid");
        concurrentHashMap.put(HttpHeaderConstant.X_SIGN, "sign");
        concurrentHashMap.put(HttpHeaderConstant.X_UID, "uid");
        concurrentHashMap.put(HttpHeaderConstant.X_UMID_TOKEN, "umt");
        concurrentHashMap.put(HttpHeaderConstant.X_MINI_WUA, HttpHeaderConstant.X_MINI_WUA);
        concurrentHashMap.put(HttpHeaderConstant.X_APP_VER, HttpHeaderConstant.X_APP_VER);
        concurrentHashMap.put("user-agent", "user-agent");
        concurrentHashMap.put("x-falco-id", "x-falco-id");
        concurrentHashMap.put("x-sgext", "x-sgext");
        concurrentHashMap.put(HttpHeaderConstant.X_SSR_PV, "ssr-pv");
        concurrentHashMap.put(HttpHeaderConstant.X_SERVICE_UNIT, HttpHeaderConstant.X_SERVICE_UNIT);
        concurrentHashMap.put(HttpHeaderConstant.X_SERVICE_DOMAIN, HttpHeaderConstant.X_SERVICE_DOMAIN);
        concurrentHashMap.put(HttpHeaderConstant.X_SERVICE_IPS, HttpHeaderConstant.X_SERVICE_IPS);
        concurrentHashMap.put(HttpHeaderConstant.X_SERVICE_TOKEN, HttpHeaderConstant.X_SERVICE_TOKEN);
        concurrentHashMap.put(HttpHeaderConstant.X_DEVICE_LEVEL, HttpHeaderConstant.X_DEVICE_LEVEL);
        concurrentHashMap.put(HttpHeaderConstant.X_DEVICE_ENV, HttpHeaderConstant.X_DEVICE_ENV);
        concurrentHashMap.put(HttpHeaderConstant.X_SIGN_CONTROL, HttpHeaderConstant.X_SIGN_CONTROL);
        concurrentHashMap.put(HttpHeaderConstant.X_LOW_BUYER, HttpHeaderConstant.X_LOW_BUYER);
    }

    public static /* synthetic */ Object ipc$super(wfq wfqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/ssrcore/network/impl/SsrNetworkConverter");
    }

    @Override // tb.q30
    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e3115b5f", new Object[]{this});
        }
        return f30669a;
    }
}
