package tb;

import android.app.Activity;
import android.util.LruCache;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfigLocal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wcm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static mad b;
    public static jad c;

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<String, jad> f30614a = new LruCache<>(5);
    public static final jad d = new lf2();

    public static synchronized jad a(String str) {
        synchronized (wcm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jad) ipChange.ipc$dispatch("a130394", new Object[]{str});
            } else if (c(str)) {
                return d;
            } else {
                LruCache<String, jad> lruCache = f30614a;
                jad jadVar = lruCache.get(str);
                if (jadVar == null) {
                    jadVar = new ibm(str, b());
                    lruCache.put(str, jadVar);
                } else {
                    jad jadVar2 = c;
                    if (!(jadVar2 == null || jadVar2 == jadVar)) {
                        jadVar2.pause();
                    }
                }
                c = jadVar;
                return jadVar;
            }
        }
    }

    public static mad b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mad) ipChange.ipc$dispatch("d832f415", new Object[0]);
        }
        if (b == null) {
            try {
                IpChange ipChange2 = OrangeConfigLocal.$ipChange;
                b = new hal();
            } catch (ClassNotFoundException | Exception unused) {
            }
        }
        return b;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ecbc603", new Object[]{str})).booleanValue();
        }
        mad b2 = b();
        if (b2 instanceof hal) {
            return ((hal) b2).c(str);
        }
        return false;
    }

    public static void d(Activity activity) {
        jad jadVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("627ccb0f", new Object[]{activity});
        } else if (activity != null && (jadVar = f30614a.get(activity.getClass().getName())) != null) {
            jadVar.pause();
        }
    }

    public static void e(Fragment fragment) {
        jad jadVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daebb875", new Object[]{fragment});
        } else if (fragment != null && (jadVar = f30614a.get(fragment.getClass().getName())) != null) {
            jadVar.pause();
        }
    }

    public static void f(Activity activity) {
        jad jadVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89368686", new Object[]{activity});
        } else if (activity != null && (jadVar = f30614a.get(activity.getClass().getName())) != null) {
            jadVar.resume();
        }
    }

    public static void g(Fragment fragment) {
        jad jadVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f346cb2c", new Object[]{fragment});
        } else if (fragment != null && (jadVar = f30614a.get(fragment.getClass().getName())) != null) {
            jadVar.resume();
        }
    }
}
