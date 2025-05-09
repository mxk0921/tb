package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class hm7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596232);
    }

    public static void a(View view, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("928eb8f7", new Object[]{view, bn7Var});
            return;
        }
        en7 c = vn7.c(view);
        Map<String, String> map = c.c;
        Map<String, String> map2 = c.d;
        sn7 d = tl7.d(c.f18692a);
        if (!map.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList<String> arrayList = new ArrayList<>(10);
            for (String str : map.keySet()) {
                Object a2 = qm7.a(map.get(str), c.f18692a, bn7Var);
                hashMap.put(str, a2);
                if (a2 == null && tl7.f()) {
                    ym7.e(tl7.TAG, String.format("表达式 %s=%s 解析出来的结果为null", str, map.get(str)));
                }
            }
            arrayList.addAll(hashMap.keySet());
            hashMap.putAll(c.b);
            d.bindDataImpl(view, hashMap, arrayList, bn7Var);
        }
        if (!map2.isEmpty()) {
            view.setTag(jn7.SUBDATA, bn7Var.a());
            d.setEvents(view, bn7Var);
        }
    }
}
