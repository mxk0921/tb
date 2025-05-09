package tb;

import android.text.TextUtils;
import androidx.collection.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xmh<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f31471a;
    public final Map<String, LruCache<String, T>> b = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        int a(String str, String str2);
    }

    public final String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11f1d3f4", new Object[]{this, str, str2});
        }
        return str + str2;
    }

    public final LruCache<String, T> b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("9e8f0db0", new Object[]{this, str, str2});
        }
        return new LruCache<>(c(str, str2));
    }

    public final int c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f45df4fb", new Object[]{this, str, str2})).intValue();
        }
        a aVar = this.f31471a;
        if (aVar != null) {
            return aVar.a(str, str2);
        }
        if ("preload".equals(str)) {
            "high".equals(str2);
            return 30;
        }
        if ("refresh".equals(str)) {
            "low".equals(str2);
        }
        return 10;
    }

    public LruCache<String, T> d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("740ba1db", new Object[]{this, str, str2});
        }
        String a2 = a(str, str2);
        LruCache<String, T> lruCache = (LruCache) ((ConcurrentHashMap) this.b).get(a2);
        if (lruCache != null) {
            return lruCache;
        }
        LruCache<String, T> b = b(str, str2);
        ((ConcurrentHashMap) this.b).put(a2, b);
        return b;
    }

    public LruCache<String, T> e(btm btmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("22c442b5", new Object[]{this, btmVar});
        }
        String str = btmVar.b;
        String str2 = btmVar.c;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str = "preload";
            str2 = "low";
        }
        return d(str, str2);
    }

    public void f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6f41a39", new Object[]{this, aVar});
        } else {
            this.f31471a = aVar;
        }
    }
}
