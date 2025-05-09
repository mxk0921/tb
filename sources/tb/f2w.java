package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f2w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<b2w> f18968a;

    static {
        t2o.a(475005010);
        ArrayList arrayList = new ArrayList(4);
        f18968a = arrayList;
        arrayList.add(new o3i());
        arrayList.add(new xug());
        arrayList.add(new cc1());
        arrayList.add(new t87());
    }

    public static Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f669ebca", new Object[]{obj, str});
        }
        if (!(obj == null || str == null)) {
            if (str.equals("this")) {
                return obj;
            }
            Class<?> cls = obj.getClass();
            Iterator it = ((ArrayList) f18968a).iterator();
            while (it.hasNext()) {
                b2w b2wVar = (b2w) it.next();
                if (b2wVar.a(obj, cls, str)) {
                    return b2wVar.b(obj, cls, str);
                }
            }
        }
        return null;
    }
}
