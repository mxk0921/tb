package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class lrg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXT_DATA_MTOP_RESPONSE_HEADERS = "responseHeaders";
    public static final String EXT_DATA_MTOP_RESPONSE_PARAMS = "requestParams";
    public static final String EXT_DATA_MTOP_RESPONSE_STR = "responseString";
    public static final String EXT_DATA_UI_ARGS = "args";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f23529a = new ConcurrentHashMap();

    public static lrg a(cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lrg) ipChange.ipc$dispatch("52e4eedb", new Object[]{cyuVar});
        }
        lrg lrgVar = new lrg();
        if (cyuVar == null) {
            lrgVar.d("userData", "");
            return lrgVar;
        }
        Map<String, ?> e = cyuVar.e();
        if (e == null || e.isEmpty()) {
            lrgVar.d("userData", "");
            return lrgVar;
        }
        j3i.a(lrgVar.f23529a, e);
        return lrgVar;
    }

    public Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("93e6caad", new Object[]{this});
        }
        return this.f23529a;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return ((ConcurrentHashMap) this.f23529a).isEmpty();
    }

    public lrg d(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lrg) ipChange.ipc$dispatch("c0967992", new Object[]{this, str, obj});
        }
        if (byu.a(str)) {
            return this;
        }
        if (obj == null) {
            ((ConcurrentHashMap) this.f23529a).put(str, "null value");
            return this;
        }
        ((ConcurrentHashMap) this.f23529a).put(str, obj);
        return this;
    }
}
