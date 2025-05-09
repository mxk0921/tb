package tb;

import com.alibaba.ability.MegaUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class kei {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f22616a;
    public final String b;
    public final String c;
    public final String d;
    public final JSONObject e;

    static {
        t2o.a(98566183);
    }

    public kei(Map<String, ? extends Object> map) {
        ckf.g(map, "data");
        JSONObject jSONObject = null;
        String w = MegaUtils.w(map, "src", null);
        if (w != null) {
            this.f22616a = w;
            String w2 = MegaUtils.w(map, "title", null);
            if (w2 != null) {
                this.b = w2;
                String w3 = MegaUtils.w(map, "subtitle", "");
                ckf.d(w3);
                this.c = w3;
                String w4 = MegaUtils.w(map, "coverImageURL", null);
                if (w4 != null) {
                    this.d = w4;
                    Map<String, Object> r = MegaUtils.r(map, "extraInfo");
                    this.e = r instanceof JSONObject ? r : jSONObject;
                    return;
                }
                throw new RuntimeException("coverImageURL invalid");
            }
            throw new RuntimeException("title invalid");
        }
        throw new RuntimeException("src invalid");
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("705c882a", new Object[]{this});
        }
        return new JSONObject(a.k(jpu.a("src", this.f22616a), jpu.a("title", this.b), jpu.a("subtitle", this.c), jpu.a("coverImageURL", this.d), jpu.a("extraInfo", this.e)));
    }
}
