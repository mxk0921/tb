package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.hfc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static hfc f22240a;
    public static final List<hfc.a> b = new CopyOnWriteArrayList();

    static {
        t2o.a(486539290);
    }

    public static void a(hfc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15605eeb", new Object[]{aVar});
        } else {
            ((CopyOnWriteArrayList) b).add(aVar);
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef4398eb", new Object[]{str});
        }
        Iterator it = ((CopyOnWriteArrayList) b).iterator();
        while (it.hasNext()) {
            str = ((hfc.a) it.next()).onIntercept(str);
        }
        return str;
    }

    public static void c(hfc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4956be8", new Object[]{aVar});
        } else {
            ((CopyOnWriteArrayList) b).remove(aVar);
        }
    }

    public static void d(hfc hfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ab589f", new Object[]{hfcVar});
        } else {
            f22240a = hfcVar;
        }
    }

    public static boolean f(Context context, hfc.b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ed9aac4", new Object[]{context, bVar, str})).booleanValue();
        }
        return h(context, bVar, b(str), null, false);
    }

    public static boolean e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("481ddb9e", new Object[]{context, str})).booleanValue();
        }
        if (f22240a == null) {
            fve.f("InfoFlowNav", "toUri gInfoFlowNav == null");
            return false;
        }
        try {
            return f22240a.b(context, b(str));
        } catch (Throwable th) {
            fve.c("InfoFlowNav", "toUri error", th);
            return false;
        }
    }

    public static boolean g(Context context, hfc.b bVar, String str, View view, peu peuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d380cacd", new Object[]{context, bVar, str, view, peuVar})).booleanValue();
        }
        if (f22240a == null) {
            fve.f("InfoFlowNav", "toUri2 gInfoFlowNav == null");
            return false;
        }
        try {
            return f22240a.a(context, bVar, b(str), view, peuVar);
        } catch (Throwable th) {
            fve.c("InfoFlowNav", "toUri2 error", th);
            return false;
        }
    }

    public static boolean h(Context context, hfc.b bVar, String str, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc31df06", new Object[]{context, bVar, str, view, new Boolean(z)})).booleanValue();
        }
        if (f22240a == null) {
            fve.f("InfoFlowNav", "toUri2 gInfoFlowNav == null");
            return false;
        }
        try {
            return f22240a.c(context, bVar, b(str), view, z);
        } catch (Throwable th) {
            fve.c("InfoFlowNav", "toUri2 error", th);
            return false;
        }
    }
}
