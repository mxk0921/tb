package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ugc.h5.WVMicorPublishPlugin;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class d8m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f17649a;
    public final String b;
    public final JSONObject c;

    static {
        t2o.a(481296677);
    }

    public d8m(String str, String str2, JSONObject jSONObject) {
        ckf.g(str, "pageKey");
        ckf.g(str2, WVMicorPublishPlugin.TEMPLATE_URL);
        ckf.g(jSONObject, yg.CACHE_KEY_TEMPLATE_INFO);
        this.f17649a = str;
        this.b = str2;
        this.c = jSONObject;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab0b021f", new Object[]{this});
        }
        return this.f17649a;
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ac6bb765", new Object[]{this});
        }
        return this.c;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c62d2fa", new Object[]{this});
        }
        return this.b;
    }
}
