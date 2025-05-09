package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class iyi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<ivc> f21649a = new ArrayList();

    static {
        t2o.a(503317300);
        b();
    }

    public static void a(ivc ivcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a85ba24", new Object[]{ivcVar});
        } else {
            f21649a.add(ivcVar);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b842b6d9", new Object[0]);
        } else {
            a(new qay());
        }
    }

    public static boolean c(String str, String str2, d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f1f1104", new Object[]{str, str2, jVar})).booleanValue();
        }
        Iterator it = ((ArrayList) f21649a).iterator();
        while (it.hasNext()) {
            if (((ivc) it.next()).a(str, str2, jVar)) {
                return true;
            }
        }
        return false;
    }
}
