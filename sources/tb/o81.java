package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class o81 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, List<l81>> f25206a = new HashMap();
    public static n81 b;

    public static synchronized void a(String str, Object obj) {
        synchronized (o81.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bcdfd765", new Object[]{str, obj});
                return;
            }
            List<l81> list = (List) ((HashMap) f25206a).get(str);
            if (list != null) {
                for (l81 l81Var : list) {
                    l81Var.a(obj);
                }
            }
        }
    }

    public static n81 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n81) ipChange.ipc$dispatch("d9de5dd1", new Object[0]);
        }
        if (b == null) {
            b = new n81(Globals.getApplication());
        }
        return b;
    }

    public static void c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4262e84", new Object[]{str, obj});
        } else if (mba.b().c()) {
            if ("mute".equals(str) || r0k.KEY_LIVE_MUTE.equals(str)) {
                a(str, b().d(mba.BIZ_NAME, str, Boolean.FALSE, null));
            } else if ("timeFrameMute".equals(str) || "timeFrameMuteSub".equals(str)) {
                n81 b2 = b();
                Boolean bool = Boolean.FALSE;
                a("mute", b2.d(mba.BIZ_NAME, "mute", bool, null));
                a(r0k.KEY_LIVE_MUTE, b().d(mba.BIZ_NAME, r0k.KEY_LIVE_MUTE, bool, null));
                a("inTimeFrameMute", b().d(mba.BIZ_NAME, "inTimeFrameMute", bool, null));
            } else {
                a(str, obj);
            }
        }
    }

    public static synchronized void d(String str, l81 l81Var) {
        List list;
        synchronized (o81.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb663f91", new Object[]{str, l81Var});
                return;
            }
            Map<String, List<l81>> map = f25206a;
            if (((HashMap) map).get(str) != null) {
                list = (List) ((HashMap) map).get(str);
            } else {
                ArrayList arrayList = new ArrayList(2);
                ((HashMap) map).put(str, arrayList);
                list = arrayList;
            }
            list.add(l81Var);
        }
    }

    public static synchronized void e(String str, l81 l81Var) {
        synchronized (o81.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90416478", new Object[]{str, l81Var});
                return;
            }
            List list = (List) ((HashMap) f25206a).get(str);
            if (list != null) {
                list.remove(l81Var);
            }
        }
    }
}
