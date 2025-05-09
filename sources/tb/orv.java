package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class orv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f25604a;
    public final int b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public orv() {
        n9l n9lVar = n9l.INSTANCE;
        this.f25604a = n9lVar.D();
        this.b = n9lVar.E();
    }

    public final int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb30f8f", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 == 1) {
            return 600;
        }
        if (i2 == 2) {
            return 460;
        }
        if (i2 == 3 && i == 1) {
            return 600;
        }
        return 320;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ba53f91", new Object[]{this, str});
        } else {
            s0m.B().T(str).fetch();
        }
    }

    public final void c(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4bebcb1", new Object[]{this, str, new Integer(i), new Integer(i2)});
            return;
        }
        ImageStrategyConfig a2 = ImageStrategyConfig.u("default").j(i2).h(i).f(true).g(true).a();
        ckf.f(a2, "ImageStrategyConfig.newB…forceWebPOn(true).build()");
        String decideUrl = ImageStrategyDecider.decideUrl(str, Integer.valueOf(i2), Integer.valueOf(i), a2);
        ckf.f(decideUrl, "ImageStrategyDecider.dec…l, width, height, config)");
        s0m.B().T(decideUrl).fetch();
    }

    public final void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb71c1d7", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "data");
        JSONArray jSONArray = jSONObject.getJSONArray("rateList");
        if (!(jSONArray == null || jSONArray.isEmpty())) {
            int f = hfn.f(this.f25604a, jSONArray.size());
            for (int i = 0; i < f; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String h = srf.h("headPicUrl", jSONObject2, "");
                if (!TextUtils.isEmpty(h)) {
                    ckf.f(h, "headPicUrl");
                    b(h);
                }
                JSONArray jSONArray2 = jSONObject2.getJSONArray("feedPicList");
                if (jSONArray2 != null && !jSONArray.isEmpty()) {
                    int size = jSONArray2.size();
                    int min = Math.min(this.b, size);
                    for (int i2 = 0; i2 < min; i2++) {
                        Object obj = jSONArray2.get(i2);
                        if (obj != null) {
                            String h2 = srf.h("thumbnail", (JSONObject) obj, "");
                            if (!TextUtils.isEmpty(h2)) {
                                int a2 = a(i2, size);
                                ckf.f(h2, "thumbnail");
                                c(h2, a2, a2);
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                        }
                    }
                    continue;
                }
            }
        }
    }
}
