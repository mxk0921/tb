package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hws implements sir {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Class<? extends dc>> f20933a;

    static {
        t2o.a(806355642);
        t2o.a(806355637);
    }

    public hws() {
        HashMap hashMap = new HashMap();
        this.f20933a = hashMap;
        hashMap.put("openNewBuy", z3l.class);
    }

    @Override // tb.sir
    public void a(String str, Map<String, Object> map, Context context, tir tirVar) {
        try {
            Class cls = (Class) ((HashMap) this.f20933a).get(str);
            if (cls != null) {
                ((dc) cls.newInstance()).a(map, context);
            }
        } catch (Throwable th) {
            v7t.d("TaoLiveGoodsAbility", th.toString());
        }
    }
}
