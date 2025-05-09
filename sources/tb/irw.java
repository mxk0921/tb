package tb;

import android.taobao.windvane.jsbridge.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class irw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<crw> f21540a = new CopyOnWriteArrayList();
    public static final List<a> b = new CopyOnWriteArrayList();
    public static final List<drw> c = new CopyOnWriteArrayList();

    static {
        t2o.a(989856232);
    }

    public static List<crw> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7b64bb04", new Object[0]);
        }
        return f21540a;
    }

    public static List<a> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c4c8aef1", new Object[0]);
        }
        return b;
    }

    public static List<drw> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6dfba81", new Object[0]);
        }
        return c;
    }

    public static void d(drw drwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("355101a6", new Object[]{drwVar});
        } else {
            ((CopyOnWriteArrayList) c).add(drwVar);
        }
    }
}
