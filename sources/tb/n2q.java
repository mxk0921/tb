package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class n2q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f24470a;

        static {
            t2o.a(785383564);
        }

        public a(boolean z, String str) {
            this.f24470a = z;
        }
    }

    static {
        t2o.a(785383563);
    }

    public static a a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("cefe4ca5", new Object[]{jSONObject, str});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return new a(false, "input error");
        }
        return new a(true, "Congratulations, it's done");
    }

    public static boolean d(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83720f95", new Object[]{jSONObject, str})).booleanValue();
        }
        return a(jSONObject, str).f24470a;
    }

    public static boolean b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fff37907", new Object[]{jSONObject})).booleanValue();
        }
        return (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("skuCore")) == null || (jSONObject3 = jSONObject2.getJSONObject("skuItem")) == null || TextUtils.isEmpty(jSONObject3.getString("skuH5Url"))) ? false : true;
    }

    public static boolean c(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d2b8811", new Object[]{jSONObject, str})).booleanValue();
        }
        if (!mb3.a(str)) {
            return b(jSONObject);
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("skuCore")) == null || (jSONObject3 = jSONObject2.getJSONObject("skuItem")) == null) {
            return false;
        }
        return !TextUtils.isEmpty(jSONObject3.getString("optionalSkuH5Url")) || b(jSONObject);
    }
}
