package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y19 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f31783a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    static {
        t2o.a(404750375);
    }

    public y19(JSONObject jSONObject) {
        if (!jSONObject.containsKey("materialDeliveryId") && !jSONObject.containsKey(arp.MATERIAL_ID_KEY)) {
            jSONObject = a.i(jSONObject, "schemeId", "schemeNumId", "bizId", "bizNumId", "bizPlanNumId", "materialId", arp.MATERIAL_ID_KEY);
        }
        this.f31783a = jSONObject.getLongValue("bizNumId");
        this.b = jSONObject.getLongValue("schemeNumId");
        this.c = jSONObject.getLongValue("bizPlanNumId");
        this.d = jSONObject.getLongValue(arp.MATERIAL_ID_KEY);
        this.e = jSONObject.getLongValue("materialDeliveryId");
    }

    public static y19 a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y19) ipChange.ipc$dispatch("a66cc410", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return new y19(jSONObject);
    }
}
