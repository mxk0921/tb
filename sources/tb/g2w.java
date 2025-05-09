package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g2w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<c2w> f19706a;

    static {
        t2o.a(83886254);
        ArrayList arrayList = new ArrayList(4);
        f19706a = arrayList;
        arrayList.add(new p3i());
        arrayList.add(new yug());
        arrayList.add(new dc1());
        arrayList.add(new u87());
    }

    public static Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f669ebca", new Object[]{obj, str});
        }
        if (!(obj == null || str == null)) {
            Class<?> cls = obj.getClass();
            Iterator it = ((ArrayList) f19706a).iterator();
            while (it.hasNext()) {
                c2w c2wVar = (c2w) it.next();
                if (c2wVar.a(obj, cls, str)) {
                    return c2wVar.b(obj, cls, str);
                }
            }
        }
        return null;
    }
}
