package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kq8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, fq8> f22850a = new HashMap<>();

    static {
        t2o.a(503317239);
    }

    public static Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("48fe742c", new Object[]{str, obj});
        }
        HashMap<String, fq8> hashMap = f22850a;
        fq8 fq8Var = hashMap.get(str);
        if (fq8Var == null) {
            fq8Var = new fq8(str);
            hashMap.put(str, fq8Var);
        }
        return fq8Var.b(obj);
    }

    public static Object b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ac786cb7", new Object[]{str, map});
        }
        return new fq8(str, map).a();
    }
}
