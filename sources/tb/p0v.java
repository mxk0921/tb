package tb;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class p0v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<Object, a> f25802a = new LruCache<>(5);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f25803a;
        public final String b;

        static {
            t2o.a(502268148);
        }

        public a(String str, String str2) {
            this.f25803a = str;
            this.b = str2;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ef986747", new Object[]{this});
            }
            return this.f25803a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("76cbf148", new Object[]{this});
            }
            return this.b;
        }
    }

    static {
        t2o.a(502268147);
    }

    public static a a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7337b32f", new Object[]{obj});
        }
        if (obj == null || !akt.z()) {
            return null;
        }
        return f25802a.get(obj);
    }

    public static void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("283ed43d", new Object[]{obj});
        } else if (obj != null && akt.z()) {
            f25802a.remove(obj);
        }
    }

    public static a c(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("55e777f8", new Object[]{obj, new Boolean(z)});
        }
        a aVar = null;
        if (obj != null && akt.z()) {
            LruCache<Object, a> lruCache = f25802a;
            if (lruCache.get(obj) == null) {
                Map<String, String> pageAllProperties = obj instanceof Activity ? UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties((Activity) obj) : null;
                if (sz3.b(pageAllProperties)) {
                    pageAllProperties = UTAnalytics.getInstance().getDefaultTracker().getPageProperties(obj);
                }
                if (!sz3.b(pageAllProperties)) {
                    String encode = Uri.encode(pageAllProperties.get(z9u.KEY_UTPARAM_URL));
                    String encode2 = Uri.encode(pageAllProperties.get("utparam-pre"));
                    if (!TextUtils.isEmpty(encode) || !TextUtils.isEmpty(encode2)) {
                        aVar = new a(encode, encode2);
                        lruCache.put(obj, aVar);
                        if (z) {
                            HashMap hashMap = new HashMap();
                            if (!TextUtils.isEmpty(encode)) {
                                hashMap.put(yj4.PARAM_ENTRY_UT_PARAM, encode);
                            }
                            if (!TextUtils.isEmpty(encode2)) {
                                hashMap.put("entryUtparamPre", encode2);
                            }
                            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(obj, hashMap);
                        }
                    }
                }
            }
        }
        return aVar;
    }
}
