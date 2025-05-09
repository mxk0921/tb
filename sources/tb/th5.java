package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class th5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f28716a;
    public final JSONObject b;
    public final int c;
    public final long d;
    public final String e;
    public Map<String, String> f;
    public boolean g;
    public boolean h;

    static {
        t2o.a(806356104);
    }

    public th5(String str, int i, JSONObject jSONObject, int i2, long j) {
        this.f28716a = i;
        this.b = jSONObject;
        this.c = i2;
        this.d = j;
        this.e = str;
    }

    /* renamed from: a */
    public th5 clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (th5) ipChange.ipc$dispatch("cec12a98", new Object[]{this});
        }
        return new th5(this.e, this.f28716a, (JSONObject) this.b.clone(), this.c, this.d);
    }

    public void b(LiveItem liveItem, Map<String, String> map) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c7733", new Object[]{this, liveItem, map});
        } else if (liveItem != null) {
            this.f = map;
            JSONObject jSONObject = liveItem.personalityData;
            String str = "1";
            if (jSONObject != null) {
                z = TextUtils.equals(jSONObject.getString("subscribeStatus"), str);
            }
            Map<String, String> map2 = this.f;
            if (!z) {
                str = "0";
            }
            map2.put("subscribe", "1_".concat(str));
            this.h = qfa.f(liveItem);
        }
    }
}
