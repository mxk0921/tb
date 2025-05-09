package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class gjt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final gjt INSTANCE = new gjt();

    /* renamed from: a  reason: collision with root package name */
    public static JSONObject f20048a;
    public static JSONObject b;
    public static final JSONObject c;
    public static final JSONObject d;

    static {
        t2o.a(815792142);
        JSONObject jSONObject = new JSONObject();
        c = jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        d = jSONObject2;
        jSONObject.put((JSONObject) a83.TOP_BAR_DEFAULT, "https://g.alicdn.com/ani-assets/c709b81453ba8f1e9a6e482c5f464cd5/0.0.1/lottie.json");
        jSONObject.put((JSONObject) a83.TOP_BAR_CHANNEL, "https://g.alicdn.com/ani-assets/c709b81453ba8f1e9a6e482c5f464cd5/0.0.1/lottie.json");
        jSONObject.put((JSONObject) "ms_tmall-ovs-rax_search_weexv2_topbar_sort", "https://g.alicdn.com/ani-assets/c709b81453ba8f1e9a6e482c5f464cd5/0.0.1/lottie.json");
        jSONObject.put((JSONObject) "ms_tb-webb-widget-cloud_new_front_pre_screening", "https://g.alicdn.com/ani-assets/78e33fdb4a96ef762e0c3f1eab6a6c4c/0.0.1/lottie.json");
        jSONObject.put((JSONObject) "ms_tb-webb-widget-cloud_front_pre_screening", "https://g.alicdn.com/ani-assets/78e33fdb4a96ef762e0c3f1eab6a6c4c/0.0.1/lottie.json");
        jSONObject2.put((JSONObject) a83.TOP_BAR_DEFAULT, "https://g.alicdn.com/ani-assets/51505392d70e1e51749b42001944bdad/0.0.1/lottie.json");
        jSONObject2.put((JSONObject) a83.TOP_BAR_CHANNEL, "https://g.alicdn.com/ani-assets/51505392d70e1e51749b42001944bdad/0.0.1/lottie.json");
        jSONObject2.put((JSONObject) "ms_tmall-ovs-rax_search_weexv2_topbar_sort", "https://g.alicdn.com/ani-assets/51505392d70e1e51749b42001944bdad/0.0.1/lottie.json");
        jSONObject2.put((JSONObject) "ms_tb-webb-widget-cloud_new_front_pre_screening", "https://g.alicdn.com/ani-assets/b6febfe37e19e2ec064a720e3b0fbd95/0.0.1/lottie.json");
        jSONObject2.put((JSONObject) "ms_tb-webb-widget-cloud_front_pre_screening", "https://g.alicdn.com/ani-assets/b6febfe37e19e2ec064a720e3b0fbd95/0.0.1/lottie.json");
    }

    public final String a(String str, boolean z) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b591632", new Object[]{this, str, new Boolean(z)});
        }
        if (z) {
            JSONObject jSONObject = b;
            if (jSONObject == null || (string = jSONObject.getString(str)) == null) {
                return "";
            }
        } else {
            JSONObject jSONObject2 = f20048a;
            if (jSONObject2 == null || (string = jSONObject2.getString(str)) == null) {
                return "";
            }
        }
        return string;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (f20048a == null) {
            synchronized (this) {
                try {
                    if (f20048a == null) {
                        gjt gjtVar = INSTANCE;
                        f20048a = gjtVar.d(o4p.d0(), c);
                        b = gjtVar.d(o4p.e0(), d);
                    }
                    xhv xhvVar = xhv.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean c(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cae631ad", new Object[]{this, str})).booleanValue();
        }
        b();
        if (str == null || (jSONObject = f20048a) == null) {
            return false;
        }
        return jSONObject.containsKey(str);
    }

    public final JSONObject d(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e5fcf62a", new Object[]{this, str, jSONObject});
        }
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            return JSON.parseObject(str);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }
}
