package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.atools.Constants;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Boolean> f16748a = new ConcurrentHashMap();
    public static final Set<String> b = new CopyOnWriteArraySet();
    public static final AtomicBoolean c = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();
    public static final boolean e;

    static {
        t2o.a(398458881);
        try {
            e = true;
        } catch (Exception unused) {
            e = false;
        }
    }

    public static /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6152d9", new Object[0]);
            return;
        }
        c.set(true);
        HashMap hashMap = new HashMap();
        Iterator it = ((CopyOnWriteArraySet) b).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            hashMap.put(str, String.valueOf(ABGlobal.isFeatureOpened(o41.a(), str)));
        }
        kaq.d(o41.a(), "atools_cfg_bk", hashMap);
        ((CopyOnWriteArraySet) b).clear();
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("711086d6", new Object[]{str})).booleanValue();
        }
        Map<String, Boolean> map = f16748a;
        if (!((ConcurrentHashMap) map).containsKey(str)) {
            ((ConcurrentHashMap) map).put(str, Boolean.valueOf(new File(Constants.LOCAL_SWITCH_PREFIX + str).exists()));
        }
        return Boolean.TRUE.equals(((ConcurrentHashMap) map).get(str));
    }

    public static void g(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82346c66", new Object[]{context});
        } else {
            of.c().execute(new Runnable() { // from class: tb.b0
                @Override // java.lang.Runnable
                public final void run() {
                    c0.c(context);
                }
            });
        }
    }

    public static void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bcde4f8", new Object[]{context});
        } else if (e && !d.getAndSet(true)) {
            boolean h = cp.h(context);
            boolean e2 = cp.e(context);
            if (h || e2) {
                g(context);
            }
            if (!h) {
                c.set(true);
            } else {
                of.c().schedule(new Runnable() { // from class: tb.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c0.d();
                    }
                }, 10000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public static /* synthetic */ void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8477db5c", new Object[]{context});
        } else if (g91.a(context, false)) {
            l2u.instance.e("ABSwitcher", "appFirstLaunch, sync return", new Object[0]);
        } else if (cp.k(context)) {
            l2u.instance.e("ABSwitcher", "sync", new Object[0]);
            kaq.d(context, "atools_cfg", kaq.a(context, "atools_cfg_bk"));
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0049 -> B:27:0x0049). Please submit an issue!!! */
    public static boolean e(String str) {
        boolean z;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c6904a1", new Object[]{str})).booleanValue();
        }
        if (!e) {
            return false;
        }
        Context a2 = o41.a();
        try {
            if (!c.get()) {
                ((CopyOnWriteArraySet) b).add(str);
                h(a2);
            } else if (cp.h(a2)) {
                kaq.c(a2, "atools_cfg_bk", str, ABGlobal.isFeatureOpened(a2, str));
            }
        } catch (Exception unused) {
        }
        try {
            z = kaq.b(a2, "atools_cfg", str, false);
            if (!z) {
                try {
                    z = f(str);
                } catch (Throwable th2) {
                    th = th2;
                    l2u.instance.d("ABSwitcher", "isFeatureOpened err", th, ru1.FEATURE_NAME, str);
                    return z;
                }
            }
            l2u.instance.c("ABSwitcher", "isFeatureOpened", ru1.FEATURE_NAME, str, "opened", Boolean.valueOf(z));
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        return z;
    }
}
