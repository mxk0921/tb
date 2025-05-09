package tb;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bxf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f16700a = new JSONObject();

        static {
            t2o.a(343933239);
        }

        public JSONObject a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("1fb04863", new Object[]{this});
            }
            return this.f16700a;
        }

        public a b(String str, Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ec69bbe0", new Object[]{this, str, num});
            }
            if (num == null) {
                return this;
            }
            try {
                this.f16700a.put(str, num);
            } catch (JSONException unused) {
            }
            return this;
        }

        public a c(String str, Long l) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b88cd468", new Object[]{this, str, l});
            }
            if (l == null) {
                return this;
            }
            try {
                this.f16700a.put(str, l);
            } catch (JSONException unused) {
            }
            return this;
        }

        public a d(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5b1a1533", new Object[]{this, str, str2});
            }
            if (!(str2 == null || str == null)) {
                try {
                    this.f16700a.put(str, str2);
                } catch (JSONException unused) {
                }
            }
            return this;
        }
    }

    static {
        t2o.a(343933238);
    }

    public static String a(JSONObject jSONObject, String str, String str2) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c18f59c", new Object[]{jSONObject, str, str2});
        }
        if (jSONObject == null) {
            return str2;
        }
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return str2;
    }
}
