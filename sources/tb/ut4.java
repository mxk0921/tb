package tb;

import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ut4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f29598a;
        public final /* synthetic */ boolean b;

        public a(String str, boolean z) {
            this.f29598a = str;
            this.b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, this.f29598a);
            thread.setDaemon(this.b);
            return thread;
        }
    }

    public static ThreadFactory a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadFactory) ipChange.ipc$dispatch("539b3444", new Object[]{str, new Boolean(z)});
        }
        return new a(str, z);
    }

    public static boolean b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e519041e", new Object[]{intent})).booleanValue();
        }
        if (vg8.a() == null || intent == null || vg8.a().getPackageManager().queryIntentActivities(intent, 65536).size() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean c(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42902482", new Object[]{obj, str})).booleanValue();
        }
        if (obj == null) {
            g01.a("CoreCommonUtils", str);
        }
        if (obj == null) {
            return true;
        }
        return false;
    }

    public static <S, T> Map<S, T> d(Map<S, T> map, Map<S, T> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b30cce6f", new Object[]{map, map2});
        }
        try {
            HashMap hashMap = new HashMap(map);
            for (S s : map2.keySet()) {
                if (map.containsKey(s)) {
                    hashMap.put(s, map2.get(s));
                } else {
                    hashMap.put(s, map2.get(s));
                }
            }
            return hashMap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T> Map<String, T> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b29954e", new Object[]{str});
        }
        try {
            return JSON.parseObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<String> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f6202740", new Object[]{str});
        }
        try {
            return JSON.parseArray(str, String.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aae96d6f", new Object[]{obj});
        }
        try {
            return JSON.toJSONString(obj);
        } catch (Throwable unused) {
            return null;
        }
    }
}
