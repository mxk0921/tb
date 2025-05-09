package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class uir {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Class<? extends sir>> f29405a;

    public static void a(String str, String str2, Map<String, Object> map, Context context, tir tirVar) {
        try {
            Class<? extends sir> cls = f29405a.get(str);
            if (cls == null) {
                v7t.d("TBLiveAbilityHub", str + " 没有注册");
                return;
            }
            ((sir) cls.newInstance()).a(str2, map, context, tirVar);
        } catch (Throwable th) {
            v7t.d("TBLiveAbilityHub", th.toString());
        }
    }

    static {
        t2o.a(806355639);
        HashMap<String, Class<? extends sir>> hashMap = new HashMap<>();
        f29405a = hashMap;
        hashMap.put("taolivegoods", hws.class);
    }
}
