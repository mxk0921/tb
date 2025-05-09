package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class i1g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final i1g INSTANCE = new i1g();

    static {
        t2o.a(1022361726);
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769f891e", new Object[]{this, str});
            return;
        }
        ckf.g(str, "bizID");
        dr.d(dr.INSTANCE, "kvStorage", pg1.ATOM_EXT_clear, a.k(jpu.a("bizID", str)), null, null, 24, null);
    }

    public final List<String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("68f827f7", new Object[]{this, str});
        }
        ckf.g(str, "bizID");
        Map<?, ?> a2 = zm8.a(dr.g(dr.INSTANCE, "kvStorage", "getAllKeys", a.k(jpu.a("bizID", str)), null, 8, null));
        if (a2 == null) {
            return null;
        }
        Object obj = a2.get("result");
        List list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public final String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea23a87c", new Object[]{this, str, str2});
        }
        ckf.g(str, "bizID");
        ckf.g(str2, "key");
        Map<?, ?> a2 = zm8.a(dr.g(dr.INSTANCE, "kvStorage", "getItem", a.k(jpu.a("bizID", str), jpu.a("key", str2)), null, 8, null));
        if (a2 != null) {
            return ht4.e(a2, "result");
        }
        return null;
    }

    public final void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5304d2", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "bizID");
        ckf.g(str2, "key");
        dr.d(dr.INSTANCE, "kvStorage", "removeItem", a.k(jpu.a("bizID", str), jpu.a("key", str2)), null, null, 24, null);
    }

    public final void e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40b917a", new Object[]{this, str, str2, str3});
            return;
        }
        ckf.g(str, "bizID");
        ckf.g(str2, "key");
        ckf.g(str3, "value");
        dr.d(dr.INSTANCE, "kvStorage", "setItem", a.k(jpu.a("bizID", str), jpu.a("key", str2), jpu.a("value", str3)), null, null, 24, null);
    }
}
