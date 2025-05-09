package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observer;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class wnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wnl INSTANCE = new wnl();

    /* renamed from: a  reason: collision with root package name */
    public static final WeakHashMap<Activity, dlk> f30798a = new WeakHashMap<>();

    static {
        t2o.a(815793490);
    }

    public final dlk a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dlk) ipChange.ipc$dispatch("6f7a7d50", new Object[]{this, activity});
        }
        WeakHashMap<Activity, dlk> weakHashMap = f30798a;
        dlk dlkVar = weakHashMap.get(activity);
        if (dlkVar != null) {
            return dlkVar;
        }
        dlk dlkVar2 = new dlk("page");
        weakHashMap.put(activity, dlkVar2);
        return dlkVar2;
    }

    public final boolean b(Activity activity, String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("827336f", new Object[]{this, activity, str, str2, obj})).booleanValue();
        }
        ckf.g(activity, "activity");
        ckf.g(str, "namespace");
        ckf.g(str2, "key");
        ckf.g(obj, "value");
        return a(activity).a(str, str2, obj);
    }

    public final void c(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0744bba", new Object[]{this, activity, str, str2});
            return;
        }
        ckf.g(activity, "activity");
        ckf.g(str, "namespace");
        ckf.g(str2, "key");
        a(activity).b(str, str2);
    }

    public final void d(Activity activity, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442c055d", new Object[]{this, activity, str, new Integer(i)});
            return;
        }
        ckf.g(activity, "activity");
        ckf.g(str, "namespace");
        a(activity).c(str, i);
    }

    public final void e(Activity activity, String str, Observer observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c754cbbb", new Object[]{this, activity, str, observer});
            return;
        }
        ckf.g(activity, "activity");
        ckf.g(str, "namespace");
        ckf.g(observer, "observer");
        a(activity).d(str, observer);
    }

    public final void f(Activity activity, String str, Observer observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("632aea42", new Object[]{this, activity, str, observer});
            return;
        }
        ckf.g(activity, "activity");
        ckf.g(str, "namespace");
        ckf.g(observer, "observer");
        a(activity).e(str, observer);
    }
}
