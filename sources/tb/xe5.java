package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xe5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, rub> f31329a = new HashMap();

    static {
        t2o.a(156237919);
        b(new sub());
        b(new tub());
        b(new vub());
        b(new uub());
    }

    public static rub a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rub) ipChange.ipc$dispatch("56cea7d6", new Object[]{str});
        }
        return (rub) ((HashMap) f31329a).get(str);
    }

    public static void b(rub rubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0703b3c", new Object[]{rubVar});
        } else if (rubVar != null) {
            ((HashMap) f31329a).put(rubVar.c(), rubVar);
        }
    }
}
