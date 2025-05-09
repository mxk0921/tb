package tb;

import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class okr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TBLIVE_ABTEST_GROUP = "taolive";
    public static final String TBLIVE_ORANGE_GROUP = "tblive";

    /* renamed from: a  reason: collision with root package name */
    public final boolean f25451a;
    public boolean b;
    public boolean c;
    public final boolean d;
    public boolean e;
    public final long f;

    static {
        t2o.a(1027604486);
    }

    public okr() {
        this.f25451a = true;
        this.b = false;
        this.c = false;
        this.d = true;
        this.e = false;
        this.f = 5000L;
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("da2ef722", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enablePreCreateWebView", String.valueOf(this.f25451a));
        hashMap.put("enablePreloadHtml", String.valueOf(this.b));
        hashMap.put("enableLoadUrlSSR", String.valueOf(this.c));
        hashMap.put("enablePreLoadZCache", String.valueOf(this.d));
        hashMap.put("enablePreRender", String.valueOf(this.e));
        return hashMap;
    }

    public okr(zdb zdbVar) {
        this.f25451a = true;
        this.b = false;
        this.c = false;
        this.d = true;
        this.e = false;
        this.f = 5000L;
        if (zdbVar != null) {
            this.f25451a = brq.c(zdbVar.a("tblive", "enablePreCreateWebView", "true"));
            this.b = brq.c(zdbVar.a("tblive", "enablePreloadHtml", "true"));
            this.c = brq.c(zdbVar.a("tblive", "enableLoadUrlSSR", "true"));
            this.d = brq.c(zdbVar.a("tblive", "enablePreLoadZCache", "true"));
            this.e = brq.c(zdbVar.a("tblive", "enablePreRender", "true"));
            this.f = brq.d(zdbVar.a("tblive", "minGetTemperatureInterval", IDecisionResult.ENGINE_ERROR), 5000L);
        }
    }
}
