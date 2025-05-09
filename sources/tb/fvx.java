package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class fvx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, a> f19559a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f19560a;
        public long b;
        public long c;
    }

    public static String a(String str) {
        a aVar;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        Map<String, a> map = f19559a;
        if (map == null || (aVar = (a) ((ConcurrentHashMap) map).get(str)) == null) {
            return null;
        }
        if (System.currentTimeMillis() - aVar.b < aVar.c && (str2 = aVar.f19560a) != null) {
            return str2;
        }
        ((ConcurrentHashMap) map).remove(str);
        return null;
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        Map<String, a> map = f19559a;
        a aVar = (a) ((ConcurrentHashMap) map).get(str);
        if (aVar == null) {
            aVar = new a();
        }
        aVar.f19560a = str2;
        aVar.c = 86400000L;
        aVar.b = System.currentTimeMillis();
        ((ConcurrentHashMap) map).put(str, aVar);
    }
}
