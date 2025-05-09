package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class y6p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f31882a;
        public final JSONObject b;

        static {
            t2o.a(295699263);
        }

        public b(int i, JSONObject jSONObject) {
            this.f31882a = i;
            this.b = jSONObject;
        }
    }

    static {
        t2o.a(295699261);
    }

    public static boolean b(LiveItem liveItem) {
        LiveItem.Ext ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66d07804", new Object[]{liveItem})).booleanValue();
        }
        if (liveItem == null || (ext = liveItem.extendVal) == null || ext.secKillInfo == null || !pfa.L(liveItem)) {
            return false;
        }
        if (wda.k() && c(fkx.d(liveItem.extendVal.secKillInfo)).f31882a <= 0) {
            return false;
        }
        return true;
    }

    public static boolean a(JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7ec0b4d", new Object[]{jSONObject, new Boolean(z)})).booleanValue();
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("extendVal")) == null || !TextUtils.equals("secKill", jSONObject2.getString("itemBizType")) || !zga.c()) {
            return false;
        }
        if (!wda.k()) {
            return true;
        }
        b c = c(jSONObject2.getJSONObject("secKillInfo"));
        if (z && (jSONObject3 = c.b) != null) {
            jSONObject2.put("secKillInfo", (Object) jSONObject3);
        }
        return c.f31882a > 0;
    }

    public static b c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("7a59079f", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return new b(0, null);
        }
        long m = pfa.m();
        if (d(jSONObject, m)) {
            return new b(1, null);
        }
        JSONArray jSONArray = jSONObject.getJSONArray("nextActivityList");
        if (jSONArray == null || jSONArray.isEmpty()) {
            return new b(0, null);
        }
        return new b(d(jSONArray.getJSONObject(0), m) ? 2 : 0, m > urf.e(jSONObject, "showEndTime", -1L) ? jSONArray.getJSONObject(0) : null);
    }

    public static boolean d(JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("540d182f", new Object[]{jSONObject, new Long(j)})).booleanValue();
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return false;
        }
        long e = urf.e(jSONObject, "showStartTime", -1L);
        long e2 = urf.e(jSONObject, "showEndTime", -1L);
        if (e <= 0 || e2 <= 0) {
            return true;
        }
        return j < e2 && j > e;
    }
}
