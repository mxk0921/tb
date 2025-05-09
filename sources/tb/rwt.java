package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class rwt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final njg f27654a = a.a(LazyThreadSafetyMode.PUBLICATION, new d1a() { // from class: tb.qwt
        @Override // tb.d1a
        public final Object invoke() {
            boolean b;
            b = rwt.b();
            return Boolean.valueOf(b);
        }
    });

    static {
        t2o.a(1003487363);
    }

    public static final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10a09744", new Object[0])).booleanValue();
        }
        if (!zys.INSTANCE.c() || !mhr.e0().getBoolean("enableKMPTint", true)) {
            return false;
        }
        return true;
    }

    public static final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37463d3b", new Object[0])).booleanValue();
        }
        return ((Boolean) f27654a.getValue()).booleanValue();
    }

    public static final void d(String str, String str2, Map<String, ? extends Object> map) {
        Map map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42723afa", new Object[]{str, str2, map});
            return;
        }
        ckf.g(str, "type");
        ckf.g(str2, "page");
        ckf.g(map, "args");
        Map<Object, ?> d = twt.d();
        if (d == null) {
            d = null;
        }
        if (d != null) {
            map2 = kotlin.collections.a.t(new KMPJsonObject(d).toMap());
        } else {
            map2 = new LinkedHashMap();
        }
        map2.putAll(map);
        map2.put("tintPage", str2);
        map2.put("tintType", str);
        aic h0 = mhr.h0();
        LinkedHashMap linkedHashMap = new LinkedHashMap(v3i.e(map2.size()));
        for (Map.Entry entry : map2.entrySet()) {
            linkedHashMap.put(entry.getKey(), tvr.g(entry.getValue()));
        }
        h0.K(yj4.STAIN_TRACK_PAGE, yj4.STAIN_TRACK_ARG1, null, null, linkedHashMap, 2101);
    }
}
