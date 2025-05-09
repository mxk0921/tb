package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e2w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<a2w> f18239a;

    static {
        t2o.a(444596299);
        ArrayList arrayList = new ArrayList(4);
        f18239a = arrayList;
        arrayList.add(new n3i());
        arrayList.add(new wug());
        arrayList.add(new bc1());
        arrayList.add(new s87());
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
            Iterator it = ((ArrayList) f18239a).iterator();
            while (it.hasNext()) {
                a2w a2wVar = (a2w) it.next();
                if (a2wVar.a(obj, cls, str)) {
                    return a2wVar.b(obj, cls, str);
                }
            }
        }
        return null;
    }
}
