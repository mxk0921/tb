package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class h2w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<d2w> f20382a;

    static {
        t2o.a(81789100);
        ArrayList arrayList = new ArrayList(4);
        f20382a = arrayList;
        arrayList.add(new q3i());
        arrayList.add(new zug());
        arrayList.add(new ec1());
        arrayList.add(new v87());
    }

    public static Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f669ebca", new Object[]{obj, str});
        }
        if (!(obj == null || str == null)) {
            Class<?> cls = obj.getClass();
            Iterator it = ((ArrayList) f20382a).iterator();
            while (it.hasNext()) {
                d2w d2wVar = (d2w) it.next();
                if (d2wVar.a(obj, cls, str)) {
                    return d2wVar.b(obj, cls, str);
                }
            }
        }
        return null;
    }
}
