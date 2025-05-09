package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mmad.data.BaseMmAdModel;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.global.SDKUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kio {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMMERCIAL_AD_NORMAL = "commercialAdNormal";
    public static final String COMMERCIAL_AD_VIDEO = "commercialAdVideo";

    /* renamed from: a  reason: collision with root package name */
    public final z19 f22692a;
    public final nwi b;
    public final Map<String, eld> c;

    static {
        t2o.a(573571132);
    }

    public kio(nwi nwiVar) {
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        this.b = nwiVar;
        this.f22692a = new z19(nwiVar);
        hashMap.put(rr6.TYPE_POPVIEW, new ygm());
        hashMap.put("feeds", new j69());
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dfc05b9", new Object[]{this})).booleanValue();
        }
        return lf4.j();
    }

    public final boolean c(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef78f9cc", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (1000 == i && z) {
            return true;
        }
        if (1001 != i || !z2) {
            return false;
        }
        return true;
    }

    public final boolean d(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("678b2e9f", new Object[]{this, new Long(j), new Long(j2)})).booleanValue();
        }
        long f = f();
        if (f > j2 || f < j) {
            return false;
        }
        return true;
    }

    public final boolean e(JSONObject jSONObject) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50376726", new Object[]{this, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("from");
        String string2 = jSONObject.getString("bizType");
        String string3 = jSONObject.getString("itemId");
        jgh.a("RulerVerify", "from=" + string + ", bizType=" + string2 + ", itemId=" + string3);
        boolean equals = TextUtils.equals(string, "commercialAd");
        if (TextUtils.equals(string2, "commercialAdNormal") || TextUtils.equals(string2, "commercialAdVideo")) {
            z = true;
        } else {
            z = false;
        }
        boolean isEmpty = TextUtils.isEmpty(string3);
        if (!equals || !z || isEmpty) {
            return false;
        }
        return true;
    }

    public final long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b05fddf1", new Object[]{this})).longValue();
        }
        return System.currentTimeMillis() + (SDKUtils.getTimeOffset() * 1000);
    }

    public z19 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z19) ipChange.ipc$dispatch("7aa11d9b", new Object[]{this});
        }
        return this.f22692a;
    }

    public final boolean b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5660279c", new Object[]{this, str, str2, str3})).booleanValue();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z = !isEmpty;
        if (isEmpty) {
            m0j.d(this.b, "resource_not_ready", "imageUrl");
        }
        if (!TextUtils.equals(str2, "commercialAdVideo")) {
            return z;
        }
        String g = ph2.g(str3);
        if (TextUtils.isEmpty(g)) {
            m0j.d(this.b, "resource_not_ready", "videoUrl");
        }
        return !isEmpty && !TextUtils.isEmpty(g);
    }

    public boolean h(cq6 cq6Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("400b107e", new Object[]{this, cq6Var, new Integer(i)})).booleanValue();
        }
        if (!a()) {
            jgh.a("RulerVerify", "checkOrangeStateAvailable not Available ");
            return false;
        }
        JSONObject g = cq6Var.g();
        BaseMmAdModel a2 = cq6Var.a();
        boolean e = e(g);
        jgh.a("RulerVerify", "isTypeAvailable result=" + e);
        if (!e) {
            jgh.a("RulerVerify", "checkTypeAvailable not Available ");
            return false;
        }
        boolean c = c(i, a2.coldStart, a2.hotStart);
        jgh.a("RulerVerify", "checkStartType result=" + c + ", startType=" + i + ", coldStart=" + a2.coldStart + ", hotStart=" + a2.hotStart);
        if (!c) {
            return false;
        }
        boolean d = d(a2.gmtStartMs, a2.gmtEndMs);
        jgh.a("RulerVerify", "checkTimeAvailable result=" + d + ", gmtStartMs=" + a2.gmtStartMs + ", gmtEndMs=" + a2.gmtEndMs);
        if (!d) {
            return false;
        }
        boolean b = b(a2.imgUrl, a2.bizType, a2.videoUrl);
        jgh.a("RulerVerify", "checkResourceAvailable result=" + b + ", imgUrl=" + a2.imgUrl + ", bizType=" + a2.bizType + ", videoUrl=" + a2.videoUrl);
        if (!b) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_info", "imageUrl/videoUrl is empty.");
            i4v.l(i4v.ARG1_RESOURCE_FAIL, this.b, hashMap);
            return false;
        }
        boolean a3 = this.f22692a.a(a2.itemId, a2.times);
        jgh.a("RulerVerify", "fatigueAvailable result=" + a3);
        if (!a3) {
            m0j.d(this.b, "fatigue_not_allow", "fatigue");
            return false;
        }
        boolean e2 = this.b.e().e();
        jgh.a("RulerVerify", "isResourceReady result=" + e2);
        if (!e2) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("error_info", "animationLottie/interactImage/gestureImage is empty.");
            i4v.l(i4v.ARG1_RESOURCE_FAIL, this.b, hashMap2);
            return false;
        }
        eld eldVar = (eld) ((HashMap) this.c).get(a2.getDataType());
        if (eldVar == null) {
            return true;
        }
        boolean a4 = eldVar.a(this.b, i);
        jgh.a("RulerVerify", "bizRuleAvailable result=" + a4);
        return a4;
    }
}
