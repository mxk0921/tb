package tb;

import android.text.TextUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qhm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_CID = "default";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, LruCache<String, String>> f26760a = new HashMap(4);

    public static LruCache<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("61506a4e", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            vfm.f("PopStaticCache ", "cid is empty, set to default");
            str = "default";
        }
        Map<String, LruCache<String, String>> map = f26760a;
        LruCache<String, String> lruCache = (LruCache) ((HashMap) map).get(str);
        if (lruCache != null) {
            return lruCache;
        }
        LruCache<String, String> lruCache2 = new LruCache<>(64);
        ((HashMap) map).put(str, lruCache2);
        return lruCache2;
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df5dccf1", new Object[]{str, str2});
        }
        String str3 = a(str).get(str2);
        vfm.f("PopStaticCache ", "get static cache, key=" + str2 + ", value=" + str3);
        return str3;
    }

    public static void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36cc7f5c", new Object[]{str, str2, str3});
            return;
        }
        LruCache<String, String> a2 = a(str);
        if (str3 == null) {
            a2.remove(str2);
            vfm.f("PopStaticCache ", "remove key=" + str2);
            return;
        }
        a2.put(str2, str3);
        vfm.f("PopStaticCache ", "save key=" + str2 + ", value=" + str3);
    }
}
