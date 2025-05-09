package tb;

import android.taobao.windvane.cache.WVFileCache;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class nqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static nqw f24894a;

    static {
        t2o.a(989855765);
    }

    public static synchronized nqw b() {
        synchronized (nqw.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nqw) ipChange.ipc$dispatch("28a8df7f", new Object[0]);
            }
            if (f24894a == null) {
                f24894a = new nqw();
            }
            return f24894a;
        }
    }

    public WVFileCache a(String str, String str2, int i, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVFileCache) ipChange.ipc$dispatch("8dd113d1", new Object[]{this, str, str2, new Integer(i), new Boolean(z)});
        }
        if (v7t.h()) {
            v7t.a("FileCacheFactory", "createFileCache: " + str + "/" + str2 + " capacity: " + i + " sdcard: " + z);
        }
        if (str2 == null || i < 10) {
            if (v7t.h()) {
                v7t.a("FileCacheFactory", "createFileCache: url is null, or capacity is too small");
            }
            return null;
        }
        if (!z || !coq.a()) {
            z2 = false;
        }
        String d = vc9.d(yaa.n, str, str2, z2);
        String g = vc9.g(yaa.n, str, str2);
        if (v7t.h()) {
            v7t.a("FileCacheFactory", "base dir: " + d);
        }
        WVFileCache wVFileCache = new WVFileCache(d, g, i, z2);
        if (wVFileCache.i()) {
            return wVFileCache;
        }
        v7t.n("FileCacheFactory", "init FileCache failed");
        return null;
    }
}
