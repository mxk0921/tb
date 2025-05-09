package mtopsdk.mtop.protocol.converter.impl;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.HttpHeaderConstant;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InnerNetworkConverter extends AbstractNetworkConverter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.InnerNetworkConverter";
    private static final Map<String, String> headerConversionMap;

    public static /* synthetic */ Object ipc$super(InnerNetworkConverter innerNetworkConverter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/protocol/converter/impl/InnerNetworkConverter");
    }

    @Override // mtopsdk.mtop.protocol.converter.impl.AbstractNetworkConverter
    public Map<String, String> getHeaderConversionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e3115b5f", new Object[]{this});
        }
        return headerConversionMap;
    }

    static {
        t2o.a(589299981);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(64);
        headerConversionMap = concurrentHashMap;
        concurrentHashMap.put(HttpHeaderConstant.X_SID, "sid");
        concurrentHashMap.put(HttpHeaderConstant.X_T, "t");
        concurrentHashMap.put(HttpHeaderConstant.X_APPKEY, "appKey");
        concurrentHashMap.put(HttpHeaderConstant.X_TTID, "ttid");
        concurrentHashMap.put(HttpHeaderConstant.X_DEVID, "deviceId");
        concurrentHashMap.put(HttpHeaderConstant.X_UTDID, "utdid");
        concurrentHashMap.put(HttpHeaderConstant.X_SIGN, "sign");
        concurrentHashMap.put(HttpHeaderConstant.X_NQ, "nq");
        concurrentHashMap.put(HttpHeaderConstant.X_NETTYPE, "netType");
        concurrentHashMap.put("x-pv", "pv");
        concurrentHashMap.put(HttpHeaderConstant.X_UID, "uid");
        concurrentHashMap.put(HttpHeaderConstant.X_UMID_TOKEN, "umt");
        concurrentHashMap.put(HttpHeaderConstant.X_REQBIZ_EXT, "reqbiz-ext");
        concurrentHashMap.put(HttpHeaderConstant.X_ROUTER_ID, "routerId");
        concurrentHashMap.put(HttpHeaderConstant.X_PLACE_ID, "placeId");
        concurrentHashMap.put(HttpHeaderConstant.X_OPEN_BIZ, "open-biz");
        concurrentHashMap.put(HttpHeaderConstant.X_MINI_APPKEY, "mini-appkey");
        concurrentHashMap.put(HttpHeaderConstant.X_REQ_APPKEY, "req-appkey");
        concurrentHashMap.put(HttpHeaderConstant.X_OPEN_BIZ_DATA, "open-biz-data");
        concurrentHashMap.put(HttpHeaderConstant.X_ACT, "accessToken");
        concurrentHashMap.put(HttpHeaderConstant.X_MINI_WUA, HttpHeaderConstant.X_MINI_WUA);
        concurrentHashMap.put(HttpHeaderConstant.X_APP_CONF_V, HttpHeaderConstant.X_APP_CONF_V);
        concurrentHashMap.put(HttpHeaderConstant.X_EXTTYPE, HttpHeaderConstant.KEY_EXTTYPE);
        concurrentHashMap.put(HttpHeaderConstant.X_EXTDATA, HttpHeaderConstant.KEY_EXTDATA);
        concurrentHashMap.put(HttpHeaderConstant.X_FEATURES, HttpHeaderConstant.X_FEATURES);
        concurrentHashMap.put(HttpHeaderConstant.X_PAGE_NAME, HttpHeaderConstant.X_PAGE_NAME);
        concurrentHashMap.put(HttpHeaderConstant.X_PAGE_URL, HttpHeaderConstant.X_PAGE_URL);
        concurrentHashMap.put(HttpHeaderConstant.X_PAGE_MAB, HttpHeaderConstant.X_PAGE_MAB);
        concurrentHashMap.put(HttpHeaderConstant.X_APP_VER, HttpHeaderConstant.X_APP_VER);
        concurrentHashMap.put(HttpHeaderConstant.X_ORANGE_Q, HttpHeaderConstant.X_ORANGE_Q);
        concurrentHashMap.put("user-agent", "user-agent");
        concurrentHashMap.put(HttpHeaderConstant.CLIENT_TRACE_ID, HttpHeaderConstant.CLIENT_TRACE_ID);
        concurrentHashMap.put("x-falco-id", "x-falco-id");
        concurrentHashMap.put("f-refer", "f-refer");
        concurrentHashMap.put(HttpHeaderConstant.X_NETINFO, HttpHeaderConstant.X_NETINFO);
        concurrentHashMap.put(HttpHeaderConstant.X_SIGN_CONTROL, HttpHeaderConstant.X_SIGN_CONTROL);
        concurrentHashMap.put(HttpHeaderConstant.X_SG_COOKIE, HttpHeaderConstant.X_SG_COOKIE);
        concurrentHashMap.put(HttpHeaderConstant.X_LOW_BUYER, HttpHeaderConstant.X_LOW_BUYER);
        concurrentHashMap.put("x-sgext", "x-sgext");
        concurrentHashMap.put("x-pipu1", "x-pipu1");
        concurrentHashMap.put(HttpHeaderConstant.X_ACCEPT_STREAM, HttpHeaderConstant.X_ACCEPT_STREAM);
    }
}
