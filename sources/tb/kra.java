package tb;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kra {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Object b = new Object();
    public static kra c;

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<String, Integer> f22866a = new LruCache<>(1024);

    static {
        t2o.a(1039138840);
        t2o.a(1039138838);
    }

    public static kra c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kra) ipChange.ipc$dispatch("a0e6d74c", new Object[0]);
        }
        if (c == null) {
            synchronized (b) {
                try {
                    if (c == null) {
                        c = new kra();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99dad9d3", new Object[]{this});
        }
        return null;
    }

    public int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4981467", new Object[]{this, str})).intValue();
        }
        if (this.f22866a == null || TextUtils.isEmpty(str) || this.f22866a.get(str) == null) {
            return 0;
        }
        return this.f22866a.get(str).intValue();
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f5575bb", new Object[]{this});
        }
        return null;
    }

    public Resources e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("f4acc9f0", new Object[]{this});
        }
        return null;
    }

    public Resources f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("c328cfe6", new Object[]{this});
        }
        return null;
    }

    public void g(String str, int i) {
        LruCache<String, Integer> lruCache;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51eb7e08", new Object[]{this, str, new Integer(i)});
        } else if (!TextUtils.isEmpty(str) && (lruCache = this.f22866a) != null) {
            lruCache.put(str, Integer.valueOf(i));
        }
    }
}
