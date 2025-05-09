package tb;

import android.text.TextUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dqa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<String, Object> f18010a = new LruCache<>(2);

    static {
        t2o.a(511705479);
    }

    public static void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f618daf", new Object[]{str, obj});
        } else if (!TextUtils.isEmpty(str) && obj != null) {
            f18010a.put(str, obj);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c823e69b", new Object[0]);
        } else {
            f18010a.evictAll();
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a42606", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            f18010a.remove(str);
        }
    }

    public static <T> T d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d3b02d75", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (T) f18010a.get(str);
    }
}
